package scheduler.sensor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scheduler.sensor.hardware.LegacyMotionUnit;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Adapter that turns the vendor motion unit's raw 0-100
 * levels into the scheduler's simple "is the room occupied?" question, and
 * reports every reading to the system (Req5).
 */
@DisplayName("MotionUnitOccupancyAdapter (Adapter Pattern)")
class MotionUnitOccupancyAdapterTest {

    private static final String ROOM = "DB-1001";

    private LegacyMotionUnit motionUnit;
    private SensorDataLog dataLog;
    private MotionUnitOccupancyAdapter adapter;

    @BeforeEach
    void setUp() {
        motionUnit = new LegacyMotionUnit();
        dataLog = new SensorDataLog();
        adapter = new MotionUnitOccupancyAdapter(motionUnit, dataLog);
    }

    /** Raises the vendor motion level for a room the same way the simulation does. */
    private void setMotionLevel(String roomId, int level) {
        motionUnit.injectMotion(adapter.zoneCodeFor(roomId), level);
    }

    @Test
    @DisplayName("the adapter is usable through the OccupancySensor target interface")
    void adapterImplementsTargetInterface() {
        OccupancySensor sensor = adapter;

        assertFalse(sensor.isOccupancyDetected(ROOM));
        assertNotNull(sensor.getSensorDescription());
    }

    @Test
    @DisplayName("an untouched room reports no occupancy")
    void freshRoomIsEmpty() {
        assertFalse(adapter.isOccupancyDetected(ROOM));
    }

    @Test
    @DisplayName("a high motion level reports occupancy")
    void highMotionMeansOccupied() {
        setMotionLevel(ROOM, 85);

        assertTrue(adapter.isOccupancyDetected(ROOM));
    }

    @Test
    @DisplayName("motion exactly at the threshold (40) counts as occupied")
    void thresholdBoundaryIsOccupied() {
        setMotionLevel(ROOM, 40);

        assertTrue(adapter.isOccupancyDetected(ROOM), "40 is the inclusive threshold");
    }

    @Test
    @DisplayName("motion just below the threshold (39) counts as empty")
    void justBelowThresholdIsEmpty() {
        setMotionLevel(ROOM, 39);

        assertFalse(adapter.isOccupancyDetected(ROOM));
    }

    @Test
    @DisplayName("zero motion counts as empty")
    void zeroMotionIsEmpty() {
        setMotionLevel(ROOM, 0);

        assertFalse(adapter.isOccupancyDetected(ROOM));
    }

    @Test
    @DisplayName("occupancy can go from empty to occupied and back")
    void occupancyFollowsTheMotionLevel() {
        setMotionLevel(ROOM, 85);
        assertTrue(adapter.isOccupancyDetected(ROOM));

        setMotionLevel(ROOM, 0);
        assertFalse(adapter.isOccupancyDetected(ROOM));
    }

    @Test
    @DisplayName("a room always maps to the same vendor zone code")
    void zoneCodeIsStablePerRoom() {
        assertEquals(adapter.zoneCodeFor(ROOM), adapter.zoneCodeFor(ROOM));
    }

    @Test
    @DisplayName("different rooms map to different vendor zone codes")
    void differentRoomsMapToDifferentZones() {
        assertNotEquals(adapter.zoneCodeFor(ROOM), adapter.zoneCodeFor("LAS-2045"));
    }

    @Test
    @DisplayName("rooms report occupancy independently")
    void roomsAreIndependent() {
        setMotionLevel(ROOM, 85);

        assertTrue(adapter.isOccupancyDetected(ROOM));
        assertFalse(adapter.isOccupancyDetected("LAS-2045"));
    }

    @Test
    @DisplayName("every poll sends one reading to the system (Req5)")
    void everyPollIsLogged() {
        adapter.isOccupancyDetected(ROOM);
        adapter.isOccupancyDetected(ROOM);
        adapter.isOccupancyDetected(ROOM);

        assertEquals(3, dataLog.getReadings().size());
    }

    @Test
    @DisplayName("the logged reading is attributed to the occupancy sensor and the room")
    void loggedReadingHasSourceAndRoom() {
        adapter.isOccupancyDetected(ROOM);

        List<SensorReading> readings = dataLog.getReadings();
        SensorReading reading = readings.get(readings.size() - 1);

        assertEquals(SensorReading.Source.OCCUPANCY_SENSOR, reading.getSource());
        assertEquals(ROOM, reading.getRoomId());
    }

    @Test
    @DisplayName("the logged detail reports the raw level and the interpretation")
    void loggedDetailExplainsTheReading() {
        setMotionLevel(ROOM, 85);

        adapter.isOccupancyDetected(ROOM);

        String detail = dataLog.getReadings().get(dataLog.getReadings().size() - 1).getDetail();
        assertTrue(detail.contains("85"), "detail should contain the raw level: " + detail);
        assertTrue(detail.contains("OCCUPIED"), "detail should contain the verdict: " + detail);
    }

    @Test
    @DisplayName("the sensor description comes from the underlying device")
    void descriptionDelegatesToHardware() {
        assertEquals(motionUnit.getFirmwareBanner(), adapter.getSensorDescription());
    }
}
