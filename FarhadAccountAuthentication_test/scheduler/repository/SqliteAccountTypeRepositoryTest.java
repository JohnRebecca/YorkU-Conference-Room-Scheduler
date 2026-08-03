package scheduler.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.database.DatabaseManager;
import scheduler.model.AccountType;
import scheduler.model.VerificationMode;

class SqliteAccountTypeRepositoryTest {

    private SqliteAccountTypeRepository repository;
    private String testId;
    private String testName;

    @BeforeAll
    static void initializeDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @BeforeEach
    void setUp() {
        repository = new SqliteAccountTypeRepository();

        String suffix = UUID.randomUUID().toString().substring(0, 8);
        testId = "test-type-" + suffix;
        testName = "Test Type " + suffix;
    }

    @AfterEach
    void cleanUp() throws SQLException {
        String sql = "DELETE FROM account_types WHERE account_type_id = ?";

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, testId);
            statement.executeUpdate();
        }
    }

    @Test
    void savesAndFindsAccountTypeById() {
        AccountType type = createType();
        repository.save(type);

        AccountType result = repository.findById(testId).orElseThrow();

        assertEquals(type, result);
        assertEquals(testName, result.getName());
    }

    @Test
    void findsAccountTypeByNameIgnoringCase() {
        repository.save(createType());

        AccountType result = repository.findByName(testName.toUpperCase()).orElseThrow();
        assertEquals(testId, result.getAccountTypeId());
    }

    @Test
    void findByIdReturnsEmptyForMissingType() {
        assertTrue(repository.findById(testId).isEmpty());
    }

    @Test
    void findByNameReturnsEmptyForMissingType() {
        assertTrue(repository.findByName(testName).isEmpty());
    }

    @Test
    void existsByIdReturnsTrueForStoredType() {
        repository.save(createType());
        assertTrue(repository.existsById(testId));
    }

    @Test
    void existsByIdReturnsFalseForMissingType() {
        assertFalse(repository.existsById(testId));
    }

    @Test
    void existsByNameIgnoresCase() {
        repository.save(createType());
        assertTrue(repository.existsByName(testName.toLowerCase()));
    }

    @Test
    void existsByNameReturnsFalseForMissingType() {
        assertFalse(repository.existsByName(testName));
    }

    @Test
    void findAllIncludesSavedType() {
        repository.save(createType());
        List<AccountType> result = repository.findAll();

        assertTrue(result.stream().anyMatch(type -> type.getAccountTypeId().equals(testId)));
    }

    @Test
    void storedTypePreservesRateAndVerificationMode() {
        repository.save(createType());
        AccountType result = repository.findById(testId).orElseThrow();

        assertEquals(27.5, result.getHourlyRate());
        assertEquals(VerificationMode.NONE, result.getVerificationMode());
    }

    @Test
    void savingDuplicateIdThrowsIllegalStateException() {
        repository.save(createType());
        assertThrows(IllegalStateException.class, () -> repository.save(
                new AccountType(testId, testName + " Duplicate", 40.0, VerificationMode.PARTNER)));
    }

    @Test
    void savingDuplicateNameThrowsIllegalStateException() {
        repository.save(createType());
        String secondId = testId + "-two";

        try {
            assertThrows(IllegalStateException.class, () -> repository.save(
                    new AccountType(secondId, testName.toUpperCase(), 40.0, VerificationMode.PARTNER)));
        } finally {
            deleteType(secondId);
        }
    }

    private AccountType createType() {
        return new AccountType(testId, testName, 27.5, VerificationMode.NONE);
    }

    private void deleteType(String id) {
        String sql = "DELETE FROM account_types WHERE account_type_id = ?";

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            throw new IllegalStateException("Test cleanup failed.", exception);
        }
    }
}