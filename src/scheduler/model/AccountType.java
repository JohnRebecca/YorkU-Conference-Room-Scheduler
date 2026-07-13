package scheduler.model;

import java.util.Objects;

public final class AccountType {

    private final String accountTypeId;
    private final String name;
    private final double hourlyRate;
    private final VerificationMode verificationMode;

    public AccountType(
            String accountTypeId,
            String name,
            double hourlyRate,
            VerificationMode verificationMode
    ) {
        if (accountTypeId == null || accountTypeId.isBlank()) {
            throw new IllegalArgumentException("Account type ID is required.");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Account type name is required.");
        }

        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }

        this.accountTypeId = accountTypeId;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.verificationMode = Objects.requireNonNull( verificationMode, "Verification mode is required.");
    }

    public String getAccountTypeId() {
        return accountTypeId;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public VerificationMode getVerificationMode() {
        return verificationMode;
    }

    public boolean requiresVerification() {
        return verificationMode != VerificationMode.NONE;
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AccountType other)) {
            return false;
        }

        return accountTypeId.equals(other.accountTypeId);
    }

    @Override
    public int hashCode() {
        return accountTypeId.hashCode();
    }

    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", hourlyRate) + "/hour)";
    }
}