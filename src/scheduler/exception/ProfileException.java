package scheduler.exception;

public class ProfileException extends AccountException {

    private static final long serialVersionUID = 1L;

    public ProfileException(String message) {
        super(message);
    }

    public ProfileException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }
}