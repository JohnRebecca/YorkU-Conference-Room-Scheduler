package scheduler.sensor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scheduler.sensor.hardware.MagStripeBadgeReader;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Adapter that decodes the vendor reader's raw track data
 * ("%YU^&lt;id&gt;^&lt;epoch&gt;?") into the ID number the scheduler expects,
 * and reports every scan to the system (Req5).
 */
@DisplayName("MagStripeBadgeAdapter (Adapter Pattern)")
class MagStripeBadgeAdapterTest {

    private static final String ROOM = "DB-1001";
    private static final String ID_NUMBER = "216000001";

    private MagStripeBadgeReader reader;
    private SensorDataLog dataLog;
    private MagStripeBadgeAdapter adapter;

    @BeforeEach
    void setUp() {
        reader = new MagStripeBadgeReader();
        dataLog = new SensorDataLog();
        adapter = new MagStripeBadgeAdapter(reader, dataLog);
    }

    /** Swipes a well-formed badge at the room's reader. */
    private void swipe(String roomId, String idNumber) {
        reader.insertCard(adapter.channelFor(roomId), MagStripeBadgeAdapter.encodeTrack(idNumber));
    }

    /** Puts raw (possibly malformed) data on the room's channel. */
    private void swipeRaw(String roomId, String rawTrack) {
        reader.insertCard(adapter.channelFor(roomId), rawTrack);
    }

    private String lastDetail() {
        List<SensorReading> readings = dataLog.getReadings();
        return readings.get(readings.size() - 1).getDetail();
    }

    @Test
    @DisplayName("the adapter is usable through the BadgeScanner target interface")
    void adapterImplementsTargetInterface() {
        BadgeScanner scanner = adapter;

        assertNull(scanner.scanBadge(ROOM));
        assertNotNull(scanner.getScannerDescription());
    }

    @Test
    @DisplayName("scanning with no badge presented returns null")
    void noBadgeReturnsNull() {
        assertNull(adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("a swiped badge is decoded back to its ID number")
    void swipedBadgeIsDecoded() {
        swipe(ROOM, ID_NUMBER);

        assertEquals(ID_NUMBER, adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("a scan consumes the swipe, so scanning again returns null")
    void scanConsumesTheSwipe() {
        swipe(ROOM, ID_NUMBER);

        assertEquals(ID_NUMBER, adapter.scanBadge(ROOM));
        assertNull(adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("room IDs are translated to the vendor's device channel naming")
    void roomMapsToDeviceChannel() {
        assertEquals("CH-" + ROOM, adapter.channelFor(ROOM));
    }

    @Test
    @DisplayName("encodeTrack produces the vendor's track format")
    void encodeTrackUsesVendorFormat() {
        String track = MagStripeBadgeAdapter.encodeTrack(ID_NUMBER);

        assertTrue(track.startsWith("%YU^"), "track was: " + track);
        assertTrue(track.endsWith("?"), "track was: " + track);
        assertTrue(track.contains(ID_NUMBER), "track was: " + track);
    }

    @Test
    @DisplayName("completely unreadable track data yields null")
    void garbageTrackYieldsNull() {
        swipeRaw(ROOM, "TOTAL-GARBAGE");

        assertNull(adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("track data missing the terminator yields null")
    void missingTerminatorYieldsNull() {
        swipeRaw(ROOM, "%YU^" + ID_NUMBER + "^1750000000");

        assertNull(adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("track data with the wrong prefix yields null")
    void wrongPrefixYieldsNull() {
        swipeRaw(ROOM, "%XX^" + ID_NUMBER + "^1750000000?");

        assertNull(adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("track data with a blank ID field yields null")
    void blankIdYieldsNull() {
        swipeRaw(ROOM, "%YU^^1750000000?");

        assertNull(adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("truncated track data yields null instead of crashing")
    void truncatedTrackYieldsNull() {
        swipeRaw(ROOM, "%YU^?");

        assertNull(adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("a successful read is reported to the system with the ID (Req5)")
    void successfulReadIsLogged() {
        swipe(ROOM, ID_NUMBER);

        adapter.scanBadge(ROOM);

        assertTrue(lastDetail().contains(ID_NUMBER), "detail was: " + lastDetail());
    }

    @Test
    @DisplayName("an absent badge is reported to the system")
    void absentBadgeIsLogged() {
        adapter.scanBadge(ROOM);

        assertEquals(SensorReading.Source.BADGE_SCANNER, dataLog.getReadings().get(0).getSource());
        assertTrue(lastDetail().toLowerCase().contains("no badge"), "detail was: " + lastDetail());
    }

    @Test
    @DisplayName("unreadable data is reported to the system as unreadable")
    void unreadableBadgeIsLogged() {
        swipeRaw(ROOM, "TOTAL-GARBAGE");

        adapter.scanBadge(ROOM);

        assertTrue(lastDetail().toLowerCase().contains("unreadable"), "detail was: " + lastDetail());
    }

    @Test
    @DisplayName("badges swiped at one room are not visible at another")
    void roomsAreIndependent() {
        swipe(ROOM, ID_NUMBER);

        assertNull(adapter.scanBadge("LAS-2045"));
        assertEquals(ID_NUMBER, adapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("the scanner description comes from the underlying device")
    void descriptionDelegatesToHardware() {
        assertEquals(reader.getFirmwareBanner(), adapter.getScannerDescription());
    }
}
