package scheduler.state;

import scheduler.exception.InvalidBookingActionException;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;

import java.time.LocalDateTime;

public class ConfirmedState implements BookingState {

    @Override
    public void payUpfrontFee(Booking booking) {
        throw new InvalidBookingActionException("Upfront fee has already been paid.");
    }

    @Override
    public void edit(Booking booking, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        if (!LocalDateTime.now().isBefore(booking.getStartTime())) {
            throw new InvalidBookingActionException("Booking cannot be edited after the start time.");
        }

        booking.updateTime(newStartTime, newEndTime);
    }

    @Override
    public void cancel(Booking booking) {
        if (!LocalDateTime.now().isBefore(booking.getStartTime())) {
            throw new InvalidBookingActionException("Booking cannot be cancelled after the start time.");
        }

        booking.setStatus(BookingStatus.CANCELLED);
        booking.setState(new CancelledState());
    }

    @Override
    public void extend(Booking booking, LocalDateTime newEndTime) {
        if (!LocalDateTime.now().isBefore(booking.getEndTime())) {
            throw new InvalidBookingActionException("Booking cannot be extended after it has expired.");
        }

        if (!newEndTime.isAfter(booking.getEndTime())) {
            throw new InvalidBookingActionException("New end time must be after the current end time.");
        }

        booking.extendEndTime(newEndTime);
    }

    @Override
    public void checkIn(Booking booking) {
        LocalDateTime latestAllowedCheckIn = booking.getStartTime().plusMinutes(30);

        if (LocalDateTime.now().isAfter(latestAllowedCheckIn)) {
            booking.getDeposit().forfeit();
            booking.setStatus(BookingStatus.EXPIRED);
            booking.setState(new ExpiredState());
            throw new InvalidBookingActionException("User did not check in within 30 minutes. Deposit is forfeited.");
        }

        booking.getDeposit().applyToFinalCost();
        booking.setStatus(BookingStatus.CHECKED_IN);
        booking.setState(new CheckedInState());
    }

    @Override
    public void complete(Booking booking) {
        throw new InvalidBookingActionException("Booking must be checked in before it can be completed.");
    }

    @Override
    public void expire(Booking booking) {
        booking.getDeposit().forfeit();
        booking.setStatus(BookingStatus.EXPIRED);
        booking.setState(new ExpiredState());
    }
}