package scheduler.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailValidatorAITest {

    @Test
    void acceptsStandardEmailAddress() {
        assertTrue(EmailValidator.isValidFormat("alex.smith@example.com"));
    }

    @Test
    void acceptsYorkUniversityStudentEmail() {
        assertTrue(EmailValidator.isValidFormat("alex99@my.yorku.ca"));
    }

    @Test
    void acceptsEmailContainingPlusSign() {
        assertTrue(EmailValidator.isValidFormat("alex+booking@example.com"));
    }

    @Test
    void acceptsEmailWithSurroundingWhitespace() {
        assertTrue(EmailValidator.isValidFormat("  alex@example.com  "));
    }

    @Test
    void rejectsNullEmailAddress() {
        assertFalse(EmailValidator.isValidFormat(null));
    }

    @Test
    void rejectsEmptyEmailAddress() {
        assertFalse(EmailValidator.isValidFormat(""));
    }

    @Test
    void rejectsEmailWithoutAtSymbol() {
        assertFalse(EmailValidator.isValidFormat("alex.example.com"));
    }

    @Test
    void rejectsEmailWithoutTopLevelDomain() {
        assertFalse(EmailValidator.isValidFormat("alex@example"));
    }

    @Test
    void rejectsEmailWithSpaceInsideAddress() {
        assertFalse(EmailValidator.isValidFormat("alex smith@example.com"));
    }

    @Test
    void rejectsDomainBeginningWithHyphen() {
        assertFalse(EmailValidator.isValidFormat("alex@-example.com"));
    }

    @Test
    void acceptsEmailWithMaximumSupportedLength() {
        String domain = "@example.com";
        String email = "a".repeat(254 - domain.length()) + domain;

        assertEquals(254, email.length());
        assertTrue(EmailValidator.isValidFormat(email));
    }

    @Test
    void rejectsEmailLongerThanMaximumSupportedLength() {
        String domain = "@example.com";
        String email = "a".repeat(255 - domain.length()) + domain;

        assertEquals(255, email.length());
        assertFalse(EmailValidator.isValidFormat(email));
    }
}