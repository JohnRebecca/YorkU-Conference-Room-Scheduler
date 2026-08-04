package scheduler.factory;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;

class RegisteredUserFactoryAITest {

    private RegisteredUserFactory factory;
    private AccountType staffType;

    @BeforeEach
    void setUp() {
        factory = new RegisteredUserFactory();
        staffType = new AccountType(
                "staff", "Staff", 40.0, VerificationMode.UNIVERSITY
        );
    }

    @Test
    void createsRegisteredUserWithSuppliedInformation() {
        RegisteredUser user = factory.createUser(
                "Morgan Lee",
                "morgan@yorku.ca",
                "Staff123!",
                "EMP-44556",
                staffType
        );

        assertAll(
                () -> assertEquals("Morgan Lee", user.getFullName()),
                () -> assertEquals("morgan@yorku.ca", user.getEmail()),
                () -> assertEquals("EMP-44556", user.getIdentificationNumber()),
                () -> assertSame(staffType, user.getAccountType())
        );
    }

    @Test
    void factoryCreatesPendingUnverifiedAccount() {
        RegisteredUser user = createStaffUser();

        assertFalse(user.isVerified());
        assertFalse(user.isActive());
        assertEquals(AccountStatus.PENDING_VERIFICATION, user.getAccountStatus());
    }

    @Test
    void generatedUserIdIsValidUuid() {
        RegisteredUser user = createStaffUser();

        assertDoesNotThrow(() -> UUID.fromString(user.getUserId()));
    }

    @Test
    void separateFactoryCallsProduceDifferentIds() {
        RegisteredUser first = createStaffUser();

        RegisteredUser second = factory.createUser(
                "Second Staff",
                "second@yorku.ca",
                "Second12!",
                "EMP-99887",
                staffType
        );

        assertNotEquals(first.getUserId(), second.getUserId());
    }

    @Test
    void creationTimeIsCloseToCurrentTime() {
        LocalDateTime before = LocalDateTime.now();
        RegisteredUser user = createStaffUser();
        LocalDateTime after = LocalDateTime.now();

        assertFalse(user.getCreatedAt().isBefore(before));
        assertFalse(user.getCreatedAt().isAfter(after));
    }

    @Test
    void createdPasswordIsStoredAsHash() {
        RegisteredUser user = createStaffUser();

        assertNotEquals("Staff123!", user.getPasswordHash());
        assertTrue(user.verifyPassword("Staff123!"));
    }

    @Test
    void samePasswordIsSaltedDifferentlyForDifferentUsers() {
        RegisteredUser first = createStaffUser();

        RegisteredUser second = factory.createUser(
                "Another Staff",
                "another@yorku.ca",
                "Staff123!",
                "EMP-77665",
                staffType
        );

        assertNotEquals(first.getPasswordHash(), second.getPasswordHash());
        assertTrue(first.verifyPassword("Staff123!"));
        assertTrue(second.verifyPassword("Staff123!"));
    }

    @Test
    void generatedAccountIsNotOlderThanOneSecond() {
        RegisteredUser user = createStaffUser();
        Duration age = Duration.between(user.getCreatedAt(), LocalDateTime.now());

        assertTrue(age.toMillis() >= 0);
        assertTrue(age.toSeconds() <= 1);
    }

    @Test
    void invalidFullNameIsRejectedByCreatedUser() {
        assertThrows(
                IllegalArgumentException.class,
                () -> factory.createUser(
                        " ",
                        "staff@yorku.ca",
                        "Staff123!",
                        "EMP-44556",
                        staffType
                )
        );
    }

    @Test
    void nullAccountTypeIsRejectedDuringCreation() {
        assertThrows(
                NullPointerException.class,
                () -> factory.createUser(
                        "Morgan Lee",
                        "morgan@yorku.ca",
                        "Staff123!",
                        "EMP-44556",
                        null
                )
        );
    }

    @Test
    void nullPasswordIsRejectedBeforeObjectCreation() {
        assertThrows(
                IllegalArgumentException.class,
                () -> factory.createUser(
                        "Morgan Lee",
                        "morgan@yorku.ca",
                        null,
                        "EMP-44556",
                        staffType
                )
        );
    }

    private RegisteredUser createStaffUser() {
        return factory.createUser(
                "Morgan Lee",
                "morgan@yorku.ca",
                "Staff123!",
                "EMP-44556",
                staffType
        );
    }
}