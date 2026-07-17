package scheduler.repository;

import scheduler.database.DatabaseManager;
import scheduler.model.AccountType;
import scheduler.model.VerificationMode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class SqliteAccountTypeRepository
        implements AccountTypeRepository {

    @Override
    public Optional<AccountType> findById(String accountTypeId) {
        String sql = """
            SELECT account_type_id, name, hourly_rate, verification_mode
            FROM account_types
            WHERE account_type_id = ?
            """;

        return findOne(sql, accountTypeId);
    }

    @Override
    public Optional<AccountType> findByName(String name) {
        String sql = """
            SELECT account_type_id, name, hourly_rate, verification_mode
            FROM account_types
            WHERE name = ? COLLATE NOCASE
            """;

        return findOne(sql, name);
    }

    @Override
    public List<AccountType> findAll() {
        String sql = """
            SELECT account_type_id, name, hourly_rate, verification_mode
            FROM account_types
            ORDER BY hourly_rate, name
            """;

        List<AccountType> accountTypes = new ArrayList<>();

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery()
        ) {
            while (result.next()) {
                accountTypes.add(map(result));
            }

            return accountTypes;

        } catch (SQLException exception) {
            throw new IllegalStateException("Could not load account types.", exception );
        }
    }

    @Override
    public void save(AccountType accountType) {
        String sql = """
            INSERT INTO account_types (
                account_type_id,
                name,
                hourly_rate,
                verification_mode
            )
            VALUES (?, ?, ?, ?)
            """;

        try (
             Connection connection = DatabaseManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString( 1, accountType.getAccountTypeId());
            statement.setString( 2, accountType.getName());
            statement.setDouble( 3, accountType.getHourlyRate());
            statement.setString( 4, accountType.getVerificationMode().name());
            statement.executeUpdate();

        } catch (SQLException exception) {
            throw new IllegalStateException("Could not save the account type.", exception);
        }
    }

    @Override
    public boolean existsById(String accountTypeId) {
        String sql = """
            SELECT 1
            FROM account_types
            WHERE account_type_id = ?
            LIMIT 1
            """;

        return exists(sql, accountTypeId);
    }

    @Override
    public boolean existsByName(String name) {
        String sql = """
            SELECT 1
            FROM account_types
            WHERE name = ? COLLATE NOCASE
            LIMIT 1
            """;

        return exists(sql, name);
    }

    private boolean exists(String sql, String value) {
        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, value);

            try (ResultSet result = statement.executeQuery()) {
                return result.next();
            }

        } catch (SQLException exception) {
            throw new IllegalStateException("Could not check account type.", exception);
        }
    }

    private Optional<AccountType> findOne(String sql, String parameter) {
        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, parameter);

            try (ResultSet result = statement.executeQuery()) {
                if (!result.next()) {
                    return Optional.empty();
                }

                return Optional.of(map(result));
            }

        } catch (SQLException exception) {
            throw new IllegalStateException(
                    "Could not load account type.",
                    exception
            );
        }
    }

    private AccountType map(ResultSet result)
            throws SQLException {

        return new AccountType(
                result.getString("account_type_id"),
                result.getString("name"),
                result.getDouble("hourly_rate"),
                VerificationMode.valueOf( result.getString("verification_mode"))
        );
    }
}