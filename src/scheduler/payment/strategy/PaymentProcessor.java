package scheduler.payment.strategy;
/**
 * Strategy Pattern- Context Class
 * 
 * 
 */
public class PaymentProcessor {
	private PaymentStrategy strategy;
	
	
	public PaymentProcessor(PaymentStrategy strategy) {
		this.strategy=strategy;
		
	}
	
	public void setStrategy(PaymentStrategy strategy) {
		this.strategy=strategy;
		
	}
	
	public void processPayment(double amount) {
		strategy.pay(amount);
	}
	public void processRefund(double amount) {
		strategy.refund(amount);
	}
	public PaymentStrategy getStrategy() {
		return strategy;
	}
	
	public String getMethodName() {
		return strategy.getPaymentMethodName();
	}
}
