package york.roombooking.model;


	
public enum DepositState {
	 APPLIED("Booking approved"),
	 PENDING("Pending"),
	 FORFEITED("Forfeited"),
	 REFUNDED("Refunded"); 
	
	
	
	
     private final String displayName;

     
     
         DepositState(String displayName){
    	 this.displayName=displayName;
    	 
     }
	
   public String getDisplayName() {
	   return displayName;
	  
   }
   public boolean isTerminal() {
	   return this == APPLIED || this == FORFEITED|| this == REFUNDED;
   }
	public boolean isPending() {
	return this==PENDING;
	}
	@Override
	public String toString() {
		return displayName;
	}
}
