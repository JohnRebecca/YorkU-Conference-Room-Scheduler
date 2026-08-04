package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scheduler.sensor.MotionUnitOccupancyAdapter;
import scheduler.sensor.SensorDataLog;
import scheduler.sensor.SensorReading;
import scheduler.sensor.hardware.LegacyMotionUnit;

class AIMotionUnitOccupancyAdapterBehaviorTest {

    @Test
    void levelBelowFortyIsEmptyAndLogged() {
        LegacyMotionUnit unit = new LegacyMotionUnit();
        SensorDataLog log = new SensorDataLog();
        MotionUnitOccupancyAdapter adapter = new MotionUnitOccupancyAdapter(unit, log);
        int zone = adapter.zoneCodeFor("R1");
        unit.injectMotion(zone, 39);

        assertFalse(adapter.isOccupancyDetected("R1"));
        assertEquals(1, log.getReadings().size());
        assertTrue(log.getReadings().get(0).getDetail().contains("empty"));
    }

    @Test
    void levelExactlyFortyCountsAsOccupied() {
        LegacyMotionUnit unit = new LegacyMotionUnit();
        MotionUnitOccupancyAdapter adapter =
                new MotionUnitOccupancyAdapter(unit, new SensorDataLog());
        int zone = adapter.zoneCodeFor("R1");
        unit.injectMotion(zone, 40);

        assertTrue(adapter.isOccupancyDetected("R1"));
    }

    @Test
    void roomMappingIsLazyAndStable() {
        LegacyMotionUnit unit = new LegacyMotionUnit();
        MotionUnitOccupancyAdapter adapter =
                new MotionUnitOccupancyAdapter(unit, new SensorDataLog());

        int first = adapter.zoneCodeFor("LAS-2045");
        int second = adapter.zoneCodeFor("LAS-2045");

        assertEquals(first, second);
    }

    @Test
    void differentRoomsMapToDifferentVendorZones() {
        MotionUnitOccupancyAdapter adapter =
                new MotionUnitOccupancyAdapter(new LegacyMotionUnit(), new SensorDataLog());

        assertNotEquals(adapter.zoneCodeFor("R1"), adapter.zoneCodeFor("R2"));
    }

    @Test
    void logEntryUsesOccupancySensorSource() {
        SensorDataLog log = new SensorDataLog();
        MotionUnitOccupancyAdapter adapter =
                new MotionUnitOccupancyAdapter(new LegacyMotionUnit(), log);

        adapter.isOccupancyDetected("R1");

        assertEquals(SensorReading.Source.OCCUPANCY_SENSOR,
                log.getReadings().get(0).getSource());
    }

    @Test
    void descriptionComesFromUnderlyingHardware() {
        MotionUnitOccupancyAdapter adapter =
                new MotionUnitOccupancyAdapter(new LegacyMotionUnit(), new SensorDataLog());

        assertTrue(adapter.getSensorDescription().contains("AcmeSense"));
    }
}
