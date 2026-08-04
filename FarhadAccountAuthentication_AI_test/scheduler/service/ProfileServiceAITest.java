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

class ProfileServiceAITest {

    private TrackingUserRepository repository;
    private ProfileService profileService;
    private RegisteredUser signedInUser;

    @BeforeEach
    void setUp() {
        repository = new TrackingUserRepository();
        profileService = new ProfileService(repository);

        signedInUser = new RegisteredUser(
                "profile-user",
                "Jordan Patel",
                "jordan@my.yorku.ca",
                PasswordHasher.hash("Original6!"),
                AccountStatus.ACTIVE,
                LocalDateTime.now(),
                "218765432",
                true,
                new AccountType(
                        "student",
                        "Student",
                        20.0,
                        VerificationMode.UNIVERSITY
                )
        );

        repository.save(signedInUser);
    }

    @Test
    void constructorRequiresRepository() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> new ProfileService(null)
        );

        assertEquals("User repository is required.", exception.getMessage());
    }

    @Test
    void updateRequiresSignedInUser() {
        assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        null, "Jordan Patel", "", "", ""
                )
        );
    }

    @Test
    void nameOnlyChangeUpdatesRepositoryAndUser()
            throws ProfileException {

        RegisteredUser result = profileService.updateProfile(
                signedInUser, "Jordan P. Patel", "", "", ""
        );

        assertSame(signedInUser, result);
        assertEquals("Jordan P. Patel", result.getFullName());
        assertEquals("Jordan P. Patel", repository.savedName);
    }

    @Test
    void surroundingWhitespaceIsRemovedFromNewName()
            throws ProfileException {

        profileService.updateProfile(
                signedInUser, "  Jordan Patel-Smith  ", "", "", ""
        );

        assertEquals("Jordan Patel-Smith", signedInUser.getFullName());
    }

    @Test
    void oneCharacterNameIsRejected() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser, "J", "", "", ""
                )
        );

        assertEquals(
                "Full name must contain at least two characters.",
                exception.getMessage()
        );
    }

    @Test
    void exactlyTwoCharactersIsAccepted()
            throws ProfileException {

        profileService.updateProfile(
                signedInUser, "Jo", "", "", ""
        );

        assertEquals("Jo", signedInUser.getFullName());
    }

    @Test
    void exactlyOneHundredCharactersIsAccepted()
            throws ProfileException {

        String name = "N".repeat(100);

        profileService.updateProfile(
                signedInUser, name, "", "", ""
        );

        assertEquals(name, signedInUser.getFullName());
    }

    @Test
    void nameAboveOneHundredCharactersIsRejected() {
        assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser, "N".repeat(101), "", "", ""
                )
        );
    }

    @Test
    void changingNameDoesNotReplacePassword()
            throws ProfileException {

        String originalHash = signedInUser.getPasswordHash();

        profileService.updateProfile(
                signedInUser, "Jordan New Name", "", "", ""
        );

        assertEquals(originalHash, signedInUser.getPasswordHash());
        assertTrue(signedInUser.verifyPassword("Original6!"));
    }

    @Test
    void anyPasswordInputStartsPasswordChangeValidation() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser,
                        "Jordan Patel",
                        "",
                        "",
                        "Something6!"
                )
        );

        assertEquals(
                "Enter your current password to change your password.",
                exception.getMessage()
        );
    }

    @Test
    void incorrectCurrentPasswordIsRejected() {
        assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser,
                        "Jordan Patel",
                        "Wrong6!",
                        "Changed7#",
                        "Changed7#"
                )
        );
    }

    @Test
    void missingNewPasswordIsRejected() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser,
                        "Jordan Patel",
                        "Original6!",
                        "",
                        ""
                )
        );

        assertEquals("Enter a new password.", exception.getMessage());
    }

    @Test
    void mismatchedPasswordConfirmationIsRejected() {
        assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser,
                        "Jordan Patel",
                        "Original6!",
                        "Changed7#",
                        "Different7#"
                )
        );
    }

    @Test
    void weakReplacementPasswordIsRejected() {
        assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser,
                        "Jordan Patel",
                        "Original6!",
                        "weak",
                        "weak"
                )
        );
    }

    @Test
    void existingPasswordCannotBeReused() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser,
                        "Jordan Patel",
                        "Original6!",
                        "Original6!",
                        "Original6!"
                )
        );

        assertEquals(
                "The new password must be different from the current password.",
                exception.getMessage()
        );
    }

    @Test
    void validPasswordChangeReplacesStoredHash()
            throws ProfileException {

        String previousHash = signedInUser.getPasswordHash();

        profileService.updateProfile(
                signedInUser,
                "Jordan Patel",
                "Original6!",
                "Changed7#",
                "Changed7#"
        );

        assertNotEquals(previousHash, signedInUser.getPasswordHash());
        assertEquals(
                signedInUser.getPasswordHash(),
                repository.savedPasswordHash
        );
    }

    @Test
    void changedPasswordAuthenticatesAndOldPasswordDoesNot()
            throws ProfileException {

        profileService.updateProfile(
                signedInUser,
                "Jordan Patel",
                "Original6!",
                "Changed7#",
                "Changed7#"
        );

        assertTrue(signedInUser.verifyPassword("Changed7#"));
        assertFalse(signedInUser.verifyPassword("Original6!"));
    }

    @Test
    void repositoryFailureIsConvertedToProfileException() {
        repository.throwOnUpdate = true;

        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser, "Jordan Updated", "", "", ""
                )
        );

        assertEquals("The profile could not be saved.", exception.getMessage());
        assertNotNull(exception.getCause());
    }

    @Test
    void failedPersistenceDoesNotChangeUserObject() {
        repository.throwOnUpdate = true;

        assertThrows(
                ProfileException.class,
                () -> profileService.updateProfile(
                        signedInUser, "Jordan Updated", "", "", ""
                )
        );

        assertEquals("Jordan Patel", signedInUser.getFullName());
    }

    private static final class TrackingUserRepository
            implements UserRepository {

        private RegisteredUser user;
        private String savedName;
        private String savedPasswordHash;
        private boolean throwOnUpdate;

        @Override
        public void save(RegisteredUser user) {
            this.user = user;
        }

        @Override
        public Optional<RegisteredUser> findByEmail(String email) {
            if (user != null && user.getEmail().equalsIgnoreCase(email)) {
                return Optional.of(user);
            }

            return Optional.empty();
        }

        @Override
        public Optional<RegisteredUser> findById(String userId) {
            if (user != null && user.getUserId().equals(userId)) {
                return Optional.of(user);
            }

            return Optional.empty();
        }

        @Override
        public boolean emailExists(String email) {
            return user != null && user.getEmail().equalsIgnoreCase(email);
        }

        @Override
        public void updateProfile(
                String userId, String fullName, String passwordHash
        ) {
            if (throwOnUpdate) {
                throw new IllegalStateException("Simulated database error");
            }

            savedName = fullName;
            savedPasswordHash = passwordHash;
        }
    }
}