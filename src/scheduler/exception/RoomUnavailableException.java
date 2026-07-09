package scheduler.exception;

public class RoomUnavailableException extends BookingException {
    public RoomUnavailableException(String message) {
        super(message);
    }
}