package scheduler.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class RegisteredUser extends User {

    private final String identificationNumber;
    private boolean verified;
    private final AccountType accountType;

    public RegisteredUser(
            String userId,
            String fullName,
            String email,
            String passwordHash,
            AccountStatus accountStatus,
            LocalDateTime createdAt,
            String identificationNumber,
            boolean verified,
            AccountType accountType
    ) {
        super( userId, fullName, email, passwordHash, accountStatus, createdAt );
        if (identificationNumber == null || identificationNumber.isBlank()) {
            throw new IllegalArgumentException("Student, employee, or organization ID is required.");
        }

        this.identificationNumber = identificationNumber.trim();
        this.verified = verified;
        this.accountType = Objects.requireNonNull( accountType, "Account type is required." );
    }

    public void markVerified() {
        verified = true;
        setAccountStatus(AccountStatus.ACTIVE);
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public boolean isVerified() {
        return verified;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getHourlyRate() {
        return accountType.getHourlyRate();
    }
}