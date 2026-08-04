package test.manual.scheduler.model;

import org.junit.jupiter.api.Test;
import scheduler.model.DepositState;
import static org.junit.jupiter.api.Assertions.*;

class DepositStateTest {

    @Test
    void testEnumValues() {
         DepositState[] states = DepositState.values();
        assertEquals(4, states.length);
    }

    @Test
     void testGetDisplayNamePending() {
        assertEquals("Pending", DepositState.PENDING.getDisplayName());
    }

    @Test
     void testGetDisplayNameApplied() {
         assertEquals("Booking approved", DepositState.APPLIED.getDisplayName());
    }

    @Test
    void testGetDisplayNameForfeited() {
        assertEquals("Forfeited", DepositState.FORFEITED.getDisplayName());
    }

    @Test
    void testGetDisplayNameRefunded() {
        assertEquals("Refunded", DepositState.REFUNDED.getDisplayName());
     }

    @Test
    void testIsPending() {
        assertTrue(DepositState.PENDING.isPending());
        assertFalse(DepositState.APPLIED.isPending());
        assertFalse(DepositState.FORFEITED.isPending());
        assertFalse(DepositState.REFUNDED.isPending());
    }

    @Test
    void testIsTerminal() {
        assertFalse(DepositState.PENDING.isTerminal());
         assertTrue(DepositState.APPLIED.isTerminal());
        assertTrue(DepositState.FORFEITED.isTerminal());
        assertTrue(DepositState.REFUNDED.isTerminal());
    }

    @Test
    void testToString() {
        assertEquals("Pending", DepositState.PENDING.toString());
         assertEquals("Booking approved", DepositState.APPLIED.toString());
        assertEquals("Forfeited", DepositState.FORFEITED.toString());
         assertEquals("Refunded", DepositState.REFUNDED.toString());
    }

    @Test
    void testGetDisplayNameNotNull() {
        for (DepositState state : DepositState.values()) {
            assertNotNull(state.getDisplayName());
            assertFalse(state.getDisplayName().isEmpty());
        }
    }

    @Test
     void testValueOf() {
         assertEquals(DepositState.PENDING, DepositState.valueOf("PENDING"));
        assertEquals(DepositState.APPLIED, DepositState.valueOf("APPLIED"));
         assertEquals(DepositState.FORFEITED, DepositState.valueOf("FORFEITED"));
        assertEquals(DepositState.REFUNDED, DepositState.valueOf("REFUNDED"));
    }
}