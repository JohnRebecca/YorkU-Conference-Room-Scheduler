package scheduler.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdministratorAITest {

    @Test
    public void constructorStoresAllNormalValues() {
        Administrator admin = new Administrator(
                101,
                "Saif Khan",
                "saif@yorku.ca",
                "Password1!"
        );

        assertEquals(101, admin.getAdminID());
        assertEquals("Saif Khan", admin.getName());
        assertEquals("saif@yorku.ca", admin.getEmail());
        assertEquals("Password1!", admin.getPassword());
    }

    @Test
    public void administratorIdCanBeZeroBecauseModelHasNoValidation() {
        Administrator admin = new Administrator(
                0,
                "Zero ID Admin",
                "zero@yorku.ca",
                "Password1!"
        );

        assertEquals(0, admin.getAdminID());
    }

    @Test
    public void administratorIdCanBeNegativeBecauseModelHasNoValidation() {
        Administrator admin = new Administrator(
                -1,
                "Negative ID Admin",
                "negative@yorku.ca",
                "Password1!"
        );

        assertEquals(-1, admin.getAdminID());
    }

    @Test
    public void administratorCanStoreMaximumIntegerId() {
        Administrator admin = new Administrator(
                Integer.MAX_VALUE,
                "Maximum ID Admin",
                "maximum@yorku.ca",
                "Password1!"
        );

        assertEquals(Integer.MAX_VALUE, admin.getAdminID());
    }

    @Test
    public void nullNameIsPreservedBecauseConstructorDoesNotValidate() {
        Administrator admin = new Administrator(
                102,
                null,
                "nullname@yorku.ca",
                "Password1!"
        );

        assertNull(admin.getName());
    }

    @Test
    public void emptyNameIsPreservedBecauseConstructorDoesNotValidate() {
        Administrator admin = new Administrator(
                103,
                "",
                "emptyname@yorku.ca",
                "Password1!"
        );

        assertEquals("", admin.getName());
    }

    @Test
    public void nullEmailIsPreservedBecauseConstructorDoesNotValidate() {
        Administrator admin = new Administrator(
                104,
                "Null Email Admin",
                null,
                "Password1!"
        );

        assertNull(admin.getEmail());
    }

    @Test
    public void emptyEmailIsPreservedBecauseConstructorDoesNotValidate() {
        Administrator admin = new Administrator(
                105,
                "Empty Email Admin",
                "",
                "Password1!"
        );

        assertEquals("", admin.getEmail());
    }

    @Test
    public void nullPasswordIsPreservedBecauseConstructorDoesNotValidate() {
        Administrator admin = new Administrator(
                106,
                "Null Password Admin",
                "nullpassword@yorku.ca",
                null
        );

        assertNull(admin.getPassword());
    }

    @Test
    public void emptyPasswordIsPreservedBecauseConstructorDoesNotValidate() {
        Administrator admin = new Administrator(
                107,
                "Empty Password Admin",
                "emptypassword@yorku.ca",
                ""
        );

        assertEquals("", admin.getPassword());
    }

    @Test
    public void twoAdministratorsMaintainIndependentValues() {
        Administrator first = new Administrator(
                108,
                "First Admin",
                "first@yorku.ca",
                "FirstPassword!"
        );

        Administrator second = new Administrator(
                109,
                "Second Admin",
                "second@yorku.ca",
                "SecondPassword!"
        );

        assertEquals(108, first.getAdminID());
        assertEquals("First Admin", first.getName());

        assertEquals(109, second.getAdminID());
        assertEquals("Second Admin", second.getName());

        assertNotEquals(first.getAdminID(), second.getAdminID());
        assertNotEquals(first.getEmail(), second.getEmail());
    }
}