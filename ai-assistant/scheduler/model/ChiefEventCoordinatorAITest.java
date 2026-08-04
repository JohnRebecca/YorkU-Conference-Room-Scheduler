package scheduler.model;

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
import scheduler.repository.AdminDAO;

public class ChiefEventCoordinatorAITest {

    private static final int TEST_ID_START = 9700;
    private static final String TEST_EMAIL_SUFFIX = "@ai-cec-test.local";

    private ChiefEventCoordinator coordinator;
    private AdminDAO adminDAO;

    @BeforeClass
    public static void initializeDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @Before
    public void setUp() throws SQLException {
        deleteTestAdministrators();
        coordinator = ChiefEventCoordinator.getInstance();
        adminDAO = new AdminDAO();
    }

    @After
    public void tearDown() throws SQLException {
        deleteTestAdministrators();
    }

    @Test
    public void getInstanceReturnsNonNullCoordinator() {
        assertNotNull(ChiefEventCoordinator.getInstance());
    }

    @Test
    public void repeatedCallsReturnSameReference() {
        ChiefEventCoordinator first =
                ChiefEventCoordinator.getInstance();

        ChiefEventCoordinator second =
                ChiefEventCoordinator.getInstance();

        assertSame(first, second);
    }

    @Test
    public void coordinatorFromSetUpMatchesGlobalSingleton() {
        assertSame(
                coordinator,
                ChiefEventCoordinator.getInstance()
        );
    }

    @Test
    public void manyCallsContinueReturningSameInstance() {
        ChiefEventCoordinator expected =
                ChiefEventCoordinator.getInstance();

        for (int i = 0; i < 25; i++) {
            assertSame(
                    expected,
                    ChiefEventCoordinator.getInstance()
            );
        }
    }

    @Test
    public void singletonIdentityHashCodeDoesNotChange() {
        int firstHash = System.identityHashCode(
                ChiefEventCoordinator.getInstance()
        );

        int secondHash = System.identityHashCode(
                ChiefEventCoordinator.getInstance()
        );

        assertEquals(firstHash, secondHash);
    }

    @Test
    public void generateAdministratorStoresRecord() {
        String email = "admin9701" + TEST_EMAIL_SUFFIX;

        Administrator admin = new Administrator(
                9701,
                "AI Generated Admin",
                email,
                "Password1!"
        );

        coordinator.generateAdministrator(admin);

        assertTrue(adminDAO.findByEmail(email).isPresent());
    }

    @Test
    public void generatedAdministratorPreservesId() {
        String email = "admin9702" + TEST_EMAIL_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9702,
                        "ID Admin",
                        email,
                        "Password2!"
                )
        );

        Administrator stored =
                adminDAO.findByEmail(email).get();

        assertEquals(9702, stored.getAdminID());
    }

    @Test
    public void generatedAdministratorPreservesName() {
        String email = "admin9703" + TEST_EMAIL_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9703,
                        "Stored Name Admin",
                        email,
                        "Password3!"
                )
        );

        Administrator stored =
                adminDAO.findByEmail(email).get();

        assertEquals("Stored Name Admin", stored.getName());
    }

    @Test
    public void generatedAdministratorPreservesEmail() {
        String email = "admin9704" + TEST_EMAIL_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9704,
                        "Email Admin",
                        email,
                        "Password4!"
                )
        );

        Administrator stored =
                adminDAO.findByEmail(email).get();

        assertEquals(email, stored.getEmail());
    }

    @Test
    public void generatedAdministratorPreservesPassword() {
        String email = "admin9705" + TEST_EMAIL_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9705,
                        "Password Admin",
                        email,
                        "Password5!"
                )
        );

        Administrator stored =
                adminDAO.findByEmail(email).get();

        assertEquals("Password5!", stored.getPassword());
    }

    @Test
    public void coordinatorCanGenerateMultipleAdministrators() {
        String firstEmail = "admin9706" + TEST_EMAIL_SUFFIX;
        String secondEmail = "admin9707" + TEST_EMAIL_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9706,
                        "First AI Admin",
                        firstEmail,
                        "Password6!"
                )
        );

        coordinator.generateAdministrator(
                new Administrator(
                        9707,
                        "Second AI Admin",
                        secondEmail,
                        "Password7!"
                )
        );

        Optional<Administrator> first =
                adminDAO.findByEmail(firstEmail);

        Optional<Administrator> second =
                adminDAO.findByEmail(secondEmail);

        assertTrue(first.isPresent());
        assertTrue(second.isPresent());
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
            statement.setString(
                    2,
                    "%" + TEST_EMAIL_SUFFIX
            );

            statement.executeUpdate();
        }
    }
}