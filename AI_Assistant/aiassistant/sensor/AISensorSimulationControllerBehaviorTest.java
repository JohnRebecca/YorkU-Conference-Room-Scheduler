package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.sensor.MagStripeBadgeAdapter;
import scheduler.sensor.MotionUnitOccupancyAdapter;
import scheduler.sensor.SensorDataLog;
import scheduler.sensor.SensorSimulationController;
import scheduler.sensor.hardware.LegacyMotionUnit;
import scheduler.sensor.hardware.MagStripeBadgeReader;

class AISensorSimulationControllerBehaviorTest {

    private SensorSimulationController simulation;
    private MagStripeBadgeAdapter badgeAdapter;

    @BeforeEach
    void createSimulation() {
        LegacyMotionUnit motion = new LegacyMotionUnit();
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        MotionUnitOccupancyAdapter occupancy =
                new MotionUnitOccupancyAdapter(motion, new SensorDataLog());
        badgeAdapter = new MagStripeBadgeAdapter(reader, new SensorDataLog());
        simulation = new SensorSimulationController(
                motion, reader, occupancy, badgeAdapter);
    }

    @Test
    void firstEntryChangesRoomFromEmptyToOccupied() {
        assertTrue(simulation.isRoomEmpty("R1"));

        assertTrue(simulation.personEntersRoom("R1", "ID-A"));

        assertFalse(simulation.isRoomEmpty("R1"));
        assertTrue(simulation.isPersonInside("R1", "ID-A"));
        assertEquals(85, simulation.currentMotionLevel("R1"));
        assertTrue(simulation.sensorReadsOccupied("R1"));
    }

    @Test
    void duplicateEntryIsRejected() {
        simulation.personEntersRoom("R1", "ID-A");

        assertFalse(simulation.personEntersRoom("R1", "ID-A"));
    }

    @Test
    void leavingUnknownPersonIsRejected() {
        assertFalse(simulation.personLeavesRoom("R1", "missing"));
    }

    @Test
    void roomRemainsOccupiedUntilLastPersonLeaves() {
        simulation.personEntersRoom("R1", "A");
        simulation.personEntersRoom("R1", "B");

        assertTrue(simulation.personLeavesRoom("R1", "A"));
        assertTrue(simulation.sensorReadsOccupied("R1"));

        assertTrue(simulation.personLeavesRoom("R1", "B"));
        assertTrue(simulation.isRoomEmpty("R1"));
        assertFalse(simulation.sensorReadsOccupied("R1"));
    }

    @Test
    void swipingBadgePlacesReadableCardOnCorrectChannel() {
        simulation.personSwipesBadge("R1", "STU-1");

        assertTrue(simulation.isBadgeWaiting("R1"));
        assertEquals("STU-1", badgeAdapter.scanBadge("R1"));
        assertFalse(simulation.isBadgeWaiting("R1"));
    }

    @Test
    void roomsTrackOccupantsIndependently() {
        simulation.personEntersRoom("R1", "A");

        assertTrue(simulation.isPersonInside("R1", "A"));
        assertFalse(simulation.isPersonInside("R2", "A"));
        assertTrue(simulation.isRoomEmpty("R2"));
    }
}
