package scheduler.model;

public class Deposit {
    private double amount;
    private boolean paid;
    private boolean appliedToFinalCost;
    private boolean forfeited;

    public Deposit(double amount) {
        this.amount = amount;
        this.paid = false;
        this.appliedToFinalCost = false;
        this.forfeited = false;
    }

    public double getAmount() {
        return amount;
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
}