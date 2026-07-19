package scheduler.payment.strategy;

public class InstitutionalBillingStrategy implements PaymentStrategy {
	/**
	 *  Strategy Pattern: Debit Card Payment implementation
	 * @author amaladen
	 *
	 */
	public  String institutionId;
	public String instituionID;
	public String departmentCode;
	
	
	public InstitutionalBillingStrategy(String institutionId) {
	    this.institutionId = institutionId;
	}
	public InstitutionalBillingStrategy(String institutionId, String departmentCode) {
	    this.institutionId = institutionId;
	    this.departmentCode = departmentCode;
	}
	
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
