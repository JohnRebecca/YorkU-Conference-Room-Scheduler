package scheduler.state;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import scheduler.TestFixtures;
import scheduler.exception.InvalidBookingActionException;
import scheduler.model.Booking;
import scheduler.util.AppClock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CompletedStateTest {

    @AfterEach
    void resetClock() {
        AppClock.reset();
    }

    private Booking completedBooking() {
        Booking booking = TestFixtures.confirmedBooking();
        AppClock.jumpTo(booking.getStartTime());
        booking.getState().checkIn(booking);
        booking.getState().complete(booking);
        return booking;
    }

    @Test
    void payUpfrontFeeThrows() {
        Booking booking = completedBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().payUpfrontFee(booking));
    }

    @Test
    void editThrows() {
        Booking booking = completedBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().edit(booking, booking.getStartTime(), booking.getEndTime()));
    }

    @Test
    void cancelThrows() {
        Booking booking = completedBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().cancel(booking));
    }

    @Test
    void extendThrows() {
        Booking booking = completedBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, booking.getEndTime().plusHours(1)));
    }

    @Test
    void checkInThrows() {
        Booking booking = completedBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().checkIn(booking));
    }

    @Test
    void completeAgainThrows() {
        Booking booking = completedBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().complete(booking));
    }

    @Test
    void expireThrows() {
        Booking booking = completedBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().expire(booking));
    }

    @Test
    void depositRemainsAppliedAfterCompletion() {
        Booking booking = completedBooking();
        assertTrue(booking.getDeposit().isAppliedToFinalCost());
    }

    @Test
    void rejectedCancelLeavesStatusAsCompleted() {
        Booking booking = completedBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().cancel(booking));

        assertEquals(scheduler.model.BookingStatus.COMPLETED, booking.getStatus());
    }

    @Test
    void rejectedExtendLeavesEndTimeUnchanged() {
        Booking booking = completedBooking();
        var originalEnd = booking.getEndTime();

        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, originalEnd.plusHours(5)));

        assertEquals(originalEnd, booking.getEndTime());
    }
}