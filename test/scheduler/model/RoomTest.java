package scheduler.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {

    private Room room;

    @Before
    public void setUp() {
        room = new Room("DB-1001", 40, "DB Building", "First Floor");
    }

    @Test
    public void constructorStoresRoomId() {
        assertEquals("DB-1001", room.getRoomId());
    }

    @Test
    public void constructorStoresCapacity() {
        assertEquals(40, room.getCapacity());
    }

    @Test
    public void constructorStoresBuilding() {
        assertEquals("DB Building", room.getBuilding());
    }

    @Test
    public void constructorStoresLocation() {
        assertEquals("First Floor", room.getLocation());
    }

    @Test
    public void roomIsEnabledByDefault() {
        assertTrue(room.isEnabled());
    }

    @Test
    public void roomIsNotClosedForMaintenanceByDefault() {
        assertFalse(room.isClosedForMaintenance());
    }

    @Test
    public void newRoomIsAvailableForBooking() {
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    public void disableMakesRoomUnavailable() {
        room.disable();

        assertFalse(room.isEnabled());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void enableRestoresEnabledState() {
        room.disable();
        room.enable();

        assertTrue(room.isEnabled());
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    public void closeForMaintenanceMakesRoomUnavailable() {
        room.closeForMaintenance();

        assertTrue(room.isClosedForMaintenance());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void reopenFromMaintenanceRestoresAvailability() {
        room.closeForMaintenance();
        room.reopenFromMaintenance();

        assertFalse(room.isClosedForMaintenance());
        assertTrue(room.isAvailableForBooking());
    }

    @Test
    public void enablingRoomDoesNotReopenMaintenanceClosure() {
        room.closeForMaintenance();
        room.enable();

        assertTrue(room.isEnabled());
        assertTrue(room.isClosedForMaintenance());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void reopeningMaintenanceDoesNotEnableDisabledRoom() {
        room.disable();
        room.closeForMaintenance();
        room.reopenFromMaintenance();

        assertFalse(room.isEnabled());
        assertFalse(room.isClosedForMaintenance());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void repeatedDisableCallsKeepRoomDisabled() {
        room.disable();
        room.disable();

        assertFalse(room.isEnabled());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void repeatedMaintenanceClosureCallsKeepRoomClosed() {
        room.closeForMaintenance();
        room.closeForMaintenance();

        assertTrue(room.isClosedForMaintenance());
        assertFalse(room.isAvailableForBooking());
    }

    @Test
    public void toStringReturnsExpectedRoomDescription() {
        assertEquals(
                "DB-1001 - DB Building - First Floor - Capacity: 40",
                room.toString()
        );
    }
}