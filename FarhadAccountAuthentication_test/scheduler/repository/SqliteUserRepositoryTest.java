package scheduler.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.database.DatabaseManager;
import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;
import scheduler.util.PasswordHasher;

class SqliteUserRepositoryTest {

    private SqliteUserRepository userRepository;
    private SqliteAccountTypeRepository typeRepository;

    private String userId;
    private String email;
    private String accountTypeId;
    private AccountType accountType;

    @BeforeAll
    static void initializeDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @BeforeEach
    void setUp() {
        userRepository = new SqliteUserRepository();
        typeRepository = new SqliteAccountTypeRepository();

        String suffix = UUID.randomUUID().toString().substring(0, 8);
        userId = "test-user-" + suffix;
        email = "test-" + suffix + "@example.com";
        accountTypeId = "test-account-" + suffix;
        accountType = new AccountType( accountTypeId, "Test Account " + suffix, 22.5,VerificationMode.NONE);

        typeRepository.save(accountType);
    }

    @AfterEach
    void cleanUp() throws SQLException {
        try (Connection connection = DatabaseManager.getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE user_id = ?")) {
                statement.setString(1, userId);
                statement.executeUpdate();
            }

            try (PreparedStatement statement = connection.prepareStatement(
            		"DELETE FROM account_types WHERE account_type_id = ?")) {
                statement.setString(1, accountTypeId);
                statement.executeUpdate();
            }
        }
    }

    @Test
    void savesAndFindsUserById() {
        RegisteredUser expected = createUser(false, AccountStatus.PENDING_VERIFICATION);
        userRepository.save(expected);
        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertEquals(userId, result.getUserId());
        assertEquals(email, result.getEmail());
    }

    @Test
    void findsUserByEmailIgnoringCase() {
        userRepository.save(createUser(false, AccountStatus.PENDING_VERIFICATION));

        RegisteredUser result = userRepository.findByEmail(email.toUpperCase()).orElseThrow();
        assertEquals(userId, result.getUserId());
    }

    @Test
    void findByIdReturnsEmptyForMissingUser() {
        assertTrue(userRepository.findById(userId).isEmpty());
    }

    @Test
    void findByEmailReturnsEmptyForMissingUser() {
        assertTrue(userRepository.findByEmail(email).isEmpty());
    }

    @Test
    void emailExistsReturnsTrueForStoredUser() {
        userRepository.save(createUser(false, AccountStatus.PENDING_VERIFICATION));

        assertTrue(userRepository.emailExists(email));
    }

    @Test
    void emailExistsIgnoresCase() {
        userRepository.save(createUser(false, AccountStatus.PENDING_VERIFICATION));

        assertTrue(userRepository.emailExists(email.toUpperCase()));
    }

    @Test
    void emailExistsReturnsFalseForMissingUser() {
        assertFalse(userRepository.emailExists(email));
    }

    @Test
    void loadedUserPreservesFullNameAndIdentificationNumber() {
        userRepository.save(createUser(false, AccountStatus.PENDING_VERIFICATION));

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertEquals("Repository Test User", result.getFullName());
        assertEquals("TEST-ID-123", result.getIdentificationNumber());
    }

    @Test
    void loadedUserPreservesAccountType() {
        userRepository.save(createUser(false, AccountStatus.PENDING_VERIFICATION));

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertEquals(accountTypeId, result.getAccountType().getAccountTypeId());
        assertEquals(22.5, result.getHourlyRate());
    }

    @Test
    void loadedUserPreservesVerificationState() {
        userRepository.save(createUser(true, AccountStatus.ACTIVE));

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertTrue(result.isVerified());
        assertEquals(AccountStatus.ACTIVE, result.getAccountStatus());
    }

    @Test
    void loadedPasswordHashCanVerifyOriginalPassword() {
        userRepository.save(createUser(true, AccountStatus.ACTIVE));

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertTrue(result.verifyPassword("Strong1!"));
        assertFalse(result.verifyPassword("Wrong1!"));
    }

    @Test
    void loadedUserPreservesCreationTime() {
        LocalDateTime createdAt = LocalDateTime.of(2026, 8, 2, 10, 30, 15);
        RegisteredUser user = createUser(false, AccountStatus.PENDING_VERIFICATION, createdAt);
        userRepository.save(user);

        RegisteredUser result = userRepository.findById(userId).orElseThrow();
        assertEquals(createdAt, result.getCreatedAt());
    }

    @Test
    void savingDuplicateEmailThrowsIllegalStateException() {
        userRepository.save(createUser(false, AccountStatus.PENDING_VERIFICATION));

        RegisteredUser duplicate = new RegisteredUser(
                userId + "-two",
                "Duplicate User",
                email.toUpperCase(),
                PasswordHasher.hash("Another1!"),
                AccountStatus.PENDING_VERIFICATION,
                LocalDateTime.now(),
                "TEST-ID-456",
                false,
                accountType);

        try {
            assertThrows(IllegalStateException.class, () -> userRepository.save(duplicate));
        } finally {
            deleteUser(userId + "-two");
        }
    }
    
    @Test
    void updateProfileChangesStoredName() {
        RegisteredUser user = createUser(false, AccountStatus.PENDING_VERIFICATION);
        userRepository.save(user);

        userRepository.updateProfile(userId, "Updated Repository Name", user.getPasswordHash());
        RegisteredUser updated = userRepository.findById(userId).orElseThrow();

        assertEquals("Updated Repository Name", updated.getFullName());
    }

    @Test
    void updateProfileChangesStoredPassword() {
        RegisteredUser user = createUser(true, AccountStatus.ACTIVE);
        userRepository.save(user);

        String newPasswordHash = PasswordHasher.hash("Updated8#");

        userRepository.updateProfile(userId, user.getFullName(), newPasswordHash);
        RegisteredUser updated = userRepository.findById(userId).orElseThrow();

        assertTrue(updated.verifyPassword("Updated8#"));
        assertFalse(updated.verifyPassword("Strong1!"));
    }

    @Test
    void updateProfileChangesNameAndPasswordTogether() {
        RegisteredUser user = createUser(true, AccountStatus.ACTIVE);
        userRepository.save(user);
        String newPasswordHash = PasswordHasher.hash("Changed9$");

        userRepository.updateProfile(userId, "Completely Updated User", newPasswordHash);
        RegisteredUser updated = userRepository.findById(userId).orElseThrow();

        assertEquals("Completely Updated User", updated.getFullName());
        assertTrue(updated.verifyPassword("Changed9$"));
    }

    @Test
    void updateProfileThrowsWhenUserDoesNotExist() {
        String newPasswordHash = PasswordHasher.hash("Updated8#");

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> userRepository.updateProfile("missing-user-id", "Missing User", newPasswordHash));
        assertEquals("The user account could not be updated.", exception.getMessage());
    }

    private RegisteredUser createUser(boolean verified, AccountStatus status) {
        return createUser(verified, status, LocalDateTime.now().withNano(0));
    }

    private RegisteredUser createUser(boolean verified, AccountStatus status,LocalDateTime createdAt ) {
        return new RegisteredUser(
                userId,
                "Repository Test User",
                email,
                PasswordHasher.hash("Strong1!"),
                status,
                createdAt,
                "TEST-ID-123",
                verified,
                accountType
        );
    }

    private void deleteUser(String id) {
        String sql = "DELETE FROM users WHERE user_id = ?";

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