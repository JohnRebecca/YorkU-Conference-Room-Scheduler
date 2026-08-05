package scheduler.model;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking5 = new scheduler.model.Booking("hi!", registeredUser1, room2, localDateTime3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        java.lang.Class<?> wildcardClass5 = deposit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        java.lang.String str7 = deposit4.getInstitutionId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        boolean boolean7 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) ' ', (int) (byte) 1, (double) 0);
        int int4 = deposit3.getDepositId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getPaymentMethod();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        double double5 = deposit4.getAmount();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            deposit1.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        boolean boolean8 = deposit4.isForfeited();
        java.lang.String str9 = deposit4.getPaymentMethod();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str7 = room6.toString();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking10 = new scheduler.model.Booking("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}", registeredUser1, room6, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str7, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 100, (double) (byte) 100, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        java.lang.Class<?> wildcardClass5 = deposit4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        boolean boolean8 = deposit4.isForfeited();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 10, (double) 1L, "hi!");
        java.lang.String str5 = deposit4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str5, "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        java.lang.String str7 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str7, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) -1, (int) (short) 1, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            deposit3.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (short) 0, (int) '4', (double) 0L, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        boolean boolean11 = deposit4.isPending();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        java.lang.String str7 = room4.getRoomId();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (-1), "hi!", "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        int int7 = room6.getCapacity();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking10 = new scheduler.model.Booking("Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}", registeredUser1, room6, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isPending();
        java.lang.String str8 = deposit4.toString();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.setInstitutionId("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getLocation();
        java.lang.String str9 = room4.getRoomId();
        java.lang.String str10 = room4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str10, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 10, (double) 1L, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        int int6 = deposit4.getBookingId();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (-1), "hi!", "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        java.lang.String str5 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit(52, (int) (short) 100, (double) (short) 10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str5 = room4.toString();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str5, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) ' ', (int) (byte) 1, (double) 0);
        double double4 = deposit3.getAmount();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        int int7 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        java.lang.String str7 = deposit4.toString();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str7, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) '4', 100, (double) 'a');
        boolean boolean4 = deposit3.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) -1, (int) (short) 1, (double) 100.0f);
        boolean boolean4 = deposit3.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        deposit4.setPaymentMethod("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        double double10 = deposit4.getAmount();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        boolean boolean2 = deposit1.isPaid();
        boolean boolean3 = deposit1.isAppliedToFinalCost();
        boolean boolean4 = deposit1.isPending();
        // The following exception was thrown during execution in test generation
        try {
            deposit1.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        room4.enable();
        boolean boolean10 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        room4.closeForMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.toString();
        double double9 = deposit4.getAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        room4.closeForMaintenance();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str8, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        java.lang.String str10 = deposit4.getPaymentMethod();
        boolean boolean11 = deposit4.isPaid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isPending();
        java.lang.String str8 = deposit4.toString();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        deposit4.setCardNumber("Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        room4.closeForMaintenance();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isPending();
        boolean boolean8 = deposit4.isRefunded();
        java.lang.String str9 = deposit4.getDisplayName();
        java.lang.Class<?> wildcardClass10 = deposit4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        java.lang.String str11 = deposit4.getPaymentMethod();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 100, (double) (byte) 100, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        scheduler.model.DepositState depositState5 = deposit4.getState();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + depositState5 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState5.equals(scheduler.model.DepositState.PENDING));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        room4.enable();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) ' ', (int) (byte) 1, (double) 0);
        boolean boolean4 = deposit3.isPaid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        scheduler.model.DepositState depositState8 = deposit4.getState();
        java.lang.Class<?> wildcardClass9 = depositState8.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + depositState8 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState8.equals(scheduler.model.DepositState.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        boolean boolean6 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        deposit4.setInstitutionId("hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        deposit4.depositApplied();
        deposit4.depositRefunded();
        boolean boolean14 = deposit4.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getCardNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        java.lang.String str10 = deposit4.getPaymentMethod();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        room4.enable();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str10, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (-1), "hi!", "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        int int7 = room6.getCapacity();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking10 = new scheduler.model.Booking("", registeredUser1, room6, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str8, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room6.enable();
        java.lang.String str8 = room6.toString();
        java.lang.String str9 = room6.getRoomId();
        int int10 = room6.getCapacity();
        int int11 = room6.getCapacity();
        boolean boolean12 = room6.isEnabled();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking15 = new scheduler.model.Booking("hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1", registeredUser1, room6, localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str8, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        scheduler.model.Room room4 = new scheduler.model.Room("Pending", (int) (short) 100, "", "Paid");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 100, (double) (byte) 100, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room6.enable();
        java.lang.String str8 = room6.toString();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking11 = new scheduler.model.Booking("", registeredUser1, room6, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str8, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        java.lang.String str12 = deposit4.getInstitutionId();
        java.lang.String str13 = deposit4.getInstitutionId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        boolean boolean2 = deposit1.isPaid();
        boolean boolean3 = deposit1.isAppliedToFinalCost();
        // The following exception was thrown during execution in test generation
        try {
            deposit1.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        double double6 = deposit4.getAmount();
        deposit4.markPaid();
        int int8 = deposit4.getDepositId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        deposit4.depositApplied();
        java.lang.Class<?> wildcardClass13 = deposit4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        deposit4.depositApplied();
        boolean boolean13 = deposit4.isForfeited();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        java.lang.String str6 = deposit4.getCardNumber();
        java.lang.String str7 = deposit4.getCardNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        boolean boolean7 = room4.isEnabled();
        room4.enable();
        room4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str9, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 10, "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}", "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            deposit1.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        java.lang.String str2 = deposit1.getCardNumber();
        // The following exception was thrown during execution in test generation
        try {
            deposit1.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) '4', 100, (double) 'a');
        int int4 = deposit3.getDepositId();
        java.lang.String str5 = deposit3.getCardNumber();
        boolean boolean6 = deposit3.isRefunded();
        deposit3.setInstitutionId("Pending");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.toString();
        java.lang.String str9 = deposit4.getCardNumber();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        java.lang.String str8 = deposit4.getPaymentMethod();
        deposit4.setCardNumber("Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        room4.closeForMaintenance();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isAvailableForBooking();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str5, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) '4', 100, (double) 'a');
        java.lang.String str4 = deposit3.getDisplayName();
        boolean boolean5 = deposit3.isTerminal();
        scheduler.model.DepositState depositState6 = deposit3.getState();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pending" + "'", str4, "Pending");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + depositState6 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState6.equals(scheduler.model.DepositState.PENDING));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) -1, 100, 10.0d, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getLocation();
        java.lang.String str9 = room4.getBuilding();
        boolean boolean10 = room4.isAvailableForBooking();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getLocation();
        room4.closeForMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str7, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        int int9 = deposit4.getDepositId();
        int int10 = deposit4.getDepositId();
        deposit4.depositRefunded();
        java.lang.String str12 = deposit4.getInstitutionId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        int int6 = deposit4.getBookingId();
        int int7 = deposit4.getDepositId();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        int int9 = deposit4.getDepositId();
        deposit4.depositRefunded();
        java.lang.String str11 = deposit4.getDisplayName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Forfeited" + "'", str11, "Forfeited");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        java.lang.String str8 = deposit4.getDisplayName();
        java.lang.String str9 = deposit4.getInstitutionId();
        int int10 = deposit4.getBookingId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) ' ', (int) 'a', (double) 'a', "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        room4.closeForMaintenance();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str5, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) ' ', (int) '4', (double) (-1), "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        boolean boolean5 = deposit4.isAppliedToFinalCost();
        deposit4.setInstitutionId("Paid");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((-1.0d));
        java.lang.String str2 = deposit1.getInstitutionId();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        deposit1.setInstitutionId("hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        int int8 = room4.getCapacity();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getLocation();
        java.lang.String str11 = room4.getLocation();
        boolean boolean12 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str10, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str11, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        room4.closeForMaintenance();
        boolean boolean8 = room4.isAvailableForBooking();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str5, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str9, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) ' ', (int) '4', (double) (-1), "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        boolean boolean5 = deposit4.isAppliedToFinalCost();
        boolean boolean6 = deposit4.isPaid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(1, 0, (double) 100L, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        boolean boolean5 = deposit4.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (-1), "hi!", "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        room4.reopenFromMaintenance();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) '4', 100, (double) 'a');
        java.lang.String str4 = deposit3.getDisplayName();
        boolean boolean5 = deposit3.isTerminal();
        int int6 = deposit3.getBookingId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pending" + "'", str4, "Pending");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(1, 0, (double) 100L, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        java.lang.String str5 = deposit4.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pending" + "'", str5, "Pending");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        boolean boolean6 = deposit4.isPending();
        deposit4.setPaymentMethod("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str9 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}'}" + "'", str9, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}'}");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        boolean boolean8 = deposit4.isPending();
        boolean boolean9 = deposit4.isForfeited();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        java.lang.String str9 = deposit4.getDisplayName();
        double double10 = deposit4.getAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Paid" + "'", str9, "Paid");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        java.lang.String str10 = deposit4.getPaymentMethod();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str5, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str6, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        boolean boolean9 = deposit4.isTerminal();
        java.lang.String str10 = deposit4.toString();
        boolean boolean11 = deposit4.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str10, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean7 = room6.isEnabled();
        room6.reopenFromMaintenance();
        room6.reopenFromMaintenance();
        room6.enable();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking13 = new scheduler.model.Booking("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}", registeredUser1, room6, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        java.lang.String str10 = deposit4.getPaymentMethod();
        boolean boolean11 = deposit4.isRefunded();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        int int8 = room4.getCapacity();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        double double11 = deposit4.getAmount();
        boolean boolean12 = deposit4.isTerminal();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        boolean boolean2 = deposit1.isPaid();
        boolean boolean3 = deposit1.isAppliedToFinalCost();
        java.lang.String str4 = deposit1.getInstitutionId();
        deposit1.markPaid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 10, (double) 1L, "hi!");
        deposit4.setPaymentMethod("Paid");
        java.lang.String str7 = deposit4.toString();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Paid'}" + "'", str7, "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Paid'}");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((-1), 0, (double) 100L, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 100, (double) (byte) 100, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        int int5 = deposit4.getBookingId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit(100.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        int int6 = deposit4.getBookingId();
        int int7 = deposit4.getDepositId();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean7 = room6.isEnabled();
        room6.reopenFromMaintenance();
        room6.reopenFromMaintenance();
        room6.disable();
        room6.enable();
        room6.closeForMaintenance();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking15 = new scheduler.model.Booking("Paid", registeredUser1, room6, localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        java.lang.String str2 = deposit1.toString();
        boolean boolean3 = deposit1.isTerminal();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deposit{depositId=0, bookingId=0, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='null'}" + "'", str2, "Deposit{depositId=0, bookingId=0, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='null'}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        java.lang.String str7 = room4.getRoomId();
        room4.closeForMaintenance();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, 52, (-1.0d), "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Paid'}");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (short) 10, (int) (short) 1, (-1.0d), "Pending");
        boolean boolean5 = deposit4.isPaid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        boolean boolean2 = deposit1.isPaid();
        boolean boolean3 = deposit1.isAppliedToFinalCost();
        boolean boolean4 = deposit1.isPending();
        java.lang.String str5 = deposit1.getCardNumber();
        deposit1.setCardNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        java.lang.String str12 = deposit4.getPaymentMethod();
        java.lang.String str13 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str13, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isApplied();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str7, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        room4.disable();
        int int8 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str5, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) 100, 100, (double) (byte) -1);
        deposit3.setPaymentMethod("Forfeited");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        java.lang.String str8 = deposit4.getDisplayName();
        java.lang.String str9 = deposit4.getInstitutionId();
        java.lang.String str10 = deposit4.getDisplayName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pending" + "'", str10, "Pending");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        room4.enable();
        boolean boolean10 = room4.isAvailableForBooking();
        java.lang.String str11 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str11, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        room4.enable();
        room4.closeForMaintenance();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        java.lang.String str2 = deposit1.toString();
        boolean boolean3 = deposit1.isPending();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deposit{depositId=0, bookingId=0, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='null'}" + "'", str2, "Deposit{depositId=0, bookingId=0, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='null'}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        int int11 = deposit4.getDepositId();
        java.lang.String str12 = deposit4.toString();
        scheduler.model.DepositState depositState13 = deposit4.getState();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str12, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + depositState13 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState13.equals(scheduler.model.DepositState.PENDING));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        boolean boolean9 = deposit4.isTerminal();
        boolean boolean10 = deposit4.isApplied();
        boolean boolean11 = deposit4.isRefunded();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        boolean boolean8 = deposit4.isForfeited();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        double double5 = deposit4.getAmount();
        java.lang.String str6 = deposit4.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.enable();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getPaymentMethod();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        java.lang.String str11 = deposit4.getPaymentMethod();
        boolean boolean12 = deposit4.isPending();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (short) 10, 1, (double) (short) 10, "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Paid'}");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        boolean boolean7 = room4.isClosedForMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0L);
        boolean boolean2 = deposit1.isRefunded();
        deposit1.setInstitutionId("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str7, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str8, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        boolean boolean2 = deposit1.isPaid();
        boolean boolean3 = deposit1.isAppliedToFinalCost();
        boolean boolean4 = deposit1.isPending();
        java.lang.String str5 = deposit1.getCardNumber();
        // The following exception was thrown during execution in test generation
        try {
            deposit1.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getLocation();
        java.lang.String str9 = room4.getBuilding();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        int int8 = room4.getCapacity();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(1, 0, (double) 100L, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isApplied();
        java.lang.String str6 = deposit4.getPaymentMethod();
        boolean boolean7 = deposit4.isApplied();
        boolean boolean8 = deposit4.isPaid();
        int int9 = deposit4.getDepositId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) 'a', 32, (double) 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        boolean boolean6 = deposit4.isPending();
        deposit4.setPaymentMethod("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking5 = new scheduler.model.Booking("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}", registeredUser1, room2, localDateTime3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        int int9 = deposit4.getDepositId();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        java.lang.String str6 = deposit4.getPaymentMethod();
        java.lang.String str7 = deposit4.getCardNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.toString();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        int int9 = deposit4.getDepositId();
        int int10 = deposit4.getDepositId();
        deposit4.depositRefunded();
        deposit4.setCardNumber("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=true, forfeited=false, paymentMethod='Pending'}");
        java.lang.String str14 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=true, paymentMethod='hi!'}" + "'", str14, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=true, paymentMethod='hi!'}");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        scheduler.model.DepositState depositState8 = deposit4.getState();
        boolean boolean9 = deposit4.isForfeited();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + depositState8 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState8.equals(scheduler.model.DepositState.PENDING));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.toString();
        boolean boolean9 = deposit4.isForfeited();
        boolean boolean10 = deposit4.isPaid();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        java.lang.String str9 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        java.lang.String str11 = deposit4.getPaymentMethod();
        boolean boolean12 = deposit4.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean7 = room6.isEnabled();
        int int8 = room6.getCapacity();
        java.lang.String str9 = room6.getRoomId();
        room6.closeForMaintenance();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking13 = new scheduler.model.Booking("Deposit{depositId=0, bookingId=0, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='null'}", registeredUser1, room6, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        java.lang.String str7 = room4.getRoomId();
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getLocation();
        room4.disable();
        boolean boolean10 = room4.isClosedForMaintenance();
        java.lang.String str11 = room4.getRoomId();
        room4.closeForMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        int int7 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str5, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        boolean boolean12 = deposit4.isAppliedToFinalCost();
        boolean boolean13 = deposit4.isRefunded();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        java.lang.String str6 = deposit4.getPaymentMethod();
        boolean boolean7 = deposit4.isTerminal();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (short) 0, (int) '4', (double) 0L, "hi!");
        java.lang.String str5 = deposit4.getCardNumber();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isApplied();
        java.lang.String str6 = deposit4.getPaymentMethod();
        double double7 = deposit4.getAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getRoomId();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        boolean boolean12 = deposit4.isAppliedToFinalCost();
        deposit4.setPaymentMethod("Pending");
        deposit4.applyToFinalCost();
        java.lang.String str16 = deposit4.toString();
        double double17 = deposit4.getAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=true, forfeited=false, paymentMethod='Pending'}" + "'", str16, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=true, forfeited=false, paymentMethod='Pending'}");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) 100, 100, (double) (byte) -1);
        boolean boolean4 = deposit3.isPending();
        boolean boolean5 = deposit3.isPaid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) 100, 100, (double) (byte) -1);
        int int4 = deposit3.getDepositId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, (int) (byte) 100, (double) 1.0f, "Paid");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        scheduler.model.DepositState depositState8 = deposit4.getState();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositApplied();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + depositState8 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState8.equals(scheduler.model.DepositState.PENDING));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) -1, (int) (short) 1, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            deposit3.applyToFinalCost();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be applied.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) (short) 100);
        boolean boolean2 = deposit1.isPending();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        boolean boolean9 = deposit4.isTerminal();
        java.lang.String str10 = deposit4.toString();
        java.lang.String str11 = deposit4.toString();
        java.lang.String str12 = deposit4.getInstitutionId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str10, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str11, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        int int6 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getBuilding();
        room4.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPending();
        double double6 = deposit4.getAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        boolean boolean7 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        boolean boolean2 = deposit1.isPaid();
        int int3 = deposit1.getDepositId();
        boolean boolean4 = deposit1.isTerminal();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        double double5 = deposit4.getAmount();
        boolean boolean6 = deposit4.isRefunded();
        java.lang.String str7 = deposit4.getCardNumber();
        java.lang.String str8 = deposit4.getDisplayName();
        boolean boolean9 = deposit4.isPaid();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str9, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        double double6 = deposit4.getAmount();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.disable();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (-1), "hi!", "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        boolean boolean5 = room4.isAvailableForBooking();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1", (int) '#', "", "Paid");
        java.lang.String str5 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        boolean boolean8 = deposit4.isForfeited();
        boolean boolean9 = deposit4.isApplied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        room4.closeForMaintenance();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isClosedForMaintenance();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        boolean boolean7 = room4.isClosedForMaintenance();
        room4.enable();
        java.lang.String str9 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str9, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit(0, (int) (short) 100, (double) (byte) 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        scheduler.model.DepositState depositState8 = deposit4.getState();
        int int9 = deposit4.getDepositId();
        double double10 = deposit4.getAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + depositState8 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState8.equals(scheduler.model.DepositState.PENDING));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        double double5 = deposit4.getAmount();
        boolean boolean6 = deposit4.isForfeited();
        scheduler.model.DepositState depositState7 = deposit4.getState();
        java.lang.String str8 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + depositState7 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState7.equals(scheduler.model.DepositState.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        boolean boolean2 = deposit1.isPaid();
        // The following exception was thrown during execution in test generation
        try {
            deposit1.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        java.lang.String str7 = room4.getRoomId();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        boolean boolean7 = room4.isClosedForMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str9, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit(0, (int) 'a', (double) 52);
        boolean boolean4 = deposit3.isRefunded();
        java.lang.String str5 = deposit3.getInstitutionId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) 10, (int) (byte) 10, (double) 10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        room4.closeForMaintenance();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isClosedForMaintenance();
        java.lang.String str10 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        double double5 = deposit4.getAmount();
        boolean boolean6 = deposit4.isRefunded();
        java.lang.String str7 = deposit4.getCardNumber();
        java.lang.String str8 = deposit4.getDisplayName();
        deposit4.setPaymentMethod("Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Paid'}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        boolean boolean9 = deposit4.isTerminal();
        deposit4.setPaymentMethod("hi! - hi! - hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1 - Capacity: -1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        scheduler.model.DepositState depositState8 = deposit4.getState();
        deposit4.markPaid();
        deposit4.setInstitutionId("Forfeited");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + depositState8 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState8.equals(scheduler.model.DepositState.PENDING));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        int int9 = deposit4.getDepositId();
        int int10 = deposit4.getDepositId();
        deposit4.depositRefunded();
        java.lang.String str12 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=true, paymentMethod='hi!'}" + "'", str12, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=true, paymentMethod='hi!'}");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (short) 0, (int) (byte) 0, (double) 10L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getPaymentMethod();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        int int11 = deposit4.getDepositId();
        deposit4.setCardNumber("Pending");
        java.lang.String str14 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str14, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getLocation();
        java.lang.String str9 = room4.getLocation();
        java.lang.String str10 = room4.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str7, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str9, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        double double5 = deposit4.getAmount();
        boolean boolean6 = deposit4.isRefunded();
        java.lang.String str7 = deposit4.getCardNumber();
        java.lang.String str8 = deposit4.getCardNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) 10, (int) (short) 1, 0.0d);
        int int4 = deposit3.getDepositId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        boolean boolean6 = deposit4.isPending();
        deposit4.setPaymentMethod("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str9 = deposit4.getInstitutionId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isPending();
        java.lang.String str8 = deposit4.toString();
        double double9 = deposit4.getAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        int int8 = room4.getCapacity();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isEnabled();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) '4', 100, (double) 'a');
        java.lang.String str4 = deposit3.getDisplayName();
        boolean boolean5 = deposit3.isAppliedToFinalCost();
        // The following exception was thrown during execution in test generation
        try {
            deposit3.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pending" + "'", str4, "Pending");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) (-1.0f));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (short) 1, 0, (double) 100.0f);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        java.lang.String str5 = room4.getRoomId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) ' ', (int) '4', (double) (-1), "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        scheduler.model.DepositState depositState5 = deposit4.getState();
        boolean boolean6 = deposit4.isApplied();
        org.junit.Assert.assertTrue("'" + depositState5 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState5.equals(scheduler.model.DepositState.PENDING));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setCardNumber("Paid");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (short) 0, 100, (double) 10L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getRoomId();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str9, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        java.lang.String str12 = deposit4.getInstitutionId();
        deposit4.forfeit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        java.lang.String str7 = room4.getRoomId();
        room4.disable();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 100L);
        boolean boolean2 = deposit1.isApplied();
        boolean boolean3 = deposit1.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1", (int) '#', "", "Paid");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        scheduler.model.Room room4 = new scheduler.model.Room("", (int) (short) -1, "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Paid'}", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}'}");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        scheduler.model.Room room4 = new scheduler.model.Room("Forfeited", (int) (byte) 0, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=true, forfeited=false, paymentMethod='Pending'}", "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0L);
        boolean boolean2 = deposit1.isRefunded();
        deposit1.markPaid();
        deposit1.applyToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(100, (int) (byte) 0, (double) 32, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        java.lang.String str11 = deposit4.getPaymentMethod();
        boolean boolean12 = deposit4.isPending();
        java.lang.String str13 = deposit4.toString();
        boolean boolean14 = deposit4.isPaid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str13, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 100, (double) (byte) 100, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        scheduler.model.DepositState depositState5 = deposit4.getState();
        java.lang.String str6 = deposit4.toString();
        java.lang.String str7 = deposit4.getInstitutionId();
        org.junit.Assert.assertTrue("'" + depositState5 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState5.equals(scheduler.model.DepositState.PENDING));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deposit{depositId=0, bookingId=100, amount=$100.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1'}" + "'", str6, "Deposit{depositId=0, bookingId=100, amount=$100.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1'}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) 'a', (int) (short) 10, (double) ' ', "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getLocation();
        java.lang.String str9 = room4.getRoomId();
        java.lang.String str10 = room4.getRoomId();
        boolean boolean11 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str8, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean7 = room6.isEnabled();
        room6.disable();
        boolean boolean9 = room6.isClosedForMaintenance();
        boolean boolean10 = room6.isEnabled();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking13 = new scheduler.model.Booking("Paid", registeredUser1, room6, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        deposit4.setPaymentMethod("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        double double10 = deposit4.getAmount();
        deposit4.setPaymentMethod("");
        deposit4.setPaymentMethod("hi! - hi! - hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1 - Capacity: -1");
        java.lang.String str15 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi! - hi! - hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1 - Capacity: -1'}" + "'", str15, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi! - hi! - hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1 - Capacity: -1'}");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        java.lang.String str10 = deposit4.getCardNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getPaymentMethod();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        int int11 = deposit4.getDepositId();
        boolean boolean12 = deposit4.isAppliedToFinalCost();
        java.lang.String str13 = deposit4.toString();
        java.lang.Class<?> wildcardClass14 = deposit4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str13, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 0);
        boolean boolean2 = deposit1.isPaid();
        int int3 = deposit1.getDepositId();
        // The following exception was thrown during execution in test generation
        try {
            deposit1.forfeit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        boolean boolean9 = room4.isEnabled();
        room4.closeForMaintenance();
        room4.disable();
        java.lang.String str12 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str12, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (short) -1, 0, (double) 1, "Deposit{depositId=0, bookingId=100, amount=$100.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1'}");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        room4.disable();
        room4.enable();
        boolean boolean10 = room4.isAvailableForBooking();
        boolean boolean11 = room4.isAvailableForBooking();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getRoomId();
        room4.enable();
        java.lang.String str9 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str9, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomId();
        int int8 = room4.getCapacity();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getLocation();
        room4.reopenFromMaintenance();
        room4.enable();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str10, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        deposit4.setPaymentMethod("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        double double10 = deposit4.getAmount();
        deposit4.setPaymentMethod("");
        deposit4.setPaymentMethod("hi! - hi! - hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1 - Capacity: -1");
        java.lang.Class<?> wildcardClass15 = deposit4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) ' ', (int) '4', (double) (-1), "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        scheduler.model.DepositState depositState5 = deposit4.getState();
        deposit4.markPaid();
        org.junit.Assert.assertTrue("'" + depositState5 + "' != '" + scheduler.model.DepositState.PENDING + "'", depositState5.equals(scheduler.model.DepositState.PENDING));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean7 = room6.isEnabled();
        room6.reopenFromMaintenance();
        room6.reopenFromMaintenance();
        room6.disable();
        room6.enable();
        boolean boolean12 = room6.isAvailableForBooking();
        java.lang.String str13 = room6.getLocation();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking16 = new scheduler.model.Booking("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=true, forfeited=false, paymentMethod='Pending'}", registeredUser1, room6, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}" + "'", str13, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        room4.closeForMaintenance();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) (byte) 10, (double) 1L, "hi!");
        java.lang.String str5 = deposit4.getInstitutionId();
        boolean boolean6 = deposit4.isForfeited();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        boolean boolean6 = deposit4.isPending();
        deposit4.setPaymentMethod("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean9 = deposit4.isPaid();
        boolean boolean10 = deposit4.isForfeited();
        java.lang.String str11 = deposit4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}'}" + "'", str11, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}'}");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit(0, (int) 'a', (double) 52);
        boolean boolean4 = deposit3.isRefunded();
        // The following exception was thrown during execution in test generation
        try {
            deposit3.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getPaymentMethod();
        java.lang.String str10 = deposit4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) (byte) 0, (int) ' ', (double) (short) 10, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        java.lang.String str10 = deposit4.getDisplayName();
        double double11 = deposit4.getAmount();
        int int12 = deposit4.getDepositId();
        boolean boolean13 = deposit4.isPaid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid" + "'", str10, "Paid");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) 100.0f);
        deposit1.markPaid();
        boolean boolean3 = deposit1.isRefunded();
        int int4 = deposit1.getBookingId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        java.lang.String str11 = deposit4.getPaymentMethod();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositRefunded();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be refunded.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        scheduler.model.RegisteredUser registeredUser1 = null;
        scheduler.model.Room room6 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room6.enable();
        java.lang.String str8 = room6.toString();
        java.lang.String str9 = room6.getRoomId();
        int int10 = room6.getCapacity();
        int int11 = room6.getCapacity();
        boolean boolean12 = room6.isEnabled();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.Booking booking15 = new scheduler.model.Booking("Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi! - hi! - hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1 - Capacity: -1'}", registeredUser1, room6, localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str8, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        room4.disable();
        room4.closeForMaintenance();
        room4.closeForMaintenance();
        boolean boolean9 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        java.lang.String str6 = deposit4.getInstitutionId();
        boolean boolean7 = deposit4.isTerminal();
        java.lang.String str8 = deposit4.getInstitutionId();
        java.lang.String str9 = deposit4.getInstitutionId();
        java.lang.String str10 = deposit4.getPaymentMethod();
        java.lang.String str11 = deposit4.getCardNumber();
        java.lang.String str12 = deposit4.getDisplayName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isForfeited();
        boolean boolean6 = deposit4.isApplied();
        int int7 = deposit4.getBookingId();
        deposit4.markPaid();
        boolean boolean9 = deposit4.isAppliedToFinalCost();
        boolean boolean10 = deposit4.isAppliedToFinalCost();
        boolean boolean11 = deposit4.isForfeited();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit((int) ' ', (int) 'a', (double) 'a', "Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = deposit4.isAppliedToFinalCost();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        java.lang.String str8 = deposit4.getPaymentMethod();
        // The following exception was thrown during execution in test generation
        try {
            deposit4.depositForfeited();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Deposit must be paid before it can be forfeited.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getRoomId();
        room4.closeForMaintenance();
        java.lang.String str9 = room4.getBuilding();
        boolean boolean10 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        scheduler.model.Deposit deposit1 = new scheduler.model.Deposit((double) (byte) 100);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        scheduler.model.Deposit deposit4 = new scheduler.model.Deposit(0, 1, 0.0d, "hi!");
        boolean boolean5 = deposit4.isPaid();
        deposit4.setPaymentMethod("");
        boolean boolean8 = deposit4.isForfeited();
        java.lang.String str9 = deposit4.getPaymentMethod();
        java.lang.Class<?> wildcardClass10 = deposit4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (-1), "hi!", "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        java.lang.String str5 = room4.getRoomId();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getBuilding();
        room4.closeForMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1 - Capacity: -1" + "'", str6, "hi! - hi! - hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1 - Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        scheduler.model.Deposit deposit3 = new scheduler.model.Deposit((int) (byte) -1, (int) (byte) 100, (double) 1.0f);
        boolean boolean4 = deposit3.isTerminal();
        boolean boolean5 = deposit3.isApplied();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) -1, "hi!", "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}");
        room4.enable();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getRoomId();
        java.lang.String str10 = room4.toString();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str6, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1" + "'", str10, "hi! - hi! - Deposit{depositId=0, bookingId=1, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'} - Capacity: -1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        scheduler.model.Room room4 = new scheduler.model.Room("Deposit{depositId=0, bookingId=10, amount=$1.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='hi!'}", (int) (short) 0, "Deposit{depositId=0, bookingId=1, amount=$0.0, paid=true, appliedToFinalCost=true, forfeited=false, paymentMethod='Pending'}", "Deposit{depositId=0, bookingId=0, amount=$0.0, paid=false, appliedToFinalCost=false, forfeited=false, paymentMethod='null'}");
        room4.disable();
    }
}

