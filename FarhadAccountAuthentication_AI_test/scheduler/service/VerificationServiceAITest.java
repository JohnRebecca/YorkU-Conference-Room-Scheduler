package scheduler.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;
import scheduler.util.PasswordHasher;

class VerificationServiceAITest {

    private VerificationService verificationService;

    @BeforeEach
    void setUp() {
        verificationService = new VerificationService();
    }

    @Test
    void acceptsYorkEmployeeAccount() {
        RegisteredUser user = createUser(
                "employee@yorku.ca", "EMP-55321", VerificationMode.UNIVERSITY
        );

        assertTrue(verificationService.verify(user));
    }

    @Test
    void acceptsYorkStudentAccount() {
        RegisteredUser user = createUser(
                "learner@my.yorku.ca", "217456789", VerificationMode.UNIVERSITY
        );

        assertTrue(verificationService.verify(user));
    }

    @Test
    void rejectsUniversityAccountUsingPersonalEmail() {
        RegisteredUser user = createUser(
                "learner@gmail.com", "217456789", VerificationMode.UNIVERSITY
        );

        assertFalse(verificationService.verify(user));
    }

    @Test
    void acceptsUniversityIdAtMinimumLength() {
        RegisteredUser user = createUser(
                "learner@my.yorku.ca", "A1-BC", VerificationMode.UNIVERSITY
        );

        assertTrue(verificationService.verifyUniversityAccount(user));
    }

    @Test
    void rejectsUniversityIdBelowMinimumLength() {
        RegisteredUser user = createUser(
                "learner@my.yorku.ca", "A1-B", VerificationMode.UNIVERSITY
        );

        assertFalse(verificationService.verifyUniversityAccount(user));
    }

    @Test
    void acceptsUniversityIdAtMaximumLength() {
        RegisteredUser user = createUser(
                "employee@yorku.ca", "A".repeat(20), VerificationMode.UNIVERSITY
        );

        assertTrue(verificationService.verifyUniversityAccount(user));
    }

    @Test
    void rejectsUniversityIdAboveMaximumLength() {
        RegisteredUser user = createUser(
                "employee@yorku.ca", "A".repeat(21), VerificationMode.UNIVERSITY
        );

        assertFalse(verificationService.verifyUniversityAccount(user));
    }

    @Test
    void acceptsLowercasePartnerPrefix() {
        RegisteredUser user = createUser(
                "contact@business.ca", "org-xy123", VerificationMode.PARTNER
        );

        assertTrue(verificationService.verify(user));
    }

    @Test
    void rejectsPartnerIdContainingSymbols() {
        RegisteredUser user = createUser(
                "contact@business.ca", "ORG-ABC@12", VerificationMode.PARTNER
        );

        assertFalse(verificationService.verifyPartnerAccount(user));
    }

    @Test
    void noneModeAlwaysPassesVerification() {
        RegisteredUser user = createUser(
                "visitor@example.com", "UNUSED-ID", VerificationMode.NONE
        );

        assertTrue(verificationService.verify(user));
    }

    @Test
    void returnsExpectedUniversityDescription() {
        AccountType type = createType(VerificationMode.UNIVERSITY);

        assertEquals(
                "a York email and valid student/employee ID",
                verificationService.expectedIdentificationDescription(type)
        );
    }

    @Test
    void returnsExpectedPartnerDescription() {
        AccountType type = createType(VerificationMode.PARTNER);

        assertEquals(
                "an organization ID in the form ORG-XXXX",
                verificationService.expectedIdentificationDescription(type)
        );
    }

    @Test
    void returnsExpectedNoneDescription() {
        AccountType type = createType(VerificationMode.NONE);

        assertEquals(
                "no additional verification",
                verificationService.expectedIdentificationDescription(type)
        );
    }

    private RegisteredUser createUser(
            String email, String identificationNumber, VerificationMode mode
    ) {
        return new RegisteredUser(
                "verify-user",
                "Verification User",
                email,
                PasswordHasher.hash("Verify88!"),
                AccountStatus.PENDING_VERIFICATION,
                LocalDateTime.now(),
                identificationNumber,
                false,
                createType(mode)
        );
    }

    private AccountType createType(VerificationMode mode) {
        return new AccountType(
                "type-" + mode.name().toLowerCase(),
                mode.name(),
                25.0,
                mode
        );
    }
}