package scheduler.state;

import scheduler.util.AppClock;
import scheduler.exception.InvalidBookingActionException;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;

import java.time.LocalDateTime;

public class PendingPaymentState implements BookingState {

    @Override
    public void payUpfrontFee(Booking booking) {
        booking.getDeposit().markPaid();
        booking.setStatus(BookingStatus.CONFIRMED);
        booking.setState(new ConfirmedState());
    }

    @Override
    public void edit(Booking booking, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        if (!AppClock.now().isBefore(booking.getStartTime())) {
            throw new InvalidBookingActionException("Booking cannot be edited after the start time.");
        }

        booking.updateTime(newStartTime, newEndTime);
    }

    @Override
    public void cancel(Booking booking) {
        if (!AppClock.now().isBefore(booking.getStartTime())) {
            throw new InvalidBookingActionException("Booking cannot be cancelled after the start time.");
        }

        booking.setStatus(BookingStatus.CANCELLED);
        booking.setState(new CancelledState());
    }

    @Override
    public void extend(Booking booking, LocalDateTime newEndTime) {
        throw new InvalidBookingActionException("Booking cannot be extended before upfront payment is completed.");
    }

    @Override
    public void checkIn(Booking booking) {
        throw new InvalidBookingActionException("Booking cannot be checked in before payment.");
    }

    @Override
    public void complete(Booking booking) {
        throw new InvalidBookingActionException("Pending booking cannot be completed.");
    }

    @Override
    public void expire(Booking booking) {
        booking.setStatus(BookingStatus.EXPIRED);
        booking.setState(new ExpiredState());
    }
}