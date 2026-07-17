package scheduler.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DatabaseConnection;
import scheduler.model.Administrator;


public class AdminDAO {


    public void insertAdmin(Administrator admin) {


        String sql = "INSERT INTO administrators (admin_id, name, email, password) VALUES (?, ?, ?, ?)";


        try {

            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setInt(1, admin.getAdminID());
            statement.setString(2, admin.getName());
            statement.setString(3, admin.getEmail());
            statement.setString(4, admin.getPassword());
            statement.executeUpdate();

            System.out.println("Administrator inserted into database");

        } catch(SQLException e) {

            e.printStackTrace();

        }

    }

}