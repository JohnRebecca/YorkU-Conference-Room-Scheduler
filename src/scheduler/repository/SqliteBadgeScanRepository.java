package scheduler.repository;

import scheduler.database.DatabaseManager;
import scheduler.sensor.BadgeScanRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * SQLite-backed storage for badge scans, using the same DatabaseManager as
 * the account/authentication module. The badge_scans table is created by
 * DatabaseManager.initializeDatabase().
 */
public class SqliteBadgeScanRepository implements BadgeScanRepository {

    private static final DateTimeFormatter ISO = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    @Override
    public void save(BadgeScanRecord record) {
        String sql = """
            INSERT INTO badge_scans (
                user_id, full_name, identification_number,
                room_id, booking_id, scanned_at, result
            )
            VALUES (?, ?, ?, ?, ?, ?, ?)
            """;

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, record.getUserId());
            statement.setString(2, record.getFullName());
            statement.setString(3, record.getIdentificationNumber());
            statement.setString(4, record.getRoomId());
            statement.setString(5, record.getBookingId());
            statement.setString(6, record.getScannedAt().format(ISO));
            statement.setString(7, record.getResult().name());
            statement.executeUpdate();

        } catch (SQLException exception) {
            throw new IllegalStateException("Could not save the badge scan.", exception);
        }
    }

    @Override
    public int countDistinctTappersForBooking(String bookingId, LocalDateTime since) {
        String sql = """
            SELECT COUNT(DISTINCT user_id) FROM badge_scans
            WHERE booking_id = ? AND scanned_at >= ?
            """;

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, bookingId);
            statement.setString(2, since.format(ISO));

            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() ? resultSet.getInt(1) : 0;
            }

        } catch (SQLException exception) {
            throw new IllegalStateException("Could not count badge scans.", exception);
        }
    }

    @Override
    public boolean hasTapped(String bookingId, String userId, LocalDateTime since) {
        String sql = """
            SELECT 1 FROM badge_scans
            WHERE booking_id = ? AND user_id = ? AND scanned_at >= ?
            LIMIT 1
            """;

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, bookingId);
            statement.setString(2, userId);
            statement.setString(3, since.format(ISO));

            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }

        } catch (SQLException exception) {
            throw new IllegalStateException("Could not look up badge scans.", exception);
        }
    }

    @Override
    public List<BadgeScanRecord> findRecent(int limit) {
        String sql = """
            SELECT user_id, full_name, identification_number,
                   room_id, booking_id, scanned_at, result
            FROM badge_scans
            ORDER BY scanned_at DESC, rowid DESC
            LIMIT ?
            """;

        List<BadgeScanRecord> records = new ArrayList<>();

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, limit);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    records.add(new BadgeScanRecord(
                            resultSet.getString("user_id"),
                            resultSet.getString("full_name"),
                            resultSet.getString("identification_number"),
                            resultSet.getString("room_id"),
                            resultSet.getString("booking_id"),
                            LocalDateTime.parse(resultSet.getString("scanned_at"), ISO),
                            BadgeScanRecord.Result.valueOf(resultSet.getString("result"))
                    ));
                }
            }

        } catch (SQLException exception) {
            throw new IllegalStateException("Could not load badge scans.", exception);
        }

        return records;
    }
}
