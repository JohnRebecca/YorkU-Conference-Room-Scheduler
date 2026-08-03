package scheduler.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.util.PasswordHasher;

class RegisteredUserTest {

    private AccountType studentType;
    private LocalDateTime createdAt;
    private String passwordHash;

    @BeforeEach
    void setUp() {
        studentType = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);
        createdAt = LocalDateTime.of(2026, 8, 1, 12, 30);
        passwordHash = PasswordHasher.hash("Strong1!");
    }

    @Test
    void constructorStoresUserInformation() {
        RegisteredUser user = createUser(false);

        assertEquals("user-1", user.getUserId());
        assertEquals("Farhad Rasoli", user.getFullName());
        assertEquals("student@my.yorku.ca", user.getEmail());
        assertEquals(passwordHash, user.getPasswordHash());
        assertEquals(AccountStatus.PENDING_VERIFICATION, user.getAccountStatus());
        assertEquals(createdAt, user.getCreatedAt());
        assertEquals("216123456", user.getIdentificationNumber());
        assertFalse(user.isVerified());
        assertEquals(studentType, user.getAccountType());
    }

    @Test
    void constructorTrimsIdentificationNumber() {
        RegisteredUser user = new RegisteredUser(
                "user-1",
                "Farhad Rasoli",
                "student@my.yorku.ca",
                passwordHash,
                AccountStatus.PENDING_VERIFICATION,
                createdAt,
                "  216123456  ",
                false,
                studentType);

        assertEquals("216123456", user.getIdentificationNumber());
    }

    @Test
    void constructorRejectsNullIdentificationNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> new RegisteredUser(
                        "user-1",
                        "Farhad Rasoli",
                        "student@my.yorku.ca",
                        passwordHash,
                        AccountStatus.PENDING_VERIFICATION,
                        createdAt,
                        null,
                        false,
                        studentType
                ));
    }

    @Test
    void constructorRejectsBlankIdentificationNumber() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new RegisteredUser(
                        "user-1",
                        "Farhad Rasoli",
                        "student@my.yorku.ca",
                        passwordHash,
                        AccountStatus.PENDING_VERIFICATION,
                        createdAt,
                        "   ",
                        false,
                        studentType
                ));
        assertEquals("Student, employee, or organization ID is required.", exception.getMessage());
    }

    @Test
    void constructorRejectsNullAccountType() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> new RegisteredUser(
                        "user-1",
                        "Farhad Rasoli",
                        "student@my.yorku.ca",
                        passwordHash,
                        AccountStatus.PENDING_VERIFICATION,
                        createdAt,
                        "216123456",
                        false,
                        null
                ));

        assertEquals("Account type is required.", exception.getMessage());
    }

    @Test
    void markVerifiedChangesVerificationFlag() {
        RegisteredUser user = createUser(false);
        user.markVerified();

        assertTrue(user.isVerified());
    }

    @Test
    void markVerifiedChangesAccountStatusToActive() {
        RegisteredUser user = createUser(false);
        user.markVerified();

        assertEquals(AccountStatus.ACTIVE, user.getAccountStatus());
    }

    @Test
    void activeVerifiedUserIsActive() {
        RegisteredUser user = createUser(false);
        user.markVerified();

        assertTrue(user.isActive());
    }

    @Test
    void pendingUserIsNotActive() {
        RegisteredUser user = createUser(false);

        assertFalse(user.isActive());
    }

    @Test
    void getHourlyRateReturnsAccountTypeRate() {
        RegisteredUser user = createUser(false);

        assertEquals(20.0, user.getHourlyRate());
    }

    @Test
    void verifyPasswordReturnsTrueForCorrectPassword() {
        RegisteredUser user = createUser(false);

        assertTrue(user.verifyPassword("Strong1!"));
    }

    @Test
    void verifyPasswordReturnsFalseForIncorrectPassword() {
        RegisteredUser user = createUser(false);

        assertFalse(user.verifyPassword("Wrong1!"));
    }

    @Test
    void updateProfileChangesFullName() {
        RegisteredUser user = createUser(false);

        user.updateProfile("Updated Name");

        assertEquals("Updated Name", user.getFullName());
    }

    @Test
    void updateProfileTrimsFullName() {
        RegisteredUser user = createUser(false);

        user.updateProfile("  Updated Name  ");

        assertEquals("Updated Name", user.getFullName());
    }

    @Test
    void updateProfileRejectsNullName() {
        RegisteredUser user = createUser(false);

        assertThrows(IllegalArgumentException.class, () -> user.updateProfile(null));
    }

    @Test
    void updateProfileRejectsBlankName() {
        RegisteredUser user = createUser(false);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> user.updateProfile(" ")
        );

        assertEquals("Full name is required.", exception.getMessage());
    }

    @Test
    void constructorAcceptsAlreadyVerifiedUser() {
        RegisteredUser user = createUser(true);

        assertTrue(user.isVerified());
    }

    @Test
    void markVerifiedMayBeCalledMoreThanOnce() {
        RegisteredUser user = createUser(false);

        user.markVerified();
        user.markVerified();

        assertTrue(user.isVerified());
        assertEquals(AccountStatus.ACTIVE, user.getAccountStatus());
    }

    private RegisteredUser createUser(boolean verified) {
        return new RegisteredUser(
                "user-1",
                "Farhad Rasoli",
                "student@my.yorku.ca",
                passwordHash,
                AccountStatus.PENDING_VERIFICATION,
                createdAt,
                "216123456",
                verified,
                studentType
        );
    }
}