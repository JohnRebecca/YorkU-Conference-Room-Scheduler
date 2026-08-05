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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        scheduler.state.CheckedInState checkedInState0 = new scheduler.state.CheckedInState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: User has already checked in.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        scheduler.state.CheckedInState checkedInState0 = new scheduler.state.CheckedInState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.extend(booking1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        scheduler.state.CheckedInState checkedInState0 = new scheduler.state.CheckedInState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Checked-in booking cannot be cancelled.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        scheduler.state.ConfirmedState confirmedState0 = new scheduler.state.ConfirmedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.expire(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getDeposit()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        scheduler.state.ConfirmedState confirmedState0 = new scheduler.state.ConfirmedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.complete(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Booking must be checked in before it can be completed.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        scheduler.state.CheckedInState checkedInState0 = new scheduler.state.CheckedInState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.complete(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.setStatus(scheduler.model.BookingStatus)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        scheduler.state.CheckedInState checkedInState0 = new scheduler.state.CheckedInState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.edit(booking1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Checked-in booking cannot be edited.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        scheduler.state.ConfirmedState confirmedState0 = new scheduler.state.ConfirmedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        scheduler.state.CancelledState cancelledState0 = new scheduler.state.CancelledState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.complete(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Cancelled booking cannot be completed.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        scheduler.state.ConfirmedState confirmedState0 = new scheduler.state.ConfirmedState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.edit(booking1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        scheduler.state.ConfirmedState confirmedState0 = new scheduler.state.ConfirmedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.payUpfrontFee(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Upfront fee has already been paid.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        scheduler.state.PendingPaymentState pendingPaymentState0 = new scheduler.state.PendingPaymentState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingPaymentState0.payUpfrontFee(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getDeposit()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        scheduler.state.PendingPaymentState pendingPaymentState0 = new scheduler.state.PendingPaymentState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingPaymentState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        scheduler.state.CompletedState completedState0 = new scheduler.state.CompletedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.expire(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Completed booking cannot expire.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        scheduler.state.ExpiredState expiredState0 = new scheduler.state.ExpiredState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expiredState0.extend(booking1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Expired booking cannot be extended.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        scheduler.state.CompletedState completedState0 = new scheduler.state.CompletedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Completed booking cannot be checked in.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        scheduler.state.CheckedInState checkedInState0 = new scheduler.state.CheckedInState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.expire(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.setStatus(scheduler.model.BookingStatus)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        scheduler.state.CompletedState completedState0 = new scheduler.state.CompletedState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(booking1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Completed booking cannot be extended.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        scheduler.state.ExpiredState expiredState0 = new scheduler.state.ExpiredState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            expiredState0.complete(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Expired booking cannot be completed.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        scheduler.state.PendingPaymentState pendingPaymentState0 = new scheduler.state.PendingPaymentState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingPaymentState0.extend(booking1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Booking cannot be extended before upfront payment is completed.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        scheduler.state.PendingPaymentState pendingPaymentState0 = new scheduler.state.PendingPaymentState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingPaymentState0.edit(booking1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        scheduler.state.CheckedInState checkedInState0 = new scheduler.state.CheckedInState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.payUpfrontFee(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Upfront fee has already been paid.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        scheduler.state.ConfirmedState confirmedState0 = new scheduler.state.ConfirmedState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.extend(booking1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        scheduler.state.ExpiredState expiredState0 = new scheduler.state.ExpiredState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            expiredState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Expired booking cannot be checked in.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        scheduler.state.ConfirmedState confirmedState0 = new scheduler.state.ConfirmedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        scheduler.state.CancelledState cancelledState0 = new scheduler.state.CancelledState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.edit(booking1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Cancelled booking cannot be edited.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        scheduler.state.CancelledState cancelledState0 = new scheduler.state.CancelledState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.payUpfrontFee(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Cancelled booking cannot be paid.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        scheduler.state.CancelledState cancelledState0 = new scheduler.state.CancelledState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.extend(booking1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Cancelled booking cannot be extended.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        scheduler.state.ExpiredState expiredState0 = new scheduler.state.ExpiredState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            expiredState0.payUpfrontFee(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Expired booking cannot be paid.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        scheduler.state.CancelledState cancelledState0 = new scheduler.state.CancelledState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Booking is already cancelled.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        scheduler.state.ExpiredState expiredState0 = new scheduler.state.ExpiredState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            expiredState0.expire(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Booking is already expired.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        scheduler.state.CancelledState cancelledState0 = new scheduler.state.CancelledState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.expire(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Cancelled booking cannot expire.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        scheduler.state.CancelledState cancelledState0 = new scheduler.state.CancelledState();
        java.lang.Class<?> wildcardClass1 = cancelledState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        scheduler.state.PendingPaymentState pendingPaymentState0 = new scheduler.state.PendingPaymentState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingPaymentState0.complete(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Pending booking cannot be completed.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        scheduler.state.ExpiredState expiredState0 = new scheduler.state.ExpiredState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expiredState0.edit(booking1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Expired booking cannot be edited.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        scheduler.state.CancelledState cancelledState0 = new scheduler.state.CancelledState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Cancelled booking cannot be checked in.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        scheduler.state.CompletedState completedState0 = new scheduler.state.CompletedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Completed booking cannot be cancelled.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        scheduler.state.CompletedState completedState0 = new scheduler.state.CompletedState();
        scheduler.model.Booking booking1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.edit(booking1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Completed booking cannot be edited.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        scheduler.state.PendingPaymentState pendingPaymentState0 = new scheduler.state.PendingPaymentState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingPaymentState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Booking cannot be checked in before payment.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        scheduler.state.CompletedState completedState0 = new scheduler.state.CompletedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.complete(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Booking is already completed.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        scheduler.state.CompletedState completedState0 = new scheduler.state.CompletedState();
        java.lang.Class<?> wildcardClass1 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        scheduler.state.CompletedState completedState0 = new scheduler.state.CompletedState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.payUpfrontFee(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Completed booking cannot be paid again.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        scheduler.state.ExpiredState expiredState0 = new scheduler.state.ExpiredState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            expiredState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type scheduler.exception.InvalidBookingActionException; message: Expired booking cannot be cancelled.");
        } catch (scheduler.exception.InvalidBookingActionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        scheduler.state.PendingPaymentState pendingPaymentState0 = new scheduler.state.PendingPaymentState();
        scheduler.model.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingPaymentState0.expire(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.setStatus(scheduler.model.BookingStatus)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        scheduler.state.PendingPaymentState pendingPaymentState0 = new scheduler.state.PendingPaymentState();
        java.lang.Class<?> wildcardClass1 = pendingPaymentState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        scheduler.state.CheckedInState checkedInState0 = new scheduler.state.CheckedInState();
        java.lang.Class<?> wildcardClass1 = checkedInState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        scheduler.state.ConfirmedState confirmedState0 = new scheduler.state.ConfirmedState();
        java.lang.Class<?> wildcardClass1 = confirmedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        scheduler.state.ExpiredState expiredState0 = new scheduler.state.ExpiredState();
        java.lang.Class<?> wildcardClass1 = expiredState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

