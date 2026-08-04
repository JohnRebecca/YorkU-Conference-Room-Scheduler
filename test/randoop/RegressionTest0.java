package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        java.lang.String str7 = deposit4.getInstitutionId();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.forfeitDeposit((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: No deposit found for booking #1");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentService0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        boolean boolean6 = deposit4.isApplied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Throwable throwable2 = null;
        scheduler.exception.PaymentDeclinedException paymentDeclinedException3 = new scheduler.exception.PaymentDeclinedException("hi!", throwable2);
        scheduler.exception.InvalidCardException invalidCardException4 = new scheduler.exception.InvalidCardException("hi!", throwable2);
        java.lang.String str5 = invalidCardException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.InvalidCardException: hi!" + "'", str5, "scheduler.exception.InvalidCardException: hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (short) -1, (-1), (double) 100L, "Refunded");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Throwable throwable3 = null;
        scheduler.exception.PaymentDeclinedException paymentDeclinedException4 = new scheduler.exception.PaymentDeclinedException("hi!", throwable3);
        scheduler.exception.InvalidCardException invalidCardException5 = new scheduler.exception.InvalidCardException("hi!", throwable3);
        scheduler.exception.PaymentDeclinedException paymentDeclinedException6 = new scheduler.exception.PaymentDeclinedException("", (java.lang.Throwable) invalidCardException5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        java.lang.String str7 = deposit4.getInstitutionId();
        int int8 = deposit4.getBookingId();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy1 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        java.lang.String str2 = institutionalBillingStrategy1.getPaymentID();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        scheduler.model.DepositState depositState0 = scheduler.model.DepositState.FORFEITED;
        org.junit.Assert.assertTrue("'" + depositState0 + "' != '" + scheduler.model.DepositState.FORFEITED + "'", depositState0.equals(scheduler.model.DepositState.FORFEITED));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        java.lang.String str7 = deposit4.getInstitutionId();
        int int8 = deposit4.getBookingId();
        java.lang.Class<?> wildcardClass9 = deposit4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("", "scheduler.exception.InvalidCardException: hi!", "scheduler.exception.InvalidCardException: hi!");
        creditCardStrategy3.refund((double) 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        deposit11.depositRefunded();
        double double13 = deposit11.getAmount();
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy1 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy1.departmentCode = "hi!";
        institutionalBillingStrategy1.pay((double) 0L);
        java.lang.String str6 = institutionalBillingStrategy1.institutionId;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("scheduler.exception.InvalidCardException: hi!", "Refunded");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) -1, 10, (double) 10L);
        double double4 = deposit3.getAmount();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        int int7 = deposit4.getBookingId();
        boolean boolean8 = deposit4.isRefunded();
        boolean boolean9 = deposit4.isApplied();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit(1.0d);
        java.lang.Class<?> wildcardClass2 = deposit1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        scheduler.exception.InvalidCardException invalidCardException1 = new scheduler.exception.InvalidCardException("scheduler.exception.InvalidCardException: hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("", "scheduler.exception.InvalidCardException: hi!", "scheduler.exception.InvalidCardException: hi!");
        creditCardStrategy3.pay((double) ' ');
        java.lang.Class<?> wildcardClass6 = creditCardStrategy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) -1, 10, (double) 10L);
        boolean boolean4 = deposit3.isApplied();
        boolean boolean5 = deposit3.isRefunded();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((-1), (int) ' ', (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            deposit3.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        scheduler.model.DepositState depositState1 = scheduler.model.DepositState.REFUNDED;
        java.lang.String str2 = depositState1.toString();
        scheduler.exception.InvalidStateException invalidStateException4 = new scheduler.exception.InvalidStateException((int) (short) -1, depositState1, "scheduler.exception.InvalidCardException: hi!");
        java.lang.Class<?> wildcardClass5 = invalidStateException4.getClass();
        org.junit.Assert.assertTrue("'" + depositState1 + "' != '" + scheduler.model.DepositState.REFUNDED + "'", depositState1.equals(scheduler.model.DepositState.REFUNDED));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refunded" + "'", str2, "Refunded");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) -1, 10, (double) 10L);
        boolean boolean4 = deposit3.isApplied();
        java.lang.Class<?> wildcardClass5 = deposit3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("", "scheduler.exception.InvalidCardException: hi!", "scheduler.exception.InvalidCardException: hi!");
        creditCardStrategy3.refund((double) '#');
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        int int7 = deposit4.getBookingId();
        java.lang.String str8 = deposit4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isPaid();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("", "scheduler.exception.InvalidCardException: hi!", "scheduler.exception.InvalidCardException: hi!");
        creditCardStrategy3.pay((double) ' ');
        creditCardStrategy3.refund((double) 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (short) -1, (-1), (double) 100L, "Refunded");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) '#');
        int int2 = deposit1.getBookingId();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.refundDeposit((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: No deposit found for booking #1");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentService0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((-1), (int) ' ', (double) '4');
        boolean boolean4 = deposit3.isForfeited();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        scheduler.exception.PaymentDeclinedException paymentDeclinedException1 = new scheduler.exception.PaymentDeclinedException("Pending");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.refundDeposit(100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: No deposit found for booking #100");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy1 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy1.departmentCode = "hi!";
        institutionalBillingStrategy1.pay((double) 0L);
        institutionalBillingStrategy1.institutionId = "Refunded";
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        deposit4.setPaymentMethod("creditCard");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.refundDeposit(100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: No deposit found for booking #100");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        java.lang.String str12 = institutionalBillingStrategy6.institutionId;
        institutionalBillingStrategy6.pay(10.0d);
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        scheduler.exception.InvalidCardException invalidCardException1 = new scheduler.exception.InvalidCardException("");
        java.lang.String str2 = invalidCardException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidCardException: " + "'", str2, "scheduler.exception.InvalidCardException: ");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.applyDepositToBooking((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: No deposit found for booking #100");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentService0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy1 = new scheduler.payment.strategy.InstitutionalBillingStrategy("scheduler.exception.InvalidCardException: ");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.refundDeposit((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: No deposit found for booking #-1");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentService0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        int int7 = deposit4.getBookingId();
        boolean boolean8 = deposit4.isPaid();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        deposit11.depositRefunded();
        int int13 = deposit11.getBookingId();
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 10, (int) (byte) 10, (double) 'a', "hi!");
        boolean boolean5 = deposit4.isRefunded();
        boolean boolean6 = deposit4.isForfeited();
        java.lang.String str7 = deposit4.getDisplayName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pending" + "'", str7, "Pending");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) '#');
        boolean boolean2 = deposit1.isRefunded();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 10, (int) (byte) 10, (double) 'a', "hi!");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setCardNumber("");
        boolean boolean7 = deposit4.isForfeited();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        scheduler.model.DepositState depositState0 = scheduler.model.DepositState.REFUNDED;
        java.lang.String str1 = depositState0.getDisplayName();
        boolean boolean2 = depositState0.isPending();
        org.junit.Assert.assertTrue("'" + depositState0 + "' != '" + scheduler.model.DepositState.REFUNDED + "'", depositState0.equals(scheduler.model.DepositState.REFUNDED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Refunded" + "'", str1, "Refunded");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        scheduler.exception.DepositNotFoundException depositNotFoundException1 = new scheduler.exception.DepositNotFoundException("hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        java.lang.String str7 = deposit4.getInstitutionId();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (short) 100, (int) (short) 0, (double) (byte) 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        scheduler.payment.service.CheckInService checkInService0 = scheduler.payment.service.CheckInService.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = checkInService0.checkIn((int) ' ', "hi!", localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInService0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        scheduler.model.Deposit deposit5 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit5.setInstitutionId("hi!");
        int int8 = deposit5.getBookingId();
        deposit5.markPaid();
        scheduler.model.DepositState depositState10 = deposit5.getState();
        scheduler.exception.InvalidStateException invalidStateException12 = new scheduler.exception.InvalidStateException((int) '#', depositState10, "creditCard");
        scheduler.exception.InvalidStateException invalidStateException14 = new scheduler.exception.InvalidStateException("Refunded");
        invalidStateException12.addSuppressed((java.lang.Throwable) invalidStateException14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + depositState10 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState10.equals(scheduler.model.DepositState.PENDING));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy1 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy1.institutionId = "";
        institutionalBillingStrategy1.institutionId = "scheduler.exception.InvalidCardException: ";
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("Pending", "", "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        java.lang.String str5 = deposit4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        scheduler.model.DepositState depositState2 = scheduler.model.DepositState.REFUNDED;
        java.lang.String str3 = depositState2.toString();
        scheduler.exception.InvalidStateException invalidStateException5 = new scheduler.exception.InvalidStateException((int) (short) -1, depositState2, "scheduler.exception.InvalidCardException: hi!");
        scheduler.exception.PaymentDeclinedException paymentDeclinedException6 = new scheduler.exception.PaymentDeclinedException("scheduler.exception.InvalidCardException: ", (java.lang.Throwable) invalidStateException5);
        java.lang.String str7 = invalidStateException5.toString();
        org.junit.Assert.assertTrue("'" + depositState2 + "' != '" + scheduler.model.DepositState.REFUNDED + "'", depositState2.equals(scheduler.model.DepositState.REFUNDED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Refunded" + "'", str3, "Refunded");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.InvalidStateException: Cannot scheduler.exception.InvalidCardException: hi! deposit #-1because it is already Refunded" + "'", str7, "scheduler.exception.InvalidStateException: Cannot scheduler.exception.InvalidCardException: hi! deposit #-1because it is already Refunded");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "Refunded");
        java.lang.String str3 = institutionalBillingStrategy2.departmentCode;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Refunded" + "'", str3, "Refunded");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        java.lang.String str12 = deposit11.getPaymentMethod();
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "institutional" + "'", str12, "institutional");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isRefunded();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 10, (int) (byte) 10, (double) 'a', "hi!");
        boolean boolean5 = deposit4.isRefunded();
        int int6 = deposit4.getBookingId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.model.Deposit deposit4 = paymentService0.findDepositByBooking((int) '#');
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
        org.junit.Assert.assertNull(deposit4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) -1, 10, (double) 10L);
        boolean boolean4 = deposit3.isApplied();
        java.lang.String str5 = deposit3.getInstitutionId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        institutionalBillingStrategy6.refund((double) 10);
        institutionalBillingStrategy6.departmentCode = "creditCard";
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        scheduler.payment.service.CheckInService checkInService0 = scheduler.payment.service.CheckInService.getInstance();
        java.time.LocalDateTime localDateTime1 = null;
        boolean boolean2 = checkInService0.isWithinGracePeriod(localDateTime1);
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = checkInService0.checkIn((int) (short) -1, "scheduler.exception.InvalidCardException: ", localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInService0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        scheduler.payment.strategy.PaymentProcessor paymentProcessor3 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy2);
        paymentProcessor3.processPayment((double) 32);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.model.Deposit deposit4 = paymentService0.findDepositByBooking(0);
        paymentService0.refundDeposit(32);
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNull(deposit2);
        org.junit.Assert.assertNull(deposit4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("", "scheduler.exception.InvalidCardException: hi!", "scheduler.exception.InvalidCardException: hi!");
        creditCardStrategy3.refund((double) 100L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("", "Refunded");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 10, (int) (byte) 10, (double) 'a', "hi!");
        boolean boolean5 = deposit4.isRefunded();
        java.lang.String str6 = deposit4.getCardNumber();
        boolean boolean7 = deposit4.isRefunded();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setCardNumber("");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!", "scheduler.exception.InvalidCardException: hi!");
        java.lang.String str3 = institutionalBillingStrategy2.getPaymentMethodName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "institutional" + "'", str3, "institutional");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        scheduler.model.DepositState depositState2 = scheduler.model.DepositState.REFUNDED;
        java.lang.String str3 = depositState2.toString();
        scheduler.exception.InvalidStateException invalidStateException5 = new scheduler.exception.InvalidStateException((int) (short) -1, depositState2, "scheduler.exception.InvalidCardException: hi!");
        scheduler.exception.PaymentDeclinedException paymentDeclinedException6 = new scheduler.exception.PaymentDeclinedException("scheduler.exception.InvalidCardException: ", (java.lang.Throwable) invalidStateException5);
        java.lang.String str7 = paymentDeclinedException6.toString();
        org.junit.Assert.assertTrue("'" + depositState2 + "' != '" + scheduler.model.DepositState.REFUNDED + "'", depositState2.equals(scheduler.model.DepositState.REFUNDED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Refunded" + "'", str3, "Refunded");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.PaymentDeclinedException: scheduler.exception.InvalidCardException: " + "'", str7, "scheduler.exception.PaymentDeclinedException: scheduler.exception.InvalidCardException: ");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 10, (int) (byte) 10, (double) 'a', "hi!");
        boolean boolean5 = deposit4.isRefunded();
        java.lang.String str6 = deposit4.getCardNumber();
        int int7 = deposit4.getBookingId();
        java.lang.String str8 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=10, bookingId=10, amount=$97.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=10, bookingId=10, amount=$97.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 10, (int) (byte) 10, (double) 'a', "hi!");
        boolean boolean5 = deposit4.isRefunded();
        deposit4.markPaid();
        deposit4.depositForfeited();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy1 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Pending");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        scheduler.payment.strategy.PaymentProcessor paymentProcessor3 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy2);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "Refunded");
        paymentProcessor3.setStrategy((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        scheduler.payment.strategy.PaymentProcessor paymentProcessor8 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        java.lang.String str9 = paymentProcessor8.getMethodName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "institutional" + "'", str9, "institutional");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        scheduler.model.DepositState depositState0 = scheduler.model.DepositState.APPLIED;
        boolean boolean1 = depositState0.isTerminal();
        org.junit.Assert.assertTrue("'" + depositState0 + "' != '" + scheduler.model.DepositState.APPLIED + "'", depositState0.equals(scheduler.model.DepositState.APPLIED));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        institutionalBillingStrategy6.refund((double) 10);
        institutionalBillingStrategy6.institutionId = "Deposit{depositId=97, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}";
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNotNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy1 = new scheduler.payment.strategy.InstitutionalBillingStrategy("");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("", "scheduler.exception.InvalidCardException: hi!", "scheduler.exception.InvalidCardException: hi!");
        java.lang.String str4 = creditCardStrategy3.getPaymentMethodName();
        creditCardStrategy3.refund((double) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "creditCard" + "'", str4, "creditCard");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.forfeitDeposit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: No deposit found for booking #-1");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNotNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        deposit11.setInstitutionId("hi!");
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNotNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy1 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy1.institutionId = "";
        institutionalBillingStrategy1.institutionId = "Deposit{depositId=97, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}";
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((-1), 32, (double) 1L, "scheduler.exception.InvalidStateException: Cannot scheduler.exception.InvalidCardException: hi! deposit #-1because it is already Refunded");
        java.lang.String str5 = deposit4.getDisplayName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pending" + "'", str5, "Pending");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        scheduler.payment.strategy.PaymentProcessor paymentProcessor3 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy2);
        java.lang.String str4 = institutionalBillingStrategy2.departmentCode;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "scheduler.exception.InvalidCardException: hi!" + "'", str4, "scheduler.exception.InvalidCardException: hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        scheduler.payment.strategy.PaymentProcessor paymentProcessor3 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy2);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "Refunded");
        paymentProcessor3.setStrategy((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        scheduler.payment.strategy.PaymentProcessor paymentProcessor8 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        paymentProcessor8.processRefund(0.0d);
        paymentProcessor8.processRefund(1.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        scheduler.payment.service.CheckInService checkInService0 = scheduler.payment.service.CheckInService.getInstance();
        java.time.LocalDateTime localDateTime1 = null;
        boolean boolean2 = checkInService0.isWithinGracePeriod(localDateTime1);
        java.time.LocalDateTime localDateTime3 = null;
        long long4 = checkInService0.getRemainingMinutes(localDateTime3);
        java.time.LocalDateTime localDateTime5 = null;
        long long6 = checkInService0.getRemainingMinutes(localDateTime5);
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = checkInService0.isWithinGracePeriod(localDateTime7);
        org.junit.Assert.assertNotNull(checkInService0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 30L + "'", long4 == 30L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 30L + "'", long6 == 30L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        scheduler.payment.strategy.PaymentProcessor paymentProcessor3 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy2);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "Refunded");
        paymentProcessor3.setStrategy((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        java.lang.String str8 = institutionalBillingStrategy6.institutionId;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Refunded" + "'", str8, "Refunded");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        scheduler.payment.strategy.PaymentProcessor paymentProcessor3 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy2);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "Refunded");
        paymentProcessor3.setStrategy((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        scheduler.payment.strategy.PaymentProcessor paymentProcessor8 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        paymentProcessor8.processRefund(0.0d);
        scheduler.payment.strategy.PaymentStrategy paymentStrategy11 = paymentProcessor8.getStrategy();
        scheduler.payment.strategy.PaymentStrategy paymentStrategy12 = paymentProcessor8.getStrategy();
        org.junit.Assert.assertNotNull(paymentStrategy11);
        org.junit.Assert.assertNotNull(paymentStrategy12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        scheduler.exception.InvalidCardException invalidCardException1 = new scheduler.exception.InvalidCardException("Deposit{depositId=97, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.refundDeposit((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: No deposit found for booking #100");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentService0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        scheduler.model.Deposit deposit5 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit5.setInstitutionId("hi!");
        int int8 = deposit5.getBookingId();
        deposit5.markPaid();
        scheduler.model.DepositState depositState10 = deposit5.getState();
        scheduler.exception.InvalidStateException invalidStateException12 = new scheduler.exception.InvalidStateException((int) (short) 0, depositState10, "scheduler.exception.InvalidCardException: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + depositState10 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState10.equals(scheduler.model.DepositState.PENDING));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        int int7 = deposit4.getBookingId();
        boolean boolean8 = deposit4.isRefunded();
        boolean boolean9 = deposit4.isForfeited();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        java.lang.String str3 = institutionalBillingStrategy2.institutionId;
        institutionalBillingStrategy2.institutionId = "scheduler.exception.InvalidCardException: ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Refunded" + "'", str3, "Refunded");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) 0, (int) '#', (double) (short) 10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("institutional", "scheduler.exception.PaymentDeclinedException: scheduler.exception.InvalidCardException: ", "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        scheduler.model.DepositState depositState0 = scheduler.model.DepositState.REFUNDED;
        boolean boolean1 = depositState0.isPending();
        java.lang.String str2 = depositState0.toString();
        org.junit.Assert.assertTrue("'" + depositState0 + "' != '" + scheduler.model.DepositState.REFUNDED + "'", depositState0.equals(scheduler.model.DepositState.REFUNDED));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refunded" + "'", str2, "Refunded");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy7 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        scheduler.payment.strategy.PaymentProcessor paymentProcessor8 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy7);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy11 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "Refunded");
        paymentProcessor8.setStrategy((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy11);
        scheduler.model.Deposit deposit13 = paymentService0.collectDeposit(10, (double) '4', (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy11);
        deposit13.setInstitutionId("Pending");
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNotNull(deposit2);
        org.junit.Assert.assertNotNull(deposit13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("scheduler.exception.InvalidCardException: ", "scheduler.exception.InvalidStateException: Cannot scheduler.exception.InvalidCardException: hi! deposit #-1because it is already Refunded");
        institutionalBillingStrategy2.departmentCode = "";
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        scheduler.model.DepositState depositState1 = scheduler.model.DepositState.PENDING;
        scheduler.exception.InvalidStateException invalidStateException3 = new scheduler.exception.InvalidStateException((int) (byte) 100, depositState1, "hi!");
        java.lang.String str4 = depositState1.getDisplayName();
        java.lang.String str5 = depositState1.toString();
        org.junit.Assert.assertTrue("'" + depositState1 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState1.equals(scheduler.model.DepositState.PENDING));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pending" + "'", str4, "Pending");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pending" + "'", str5, "Pending");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        java.lang.String str5 = deposit4.getInstitutionId();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isPending();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        scheduler.model.DepositState depositState3 = scheduler.model.DepositState.REFUNDED;
        java.lang.String str4 = depositState3.toString();
        scheduler.exception.InvalidStateException invalidStateException6 = new scheduler.exception.InvalidStateException((int) (short) -1, depositState3, "scheduler.exception.InvalidCardException: hi!");
        scheduler.exception.PaymentDeclinedException paymentDeclinedException7 = new scheduler.exception.PaymentDeclinedException("scheduler.exception.InvalidCardException: ", (java.lang.Throwable) invalidStateException6);
        scheduler.exception.PaymentDeclinedException paymentDeclinedException8 = new scheduler.exception.PaymentDeclinedException("scheduler.exception.InvalidCardException: hi!", (java.lang.Throwable) paymentDeclinedException7);
        org.junit.Assert.assertTrue("'" + depositState3 + "' != '" + scheduler.model.DepositState.REFUNDED + "'", depositState3.equals(scheduler.model.DepositState.REFUNDED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refunded" + "'", str4, "Refunded");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "scheduler.exception.InvalidCardException: hi!");
        scheduler.payment.strategy.PaymentProcessor paymentProcessor3 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy2);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "Refunded");
        paymentProcessor3.setStrategy((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        scheduler.payment.strategy.PaymentProcessor paymentProcessor8 = new scheduler.payment.strategy.PaymentProcessor((scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        institutionalBillingStrategy6.refund(100.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((-1), 32, (double) 1L, "scheduler.exception.InvalidStateException: Cannot scheduler.exception.InvalidCardException: hi! deposit #-1because it is already Refunded");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        scheduler.exception.InvalidCardException invalidCardException1 = new scheduler.exception.InvalidCardException("institutional");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        boolean boolean7 = deposit4.isPaid();
        java.lang.String str8 = deposit4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0.0f);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        scheduler.payment.service.PaymentService paymentService0 = scheduler.payment.service.PaymentService.getInstance();
        scheduler.model.Deposit deposit2 = paymentService0.findDepositByBooking((int) (byte) 10);
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy6 = new scheduler.payment.strategy.InstitutionalBillingStrategy("hi!");
        institutionalBillingStrategy6.departmentCode = "hi!";
        institutionalBillingStrategy6.pay((double) 0L);
        scheduler.model.Deposit deposit11 = paymentService0.collectDeposit((int) ' ', (double) 100, (scheduler.payment.strategy.PaymentStrategy) institutionalBillingStrategy6);
        paymentService0.applyDepositToBooking(10);
        org.junit.Assert.assertNotNull(paymentService0);
        org.junit.Assert.assertNotNull(deposit2);
        org.junit.Assert.assertNotNull(deposit11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        java.lang.String str5 = deposit4.getCardNumber();
        boolean boolean6 = deposit4.isPending();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("Refunded", "");
        institutionalBillingStrategy2.refund((double) 1L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setCardNumber("");
        java.lang.String str7 = deposit4.getDisplayName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pending" + "'", str7, "Pending");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            deposit1.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setCardNumber("");
        deposit4.setCardNumber("scheduler.exception.InvalidCardException: hi!");
        boolean boolean9 = deposit4.isForfeited();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        scheduler.payment.strategy.InstitutionalBillingStrategy institutionalBillingStrategy2 = new scheduler.payment.strategy.InstitutionalBillingStrategy("scheduler.exception.InvalidStateException: Cannot scheduler.exception.InvalidCardException: hi! deposit #-1because it is already Refunded", "Deposit{depositId=97, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        scheduler.payment.strategy.CreditCardStrategy creditCardStrategy3 = new scheduler.payment.strategy.CreditCardStrategy("", "scheduler.exception.InvalidCardException: hi!", "scheduler.exception.InvalidCardException: hi!");
        creditCardStrategy3.pay((double) ' ');
        creditCardStrategy3.refund((double) 1L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 1, 0.0d, "hi!");
        deposit4.setInstitutionId("hi!");
        java.lang.String str7 = deposit4.toString();
        deposit4.setPaymentMethod("scheduler.exception.InvalidStateException: Cannot scheduler.exception.InvalidCardException: hi! deposit #-1because it is already Refunded");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Deposit{depositId=97, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str7, "Deposit{depositId=97, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        scheduler.exception.InvalidCardException invalidCardException1 = new scheduler.exception.InvalidCardException("");
        java.lang.Throwable[] throwableArray2 = invalidCardException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        scheduler.exception.DepositNotFoundException depositNotFoundException1 = new scheduler.exception.DepositNotFoundException("institutional");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        scheduler.payment.strategy.DebitCardStrategy debitCardStrategy3 = new scheduler.payment.strategy.DebitCardStrategy("hi!", "scheduler.exception.InvalidStateException: Cannot scheduler.exception.InvalidCardException: hi! deposit #-1because it is already Refunded", "institutional");
        debitCardStrategy3.pay((double) (byte) 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        scheduler.exception.DepositNotFoundException depositNotFoundException1 = new scheduler.exception.DepositNotFoundException("scheduler.exception.InvalidCardException: ");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        scheduler.model.DepositState depositState0 = scheduler.model.DepositState.APPLIED;
        java.lang.String str1 = depositState0.toString();
        org.junit.Assert.assertTrue("'" + depositState0 + "' != '" + scheduler.model.DepositState.APPLIED + "'", depositState0.equals(scheduler.model.DepositState.APPLIED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking approved" + "'", str1, "Booking approved");
    }
}

