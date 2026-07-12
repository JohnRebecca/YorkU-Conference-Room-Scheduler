package scheduler.service;

import scheduler.exception.AuthenticationException;
import scheduler.model.RegisteredUser;
import scheduler.repository.UserRepository;

import java.util.Objects;
import java.util.Optional;

public final class AuthenticationService {

    private final UserRepository userRepository;
    private RegisteredUser currentUser;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = Objects.requireNonNull(userRepository);
    }

    public RegisteredUser authenticate( String email, String rawPassword) throws AuthenticationException {

        String normalizedEmail = email == null ? "" : email.trim().toLowerCase();

        Optional<RegisteredUser> result = userRepository.findByEmail(normalizedEmail);
        if (result.isEmpty()) {
            throw new AuthenticationException( "No account was found for that email.");
        }

        RegisteredUser user = result.get();
        if (!user.verifyPassword(rawPassword)) {
            throw new AuthenticationException( "The password is incorrect.");
        }

        if (!user.isVerified()) {
            throw new AuthenticationException( "The account has not been verified.");
        }

        if (!user.isActive()) {
            throw new AuthenticationException( "The account is not active.");
        }

        currentUser = user;
        return user;
    }

    public void logout() {
        currentUser = null;
    }

    public Optional<RegisteredUser> getCurrentUser() {
        return Optional.ofNullable(currentUser);
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }
}
