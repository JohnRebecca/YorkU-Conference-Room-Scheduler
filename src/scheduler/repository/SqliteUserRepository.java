package scheduler.repository;

import scheduler.database.DatabaseManager;
import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.Optional;

public final class SqliteUserRepository implements UserRepository {

    @Override
    public void save(RegisteredUser user) {
        String sql = """
            INSERT INTO users (
                user_id,
                full_name,
                email,
                password_hash,
                account_status,
                created_at,
                identification_number,
                is_verified,
                account_type_id
            )
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
            """;

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, user.getUserId());
            statement.setString(2, user.getFullName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPasswordHash());
            statement.setString(5, user.getAccountStatus().name());
            statement.setString(6, user.getCreatedAt().toString());
            statement.setString(7, user.getIdentificationNumber());
            statement.setInt(8, user.isVerified() ? 1 : 0);
            statement.setString(9, user.getAccountType().getAccountTypeId());

            statement.executeUpdate();

        } catch (SQLException exception) {
            throw new IllegalStateException(
                    "Could not save the user account.",
                    exception
            );
        }
    }

    @Override
    public Optional<RegisteredUser> findByEmail(String email) {
        String sql = baseSelect() + " WHERE u.email = ? COLLATE NOCASE";

        return findOne(sql, email);
    }

    @Override
    public Optional<RegisteredUser> findById(String userId) {
        String sql = baseSelect() + " WHERE u.user_id = ?";

        return findOne(sql, userId);
    }

    @Override
    public boolean emailExists(String email) {
        String sql = """
            SELECT 1
            FROM users
            WHERE email = ? COLLATE NOCASE
            LIMIT 1
            """;

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, email);

            try (ResultSet result = statement.executeQuery()) {
                return result.next();
            }

        } catch (SQLException exception) {
            throw new IllegalStateException(
                    "Could not check the email address.",
                    exception
            );
        }
    }
    
    @Override
    public void updateProfile( String userId, String fullName, String passwordHash ) {
        String sql = """
            UPDATE users
            SET full_name = ?,
                password_hash = ?
            WHERE user_id = ?
            """;

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, fullName);
            statement.setString(2, passwordHash);
            statement.setString(3, userId);

            int affectedRows = statement.executeUpdate();

            if (affectedRows != 1) {
                throw new IllegalStateException( "The user account could not be updated." );
            }

        } catch (SQLException exception) {
            throw new IllegalStateException( "Could not update the user profile.", exception );
        }
    }

    private Optional<RegisteredUser> findOne(
            String sql,
            String parameter
    ) {
        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            if (parameter == null) {
                statement.setNull(1, Types.VARCHAR);
            } else {
                statement.setString(1, parameter);
            }

            try (ResultSet result = statement.executeQuery()) {
                if (!result.next()) {
                    return Optional.empty();
                }

                return Optional.of(map(result));
            }

        } catch (SQLException exception) {
            throw new IllegalStateException(
                    "Could not load the user account.",
                    exception
            );
        }
    }

    private String baseSelect() {
        return """
            SELECT
                u.user_id,
                u.full_name,
                u.email,
                u.password_hash,
                u.account_status,
                u.created_at,
                u.identification_number,
                u.is_verified,
                a.account_type_id,
                a.name AS account_type_name,
                a.hourly_rate,
                a.verification_mode
            FROM users u
            JOIN account_types a
              ON a.account_type_id = u.account_type_id
            """;
    }

    private RegisteredUser map(ResultSet result) throws SQLException {
        AccountType accountType = new AccountType(
                result.getString("account_type_id"),
                result.getString("account_type_name"),
                result.getDouble("hourly_rate"),
                VerificationMode.valueOf(result.getString("verification_mode"))
        );

        return new RegisteredUser(
                result.getString("user_id"),
                result.getString("full_name"),
                result.getString("email"),
                result.getString("password_hash"),
                AccountStatus.valueOf(result.getString("account_status")),
                LocalDateTime.parse(result.getString("created_at")),
                result.getString("identification_number"),
                result.getInt("is_verified") == 1,
                accountType
        );
    }
}