package scheduler.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
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

class AccountRegistrationServiceAITest {

    private MemoryUserRepository userRepository;
    private MemoryAccountTypeRepository typeRepository;
    private AccountRegistrationService registrationService;

    @BeforeEach
    void setUp() {
        userRepository = new MemoryUserRepository();
        typeRepository = new MemoryAccountTypeRepository();

        typeRepository.save(new AccountType(
                "faculty", "Faculty", 30.0, VerificationMode.UNIVERSITY
        ));

        typeRepository.save(new AccountType(
                "partner", "Partner", 50.0, VerificationMode.PARTNER
        ));

        registrationService = new AccountRegistrationService(
                userRepository,
                typeRepository,
                new VerificationService(),
                new RegisteredUserFactory()
        );
    }

    @Test
    void createsFacultyAccountUsingValidYorkCredentials()
            throws AccountException {

        RegisteredUser user = registrationService.createAccount(
                "Dana Brooks",
                "dana@yorku.ca",
                "Faculty44!",
                "faculty",
                "EMP-77551"
        );

        assertEquals("Dana Brooks", user.getFullName());
        assertEquals(AccountStatus.ACTIVE, user.getAccountStatus());
        assertTrue(user.isVerified());
        assertTrue(userRepository.emailExists("dana@yorku.ca"));
    }

    @Test
    void registrationNormalizesUppercaseEmail()
            throws AccountException {

        RegisteredUser user = registrationService.createAccount(
                "Dana Brooks",
                "  DANA@YORKU.CA ",
                "Faculty44!",
                "faculty",
                "EMP-77551"
        );

        assertEquals("dana@yorku.ca", user.getEmail());
    }

    @Test
    void registrationRejectsNullName() {
        AccountException exception = assertThrows(
                AccountException.class,
                () -> registrationService.createAccount(
                        null,
                        "dana@yorku.ca",
                        "Faculty44!",
                        "faculty",
                        "EMP-77551"
                )
        );

        assertEquals("Full name is required.", exception.getMessage());
    }

    @Test
    void registrationRejectsEmailWithoutValidFormat() {
        assertThrows(
                AccountException.class,
                () -> registrationService.createAccount(
                        "Dana Brooks",
                        "dana-yorku.ca",
                        "Faculty44!",
                        "faculty",
                        "EMP-77551"
                )
        );
    }

    @Test
    void registrationRejectsPasswordMissingSpecialCharacter() {
        assertThrows(
                AccountException.class,
                () -> registrationService.createAccount(
                        "Dana Brooks",
                        "dana@yorku.ca",
                        "Faculty44",
                        "faculty",
                        "EMP-77551"
                )
        );
    }

    @Test
    void registrationRejectsNullIdentificationNumber() {
        assertThrows(
                AccountException.class,
                () -> registrationService.createAccount(
                        "Dana Brooks",
                        "dana@yorku.ca",
                        "Faculty44!",
                        "faculty",
                        null
                )
        );
    }

    @Test
    void registrationRejectsDuplicateEmailIgnoringCase()
            throws AccountException {

        registrationService.createAccount(
                "First Faculty",
                "faculty@yorku.ca",
                "Faculty44!",
                "faculty",
                "EMP-11111"
        );

        assertThrows(
                DuplicateEmailException.class,
                () -> registrationService.createAccount(
                        "Second Faculty",
                        "FACULTY@YORKU.CA",
                        "Second55!",
                        "faculty",
                        "EMP-22222"
                )
        );
    }

    @Test
    void registrationRejectsAccountTypeThatIsNotStored() {
        assertThrows(
                AccountException.class,
                () -> registrationService.createAccount(
                        "Visitor User",
                        "visitor@example.com",
                        "Visitor55!",
                        "visitor",
                        "VIS-10000"
                )
        );
    }

    @Test
    void universityAccountFailsWithNonYorkEmail() {
        assertThrows(
                VerificationException.class,
                () -> registrationService.createAccount(
                        "Dana Brooks",
                        "dana@example.com",
                        "Faculty44!",
                        "faculty",
                        "EMP-77551"
                )
        );
    }

    @Test
    void partnerAccountRequiresOrganizationIdentifier() {
        assertThrows(
                VerificationException.class,
                () -> registrationService.createAccount(
                        "Company Contact",
                        "contact@company.ca",
                        "Partner55!",
                        "partner",
                        "COMPANY-123"
                )
        );
    }

    @Test
    void partnerAccountSucceedsWithValidOrganizationIdentifier()
            throws AccountException {

        RegisteredUser user = registrationService.createAccount(
                "Company Contact",
                "contact@company.ca",
                "Partner55!",
                "partner",
                "ORG-COMPANY123"
        );

        assertTrue(user.isVerified());
        assertEquals("partner", user.getAccountType().getAccountTypeId());
    }

    @Test
    void createsAccountTypeAndStoresNormalizedValues()
            throws AccountException {

        AccountType created = registrationService.createAccountType(
                " Guest Speaker ",
                "  Guest Speaker  ",
                12.5,
                VerificationMode.NONE
        );

        assertEquals("guest-speaker", created.getAccountTypeId());
        assertEquals("Guest Speaker", created.getName());
        assertTrue(typeRepository.existsById("guest-speaker"));
    }

    @Test
    void accountTypeMayHaveZeroHourlyRate()
            throws AccountException {

        AccountType created = registrationService.createAccountType(
                "volunteer", "Volunteer", 0.0, VerificationMode.NONE
        );

        assertEquals(0.0, created.getHourlyRate());
    }

    @Test
    void accountTypeRejectsBlankId() {
        assertThrows(
                AccountException.class,
                () -> registrationService.createAccountType(
                        " ", "Guest Speaker", 12.5, VerificationMode.NONE
                )
        );
    }

    @Test
    void accountTypeRejectsBlankName() {
        assertThrows(
                AccountException.class,
                () -> registrationService.createAccountType(
                        "guest", " ", 12.5, VerificationMode.NONE
                )
        );
    }

    @Test
    void accountTypeRejectsNegativeRate() {
        assertThrows(
                AccountException.class,
                () -> registrationService.createAccountType(
                        "guest", "Guest", -0.01, VerificationMode.NONE
                )
        );
    }

    @Test
    void accountTypeRejectsDuplicateNormalizedId()
            throws AccountException {

        registrationService.createAccountType(
                "guest-speaker", "Guest Speaker", 15.0, VerificationMode.NONE
        );

        assertThrows(
                AccountException.class,
                () -> registrationService.createAccountType(
                        "Guest Speaker",
                        "Another Guest",
                        20.0,
                        VerificationMode.NONE
                )
        );
    }

    @Test
    void returnsEveryStoredAccountType() {
        List<AccountType> available =
                registrationService.getAvailableAccountTypes();

        assertEquals(2, available.size());
    }

    private static final class MemoryUserRepository implements UserRepository {

        private final Map<String, RegisteredUser> users = new LinkedHashMap<>();

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
            return users.values().stream()
                    .filter(user -> user.getUserId().equals(userId))
                    .findFirst();
        }

        @Override
        public boolean emailExists(String email) {
            return users.containsKey(email.toLowerCase());
        }

        @Override
        public void updateProfile(
                String userId, String fullName, String passwordHash
        ) {
            RegisteredUser user = findById(userId).orElseThrow();
            user.updateProfile(fullName);
            user.updatePasswordHash(passwordHash);
        }
    }

    private static final class MemoryAccountTypeRepository
            implements AccountTypeRepository {

        private final Map<String, AccountType> accountTypes =
                new LinkedHashMap<>();

        @Override
        public Optional<AccountType> findById(String accountTypeId) {
            return Optional.ofNullable(accountTypes.get(accountTypeId));
        }

        @Override
        public Optional<AccountType> findByName(String name) {
            return accountTypes.values().stream()
                    .filter(type -> type.getName().equalsIgnoreCase(name))
                    .findFirst();
        }

        @Override
        public List<AccountType> findAll() {
            return new ArrayList<>(accountTypes.values());
        }

        @Override
        public void save(AccountType accountType) {
            accountTypes.put(accountType.getAccountTypeId(), accountType);
        }

        @Override
        public boolean existsById(String accountTypeId) {
            return accountTypes.containsKey(accountTypeId);
        }

        @Override
        public boolean existsByName(String name) {
            return accountTypes.values().stream()
                    .anyMatch(type -> type.getName().equalsIgnoreCase(name));
        }
    }
}