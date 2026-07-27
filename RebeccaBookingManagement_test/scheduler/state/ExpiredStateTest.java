package scheduler.state;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import scheduler.TestFixtures;
import scheduler.exception.InvalidBookingActionException;
import scheduler.model.Booking;
import scheduler.util.AppClock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExpiredStateTest {

    @AfterEach
    void resetClock() {
        AppClock.reset();
    }

    private Booking expiredBooking() {
        Booking booking = TestFixtures.pendingBooking();
        booking.getState().expire(booking);
        return booking;
    }

    @Test
    void payUpfrontFeeThrows() {
        Booking booking = expiredBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().payUpfrontFee(booking));
    }

    @Test
    void editThrows() {
        Booking booking = expiredBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().edit(booking, booking.getStartTime(), booking.getEndTime()));
    }

    @Test
    void cancelThrows() {
        Booking booking = expiredBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().cancel(booking));
    }

    @Test
    void extendThrows() {
        Booking booking = expiredBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, booking.getEndTime().plusHours(1)));
    }

    @Test
    void checkInThrows() {
        Booking booking = expiredBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().checkIn(booking));
    }

    @Test
    void completeThrows() {
        Booking booking = expiredBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().complete(booking));
    }

    @Test
    void expireAgainThrows() {
        Booking booking = expiredBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().expire(booking));
    }

    @Test
    void expiredFromConfirmedViaMissedCheckInHasForfeitedDeposit() {
        Booking booking = TestFixtures.confirmedBooking();
        AppClock.jumpTo(booking.getStartTime().plusMinutes(31));

        assertThrows(InvalidBookingActionException.class, () -> booking.getState().checkIn(booking));
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().cancel(booking));
    }

    @Test
    void rejectedEditLeavesOriginalTimesUnchanged() {
        Booking booking = expiredBooking();
        var originalStart = booking.getStartTime();

        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().edit(booking, originalStart.plusDays(1), originalStart.plusDays(1).plusHours(1)));

        assertEquals(originalStart, booking.getStartTime());
    }

    @Test
    void directlyExpiredFromPendingPaymentHasAnUnpaidDeposit() {
        // Distinguishes this path from expiring via a missed check-in (which forfeits an already-paid deposit).
        Booking booking = expiredBooking();
        assertFalse(booking.getDeposit().isPaid());
        assertFalse(booking.getDeposit().isForfeited());
    }
}