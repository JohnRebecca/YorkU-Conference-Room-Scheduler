package scheduler.exception;

import org.junit.jupiter.api.Test;
import scheduler.exception.PaymentDeclinedException;
import static org.junit.jupiter.api.Assertions.*;

class PaymentDeclinedExceptionTest {

    @Test
    void testConstructorWithMessage() {
         String message = "Payment declined - insufficient funds";
        PaymentDeclinedException exception = new PaymentDeclinedException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testConstructorWithMessageAndCause() {
        String message = "Payment declined";
         Throwable cause = new RuntimeException("Bank error");
         PaymentDeclinedException exception = new PaymentDeclinedException(message, cause);
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testExceptionThrown() {
        assertThrows(PaymentDeclinedException.class, () -> {
            throw new PaymentDeclinedException("Card blocked");
        });
    }

    @Test
    void testExceptionMessageContainsError() {
        PaymentDeclinedException exception = new PaymentDeclinedException("Insufficient funds");
        assertTrue(exception.getMessage().contains("Insufficient"));
    }

    @Test
    void testExceptionInstanceOfException() {
        PaymentDeclinedException exception = new PaymentDeclinedException("Test");
        assertTrue(exception instanceof Exception);
    }

    @Test
    void testExceptionInstanceOfThrowable() {
        PaymentDeclinedException exception = new PaymentDeclinedException("Test");
         assertTrue(exception instanceof Throwable);
    }

    @Test
    void testExceptionWithNullMessage() {
         PaymentDeclinedException exception = new PaymentDeclinedException(null);
        assertNull(exception.getMessage());
    }

    @Test
    void testExceptionWithEmptyMessage() {
         PaymentDeclinedException exception = new PaymentDeclinedException("");
        assertEquals("", exception.getMessage());
    }

    @Test
    void testExceptionWithCauseOnly() {
       Throwable cause = new RuntimeException("Network error");
         PaymentDeclinedException exception = new PaymentDeclinedException("Payment failed", cause);
         assertEquals("Payment failed", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testMultipleExceptions() {
        PaymentDeclinedException exception1 = new PaymentDeclinedException("Error 1");
         PaymentDeclinedException exception2 = new PaymentDeclinedException("Error 2");
        assertNotSame(exception1, exception2);
    }
}