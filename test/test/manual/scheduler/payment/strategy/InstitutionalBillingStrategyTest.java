package test.manual.scheduler.payment.strategy;

import org.junit.jupiter.api.Test;
import scheduler.payment.strategy.InstitutionalBillingStrategy;
import static org.junit.jupiter.api.Assertions.*;

class InstitutionalBillingStrategyTest {

    @Test
    void testConstructorWithOneParameter() {
        InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001");
       assertNotNull(strategy);
        assertEquals("YORK-001", strategy.institutionId);
    }

    @Test
    void testConstructorWithTwoParameters() {
      InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        assertNotNull(strategy);
        assertEquals("YORK-001", strategy.institutionId);
       assertEquals("CS", strategy.departmentCode);
    }

   @Test
     void testPay() {
         InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        assertDoesNotThrow(() -> strategy.pay(30.00));
    }

     @Test
    void testPayWithZero() {
         InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        assertDoesNotThrow(() -> strategy.pay(0.0));
    }

    @Test
    void testRefund() {
        InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
       assertDoesNotThrow(() -> strategy.refund(10.00));
    }

    @Test
    void testRefundWithZero() {
      InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        assertDoesNotThrow(() -> strategy.refund(0.0));
    }

    @Test
    void testGetPaymentMethodName() {
       InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        assertEquals("institutional", strategy.getPaymentMethodName());
    }

    @Test
    void testGetPaymentID() {
      InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        assertEquals("YORK-001", strategy.getPaymentID());
    }

    @Test
    void testGetPaymentMethodNameNotNull() {
      InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        assertNotNull(strategy.getPaymentMethodName());
    }

    @Test
    void testGetPaymentIDNotNull() {
       InstitutionalBillingStrategy strategy = new InstitutionalBillingStrategy("YORK-001", "CS");
        assertNotNull(strategy.getPaymentID());
    }
}