package scheduler.exception;/**
 * exception thrown when card number is invalid.
 * card number must be between 12 - 16 digits and contains numbers only       
 * @author amaladen
 * expection is thrown during payment validation when user enters a card number that doesn't meet the requirements
 */
public class InvalidCardException extends Exception {

	
	public InvalidCardException(String message) {
		super(message);
		
	}
	
	/**
	 * @param message is the detail message explaining why the card is invalid
	 * @param cause is the cause of the exception
	 */
	
	public InvalidCardException(String message, Throwable cause) {
		super(message,cause);
	}
}
