package scheduler.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Base64;

import org.junit.jupiter.api.Test;

class PasswordHasherAITest {

    @Test
    void generatedHashDoesNotContainPlainPassword() {
        String password = "Booking9!";
        String storedValue = PasswordHasher.hash(password);

        assertNotEquals(password, storedValue);
        assertFalse(storedValue.contains(password));
    }

    @Test
    void correctPasswordMatchesGeneratedHash() {
        String storedValue = PasswordHasher.hash("Booking9!");

        assertTrue(PasswordHasher.verify("Booking9!", storedValue));
    }

    @Test
    void incorrectPasswordDoesNotMatchGeneratedHash() {
        String storedValue = PasswordHasher.hash("Booking9!");

        assertFalse(PasswordHasher.verify("Different9!", storedValue));
    }

    @Test
    void samePasswordProducesDifferentStoredValues() {
        String first = PasswordHasher.hash("Booking9!");
        String second = PasswordHasher.hash("Booking9!");

        assertNotEquals(first, second);
    }

    @Test
    void bothRandomlySaltedHashesCanVerifyOriginalPassword() {
        String first = PasswordHasher.hash("Booking9!");
        String second = PasswordHasher.hash("Booking9!");

        assertTrue(PasswordHasher.verify("Booking9!", first));
        assertTrue(PasswordHasher.verify("Booking9!", second));
    }

    @Test
    void generatedValueContainsThreeParts() {
        String storedValue = PasswordHasher.hash("Booking9!");
        String[] parts = storedValue.split(":");

        assertEquals(3, parts.length);
    }

    @Test
    void generatedValueContainsConfiguredIterationCount() {
        String[] parts = PasswordHasher.hash("Booking9!").split(":");

        assertEquals("120000", parts[0]);
    }

    @Test
    void generatedSaltUsesSixteenBytes() {
        String[] parts = PasswordHasher.hash("Booking9!").split(":");
        byte[] salt = Base64.getDecoder().decode(parts[1]);

        assertEquals(16, salt.length);
    }

    @Test
    void rejectsMalformedStoredValue() {
        assertFalse(PasswordHasher.verify("Booking9!", "invalid-hash"));
    }

    @Test
    void rejectsStoredValueWithInvalidIterationCount() {
        String invalid = "not-number:c2FsdA==:aGFzaA==";

        assertFalse(PasswordHasher.verify("Booking9!", invalid));
    }

    @Test
    void rejectsStoredValueWithInvalidBase64() {
        String invalid = "120000:not-base64:not-base64";

        assertFalse(PasswordHasher.verify("Booking9!", invalid));
    }

    @Test
    void verifyReturnsFalseWhenPasswordIsNull() {
        String storedValue = PasswordHasher.hash("Booking9!");

        assertFalse(PasswordHasher.verify(null, storedValue));
    }

    @Test
    void verifyReturnsFalseWhenStoredValueIsNull() {
        assertFalse(PasswordHasher.verify("Booking9!", null));
    }

    @Test
    void hashRejectsNullPassword() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordHasher.hash(null)
        );

        assertEquals("Password cannot be null.", exception.getMessage());
    }

    @Test
    void modifiedHashNoLongerMatchesPassword() {
        String storedValue = PasswordHasher.hash("Booking9!");
        String[] parts = storedValue.split(":");

        byte[] hash = Base64.getDecoder().decode(parts[2]);
        hash[0] = (byte) (hash[0] + 1);

        String modifiedValue = parts[0] + ":" + parts[1] + ":"
                + Base64.getEncoder().encodeToString(hash);

        assertFalse(PasswordHasher.verify("Booking9!", modifiedValue));
    }
}