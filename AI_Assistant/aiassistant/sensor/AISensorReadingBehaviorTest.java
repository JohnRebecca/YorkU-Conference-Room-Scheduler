package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import scheduler.sensor.SensorReading;
import scheduler.util.AppClock;

class AISensorReadingBehaviorTest {

    @AfterEach
    void resetClock() {
        AppClock.reset();
    }

    @Test
    void constructorCapturesAllSuppliedValues() {
        SensorReading reading = new SensorReading(
                SensorReading.Source.BADGE_SCANNER, "LAS-2045", "Badge decoded");

        assertAll(
                () -> assertEquals(SensorReading.Source.BADGE_SCANNER, reading.getSource()),
                () -> assertEquals("LAS-2045", reading.getRoomId()),
                () -> assertEquals("Badge decoded", reading.getDetail()),
                () -> assertNotNull(reading.getTimestamp())
        );
    }

    @Test
    void timestampUsesApplicationClock() {
        AppClock.advance(Duration.ofHours(4));
        LocalDateTime before = AppClock.now();

        SensorReading reading = new SensorReading(
                SensorReading.Source.SYSTEM, "DB-1001", "Decision");

        assertTrue(Math.abs(Duration.between(before, reading.getTimestamp()).toSeconds()) <= 1);
    }

    @Test
    void textRepresentationContainsSourceRoomAndDetail() {
        SensorReading reading = new SensorReading(
                SensorReading.Source.OCCUPANCY_SENSOR, "ACW-109", "Motion level 85");

        String text = reading.toString();

        assertTrue(text.contains("OCCUPANCY_SENSOR"));
        assertTrue(text.contains("ACW-109"));
        assertTrue(text.contains("Motion level 85"));
    }

    @Test
    void enumExposesAllExpectedSources() {
        assertArrayEquals(
                new SensorReading.Source[] {
                        SensorReading.Source.OCCUPANCY_SENSOR,
                        SensorReading.Source.BADGE_SCANNER,
                        SensorReading.Source.SYSTEM
                },
                SensorReading.Source.values()
        );
    }
}
