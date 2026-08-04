package scheduler.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.exception.ProfileException;
import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;
import scheduler.repository.UserRepository;
import scheduler.util.PasswordHasher;
import scheduler.util.PasswordValidator;

class ProfileServiceTest {

    private FakeUserRepository userRepository;
    private ProfileService service;
    private RegisteredUser user;

    @BeforeEach
    void setUp() {
        userRepository = new FakeUserRepository();
        service = new ProfileService(userRepository);
        AccountType studentType = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);
        user = new RegisteredUser(
                "user-1",
                "Original Name",
                "student@my.yorku.ca",
                PasswordHasher.hash("Strong1!"),
                AccountStatus.ACTIVE,
                LocalDateTime.now(),
                "216123456",
                true,
                studentType);

        userRepository.save(user);
    }

    @Test
    void constructorRejectsNullRepository() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> new ProfileService(null));

        assertEquals("User repository is required.", exception.getMessage());
    }

    @Test
    void updateProfileRejectsNullUser() {
        ProfileException exception = assertThrows( ProfileException.class,
                () -> service.updateProfile(null, "New Name", "", "", ""));

        assertEquals("No user is currently signed in.", exception.getMessage());
    }

    @Test
    void updateProfileChangesFullName() throws ProfileException {
        RegisteredUser result = service.updateProfile(user, "Updated Name", "", "", "");

        assertEquals("Updated Name", result.getFullName());
        assertEquals("Updated Name", userRepository.lastFullName);
    }

    @Test
    void updateProfileTrimsFullName() throws ProfileException {
        service.updateProfile(user, "  Updated Name  ", "", "", "");

        assertEquals("Updated Name", user.getFullName());
        assertEquals("Updated Name", userRepository.lastFullName);
    }

    @Test
    void updateProfileRejectsNullFullName() {
        ProfileException exception = assertThrows(ProfileException.class,
                () -> service.updateProfile(user, null, "", "", ""));

        assertEquals("Full name is required.", exception.getMessage());
    }

    @Test
    void updateProfileRejectsBlankFullName() {
        ProfileException exception = assertThrows(ProfileException.class,
                () -> service.updateProfile(user, "   ", "", "", ""));

        assertEquals("Full name is required.", exception.getMessage());
    }

    @Test
    void updateProfileRejectsOneCharacterName() {
        ProfileException exception = assertThrows(ProfileException.class,
                () -> service.updateProfile(user, "A", "", "", ""));

        assertEquals("Full name must contain at least two characters.", exception.getMessage());
    }

    @Test
    void updateProfileAcceptsTwoCharacterName() throws ProfileException {
        service.updateProfile(user, "Al", "", "", "");
        assertEquals("Al", user.getFullName());
    }

    @Test
    void updateProfileRejectsNameLongerThanOneHundredCharacters() {
        String longName = "A".repeat(101);

        ProfileException exception = assertThrows(ProfileException.class,
                () -> service.updateProfile(user, longName, "", "", ""));

        assertEquals("Full name cannot exceed 100 characters.", exception.getMessage());
    }

    @Test
    void updateProfileAcceptsNameWithExactlyOneHundredCharacters() throws ProfileException {
        String name = "A".repeat(100);
        service.updateProfile(user, name, "", "", "");

        assertEquals(name, user.getFullName());
    }

    @Test
    void nameOnlyUpdateKeepsExistingPasswordHash() throws ProfileException {
        String originalHash = user.getPasswordHash();

        service.updateProfile(user, "Updated Name", "", "", "");

        assertEquals(originalHash, user.getPasswordHash());
        assertEquals(originalHash, userRepository.lastPasswordHash);
    }

    @Test
    void passwordChangeRequiresCurrentPassword() {
        ProfileException exception = assertThrows(ProfileException.class,
                () -> service.updateProfile(user, "Original Name", "", "NewStrong2!", "NewStrong2!"));
        assertEquals("Enter your current password to change your password.", exception.getMessage());
    }

    @Test
    void passwordChangeRejectsIncorrectCurrentPassword() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> service.updateProfile(user, "Original Name", "Wrong1!", "NewStrong2!","NewStrong2!"));
        assertEquals("The current password is incorrect.", exception.getMessage());
    }

    @Test
    void passwordChangeRequiresNewPassword() {
        ProfileException exception = assertThrows(ProfileException.class,
                () -> service.updateProfile(user, "Original Name", "Strong1!", "", ""));
        assertEquals("Enter a new password.", exception.getMessage());
    }

    @Test
    void passwordChangeRequiresConfirmation() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> service.updateProfile(user, "Original Name", "Strong1!", "NewStrong2!", ""));
        assertEquals("Confirm the new password.", exception.getMessage());
    }

    @Test
    void passwordChangeRejectsMismatchedConfirmation() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> service.updateProfile(user, "Original Name", "Strong1!", "NewStrong2!","Different3!"));
        assertEquals("The new passwords do not match.", exception.getMessage());
    }

    @Test
    void passwordChangeRejectsWeakPassword() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> service.updateProfile(user, "Original Name", "Strong1!", "weak", "weak"));

        assertEquals(PasswordValidator.requirementsMessage(), exception.getMessage());
    }

    @Test
    void passwordChangeRejectsCurrentPasswordAsNewPassword() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> service.updateProfile(user, "Original Name", "Strong1!", "Strong1!", "Strong1!"));

        assertEquals("The new password must be different from the current password.",exception.getMessage());
    }

    @Test
    void passwordChangeUpdatesStoredPasswordHash() throws ProfileException {
        String oldHash = user.getPasswordHash();

        service.updateProfile(user, "Original Name", "Strong1!", "NewStrong2!", "NewStrong2!");
        assertNotEquals(oldHash, user.getPasswordHash());
        assertEquals(user.getPasswordHash(), userRepository.lastPasswordHash);
    }

    @Test
    void changedPasswordCanBeVerified() throws ProfileException {
        service.updateProfile(user, "Original Name", "Strong1!", "NewStrong2!", "NewStrong2!");
        assertTrue(user.verifyPassword("NewStrong2!"));
        assertFalse(user.verifyPassword("Strong1!"));
    }

    @Test
    void updateProfileReturnsSameUserInstance() throws ProfileException {
        RegisteredUser result = service.updateProfile(user, "Updated Name", "", "", "");
        assertSame(user, result);
    }

    @Test
    void repositoryFailureIsWrappedInProfileException() {
        userRepository.failDuringUpdate = true;
        ProfileException exception = assertThrows(ProfileException.class,
                () -> service.updateProfile(user, "Updated Name", "", "", ""));

        assertEquals("The profile could not be saved.", exception.getMessage());
        assertInstanceOf(IllegalStateException.class, exception.getCause());
    }

    @Test
    void failedRepositoryUpdateDoesNotChangeInMemoryName() {
        userRepository.failDuringUpdate = true;
        assertThrows(ProfileException.class, () -> service.updateProfile(user, "Updated Name", "", "", ""));
        assertEquals("Original Name", user.getFullName());
    }

    private static final class FakeUserRepository implements UserRepository {

        private RegisteredUser storedUser;
        private String lastFullName;
        private String lastPasswordHash;
        private boolean failDuringUpdate;

        @Override
        public void save(RegisteredUser user) {
            storedUser = user;
        }

        @Override
        public Optional<RegisteredUser> findByEmail(String email) {
            if (storedUser != null && storedUser.getEmail().equalsIgnoreCase(email)) {
                return Optional.of(storedUser);
            }

            return Optional.empty();
        }

        @Override
        public Optional<RegisteredUser> findById(String userId) {
            if (storedUser != null && storedUser.getUserId().equals(userId)) {
                return Optional.of(storedUser);
            }

            return Optional.empty();
        }

        @Override
        public boolean emailExists(String email) {
            return storedUser != null && storedUser.getEmail().equalsIgnoreCase(email);
        }

        @Override
        public void updateProfile(String userId, String fullName, String passwordHash) {
            if (failDuringUpdate) {
                throw new IllegalStateException("Simulated repository failure");
            }

            lastFullName = fullName;
            lastPasswordHash = passwordHash;
        }
    }
}