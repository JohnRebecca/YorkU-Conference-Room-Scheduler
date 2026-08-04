package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scheduler.sensor.hardware.LegacyMotionUnit;

class AILegacyMotionUnitBehaviorTest {

    @Test
    void registeringSameLabelReturnsStableZoneCode() {
        LegacyMotionUnit unit = new LegacyMotionUnit();

        int first = unit.registerZone("DB-1001");
        int second = unit.registerZone("DB-1001");

        assertEquals(first, second);
    }

    @Test
    void distinctLabelsReceiveDistinctCodes() {
        LegacyMotionUnit unit = new LegacyMotionUnit();

        assertNotEquals(unit.registerZone("R1"), unit.registerZone("R2"));
    }

    @Test
    void newZoneStartsAtZeroMotion() {
        LegacyMotionUnit unit = new LegacyMotionUnit();
        int zone = unit.registerZone("R1");

        assertEquals(0, unit.pollMotionLevel(zone));
    }

    @Test
    void unknownZoneUsesVendorErrorValue() {
        assertEquals(-1, new LegacyMotionUnit().pollMotionLevel(9999));
    }

    @Test
    void injectedMotionIsClampedToValidRange() {
        LegacyMotionUnit unit = new LegacyMotionUnit();
        int zone = unit.registerZone("R1");

        unit.injectMotion(zone, 150);
        assertEquals(100, unit.pollMotionLevel(zone));

        unit.injectMotion(zone, -20);
        assertEquals(0, unit.pollMotionLevel(zone));
    }

    @Test
    void injectionForUnknownZoneDoesNothing() {
        LegacyMotionUnit unit = new LegacyMotionUnit();
        unit.injectMotion(5000, 80);

        assertEquals(-1, unit.pollMotionLevel(5000));
    }

    @Test
    void firmwareBannerIdentifiesSimulatedUnit() {
        assertTrue(new LegacyMotionUnit().getFirmwareBanner().contains("LMU-900"));
    }
}
