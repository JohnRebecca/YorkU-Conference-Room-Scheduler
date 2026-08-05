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

public class AdminDAOAITest {

    private static final int TEST_ID_START = 9800;
    private static final String TEST_EMAIL_SUFFIX = "@ai-admin-test.local";

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
        String email = "admin9801" + TEST_EMAIL_SUFFIX;

        Administrator admin = new Administrator(
                9801,
                "AI Test Admin",
                email,
                "Password1!"
        );

        adminDAO.insertAdmin(admin);

        assertTrue(adminDAO.findByEmail(email).isPresent());
    }

    @Test
    public void insertedAdministratorPreservesId() {
        String email = "admin9802" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9802,
                "ID Test Admin",
                email,
                "Password2!"
        ));

        Administrator stored = adminDAO.findByEmail(email).get();

        assertEquals(9802, stored.getAdminID());
    }

    @Test
    public void insertedAdministratorPreservesName() {
        String email = "admin9803" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9803,
                "Stored Name Admin",
                email,
                "Password3!"
        ));

        Administrator stored = adminDAO.findByEmail(email).get();

        assertEquals("Stored Name Admin", stored.getName());
    }

    @Test
    public void insertedAdministratorPreservesEmail() {
        String email = "admin9804" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9804,
                "Email Test Admin",
                email,
                "Password4!"
        ));

        Administrator stored = adminDAO.findByEmail(email).get();

        assertEquals(email, stored.getEmail());
    }

    @Test
    public void insertedAdministratorPreservesPassword() {
        String email = "admin9805" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9805,
                "Password Test Admin",
                email,
                "Password5!"
        ));

        Administrator stored = adminDAO.findByEmail(email).get();

        assertEquals("Password5!", stored.getPassword());
    }

    @Test
    public void findByEmailReturnsEmptyForMissingAdministrator() {
        Optional<Administrator> result =
                adminDAO.findByEmail("missing" + TEST_EMAIL_SUFFIX);

        assertFalse(result.isPresent());
    }

    @Test
    public void emailExistsReturnsTrueForStoredAdministrator() {
        String email = "admin9806" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9806,
                "Exists Test Admin",
                email,
                "Password6!"
        ));

        assertTrue(adminDAO.emailExists(email));
    }

    @Test
    public void emailExistsReturnsFalseForMissingAdministrator() {
        assertFalse(
                adminDAO.emailExists("unknown" + TEST_EMAIL_SUFFIX)
        );
    }

    @Test
    public void multipleAdministratorsCanBeStored() {
        String firstEmail = "admin9807" + TEST_EMAIL_SUFFIX;
        String secondEmail = "admin9808" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9807,
                "First AI Admin",
                firstEmail,
                "Password7!"
        ));

        adminDAO.insertAdmin(new Administrator(
                9808,
                "Second AI Admin",
                secondEmail,
                "Password8!"
        ));

        assertTrue(adminDAO.findByEmail(firstEmail).isPresent());
        assertTrue(adminDAO.findByEmail(secondEmail).isPresent());
    }

    @Test
    public void duplicateAdministratorIdLeavesOriginalRecord() {
        String originalEmail = "admin9809" + TEST_EMAIL_SUFFIX;
        String duplicateEmail = "duplicate9809" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9809,
                "Original Admin",
                originalEmail,
                "OriginalPassword!"
        ));

        adminDAO.insertAdmin(new Administrator(
                9809,
                "Duplicate ID Admin",
                duplicateEmail,
                "DuplicatePassword!"
        ));

        assertTrue(adminDAO.findByEmail(originalEmail).isPresent());
        assertFalse(adminDAO.findByEmail(duplicateEmail).isPresent());
    }

    @Test
    public void duplicateEmailLeavesOriginalRecord() {
        String email = "admin9810" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9810,
                "Original Email Admin",
                email,
                "OriginalPassword!"
        ));

        adminDAO.insertAdmin(new Administrator(
                9811,
                "Duplicate Email Admin",
                email,
                "DuplicatePassword!"
        ));

        Administrator stored = adminDAO.findByEmail(email).get();

        assertEquals(9810, stored.getAdminID());
        assertEquals("Original Email Admin", stored.getName());
        assertEquals("OriginalPassword!", stored.getPassword());
    }

    @Test
    public void findByEmailUsesExactCaseWithCurrentSchema() {
        String email = "admin9812" + TEST_EMAIL_SUFFIX;

        adminDAO.insertAdmin(new Administrator(
                9812,
                "Case Test Admin",
                email,
                "Password12!"
        ));

        Optional<Administrator> result =
                adminDAO.findByEmail(email.toUpperCase());

        assertFalse(result.isPresent());
    }

    private static void deleteTestAdministrators()
            throws SQLException {

        String sql = """
                DELETE FROM administrators
                WHERE admin_id >= ?
                   OR email LIKE ?
                """;

        try (
                Connection connection =
                        DatabaseManager.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ) {
            statement.setInt(1, TEST_ID_START);
            statement.setString(2, "%" + TEST_EMAIL_SUFFIX);
            statement.executeUpdate();
        }
    }
}