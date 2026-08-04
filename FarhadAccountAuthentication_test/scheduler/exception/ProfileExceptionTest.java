package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfileExceptionTest {

    @Test
    void constructorStoresMessage() {
        ProfileException exception = new ProfileException("Profile update failed.");

        assertEquals("Profile update failed.", exception.getMessage());
    }

    @Test
    void constructorStoresMessageAndCause() {
        RuntimeException cause = new RuntimeException("Database failure");
        ProfileException exception = new ProfileException("Profile could not be saved.", cause);

        assertEquals("Profile could not be saved.", exception.getMessage());
        assertSame(cause, exception.getCause());
    }

    @Test
    void profileExceptionIsAnAccountException() {
        ProfileException exception = new ProfileException("Profile error");

        assertInstanceOf(AccountException.class, exception);
    }

    @Test
    void exceptionCanBeThrownAndCaughtAsProfileException() {
        ProfileException exception = assertThrows(
                ProfileException.class,
                () -> {
                    throw new ProfileException("Invalid profile");
                }
        );

        assertEquals("Invalid profile", exception.getMessage());
    }

    @Test
    void exceptionCanBeCaughtAsAccountException() {
        AccountException exception = assertThrows(
                AccountException.class,
                () -> {
                    throw new ProfileException("Profile error");
                }
        );

        assertInstanceOf(ProfileException.class, exception);
    }
}