package scheduler.exception;

public class InvalidBookingActionException extends BookingException {
    public InvalidBookingActionException(String message) {
        super(message);
    }
}