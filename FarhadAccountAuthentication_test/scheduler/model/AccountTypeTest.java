package scheduler.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTypeTest {

    @Test
    void constructorStoresProvidedValues() {
        AccountType type = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);

        assertEquals("student", type.getAccountTypeId());
        assertEquals("Student", type.getName());
        assertEquals(20.0, type.getHourlyRate());
        assertEquals(VerificationMode.UNIVERSITY, type.getVerificationMode());
    }

    @Test
    void constructorRejectsNullAccountTypeId() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new AccountType(null, "Student", 20.0, VerificationMode.UNIVERSITY));

        assertEquals("Account type ID is required.", exception.getMessage());
    }

    @Test
    void constructorRejectsBlankAccountTypeId() {
        assertThrows( IllegalArgumentException.class,
                () -> new AccountType("   ", "Student", 20.0, VerificationMode.UNIVERSITY));
    }

    @Test
    void constructorRejectsNullName() {
        IllegalArgumentException exception = assertThrows( IllegalArgumentException.class,
                () -> new AccountType("student", null, 20.0, VerificationMode.UNIVERSITY));
        assertEquals("Account type name is required.", exception.getMessage());
    }

    @Test
    void constructorRejectsBlankName() {
        assertThrows( IllegalArgumentException.class,
                () -> new AccountType("student", " ", 20.0, VerificationMode.UNIVERSITY));
    }

    @Test
    void constructorAcceptsZeroHourlyRate() {
        AccountType type = new AccountType("free", "Free", 0.0, VerificationMode.NONE);

        assertEquals(0.0, type.getHourlyRate());
    }

    @Test
    void constructorRejectsNegativeHourlyRate() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new AccountType("invalid", "Invalid", -0.01, VerificationMode.NONE));

        assertEquals("Hourly rate cannot be negative.", exception.getMessage());
    }

    @Test
    void constructorRejectsNullVerificationMode() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> new AccountType("student", "Student", 20.0, null));
        assertEquals("Verification mode is required.", exception.getMessage());
    }

    @Test
    void universityModeRequiresVerification() {
        AccountType type = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);
        assertTrue(type.requiresVerification());
    }

    @Test
    void partnerModeRequiresVerification() {
        AccountType type = new AccountType("partner", "Partner", 50.0, VerificationMode.PARTNER);
        assertTrue(type.requiresVerification());
    }

    @Test
    void noneModeDoesNotRequireVerification() {
        AccountType type = new AccountType("guest", "Guest", 10.0, VerificationMode.NONE);
        assertFalse(type.requiresVerification());
    }

    @Test
    void accountTypesWithSameIdAreEqual() {
        AccountType first = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);
        AccountType second = new AccountType("student", "Different Name", 99.0, VerificationMode.NONE);
        assertEquals(first, second);
    }

    @Test
    void accountTypesWithDifferentIdsAreNotEqual() {
        AccountType first = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);
        AccountType second = new AccountType("faculty", "Faculty", 30.0, VerificationMode.UNIVERSITY);

        assertNotEquals(first, second);
    }

    @Test
    void equalAccountTypesHaveEqualHashCodes() {
        AccountType first = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);
        AccountType second = new AccountType("student", "Another Student Type", 25.0, VerificationMode.NONE);

        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    void accountTypeIsNotEqualToNullOrDifferentObjectType() {
        AccountType type = new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);

        assertNotEquals(null, type);
        assertNotEquals("student", type);
    }

    @Test
    void toStringFormatsNameAndHourlyRate() {
        AccountType type = new AccountType("faculty", "Faculty", 30.0, VerificationMode.UNIVERSITY);
        assertEquals("Faculty ($30.00/hour)", type.toString());
    }

    @Test
    void toStringRoundsHourlyRateToTwoDecimalPlaces() {
        AccountType type = new AccountType("custom", "Custom", 12.345, VerificationMode.NONE);
        assertEquals("Custom ($12.35/hour)", type.toString());
    }
}