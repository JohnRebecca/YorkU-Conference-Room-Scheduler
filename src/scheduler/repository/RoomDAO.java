package scheduler.repository;

import scheduler.database.DatabaseManager;
import scheduler.model.Room;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

    public void insertRoom(Room room) {

        String sql = """
                INSERT INTO rooms
                (room_id, capacity, building, location, enabled, closed_for_maintenance)
                VALUES (?, ?, ?, ?, ?, ?)
                """;

        try (
                Connection conn = DatabaseManager.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql)
        ) {

            statement.setString(1, room.getRoomId());
            statement.setInt(2, room.getCapacity());
            statement.setString(3, room.getBuilding());
            statement.setString(4, room.getLocation());
            statement.setBoolean(5, room.isEnabled());
            statement.setBoolean(6, room.isClosedForMaintenance());

            statement.executeUpdate();

            System.out.println("Room inserted into database");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void updateRoomStatus(String roomId, boolean enabled) {

        String sql = """
                UPDATE rooms
                SET enabled = ?
                WHERE room_id = ?
                """;

        try (
                Connection conn = DatabaseManager.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql)
        ) {

            statement.setBoolean(1, enabled);
            statement.setString(2, roomId);

            statement.executeUpdate();

            System.out.println("Room status updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Room> getAllRooms() {

        List<Room> rooms = new ArrayList<>();

        String sql = "SELECT * FROM rooms";

        try (
                Connection conn = DatabaseManager.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet rs = statement.executeQuery()
        ) {

            while (rs.next()) {

                Room room = new Room(
                        rs.getString("room_id"),
                        rs.getInt("capacity"),
                        rs.getString("building"),
                        rs.getString("location")
                );

                if (!rs.getBoolean("enabled")) {
                    room.disable();
                }

                if (rs.getBoolean("closed_for_maintenance")) {
                    room.closeForMaintenance();
                }

                rooms.add(room);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rooms;
    }
}