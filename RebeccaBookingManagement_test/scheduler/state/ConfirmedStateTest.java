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

class ConfirmedStateTest {

    @AfterEach
    void resetClock() {
        AppClock.reset();
    }

    @Test
    void payUpfrontFeeThrowsBecauseAlreadyPaid() {
        Booking booking = TestFixtures.confirmedBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().payUpfrontFee(booking));
    }

    @Test
    void editBeforeStartTimeSucceeds() {
        Booking booking = TestFixtures.confirmedBooking();
        LocalDateTime newStart = booking.getStartTime().plusHours(1);

        booking.getState().edit(booking, newStart, newStart.plusHours(1));

        assertEquals(newStart, booking.getStartTime());
    }

    @Test
    void editAfterStartTimeThrows() {
        Booking booking = TestFixtures.confirmedBooking();
        AppClock.advance(Duration.between(LocalDateTime.now(), booking.getStartTime().plusMinutes(1)));

        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().edit(booking, booking.getStartTime(), booking.getEndTime().plusHours(1)));
    }

    @Test
    void cancelBeforeStartTimeSucceeds() {
        Booking booking = TestFixtures.confirmedBooking();
        booking.getState().cancel(booking);

        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }

    @Test
    void cancelAfterStartTimeThrows() {
        Booking booking = TestFixtures.confirmedBooking();
        AppClock.advance(Duration.between(LocalDateTime.now(), booking.getStartTime().plusMinutes(1)));

        assertThrows(InvalidBookingActionException.class, () -> booking.getState().cancel(booking));
    }

    @Test
    void extendBeforeExpiryWithLaterEndTimeSucceeds() {
        Booking booking = TestFixtures.confirmedBooking();
        LocalDateTime newEnd = booking.getEndTime().plusHours(1);

        booking.getState().extend(booking, newEnd);

        assertEquals(newEnd, booking.getEndTime());
    }

    @Test
    void extendAfterBookingHasAlreadyEndedThrows() {
        Booking booking = TestFixtures.confirmedBooking();
        AppClock.advance(Duration.between(LocalDateTime.now(), booking.getEndTime().plusMinutes(1)));

        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, booking.getEndTime().plusHours(1)));
    }

    @Test
    void extendToAnEarlierOrEqualEndTimeThrows() {
        Booking booking = TestFixtures.confirmedBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, booking.getEndTime()));
    }

    @Test
    void checkInWithinThirtyMinutesOfStartAppliesDepositAndMovesToCheckedIn() {
        Booking booking = TestFixtures.confirmedBooking();
        // Jump to exactly the booking's start time - well within the 30-minute window.
        AppClock.jumpTo(booking.getStartTime());

        booking.getState().checkIn(booking);

        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
        assertInstanceOf(CheckedInState.class, booking.getState());
        assertTrue(booking.getDeposit().isAppliedToFinalCost());
        assertFalse(booking.getDeposit().isForfeited());
    }

    @Test
    void checkInAfterThirtyMinutesForfeitsDepositAndExpiresBooking() {
        Booking booking = TestFixtures.confirmedBooking();
        // Jump to 31 minutes after start - just past the grace window.
        AppClock.jumpTo(booking.getStartTime().plusMinutes(31));

        assertThrows(InvalidBookingActionException.class, () -> booking.getState().checkIn(booking));

        assertEquals(BookingStatus.EXPIRED, booking.getStatus());
        assertInstanceOf(ExpiredState.class, booking.getState());
        assertTrue(booking.getDeposit().isForfeited());
    }

    @Test
    void checkInJustBeforeThirtyMinutesStillSucceeds() {
        Booking booking = TestFixtures.confirmedBooking();
        // 29 minutes in - comfortably inside the window without relying on an exact
        // boundary instant, which would be flaky given real time elapses between
        // this jump and the checkIn() call below.
        AppClock.jumpTo(booking.getStartTime().plusMinutes(29));

        booking.getState().checkIn(booking);

        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
    }

    @Test
    void completeThrowsBecauseNotYetCheckedIn() {
        Booking booking = TestFixtures.confirmedBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().complete(booking));
    }

    @Test
    void expireForfeitsDepositAndMovesToExpired() {
        Booking booking = TestFixtures.confirmedBooking();
        booking.getState().expire(booking);

        assertEquals(BookingStatus.EXPIRED, booking.getStatus());
        assertTrue(booking.getDeposit().isForfeited());
    }
}
