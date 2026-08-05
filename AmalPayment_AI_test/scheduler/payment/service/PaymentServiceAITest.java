package scheduler.payment.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import scheduler.model.Deposit;
import scheduler.payment.service.PaymentService;
import scheduler.payment.strategy.CreditCardStrategy;
import scheduler.payment.strategy.PaymentStrategy;
import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceAITest {
    private PaymentService service;
    private PaymentStrategy strategy;

    @BeforeEach
    void setUp() {
        service = PaymentService.getInstance();
        strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        // REMOVED: service.clearAllDeposits() — doesn't exist in your code
        // Use getDeposits().clear() instead if needed, or just create fresh deposits
    }

    @Test
    void testGetInstance() {
        PaymentService instance1 = PaymentService.getInstance();
        PaymentService instance2 = PaymentService.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testCollectDeposit() {
        Deposit deposit = service.collectDeposit(101, 30.00, strategy);
        assertNotNull(deposit);
        assertEquals(101, deposit.getBookingId());
        assertEquals(30.00, deposit.getAmount());
        assertTrue(deposit.isPaid());
    }

    @Test
    void testCollectDepositWithDifferentAmounts() {
        Deposit deposit1 = service.collectDeposit(101, 30.00, strategy);
        Deposit deposit2 = service.collectDeposit(102, 50.00, strategy);
        assertEquals(30.00, deposit1.getAmount());
        assertEquals(50.00, deposit2.getAmount());
    }

    @Test
    void testFindDepositByBooking() {
        service.collectDeposit(101, 30.00, strategy);
        Deposit found = service.findDepositByBooking(101);
        assertNotNull(found);
        assertEquals(101, found.getBookingId());
    }

    @Test
    void testFindDepositByBookingNotFound() {
        Deposit found = service.findDepositByBooking(999);
        assertNull(found);
    }

    @Test
    void testApplyDepositToBooking() throws Exception {
        service.collectDeposit(101, 30.00, strategy);
        service.applyDepositToBooking(101);
        Deposit deposit = service.findDepositByBooking(101);
        assertTrue(deposit.isAppliedToFinalCost());
    }

    @Test
    void testApplyDepositToBookingNotFound() {
        assertThrows(Exception.class, () -> {
            service.applyDepositToBooking(999);
        });
    }

    @Test
    void testForfeitDeposit() throws Exception {
        service.collectDeposit(101, 30.00, strategy);
        service.forfeitDeposit(101);
        Deposit deposit = service.findDepositByBooking(101);
        assertTrue(deposit.isForfeited());
    }

    @Test
    void testRefundDeposit() throws Exception {
        service.collectDeposit(101, 30.00, strategy);
        service.refundDeposit(101);
        Deposit deposit = service.findDepositByBooking(101);
        assertTrue(deposit.isForfeited());
    }

    @Test
    void testGetDeposits() {
        service.collectDeposit(101, 30.00, strategy);
        service.collectDeposit(102, 30.00, strategy);
        assertEquals(2, service.getDeposits().size());
    }

    @Test
    void testDepositIdIncrements() {
        Deposit d1 = service.collectDeposit(101, 30.00, strategy);
        Deposit d2 = service.collectDeposit(102, 30.00, strategy);
        assertNotEquals(d1.getDepositId(), d2.getDepositId());
        assertTrue(d2.getDepositId() > d1.getDepositId());
    }

    @Test
    void testDepositCount() {
        service.collectDeposit(101, 30.00, strategy);
        service.collectDeposit(102, 30.00, strategy);
        assertEquals(2, service.getDeposits().size());
    }

    
    @Test
    void testClearDeposits() {
        service.collectDeposit(101, 30.00, strategy);
        // Manually clear deposits
        service.getDeposits().clear();
        assertEquals(0, service.getDeposits().size());
    }
}