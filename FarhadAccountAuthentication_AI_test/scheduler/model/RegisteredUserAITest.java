package scheduler.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.util.PasswordHasher;

class RegisteredUserAITest {

    private AccountType facultyType;
    private LocalDateTime creationTime;
    private RegisteredUser user;

    @BeforeEach
    void setUp() {
        facultyType = new AccountType(
                "faculty", "Faculty", 30.0, VerificationMode.UNIVERSITY
        );

        creationTime = LocalDateTime.of(2026, 7, 15, 9, 45);

        user = new RegisteredUser(
                "faculty-101",
                "Jamie Chen",
                "jamie@yorku.ca",
                PasswordHasher.hash("Faculty8#"),
                AccountStatus.PENDING_VERIFICATION,
                creationTime,
                "EMP-98765",
                false,
                facultyType
        );
    }

    @Test
    void newUserContainsExpectedAccountData() {
        assertAll(
                () -> assertEquals("faculty-101", user.getUserId()),
                () -> assertEquals("Jamie Chen", user.getFullName()),
                () -> assertEquals("jamie@yorku.ca", user.getEmail()),
                () -> assertEquals("EMP-98765", user.getIdentificationNumber()),
                () -> assertEquals(facultyType, user.getAccountType()),
                () -> assertEquals(creationTime, user.getCreatedAt())
        );
    }

    @Test
    void newPendingUserIsNeitherVerifiedNorActive() {
        assertFalse(user.isVerified());
        assertFalse(user.isActive());
        assertEquals(AccountStatus.PENDING_VERIFICATION, user.getAccountStatus());
    }

    @Test
    void markingUserVerifiedAlsoActivatesAccount() {
        user.markVerified();

        assertAll(
                () -> assertTrue(user.isVerified()),
                () -> assertTrue(user.isActive()),
                () -> assertEquals(AccountStatus.ACTIVE, user.getAccountStatus())
        );
    }

    @Test
    void repeatedVerificationDoesNotChangeActiveState() {
        user.markVerified();
        user.markVerified();

        assertTrue(user.isVerified());
        assertEquals(AccountStatus.ACTIVE, user.getAccountStatus());
    }

    @Test
    void hourlyRateComesFromAssignedAccountType() {
        assertEquals(30.0, user.getHourlyRate());
    }

    @Test
    void originalPasswordCanBeVerified() {
        assertTrue(user.verifyPassword("Faculty8#"));
    }

    @Test
    void passwordVerificationIsCaseSensitive() {
        assertFalse(user.verifyPassword("faculty8#"));
    }

    @Test
    void replacingPasswordHashChangesAcceptedPassword() {
        user.updatePasswordHash(PasswordHasher.hash("Updated9!"));

        assertFalse(user.verifyPassword("Faculty8#"));
        assertTrue(user.verifyPassword("Updated9!"));
    }

    @Test
    void updatingNamePreservesOtherUserInformation() {
        String originalId = user.getUserId();
        String originalEmail = user.getEmail();

        user.updateProfile("Jamie C. Chen");

        assertEquals("Jamie C. Chen", user.getFullName());
        assertEquals(originalId, user.getUserId());
        assertEquals(originalEmail, user.getEmail());
    }

    @Test
    void profileNameIsTrimmedWhenUpdated() {
        user.updateProfile("   Jamie Chen-Smith   ");

        assertEquals("Jamie Chen-Smith", user.getFullName());
    }

    @Test
    void blankProfileNameIsRejectedWithoutChangingCurrentName() {
        assertThrows(IllegalArgumentException.class, () -> user.updateProfile("   "));

        assertEquals("Jamie Chen", user.getFullName());
    }

    @Test
    void nullPasswordHashUpdateIsRejected() {
        assertThrows(
                IllegalArgumentException.class,
                () -> user.updatePasswordHash(null)
        );
    }

    @Test
    void blankPasswordHashUpdateIsRejected() {
        assertThrows(
                IllegalArgumentException.class,
                () -> user.updatePasswordHash(" ")
        );
    }

    @Test
    void identificationNumberIsTrimmedDuringConstruction() {
        RegisteredUser trimmedUser = new RegisteredUser(
                "faculty-102",
                "Taylor Morgan",
                "taylor@yorku.ca",
                PasswordHasher.hash("Taylor12!"),
                AccountStatus.PENDING_VERIFICATION,
                creationTime,
                "  EMP-10000  ",
                false,
                facultyType
        );

        assertEquals("EMP-10000", trimmedUser.getIdentificationNumber());
    }

    @Test
    void missingIdentificationNumberIsRejected() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new RegisteredUser(
                        "faculty-102",
                        "Taylor Morgan",
                        "taylor@yorku.ca",
                        PasswordHasher.hash("Taylor12!"),
                        AccountStatus.PENDING_VERIFICATION,
                        creationTime,
                        null,
                        false,
                        facultyType
                )
        );
    }

    @Test
    void missingAccountTypeIsRejected() {
        assertThrows(
                NullPointerException.class,
                () -> new RegisteredUser(
                        "faculty-102",
                        "Taylor Morgan",
                        "taylor@yorku.ca",
                        PasswordHasher.hash("Taylor12!"),
                        AccountStatus.PENDING_VERIFICATION,
                        creationTime,
                        "EMP-10000",
                        false,
                        null
                )
        );
    }
}