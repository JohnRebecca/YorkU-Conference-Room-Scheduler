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

class VerificationServiceTest {

    private VerificationService service;

    @BeforeEach
    void setUp() {
        service = new VerificationService();
    }

    @Test
    void verifiesUniversityAccountWithYorkEmail() {
        RegisteredUser user = createUser("faculty@yorku.ca", "EMP-12345", VerificationMode.UNIVERSITY);
        assertTrue(service.verify(user));
    }

    @Test
    void verifiesUniversityAccountWithStudentEmail() {
        RegisteredUser user = createUser("student@my.yorku.ca", "216123456", VerificationMode.UNIVERSITY);
        assertTrue(service.verify(user));
    }

    @Test
    void universityVerificationIgnoresEmailCase() {
        RegisteredUser user = createUser("Student@MY.YORKU.CA", "216123456", VerificationMode.UNIVERSITY);
        assertTrue(service.verifyUniversityAccount(user));
    }

    @Test
    void rejectsUniversityAccountWithExternalEmail() {
        RegisteredUser user = createUser("student@gmail.com", "216123456", VerificationMode.UNIVERSITY);
        assertFalse(service.verify(user));
    }

    @Test
    void rejectsUniversityAccountWithShortId() {
        RegisteredUser user = createUser("student@my.yorku.ca", "1234", VerificationMode.UNIVERSITY);
        assertFalse(service.verifyUniversityAccount(user));
    }

    @Test
    void rejectsUniversityAccountWithInvalidIdCharacters() {
        RegisteredUser user = createUser("student@yorku.ca", "ID 12345", VerificationMode.UNIVERSITY);
        assertFalse(service.verifyUniversityAccount(user));
    }

    @Test
    void verifiesPartnerAccountWithOrganizationId() {
        RegisteredUser user = createUser("contact@company.com", "ORG-ABC123", VerificationMode.PARTNER);
        assertTrue(service.verify(user));
    }

    @Test
    void partnerVerificationIgnoresIdCase() {
        RegisteredUser user = createUser("contact@company.com", "org-abc123", VerificationMode.PARTNER);
        assertTrue(service.verifyPartnerAccount(user));
    }

    @Test
    void rejectsPartnerAccountWithoutOrganizationPrefix() {
        RegisteredUser user = createUser("contact@company.com", "ABC123", VerificationMode.PARTNER);
        assertFalse(service.verify(user));
    }

    @Test
    void rejectsPartnerAccountWithTooShortOrganizationCode() {
        RegisteredUser user = createUser("contact@company.com", "ORG-AB", VerificationMode.PARTNER);
        assertFalse(service.verifyPartnerAccount(user));
    }

    @Test
    void noneModeRequiresNoAdditionalVerification() {
        RegisteredUser user = createUser("guest@example.com", "ANY-ID", VerificationMode.NONE);

        assertTrue(service.verify(user));
    }

    @Test
    void describesUniversityIdentificationRequirement() {
        AccountType type = accountType(VerificationMode.UNIVERSITY);
        assertEquals("a York email and valid student/employee ID", service.expectedIdentificationDescription(type));
    }

    @Test
    void describesPartnerIdentificationRequirement() {
        AccountType type = accountType(VerificationMode.PARTNER);

        assertEquals("an organization ID in the form ORG-XXXX", service.expectedIdentificationDescription(type));
    }

    @Test
    void describesNoVerificationRequirement() {
        AccountType type = accountType(VerificationMode.NONE);
        assertEquals("no additional verification", service.expectedIdentificationDescription(type));
    }

    private RegisteredUser createUser(String email, String identificationNumber, VerificationMode mode) {
        return new RegisteredUser(
                "user-1",
                "Test User",
                email,
                PasswordHasher.hash("Strong1!"),
                AccountStatus.PENDING_VERIFICATION,
                LocalDateTime.now(),
                identificationNumber,
                false,
                accountType(mode)
        );
    }

    private AccountType accountType(VerificationMode mode) {
        return new AccountType(mode.name().toLowerCase(), mode.name(), 20.0, mode);
    }
}