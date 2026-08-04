package scheduler.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicateEmailExceptionTest {

    @Test
    void constructorIncludesEmailInMessage() {
        DuplicateEmailException exception = new DuplicateEmailException("student@yorku.ca");

        assertEquals( "An account already exists for student@yorku.ca.", exception.getMessage());
    }

    @Test
    void duplicateEmailExceptionIsAnAccountException() {
        DuplicateEmailException exception = new DuplicateEmailException("student@yorku.ca");
        assertInstanceOf(AccountException.class, exception);
    }

    @Test
    void constructorHandlesEmptyEmail() {
        DuplicateEmailException exception = new DuplicateEmailException("");

        assertEquals("An account already exists for .", exception.getMessage());
    }
}