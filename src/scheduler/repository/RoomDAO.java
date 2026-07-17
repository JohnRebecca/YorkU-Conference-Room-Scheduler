package scheduler.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DatabaseConnection;
import scheduler.model.Room;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class RoomDAO {


    public void insertRoom(Room room) {

        String sql = "INSERT INTO rooms (room_id, building, location, capacity, status) VALUES (?, ?, ?, ?, ?)";


        try {

            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, room.getRoomID());
            statement.setString(2, room.getBuilding());
            statement.setString(3, room.getLocation());
            statement.setInt(4, room.getCapacity());
            statement.setString(5, room.getStatus());
            statement.executeUpdate();

            System.out.println("Room inserted into database");


        } catch(SQLException e) {

            e.printStackTrace();

        }

    }



    public void updateRoomStatus(int roomId, String status) {


        String sql = "UPDATE rooms SET status = ? WHERE room_id = ?";


        try {

            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);


            statement.setString(1, status);
            statement.setInt(2, roomId);
            statement.executeUpdate();

            System.out.println("Room status updated");


        } catch(SQLException e) {

            e.printStackTrace();

        }

    }
    
    public List<Room> getAllRooms() {


        List<Room> rooms = new ArrayList<>();


        try {

            Connection conn = DatabaseConnection.getConnection();


            String sql = "SELECT * FROM rooms";


            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();



            while(rs.next()) {

                Room room = new Room( rs.getInt("room_id"), rs.getString("building"), rs.getString("location"), rs.getInt("capacity"), rs.getString("status"));
                rooms.add(room);
            }



        } catch(Exception e) {

            e.printStackTrace();

        }


        return rooms;

    }

}