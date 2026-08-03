package scheduler.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.exception.AccountException;
import scheduler.exception.DuplicateEmailException;
import scheduler.exception.VerificationException;
import scheduler.factory.RegisteredUserFactory;
import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;
import scheduler.repository.AccountTypeRepository;
import scheduler.repository.UserRepository;

class AccountRegistrationServiceTest {

    private FakeUserRepository userRepository;
    private FakeAccountTypeRepository accountTypeRepository;
    private AccountRegistrationService service;

    @BeforeEach
    void setUp() {
        userRepository = new FakeUserRepository();
        accountTypeRepository = new FakeAccountTypeRepository();

        accountTypeRepository.save(new AccountType( "student", "Student", 20.0, VerificationMode.UNIVERSITY ));
        accountTypeRepository.save(new AccountType("partner", "Partner", 50.0, VerificationMode.PARTNER));
        service = new AccountRegistrationService(userRepository,accountTypeRepository,new VerificationService(),new RegisteredUserFactory()
        );
    }

    @Test
    void constructorRejectsNullUserRepository() {
        assertThrows(NullPointerException.class,
                () -> new AccountRegistrationService(
                        null,
                        accountTypeRepository,
                        new VerificationService(),
                        new RegisteredUserFactory()));
    }

    @Test
    void constructorRejectsNullAccountTypeRepository() {
        assertThrows(NullPointerException.class,
                () -> new AccountRegistrationService(
                        userRepository,
                        null,
                        new VerificationService(),
                        new RegisteredUserFactory()));
    }

    @Test
    void createsVerifiedUniversityAccount() throws AccountException {
        RegisteredUser user = service.createAccount("Student User", "student@my.yorku.ca","Strong1!", "student", "216123456");

        assertTrue(user.isVerified());
        assertEquals(AccountStatus.ACTIVE, user.getAccountStatus());
        assertTrue(userRepository.emailExists("student@my.yorku.ca"));
    }

    @Test
    void trimsNameAndNormalizesEmail() throws AccountException {
        RegisteredUser user = service.createAccount( "  Student User  ","  STUDENT@MY.YORKU.CA  ", "Strong1!",
                "student",
                " 216123456 ");

        assertEquals("Student User", user.getFullName());
        assertEquals("student@my.yorku.ca", user.getEmail());
        assertEquals("216123456", user.getIdentificationNumber());
    }

    @Test
    void rejectsDuplicateEmail() throws AccountException {
        service.createAccount("First User", "student@my.yorku.ca", "Strong1!", "student", "216123456");

        assertThrows(DuplicateEmailException.class,
                () -> service.createAccount("Second User", "STUDENT@MY.YORKU.CA", "Another1!", "student", "216654321"));
    }

    @Test
    void rejectsBlankFullName() {
        AccountException exception = assertThrows(
                AccountException.class,
                () -> service.createAccount(" ", "student@my.yorku.ca", "Strong1!", "student", "216123456"));
        assertEquals("Full name is required.", exception.getMessage());
    }

    @Test
    void rejectsInvalidEmail() {
        AccountException exception = assertThrows(
                AccountException.class,
                () -> service.createAccount("Student User", "invalid-email", "Strong1!", "student", "216123456"));
        assertEquals("The email address is invalid.", exception.getMessage());
    }

    @Test
    void rejectsWeakPassword() {
        AccountException exception = assertThrows(
                AccountException.class,
                () -> service.createAccount("Student User", "student@my.yorku.ca", "password", "student","216123456"));

        assertEquals(
                "Password must contain at least 8 characters, including an uppercase letter, lowercase letter, digit, and special character.",
                exception.getMessage());
    }

    @Test
    void rejectsBlankIdentificationNumber() {
        AccountException exception = assertThrows(
                AccountException.class,
                () -> service.createAccount("Student User","student@my.yorku.ca", "Strong1!","student", " "));
        assertEquals("A student, employee, or organization ID is required.",exception.getMessage());
    }

    @Test
    void rejectsUnknownAccountType() {
        AccountException exception = assertThrows(
                AccountException.class,
                () -> service.createAccount( "Student User", "student@my.yorku.ca", "Strong1!", "missing", "216123456"));

        assertEquals("The selected account type does not exist.", exception.getMessage());
    }

    @Test
    void rejectsFailedUniversityVerification() {
        assertThrows(
                VerificationException.class,
                () -> service.createAccount("Student User", "student@gmail.com", "Strong1!", "student", "216123456"));
    }

    @Test
    void createsVerifiedPartnerAccount() throws AccountException {
        RegisteredUser user = service.createAccount("Partner User", "partner@company.com", "Strong1!", "partner", "ORG-ABC123");
        assertTrue(user.isVerified());
        assertEquals("partner", user.getAccountType().getAccountTypeId());
    }

    @Test
    void rejectsInvalidPartnerOrganizationId() {
        assertThrows(
                VerificationException.class,
                () -> service.createAccount("Partner User", "partner@company.com", "Strong1!", "partner", "ABC123"));
    }

    @Test
    void createsNewAccountType() throws AccountException {
        AccountType type = service.createAccountType("guest-researcher", "Guest Researcher", 15.0, VerificationMode.NONE);

        assertEquals("guest-researcher", type.getAccountTypeId());
        assertEquals("Guest Researcher", type.getName());
        assertTrue(accountTypeRepository.existsById("guest-researcher"));
    }

    @Test
    void normalizesNewAccountTypeIdAndName() throws AccountException {
        AccountType type = service.createAccountType(" Visiting Researcher ", "  Visiting Researcher  ", 35.0, VerificationMode.UNIVERSITY);

        assertEquals("visiting-researcher", type.getAccountTypeId());
        assertEquals("Visiting Researcher", type.getName());
    }

    @Test
    void rejectsDuplicateAccountTypeId() {
        assertThrows(AccountException.class,
                () -> service.createAccountType("student", "Different Name", 25.0, VerificationMode.NONE));
    }

    @Test
    void rejectsDuplicateAccountTypeNameIgnoringCase() {
        assertThrows( AccountException.class,
                () -> service.createAccountType("student-two", "STUDENT", 25.0, VerificationMode.NONE));
    }

    @Test
    void rejectsNegativeAccountTypeRate() {
        assertThrows(
                AccountException.class,
                () -> service.createAccountType("invalid", "Invalid", -1.0, VerificationMode.NONE));
    }

    @Test
    void rejectsNullVerificationMode() {
        assertThrows(
                AccountException.class,
                () -> service.createAccountType("custom", "Custom", 10.0, null));
    }

    @Test
    void returnsAvailableAccountTypes() {
        List<AccountType> available = service.getAvailableAccountTypes();

        assertEquals(2, available.size());
        assertTrue(available.stream().anyMatch(type -> type.getAccountTypeId().equals("student")));
    }

    private static final class FakeUserRepository implements UserRepository {

        private final Map<String, RegisteredUser> users = new HashMap<>();

        @Override
        public void save(RegisteredUser user) {
            users.put(user.getEmail().toLowerCase(), user);
        }

        @Override
        public Optional<RegisteredUser> findByEmail(String email) {
            return Optional.ofNullable(users.get(email.toLowerCase()));
        }

        @Override
        public Optional<RegisteredUser> findById(String userId) {
            return users.values().stream().filter(user -> user.getUserId().equals(userId)).findFirst();
        }

        @Override
        public boolean emailExists(String email) {
            return users.containsKey(email.toLowerCase());
        }

        @Override
        public void updateProfile(String userId, String fullName, String passwordHash) {
            RegisteredUser user = findById(userId).orElseThrow(() -> new IllegalStateException("User not found."));
            user.updateProfile(fullName);
            user.updatePasswordHash(passwordHash);
        }
    }

    private static final class FakeAccountTypeRepository implements AccountTypeRepository {

        private final Map<String, AccountType> types = new HashMap<>();

        @Override
        public Optional<AccountType> findById(String accountTypeId) {
            return Optional.ofNullable(types.get(accountTypeId));
        }

        @Override
        public Optional<AccountType> findByName(String name) {
            return types.values().stream().filter(type -> type.getName().equalsIgnoreCase(name)).findFirst();
        }

        @Override
        public List<AccountType> findAll() {
            return new ArrayList<>(types.values());
        }

        @Override
        public void save(AccountType accountType) {
            types.put(accountType.getAccountTypeId(), accountType);
        }

        @Override
        public boolean existsById(String accountTypeId) {
            return types.containsKey(accountTypeId);
        }

        @Override
        public boolean existsByName(String name) {
            return types.values().stream().anyMatch(type -> type.getName().equalsIgnoreCase(name));
        }
    }
}