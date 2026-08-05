package scheduler.state;

import org.junit.jupiter.api.Test;
import scheduler.TestFixtures;
import scheduler.exception.InvalidBookingActionException;
import scheduler.model.Booking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CancelledStateTest {

    private Booking cancelledBooking() {
        Booking booking = TestFixtures.pendingBooking();
        booking.cancel();
        return booking;
    }

    @Test
    void payUpfrontFeeThrows() {
        Booking booking = cancelledBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().payUpfrontFee(booking));
    }

    @Test
    void editThrows() {
        Booking booking = cancelledBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().edit(booking, booking.getStartTime(), booking.getEndTime()));
    }

    @Test
    void cancelAgainThrows() {
        Booking booking = cancelledBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().cancel(booking));
    }

    @Test
    void extendThrows() {
        Booking booking = cancelledBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, booking.getEndTime().plusHours(1)));
    }

    @Test
    void checkInThrows() {
        Booking booking = cancelledBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().checkIn(booking));
    }

    @Test
    void completeThrows() {
        Booking booking = cancelledBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().complete(booking));
    }

    @Test
    void expireThrows() {
        Booking booking = cancelledBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().expire(booking));
    }

    @Test
    void rejectedEditLeavesOriginalTimesUnchanged() {
        Booking booking = cancelledBooking();
        var originalStart = booking.getStartTime();
        var originalEnd = booking.getEndTime();

        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().edit(booking, originalStart.plusDays(1), originalEnd.plusDays(1)));

        assertEquals(originalStart, booking.getStartTime());
        assertEquals(originalEnd, booking.getEndTime());
    }

    @Test
    void rejectedExtendLeavesEndTimeUnchanged() {
        Booking booking = cancelledBooking();
        var originalEnd = booking.getEndTime();

        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, originalEnd.plusHours(5)));

        assertEquals(originalEnd, booking.getEndTime());
    }

    @Test
    void cancelAgainThrowsWithAMeaningfulMessage() {
        Booking booking = cancelledBooking();
        InvalidBookingActionException exception = assertThrows(
                InvalidBookingActionException.class, () -> booking.getState().cancel(booking));

        assertNotNull(exception.getMessage());
        assertFalse(exception.getMessage().isBlank());
    }
}