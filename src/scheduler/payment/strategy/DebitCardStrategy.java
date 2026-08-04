package scheduler.payment.strategy;

/**
 *  Strategy Pattern: Debit Card Payment implementation
 * @author amaladen
 *
 */
public class DebitCardStrategy implements PaymentStrategy{
	  private String cardNUMBER;
      private String expiryDate;
      private String cvv;
      
      
      public DebitCardStrategy(String cardNUMBER, String expiryDate,String cvv) {
    	  this.cardNUMBER =cardNUMBER;
    	  this.expiryDate=expiryDate;
    	  this.cvv=cvv;
      }
      
      
      @Override
      public void pay(double amount) {
    	  String cardNumberLastFour = cardNUMBER.substring(Math.max(0, cardNUMBER.length() - 4));
    	  System.out.println("Paid $"+amount+" using Debit card ending in " +cardNumberLastFour );
      }
	
      public void refund(double amount) {
    	  String cardNumberLastFour =cardNUMBER.substring(Math.max(0, cardNUMBER.length() - 4));
    	  System.out.println("Refunded $"+amount+" using Debit card ending in " +cardNumberLastFour );
      }
	public String getPaymentMethodName() {
		return "debitCard";
	}
	public String getPaymentID() {
		return cardNUMBER.substring(Math.max(0, cardNUMBER.length() - 4));
	}
	
	
}
