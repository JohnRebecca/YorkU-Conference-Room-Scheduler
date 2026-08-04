package scheduler.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.exception.AuthenticationException;
import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;
import scheduler.repository.UserRepository;
import scheduler.util.PasswordHasher;

class AuthenticationServiceAITest {

    private InMemoryUserRepository repository;
    private AuthenticationService authenticationService;

    @BeforeEach
    void setUp() {
        repository = new InMemoryUserRepository();
        authenticationService = new AuthenticationService(repository);
    }

    @Test
    void rejectsMissingRepositoryDuringConstruction() {
        assertThrows(NullPointerException.class, () -> new AuthenticationService(null));
    }

    @Test
    void startsWithoutAuthenticatedUser() {
        assertFalse(authenticationService.isLoggedIn());
        assertTrue(authenticationService.getCurrentUser().isEmpty());
    }

    @Test
    void rejectsUnknownEmailAddress() {
        AuthenticationException exception = assertThrows(
                AuthenticationException.class,
                () -> authenticationService.authenticate(
                        "unknown@my.yorku.ca", "Secure77!"
                )
        );

        assertEquals("No account was found for that email.", exception.getMessage());
    }

    @Test
    void convertsEmailToLowercaseBeforeRepositoryLookup()
            throws AuthenticationException {

        RegisteredUser user = activeUser();
        repository.save(user);

        RegisteredUser result = authenticationService.authenticate(
                "  CASE.USER@MY.YORKU.CA ", "Secure77!"
        );

        assertSame(user, result);
    }

    @Test
    void rejectsIncorrectPasswordWithoutLoggingUserIn() {
        repository.save(activeUser());

        assertThrows(
                AuthenticationException.class,
                () -> authenticationService.authenticate(
                        "case.user@my.yorku.ca", "Incorrect77!"
                )
        );

        assertFalse(authenticationService.isLoggedIn());
    }

    @Test
    void rejectsAccountThatHasNotBeenVerified() {
        repository.save(createUser(false, AccountStatus.ACTIVE));

        AuthenticationException exception = assertThrows(
                AuthenticationException.class,
                () -> authenticationService.authenticate(
                        "case.user@my.yorku.ca", "Secure77!"
                )
        );

        assertEquals("The account has not been verified.", exception.getMessage());
    }

    @Test
    void rejectsSuspendedUser() {
        repository.save(createUser(true, AccountStatus.SUSPENDED));

        AuthenticationException exception = assertThrows(
                AuthenticationException.class,
                () -> authenticationService.authenticate(
                        "case.user@my.yorku.ca", "Secure77!"
                )
        );

        assertEquals("The account is not active.", exception.getMessage());
    }

    @Test
    void rejectsDisabledUser() {
        repository.save(createUser(true, AccountStatus.DISABLED));

        assertThrows(
                AuthenticationException.class,
                () -> authenticationService.authenticate(
                        "case.user@my.yorku.ca", "Secure77!"
                )
        );
    }

    @Test
    void returnsActiveVerifiedUserAfterSuccessfulLogin()
            throws AuthenticationException {

        RegisteredUser user = activeUser();
        repository.save(user);

        RegisteredUser result = authenticationService.authenticate(
                "case.user@my.yorku.ca", "Secure77!"
        );

        assertSame(user, result);
        assertTrue(authenticationService.isLoggedIn());
    }

    @Test
    void getCurrentUserReturnsTheLastAuthenticatedAccount()
            throws AuthenticationException {

        RegisteredUser user = activeUser();
        repository.save(user);

        authenticationService.authenticate(
                "case.user@my.yorku.ca", "Secure77!"
        );

        assertEquals(Optional.of(user), authenticationService.getCurrentUser());
    }

    @Test
    void logoutRemovesAuthenticatedAccount()
            throws AuthenticationException {

        repository.save(activeUser());
        authenticationService.authenticate(
                "case.user@my.yorku.ca", "Secure77!"
        );

        authenticationService.logout();

        assertFalse(authenticationService.isLoggedIn());
        assertTrue(authenticationService.getCurrentUser().isEmpty());
    }

    @Test
    void loggingOutBeforeLoginIsSafe() {
        assertDoesNotThrow(() -> authenticationService.logout());
        assertFalse(authenticationService.isLoggedIn());
    }

    private RegisteredUser activeUser() {
        return createUser(true, AccountStatus.ACTIVE);
    }

    private RegisteredUser createUser(boolean verified, AccountStatus status) {
        AccountType type = new AccountType(
                "student", "Student", 20.0, VerificationMode.UNIVERSITY
        );

        return new RegisteredUser(
                "auth-user",
                "Case User",
                "case.user@my.yorku.ca",
                PasswordHasher.hash("Secure77!"),
                status,
                LocalDateTime.now(),
                "217654321",
                verified,
                type
        );
    }

    private static final class InMemoryUserRepository implements UserRepository {

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
}