package scheduler.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdministratorTest {

    private Administrator admin;

    @Before
    public void setUp() {
        admin = new Administrator(
                101,
                "John Smith",
                "john@yorku.ca",
                "password123"
        );
    }

    @Test
    public void constructorStoresAdminID() {
        assertEquals(101, admin.getAdminID());
    }

    @Test
    public void constructorStoresName() {
        assertEquals("John Smith", admin.getName());
    }

    @Test
    public void constructorStoresEmail() {
        assertEquals("john@yorku.ca", admin.getEmail());
    }

    @Test
    public void constructorStoresPassword() {
        assertEquals("password123", admin.getPassword());
    }

    @Test
    public void differentAdministratorHasDifferentID() {
        Administrator admin2 = new Administrator(
                202,
                "Jane Doe",
                "jane@yorku.ca",
                "secret"
        );

        assertNotEquals(admin.getAdminID(), admin2.getAdminID());
    }

    @Test
    public void differentAdministratorHasDifferentName() {
        Administrator admin2 = new Administrator(
                202,
                "Jane Doe",
                "jane@yorku.ca",
                "secret"
        );

        assertNotEquals(admin.getName(), admin2.getName());
    }

    @Test
    public void emailIsStoredCorrectly() {
        assertTrue(admin.getEmail().contains("@"));
    }

    @Test
    public void passwordIsNotNull() {
        assertNotNull(admin.getPassword());
    }

    @Test
    public void nameIsNotEmpty() {
        assertFalse(admin.getName().isEmpty());
    }

    @Test
    public void adminIDIsPositive() {
        assertTrue(admin.getAdminID() > 0);
    }
}