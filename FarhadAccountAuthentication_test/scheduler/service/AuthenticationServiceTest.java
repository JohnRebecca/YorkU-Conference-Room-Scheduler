package scheduler.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.HashMap;
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

class AuthenticationServiceTest {

    private FakeUserRepository userRepository;
    private AuthenticationService service;

    @BeforeEach
    void setUp() {
        userRepository = new FakeUserRepository();
        service = new AuthenticationService(userRepository);
    }

    @Test
    void constructorRejectsNullRepository() {
        assertThrows(NullPointerException.class, () -> new AuthenticationService(null));
    }

    @Test
    void authenticationFailsWhenEmailDoesNotExist() {
        AuthenticationException exception = assertThrows(AuthenticationException.class,
                () -> service.authenticate("missing@yorku.ca", "Strong1!"));

        assertEquals("No account was found for that email.", exception.getMessage());
    }

    @Test
    void authenticationFailsForIncorrectPassword() {
        userRepository.save(createUser(true, AccountStatus.ACTIVE));

        AuthenticationException exception = assertThrows( AuthenticationException.class,
                () -> service.authenticate("student@my.yorku.ca", "Wrong1!"));
        assertEquals("The password is incorrect.", exception.getMessage());
    }

    @Test
    void authenticationFailsForUnverifiedAccount() {
        userRepository.save(createUser(false, AccountStatus.ACTIVE));

        AuthenticationException exception = assertThrows(AuthenticationException.class,
                () -> service.authenticate("student@my.yorku.ca", "Strong1!"));

        assertEquals("The account has not been verified.", exception.getMessage());
    }

    @Test
    void authenticationFailsForInactiveAccount() {
        userRepository.save(createUser(true, AccountStatus.SUSPENDED));
        AuthenticationException exception = assertThrows(AuthenticationException.class,
                () -> service.authenticate("student@my.yorku.ca", "Strong1!"));

        assertEquals("The account is not active.", exception.getMessage());
    }

    @Test
    void successfulAuthenticationReturnsUser() throws AuthenticationException {
        RegisteredUser expected = createUser(true, AccountStatus.ACTIVE);
        userRepository.save(expected);

        RegisteredUser result = service.authenticate("student@my.yorku.ca", "Strong1!");
        assertSame(expected, result);
    }

    @Test
    void authenticationNormalizesEmailCaseAndWhitespace() throws AuthenticationException {

        RegisteredUser expected = createUser(true, AccountStatus.ACTIVE);
        userRepository.save(expected);

        RegisteredUser result = service.authenticate("  STUDENT@MY.YORKU.CA  ", "Strong1!");
        assertSame(expected, result);
    }

    @Test
    void successfulAuthenticationMarksServiceAsLoggedIn() throws AuthenticationException {

        userRepository.save(createUser(true, AccountStatus.ACTIVE));
        service.authenticate("student@my.yorku.ca", "Strong1!");
        assertTrue(service.isLoggedIn());
    }

    @Test
    void currentUserIsEmptyBeforeLogin() {
        assertTrue(service.getCurrentUser().isEmpty());
    }

    @Test
    void currentUserContainsAuthenticatedUser() throws AuthenticationException {
        RegisteredUser expected = createUser(true, AccountStatus.ACTIVE);
        userRepository.save(expected);
        service.authenticate("student@my.yorku.ca", "Strong1!");

        assertEquals(Optional.of(expected), service.getCurrentUser());
    }

    @Test
    void logoutClearsCurrentUser() throws AuthenticationException {
        userRepository.save(createUser(true, AccountStatus.ACTIVE));
        service.authenticate("student@my.yorku.ca", "Strong1!");
        service.logout();

        assertFalse(service.isLoggedIn());
        assertTrue(service.getCurrentUser().isEmpty());
    }

    @Test
    void serviceIsNotLoggedInInitially() {
        assertFalse(service.isLoggedIn());
    }

    private RegisteredUser createUser(boolean verified, AccountStatus status) {
        AccountType type = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);

        return new RegisteredUser(
                "user-1",
                "Student User",
                "student@my.yorku.ca",
                PasswordHasher.hash("Strong1!"),
                status,
                LocalDateTime.now(),
                "216123456",
                verified,
                type);
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
    }