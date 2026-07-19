package scheduler.model;

public class Deposit {
    // === From Group's Deposit ===
    private double amount;
    private boolean paid;
    private boolean appliedToFinalCost;
    private boolean forfeited;

    // === From amal Deposit ===
    private int depositId;
    private int bookingId;
    private String paymentMethod;
    private String institutionId;
    private String cardNumber;

    // === CONSTRUCTORS ===

    // Group's constructor
    public Deposit(double amount) {
        this.amount = amount;
        this.paid = false;
        this.appliedToFinalCost = false;
        this.forfeited = false;
    }

    // Amal (for PaymentService)
    public Deposit(int depositId, int bookingId, double amount) {
        this.depositId = depositId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paid = false;
        this.appliedToFinalCost = false;
        this.forfeited = false;
    }

    //Amal Deposit
    public Deposit(int depositId, int bookingId, double amount, String paymentMethod) {
        this.depositId = depositId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paid = false;
        this.appliedToFinalCost = false;
        this.forfeited = false;
    }

    // === GETTERS ===

    public double getAmount() {
        return amount;
    }

    public int getDepositId() {
        return depositId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean isPaid() {
        return paid;
    }

    public boolean isAppliedToFinalCost() {
        return appliedToFinalCost;
    }

    public boolean isForfeited() {
        return forfeited;
    }

    // === SETTERS ===

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // === STATUS METHODS ===

    public void markPaid() {
        this.paid = true;
    }

    public void applyToFinalCost() {
        if (!paid) {
            throw new IllegalStateException("Deposit must be paid before it can be applied.");
        }
        this.appliedToFinalCost = true;
        this.forfeited = false;
    }

    public void forfeit() {
        if (!paid) {
            throw new IllegalStateException("Deposit must be paid before it can be forfeited.");
        }
        this.forfeited = true;
        this.appliedToFinalCost = false;
    }

    // ===AMAL METHODS ===

    public boolean isPending() {
        return paid && !forfeited && !appliedToFinalCost;
    }

    public boolean isTerminal() {
        return forfeited || appliedToFinalCost;
    }

    public boolean isApplied() {
        return appliedToFinalCost;
    }

    public boolean isRefunded() {
        return forfeited;
    }
 // ============================================================
 // AMAL'S METHODS (add these to keep your code working)
 // ============================================================

 public void depositApplied() {
     if (!paid) {
         throw new IllegalStateException("Deposit must be paid before it can be applied.");
     }
     this.appliedToFinalCost = true;
     this.forfeited = false;
     System.out.println("Deposit of $" + amount + " applied to booking");
 }

 public void depositForfeited() {
     if (!paid) {
         throw new IllegalStateException("Deposit must be paid before it can be forfeited.");
     }
     this.forfeited = true;
     this.appliedToFinalCost = false;
     System.out.println("Deposit of $" + amount + " forfeited");
 }

 public void depositRefunded() {
     if (!paid) {
         throw new IllegalStateException("Deposit must be paid before it can be refunded.");
     }
     this.forfeited = true;
     this.appliedToFinalCost = false;
     System.out.println("Deposit of $" + amount + " refunded");
 }

 public String getDisplayName() {
     if (isAppliedToFinalCost()) return "Applied";
     if (isForfeited()) return "Forfeited";
     if (isPaid()) return "Paid";
     return "Pending";
 }

 public DepositState getState() {
     // This returns a DepositState enum for compatibility
     if (isAppliedToFinalCost()) return DepositState.APPLIED;
     if (isForfeited()) return DepositState.FORFEITED;
     if (isPaid()) return DepositState.PENDING;
     return DepositState.PENDING;
 }

    @Override
    public String toString() {
        return "Deposit{" +
                "depositId=" + depositId +
                ", bookingId=" + bookingId +
                ", amount=$" + amount +
                ", paid=" + paid +
                ", appliedToFinalCost=" + appliedToFinalCost +
                ", forfeited=" + forfeited +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}