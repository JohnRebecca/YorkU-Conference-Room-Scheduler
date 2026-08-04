package scheduler.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTypeAITest {

    @Test
    void createsPartnerTypeWithExpectedProperties() {
        AccountType partner = new AccountType(
                "partner", "External Partner", 50.0, VerificationMode.PARTNER
        );

        assertAll(
                () -> assertEquals("partner", partner.getAccountTypeId()),
                () -> assertEquals("External Partner", partner.getName()),
                () -> assertEquals(50.0, partner.getHourlyRate()),
                () -> assertEquals(VerificationMode.PARTNER, partner.getVerificationMode())
        );
    }

    @Test
    void freeAccountTypeMayHaveZeroRate() {
        AccountType freeType = new AccountType(
                "visitor", "Visitor", 0.0, VerificationMode.NONE
        );

        assertEquals(0.0, freeType.getHourlyRate());
        assertFalse(freeType.requiresVerification());
    }

    @Test
    void whitespaceOnlyIdIsRejected() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new AccountType("\t", "Visitor", 5.0, VerificationMode.NONE)
        );

        assertEquals("Account type ID is required.", exception.getMessage());
    }

    @Test
    void whitespaceOnlyDisplayNameIsRejected() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new AccountType("visitor", "\n", 5.0, VerificationMode.NONE)
        );

        assertEquals("Account type name is required.", exception.getMessage());
    }

    @Test
    void slightlyNegativeRateIsRejected() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new AccountType("invalid", "Invalid", -0.001, VerificationMode.NONE)
        );
    }

    @Test
    void missingVerificationModeIsRejected() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> new AccountType("visitor", "Visitor", 5.0, null)
        );

        assertEquals("Verification mode is required.", exception.getMessage());
    }

    @Test
    void universityAndPartnerTypesBothRequireVerification() {
        AccountType faculty = new AccountType(
                "faculty", "Faculty", 30.0, VerificationMode.UNIVERSITY
        );
        AccountType partner = new AccountType(
                "partner", "Partner", 50.0, VerificationMode.PARTNER
        );

        assertTrue(faculty.requiresVerification());
        assertTrue(partner.requiresVerification());
    }

    @Test
    void equalityDependsOnlyOnAccountTypeId() {
        AccountType original = new AccountType(
                "staff", "Staff", 40.0, VerificationMode.UNIVERSITY
        );
        AccountType changedDetails = new AccountType(
                "staff", "Administrative Staff", 45.0, VerificationMode.NONE
        );

        assertEquals(original, changedDetails);
        assertEquals(original.hashCode(), changedDetails.hashCode());
    }

    @Test
    void differentIdsAreNotEqualEvenWhenOtherValuesMatch() {
        AccountType first = new AccountType(
                "researcher", "Researcher", 25.0, VerificationMode.NONE
        );
        AccountType second = new AccountType(
                "researcher-two", "Researcher", 25.0, VerificationMode.NONE
        );

        assertNotEquals(first, second);
    }

    @Test
    void equalityRejectsUnrelatedObject() {
        AccountType type = new AccountType(
                "faculty", "Faculty", 30.0, VerificationMode.UNIVERSITY
        );

        assertFalse(type.equals("faculty"));
    }

    @Test
    void stringRepresentationIncludesTwoDecimalRate() {
        AccountType type = new AccountType(
                "researcher", "Researcher", 19.5, VerificationMode.NONE
        );

        assertEquals("Researcher ($19.50/hour)", type.toString());
    }

    @Test
    void stringRepresentationRoundsFractionalRate() {
        AccountType type = new AccountType(
                "custom", "Custom Type", 18.999, VerificationMode.NONE
        );

        assertEquals("Custom Type ($19.00/hour)", type.toString());
    }
}