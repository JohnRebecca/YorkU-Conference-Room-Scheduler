package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AuthenticationExceptionAITest {

    @Test
    void preservesAuthenticationFailureMessage() {
        AuthenticationException exception =
                new AuthenticationException("Login credentials are invalid.");

        assertEquals("Login credentials are invalid.", exception.getMessage());
    }

    @Test
    void inheritsFromAccountException() {
        AuthenticationException exception =
                new AuthenticationException("Authentication failed");

        assertTrue(exception instanceof AccountException);
    }

    @Test
    void canBeCaughtUsingParentExceptionType() {
        AccountException result = assertThrows(
                AccountException.class,
                () -> {
                    throw new AuthenticationException("Login failed");
                }
        );

        assertEquals("Login failed", result.getMessage());
    }
}