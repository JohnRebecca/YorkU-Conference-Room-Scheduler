package york.roombooking.model;

/**
 * This class represents deposit made for a booking
 
*/
public class Deposit {

   private double price;
   private int bookingID;
   private int depositID;
   private DepositState status;
   private String paymentMethod;
   private String institutionID;
   private String cardNUMBER;
 

/**
 * Default constructor- makes a deposit with a pending satus
*/
   public Deposit() {
	this.status =DepositState.PENDING;
	
	
}
   /**
    * Constructor with all feilds
    
   */
   public Deposit(int bookingId, int depositID, double price, DepositState status, String paymentMethod ) {
	
		this.bookingID=bookingID;
		this.depositID=depositID;
		this.price=price;
		this.status=status;
		this.paymentMethod=paymentMethod;
		
		
		
	}
   /**
    * Constructor with all card deposits
    
   */
   public Deposit(int bookingId, int depositID, double price, String cardNUMBER ) {
		
		this.bookingID=bookingID;
		this.depositID=depositID;
		this.price=price;
		this.cardNUMBER=cardNUMBER;
		this.status=DepositState.PENDING;
		
		
		
	}
   public Deposit(int bookingId, double price,String paymentMethod, String institutionID) {
		
		this.bookingID=bookingID;
		this.price=price;
	    this.paymentMethod=paymentMethod;
	    this.institutionID=institutionID;
		this.status=DepositState.PENDING;
		
		
		
	}
   // Constructor for PaymentService - creates a deposit with deposit ID, booking ID, and amount.
   public Deposit(int depositId, int bookingId, double amount) {
	    this.depositID = depositId;
	    this.bookingID = bookingId;
	    this.price = amount;
	    this.status = DepositState.PENDING;
	}
   
   public boolean isApplied() {
	    return status == DepositState.APPLIED;
	}

	/**
	 * Returns true if the deposit is FORFEITED.
	 */
	public boolean isForfeited() {
	    return status == DepositState.FORFEITED;
	}

	/**
	 * Returns true if the deposit is REFUNDED.
	 */
	public boolean isRefunded() {
	    return status == DepositState.REFUNDED;
	}
   /**
    * Getter and Setters
    
   */
   public int getBookingId() {
	   return bookingID;
	   
	   
   }
   public int getDepositId() {
	   return depositID;
   }
   
   public double getPrice() {
	   return price;
	   
   }
   
   public String getPaymentMethod() {
       return paymentMethod;
   }
   public String getCardNumber() {
       return cardNUMBER;
   }
   public String getInstitutionId() {
       return institutionID;
   }
   public DepositState getState() {
	   return status;
	   
   }
   
   public void setBookingId(int bookingID) {
	   this.bookingID=bookingID;
   }
   
   public void setDepositeId(int depositID) {
	   this.depositID=depositID;
   }
   
   public void setPrice(double price) {
	   this.price=price;
   }
   public void setPaymentMethod(String paymentMethod) {
       this.paymentMethod=paymentMethod;
   }
   public void setCardNumber(String cardNUMBER) {
       this.cardNUMBER=cardNUMBER;
   }
   public void setInstitutionId(String institutionId) {
       this.institutionID=institutionId;
   }
   /**
    * Applies Deposit
   */
   public void depositApplied() {
	   if(status.isPending()) {
		   this.status= DepositState.APPLIED;
		   System.out.println("Deposit of "+ price+ "applied to booking ");
	   }else {
		   System.out.println("Cannot apply deposit. Current status of deposit: "+status.getDisplayName() );
	   }
   }
   /**
    * Forfeits Deposit
   */
   public void depositForfeited() {
	   if(status.isPending()) {
		   this.status= DepositState.FORFEITED;
		   System.out.println("Deposit of "+ price+ "forfeited to booking ");
	   }else {
		   System.out.println("Cannot forfeited deposit. Current status of deposit: "+status.getDisplayName() );
	   }
   } 
   /**
    * Refunds Deposit
   */
   public void depositRefunded() {
	   if(status.isPending()) {
		   this.status= DepositState.REFUNDED;
		   System.out.println("Deposit of "+ price+ "refunded");
	   }else {
		   System.out.println("Cannot refund deposit. Current status of deposit: "+status.getDisplayName() );
	   }
   }
      
   /**
    * Returns true if the deposit is pending
   */
   public boolean isPending() {
     return status.isPending();
   
   }
   /**
    * Returns true if the deposit refunded,forfeited,or applied
   */
   public boolean isTerminal() {
	     return status.isTerminal();
	   
	   }
   /**
    * Returns payment identifiers 
   */
   public String getPaymentID() {
	   if(cardNUMBER !=null&&!cardNUMBER.isEmpty()) {
		   return "Card Number is " + cardNUMBER;
	   }
	   else if(institutionID!= null && !institutionID.isEmpty()){
		   return "Institution:" + institutionID;
	   }
	   
	   return "please use a valid payment method";
	 
   }
   @Override
   public String toString() {
       return "Deposit{" +
              "depositId=" +  depositID +
              ",bookingId=" + bookingID +
              ",price=$" + price +
              ", state=" + status.getDisplayName() +
              ", paymentMethod='" + paymentMethod + '\'' +
              ", identifier='" + getPaymentMethod() + '\'' +
              '}';
   }
}

