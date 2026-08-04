package test.ai.scheduler.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import scheduler.model.Deposit;
import static org.junit.jupiter.api.Assertions.*;

class DepositAITest {
    private Deposit deposit;

    @BeforeEach
    void setUp() {
        deposit = new Deposit(1, 101, 30.00);
    }

    @Test
    void testConstructorWithAllFields() {
        assertEquals(1, deposit.getDepositId());
        assertEquals(101, deposit.getBookingId());
        assertEquals(30.00, deposit.getAmount());
        assertFalse(deposit.isPaid());
        assertFalse(deposit.isAppliedToFinalCost());
        assertFalse(deposit.isForfeited());
    }

    @Test
    void testConstructorWithPaymentMethod() {
        Deposit d = new Deposit(1, 101, 30.00, "credit_card");
        assertEquals("credit_card", d.getPaymentMethod());
        assertFalse(d.isPaid());
    }

    @Test
    void testConstructorWithAmountOnly() {
        Deposit d = new Deposit(50.00);
        assertEquals(50.00, d.getAmount());
        assertFalse(d.isPaid());
        assertFalse(d.isAppliedToFinalCost());
        assertFalse(d.isForfeited());
    }

    @Test
    void testMarkPaid() {
        deposit.markPaid();
        assertTrue(deposit.isPaid());
    }

    @Test
    void testApplyToFinalCost() {
        deposit.markPaid();
        deposit.applyToFinalCost();
        assertTrue(deposit.isAppliedToFinalCost());
        assertFalse(deposit.isForfeited());
    }

    @Test
    void testApplyToFinalCostThrowsIfNotPaid() {
        assertThrows(IllegalStateException.class, () -> {
            deposit.applyToFinalCost();
        });
    }

    @Test
    void testForfeit() {
        deposit.markPaid();
        deposit.forfeit();
        assertTrue(deposit.isForfeited());
        assertFalse(deposit.isAppliedToFinalCost());
    }

    @Test
    void testForfeitThrowsIfNotPaid() {
        assertThrows(IllegalStateException.class, () -> {
            deposit.forfeit();
        });
    }

    @Test
    void testDepositApplied() {
        deposit.markPaid();
        deposit.depositApplied();
        assertTrue(deposit.isAppliedToFinalCost());
    }

    @Test
    void testDepositForfeited() {
        deposit.markPaid();
        deposit.depositForfeited();
        assertTrue(deposit.isForfeited());
    }

    @Test
    void testDepositRefunded() {
        deposit.markPaid();
        deposit.depositRefunded();
        assertTrue(deposit.isForfeited());
    }

    @Test
    void testGetDisplayNamePending() {
        assertEquals("Pending", deposit.getDisplayName());
    }

    @Test
    void testGetDisplayNameApplied() {
        deposit.markPaid();
        deposit.applyToFinalCost();
        assertEquals("Applied", deposit.getDisplayName());
    }

    @Test
    void testGetDisplayNameForfeited() {
        deposit.markPaid();
        deposit.forfeit();
        assertEquals("Forfeited", deposit.getDisplayName());
    }

    @Test
    void testGetDisplayNamePaid() {
        deposit.markPaid();
        assertEquals("Paid", deposit.getDisplayName());
    }

    @Test
    void testIsPending() {
        assertTrue(deposit.isPending());
        deposit.markPaid();
        assertFalse(deposit.isPending());
    }

    @Test
    void testIsTerminal() {
        deposit.markPaid();
        deposit.applyToFinalCost();
        assertTrue(deposit.isTerminal());
    }

    @Test
    void testIsApplied() {
        deposit.markPaid();
        deposit.applyToFinalCost();
        assertTrue(deposit.isApplied());
    }

    @Test
    void testIsRefunded() {
        deposit.markPaid();
        deposit.forfeit();
        assertTrue(deposit.isRefunded());
    }

    @Test
    void testSetPaymentMethod() {
        deposit.setPaymentMethod("debit_card");
        assertEquals("debit_card", deposit.getPaymentMethod());
    }

    @Test
    void testSetCardNumber() {
        deposit.setCardNumber("4444");
        assertEquals("4444", deposit.getCardNumber());
    }

    @Test
    void testSetInstitutionId() {
        deposit.setInstitutionId("YORK-001");
        assertEquals("YORK-001", deposit.getInstitutionId());
    }

    @Test
    void testToString() {
        String str = deposit.toString();
        assertTrue(str.contains("depositId=1"));
        assertTrue(str.contains("bookingId=101"));
        assertTrue(str.contains("amount=$30.0"));
    }

    @Test
    void testToStringContainsPaymentMethod() {
        deposit.setPaymentMethod("credit_card");
        String str = deposit.toString();
        assertTrue(str.contains("credit_card"));
    }
}