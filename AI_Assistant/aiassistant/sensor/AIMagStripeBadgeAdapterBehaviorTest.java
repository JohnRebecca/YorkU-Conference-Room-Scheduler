package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scheduler.sensor.MagStripeBadgeAdapter;
import scheduler.sensor.SensorDataLog;
import scheduler.sensor.SensorReading;
import scheduler.sensor.hardware.MagStripeBadgeReader;

class AIMagStripeBadgeAdapterBehaviorTest {

    @Test
    void adapterTranslatesRoomToVendorChannel() {
        MagStripeBadgeAdapter adapter =
                new MagStripeBadgeAdapter(new MagStripeBadgeReader(), new SensorDataLog());

        assertEquals("CH-DB-1001", adapter.channelFor("DB-1001"));
    }

    @Test
    void validVendorTrackReturnsDecodedIdentificationNumber() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        SensorDataLog log = new SensorDataLog();
        MagStripeBadgeAdapter adapter = new MagStripeBadgeAdapter(reader, log);
        reader.insertCard(adapter.channelFor("R1"), "%YU^STU-55^123456?");

        assertEquals("STU-55", adapter.scanBadge("R1"));
        assertTrue(log.getReadings().get(0).getDetail().contains("STU-55"));
    }

    @Test
    void missingCardReturnsNullAndCreatesLogEntry() {
        SensorDataLog log = new SensorDataLog();
        MagStripeBadgeAdapter adapter =
                new MagStripeBadgeAdapter(new MagStripeBadgeReader(), log);

        assertNull(adapter.scanBadge("R1"));
        assertEquals("No badge presented", log.getReadings().get(0).getDetail());
    }

    @Test
    void malformedTrackReturnsNull() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        SensorDataLog log = new SensorDataLog();
        MagStripeBadgeAdapter adapter = new MagStripeBadgeAdapter(reader, log);
        reader.insertCard(adapter.channelFor("R1"), "not-vendor-format");

        assertNull(adapter.scanBadge("R1"));
        assertTrue(log.getReadings().get(0).getDetail().contains("Unreadable"));
    }

    @Test
    void blankIdentificationSegmentIsRejected() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        MagStripeBadgeAdapter adapter =
                new MagStripeBadgeAdapter(reader, new SensorDataLog());
        reader.insertCard(adapter.channelFor("R1"), "%YU^^123?");

        assertNull(adapter.scanBadge("R1"));
    }

    @Test
    void scanConsumesTheCard() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        MagStripeBadgeAdapter adapter =
                new MagStripeBadgeAdapter(reader, new SensorDataLog());
        reader.insertCard(adapter.channelFor("R1"), "%YU^A1^123?");

        assertEquals("A1", adapter.scanBadge("R1"));
        assertNull(adapter.scanBadge("R1"));
    }

    @Test
    void encodedTrackCanBeReadBackByAdapter() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        MagStripeBadgeAdapter adapter =
                new MagStripeBadgeAdapter(reader, new SensorDataLog());
        reader.insertCard(adapter.channelFor("R1"),
                MagStripeBadgeAdapter.encodeTrack("EMP-8"));

        assertEquals("EMP-8", adapter.scanBadge("R1"));
    }

    @Test
    void descriptionDelegatesToReader() {
        MagStripeBadgeAdapter adapter =
                new MagStripeBadgeAdapter(new MagStripeBadgeReader(), new SensorDataLog());

        assertTrue(adapter.getScannerDescription().contains("SwipeTech"));
    }
}
