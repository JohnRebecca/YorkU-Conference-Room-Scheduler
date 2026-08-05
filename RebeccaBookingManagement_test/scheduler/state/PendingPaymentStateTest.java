package scheduler.state;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import scheduler.TestFixtures;
import scheduler.exception.InvalidBookingActionException;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.util.AppClock;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PendingPaymentStateTest {

    @AfterEach
    void resetClock() {
        AppClock.reset();
    }

    @Test
    void payUpfrontFeeMarksDepositPaidAndMovesToConfirmed() {
        Booking booking = TestFixtures.pendingBooking();

        booking.getState().payUpfrontFee(booking);

        assertTrue(booking.getDeposit().isPaid());
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
        assertInstanceOf(ConfirmedState.class, booking.getState());
    }

    @Test
    void editBeforeStartTimeSucceeds() {
        Booking booking = TestFixtures.pendingBooking();
        LocalDateTime newStart = booking.getStartTime().plusHours(1);
        LocalDateTime newEnd = newStart.plusHours(1);

        booking.getState().edit(booking, newStart, newEnd);

        assertEquals(newStart, booking.getStartTime());
        assertEquals(newEnd, booking.getEndTime());
    }

    @Test
    void editAfterStartTimeThrows() {
        Booking booking = TestFixtures.pendingBooking();
        AppClock.advance(Duration.between(LocalDateTime.now(), booking.getStartTime().plusMinutes(1)));

        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().edit(booking, booking.getStartTime(), booking.getEndTime().plusHours(1)));
    }

    @Test
    void cancelBeforeStartTimeSucceeds() {
        Booking booking = TestFixtures.pendingBooking();

        booking.getState().cancel(booking);

        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
        assertInstanceOf(CancelledState.class, booking.getState());
    }

    @Test
    void cancelAfterStartTimeThrows() {
        Booking booking = TestFixtures.pendingBooking();
        AppClock.advance(Duration.between(LocalDateTime.now(), booking.getStartTime().plusMinutes(1)));

        assertThrows(InvalidBookingActionException.class, () -> booking.getState().cancel(booking));
    }

    @Test
    void extendThrowsBecausePaymentNotYetCompleted() {
        Booking booking = TestFixtures.pendingBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, booking.getEndTime().plusHours(1)));
    }

    @Test
    void checkInThrowsBecauseNotYetPaid() {
        Booking booking = TestFixtures.pendingBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().checkIn(booking));
    }

    @Test
    void completeThrowsBecauseNeverCheckedIn() {
        Booking booking = TestFixtures.pendingBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().complete(booking));
    }

    @Test
    void expireMovesBookingToExpiredState() {
        Booking booking = TestFixtures.pendingBooking();

        booking.getState().expire(booking);

        assertEquals(BookingStatus.EXPIRED, booking.getStatus());
        assertInstanceOf(ExpiredState.class, booking.getState());
    }

    @Test
    void expireDoesNotRequireDepositToBePaid() {
        Booking booking = TestFixtures.pendingBooking();
        assertFalse(booking.getDeposit().isPaid());

        // Should not throw, unlike forfeit() on an unpaid deposit.
        assertDoesNotThrow(() -> booking.getState().expire(booking));
    }
}
