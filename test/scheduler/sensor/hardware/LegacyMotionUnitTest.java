package scheduler.sensor.hardware;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the simulated occupancy hardware (Adapter Pattern - Adaptee).
 * The vendor API works with integer zone codes and raw 0-100 motion levels.
 */
@DisplayName("LegacyMotionUnit (simulated occupancy hardware)")
class LegacyMotionUnitTest {

    private LegacyMotionUnit motionUnit;

    @BeforeEach
    void setUp() {
        motionUnit = new LegacyMotionUnit();
    }

    @Test
    @DisplayName("registerZone returns a usable zone code")
    void registerZoneReturnsCode() {
        int zoneCode = motionUnit.registerZone("DB-1001");

        assertTrue(zoneCode > 0, "a registered zone should get a positive code");
    }

    @Test
    @DisplayName("registering the same label twice returns the same zone code")
    void registerZoneIsIdempotent() {
        int first = motionUnit.registerZone("DB-1001");
        int second = motionUnit.registerZone("DB-1001");

        assertEquals(first, second);
    }

    @Test
    @DisplayName("different labels get different zone codes")
    void differentLabelsGetDifferentCodes() {
        int firstRoom = motionUnit.registerZone("DB-1001");
        int secondRoom = motionUnit.registerZone("LAS-2045");

        assertNotEquals(firstRoom, secondRoom);
    }

    @Test
    @DisplayName("a newly registered zone starts with no motion")
    void newZoneStartsAtZero() {
        int zoneCode = motionUnit.registerZone("DB-1001");

        assertEquals(0, motionUnit.pollMotionLevel(zoneCode));
    }

    @Test
    @DisplayName("polling an unknown zone returns the vendor error code -1")
    void unknownZoneReturnsErrorCode() {
        assertEquals(-1, motionUnit.pollMotionLevel(9999));
    }

    @Test
    @DisplayName("injectMotion sets the reported motion level")
    void injectMotionSetsLevel() {
        int zoneCode = motionUnit.registerZone("DB-1001");

        motionUnit.injectMotion(zoneCode, 85);

        assertEquals(85, motionUnit.pollMotionLevel(zoneCode));
    }

    @Test
    @DisplayName("injectMotion clamps values above the vendor maximum of 100")
    void injectMotionClampsHigh() {
        int zoneCode = motionUnit.registerZone("DB-1001");

        motionUnit.injectMotion(zoneCode, 5000);

        assertEquals(100, motionUnit.pollMotionLevel(zoneCode));
    }

    @Test
    @DisplayName("injectMotion clamps negative values to zero")
    void injectMotionClampsLow() {
        int zoneCode = motionUnit.registerZone("DB-1001");
        motionUnit.injectMotion(zoneCode, 90);

        motionUnit.injectMotion(zoneCode, -40);

        assertEquals(0, motionUnit.pollMotionLevel(zoneCode));
    }

    @Test
    @DisplayName("injecting motion into an unknown zone is ignored, not an error")
    void injectMotionIntoUnknownZoneIsIgnored() {
        assertDoesNotThrow(() -> motionUnit.injectMotion(4242, 90));
        assertEquals(-1, motionUnit.pollMotionLevel(4242));
    }

    @Test
    @DisplayName("zones report motion independently of each other")
    void zonesAreIndependent() {
        int firstRoom = motionUnit.registerZone("DB-1001");
        int secondRoom = motionUnit.registerZone("LAS-2045");

        motionUnit.injectMotion(firstRoom, 85);

        assertEquals(85, motionUnit.pollMotionLevel(firstRoom));
        assertEquals(0, motionUnit.pollMotionLevel(secondRoom));
    }

    @Test
    @DisplayName("motion can be raised and lowered repeatedly")
    void motionCanBeToggled() {
        int zoneCode = motionUnit.registerZone("DB-1001");

        motionUnit.injectMotion(zoneCode, 85);
        assertEquals(85, motionUnit.pollMotionLevel(zoneCode));

        motionUnit.injectMotion(zoneCode, 0);
        assertEquals(0, motionUnit.pollMotionLevel(zoneCode));

        motionUnit.injectMotion(zoneCode, 60);
        assertEquals(60, motionUnit.pollMotionLevel(zoneCode));
    }

    @Test
    @DisplayName("firmware banner identifies the device as simulated")
    void firmwareBannerMentionsSimulation() {
        String banner = motionUnit.getFirmwareBanner();

        assertNotNull(banner);
        assertTrue(banner.toLowerCase().contains("simulated"), "banner was: " + banner);
    }
}
