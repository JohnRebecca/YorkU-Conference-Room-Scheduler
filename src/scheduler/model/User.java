package scheduler.model;

import java.time.LocalDateTime;
import java.util.Objects;

import scheduler.util.PasswordHasher;

public abstract class User {

    private final String userId;
    private String fullName;
    private final String email;
    private final String passwordHash;
    private AccountStatus accountStatus;
    private final LocalDateTime createdAt;

    protected User(
            String userId,
            String fullName,
            String email,
            String passwordHash,
            AccountStatus accountStatus,
            LocalDateTime createdAt
    ) {
        this.userId = requireText(userId, "User ID");
        this.fullName = requireText(fullName, "Full name");
        this.email = requireText(email, "Email");
        this.passwordHash = requireText(passwordHash, "Password hash");
        this.accountStatus = Objects.requireNonNull( accountStatus, "Account status is required." );
        this.createdAt = Objects.requireNonNull(createdAt, "Creation time is required." );
    }

    public boolean verifyPassword(String rawPassword) {
        return PasswordHasher.verify(rawPassword, passwordHash);
    }

    public void updateProfile(String fullName) {
        this.fullName = requireText(fullName, "Full name");
    }

    public boolean isActive() {
        return accountStatus == AccountStatus.ACTIVE;
    }

    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    protected void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = Objects.requireNonNull(accountStatus);
    }

    private static String requireText(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " is required.");
        }

        return value.trim();
    }
}