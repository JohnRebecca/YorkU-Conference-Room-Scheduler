package scheduler.payment.strategy;

/**
 * Strategy Pattern: Credit Card Payment implementation
 * @author amaladen
 *
 */

public class CreditCardStrategy implements PaymentStrategy {
      private String cardNUMBER;
      private String expiryDate;
      private String cvv;
      
      
      public CreditCardStrategy(String cardNUMBER, String expiryDate,String cvv) {
    	  this.cardNUMBER =cardNUMBER;
    	  this.expiryDate=expiryDate;
    	  this.cvv=cvv;
      }
      
      
      @Override
      public void pay(double amount) {
    	  String cardNumberLastFour = cardNUMBER.substring(cardNUMBER.length());
    	  System.out.println("Paid $"+amount+" using Credit card ending in " +cardNumberLastFour );
      }
	
      public void refund(double amount) {
    	  String cardNumberLastFour =cardNUMBER.substring(cardNUMBER.length());
    	  System.out.println("Refunded $"+amount+" using Credit card ending in " +cardNumberLastFour );
      }
	public String getPaymentMethodName() {
		return "creditCard";
	}
	public String getPaymentID() {
		return cardNUMBER.substring(cardNUMBER.length());
	}
	
}
