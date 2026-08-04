package scheduler.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailValidatorTest {

    @Test
    void validEmailReturnsTrue() {
        assertTrue(EmailValidator.isValidFormat("user@example.com"));
    }

    @Test
    void yorkEmailReturnsTrue() {
        assertTrue(EmailValidator.isValidFormat("abc@my.yorku.ca"));
    }

    @Test
    void invalidEmailReturnsFalse() {
        assertFalse(EmailValidator.isValidFormat("invalid-email"));
    }

    @Test
    void nullEmailReturnsFalse() {
        assertFalse(EmailValidator.isValidFormat(null));
    }

    @Test
    void emailWithoutDomainReturnsFalse() {
        assertFalse(EmailValidator.isValidFormat("user@"));
    }
}