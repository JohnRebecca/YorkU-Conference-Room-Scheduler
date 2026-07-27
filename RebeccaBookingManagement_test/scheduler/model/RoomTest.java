package scheduler.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void constructorSetsAllFields() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");

        assertEquals("DB-1001", room.getRoomId());
        assertEquals(40, room.getCapacity());
        assertEquals("DB Building", room.getBuilding());
        assertEquals("First Floor", room.getLocation());
    }

    @Test
    void constructorDefaultsToEnabledAndNotClosedForMaintenance() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");

        assertTrue(room.isEnabled());
        assertFalse(room.isClosedForMaintenance());
    }

    @Test
    void newRoomIsAvailableForBooking() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    void disableMakesRoomUnavailable() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");
        room.disable();

        assertFalse(room.isEnabled());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    void enableAfterDisableRestoresAvailability() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");
        room.disable();
        room.enable();

        assertTrue(room.isEnabled());
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    void closeForMaintenanceMakesRoomUnavailableEvenWhenEnabled() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");
        room.closeForMaintenance();

        assertTrue(room.isEnabled());
        assertTrue(room.isClosedForMaintenance());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    void reopenFromMaintenanceRestoresAvailability() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");
        room.closeForMaintenance();
        room.reopenFromMaintenance();

        assertFalse(room.isClosedForMaintenance());
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    void disabledAndClosedForMaintenanceIsStillUnavailableAfterOnlyReopening() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");
        room.disable();
        room.closeForMaintenance();
        room.reopenFromMaintenance();

        // Still disabled even though maintenance was cleared.
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    void toStringIncludesRoomIdBuildingLocationAndCapacity() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");
        String text = room.toString();

        assertTrue(text.contains("DB-1001"));
        assertTrue(text.contains("DB Building"));
        assertTrue(text.contains("First Floor"));
        assertTrue(text.contains("40"));
    }

    @Test
    void constructorAllowsZeroCapacity() {
        Room room = new Room("EMPTY-1", 0, "Building", "Floor");
        assertEquals(0, room.getCapacity());
    }

    @Test
    void twoRoomsWithDifferentIdsAreIndependentInstances() {
        Room room1 = new Room("DB-1001", 40, "DB Building", "First Floor");
        Room room2 = new Room("LAS-2045", 25, "Lassonde Building", "Second Floor");

        room1.disable();

        assertFalse(room1.isAvailableForBooking());
        assertTrue(room2.isAvailableForBooking());
    }
}
