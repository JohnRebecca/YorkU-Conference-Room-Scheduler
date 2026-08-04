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

public class ChiefEventCoordinatorTest {

    private static final int TEST_ID_START = 9500;
    private static final String TEST_SUFFIX = "@cec-test.local";

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
    public void getInstanceReturnsNonNullObject() {
        assertNotNull(ChiefEventCoordinator.getInstance());
    }

    @Test
    public void getInstanceReturnsChiefEventCoordinator() {
        assertTrue(
                ChiefEventCoordinator.getInstance()
                        instanceof ChiefEventCoordinator
        );
    }

    @Test
    public void repeatedCallsReturnSameInstance() {
        ChiefEventCoordinator first =
                ChiefEventCoordinator.getInstance();

        ChiefEventCoordinator second =
                ChiefEventCoordinator.getInstance();

        assertSame(first, second);
    }

    @Test
    public void tenCallsReturnSameInstance() {
        ChiefEventCoordinator original =
                ChiefEventCoordinator.getInstance();

        for (int i = 0; i < 10; i++) {
            assertSame(
                    original,
                    ChiefEventCoordinator.getInstance()
            );
        }
    }

    @Test
    public void singletonIdentityHashCodeRemainsSame() {
        int firstHash = System.identityHashCode(
                ChiefEventCoordinator.getInstance()
        );

        int secondHash = System.identityHashCode(
                ChiefEventCoordinator.getInstance()
        );

        assertEquals(firstHash, secondHash);
    }

    @Test
    public void generateAdministratorStoresAdministrator() {
        String email = "cec9501" + TEST_SUFFIX;

        Administrator admin = new Administrator(
                9501,
                "Generated Admin",
                email,
                "Password1!"
        );

        coordinator.generateAdministrator(admin);

        assertTrue(adminDAO.findByEmail(email).isPresent());
    }

    @Test
    public void generatedAdministratorPreservesId() {
        String email = "cec9502" + TEST_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9502,
                        "ID Test Admin",
                        email,
                        "Password2!"
                )
        );

        Administrator stored =
                adminDAO.findByEmail(email).get();

        assertEquals(9502, stored.getAdminID());
    }

    @Test
    public void generatedAdministratorPreservesName() {
        String email = "cec9503" + TEST_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9503,
                        "Name Test Admin",
                        email,
                        "Password3!"
                )
        );

        Administrator stored =
                adminDAO.findByEmail(email).get();

        assertEquals("Name Test Admin", stored.getName());
    }

    @Test
    public void generatedAdministratorPreservesEmail() {
        String email = "cec9504" + TEST_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9504,
                        "Email Test Admin",
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
        String email = "cec9505" + TEST_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9505,
                        "Password Test Admin",
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
        String firstEmail = "cec9506" + TEST_SUFFIX;
        String secondEmail = "cec9507" + TEST_SUFFIX;

        coordinator.generateAdministrator(
                new Administrator(
                        9506,
                        "First Generated Admin",
                        firstEmail,
                        "Password6!"
                )
        );

        coordinator.generateAdministrator(
                new Administrator(
                        9507,
                        "Second Generated Admin",
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
            statement.setString(2, "%" + TEST_SUFFIX);
            statement.executeUpdate();
        }
    }
}