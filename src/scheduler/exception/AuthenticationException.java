package scheduler.exception;

public class AuthenticationException extends AccountException {

    private static final long serialVersionUID = 1L;

    public AuthenticationException(String message) {
        super(message);
    }
}