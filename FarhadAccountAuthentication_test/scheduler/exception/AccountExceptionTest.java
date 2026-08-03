package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountExceptionTest {

    @Test
    void constructorStoresMessage() {
        AccountException exception = new AccountException("Account error");

        assertEquals("Account error", exception.getMessage());
    }

    @Test
    void constructorStoresMessageAndCause() {
        RuntimeException cause = new RuntimeException("Database failure");
        AccountException exception = new AccountException("Account error", cause);

        assertEquals("Account error", exception.getMessage());
        assertSame(cause, exception.getCause());
    }

    @Test
    void exceptionCanBeThrownAndCaught() {
        AccountException exception = assertThrows(
                AccountException.class,
                () -> {
                    throw new AccountException("Test failure");
                }
        );

        assertEquals("Test failure", exception.getMessage());
    }
}