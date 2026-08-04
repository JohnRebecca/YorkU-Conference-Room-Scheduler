package scheduler.payment.strategy;

/**
 *  Strategy Pattern: Institutional Billing implementation
 * @author amaladen
 *
 */
public class InstitutionalBillingStrategy implements PaymentStrategy {
	public String institutionId;
	public String departmentCode;

	public InstitutionalBillingStrategy(String institutionId) {
	    this.institutionId = institutionId;
	}
	public InstitutionalBillingStrategy(String institutionId, String departmentCode) {
	    this.institutionId = institutionId;
	    this.departmentCode = departmentCode;
	}

	public void pay(double amount) {
		System.out.println("Billed $ " + amount + " to Institution: " + institutionId);
	}
	public void refund(double amount) {
		System.out.println("Refunded $ " + amount + " to Institution: " + institutionId);
	}

	public String getPaymentMethodName() {
		return "institutional";
	}
	public String getPaymentID() {
		return institutionId;
	}
}
