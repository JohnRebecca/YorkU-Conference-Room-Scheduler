package scheduler.repository;

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

public class RoomDAOTest {

    private static final String TEST_PREFIX = "TEST-RDAO-";

    private RoomDAO roomDAO;

    @BeforeClass
    public static void initializeDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @Before
    public void setUp() throws SQLException {
        deleteTestRooms();
        roomDAO = new RoomDAO();
    }

    @After
    public void tearDown() throws SQLException {
        deleteTestRooms();
    }

    @Test
    public void insertRoomAddsRoomToDatabase() {
        Room room = new Room(
                TEST_PREFIX + "101",
                30,
                "Lassonde Building",
                "First Floor"
        );

        roomDAO.insertRoom(room);

        assertNotNull(findRoom(TEST_PREFIX + "101"));
    }

    @Test
    public void insertedRoomPreservesRoomId() {
        Room room = new Room(
                TEST_PREFIX + "102",
                35,
                "Bergeron Centre",
                "Second Floor"
        );

        roomDAO.insertRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "102");

        assertNotNull(storedRoom);
        assertEquals(TEST_PREFIX + "102", storedRoom.getRoomId());
    }

    @Test
    public void insertedRoomPreservesCapacity() {
        Room room = new Room(
                TEST_PREFIX + "103",
                75,
                "Vari Hall",
                "Third Floor"
        );

        roomDAO.insertRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "103");

        assertNotNull(storedRoom);
        assertEquals(75, storedRoom.getCapacity());
    }

    @Test
    public void insertedRoomPreservesBuilding() {
        Room room = new Room(
                TEST_PREFIX + "104",
                25,
                "Accolade East",
                "Room 201"
        );

        roomDAO.insertRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "104");

        assertNotNull(storedRoom);
        assertEquals("Accolade East", storedRoom.getBuilding());
    }

    @Test
    public void insertedRoomPreservesLocation() {
        Room room = new Room(
                TEST_PREFIX + "105",
                25,
                "Accolade West",
                "Main Floor"
        );

        roomDAO.insertRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "105");

        assertNotNull(storedRoom);
        assertEquals("Main Floor", storedRoom.getLocation());
    }

    @Test
    public void insertedRoomIsEnabledByDefault() {
        Room room = new Room(
                TEST_PREFIX + "106",
                20,
                "Scott Library",
                "Ground Floor"
        );

        roomDAO.insertRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "106");

        assertNotNull(storedRoom);
        assertTrue(storedRoom.isEnabled());
        assertTrue(storedRoom.isAvailableForBooking());
    }

    @Test
    public void insertDisabledRoomPreservesDisabledState() {
        Room room = new Room(
                TEST_PREFIX + "107",
                20,
                "Scott Library",
                "Second Floor"
        );

        room.disable();
        roomDAO.insertRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "107");

        assertNotNull(storedRoom);
        assertFalse(storedRoom.isEnabled());
        assertFalse(storedRoom.isAvailableForBooking());
    }

    @Test
    public void insertMaintenanceRoomPreservesMaintenanceState() {
        Room room = new Room(
                TEST_PREFIX + "108",
                45,
                "Curtis Lecture Halls",
                "Room C"
        );

        room.closeForMaintenance();
        roomDAO.insertRoom(room);

        Room storedRoom = findRoom(TEST_PREFIX + "108");

        assertNotNull(storedRoom);
        assertTrue(storedRoom.isClosedForMaintenance());
        assertFalse(storedRoom.isAvailableForBooking());
    }

    @Test
    public void updateRoomStatusDisablesRoom() {
        Room room = new Room(
                TEST_PREFIX + "109",
                40,
                "DB Building",
                "First Floor"
        );

        roomDAO.insertRoom(room);
        roomDAO.updateRoomStatus(TEST_PREFIX + "109", false);

        Room storedRoom = findRoom(TEST_PREFIX + "109");

        assertNotNull(storedRoom);
        assertFalse(storedRoom.isEnabled());
    }

    @Test
    public void updateRoomStatusEnablesDisabledRoom() {
        Room room = new Room(
                TEST_PREFIX + "110",
                40,
                "DB Building",
                "Second Floor"
        );

        room.disable();
        roomDAO.insertRoom(room);
        roomDAO.updateRoomStatus(TEST_PREFIX + "110", true);

        Room storedRoom = findRoom(TEST_PREFIX + "110");

        assertNotNull(storedRoom);
        assertTrue(storedRoom.isEnabled());
    }

    @Test
    public void getAllRoomsReturnsMultipleInsertedRooms() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "111",
                15,
                "Building A",
                "Room 1"
        ));

        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "112",
                50,
                "Building B",
                "Room 2"
        ));

        assertNotNull(findRoom(TEST_PREFIX + "111"));
        assertNotNull(findRoom(TEST_PREFIX + "112"));
        assertEquals(2, countTestRooms());
    }

    @Test
    public void updateUnknownRoomDoesNotCreateRoom() {
        roomDAO.updateRoomStatus(TEST_PREFIX + "UNKNOWN", true);

        assertNull(findRoom(TEST_PREFIX + "UNKNOWN"));
    }

    @Test
    public void getAllRoomsReturnsNonNullList() {
        List<Room> rooms = roomDAO.getAllRooms();

        assertNotNull(rooms);
    }

    @Test
    public void duplicateRoomIdLeavesOnlyOneRecord() {
        Room firstRoom = new Room(
                TEST_PREFIX + "113",
                20,
                "Building A",
                "Room 1"
        );

        Room duplicateRoom = new Room(
                TEST_PREFIX + "113",
                80,
                "Building B",
                "Room 2"
        );

        roomDAO.insertRoom(firstRoom);
        roomDAO.insertRoom(duplicateRoom);

        assertEquals(1, countTestRooms());
    }

    private Room findRoom(String roomId) {
        for (Room room : roomDAO.getAllRooms()) {
            if (roomId.equals(room.getRoomId())) {
                return room;
            }
        }

        return null;
    }

    private int countTestRooms() {
        int count = 0;

        for (Room room : roomDAO.getAllRooms()) {
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