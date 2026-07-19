package scheduler.util;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public final class PasswordHasher {

    private static final int ITERATIONS = 120_000;
    private static final int SALT_BYTES = 16;
    private static final int KEY_BITS = 256;
    private static final SecureRandom RANDOM = new SecureRandom();

    private PasswordHasher() {
    }

    public static String hash(String rawPassword) {
        if (rawPassword == null) {
            throw new IllegalArgumentException("Password cannot be null.");
        }

        byte[] salt = new byte[SALT_BYTES];
        RANDOM.nextBytes(salt);

        byte[] hash = derive(rawPassword.toCharArray(), salt, ITERATIONS);

        return ITERATIONS
                + ":"
                + Base64.getEncoder().encodeToString(salt)
                + ":"
                + Base64.getEncoder().encodeToString(hash);
    }

    public static boolean verify(String rawPassword, String storedValue) {
        if (rawPassword == null || storedValue == null) {
            return false;
        }
        String[] parts = storedValue.split(":");
        if (parts.length != 3) {
            return false;
        }
        try {
            int iterations = Integer.parseInt(parts[0]);
            byte[] salt = Base64.getDecoder().decode(parts[1]);
            byte[] expectedHash = Base64.getDecoder().decode(parts[2]);
            byte[] actualHash = derive(
                    rawPassword.toCharArray(),
                    salt,
                    iterations
            );

            return MessageDigest.isEqual(expectedHash, actualHash);

        } catch (IllegalArgumentException exception) {
            return false;
        }
    }

    private static byte[] derive( char[] password, byte[] salt, int iterations) {
        PBEKeySpec specification = new PBEKeySpec( password, salt, iterations, KEY_BITS );

        try {
            SecretKeyFactory factory = SecretKeyFactory.getInstance( "PBKDF2WithHmacSHA256");

            return factory.generateSecret(specification).getEncoded();

        } catch (GeneralSecurityException exception) {
            throw new IllegalStateException( "Password hashing is unavailable.", exception);

        } finally {
            specification.clearPassword();
        }
    }
}