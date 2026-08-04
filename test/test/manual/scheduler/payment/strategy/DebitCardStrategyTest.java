package test.manual.scheduler.payment.strategy;

import org.junit.jupiter.api.Test;
import scheduler.payment.strategy.DebitCardStrategy;
import static org.junit.jupiter.api.Assertions.*;

class DebitCardStrategyTest {

    @Test
    void testConstructor() {
         DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
       assertNotNull(strategy);
    }

    @Test
    void testPay() {
       DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
         assertDoesNotThrow(() -> strategy.pay(30.00));
    }

    @Test
    void testPayWithZero() {
         DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
        assertDoesNotThrow(() -> strategy.pay(0.0));
    }

    @Test
    void testRefund() {
        DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
       assertDoesNotThrow(() -> strategy.refund(10.00));
    }

    @Test
    void testRefundWithZero() {
       DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
        assertDoesNotThrow(() -> strategy.refund(0.0));
    }

    @Test
    void testGetPaymentMethodName() {
        DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
       assertEquals("debitCard", strategy.getPaymentMethodName());
    }

    @Test
    void testGetPaymentID() {
        DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
       assertEquals("4444", strategy.getPaymentID());
    }

    @Test
    void testGetPaymentMethodNameNotNull() {
       DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
        assertNotNull(strategy.getPaymentMethodName());
    }

    @Test
    void testGetPaymentIDNotNull() {
         DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
        assertNotNull(strategy.getPaymentID());
    }

    @Test
    void testPayWithLargeAmount() {
         DebitCardStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
        assertDoesNotThrow(() -> strategy.pay(999999.99));
    }
}