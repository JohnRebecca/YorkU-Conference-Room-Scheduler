package scheduler.exception;

import org.junit.jupiter.api.Test;
import scheduler.exception.DepositNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

class DepositNotFoundExceptionTest {

    @Test
    void testConstructorWithBookingId() {
         int bookingId = 101;
        DepositNotFoundException exception = new DepositNotFoundException(bookingId);
        assertTrue(exception.getMessage().contains("No deposit found for this booking " + bookingId));
    }

     @Test
    void testConstructorWithMessage() {
        String message = "Custom deposit not found message";
        DepositNotFoundException exception = new DepositNotFoundException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testExceptionThrown() {
        assertThrows(DepositNotFoundException.class, () -> {
            throw new DepositNotFoundException(101);
        });
    }

    @Test
    void testExceptionMessageContainsBookingId() {
        DepositNotFoundException exception = new DepositNotFoundException(999);
        assertTrue(exception.getMessage().contains("999"));
    }

    @Test
    void testExceptionInstanceOfException() {
         DepositNotFoundException exception = new DepositNotFoundException(101);
        assertTrue(exception instanceof Exception);
    }

    @Test
    void testExceptionInstanceOfThrowable() {
         DepositNotFoundException exception = new DepositNotFoundException(101);
        assertTrue(exception instanceof Throwable);
    }

    @Test
    void testExceptionWithNullMessage() {
         DepositNotFoundException exception = new DepositNotFoundException((String) null);
        assertNull(exception.getMessage());
    }

    @Test
    void testExceptionWithEmptyMessage() {
         DepositNotFoundException exception = new DepositNotFoundException("");
       assertEquals("", exception.getMessage());
    }

    @Test
    void testDifferentBookingIds() {
        DepositNotFoundException exception1 = new DepositNotFoundException(101);
         DepositNotFoundException exception2 = new DepositNotFoundException(202);
        assertTrue(exception1.getMessage().contains("101"));
         assertTrue(exception2.getMessage().contains("202"));
    }

    @Test
    void testMultipleExceptions() {
         DepositNotFoundException exception1 = new DepositNotFoundException(101);
        DepositNotFoundException exception2 = new DepositNotFoundException(102);
        assertNotSame(exception1, exception2);
    }
}