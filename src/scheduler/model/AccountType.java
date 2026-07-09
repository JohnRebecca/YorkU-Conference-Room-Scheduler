package scheduler.model;

public class AccountType {
    private String typeName;
    private double hourlyRate;
    private boolean requiresUniversityVerification;

    public AccountType(String typeName, double hourlyRate, boolean requiresUniversityVerification) {
        this.typeName = typeName;
        this.hourlyRate = hourlyRate;
        this.requiresUniversityVerification = requiresUniversityVerification;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean requiresUniversityVerification() {
        return requiresUniversityVerification;
    }

    @Override
    public String toString() {
        return typeName + " ($" + hourlyRate + "/hour)";
    }
}