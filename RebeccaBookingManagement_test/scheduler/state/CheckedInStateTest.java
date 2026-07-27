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

class CheckedInStateTest {

    @AfterEach
    void resetClock() {
        AppClock.reset();
    }

    private Booking checkedInBooking() {
        Booking booking = TestFixtures.confirmedBooking();
        AppClock.jumpTo(booking.getStartTime());
        booking.getState().checkIn(booking);
        return booking;
    }

    @Test
    void payUpfrontFeeThrowsBecauseAlreadyPaid() {
        Booking booking = checkedInBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().payUpfrontFee(booking));
    }

    @Test
    void editThrowsBecauseCheckedInBookingCannotBeEdited() {
        Booking booking = checkedInBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().edit(booking, booking.getStartTime(), booking.getEndTime().plusHours(1)));
    }

    @Test
    void cancelThrowsBecauseCheckedInBookingCannotBeCancelled() {
        Booking booking = checkedInBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().cancel(booking));
    }

    @Test
    void extendBeforeExpiryWithLaterEndTimeSucceeds() {
        Booking booking = checkedInBooking();
        LocalDateTime newEnd = booking.getEndTime().plusHours(1);

        booking.getState().extend(booking, newEnd);

        assertEquals(newEnd, booking.getEndTime());
    }

    @Test
    void extendAfterExpiryThrows() {
        Booking booking = checkedInBooking();
        AppClock.advance(Duration.between(AppClock.now(), booking.getEndTime().plusMinutes(1)));

        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, booking.getEndTime().plusHours(1)));
    }

    @Test
    void extendToEarlierOrEqualEndTimeThrows() {
        Booking booking = checkedInBooking();
        assertThrows(InvalidBookingActionException.class,
                () -> booking.getState().extend(booking, booking.getEndTime()));
    }

    @Test
    void checkInAgainThrowsBecauseAlreadyCheckedIn() {
        Booking booking = checkedInBooking();
        assertThrows(InvalidBookingActionException.class, () -> booking.getState().checkIn(booking));
    }

    @Test
    void completeMovesBookingToCompletedStatus() {
        Booking booking = checkedInBooking();
        booking.getState().complete(booking);

        assertEquals(BookingStatus.COMPLETED, booking.getStatus());
        assertInstanceOf(CompletedState.class, booking.getState());
    }

    @Test
    void expireMovesBookingToExpiredStatus() {
        Booking booking = checkedInBooking();
        booking.getState().expire(booking);

        assertEquals(BookingStatus.EXPIRED, booking.getStatus());
        assertInstanceOf(ExpiredState.class, booking.getState());
    }

    @Test
    void checkInFlowAppliesDepositBeforeReachingCheckedInState() {
        Booking booking = checkedInBooking();
        assertTrue(booking.getDeposit().isAppliedToFinalCost());
    }
}
