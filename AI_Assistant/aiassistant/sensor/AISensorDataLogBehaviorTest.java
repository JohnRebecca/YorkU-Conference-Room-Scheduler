package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

import scheduler.sensor.SensorDataLog;
import scheduler.sensor.SensorReading;

class AISensorDataLogBehaviorTest {

    @Test
    void recordsRemainInInsertionOrder() {
        SensorDataLog log = new SensorDataLog();
        SensorReading first = new SensorReading(SensorReading.Source.SYSTEM, "R1", "first");
        SensorReading second = new SensorReading(SensorReading.Source.SYSTEM, "R1", "second");

        log.record(first);
        log.record(second);

        assertEquals(List.of(first, second), log.getReadings());
    }

    @Test
    void convenienceRecordCreatesReading() {
        SensorDataLog log = new SensorDataLog();

        log.record(SensorReading.Source.BADGE_SCANNER, "DB-1001", "ID 123");

        assertEquals(1, log.getReadings().size());
        assertEquals("ID 123", log.getReadings().get(0).getDetail());
    }

    @Test
    void everyRegisteredCallbackRunsForEachNewReading() {
        SensorDataLog log = new SensorDataLog();
        AtomicInteger first = new AtomicInteger();
        AtomicInteger second = new AtomicInteger();
        log.addUpdateCallback(first::incrementAndGet);
        log.addUpdateCallback(second::incrementAndGet);

        log.record(SensorReading.Source.SYSTEM, "R1", "one");
        log.record(SensorReading.Source.SYSTEM, "R1", "two");

        assertEquals(2, first.get());
        assertEquals(2, second.get());
    }

    @Test
    void returnedReadingListCannotBeModified() {
        SensorDataLog log = new SensorDataLog();
        log.record(SensorReading.Source.SYSTEM, "R1", "immutable");

        assertThrows(UnsupportedOperationException.class,
                () -> log.getReadings().clear());
    }

    @Test
    void callbackCanRegisterAnotherCallbackWithoutConcurrentModification() {
        SensorDataLog log = new SensorDataLog();
        AtomicInteger lateCallback = new AtomicInteger();
        log.addUpdateCallback(() -> log.addUpdateCallback(lateCallback::incrementAndGet));

        assertDoesNotThrow(() ->
                log.record(SensorReading.Source.SYSTEM, "R1", "first"));
        log.record(SensorReading.Source.SYSTEM, "R1", "second");

        assertEquals(1, lateCallback.get());
    }
}
