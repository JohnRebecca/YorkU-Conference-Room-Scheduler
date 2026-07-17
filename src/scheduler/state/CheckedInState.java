package scheduler.state;

import scheduler.exception.InvalidBookingActionException;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;

import java.time.LocalDateTime;

public class CheckedInState implements BookingState {

    @Override
    public void payUpfrontFee(Booking booking) {
        throw new InvalidBookingActionException("Upfront fee has already been paid.");
    }

    @Override
    public void edit(Booking booking, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        throw new InvalidBookingActionException("Checked-in booking cannot be edited.");
    }

    @Override
    public void cancel(Booking booking) {
        throw new InvalidBookingActionException("Checked-in booking cannot be cancelled.");
    }

    @Override
    public void extend(Booking booking, LocalDateTime newEndTime) {
        if (!LocalDateTime.now().isBefore(booking.getEndTime())) {
            throw new InvalidBookingActionException("Booking cannot be extended after expiry.");
        }

        if (!newEndTime.isAfter(booking.getEndTime())) {
            throw new InvalidBookingActionException("New end time must be after current end time.");
        }

        booking.extendEndTime(newEndTime);
    }

    @Override
    public void checkIn(Booking booking) {
        throw new InvalidBookingActionException("User has already checked in.");
    }

    @Override
    public void complete(Booking booking) {
        booking.setStatus(BookingStatus.COMPLETED);
        booking.setState(new CompletedState());
    }

    @Override
    public void expire(Booking booking) {
        booking.setStatus(BookingStatus.EXPIRED);
        booking.setState(new ExpiredState());
    }
}