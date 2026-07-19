package scheduler.factory;

import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;

import java.time.LocalDateTime;

public final class RegisteredUserFactory extends AccountFactory {

    @Override
    protected RegisteredUser buildUser(
            String userId,
            String fullName,
            String email,
            String passwordHash,
            AccountStatus status,
            LocalDateTime createdAt,
            String identificationNumber,
            AccountType accountType
    ) {
        return new RegisteredUser(
                userId,
                fullName,
                email,
                passwordHash,
                status,
                createdAt,
                identificationNumber,
                false,
                accountType
        );
    }
}