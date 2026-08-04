package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificationExceptionTest {

    @Test
    void constructorStoresMessage() {
        VerificationException exception = new VerificationException("Account verification failed.");
        assertEquals("Account verification failed.", exception.getMessage());
    }

    @Test
    void verificationExceptionIsAnAccountException() {
        VerificationException exception = new VerificationException("Verification error");

        assertInstanceOf(AccountException.class, exception);
    }
}