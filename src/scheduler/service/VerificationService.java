package scheduler.service;

import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;

public final class VerificationService {

    public boolean verify(RegisteredUser user) {
        VerificationMode mode = user.getAccountType().getVerificationMode();

        return switch (mode) {
            case UNIVERSITY -> verifyUniversityAccount(user);
            case PARTNER -> verifyPartnerAccount(user);
            case NONE -> true;
        };
    }

    public boolean verifyUniversityAccount(RegisteredUser user) {
        String email = user.getEmail().trim().toLowerCase();
        String id = user.getIdentificationNumber().trim();

        return (email.endsWith("@yorku.ca") || email.endsWith("@my.yorku.ca"))
                && id.matches("[A-Za-z0-9-]{5,20}");
    }

    public boolean verifyPartnerAccount(RegisteredUser user) {
        String id = user.getIdentificationNumber()
                .trim()
                .toUpperCase();

        return id.matches("ORG-[A-Z0-9]{3,20}");
    }

    public String expectedIdentificationDescription( AccountType accountType ) {
        return switch (accountType.getVerificationMode()) {
            case UNIVERSITY -> "a York email and valid student/employee ID";
            case PARTNER -> "an organization ID in the form ORG-XXXX";
            case NONE -> "no additional verification";
        };
    }
}