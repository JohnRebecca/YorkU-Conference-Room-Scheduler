package scheduler.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    @Test
    void strongPasswordReturnsTrue() {
        assertTrue(PasswordValidator.isStrong("Password1!"));
    }

    @Test
    void shortPasswordReturnsFalse() {
        assertFalse(PasswordValidator.isStrong("Ab1!"));
    }

    @Test
    void passwordWithoutUppercaseReturnsFalse() {
        assertFalse(PasswordValidator.isStrong("password1!"));
    }

    @Test
    void passwordWithoutLowercaseReturnsFalse() {
        assertFalse(PasswordValidator.isStrong("PASSWORD1!"));
    }

    @Test
    void passwordWithoutDigitReturnsFalse() {
        assertFalse(PasswordValidator.isStrong("Password!"));
    }

    @Test
    void passwordWithoutSpecialCharacterReturnsFalse() {
        assertFalse(PasswordValidator.isStrong("Password1"));
    }

    @Test
    void requirementsMessageContainsMinimumLength() {
        assertTrue(PasswordValidator.requirementsMessage().contains("8"));
    }
}