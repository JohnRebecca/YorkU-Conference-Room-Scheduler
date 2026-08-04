package scheduler.sensor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the system-side collection point for sensor data (Req5:
 * "Data is sent to the system"), including the refresh callbacks the GUI uses
 * to repaint its live feed.
 */
@DisplayName("SensorDataLog (sensor data received by the system)")
class SensorDataLogTest {

    private static final String ROOM = "DB-1001";

    private SensorDataLog dataLog;

    @BeforeEach
    void setUp() {
        dataLog = new SensorDataLog();
    }

    @Test
    @DisplayName("a new log holds no readings")
    void newLogIsEmpty() {
        assertTrue(dataLog.getReadings().isEmpty());
    }

    @Test
    @DisplayName("recording a reading object stores it")
    void recordingReadingObjectStoresIt() {
        SensorReading reading = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "detail");

        dataLog.record(reading);

        assertEquals(1, dataLog.getReadings().size());
        assertSame(reading, dataLog.getReadings().get(0));
    }

    @Test
    @DisplayName("the convenience overload builds a reading from its parts")
    void convenienceOverloadBuildsReading() {
        dataLog.record(SensorReading.Source.BADGE_SCANNER, ROOM, "Badge read, ID 216000001");

        SensorReading stored = dataLog.getReadings().get(0);
        assertEquals(SensorReading.Source.BADGE_SCANNER, stored.getSource());
        assertEquals(ROOM, stored.getRoomId());
        assertEquals("Badge read, ID 216000001", stored.getDetail());
    }

    @Test
    @DisplayName("readings accumulate")
    void readingsAccumulate() {
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "one");
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "two");
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "three");

        assertEquals(3, dataLog.getReadings().size());
    }

    @Test
    @DisplayName("readings are kept in the order they arrived, oldest first")
    void orderIsPreserved() {
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "first");
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "second");

        assertEquals("first", dataLog.getReadings().get(0).getDetail());
        assertEquals("second", dataLog.getReadings().get(1).getDetail());
    }

    @Test
    @DisplayName("the exposed reading list cannot be modified from outside")
    void readingListIsUnmodifiable() {
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "detail");
        List<SensorReading> readings = dataLog.getReadings();

        assertThrows(UnsupportedOperationException.class, () -> readings.clear());
    }

    @Test
    @DisplayName("a registered callback fires when a reading is recorded")
    void callbackFiresOnRecord() {
        AtomicInteger calls = new AtomicInteger();
        dataLog.addUpdateCallback(calls::incrementAndGet);

        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "detail");

        assertEquals(1, calls.get());
    }

    @Test
    @DisplayName("the callback fires once per recorded reading")
    void callbackFiresOncePerReading() {
        AtomicInteger calls = new AtomicInteger();
        dataLog.addUpdateCallback(calls::incrementAndGet);

        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "one");
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "two");
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "three");

        assertEquals(3, calls.get());
    }

    @Test
    @DisplayName("several callbacks are all notified")
    void allCallbacksAreNotified() {
        List<String> notified = new ArrayList<>();
        dataLog.addUpdateCallback(() -> notified.add("first"));
        dataLog.addUpdateCallback(() -> notified.add("second"));

        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "detail");

        assertEquals(2, notified.size());
        assertTrue(notified.contains("first"));
        assertTrue(notified.contains("second"));
    }

    @Test
    @DisplayName("a callback registered later does not replay past readings")
    void lateCallbackDoesNotReplayHistory() {
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "before");
        AtomicInteger calls = new AtomicInteger();

        dataLog.addUpdateCallback(calls::incrementAndGet);

        assertEquals(0, calls.get(), "existing readings must not re-fire the callback");
    }

    @Test
    @DisplayName("a callback registered later is notified about new readings")
    void lateCallbackReceivesNewReadings() {
        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "before");
        AtomicInteger calls = new AtomicInteger();
        dataLog.addUpdateCallback(calls::incrementAndGet);

        dataLog.record(SensorReading.Source.SYSTEM, ROOM, "after");

        assertEquals(1, calls.get());
    }

    @Test
    @DisplayName("readings from different sources and rooms live in the same log")
    void logMixesSourcesAndRooms() {
        dataLog.record(SensorReading.Source.OCCUPANCY_SENSOR, ROOM, "Motion level 85/100");
        dataLog.record(SensorReading.Source.BADGE_SCANNER, "LAS-2045", "Badge read");

        assertEquals(2, dataLog.getReadings().size());
        assertEquals(ROOM, dataLog.getReadings().get(0).getRoomId());
        assertEquals("LAS-2045", dataLog.getReadings().get(1).getRoomId());
    }
}
