package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificationExceptionAITest {

    @Test
    void storesVerificationFailureMessage() {
        VerificationException exception =
                new VerificationException("University verification failed.");

        assertEquals("University verification failed.", exception.getMessage());
    }

    @Test
    void isAnAccountException() {
        VerificationException exception =
                new VerificationException("Invalid identification");

        assertInstanceOf(AccountException.class, exception);
    }

    @Test
    void canBeThrownAsVerificationException() {
        VerificationException exception = assertThrows(
                VerificationException.class,
                () -> {
                    throw new VerificationException("Invalid organization ID");
                }
        );

        assertEquals("Invalid organization ID", exception.getMessage());
    }
}