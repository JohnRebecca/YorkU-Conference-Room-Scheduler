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

public class RoomManagementFacadeAITest {

    private static final String TEST_PREFIX = "AI-RMF-";

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
    public void addingValidRoomStoresIt() {
        facade.addRoom(new Room(
                TEST_PREFIX + "101",
                30,
                "Lassonde",
                "First Floor"
        ));

        assertNotNull(findRoom(TEST_PREFIX + "101"));
    }

    @Test
    public void addedRoomPreservesCapacity() {
        facade.addRoom(new Room(
                TEST_PREFIX + "102",
                55,
                "Bergeron",
                "Second Floor"
        ));

        Room stored = findRoom(TEST_PREFIX + "102");

        assertNotNull(stored);
        assertEquals(55, stored.getCapacity());
    }

    @Test
    public void addedRoomPreservesBuilding() {
        facade.addRoom(new Room(
                TEST_PREFIX + "103",
                25,
                "Accolade East",
                "Room 201"
        ));

        Room stored = findRoom(TEST_PREFIX + "103");

        assertNotNull(stored);
        assertEquals("Accolade East", stored.getBuilding());
    }

    @Test
    public void addedRoomPreservesLocation() {
        facade.addRoom(new Room(
                TEST_PREFIX + "104",
                25,
                "Accolade West",
                "Main Floor"
        ));

        Room stored = findRoom(TEST_PREFIX + "104");

        assertNotNull(stored);
        assertEquals("Main Floor", stored.getLocation());
    }

    @Test
    public void invalidBlankRoomIdIsRejected() {
        facade.addRoom(new Room(
                "",
                20,
                "Lassonde",
                "First Floor"
        ));

        assertEquals(0, countTestRooms());
    }

    @Test
    public void invalidZeroCapacityRoomIsRejected() {
        facade.addRoom(new Room(
                TEST_PREFIX + "105",
                0,
                "Lassonde",
                "First Floor"
        ));

        assertNull(findRoom(TEST_PREFIX + "105"));
    }

    @Test
    public void disablingStoredRoomMakesItUnavailable() {
        facade.addRoom(new Room(
                TEST_PREFIX + "106",
                35,
                "Vari Hall",
                "Third Floor"
        ));

        facade.disableRoom(TEST_PREFIX + "106");

        Room stored = findRoom(TEST_PREFIX + "106");

        assertNotNull(stored);
        assertFalse(stored.isEnabled());
        assertFalse(stored.isAvailableForBooking());
    }

    @Test
    public void enablingDisabledRoomMakesItAvailable() {
        facade.addRoom(new Room(
                TEST_PREFIX + "107",
                35,
                "Vari Hall",
                "Fourth Floor"
        ));

        facade.disableRoom(TEST_PREFIX + "107");
        facade.enableRoom(TEST_PREFIX + "107");

        Room stored = findRoom(TEST_PREFIX + "107");

        assertNotNull(stored);
        assertTrue(stored.isEnabled());
        assertTrue(stored.isAvailableForBooking());
    }

    @Test
    public void closingRoomMakesItUnavailable() {
        facade.addRoom(new Room(
                TEST_PREFIX + "108",
                40,
                "Curtis Lecture Halls",
                "Room C"
        ));

        facade.closeRoom(TEST_PREFIX + "108");

        Room stored = findRoom(TEST_PREFIX + "108");

        assertNotNull(stored);
        assertFalse(stored.isEnabled());
        assertFalse(stored.isAvailableForBooking());
    }

    @Test
    public void multipleRoomsCanBeRetrieved() {
        facade.addRoom(new Room(
                TEST_PREFIX + "109",
                10,
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
    public void updatingUnknownRoomDoesNotCreateRecord() {
        facade.disableRoom(TEST_PREFIX + "UNKNOWN");

        assertNull(findRoom(TEST_PREFIX + "UNKNOWN"));
        assertEquals(0, countTestRooms());
    }

    @Test
    public void getAllRoomsReturnsNonNullList() {
        List<Room> rooms = facade.getAllRooms();

        assertNotNull(rooms);
    }

    private Room findRoom(String roomId) {
        for (Room room : facade.getAllRooms()) {
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