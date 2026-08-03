package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountExceptionAITest {

    @Test
    void keepsProvidedErrorMessage() {
        AccountException exception = new AccountException("Registration failed");

        assertEquals("Registration failed", exception.getMessage());
    }

    @Test
    void keepsOriginalCause() {
        IllegalStateException cause = new IllegalStateException("Storage unavailable");
        AccountException exception = new AccountException("Could not create account", cause);

        assertSame(cause, exception.getCause());
    }

    @Test
    void supportsNullMessage() {
        AccountException exception = new AccountException(null);

        assertNull(exception.getMessage());
    }

    @Test
    void canBeHandledAsCheckedException() {
        Exception exception = new AccountException("Account problem");

        assertInstanceOf(Exception.class, exception);
    }
}