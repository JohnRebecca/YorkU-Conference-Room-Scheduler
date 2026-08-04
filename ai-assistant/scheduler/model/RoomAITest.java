package scheduler.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomAITest {

    @Test
    public void newlyCreatedRoomStoresAllValues() {
        Room room = new Room(
                "LAS-2001",
                35,
                "Lassonde Building",
                "Second Floor"
        );

        assertEquals("LAS-2001", room.getRoomId());
        assertEquals(35, room.getCapacity());
        assertEquals("Lassonde Building", room.getBuilding());
        assertEquals("Second Floor", room.getLocation());
    }

    @Test
    public void newlyCreatedRoomStartsEnabledAndOpen() {
        Room room = new Room(
                "LAS-2002",
                20,
                "Lassonde Building",
                "First Floor"
        );

        assertTrue(room.isEnabled());
        assertFalse(room.isClosedForMaintenance());
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    public void disablingRoomChangesAvailability() {
        Room room = new Room("DB-2001", 30, "DB Building", "Room 101");

        room.disable();

        assertFalse(room.isEnabled());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void enablingPreviouslyDisabledRoomRestoresAvailability() {
        Room room = new Room("DB-2002", 30, "DB Building", "Room 102");

        room.disable();
        room.enable();

        assertTrue(room.isEnabled());
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    public void maintenanceClosureMakesEnabledRoomUnavailable() {
        Room room = new Room("VH-2001", 60, "Vari Hall", "Third Floor");

        room.closeForMaintenance();

        assertTrue(room.isEnabled());
        assertTrue(room.isClosedForMaintenance());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void reopeningMaintenanceRestoresAvailability() {
        Room room = new Room("VH-2002", 60, "Vari Hall", "Fourth Floor");

        room.closeForMaintenance();
        room.reopenFromMaintenance();

        assertFalse(room.isClosedForMaintenance());
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    public void reopeningMaintenanceDoesNotEnableDisabledRoom() {
        Room room = new Room("ACW-201", 15, "Accolade West", "Main Floor");

        room.disable();
        room.closeForMaintenance();
        room.reopenFromMaintenance();

        assertFalse(room.isEnabled());
        assertFalse(room.isClosedForMaintenance());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void enablingRoomDoesNotRemoveMaintenanceClosure() {
        Room room = new Room("ACW-202", 15, "Accolade West", "Second Floor");

        room.closeForMaintenance();
        room.enable();

        assertTrue(room.isEnabled());
        assertTrue(room.isClosedForMaintenance());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void repeatedStateChangesRemainConsistent() {
        Room room = new Room("ACE-301", 50, "Accolade East", "Third Floor");

        room.disable();
        room.disable();
        room.enable();
        room.enable();

        assertTrue(room.isEnabled());
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    public void toStringContainsExpectedDescription() {
        Room room = new Room(
                "ACE-302",
                50,
                "Accolade East",
                "Third Floor"
        );

        assertEquals(
                "ACE-302 - Accolade East - Third Floor - Capacity: 50",
                room.toString()
        );
    }
}