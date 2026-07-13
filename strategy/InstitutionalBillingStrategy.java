package strategy;

public class InstitutionalBillingStrategy implements PaymentStrategy {
	/**
	 *  Strategy Pattern: Debit Card Payment implementation
	 * @author amaladen
	 *
	 */
	private String instituionID;
	
	
	
	
	public void pay(double amount) {
		System.out.println("Billed $ " + amount + " to Instituion: "+instituionID);
	}
	public void refund(double amount) {
		System.out.println("refunded $ " + amount + " to Instituion: "+instituionID);
	}
	
	public String getPaymentMethodName() {
		return "institutional";
	}
	public String getPaymentID() {
		return instituionID;
	}
	

}
