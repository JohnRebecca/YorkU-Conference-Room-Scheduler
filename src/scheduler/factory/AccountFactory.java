package scheduler.factory;

import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.util.PasswordHasher;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class AccountFactory {

    public final RegisteredUser createUser(
            String fullName,
            String email,
            String rawPassword,
            String identificationNumber,
            AccountType accountType
    ) {
        String userId = UUID.randomUUID().toString();
        String passwordHash = PasswordHasher.hash(rawPassword);

        return buildUser(
                userId,
                fullName,
                email,
                passwordHash,
                AccountStatus.PENDING_VERIFICATION,
                LocalDateTime.now(),
                identificationNumber,
                accountType
        );
    }

    protected abstract RegisteredUser buildUser(
            String userId,
            String fullName,
            String email,
            String passwordHash,
            AccountStatus status,
            LocalDateTime createdAt,
            String identificationNumber,
            AccountType accountType
    );
}