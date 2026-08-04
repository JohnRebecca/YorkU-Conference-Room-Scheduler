package scheduler.exception;/**
 * exception thrown when a deposit cannot be found for a booking
 * @author amaladen
 *
 */
public class DepositNotFoundException extends Exception{
	public DepositNotFoundException (int bookingId) {
		super("No deposit found for this booking "+ bookingId);
	}
	
	public  DepositNotFoundException(String message) {
		super(message);
	}

}
