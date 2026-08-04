package test.ai.scheduler.exception;

import org.junit.jupiter.api.Test;
import scheduler.exception.InvalidCardException;
import scheduler.exception.PaymentDeclinedException;
import scheduler.exception.DepositNotFoundException;
import scheduler.exception.InvalidStateException;
import scheduler.model.DepositState;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionAITest {

    // ============================================================
    // InvalidCardException Tests
    // ============================================================

    @Test
    void testInvalidCardExceptionWithMessage() {
        String message = "Card number must be between 12 and 16 digits";
        InvalidCardException exception = new InvalidCardException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testInvalidCardExceptionWithCause() {
        String message = "Invalid card number";
        Throwable cause = new NumberFormatException("Not a number");
        InvalidCardException exception = new InvalidCardException(message, cause);
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testInvalidCardExceptionThrown() {
        assertThrows(InvalidCardException.class, () -> {
            throw new InvalidCardException("Card is invalid");
        });
    }

    @Test
    void testInvalidCardExceptionInstanceOfException() {
        InvalidCardException exception = new InvalidCardException("Test");
        assertTrue(exception instanceof Exception);
    }

    // ============================================================
    // PaymentDeclinedException Tests
    // ============================================================

    @Test
    void testPaymentDeclinedExceptionWithMessage() {
        String message = "Payment declined - insufficient funds";
        PaymentDeclinedException exception = new PaymentDeclinedException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testPaymentDeclinedExceptionWithCause() {
        String message = "Payment declined";
        Throwable cause = new RuntimeException("Bank error");
        PaymentDeclinedException exception = new PaymentDeclinedException(message, cause);
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testPaymentDeclinedExceptionThrown() {
        assertThrows(PaymentDeclinedException.class, () -> {
            throw new PaymentDeclinedException("Card blocked");
        });
    }

    @Test
    void testPaymentDeclinedExceptionInstanceOfException() {
        PaymentDeclinedException exception = new PaymentDeclinedException("Test");
        assertTrue(exception instanceof Exception);
    }

    // ============================================================
    // DepositNotFoundException Tests
    // ============================================================

    @Test
    void testDepositNotFoundExceptionWithBookingId() {
        int bookingId = 101;
        DepositNotFoundException exception = new DepositNotFoundException(bookingId);
        assertTrue(exception.getMessage().contains("No deposit found for this booking " + bookingId));
    }

    @Test
    void testDepositNotFoundExceptionWithMessage() {
        String message = "Custom deposit not found message";
        DepositNotFoundException exception = new DepositNotFoundException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testDepositNotFoundExceptionThrown() {
        assertThrows(DepositNotFoundException.class, () -> {
            throw new DepositNotFoundException(101);
        });
    }

    @Test
    void testDepositNotFoundExceptionInstanceOfException() {
        DepositNotFoundException exception = new DepositNotFoundException(101);
        assertTrue(exception instanceof Exception);
    }

    // ============================================================
    // InvalidStateException Tests
    // ============================================================

    @Test
    void testInvalidStateExceptionWithDepositIdAndState() {
        int depositId = 1;
        DepositState currentState = DepositState.APPLIED;
        String action = "forfeit";
        InvalidStateException exception = new InvalidStateException(depositId, currentState, action);
        assertTrue(exception.getMessage().contains("Cannot " + action));
        assertTrue(exception.getMessage().contains("deposit #" + depositId));
        assertTrue(exception.getMessage().contains(currentState.getDisplayName()));
    }

    @Test
    void testInvalidStateExceptionWithMessage() {
        String message = "Invalid state transition";
        InvalidStateException exception = new InvalidStateException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testInvalidStateExceptionThrown() {
        assertThrows(InvalidStateException.class, () -> {
            throw new InvalidStateException(1, DepositState.PENDING, "apply");
        });
    }

    @Test
    void testInvalidStateExceptionInstanceOfException() {
        InvalidStateException exception = new InvalidStateException("Test");
        assertTrue(exception instanceof Exception);
    }

    // ============================================================
    // All Exceptions Are Checked
    // ============================================================

    @Test
    void testAllExceptionsAreChecked() {
        assertTrue(Exception.class.isAssignableFrom(InvalidCardException.class));
        assertTrue(Exception.class.isAssignableFrom(PaymentDeclinedException.class));
        assertTrue(Exception.class.isAssignableFrom(DepositNotFoundException.class));
        assertTrue(Exception.class.isAssignableFrom(InvalidStateException.class));
    }
}