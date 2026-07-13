package strategy;
/**
 * Strategy Pattern: interface for every type payment
 */

public interface PaymentStrategy {
	/**
	 * Process a refund given the amount
	 */
	void refund(double amount);
	
	/**
	 * Process a payment given the amount
	 */
	
	
	
	void pay(double amount);
	
	/**
	 * get the name of this payment method
	 * 
	 */
	String getPaymentMethodName();
	
	/**
	 * get card number or Instituion ID
	 * 
	 */
	String getPaymentID();
	
}
