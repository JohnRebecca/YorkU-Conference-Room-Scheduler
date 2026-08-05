package scheduler.model;

import org.junit.jupiter.api.Test;
import scheduler.model.DepositState;
import static org.junit.jupiter.api.Assertions.*;

class DepositStateAITest {

    @Test
    void testEnumValues() {
        DepositState[] states = DepositState.values();
        assertEquals(4, states.length);
    }

    @Test
    void testEnumContainsAllStates() {
        DepositState[] states = DepositState.values();
        boolean hasPending = false;
        boolean hasApplied = false;
        boolean hasForfeited = false;
        boolean hasRefunded = false;

        for (DepositState state : states) {
            if (state == DepositState.PENDING) hasPending = true;
            if (state == DepositState.APPLIED) hasApplied = true;
            if (state == DepositState.FORFEITED) hasForfeited = true;
            if (state == DepositState.REFUNDED) hasRefunded = true;
        }

        assertTrue(hasPending);
        assertTrue(hasApplied);
        assertTrue(hasForfeited);
        assertTrue(hasRefunded);
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
    void testToStringMatchesDisplayName() {
        for (DepositState state : DepositState.values()) {
            assertEquals(state.getDisplayName(), state.toString());
        }
    }

    @Test
    void testOrdinalValues() {
        assertEquals(0, DepositState.PENDING.ordinal());
        assertEquals(1, DepositState.APPLIED.ordinal());
        assertEquals(2, DepositState.FORFEITED.ordinal());
        assertEquals(3, DepositState.REFUNDED.ordinal());
    }

    @Test
    void testValueOf() {
        assertEquals(DepositState.PENDING, DepositState.valueOf("PENDING"));
        assertEquals(DepositState.APPLIED, DepositState.valueOf("APPLIED"));
        assertEquals(DepositState.FORFEITED, DepositState.valueOf("FORFEITED"));
        assertEquals(DepositState.REFUNDED, DepositState.valueOf("REFUNDED"));
    }

    @Test
    void testValueOfInvalidThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            DepositState.valueOf("INVALID_STATE");
        });
    }
}