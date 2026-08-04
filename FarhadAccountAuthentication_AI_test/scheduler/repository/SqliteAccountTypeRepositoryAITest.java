package scheduler.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.database.DatabaseManager;
import scheduler.model.AccountType;
import scheduler.model.VerificationMode;

class SqliteAccountTypeRepositoryAITest {

    private SqliteAccountTypeRepository repository;
    private String typeId;
    private String displayName;

    @BeforeAll
    static void initializeDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @BeforeEach
    void setUp() {
        repository = new SqliteAccountTypeRepository();

        String suffix = UUID.randomUUID().toString().substring(0, 8);
        typeId = "ai-type-" + suffix;
        displayName = "AI Test Type " + suffix;
    }

    @AfterEach
    void removeTestData() {
        deleteType(typeId);
        deleteType(typeId + "-second");
    }

    @Test
    void savedAccountTypeCanBeRetrievedByIdentifier() {
        repository.save(createAccountType());

        AccountType loaded = repository.findById(typeId).orElseThrow();

        assertEquals(typeId, loaded.getAccountTypeId());
        assertEquals(displayName, loaded.getName());
    }

    @Test
    void savedAccountTypeCanBeRetrievedByDisplayName() {
        repository.save(createAccountType());

        AccountType loaded = repository.findByName(displayName).orElseThrow();

        assertEquals(typeId, loaded.getAccountTypeId());
    }

    @Test
    void nameLookupIsCaseInsensitive() {
        repository.save(createAccountType());

        assertTrue(repository.findByName(displayName.toUpperCase()).isPresent());
    }

    @Test
    void missingIdentifierReturnsEmptyOptional() {
        assertTrue(repository.findById(typeId).isEmpty());
    }

    @Test
    void missingNameReturnsEmptyOptional() {
        assertTrue(repository.findByName(displayName).isEmpty());
    }

    @Test
    void existsByIdReflectsStoredRecord() {
        assertFalse(repository.existsById(typeId));

        repository.save(createAccountType());

        assertTrue(repository.existsById(typeId));
    }

    @Test
    void existsByNameUsesCaseInsensitiveComparison() {
        repository.save(createAccountType());

        assertTrue(repository.existsByName(displayName.toLowerCase()));
    }

    @Test
    void savedValuesAreMappedBackCorrectly() {
        repository.save(createAccountType());

        AccountType loaded = repository.findById(typeId).orElseThrow();

        assertEquals(33.75, loaded.getHourlyRate());
        assertEquals(VerificationMode.PARTNER, loaded.getVerificationMode());
    }

    @Test
    void findAllContainsNewlyInsertedAccountType() {
        repository.save(createAccountType());

        List<AccountType> allTypes = repository.findAll();

        assertTrue(allTypes.stream().anyMatch(type -> type.getAccountTypeId().equals(typeId)));
    }

    @Test
    void findAllOrdersLowerRatesBeforeHigherRates() {
        AccountType first = new AccountType(
                typeId, displayName, 33.75, VerificationMode.PARTNER
        );
        AccountType second = new AccountType(
                typeId + "-second",
                displayName + " Second",
                75.0,
                VerificationMode.NONE
        );

        repository.save(second);
        repository.save(first);

        List<AccountType> allTypes = repository.findAll();
        int firstIndex = indexOf(allTypes, typeId);
        int secondIndex = indexOf(allTypes, typeId + "-second");

        assertTrue(firstIndex < secondIndex);
    }

    @Test
    void duplicateIdentifierCannotBeSaved() {
        repository.save(createAccountType());

        AccountType duplicate = new AccountType(
                typeId,
                displayName + " Duplicate",
                60.0,
                VerificationMode.NONE
        );

        assertThrows(IllegalStateException.class, () -> repository.save(duplicate));
    }

    @Test
    void duplicateNameIgnoringCaseCannotBeSaved() {
        repository.save(createAccountType());

        AccountType duplicateName = new AccountType(
                typeId + "-second",
                displayName.toUpperCase(),
                60.0,
                VerificationMode.NONE
        );

        assertThrows(IllegalStateException.class, () -> repository.save(duplicateName));
    }

    private AccountType createAccountType() {
        return new AccountType(
                typeId,
                displayName,
                33.75,
                VerificationMode.PARTNER
        );
    }

    private int indexOf(List<AccountType> types, String id) {
        for (int index = 0; index < types.size(); index++) {
            if (types.get(index).getAccountTypeId().equals(id)) {
                return index;
            }
        }

        return -1;
    }

    private void deleteType(String id) {
        String sql = "DELETE FROM account_types WHERE account_type_id = ?";

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            throw new IllegalStateException("AI test cleanup failed.", exception);
        }
    }
}