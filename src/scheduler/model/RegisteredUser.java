package scheduler.model;

public class RegisteredUser {
    private String userId;
    private String email;
    private String organizationIdOrStudentNumber;
    private AccountType accountType;

    public RegisteredUser(String userId, String email, String organizationIdOrStudentNumber, AccountType accountType) {
        this.userId = userId;
        this.email = email;
        this.organizationIdOrStudentNumber = organizationIdOrStudentNumber;
        this.accountType = accountType;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganizationIdOrStudentNumber() {
        return organizationIdOrStudentNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setOrganizationIdOrStudentNumber(String organizationIdOrStudentNumber) {
        this.organizationIdOrStudentNumber = organizationIdOrStudentNumber;
    }

    @Override
    public String toString() {
        return email + " - " + accountType.getTypeName();
    }
}