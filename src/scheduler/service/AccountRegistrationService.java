package scheduler.service;

import scheduler.exception.AccountException;
import scheduler.exception.DuplicateEmailException;
import scheduler.exception.VerificationException;
import scheduler.factory.AccountFactory;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;
import scheduler.repository.AccountTypeRepository;
import scheduler.repository.UserRepository;
import scheduler.util.EmailValidator;
import scheduler.util.PasswordValidator;

import java.util.List;
import java.util.Objects;

public final class AccountRegistrationService {

    private final UserRepository userRepository;
    private final AccountTypeRepository accountTypeRepository;
    private final VerificationService verificationService;
    private final AccountFactory accountFactory;

    public AccountRegistrationService(
            UserRepository userRepository,
            AccountTypeRepository accountTypeRepository,
            VerificationService verificationService,
            AccountFactory accountFactory
    ) {
        this.userRepository = Objects.requireNonNull(userRepository);
        this.accountTypeRepository = Objects.requireNonNull(accountTypeRepository);
        this.verificationService = Objects.requireNonNull(verificationService);
        this.accountFactory = Objects.requireNonNull(accountFactory);
    }

    public RegisteredUser createAccount(
            String fullName,
            String email,
            String rawPassword,
            String accountTypeId,
            String identificationNumber
    ) throws AccountException {

        String normalizedEmail = normalizeEmail(email);
        validateName(fullName);
        validateEmail(normalizedEmail);
        validatePassword(rawPassword);
        validateIdentificationNumber(identificationNumber);

        if (userRepository.emailExists(normalizedEmail)) {
            throw new DuplicateEmailException(normalizedEmail);
        }

        AccountType accountType = accountTypeRepository
                .findById(accountTypeId)
                .orElseThrow(
                        () -> new AccountException(
                                "The selected account type does not exist."
                        )
                );

        RegisteredUser user = accountFactory.createUser(
                fullName.trim(),
                normalizedEmail,
                rawPassword,
                identificationNumber.trim(),
                accountType
        );

        if (!verificationService.verify(user)) {
            throw new VerificationException(
                    "Account verification failed. Expected "
                    + verificationService
                            .expectedIdentificationDescription(accountType)
                    + "."
            );
        }

        user.markVerified();
        userRepository.save(user);

        return user;
    }
    
    public AccountType createAccountType(
            String accountTypeId,
            String name,
            double hourlyRate,
            VerificationMode verificationMode
    ) throws AccountException {

        if (accountTypeId == null || accountTypeId.isBlank()) {
            throw new AccountException( "Account type ID is required.");
        }

        if (name == null || name.isBlank()) {
            throw new AccountException("Account type name is required.");
        }

        if (hourlyRate < 0) {
            throw new AccountException("Hourly rate cannot be negative.");
        }

        if (verificationMode == null) {
            throw new AccountException( "Verification mode is required.");
        }

        String normalizedId = accountTypeId
                .trim()
                .toLowerCase()
                .replaceAll("[^a-z0-9_-]", "-");

        String normalizedName = name.trim();

        if (accountTypeRepository.existsById(normalizedId)) {
            throw new AccountException("An account type with that ID already exists.");
        }
        if (accountTypeRepository.existsByName(normalizedName)) {
            throw new AccountException("An account type with that name already exists.");
        }

        AccountType accountType = new AccountType(
                normalizedId,
                normalizedName,
                hourlyRate,
                verificationMode
        );

        accountTypeRepository.save(accountType);

        return accountType;
    }

    public List<AccountType> getAvailableAccountTypes() {
        return accountTypeRepository.findAll();
    }

    private void validateName(String fullName) throws AccountException {

        if (fullName == null || fullName.isBlank()) {
            throw new AccountException("Full name is required.");
        }
    }

    private void validateEmail(String email) throws AccountException {

        if (!EmailValidator.isValidFormat(email)) {
            throw new AccountException("The email address is invalid.");
        }
    }

    private void validatePassword(String rawPassword) throws AccountException {

        if (!PasswordValidator.isStrong(rawPassword)) {
            throw new AccountException( PasswordValidator.requirementsMessage());
        }
    }

    private void validateIdentificationNumber(String id) throws AccountException {

        if (id == null || id.isBlank()) {
            throw new AccountException("A student, employee, or organization ID is required.");
        }
    }

    private String normalizeEmail(String email) {
        return email == null ? "" : email.trim().toLowerCase();
    }
}