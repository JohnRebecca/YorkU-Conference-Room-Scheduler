package scheduler.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingExceptionTest {

    @Test
    void constructorStoresMessage() {
        BookingException exception = new BookingException("Something went wrong.");
        assertEquals("Something went wrong.", exception.getMessage());
    }

    @Test
    void isARuntimeException() {
        assertInstanceOf(RuntimeException.class, new BookingException("msg"));
    }

    @Test
    void canBeThrownAndCaughtAsBookingException() {
        assertThrows(BookingException.class, () -> {
            throw new BookingException("thrown");
        });
    }

    @Test
    void canBeThrownAndCaughtAsRuntimeException() {
        assertThrows(RuntimeException.class, () -> {
            throw new BookingException("thrown");
        });
    }

    @Test
    void supportsNullMessage() {
        BookingException exception = new BookingException(null);
        assertNull(exception.getMessage());
    }

    @Test
    void supportsEmptyMessage() {
        BookingException exception = new BookingException("");
        assertEquals("", exception.getMessage());
    }

    @Test
    void twoInstancesWithSameMessageAreNotEqualByDefault() {
        BookingException a = new BookingException("same");
        BookingException b = new BookingException("same");
        assertNotEquals(a, b);
    }

    @Test
    void messageIsPreservedThroughACatchBlock() {
        try {
            throw new BookingException("specific detail");
        } catch (BookingException e) {
            assertEquals("specific detail", e.getMessage());
        }
    }

    @Test
    void hasNoCauseWhenConstructedWithOnlyAMessage() {
        BookingException exception = new BookingException("msg");
        assertNull(exception.getCause());
    }

    @Test
    void toStringIncludesClassNameAndMessage() {
        BookingException exception = new BookingException("detail");
        assertTrue(exception.toString().contains("BookingException"));
        assertTrue(exception.toString().contains("detail"));
    }
}
