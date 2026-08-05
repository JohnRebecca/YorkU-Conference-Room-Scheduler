package scheduler.payment.strategy;

import org.junit.jupiter.api.Test;
import scheduler.payment.strategy.CreditCardStrategy;
import scheduler.payment.strategy.DebitCardStrategy;
import scheduler.payment.strategy.PaymentProcessor;
import scheduler.payment.strategy.PaymentStrategy;
import scheduler.payment.strategy.InstitutionalBillingStrategy;
import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {

    @Test
    void testConstructorWithCreditCard() {
        PaymentStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        assertNotNull(processor);
        assertEquals(strategy, processor.getStrategy());
    }

    @Test
    void testConstructorWithDebitCard() {
        PaymentStrategy strategy = new DebitCardStrategy("5555555555554444", "10/25", "789");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        assertNotNull(processor);
        assertEquals(strategy, processor.getStrategy());
    }

    @Test
    void testConstructorWithInstitutional() {
        PaymentStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        assertNotNull(processor);
        assertEquals(strategy, processor.getStrategy());
    }

    @Test
    void testSetStrategy() {
        PaymentStrategy strategy1 = new CreditCardStrategy("4111111111111111", "12/26", "123");
        PaymentStrategy strategy2 = new DebitCardStrategy("5555555555554444", "10/25", "789");
        PaymentProcessor processor = new PaymentProcessor(strategy1);
        processor.setStrategy(strategy2);
        assertEquals(strategy2, processor.getStrategy());
    }

    @Test
    void testSetStrategyToNull() {
        PaymentStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.setStrategy(null);
        assertNull(processor.getStrategy());
    }

    @Test
    void testProcessPayment() {
        PaymentStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        assertDoesNotThrow(() -> processor.processPayment(30.00));
    }

    @Test
    void testProcessPaymentWithZero() {
        PaymentStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        assertDoesNotThrow(() -> processor.processPayment(0.0));
    }

    @Test
    void testProcessPaymentWithLargeAmount() {
        PaymentStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        assertDoesNotThrow(() -> processor.processPayment(999999.99));
    }

    @Test
    void testProcessRefund() {
        PaymentStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        assertDoesNotThrow(() -> processor.processRefund(10.00));
    }

    @Test
    void testProcessRefundWithZero() {
        PaymentStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        PaymentProcessor processor = new PaymentProcessor(strategy);
        assertDoesNotThrow(() -> processor.processRefund(0.0));
    }
}