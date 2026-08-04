package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfileExceptionAITest {

    @Test
    void storesProfileErrorMessage() {
        ProfileException exception =
                new ProfileException("The profile could not be updated.");

        assertEquals("The profile could not be updated.", exception.getMessage());
    }

    @Test
    void storesCauseFromRepositoryFailure() {
        RuntimeException cause = new RuntimeException("SQLite error");
        ProfileException exception =
                new ProfileException("Profile save failed", cause);

        assertSame(cause, exception.getCause());
    }

    @Test
    void isAlsoAnAccountException() {
        ProfileException exception = new ProfileException("Invalid profile");

        assertInstanceOf(AccountException.class, exception);
    }

    @Test
    void messageAndCauseAreBothPreserved() {
        IllegalStateException cause = new IllegalStateException("Update failed");
        ProfileException exception =
                new ProfileException("The profile could not be saved.", cause);

        assertEquals("The profile could not be saved.", exception.getMessage());
        assertEquals("Update failed", exception.getCause().getMessage());
    }
}