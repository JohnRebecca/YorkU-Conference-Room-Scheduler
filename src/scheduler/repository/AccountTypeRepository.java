package scheduler.repository;

import scheduler.model.AccountType;

import java.util.List;
import java.util.Optional;

public interface AccountTypeRepository {

    Optional<AccountType> findById(String accountTypeId);

    Optional<AccountType> findByName(String name);

    List<AccountType> findAll();

    void save(AccountType accountType);

    boolean existsById(String accountTypeId);

    boolean existsByName(String name);
}