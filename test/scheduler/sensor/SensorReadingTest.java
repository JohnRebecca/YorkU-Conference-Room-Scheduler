package scheduler.sensor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scheduler.util.AppClock;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for one piece of sensor data sent to the system (Req5).
 */
@DisplayName("SensorReading (one piece of sensor data)")
class SensorReadingTest {

    private static final String ROOM = "DB-1001";

    @AfterEach
    void restoreRealTime() {
        AppClock.reset();
    }

    @Test
    @DisplayName("the source is preserved")
    void sourceIsPreserved() {
        SensorReading reading = new SensorReading(SensorReading.Source.BADGE_SCANNER, ROOM, "Badge read");

        assertEquals(SensorReading.Source.BADGE_SCANNER, reading.getSource());
    }

    @Test
    @DisplayName("the room ID is preserved")
    void roomIsPreserved() {
        SensorReading reading = new SensorReading(SensorReading.Source.OCCUPANCY_SENSOR, ROOM, "Motion level 85/100");

        assertEquals(ROOM, reading.getRoomId());
    }

    @Test
    @DisplayName("the detail text is preserved")
    void detailIsPreserved() {
        SensorReading reading = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "Check-in confirmed");

        assertEquals("Check-in confirmed", reading.getDetail());
    }

    @Test
    @DisplayName("a reading is timestamped on creation")
    void readingIsTimestamped() {
        SensorReading reading = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "detail");

        assertNotNull(reading.getTimestamp());
    }

    @Test
    @DisplayName("the timestamp is taken from the application clock, not the system clock")
    void timestampFollowsAppClock() {
        AppClock.advance(Duration.ofDays(2));

        SensorReading reading = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "detail");

        long minutesAhead = Duration.between(LocalDateTime.now(), reading.getTimestamp()).toMinutes();
        assertTrue(minutesAhead > 2800, "expected a simulated timestamp ~2 days ahead, was " + minutesAhead + " min");
    }

    @Test
    @DisplayName("the timestamp is close to the current moment when the clock is real")
    void timestampIsCurrentOnRealClock() {
        SensorReading reading = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "detail");

        long secondsApart = Math.abs(Duration.between(LocalDateTime.now(), reading.getTimestamp()).toSeconds());
        assertTrue(secondsApart <= 5, "timestamp drifted by " + secondsApart + " s");
    }

    @Test
    @DisplayName("toString starts with a bracketed time stamp")
    void toStringStartsWithTime() {
        SensorReading reading = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "detail");

        assertTrue(reading.toString().startsWith("["), "was: " + reading);
        assertTrue(reading.toString().matches("^\\[\\d{2}:\\d{2}:\\d{2}].*"), "was: " + reading);
    }

    @Test
    @DisplayName("toString includes the source")
    void toStringIncludesSource() {
        SensorReading reading = new SensorReading(SensorReading.Source.BADGE_SCANNER, ROOM, "detail");

        assertTrue(reading.toString().contains("BADGE_SCANNER"), "was: " + reading);
    }

    @Test
    @DisplayName("toString includes the room ID")
    void toStringIncludesRoom() {
        SensorReading reading = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "detail");

        assertTrue(reading.toString().contains(ROOM), "was: " + reading);
    }

    @Test
    @DisplayName("toString includes the detail text")
    void toStringIncludesDetail() {
        SensorReading reading = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "Deposit applied");

        assertTrue(reading.toString().contains("Deposit applied"), "was: " + reading);
    }

    @Test
    @DisplayName("all three sensor data sources are available")
    void allSourcesExist() {
        assertEquals(3, SensorReading.Source.values().length);
        assertNotNull(SensorReading.Source.valueOf("OCCUPANCY_SENSOR"));
        assertNotNull(SensorReading.Source.valueOf("BADGE_SCANNER"));
        assertNotNull(SensorReading.Source.valueOf("SYSTEM"));
    }

    @Test
    @DisplayName("readings created later are not stamped earlier than earlier ones")
    void timestampsAreOrdered() {
        SensorReading first = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "first");
        AppClock.advance(Duration.ofMinutes(5));
        SensorReading second = new SensorReading(SensorReading.Source.SYSTEM, ROOM, "second");

        assertTrue(second.getTimestamp().isAfter(first.getTimestamp()));
    }
}
