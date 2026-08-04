package scheduler.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordHasherTest {

    @Test
    void hashCreatesDifferentValueThanOriginalPassword() {
        String password = "Password1!";
        String hash = PasswordHasher.hash(password);

        assertNotEquals(password, hash);
    }

    @Test
    void verifyReturnsTrueForCorrectPassword() {
        String password = "Password1!";
        String hash = PasswordHasher.hash(password);

        assertTrue(PasswordHasher.verify(password, hash));
    }

    @Test
    void verifyReturnsFalseForWrongPassword() {
        String hash = PasswordHasher.hash("Password1!");
        assertFalse(PasswordHasher.verify("WrongPassword1!", hash));
    }

    @Test
    void hashingSamePasswordProducesDifferentHashes() {
        String hash1 = PasswordHasher.hash("Password1!");
        String hash2 = PasswordHasher.hash("Password1!");

        assertNotEquals(hash1, hash2);
    }

    @Test
    void verifyReturnsFalseForMalformedHash() {
        assertFalse(PasswordHasher.verify("Password1!", "invalid"));
    }

    @Test
    void hashThrowsExceptionForNullPassword() {
        assertThrows(IllegalArgumentException.class, () -> PasswordHasher.hash(null));
    }
}