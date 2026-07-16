package scheduler.service;

import scheduler.exception.ProfileException;
import scheduler.model.RegisteredUser;
import scheduler.repository.UserRepository;
import scheduler.util.PasswordHasher;
import scheduler.util.PasswordValidator;

import java.util.Objects;

public final class ProfileService {

    private final UserRepository userRepository;

    public ProfileService( UserRepository userRepository ) {
        this.userRepository = Objects.requireNonNull( userRepository, "User repository is required." );
    }

    public RegisteredUser updateProfile(
            RegisteredUser user,
            String fullName,
            String currentPassword,
            String newPassword,
            String confirmPassword
    ) throws ProfileException {

        if (user == null) {
            throw new ProfileException( "No user is currently signed in." );
        }

        String normalizedName = validateFullName(fullName);

        boolean passwordChangeRequested = hasText(currentPassword) || hasText(newPassword) || hasText(confirmPassword);

        String passwordHash = user.getPasswordHash();

        if (passwordChangeRequested) {
            validatePasswordChange( user, currentPassword, newPassword, confirmPassword );

            passwordHash = PasswordHasher.hash(newPassword);
        }

        try {
            userRepository.updateProfile( user.getUserId(), normalizedName, passwordHash );

        } catch (RuntimeException exception) {
            throw new ProfileException( "The profile could not be saved.", exception );
        }

        user.updateProfile(normalizedName);

        if (passwordChangeRequested) {
            user.updatePasswordHash(passwordHash);
        }

        return user;
    }

    private String validateFullName( String fullName ) throws ProfileException {

        if (fullName == null || fullName.isBlank()) {
            throw new ProfileException(
                    "Full name is required."
            );
        }

        String normalizedName = fullName.trim();

        if (normalizedName.length() < 2) {
            throw new ProfileException( "Full name must contain at least two characters." );
        }

        if (normalizedName.length() > 100) {
            throw new ProfileException( "Full name cannot exceed 100 characters."
            );
        }
        return normalizedName;
    }

    private void validatePasswordChange(
            RegisteredUser user,
            String currentPassword,
            String newPassword,
            String confirmPassword
    ) throws ProfileException {

        if (!hasText(currentPassword)) {
            throw new ProfileException( "Enter your current password " + "to change your password." );
        }

        if (!user.verifyPassword(currentPassword)) {
            throw new ProfileException( "The current password is incorrect." );
        }

        if (!hasText(newPassword)) {
            throw new ProfileException("Enter a new password.");
        }

        if (!hasText(confirmPassword)) {
            throw new ProfileException( "Confirm the new password." );
        }

        if (!newPassword.equals(confirmPassword)) {
            throw new ProfileException( "The new passwords do not match." );
        }

        if (!PasswordValidator.isStrong(newPassword)) {
            throw new ProfileException(PasswordValidator.requirementsMessage());
        }

        if (user.verifyPassword(newPassword)) {
            throw new ProfileException( "The new password must be different "+ "from the current password." );
        }
    }

    private boolean hasText(String value) {
        return value != null
                && !value.isBlank();
    }
}