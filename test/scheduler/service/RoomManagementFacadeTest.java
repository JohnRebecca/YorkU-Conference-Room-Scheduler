package scheduler.service;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import scheduler.database.DatabaseManager;
import scheduler.model.Room;

public class RoomManagementFacadeTest {

    private static final String TEST_PREFIX = "TEST-RMF-";

    private RoomManagementFacade facade;

    @BeforeClass
    public static void initializeDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @Before
    public void setUp() throws SQLException {
        deleteTestRooms();
        facade = new RoomManagementFacade();
    }

    @After
    public void tearDown() throws SQLException {
        deleteTestRooms();
    }

    @Test
    public void addValidRoomStoresRoomInDatabase() {
        Room room = new Room(
                TEST_PREFIX + "101",
                30,
                "Lassonde",
                "First Floor"
        );

        facade.addRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "101");

        assertNotNull(storedRoom);
    }

    @Test
    public void addedRoomPreservesRoomId() {
        Room room = new Room(
                TEST_PREFIX + "102",
                25,
                "Bergeron",
                "Second Floor"
        );

        facade.addRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "102");

        assertNotNull(storedRoom);
        assertEquals(TEST_PREFIX + "102", storedRoom.getRoomId());
    }

    @Test
    public void addedRoomPreservesCapacity() {
        Room room = new Room(
                TEST_PREFIX + "103",
                75,
                "Vari Hall",
                "Third Floor"
        );

        facade.addRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "103");

        assertNotNull(storedRoom);
        assertEquals(75, storedRoom.getCapacity());
    }

    @Test
    public void addedRoomPreservesBuildingAndLocation() {
        Room room = new Room(
                TEST_PREFIX + "104",
                40,
                "Accolade East",
                "Room 201"
        );

        facade.addRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "104");

        assertNotNull(storedRoom);
        assertEquals("Accolade East", storedRoom.getBuilding());
        assertEquals("Room 201", storedRoom.getLocation());
    }

    @Test
    public void invalidRoomIsNotAdded() {
        Room invalidRoom = new Room(
                "",
                30,
                "Lassonde",
                "First Floor"
        );

        facade.addRoom(invalidRoom);

        assertEquals(0, countTestRooms());
    }

    @Test
    public void roomWithZeroCapacityIsNotAdded() {
        Room invalidRoom = new Room(
                TEST_PREFIX + "105",
                0,
                "Lassonde",
                "First Floor"
        );

        facade.addRoom(invalidRoom);

        assertNull(findRoom(TEST_PREFIX + "105"));
    }

    @Test
    public void disableRoomMakesRoomUnavailable() {
        Room room = new Room(
                TEST_PREFIX + "106",
                20,
                "Scott Library",
                "Ground Floor"
        );

        facade.addRoom(room);
        facade.disableRoom(TEST_PREFIX + "106");

        Room storedRoom = findRoom(TEST_PREFIX + "106");

        assertNotNull(storedRoom);
        assertFalse(storedRoom.isEnabled());
        assertFalse(storedRoom.isAvailableForBooking());
    }

    @Test
    public void enableRoomMakesDisabledRoomAvailable() {
        Room room = new Room(
                TEST_PREFIX + "107",
                20,
                "Scott Library",
                "Second Floor"
        );

        facade.addRoom(room);
        facade.disableRoom(TEST_PREFIX + "107");
        facade.enableRoom(TEST_PREFIX + "107");

        Room storedRoom = findRoom(TEST_PREFIX + "107");

        assertNotNull(storedRoom);
        assertTrue(storedRoom.isEnabled());
        assertTrue(storedRoom.isAvailableForBooking());
    }

    @Test
    public void closeRoomMakesRoomUnavailable() {
        Room room = new Room(
                TEST_PREFIX + "108",
                35,
                "Curtis Lecture Halls",
                "Room C"
        );

        facade.addRoom(room);
        facade.closeRoom(TEST_PREFIX + "108");

        Room storedRoom = findRoom(TEST_PREFIX + "108");

        assertNotNull(storedRoom);
        assertFalse(storedRoom.isEnabled());
        assertFalse(storedRoom.isAvailableForBooking());
    }

    @Test
    public void getAllRoomsReturnsMultipleAddedRooms() {
        facade.addRoom(new Room(
                TEST_PREFIX + "109",
                20,
                "Building A",
                "Room 1"
        ));

        facade.addRoom(new Room(
                TEST_PREFIX + "110",
                50,
                "Building B",
                "Room 2"
        ));

        assertNotNull(findRoom(TEST_PREFIX + "109"));
        assertNotNull(findRoom(TEST_PREFIX + "110"));
        assertEquals(2, countTestRooms());
    }

    @Test
    public void updatingUnknownRoomDoesNotCreateNewRoom() {
        facade.enableRoom(TEST_PREFIX + "UNKNOWN");

        assertNull(findRoom(TEST_PREFIX + "UNKNOWN"));
        assertEquals(0, countTestRooms());
    }

    @Test
    public void duplicateRoomIdDoesNotCreateTwoRecords() {
        Room firstRoom = new Room(
                TEST_PREFIX + "111",
                25,
                "Building A",
                "Room 1"
        );

        Room duplicateRoom = new Room(
                TEST_PREFIX + "111",
                80,
                "Building B",
                "Room 2"
        );

        facade.addRoom(firstRoom);
        facade.addRoom(duplicateRoom);

        assertEquals(1, countTestRooms());
    }

    private Room findRoom(String roomId) {
        List<Room> rooms = facade.getAllRooms();

        for (Room room : rooms) {
            if (roomId.equals(room.getRoomId())) {
                return room;
            }
        }

        return null;
    }

    private int countTestRooms() {
        int count = 0;

        for (Room room : facade.getAllRooms()) {
            if (room.getRoomId().startsWith(TEST_PREFIX)) {
                count++;
            }
        }

        return count;
    }

    private static void deleteTestRooms() throws SQLException {
        String sql = "DELETE FROM rooms WHERE room_id LIKE ?";

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, TEST_PREFIX + "%");
            statement.executeUpdate();
        }
    }
}