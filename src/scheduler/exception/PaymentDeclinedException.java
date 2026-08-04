package scheduler.exception;
/**
 * exception thrown when a payment is declined
 *
 */
public class PaymentDeclinedException extends Exception{

	
	public  PaymentDeclinedException (String messsage) {
		super(messsage);
		
	}
	public  PaymentDeclinedException (String messsage, Throwable cause) {
		super(messsage,cause);
		
	}
	
	

}
