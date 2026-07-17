package service;
import java.util.ArrayList;
import java.util.List;
import york.roombooking.model.Deposit;
import york.roombooking.model.DepositState;
import strategy.PaymentStrategy;
import strategy.PaymentProcessor;

/**
 * PaymentService handles all deposit operations:
 * Collecting deposits 
 * apply deposits
 * forfeiting deposits
 * refunding deposits
 * 
 * Singleton Pattern used to makes sure one instance exits
 */
	public class PaymentService {
		
		private static PaymentService instance;
		
		private PaymentService() {
			
		}
		
		
		public static PaymentService getInstance() {
			if(instance == null) {
				instance=new PaymentService(); 
					
				}
				
				return instance;
				
				
			}
		
		
		private List<Deposit> deposits =new ArrayList<>();
		private int nextDepositId=1;
		
		
		/**
		 * collects a deposit from the user
		 * 
		 * @param bookingId
		 * @param amount
		 * @param startegy
		 * @return the created Deposit object
		 */
		
		public Deposit collectDeposit(int bookingId, double amount,PaymentStrategy strategy) {
			PaymentProcessor processor = new PaymentProcessor(strategy);
			processor.processPayment(amount);
			
	        Deposit deposit = new Deposit(nextDepositId++, bookingId, amount);
	        deposit.setPaymentMethod(strategy.getPaymentMethodName());
	        deposits.add(deposit);
	        
	        System.out.println("Deposit of $ "+ amount+"collected for booking #"+bookingId);
	        System.out.println("  Deposit ID: "+deposit.getDepositId());
	        System.out.println(" Status: "+ deposit.getState().getDisplayName());
	        return deposit;}
		
		 public Deposit findDepositByBooking(int bookingId) {
		        for (Deposit i : deposits) {
		            if (i.getBookingId() == bookingId) {
		                return i;
		             }
		         }
		          return null;
		    }
	        public void applyDepositToBooking(int bookingId) throws Exception {
	        	Deposit deposit= findDepositByBooking(bookingId);
	        	if (deposit == null) {
	        		throw new Exception("No deposit found for booking #" + bookingId);
	        		
	        	}
	        	if(!deposit.isPending()) {
	        		throw new Exception ("Cannot apply deposit. Current State: " + deposit.getState().getDisplayName() );
	        	}
	        	
	        	deposit.depositApplied();
	        	System.out.println("Depsoit applied to booking #"+bookingId);
	        }
	            public void forfeitDeposit(int bookingId) throws Exception{
	            	Deposit deposit = findDepositByBooking(bookingId);
	            	
	            	if (deposit==null) {
	            		throw new Exception("No deposit found for booking #"+bookingId);
	            }
	            	if(!deposit.isPending()) {
	            		throw new Exception("Cannot forfeit deposit. Current State: " +deposit.getState().getDisplayName());
	            	}
	            	deposit.depositForfeited();
	            	System.out.println("Deposit forfeited for booking #" + bookingId);
	        }
	            
	        public void refundDeposit(int bookingId) throws Exception {
	        	Deposit deposit= findDepositByBooking(bookingId);
	        	if (deposit == null) {
	        		throw new Exception("No deposit found for booking #" + bookingId);
	        		
	        	}
	        	if(!deposit.isPending()) {
	        		throw new Exception ("Cannot refund deposit. Current State: " + deposit.getState().getDisplayName() );
	        	}
	         	
            	deposit.depositRefunded();
            	System.out.println("Deposit refunded for booking #" + bookingId);
        }
          
	        public List<Deposit> getDeposits(){
	        	return new ArrayList<>(deposits);
	        	
	        	
	        }
		
		
		
}
