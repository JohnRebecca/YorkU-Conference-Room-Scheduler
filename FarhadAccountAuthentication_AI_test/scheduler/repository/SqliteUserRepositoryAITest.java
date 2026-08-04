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

class SqliteUserRepositoryAITest {

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
        userId = "ai-user-" + suffix;
        email = "ai-user-" + suffix + "@example.com";
        accountTypeId = "ai-account-" + suffix;

        accountType = new AccountType(
                accountTypeId,
                "AI Account " + suffix,
                18.25,
                VerificationMode.NONE
        );

        typeRepository.save(accountType);
    }

    @AfterEach
    void cleanDatabaseRecords() {
        deleteUser(userId);
        deleteUser(userId + "-second");
        deleteAccountType(accountTypeId);
    }

    @Test
    void saveMakesUserAvailableById() {
        userRepository.save(createUser());

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertEquals(userId, result.getUserId());
    }

    @Test
    void saveMakesUserAvailableByEmail() {
        userRepository.save(createUser());

        RegisteredUser result = userRepository.findByEmail(email).orElseThrow();

        assertEquals(email, result.getEmail());
    }

    @Test
    void emailLookupIgnoresLetterCase() {
        userRepository.save(createUser());

        assertTrue(userRepository.findByEmail(email.toUpperCase()).isPresent());
    }

    @Test
    void unknownUserIdReturnsEmptyOptional() {
        assertTrue(userRepository.findById(userId).isEmpty());
    }

    @Test
    void unknownEmailReturnsEmptyOptional() {
        assertTrue(userRepository.findByEmail(email).isEmpty());
    }

    @Test
    void emailExistsChangesAfterUserIsStored() {
        assertFalse(userRepository.emailExists(email));

        userRepository.save(createUser());

        assertTrue(userRepository.emailExists(email));
    }

    @Test
    void mappedUserPreservesAccountInformation() {
        userRepository.save(createUser());

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertEquals(accountTypeId, result.getAccountType().getAccountTypeId());
        assertEquals(18.25, result.getHourlyRate());
        assertEquals(VerificationMode.NONE, result.getAccountType().getVerificationMode());
    }

    @Test
    void mappedUserPreservesVerificationAndStatus() {
        RegisteredUser activeUser = createUser(true, AccountStatus.ACTIVE);
        userRepository.save(activeUser);

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertTrue(result.isVerified());
        assertEquals(AccountStatus.ACTIVE, result.getAccountStatus());
    }

    @Test
    void mappedPasswordHashStillVerifiesPassword() {
        userRepository.save(createUser());

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertTrue(result.verifyPassword("Repository7!"));
        assertFalse(result.verifyPassword("Incorrect7!"));
    }

    @Test
    void profileUpdateChangesStoredFullName() {
        userRepository.save(createUser());

        userRepository.updateProfile(
                userId,
                "Updated Repository User",
                createUser().getPasswordHash()
        );

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertEquals("Updated Repository User", result.getFullName());
    }

    @Test
    void profileUpdateChangesStoredPasswordHash() {
        userRepository.save(createUser());
        String newHash = PasswordHasher.hash("Changed8#");

        userRepository.updateProfile(userId, "AI Repository User", newHash);

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertTrue(result.verifyPassword("Changed8#"));
        assertFalse(result.verifyPassword("Repository7!"));
    }

    @Test
    void profileUpdateCanChangeNameAndPasswordTogether() {
        userRepository.save(createUser());
        String newHash = PasswordHasher.hash("Changed8#");

        userRepository.updateProfile(userId, "Combined Update", newHash);

        RegisteredUser result = userRepository.findById(userId).orElseThrow();

        assertEquals("Combined Update", result.getFullName());
        assertTrue(result.verifyPassword("Changed8#"));
    }

    @Test
    void updatingMissingUserThrowsIllegalStateException() {
        String newHash = PasswordHasher.hash("Changed8#");

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> userRepository.updateProfile(
                        "missing-user",
                        "Missing User",
                        newHash
                )
        );

        assertEquals(
                "The user account could not be updated.",
                exception.getMessage()
        );
    }
    
    @Test
    void duplicateEmailCannotBeInserted() {
        userRepository.save(createUser());

        RegisteredUser second = new RegisteredUser(
                userId + "-second",
                "Second User",
                email.toUpperCase(),
                PasswordHasher.hash("Second8#"),
                AccountStatus.PENDING_VERIFICATION,
                LocalDateTime.now(),
                "SECOND-ID",
                false,
                accountType
        );

        assertThrows(IllegalStateException.class, () -> userRepository.save(second));
    }

    private RegisteredUser createUser() {
        return createUser(false, AccountStatus.PENDING_VERIFICATION);
    }

    private RegisteredUser createUser(boolean verified, AccountStatus status) {
        return new RegisteredUser(
                userId,
                "AI Repository User",
                email,
                PasswordHasher.hash("Repository7!"),
                status,
                LocalDateTime.now().withNano(0),
                "AI-ID-7788",
                verified,
                accountType
        );
    }

    private void deleteUser(String id) {
        executeDelete("DELETE FROM users WHERE user_id = ?", id);
    }

    private void deleteAccountType(String id) {
        executeDelete("DELETE FROM account_types WHERE account_type_id = ?", id);
    }

    private void executeDelete(String sql, String value) {
        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, value);
            statement.executeUpdate();
        } catch (SQLException exception) {
            throw new IllegalStateException("AI test cleanup failed.", exception);
        }
    }
}