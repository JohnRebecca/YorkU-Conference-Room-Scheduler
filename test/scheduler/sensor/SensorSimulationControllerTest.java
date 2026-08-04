package scheduler.sensor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scheduler.sensor.hardware.LegacyMotionUnit;
import scheduler.sensor.hardware.MagStripeBadgeReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the stand-in for the physical world: people entering and
 * leaving rooms (which drives the occupancy sensor's OCCUPIED / EMPTY
 * reading) and swiping badges at readers. A person can only be inside a room
 * once, and tapping a badge is a separate act from walking in.
 */
@DisplayName("SensorSimulationController (simulated physical world)")
class SensorSimulationControllerTest {

    private static final String ROOM = "DB-1001";
    private static final String OTHER_ROOM = "LAS-2045";
    private static final String OWNER_ID = "216000001";
    private static final String GUEST_ID = "216000002";

    private MagStripeBadgeReader badgeReader;
    private MagStripeBadgeAdapter badgeAdapter;
    private SensorSimulationController simulation;

    @BeforeEach
    void setUp() {
        LegacyMotionUnit motionUnit = new LegacyMotionUnit();
        badgeReader = new MagStripeBadgeReader();
        SensorDataLog dataLog = new SensorDataLog();
        MotionUnitOccupancyAdapter occupancyAdapter = new MotionUnitOccupancyAdapter(motionUnit, dataLog);
        badgeAdapter = new MagStripeBadgeAdapter(badgeReader, dataLog);
        simulation = new SensorSimulationController(motionUnit, badgeReader, occupancyAdapter, badgeAdapter);
    }

    @Test
    @DisplayName("a room starts out empty")
    void roomStartsEmpty() {
        assertTrue(simulation.isRoomEmpty(ROOM));
        assertFalse(simulation.sensorReadsOccupied(ROOM));
    }

    @Test
    @DisplayName("entering a room succeeds and the sensor reads OCCUPIED")
    void enteringMakesRoomOccupied() {
        assertTrue(simulation.personEntersRoom(ROOM, OWNER_ID));

        assertTrue(simulation.sensorReadsOccupied(ROOM));
        assertFalse(simulation.isRoomEmpty(ROOM));
    }

    @Test
    @DisplayName("a person who entered is recorded as being inside")
    void personIsInsideAfterEntering() {
        simulation.personEntersRoom(ROOM, OWNER_ID);

        assertTrue(simulation.isPersonInside(ROOM, OWNER_ID));
    }

    @Test
    @DisplayName("the same person cannot enter twice without leaving first")
    void doubleEntryIsRejected() {
        simulation.personEntersRoom(ROOM, OWNER_ID);

        assertFalse(simulation.personEntersRoom(ROOM, OWNER_ID), "entering twice must be rejected");
    }

    @Test
    @DisplayName("a rejected double entry does not add a second occupant")
    void doubleEntryDoesNotInflateOccupancy() {
        simulation.personEntersRoom(ROOM, OWNER_ID);
        simulation.personEntersRoom(ROOM, OWNER_ID);
        simulation.personEntersRoom(ROOM, OWNER_ID);

        simulation.personLeavesRoom(ROOM, OWNER_ID);

        assertTrue(simulation.isRoomEmpty(ROOM), "one entry must be cancelled by one exit");
        assertFalse(simulation.sensorReadsOccupied(ROOM));
    }

    @Test
    @DisplayName("leaving a room succeeds for someone who is inside")
    void leavingSucceedsWhenInside() {
        simulation.personEntersRoom(ROOM, OWNER_ID);

        assertTrue(simulation.personLeavesRoom(ROOM, OWNER_ID));
        assertFalse(simulation.isPersonInside(ROOM, OWNER_ID));
    }

    @Test
    @DisplayName("leaving is rejected for someone who is not inside")
    void leavingIsRejectedWhenNotInside() {
        assertFalse(simulation.personLeavesRoom(ROOM, OWNER_ID));
    }

    @Test
    @DisplayName("leaving twice is rejected the second time")
    void doubleExitIsRejected() {
        simulation.personEntersRoom(ROOM, OWNER_ID);
        simulation.personLeavesRoom(ROOM, OWNER_ID);

        assertFalse(simulation.personLeavesRoom(ROOM, OWNER_ID));
    }

    @Test
    @DisplayName("with two people inside, one leaving keeps the room OCCUPIED")
    void oneOfTwoLeavingKeepsRoomOccupied() {
        simulation.personEntersRoom(ROOM, OWNER_ID);
        simulation.personEntersRoom(ROOM, GUEST_ID);

        simulation.personLeavesRoom(ROOM, OWNER_ID);

        assertTrue(simulation.sensorReadsOccupied(ROOM), "the guest is still inside");
        assertFalse(simulation.isRoomEmpty(ROOM));
    }

    @Test
    @DisplayName("the room reads EMPTY only once the last person leaves")
    void roomIsEmptyWhenEveryoneLeaves() {
        simulation.personEntersRoom(ROOM, OWNER_ID);
        simulation.personEntersRoom(ROOM, GUEST_ID);

        simulation.personLeavesRoom(ROOM, OWNER_ID);
        simulation.personLeavesRoom(ROOM, GUEST_ID);

        assertTrue(simulation.isRoomEmpty(ROOM));
        assertFalse(simulation.sensorReadsOccupied(ROOM));
    }

    @Test
    @DisplayName("a person can re-enter after leaving")
    void reEntryIsAllowedAfterLeaving() {
        simulation.personEntersRoom(ROOM, OWNER_ID);
        simulation.personLeavesRoom(ROOM, OWNER_ID);

        assertTrue(simulation.personEntersRoom(ROOM, OWNER_ID));
        assertTrue(simulation.sensorReadsOccupied(ROOM));
    }

    @Test
    @DisplayName("presence is tracked per room, so rooms are independent")
    void roomsAreIndependent() {
        simulation.personEntersRoom(ROOM, OWNER_ID);

        assertTrue(simulation.sensorReadsOccupied(ROOM));
        assertTrue(simulation.isRoomEmpty(OTHER_ROOM));
        assertFalse(simulation.isPersonInside(OTHER_ROOM, OWNER_ID));
    }

    @Test
    @DisplayName("the same person can be inside two different rooms in the simulation")
    void presenceIsScopedToTheRoom() {
        assertTrue(simulation.personEntersRoom(ROOM, OWNER_ID));
        assertTrue(simulation.personEntersRoom(OTHER_ROOM, OWNER_ID));

        assertTrue(simulation.isPersonInside(ROOM, OWNER_ID));
        assertTrue(simulation.isPersonInside(OTHER_ROOM, OWNER_ID));
    }

    @Test
    @DisplayName("entering raises the raw motion level, leaving drops it to zero")
    void motionLevelFollowsPresence() {
        assertEquals(0, simulation.currentMotionLevel(ROOM));

        simulation.personEntersRoom(ROOM, OWNER_ID);
        assertTrue(simulation.currentMotionLevel(ROOM) >= 40, "level was " + simulation.currentMotionLevel(ROOM));

        simulation.personLeavesRoom(ROOM, OWNER_ID);
        assertEquals(0, simulation.currentMotionLevel(ROOM));
    }

    @Test
    @DisplayName("swiping a badge makes it wait at that room's reader")
    void swipingMakesBadgeWait() {
        assertFalse(simulation.isBadgeWaiting(ROOM));

        simulation.personSwipesBadge(ROOM, OWNER_ID);

        assertTrue(simulation.isBadgeWaiting(ROOM));
    }

    @Test
    @DisplayName("a swiped badge decodes to the person's ID number")
    void swipedBadgeCarriesTheIdNumber() {
        simulation.personSwipesBadge(ROOM, OWNER_ID);

        assertEquals(OWNER_ID, badgeAdapter.scanBadge(ROOM));
    }

    @Test
    @DisplayName("swiping a badge does not change the occupancy sensor")
    void swipingDoesNotAffectOccupancy() {
        simulation.personSwipesBadge(ROOM, OWNER_ID);

        assertFalse(simulation.sensorReadsOccupied(ROOM), "tapping in and walking in are separate acts");
        assertTrue(simulation.isRoomEmpty(ROOM));
    }

    @Test
    @DisplayName("entering a room does not present a badge at the reader")
    void enteringDoesNotSwipeABadge() {
        simulation.personEntersRoom(ROOM, OWNER_ID);

        assertFalse(simulation.isBadgeWaiting(ROOM));
        assertNull(badgeReader.readTrack("CH-" + ROOM));
    }
}
