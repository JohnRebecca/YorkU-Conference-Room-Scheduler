package scheduler.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidatorAITest {

    @Test
    void acceptsPasswordMeetingEveryRequirement() {
        assertTrue(PasswordValidator.isStrong("Booking9!"));
    }

    @Test
    void acceptsPasswordWithExactlyEightCharacters() {
        String password = "Abcd12!x";

        assertEquals(8, password.length());
        assertTrue(PasswordValidator.isStrong(password));
    }

    @Test
    void rejectsPasswordWithSevenCharacters() {
        String password = "Abc1!xy";

        assertEquals(7, password.length());
        assertFalse(PasswordValidator.isStrong(password));
    }

    @Test
    void rejectsNullPassword() {
        assertFalse(PasswordValidator.isStrong(null));
    }

    @Test
    void rejectsEmptyPassword() {
        assertFalse(PasswordValidator.isStrong(""));
    }

    @Test
    void rejectsPasswordWithoutUppercaseLetter() {
        assertFalse(PasswordValidator.isStrong("booking9!"));
    }

    @Test
    void rejectsPasswordWithoutLowercaseLetter() {
        assertFalse(PasswordValidator.isStrong("BOOKING9!"));
    }

    @Test
    void rejectsPasswordWithoutNumber() {
        assertFalse(PasswordValidator.isStrong("Booking!!"));
    }

    @Test
    void rejectsPasswordWithoutSpecialCharacter() {
        assertFalse(PasswordValidator.isStrong("Booking99"));
    }

    @Test
    void acceptsLongStrongPassword() {
        assertTrue(PasswordValidator.isStrong("ConferenceRoom2026#"));
    }

    @Test
    void whitespaceIsTreatedAsSpecialCharacter() {
        assertTrue(PasswordValidator.isStrong("Booking9 "));
    }

    @Test
    void requirementsMessageDescribesAllPasswordRules() {
        String message = PasswordValidator.requirementsMessage();

        assertTrue(message.contains("8 characters"));
        assertTrue(message.contains("uppercase"));
        assertTrue(message.contains("lowercase"));
        assertTrue(message.contains("digit"));
        assertTrue(message.contains("special character"));
    }
}