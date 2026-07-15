package york.roombooking.exceptions;
import york.roombooking.model.DepositState;
/**
 * exception thrown when trying to change a deposit to an invalid state
 * 
 * trying ti to forfeit a deposit that already applied
 * @author amaladen
 *
 */


public class InvalidStateException extends Exception {
	
	
	public InvalidStateException(int depositId, DepositState currentState, String attempted) {
		super("Cannot " +attempted +" deposit #" + depositId + "because it is already "+ currentState.getDisplayName());
	}
	
	public InvalidStateException(String message) {
		super(message);
	}

}
