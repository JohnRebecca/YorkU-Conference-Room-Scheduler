package scheduler.exception;

public class DuplicateEmailException extends AccountException {

    private static final long serialVersionUID = 1L;

    public DuplicateEmailException(String email) {
        super("An account already exists for " + email + ".");
    }
}