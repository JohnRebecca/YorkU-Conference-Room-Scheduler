package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicateEmailExceptionAITest {

    @Test
    void messageIncludesConflictingEmailAddress() {
        DuplicateEmailException exception =
                new DuplicateEmailException("duplicate@example.com");

        assertTrue(exception.getMessage().contains("duplicate@example.com"));
    }

    @Test
    void messageUsesExpectedSentence() {
        DuplicateEmailException exception =
                new DuplicateEmailException("person@yorku.ca");

        assertEquals(
                "An account already exists for person@yorku.ca.",
                exception.getMessage()
        );
    }

    @Test
    void inheritsFromAccountException() {
        DuplicateEmailException exception =
                new DuplicateEmailException("person@yorku.ca");

        assertInstanceOf(AccountException.class, exception);
    }

    @Test
    void nullEmailIsIncludedAsText() {
        DuplicateEmailException exception = new DuplicateEmailException(null);

        assertEquals("An account already exists for null.", exception.getMessage());
    }
}