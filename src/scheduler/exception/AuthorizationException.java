package scheduler.exception;

public class AuthorizationException extends AccountException {

    private static final long serialVersionUID = 1L;

    public AuthorizationException(String message) {
        super(message);
    }
}