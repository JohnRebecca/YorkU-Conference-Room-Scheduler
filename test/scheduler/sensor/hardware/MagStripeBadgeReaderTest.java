package scheduler.sensor.hardware;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the simulated badge reader (Adapter Pattern - Adaptee).
 * The vendor API addresses readers by device channel and returns raw,
 * unparsed track data. A read consumes the swipe, like a real one-shot read.
 */
@DisplayName("MagStripeBadgeReader (simulated badge hardware)")
class MagStripeBadgeReaderTest {

    private static final String CHANNEL = "CH-DB-1001";
    private static final String TRACK = "%YU^216000001^1750000000?";

    private MagStripeBadgeReader reader;

    @BeforeEach
    void setUp() {
        reader = new MagStripeBadgeReader();
    }

    @Test
    @DisplayName("reading a channel with no swipe returns null")
    void readWithoutSwipeReturnsNull() {
        assertNull(reader.readTrack(CHANNEL));
    }

    @Test
    @DisplayName("a swiped card can be read back as raw track data")
    void swipeThenReadReturnsTrackData() {
        reader.insertCard(CHANNEL, TRACK);

        assertEquals(TRACK, reader.readTrack(CHANNEL));
    }

    @Test
    @DisplayName("reading consumes the swipe, so a second read returns null")
    void readConsumesTheSwipe() {
        reader.insertCard(CHANNEL, TRACK);

        assertEquals(TRACK, reader.readTrack(CHANNEL));
        assertNull(reader.readTrack(CHANNEL), "the card should only be readable once");
    }

    @Test
    @DisplayName("no pending card on a fresh reader")
    void noPendingCardInitially() {
        assertFalse(reader.hasPendingCard(CHANNEL));
    }

    @Test
    @DisplayName("hasPendingCard is true after a swipe")
    void pendingCardAfterSwipe() {
        reader.insertCard(CHANNEL, TRACK);

        assertTrue(reader.hasPendingCard(CHANNEL));
    }

    @Test
    @DisplayName("hasPendingCard is false again once the card is read")
    void noPendingCardAfterRead() {
        reader.insertCard(CHANNEL, TRACK);
        reader.readTrack(CHANNEL);

        assertFalse(reader.hasPendingCard(CHANNEL));
    }

    @Test
    @DisplayName("hasPendingCard only peeks - it never consumes the swipe")
    void peekDoesNotConsume() {
        reader.insertCard(CHANNEL, TRACK);

        assertTrue(reader.hasPendingCard(CHANNEL));
        assertTrue(reader.hasPendingCard(CHANNEL));

        assertEquals(TRACK, reader.readTrack(CHANNEL), "peeking must not consume the card");
    }

    @Test
    @DisplayName("swiping twice keeps only the most recent card")
    void secondSwipeReplacesTheFirst() {
        String secondTrack = "%YU^216000002^1750000900?";
        reader.insertCard(CHANNEL, TRACK);
        reader.insertCard(CHANNEL, secondTrack);

        assertEquals(secondTrack, reader.readTrack(CHANNEL));
    }

    @Test
    @DisplayName("channels are independent, so rooms do not share swipes")
    void channelsAreIndependent() {
        reader.insertCard(CHANNEL, TRACK);

        assertNull(reader.readTrack("CH-LAS-2045"));
        assertEquals(TRACK, reader.readTrack(CHANNEL), "the other room's read must not consume this swipe");
    }

    @Test
    @DisplayName("the reader accepts malformed track data - decoding is the adapter's job")
    void readerDoesNotValidateTrackData() {
        reader.insertCard(CHANNEL, "TOTAL-GARBAGE");

        assertEquals("TOTAL-GARBAGE", reader.readTrack(CHANNEL));
    }

    @Test
    @DisplayName("firmware banner identifies the device as simulated")
    void firmwareBannerMentionsSimulation() {
        String banner = reader.getFirmwareBanner();

        assertNotNull(banner);
        assertTrue(banner.toLowerCase().contains("simulated"), "banner was: " + banner);
    }
}
