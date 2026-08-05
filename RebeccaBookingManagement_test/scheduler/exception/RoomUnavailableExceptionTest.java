package scheduler.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomUnavailableExceptionTest {

    @Test
    void constructorStoresMessage() {
        RoomUnavailableException exception = new RoomUnavailableException("Room is booked.");
        assertEquals("Room is booked.", exception.getMessage());
    }

    @Test
    void isABookingException() {
        assertInstanceOf(BookingException.class, new RoomUnavailableException("msg"));
    }

    @Test
    void isARuntimeException() {
        assertInstanceOf(RuntimeException.class, new RoomUnavailableException("msg"));
    }

    @Test
    void canBeThrownAndCaughtAsRoomUnavailableException() {
        assertThrows(RoomUnavailableException.class, () -> {
            throw new RoomUnavailableException("thrown");
        });
    }

    @Test
    void canBeCaughtAsItsParentBookingException() {
        assertThrows(BookingException.class, () -> {
            throw new RoomUnavailableException("thrown");
        });
    }

    @Test
    void supportsNullMessage() {
        RoomUnavailableException exception = new RoomUnavailableException(null);
        assertNull(exception.getMessage());
    }

    @Test
    void supportsEmptyMessage() {
        RoomUnavailableException exception = new RoomUnavailableException("");
        assertEquals("", exception.getMessage());
    }

    @Test
    void messageIsPreservedThroughACatchBlock() {
        try {
            throw new RoomUnavailableException("room disabled");
        } catch (RoomUnavailableException e) {
            assertEquals("room disabled", e.getMessage());
        }
    }

    @Test
    void hasNoCauseWhenConstructedWithOnlyAMessage() {
        RoomUnavailableException exception = new RoomUnavailableException("msg");
        assertNull(exception.getCause());
    }

    @Test
    void toStringIncludesClassNameAndMessage() {
        RoomUnavailableException exception = new RoomUnavailableException("detail");
        assertTrue(exception.toString().contains("RoomUnavailableException"));
        assertTrue(exception.toString().contains("detail"));
    }
}
