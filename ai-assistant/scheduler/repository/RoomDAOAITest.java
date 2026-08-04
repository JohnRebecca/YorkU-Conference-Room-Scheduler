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

public class RoomDAOAITest {

    private static final String TEST_PREFIX = "AI-RDAO-";

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
    public void insertRoomStoresRecord() {
        Room room = new Room(
                TEST_PREFIX + "101",
                30,
                "Lassonde",
                "First Floor"
        );

        roomDAO.insertRoom(room);

        assertNotNull(findRoom(TEST_PREFIX + "101"));
    }

    @Test
    public void insertedRoomPreservesId() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "102",
                25,
                "Bergeron",
                "Second Floor"
        ));

        Room stored = findRoom(TEST_PREFIX + "102");

        assertNotNull(stored);
        assertEquals(TEST_PREFIX + "102", stored.getRoomId());
    }

    @Test
    public void insertedRoomPreservesCapacity() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "103",
                70,
                "Vari Hall",
                "Third Floor"
        ));

        Room stored = findRoom(TEST_PREFIX + "103");

        assertNotNull(stored);
        assertEquals(70, stored.getCapacity());
    }

    @Test
    public void insertedRoomPreservesBuilding() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "104",
                20,
                "Accolade East",
                "Room 201"
        ));

        Room stored = findRoom(TEST_PREFIX + "104");

        assertNotNull(stored);
        assertEquals("Accolade East", stored.getBuilding());
    }

    @Test
    public void insertedRoomPreservesLocation() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "105",
                20,
                "Accolade West",
                "Main Floor"
        ));

        Room stored = findRoom(TEST_PREFIX + "105");

        assertNotNull(stored);
        assertEquals("Main Floor", stored.getLocation());
    }

    @Test
    public void insertedRoomIsEnabledByDefault() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "106",
                40,
                "DB Building",
                "First Floor"
        ));

        Room stored = findRoom(TEST_PREFIX + "106");

        assertNotNull(stored);
        assertTrue(stored.isEnabled());
        assertTrue(stored.isAvailableForBooking());
    }

    @Test
    public void disabledRoomStateIsPersisted() {
        Room room = new Room(
                TEST_PREFIX + "107",
                40,
                "DB Building",
                "Second Floor"
        );

        room.disable();
        roomDAO.insertRoom(room);

        Room stored = findRoom(TEST_PREFIX + "107");

        assertNotNull(stored);
        assertFalse(stored.isEnabled());
        assertFalse(stored.isAvailableForBooking());
    }

    @Test
    public void maintenanceStateIsPersisted() {
        Room room = new Room(
                TEST_PREFIX + "108",
                35,
                "Curtis Lecture Halls",
                "Room C"
        );

        room.closeForMaintenance();
        roomDAO.insertRoom(room);

        Room stored = findRoom(TEST_PREFIX + "108");

        assertNotNull(stored);
        assertTrue(stored.isClosedForMaintenance());
        assertFalse(stored.isAvailableForBooking());
    }

    @Test
    public void updateRoomStatusCanDisableRoom() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "109",
                25,
                "Building A",
                "Room 1"
        ));

        roomDAO.updateRoomStatus(TEST_PREFIX + "109", false);

        Room stored = findRoom(TEST_PREFIX + "109");

        assertNotNull(stored);
        assertFalse(stored.isEnabled());
    }

    @Test
    public void updateRoomStatusCanEnableDisabledRoom() {
        Room room = new Room(
                TEST_PREFIX + "110",
                25,
                "Building A",
                "Room 2"
        );

        room.disable();
        roomDAO.insertRoom(room);
        roomDAO.updateRoomStatus(TEST_PREFIX + "110", true);

        Room stored = findRoom(TEST_PREFIX + "110");

        assertNotNull(stored);
        assertTrue(stored.isEnabled());
    }

    @Test
    public void getAllRoomsReturnsMultipleStoredRooms() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "111",
                10,
                "Building A",
                "Room 1"
        ));

        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "112",
                60,
                "Building B",
                "Room 2"
        ));

        assertNotNull(findRoom(TEST_PREFIX + "111"));
        assertNotNull(findRoom(TEST_PREFIX + "112"));
        assertEquals(2, countTestRooms());
    }

    @Test
    public void updatingUnknownRoomDoesNotCreateRecord() {
        roomDAO.updateRoomStatus(TEST_PREFIX + "UNKNOWN", true);

        assertNull(findRoom(TEST_PREFIX + "UNKNOWN"));
    }

    @Test
    public void getAllRoomsReturnsNonNullList() {
        List<Room> rooms = roomDAO.getAllRooms();

        assertNotNull(rooms);
    }

    @Test
    public void duplicateIdLeavesOnlyOneRecord() {
        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "113",
                20,
                "Building A",
                "Room 1"
        ));

        roomDAO.insertRoom(new Room(
                TEST_PREFIX + "113",
                80,
                "Building B",
                "Room 2"
        ));

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