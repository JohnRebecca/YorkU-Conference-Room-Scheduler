package scheduler.payment.strategy;

import org.junit.jupiter.api.Test;
import scheduler.payment.strategy.CreditCardStrategy;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardStrategyTest {

     @Test
    void testConstructor() {
        CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
         assertNotNull(strategy);
    }

     @Test
    void testPay() {
         CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        assertDoesNotThrow(() -> strategy.pay(30.00));
    }

    @Test
    void testPayWithZero() {
        CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
         assertDoesNotThrow(() -> strategy.pay(0.0));
    }

    @Test
    void testRefund() {
       CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        assertDoesNotThrow(() -> strategy.refund(10.00));
    }

    @Test
    void testRefundWithZero() {
        CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
       assertDoesNotThrow(() -> strategy.refund(0.0));
    }

    @Test
    void testGetPaymentMethodName() {
       CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
      assertEquals("creditCard", strategy.getPaymentMethodName());
    }

    @Test
    void testGetPaymentID() {
        CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        assertEquals("1111", strategy.getPaymentID());
    }

    @Test
    void testGetPaymentMethodNameNotNull() {
       CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
      assertNotNull(strategy.getPaymentMethodName());
    }

    @Test
    void testGetPaymentIDNotNull() {
        CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        assertNotNull(strategy.getPaymentID());
    }

    @Test
    void testPayWithLargeAmount() {
        CreditCardStrategy strategy = new CreditCardStrategy("4111111111111111", "12/26", "123");
        assertDoesNotThrow(() -> strategy.pay(999999.99));
    }
}