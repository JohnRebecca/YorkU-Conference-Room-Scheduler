package scheduler.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvalidBookingActionExceptionTest {

    @Test
    void constructorStoresMessage() {
        InvalidBookingActionException exception = new InvalidBookingActionException("Cannot edit after start.");
        assertEquals("Cannot edit after start.", exception.getMessage());
    }

    @Test
    void isABookingException() {
        assertInstanceOf(BookingException.class, new InvalidBookingActionException("msg"));
    }

    @Test
    void isARuntimeException() {
        assertInstanceOf(RuntimeException.class, new InvalidBookingActionException("msg"));
    }

    @Test
    void canBeThrownAndCaughtAsInvalidBookingActionException() {
        assertThrows(InvalidBookingActionException.class, () -> {
            throw new InvalidBookingActionException("thrown");
        });
    }

    @Test
    void canBeCaughtAsItsParentBookingException() {
        assertThrows(BookingException.class, () -> {
            throw new InvalidBookingActionException("thrown");
        });
    }

    @Test
    void supportsNullMessage() {
        InvalidBookingActionException exception = new InvalidBookingActionException(null);
        assertNull(exception.getMessage());
    }

    @Test
    void supportsEmptyMessage() {
        InvalidBookingActionException exception = new InvalidBookingActionException("");
        assertEquals("", exception.getMessage());
    }

    @Test
    void messageIsPreservedThroughACatchBlock() {
        try {
            throw new InvalidBookingActionException("cannot cancel");
        } catch (InvalidBookingActionException e) {
            assertEquals("cannot cancel", e.getMessage());
        }
    }

    @Test
    void hasNoCauseWhenConstructedWithOnlyAMessage() {
        InvalidBookingActionException exception = new InvalidBookingActionException("msg");
        assertNull(exception.getCause());
    }

    @Test
    void toStringIncludesClassNameAndMessage() {
        InvalidBookingActionException exception = new InvalidBookingActionException("detail");
        assertTrue(exception.toString().contains("InvalidBookingActionException"));
        assertTrue(exception.toString().contains("detail"));
    }
}
