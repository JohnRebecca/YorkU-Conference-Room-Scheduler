package scheduler.repository;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import scheduler.database.DatabaseManager;
import scheduler.model.Administrator;

public class AdminDAOTest {

    private static final int TEST_ID_START = 9000;
    private static final String TEST_EMAIL_SUFFIX = "@admin-test.local";

    private AdminDAO adminDAO;

    @BeforeClass
    public static void initializeDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @Before
    public void setUp() throws SQLException {
        deleteTestAdministrators();
        adminDAO = new AdminDAO();
    }

    @After
    public void tearDown() throws SQLException {
        deleteTestAdministrators();
    }

    @Test
    public void insertAdminStoresAdministrator() {
        Administrator admin = new Administrator(
                9001,
                "Test Admin One",
                "admin9001" + TEST_EMAIL_SUFFIX,
                "Password1!"
        );

        adminDAO.insertAdmin(admin);

        Optional<Administrator> stored =
                adminDAO.findByEmail("admin9001" + TEST_EMAIL_SUFFIX);

        assertTrue(stored.isPresent());
    }

    @Test
    public void insertedAdministratorPreservesId() {
        Administrator admin = new Administrator(
                9002,
                "Test Admin Two",
                "admin9002" + TEST_EMAIL_SUFFIX,
                "Password2!"
        );

        adminDAO.insertAdmin(admin);

        Administrator stored =
                adminDAO.findByEmail("admin9002" + TEST_EMAIL_SUFFIX).get();

        assertEquals(9002, stored.getAdminID());
    }

    @Test
    public void insertedAdministratorPreservesName() {
        Administrator admin = new Administrator(
                9003,
                "Saif Test Admin",
                "admin9003" + TEST_EMAIL_SUFFIX,
                "Password3!"
        );

        adminDAO.insertAdmin(admin);

        Administrator stored =
                adminDAO.findByEmail("admin9003" + TEST_EMAIL_SUFFIX).get();

        assertEquals("Saif Test Admin", stored.getName());
    }

    @Test
    public void insertedAdministratorPreservesEmail() {
        String email = "admin9004" + TEST_EMAIL_SUFFIX;

        Administrator admin = new Administrator(
                9004,
                "Test Admin Four",
                email,
                "Password4!"
        );

        adminDAO.insertAdmin(admin);

        Administrator stored = adminDAO.findByEmail(email).get();

        assertEquals(email, stored.getEmail());
    }

    @Test
    public void insertedAdministratorPreservesPassword() {
        Administrator admin = new Administrator(
                9005,
                "Test Admin Five",
                "admin9005" + TEST_EMAIL_SUFFIX,
                "Password5!"
        );

        adminDAO.insertAdmin(admin);

        Administrator stored =
                adminDAO.findByEmail("admin9005" + TEST_EMAIL_SUFFIX).get();

        assertEquals("Password5!", stored.getPassword());
    }

    @Test
    public void findByEmailReturnsEmptyForUnknownEmail() {
        Optional<Administrator> result =
                adminDAO.findByEmail("missing" + TEST_EMAIL_SUFFIX);

        assertFalse(result.isPresent());
    }

    @Test
    public void emailExistsReturnsTrueForStoredAdministrator() {
        String email = "admin9006" + TEST_EMAIL_SUFFIX;

        Administrator admin = new Administrator(
                9006,
                "Test Admin Six",
                email,
                "Password6!"
        );

        adminDAO.insertAdmin(admin);

        assertTrue(adminDAO.emailExists(email));
    }

    @Test
    public void emailExistsReturnsFalseForUnknownEmail() {
        assertFalse(
                adminDAO.emailExists("unknown" + TEST_EMAIL_SUFFIX)
        );
    }

    @Test
    public void multipleAdministratorsCanBeStored() {
        Administrator first = new Administrator(
                9007,
                "First Admin",
                "admin9007" + TEST_EMAIL_SUFFIX,
                "Password7!"
        );

        Administrator second = new Administrator(
                9008,
                "Second Admin",
                "admin9008" + TEST_EMAIL_SUFFIX,
                "Password8!"
        );

        adminDAO.insertAdmin(first);
        adminDAO.insertAdmin(second);

        assertTrue(
                adminDAO.findByEmail(
                        "admin9007" + TEST_EMAIL_SUFFIX
                ).isPresent()
        );

        assertTrue(
                adminDAO.findByEmail(
                        "admin9008" + TEST_EMAIL_SUFFIX
                ).isPresent()
        );
    }

    @Test
    public void duplicateAdminIdLeavesOnlyFirstAdministrator() {
        Administrator first = new Administrator(
                9009,
                "Original Admin",
                "admin9009" + TEST_EMAIL_SUFFIX,
                "OriginalPassword!"
        );

        Administrator duplicateId = new Administrator(
                9009,
                "Duplicate Admin",
                "duplicate9009" + TEST_EMAIL_SUFFIX,
                "DuplicatePassword!"
        );

        adminDAO.insertAdmin(first);
        adminDAO.insertAdmin(duplicateId);

        assertTrue(
                adminDAO.findByEmail(
                        "admin9009" + TEST_EMAIL_SUFFIX
                ).isPresent()
        );

        assertFalse(
                adminDAO.findByEmail(
                        "duplicate9009" + TEST_EMAIL_SUFFIX
                ).isPresent()
        );
    }

    @Test
    public void duplicateEmailLeavesOnlyFirstAdministrator() {
        String email = "admin9010" + TEST_EMAIL_SUFFIX;

        Administrator first = new Administrator(
                9010,
                "Original Admin",
                email,
                "OriginalPassword!"
        );

        Administrator duplicateEmail = new Administrator(
                9011,
                "Duplicate Email Admin",
                email,
                "DuplicatePassword!"
        );

        adminDAO.insertAdmin(first);
        adminDAO.insertAdmin(duplicateEmail);

        Optional<Administrator> stored = adminDAO.findByEmail(email);

        assertTrue(stored.isPresent());
        assertEquals(9010, stored.get().getAdminID());
        assertEquals("Original Admin", stored.get().getName());
    }

    @Test
    public void findByEmailIsCaseSensitiveWithCurrentQuery() {
        String email = "admin9012" + TEST_EMAIL_SUFFIX;

        Administrator admin = new Administrator(
                9012,
                "Case Test Admin",
                email,
                "Password12!"
        );

        adminDAO.insertAdmin(admin);

        Optional<Administrator> result =
                adminDAO.findByEmail(email.toUpperCase());

        assertFalse(result.isPresent());
    }

    private static void deleteTestAdministrators() throws SQLException {
        String sql = """
                DELETE FROM administrators
                WHERE admin_id >= ?
                   OR email LIKE ?
                """;

        try (
                Connection connection = DatabaseManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, TEST_ID_START);
            statement.setString(2, "%" + TEST_EMAIL_SUFFIX);
            statement.executeUpdate();
        }
    }
}