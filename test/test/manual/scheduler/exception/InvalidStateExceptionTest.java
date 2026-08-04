package test.manual.scheduler.exception;

import org.junit.jupiter.api.Test;
import scheduler.exception.InvalidStateException;
import scheduler.model.DepositState;
import static org.junit.jupiter.api.Assertions.*;

class InvalidStateExceptionTest {

    @Test
    void testConstructorWithDepositIdAndState() {
         int depositId = 1;
       DepositState currentState = DepositState.APPLIED;
        String action = "forfeit";
        
        InvalidStateException exception = new InvalidStateException(depositId, currentState, action);
        
       assertTrue(exception.getMessage().contains("Cannot " + action));
         assertTrue(exception.getMessage().contains("deposit #" + depositId));
         assertTrue(exception.getMessage().contains(currentState.getDisplayName()));
    }

    @Test
    void testConstructorWithMessage() {
       String message = "Invalid state transition";
         InvalidStateException exception = new InvalidStateException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testExceptionThrown() {
        assertThrows(InvalidStateException.class, () -> {
            throw new InvalidStateException(1, DepositState.PENDING, "apply");
        });
    }

    @Test
    void testExceptionWithDifferentStates() {
         InvalidStateException exception1 = new InvalidStateException(1, DepositState.PENDING, "apply");
        InvalidStateException exception2 = new InvalidStateException(2, DepositState.FORFEITED, "refund");
         assertNotSame(exception1, exception2);
    }

    @Test
    void testExceptionInstanceOfException() {
         InvalidStateException exception = new InvalidStateException("Test");
       assertTrue(exception instanceof Exception);
    }

    @Test
    void testExceptionInstanceOfThrowable() {
        InvalidStateException exception = new InvalidStateException("Test");
        assertTrue(exception instanceof Throwable);
    }

    @Test
    void testExceptionWithNullMessage() {
        InvalidStateException exception = new InvalidStateException((String) null);
        assertNull(exception.getMessage());
    }

    @Test
    void testExceptionWithEmptyMessage() {
         InvalidStateException exception = new InvalidStateException("");
        assertEquals("", exception.getMessage());
    }

    @Test
    void testExceptionMessageContainsAction() {
        String action = "cancel";
       InvalidStateException exception = new InvalidStateException(1, DepositState.APPLIED, action);
        assertTrue(exception.getMessage().contains(action));
    }

    @Test
     void testExceptionMessageContainsStateDisplayName() {
         DepositState state = DepositState.FORFEITED;
       InvalidStateException exception = new InvalidStateException(1, state, "refund");
        assertTrue(exception.getMessage().contains(state.getDisplayName()));
    }
}