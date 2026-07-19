package scheduler.repository;

import scheduler.database.DatabaseManager;
import scheduler.model.Administrator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminDAO {

    public void insertAdmin(Administrator admin) {

        String sql = """
                INSERT INTO administrators
                (admin_id, name, email, password)
                VALUES (?, ?, ?, ?)
                """;

        try (
                Connection conn = DatabaseManager.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql)
        ) {

            statement.setInt(1, admin.getAdminID());
            statement.setString(2, admin.getName());
            statement.setString(3, admin.getEmail());
            statement.setString(4, admin.getPassword());

            statement.executeUpdate();

            System.out.println("Administrator inserted into database");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}