package scheduler.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import scheduler.database.DatabaseManager;
import scheduler.model.Booking;
import scheduler.model.Room;
import scheduler.TestFixtures;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * NOTE on test isolation: RoomService's constructor talks directly to the real
 * SQLite database through RoomDAO (new RoomDAO() -> getAllRooms()), with no
 * seam to inject a fake/in-memory repository instead. These are therefore
 * integration tests, not pure unit tests - they read/write the project's real
 * data/scheduler.db file. Room IDs are suffixed with the current time in
 * nanoseconds so repeated runs don't collide on the room_id primary key.
 */
class RoomServiceTest {

    private RoomService roomService;
    private String uniqueRoomId;

    @BeforeAll
    static void setUpDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @BeforeEach
    void setUp() {
        roomService = new RoomService();
        uniqueRoomId = "TEST-ROOM-" + System.nanoTime();
    }

    @Test
    void getRoomsReturnsANonNullList() {
        assertNotNull(roomService.getRooms());
    }

    @Test
    void addRoomMakesItAppearInGetRooms() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);

        boolean found = roomService.getRooms().stream()
                .anyMatch(r -> r.getRoomId().equals(uniqueRoomId));

        assertTrue(found);
    }

    @Test
    void addRoomPersistsAcrossANewRoomServiceInstance() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);

        // A brand new instance should load this room back from the database,
        // not just from the in-memory list of the original instance.
        RoomService freshInstance = new RoomService();
        boolean found = freshInstance.getRooms().stream()
                .anyMatch(r -> r.getRoomId().equals(uniqueRoomId));

        assertTrue(found);
    }

    @Test
    void setRoomEnabledFalseDisablesTheRoomInMemory() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);

        roomService.setRoomEnabled(uniqueRoomId, false);

        Room updated = roomService.getRooms().stream()
                .filter(r -> r.getRoomId().equals(uniqueRoomId))
                .findFirst()
                .orElseThrow();

        assertFalse(updated.isEnabled());
    }

    @Test
    void setRoomEnabledPersistsToTheDatabase() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);
        roomService.setRoomEnabled(uniqueRoomId, false);

        RoomService freshInstance = new RoomService();
        Room reloaded = freshInstance.getRooms().stream()
                .filter(r -> r.getRoomId().equals(uniqueRoomId))
                .findFirst()
                .orElseThrow();

        assertFalse(reloaded.isEnabled());
    }

    @Test
    void isRoomAvailableIsTrueForANewRoomWithNoBookings() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);

        LocalDateTime start = LocalDateTime.now().plusDays(1);
        assertTrue(roomService.isRoomAvailable(room, start, start.plusHours(1)));
    }

    @Test
    void isRoomAvailableIsFalseForADisabledRoom() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        room.disable();
        roomService.addRoom(room);

        LocalDateTime start = LocalDateTime.now().plusDays(1);
        assertFalse(roomService.isRoomAvailable(room, start, start.plusHours(1)));
    }

    @Test
    void isRoomAvailableIsFalseWhenOverlappingAnExistingBooking() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);

        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking existing = TestFixtures.pendingBooking(TestFixtures.studentUser(), room, start, start.plusHours(2));
        roomService.addBookingRecord(existing);

        // Overlaps the middle of the existing booking.
        assertFalse(roomService.isRoomAvailable(room, start.plusMinutes(30), start.plusMinutes(90)));
    }

    @Test
    void isRoomAvailableIsTrueWhenNewBookingStartsExactlyWhenExistingOneEnds() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);

        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking existing = TestFixtures.pendingBooking(TestFixtures.studentUser(), room, start, start.plusHours(1));
        roomService.addBookingRecord(existing);

        assertTrue(roomService.isRoomAvailable(room, start.plusHours(1), start.plusHours(2)));
    }

    @Test
    void isRoomAvailableIgnoresTheSpecifiedBookingToIgnore() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);

        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking existing = TestFixtures.pendingBooking(TestFixtures.studentUser(), room, start, start.plusHours(1));
        roomService.addBookingRecord(existing);

        // Same room/time, but explicitly ignoring the one existing booking (e.g. editing it in place).
        assertTrue(roomService.isRoomAvailable(room, start, start.plusHours(1), existing));
    }

    @Test
    void isRoomAvailableIgnoresCancelledBookings() {
        Room room = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        roomService.addRoom(room);

        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking existing = TestFixtures.pendingBooking(TestFixtures.studentUser(), room, start, start.plusHours(1));
        existing.cancel();
        roomService.addBookingRecord(existing);

        assertTrue(roomService.isRoomAvailable(room, start, start.plusHours(1)));
    }

    @Test
    void findAvailableRoomsExcludesADisabledRoom() {
        Room enabledRoom = new Room(uniqueRoomId, 10, "Test Building", "Test Floor");
        Room disabledRoom = new Room(uniqueRoomId + "-B", 10, "Test Building", "Test Floor");
        disabledRoom.disable();
        roomService.addRoom(enabledRoom);
        roomService.addRoom(disabledRoom);

        LocalDateTime start = LocalDateTime.now().plusDays(1);
        var available = roomService.findAvailableRooms(start, start.plusHours(1));

        assertTrue(available.stream().anyMatch(r -> r.getRoomId().equals(uniqueRoomId)));
        assertFalse(available.stream().anyMatch(r -> r.getRoomId().equals(disabledRoom.getRoomId())));
    }
}
