package test.manual.scheduler.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import scheduler.model.Deposit;
import static org.junit.jupiter.api.Assertions.*;

class DepositTest {
    private Deposit deposit;

    @BeforeEach
    void setUp() {
         deposit = new Deposit(1, 101, 30.00);
    } 

    @Test
    void testConstructor() {
         assertEquals(1, deposit.getDepositId());
        assertEquals(101, deposit.getBookingId());
         assertEquals(30.00, deposit.getAmount());
        assertFalse(deposit.isPaid());
    }

    @Test
    void testMarkPaid() {
        deposit.markPaid();
         assertTrue(deposit.isPaid());
    }

     @Test
    void testApplyToFinalCost() throws Exception {
        deposit.markPaid();
         deposit.applyToFinalCost();
        assertTrue(deposit.isAppliedToFinalCost());
    }

     @Test
    void testApplyToFinalCostThrowsIfNotPaid() {
         assertThrows(IllegalStateException.class, () -> {
            deposit.applyToFinalCost();
        });
    }

     @Test
    void testForfeit() throws Exception {
          deposit.markPaid();
         deposit.forfeit();
        assertTrue(deposit.isForfeited());
    }

    @Test
    void testForfeitThrowsIfNotPaid() {
        assertThrows(IllegalStateException.class, () -> {
            deposit.forfeit();
        });
    }

    @Test
    void testGetStatusDisplayNamePending() {
         assertEquals("Pending", deposit.getDisplayName());
    }

    @Test
    void testGetStatusDisplayNameApplied() throws Exception {
         deposit.markPaid();
          deposit.applyToFinalCost();
         assertEquals("Applied", deposit.getDisplayName());
    }

    @Test
    void testGetStatusDisplayNameForfeited() throws Exception {
        deposit.markPaid();
         deposit.forfeit();
        assertEquals("Forfeited", deposit.getDisplayName());
    }

    @Test
    void testToString() {
        String str = deposit.toString();
         assertTrue(str.contains("depositId=1"));
        assertTrue(str.contains("bookingId=101"));
        assertTrue(str.contains("amount=$30.0"));
    }
}