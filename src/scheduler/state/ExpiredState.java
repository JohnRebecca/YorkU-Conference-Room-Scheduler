package scheduler.state;

import scheduler.exception.InvalidBookingActionException;
import scheduler.model.Booking;

import java.time.LocalDateTime;

public class ExpiredState implements BookingState {

    @Override
    public void payUpfrontFee(Booking booking) {
        throw new InvalidBookingActionException("Expired booking cannot be paid.");
    }

    @Override
    public void edit(Booking booking, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        throw new InvalidBookingActionException("Expired booking cannot be edited.");
    }

    @Override
    public void cancel(Booking booking) {
        throw new InvalidBookingActionException("Expired booking cannot be cancelled.");
    }

    @Override
    public void extend(Booking booking, LocalDateTime newEndTime) {
        throw new InvalidBookingActionException("Expired booking cannot be extended.");
    }

    @Override
    public void checkIn(Booking booking) {
        throw new InvalidBookingActionException("Expired booking cannot be checked in.");
    }

    @Override
    public void complete(Booking booking) {
        throw new InvalidBookingActionException("Expired booking cannot be completed.");
    }

    @Override
    public void expire(Booking booking) {
        throw new InvalidBookingActionException("Booking is already expired.");
    }
}