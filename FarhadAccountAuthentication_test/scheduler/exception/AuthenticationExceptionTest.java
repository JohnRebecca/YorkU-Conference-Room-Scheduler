package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AuthenticationExceptionTest {

    @Test
    void constructorStoresMessage() {
        AuthenticationException exception = new AuthenticationException("The password is incorrect.");

        assertEquals("The password is incorrect.", exception.getMessage());
    }

    @Test
    void authenticationExceptionIsAnAccountException() {
        AuthenticationException exception = new AuthenticationException("Authentication failed");

        assertInstanceOf(AccountException.class, exception);
    }
}