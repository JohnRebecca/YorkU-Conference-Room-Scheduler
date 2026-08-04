package test.manual.scheduler.exception;

import org.junit.jupiter.api.Test;
import scheduler.exception.InvalidCardException;
import static org.junit.jupiter.api.Assertions.*;

class InvalidCardExceptionTest {

    @Test
    void testConstructorWithMessage() {
        String message = "Card number must be between 12 and 16 digits";
         InvalidCardException exception = new InvalidCardException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testConstructorWithMessageAndCause() {
        String message = "Invalid card number";
        Throwable cause = new NumberFormatException("Not a number");
         InvalidCardException exception = new InvalidCardException(message, cause);
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testExceptionThrown() {
         assertThrows(InvalidCardException.class, () -> {
           throw new InvalidCardException("Card is invalid");
        });
    }

    @Test
    void testExceptionMessageContainsError() {
       InvalidCardException exception = new InvalidCardException("Card number too short");
         assertTrue(exception.getMessage().contains("too short"));
    }

    @Test
    void testExceptionInstanceOfException() {
         InvalidCardException exception = new InvalidCardException("Test");
       assertTrue(exception instanceof Exception);
    }

    @Test
    void testExceptionInstanceOfThrowable() {
         InvalidCardException exception = new InvalidCardException("Test");
        assertTrue(exception instanceof Throwable);
    }

    @Test
    void testExceptionWithNullMessage() {
       InvalidCardException exception = new InvalidCardException(null);
         assertNull(exception.getMessage());
    }

    @Test
    void testExceptionWithEmptyMessage() {
         InvalidCardException exception = new InvalidCardException("");
       assertEquals("", exception.getMessage());
    }

    @Test
    void testExceptionWithCauseOnly() {
         Throwable cause = new RuntimeException("Database error");
         InvalidCardException exception = new InvalidCardException("Card validation failed", cause);
         assertEquals("Card validation failed", exception.getMessage());
       assertEquals(cause, exception.getCause());
    }

    @Test
    void testMultipleExceptions() {
          InvalidCardException exception1 = new InvalidCardException("Error 1");
        InvalidCardException exception2 = new InvalidCardException("Error 2");
       assertNotSame(exception1, exception2);
    }
}