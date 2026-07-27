package scheduler.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import scheduler.TestFixtures;
import scheduler.state.CancelledState;
import scheduler.state.ConfirmedState;
import scheduler.state.PendingPaymentState;
import scheduler.util.AppClock;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @AfterEach
    void resetClock() {
        AppClock.reset();
    }

    @Test
    void constructorSetsAllFieldsFromInputs() {
        RegisteredUser user = TestFixtures.studentUser();
        Room room = TestFixtures.room();
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        LocalDateTime end = start.plusHours(2);

        Booking booking = new Booking("B1", user, room, start, end);

        assertEquals("B1", booking.getBookingId());
        assertEquals(user, booking.getUser());
        assertEquals(room, booking.getRoom());
        assertEquals(start, booking.getStartTime());
        assertEquals(end, booking.getEndTime());
    }

    @Test
    void constructorStartsInPendingPaymentStatus() {
        Booking booking = TestFixtures.pendingBooking();
        assertEquals(BookingStatus.PENDING_PAYMENT, booking.getStatus());
    }

    @Test
    void constructorStartsInPendingPaymentState() {
        Booking booking = TestFixtures.pendingBooking();
        assertInstanceOf(PendingPaymentState.class, booking.getState());
    }

    @Test
    void constructorTakesHourlyRateFromUsersAccountType() {
        Booking booking = TestFixtures.pendingBooking();
        assertEquals(20.00, booking.getHourlyRate());
    }

    @Test
    void constructorCreatesAnUnpaidDepositForOneHour() {
        Booking booking = TestFixtures.pendingBooking();
        assertEquals(20.00, booking.getDeposit().getAmount());
        assertFalse(booking.getDeposit().isPaid());
    }

    @Test
    void totalCostForExactlyOneHourIsOneHoursRate() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = TestFixtures.pendingBooking(TestFixtures.studentUser(), TestFixtures.room(), start, start.plusHours(1));
        assertEquals(20.00, booking.getTotalCost());
    }

    @Test
    void totalCostRoundsPartialHoursUp() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        // 1 hour 15 minutes should round up to 2 hours of cost.
        Booking booking = TestFixtures.pendingBooking(TestFixtures.studentUser(), TestFixtures.room(), start, start.plusMinutes(75));
        assertEquals(40.00, booking.getTotalCost());
    }

    @Test
    void calculateTotalCostThrowsWhenEndIsNotAfterStart() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = TestFixtures.pendingBooking(TestFixtures.studentUser(), TestFixtures.room(), start, start.plusHours(1));

        // Force an invalid range directly through updateTime, bypassing service-level validation,
        // to test that calculateTotalCost() itself guards against a non-positive duration.
        assertThrows(IllegalArgumentException.class, () -> booking.updateTime(start, start));
    }

    @Test
    void remainingBalanceEqualsTotalCostWhenDepositUnpaid() {
        Booking booking = TestFixtures.pendingBooking();
        assertEquals(booking.getTotalCost(), booking.getRemainingBalance());
    }

    @Test
    void remainingBalanceSubtractsDepositOncePaidAndNotForfeited() {
        Booking booking = TestFixtures.confirmedBooking();
        assertEquals(booking.getTotalCost() - booking.getDeposit().getAmount(), booking.getRemainingBalance());
    }

    @Test
    void remainingBalanceNeverGoesNegativeWhenDepositExceedsTotal() {
        // A 1-hour booking has totalCost == deposit amount, so remaining balance should be exactly 0, not negative.
        Booking booking = TestFixtures.confirmedBooking();
        assertEquals(0.0, booking.getRemainingBalance());
    }

    @Test
    void remainingBalanceEqualsFullTotalWhenDepositForfeited() {
        Booking booking = TestFixtures.confirmedBooking();
        booking.getDeposit().forfeit();
        assertEquals(booking.getTotalCost(), booking.getRemainingBalance());
    }

    @Test
    void updateTimeRecalculatesTotalCost() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = TestFixtures.pendingBooking(TestFixtures.studentUser(), TestFixtures.room(), start, start.plusHours(1));
        assertEquals(20.00, booking.getTotalCost());

        booking.updateTime(start, start.plusHours(3));
        assertEquals(60.00, booking.getTotalCost());
        assertEquals(start.plusHours(3), booking.getEndTime());
    }

    @Test
    void extendEndTimeRecalculatesTotalCost() {
        Booking booking = TestFixtures.confirmedBooking();
        LocalDateTime newEnd = booking.getEndTime().plusHours(1);

        booking.extendEndTime(newEnd);

        assertEquals(newEnd, booking.getEndTime());
        assertEquals(40.00, booking.getTotalCost());
    }

    @Test
    void setStatusAndSetStateUpdateBookingDirectly() {
        Booking booking = TestFixtures.pendingBooking();
        booking.setStatus(BookingStatus.CANCELLED);
        booking.setState(new CancelledState());

        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
        assertInstanceOf(CancelledState.class, booking.getState());
    }

    @Test
    void payUpfrontFeeDelegatesToCurrentState() {
        Booking booking = TestFixtures.pendingBooking();
        booking.payUpfrontFee();

        assertTrue(booking.getDeposit().isPaid());
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
        assertInstanceOf(ConfirmedState.class, booking.getState());
    }

    @Test
    void cancelDelegatesToCurrentStateAndUpdatesStatus() {
        Booking booking = TestFixtures.pendingBooking();
        booking.cancel();

        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
        assertInstanceOf(CancelledState.class, booking.getState());
    }
}
