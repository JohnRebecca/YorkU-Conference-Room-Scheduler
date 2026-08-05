package scheduler.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    @Test
    void groupConstructorSetsAmountAndDefaultsToUnpaid() {
        Deposit deposit = new Deposit(20.00);

        assertEquals(20.00, deposit.getAmount());
        assertFalse(deposit.isPaid());
        assertFalse(deposit.isAppliedToFinalCost());
        assertFalse(deposit.isForfeited());
    }

    @Test
    void threeArgConstructorSetsDepositAndBookingId() {
        Deposit deposit = new Deposit(5, 100, 20.00);

        assertEquals(5, deposit.getDepositId());
        assertEquals(100, deposit.getBookingId());
        assertEquals(20.00, deposit.getAmount());
    }

    @Test
    void fourArgConstructorAlsoSetsPaymentMethod() {
        Deposit deposit = new Deposit(5, 100, 20.00, "creditCard");
        assertEquals("creditCard", deposit.getPaymentMethod());
    }

    @Test
    void markPaidSetsPaidTrue() {
        Deposit deposit = new Deposit(20.00);
        deposit.markPaid();
        assertTrue(deposit.isPaid());
    }

    @Test
    void applyToFinalCostThrowsWhenNotYetPaid() {
        Deposit deposit = new Deposit(20.00);
        assertThrows(IllegalStateException.class, deposit::applyToFinalCost);
    }

    @Test
    void applyToFinalCostSucceedsAfterPayment() {
        Deposit deposit = new Deposit(20.00);
        deposit.markPaid();
        deposit.applyToFinalCost();

        assertTrue(deposit.isAppliedToFinalCost());
        assertFalse(deposit.isForfeited());
    }

    @Test
    void forfeitThrowsWhenNotYetPaid() {
        Deposit deposit = new Deposit(20.00);
        assertThrows(IllegalStateException.class, deposit::forfeit);
    }

    @Test
    void forfeitSucceedsAfterPayment() {
        Deposit deposit = new Deposit(20.00);
        deposit.markPaid();
        deposit.forfeit();

        assertTrue(deposit.isForfeited());
        assertFalse(deposit.isAppliedToFinalCost());
    }

    @Test
    void forfeitAfterApplyingClearsTheAppliedFlag() {
        Deposit deposit = new Deposit(20.00);
        deposit.markPaid();
        deposit.applyToFinalCost();
        deposit.forfeit();

        assertTrue(deposit.isForfeited());
        assertFalse(deposit.isAppliedToFinalCost());
    }

    @Test
    void applyAfterForfeitingClearsTheForfeitedFlag() {
        Deposit deposit = new Deposit(20.00);
        deposit.markPaid();
        deposit.forfeit();
        deposit.applyToFinalCost();

        assertTrue(deposit.isAppliedToFinalCost());
        assertFalse(deposit.isForfeited());
    }

    @Test
    void isPendingIsTrueOnlyWhenPaidAndNotYetAppliedOrForfeited() {
        Deposit deposit = new Deposit(20.00);
        assertFalse(deposit.isPending());

        deposit.markPaid();
        assertTrue(deposit.isPending());

        deposit.applyToFinalCost();
        assertFalse(deposit.isPending());
    }

    @Test
    void isTerminalIsTrueOnceAppliedOrForfeited() {
        Deposit applied = new Deposit(20.00);
        applied.markPaid();
        applied.applyToFinalCost();
        assertTrue(applied.isTerminal());

        Deposit forfeited = new Deposit(20.00);
        forfeited.markPaid();
        forfeited.forfeit();
        assertTrue(forfeited.isTerminal());
    }

    @Test
    void setPaymentMethodCardNumberAndInstitutionIdStoreValues() {
        Deposit deposit = new Deposit(20.00);
        deposit.setPaymentMethod("debitCard");
        deposit.setCardNumber("4111111111111111");
        deposit.setInstitutionId("YORKU-01");

        assertEquals("debitCard", deposit.getPaymentMethod());
        assertEquals("4111111111111111", deposit.getCardNumber());
        assertEquals("YORKU-01", deposit.getInstitutionId());
    }

    @Test
    void getDisplayNameReflectsCurrentLifecycleStage() {
        Deposit deposit = new Deposit(20.00);
        assertEquals("Pending", deposit.getDisplayName());

        deposit.markPaid();
        assertEquals("Paid", deposit.getDisplayName());

        deposit.applyToFinalCost();
        assertEquals("Applied", deposit.getDisplayName());
    }

    @Test
    void getDisplayNameReturnsForfeitedWhenForfeited() {
        Deposit deposit = new Deposit(20.00);
        deposit.markPaid();
        deposit.forfeit();

        assertEquals("Forfeited", deposit.getDisplayName());
    }

    @Test
    void toStringIncludesAmountAndPaymentMethod() {
        Deposit deposit = new Deposit(5, 100, 20.00, "creditCard");
        String text = deposit.toString();

        assertTrue(text.contains("20.0"));
        assertTrue(text.contains("creditCard"));
    }
}
