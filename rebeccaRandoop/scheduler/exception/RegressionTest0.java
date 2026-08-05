package scheduler.exception;
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
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        java.lang.String str2 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.BookingException: ");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass5 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.String str5 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str5, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.String str5 = bookingException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.BookingException: " + "'", str5, "scheduler.exception.BookingException: ");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass5 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.String str5 = invalidBookingActionException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str5, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: hi!");
        java.lang.String str2 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str2, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.String str5 = bookingException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str5, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.String str2 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str2, "scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = invalidBookingActionException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        java.lang.String str2 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str2, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass5 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.String str2 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: hi!");
        java.lang.Class<?> wildcardClass2 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        java.lang.Class<?> wildcardClass16 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: " + "'", str2, "scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = invalidBookingActionException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = invalidBookingActionException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("hi!");
        java.lang.Class<?> wildcardClass2 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        java.lang.Class<?> wildcardClass12 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) bookingException10);
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.String str13 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.BookingException: " + "'", str13, "scheduler.exception.BookingException: ");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        java.lang.Class<?> wildcardClass12 = bookingException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = invalidBookingActionException3.getSuppressed();
        java.lang.String str6 = invalidBookingActionException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str6, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("hi!");
        java.lang.Class<?> wildcardClass2 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        java.lang.Class<?> wildcardClass9 = invalidBookingActionException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.String str5 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: " + "'", str5, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        java.lang.String str9 = invalidBookingActionException3.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str9, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        java.lang.Class<?> wildcardClass16 = bookingException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass15 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = roomUnavailableException1.getSuppressed();
        java.lang.String str4 = roomUnavailableException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str4, "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        java.lang.Class<?> wildcardClass25 = bookingException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        java.lang.String str25 = bookingException8.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str25, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Class<?> wildcardClass12 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray23 = invalidBookingActionException22.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException25 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException27 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException25.addSuppressed((java.lang.Throwable) roomUnavailableException27);
        java.lang.Throwable[] throwableArray29 = roomUnavailableException25.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException31 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException31.addSuppressed((java.lang.Throwable) bookingException33);
        roomUnavailableException25.addSuppressed((java.lang.Throwable) bookingException33);
        invalidBookingActionException22.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        bookingException9.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        java.lang.Class<?> wildcardClass38 = bookingException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.String str2 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str2, "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        java.lang.Throwable[] throwableArray51 = bookingException42.getSuppressed();
        java.lang.Class<?> wildcardClass52 = bookingException42.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = roomUnavailableException1.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        java.lang.Class<?> wildcardClass8 = invalidBookingActionException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException16.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        java.lang.Throwable[] throwableArray20 = invalidBookingActionException18.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        java.lang.Class<?> wildcardClass22 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = roomUnavailableException1.getSuppressed();
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("");
        bookingException5.addSuppressed((java.lang.Throwable) bookingException7);
        java.lang.Throwable[] throwableArray9 = bookingException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = bookingException7.getSuppressed();
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException14 = new scheduler.exception.BookingException("");
        bookingException12.addSuppressed((java.lang.Throwable) bookingException14);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException12.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        bookingException7.addSuppressed((java.lang.Throwable) bookingException12);
        scheduler.exception.BookingException bookingException21 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException23 = new scheduler.exception.BookingException("");
        bookingException21.addSuppressed((java.lang.Throwable) bookingException23);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException26 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException21.addSuppressed((java.lang.Throwable) invalidBookingActionException26);
        bookingException12.addSuppressed((java.lang.Throwable) bookingException21);
        scheduler.exception.BookingException bookingException30 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("");
        bookingException30.addSuppressed((java.lang.Throwable) bookingException32);
        java.lang.Throwable[] throwableArray34 = bookingException32.getSuppressed();
        java.lang.Throwable[] throwableArray35 = bookingException32.getSuppressed();
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException39 = new scheduler.exception.BookingException("");
        bookingException37.addSuppressed((java.lang.Throwable) bookingException39);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException42 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException42);
        bookingException32.addSuppressed((java.lang.Throwable) bookingException37);
        scheduler.exception.BookingException bookingException46 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("");
        bookingException46.addSuppressed((java.lang.Throwable) bookingException48);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException51 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException46.addSuppressed((java.lang.Throwable) invalidBookingActionException51);
        bookingException37.addSuppressed((java.lang.Throwable) bookingException46);
        bookingException21.addSuppressed((java.lang.Throwable) bookingException46);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException46);
        java.lang.Class<?> wildcardClass56 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertArrayEquals(throwableArray34, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.BookingException bookingException52 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException54 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException52.addSuppressed((java.lang.Throwable) invalidBookingActionException54);
        java.lang.Throwable[] throwableArray56 = invalidBookingActionException54.getSuppressed();
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException54);
        java.lang.Class<?> wildcardClass58 = bookingException42.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertArrayEquals(throwableArray56, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass11 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        java.lang.Throwable[] throwableArray12 = bookingException9.getSuppressed();
        java.lang.Class<?> wildcardClass13 = throwableArray12.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.String str5 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str5, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        java.lang.Class<?> wildcardClass6 = roomUnavailableException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        java.lang.Throwable[] throwableArray17 = bookingException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = bookingException15.getSuppressed();
        scheduler.exception.BookingException bookingException20 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("");
        bookingException20.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException25 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException20.addSuppressed((java.lang.Throwable) invalidBookingActionException25);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException20);
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException20.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("");
        bookingException38.addSuppressed((java.lang.Throwable) bookingException40);
        java.lang.Throwable[] throwableArray42 = bookingException40.getSuppressed();
        java.lang.Throwable[] throwableArray43 = bookingException40.getSuppressed();
        scheduler.exception.BookingException bookingException45 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("");
        bookingException45.addSuppressed((java.lang.Throwable) bookingException47);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException50 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException45.addSuppressed((java.lang.Throwable) invalidBookingActionException50);
        bookingException40.addSuppressed((java.lang.Throwable) bookingException45);
        scheduler.exception.BookingException bookingException54 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException56 = new scheduler.exception.BookingException("");
        bookingException54.addSuppressed((java.lang.Throwable) bookingException56);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException59 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException54.addSuppressed((java.lang.Throwable) invalidBookingActionException59);
        bookingException45.addSuppressed((java.lang.Throwable) bookingException54);
        bookingException29.addSuppressed((java.lang.Throwable) bookingException54);
        scheduler.exception.BookingException bookingException64 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException66 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException64.addSuppressed((java.lang.Throwable) invalidBookingActionException66);
        java.lang.Throwable[] throwableArray68 = invalidBookingActionException66.getSuppressed();
        bookingException54.addSuppressed((java.lang.Throwable) invalidBookingActionException66);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException54);
        java.lang.Class<?> wildcardClass71 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertArrayEquals(throwableArray17, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertArrayEquals(throwableArray42, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertArrayEquals(throwableArray43, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertArrayEquals(throwableArray68, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Class<?> wildcardClass2 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.String str2 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        java.lang.Class<?> wildcardClass2 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray23 = invalidBookingActionException22.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException25 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException27 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException25.addSuppressed((java.lang.Throwable) roomUnavailableException27);
        java.lang.Throwable[] throwableArray29 = roomUnavailableException25.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException31 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException31.addSuppressed((java.lang.Throwable) bookingException33);
        roomUnavailableException25.addSuppressed((java.lang.Throwable) bookingException33);
        invalidBookingActionException22.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        bookingException9.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        java.lang.Throwable[] throwableArray38 = bookingException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        java.lang.String str16 = roomUnavailableException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: " + "'", str16, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("");
        bookingException6.addSuppressed((java.lang.Throwable) bookingException8);
        java.lang.Throwable[] throwableArray10 = bookingException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = bookingException8.getSuppressed();
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException27 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException22.addSuppressed((java.lang.Throwable) invalidBookingActionException27);
        bookingException13.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("");
        bookingException31.addSuppressed((java.lang.Throwable) bookingException33);
        java.lang.Throwable[] throwableArray35 = bookingException33.getSuppressed();
        java.lang.Throwable[] throwableArray36 = bookingException33.getSuppressed();
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("");
        bookingException38.addSuppressed((java.lang.Throwable) bookingException40);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException43 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException38.addSuppressed((java.lang.Throwable) invalidBookingActionException43);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException38);
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException49 = new scheduler.exception.BookingException("");
        bookingException47.addSuppressed((java.lang.Throwable) bookingException49);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException52 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException47.addSuppressed((java.lang.Throwable) invalidBookingActionException52);
        bookingException38.addSuppressed((java.lang.Throwable) bookingException47);
        bookingException22.addSuppressed((java.lang.Throwable) bookingException47);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException47);
        java.lang.Class<?> wildcardClass57 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertArrayEquals(throwableArray36, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        java.lang.String str8 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str8, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = invalidBookingActionException1.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException12 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException10.addSuppressed((java.lang.Throwable) invalidBookingActionException12);
        java.lang.Throwable[] throwableArray14 = bookingException10.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: ");
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        java.lang.Class<?> wildcardClass19 = invalidBookingActionException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        java.lang.Throwable[] throwableArray8 = invalidBookingActionException1.getSuppressed();
        java.lang.String str9 = invalidBookingActionException1.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "scheduler.exception.InvalidBookingActionException: hi!" + "'", str9, "scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray11 = bookingException1.getSuppressed();
        java.lang.Class<?> wildcardClass12 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray14 = roomUnavailableException10.getSuppressed();
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException19 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException19);
        java.lang.Throwable[] throwableArray21 = bookingException17.getSuppressed();
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException17);
        java.lang.String str23 = bookingException17.toString();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str23, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Class<?> wildcardClass2 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException14 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException12.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        invalidBookingActionException10.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException21 = new scheduler.exception.BookingException("");
        bookingException19.addSuppressed((java.lang.Throwable) bookingException21);
        java.lang.Throwable[] throwableArray23 = bookingException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = bookingException21.getSuppressed();
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        bookingException21.addSuppressed((java.lang.Throwable) bookingException26);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) bookingException26);
        java.lang.String str35 = bookingException26.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str35, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: ");
        java.lang.Throwable[] throwableArray2 = bookingException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass15 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException16.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        java.lang.Throwable[] throwableArray20 = invalidBookingActionException18.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        java.lang.String str22 = invalidBookingActionException18.toString();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str22, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException8.getSuppressed();
        java.lang.String str13 = roomUnavailableException8.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.RoomUnavailableException: " + "'", str13, "scheduler.exception.RoomUnavailableException: ");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.String str11 = bookingException3.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str11, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException8.getSuppressed();
        java.lang.Class<?> wildcardClass13 = throwableArray12.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: hi!");
        java.lang.Class<?> wildcardClass2 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException1.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("");
        bookingException6.addSuppressed((java.lang.Throwable) bookingException8);
        java.lang.Throwable[] throwableArray10 = bookingException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = bookingException8.getSuppressed();
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException27 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException22.addSuppressed((java.lang.Throwable) invalidBookingActionException27);
        bookingException13.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("");
        bookingException31.addSuppressed((java.lang.Throwable) bookingException33);
        java.lang.Throwable[] throwableArray35 = bookingException33.getSuppressed();
        java.lang.Throwable[] throwableArray36 = bookingException33.getSuppressed();
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("");
        bookingException38.addSuppressed((java.lang.Throwable) bookingException40);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException43 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException38.addSuppressed((java.lang.Throwable) invalidBookingActionException43);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException38);
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException49 = new scheduler.exception.BookingException("");
        bookingException47.addSuppressed((java.lang.Throwable) bookingException49);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException52 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException47.addSuppressed((java.lang.Throwable) invalidBookingActionException52);
        bookingException38.addSuppressed((java.lang.Throwable) bookingException47);
        bookingException22.addSuppressed((java.lang.Throwable) bookingException47);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException47);
        java.lang.String str57 = bookingException47.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertArrayEquals(throwableArray36, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str57, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        java.lang.String str16 = invalidBookingActionException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str16, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        java.lang.Throwable[] throwableArray21 = bookingException19.getSuppressed();
        java.lang.Throwable[] throwableArray22 = bookingException19.getSuppressed();
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException19.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException44 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray48 = invalidBookingActionException47.getSuppressed();
        invalidBookingActionException44.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException51 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException53 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException55 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException53.addSuppressed((java.lang.Throwable) invalidBookingActionException55);
        invalidBookingActionException51.addSuppressed((java.lang.Throwable) invalidBookingActionException55);
        invalidBookingActionException47.addSuppressed((java.lang.Throwable) invalidBookingActionException55);
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException24);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertArrayEquals(throwableArray48, new java.lang.Throwable[] {});
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        java.lang.Class<?> wildcardClass8 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        java.lang.Throwable[] throwableArray17 = bookingException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = bookingException15.getSuppressed();
        scheduler.exception.BookingException bookingException20 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("");
        bookingException20.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException25 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException20.addSuppressed((java.lang.Throwable) invalidBookingActionException25);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException20);
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException20.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("");
        bookingException38.addSuppressed((java.lang.Throwable) bookingException40);
        java.lang.Throwable[] throwableArray42 = bookingException40.getSuppressed();
        java.lang.Throwable[] throwableArray43 = bookingException40.getSuppressed();
        scheduler.exception.BookingException bookingException45 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("");
        bookingException45.addSuppressed((java.lang.Throwable) bookingException47);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException50 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException45.addSuppressed((java.lang.Throwable) invalidBookingActionException50);
        bookingException40.addSuppressed((java.lang.Throwable) bookingException45);
        scheduler.exception.BookingException bookingException54 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException56 = new scheduler.exception.BookingException("");
        bookingException54.addSuppressed((java.lang.Throwable) bookingException56);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException59 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException54.addSuppressed((java.lang.Throwable) invalidBookingActionException59);
        bookingException45.addSuppressed((java.lang.Throwable) bookingException54);
        bookingException29.addSuppressed((java.lang.Throwable) bookingException54);
        scheduler.exception.BookingException bookingException64 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException66 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException64.addSuppressed((java.lang.Throwable) invalidBookingActionException66);
        java.lang.Throwable[] throwableArray68 = invalidBookingActionException66.getSuppressed();
        bookingException54.addSuppressed((java.lang.Throwable) invalidBookingActionException66);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException54);
        java.lang.String str71 = bookingException54.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertArrayEquals(throwableArray17, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertArrayEquals(throwableArray42, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertArrayEquals(throwableArray43, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertArrayEquals(throwableArray68, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str71, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException4 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException6.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException4.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        java.lang.Throwable[] throwableArray12 = invalidBookingActionException1.getSuppressed();
        java.lang.Class<?> wildcardClass13 = throwableArray12.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Class<?> wildcardClass2 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray33 = bookingException3.getSuppressed();
        java.lang.Class<?> wildcardClass34 = throwableArray33.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str2, "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Class<?> wildcardClass33 = bookingException24.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray32 = invalidBookingActionException31.getSuppressed();
        invalidBookingActionException28.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException35.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException45 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray46 = invalidBookingActionException45.getSuppressed();
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException45);
        java.lang.Class<?> wildcardClass48 = invalidBookingActionException31.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray11 = bookingException1.getSuppressed();
        java.lang.Class<?> wildcardClass12 = throwableArray11.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: ");
        java.lang.String str2 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.BookingException: scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.BookingException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.String str6 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str6, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        java.lang.String str8 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "scheduler.exception.InvalidBookingActionException: hi!" + "'", str8, "scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = roomUnavailableException1.getSuppressed();
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("");
        bookingException5.addSuppressed((java.lang.Throwable) bookingException7);
        java.lang.Throwable[] throwableArray9 = bookingException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = bookingException7.getSuppressed();
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException14 = new scheduler.exception.BookingException("");
        bookingException12.addSuppressed((java.lang.Throwable) bookingException14);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException12.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        bookingException7.addSuppressed((java.lang.Throwable) bookingException12);
        scheduler.exception.BookingException bookingException21 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException23 = new scheduler.exception.BookingException("");
        bookingException21.addSuppressed((java.lang.Throwable) bookingException23);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException26 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException21.addSuppressed((java.lang.Throwable) invalidBookingActionException26);
        bookingException12.addSuppressed((java.lang.Throwable) bookingException21);
        scheduler.exception.BookingException bookingException30 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("");
        bookingException30.addSuppressed((java.lang.Throwable) bookingException32);
        java.lang.Throwable[] throwableArray34 = bookingException32.getSuppressed();
        java.lang.Throwable[] throwableArray35 = bookingException32.getSuppressed();
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException39 = new scheduler.exception.BookingException("");
        bookingException37.addSuppressed((java.lang.Throwable) bookingException39);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException42 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException42);
        bookingException32.addSuppressed((java.lang.Throwable) bookingException37);
        scheduler.exception.BookingException bookingException46 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("");
        bookingException46.addSuppressed((java.lang.Throwable) bookingException48);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException51 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException46.addSuppressed((java.lang.Throwable) invalidBookingActionException51);
        bookingException37.addSuppressed((java.lang.Throwable) bookingException46);
        bookingException21.addSuppressed((java.lang.Throwable) bookingException46);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException46);
        java.lang.String str56 = roomUnavailableException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertArrayEquals(throwableArray34, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str56, "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException12 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException10.addSuppressed((java.lang.Throwable) invalidBookingActionException12);
        java.lang.Throwable[] throwableArray14 = bookingException10.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.String str16 = invalidBookingActionException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str16, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("");
        bookingException6.addSuppressed((java.lang.Throwable) bookingException8);
        java.lang.Throwable[] throwableArray10 = bookingException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = bookingException8.getSuppressed();
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException27 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException22.addSuppressed((java.lang.Throwable) invalidBookingActionException27);
        bookingException13.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("");
        bookingException31.addSuppressed((java.lang.Throwable) bookingException33);
        java.lang.Throwable[] throwableArray35 = bookingException33.getSuppressed();
        java.lang.Throwable[] throwableArray36 = bookingException33.getSuppressed();
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("");
        bookingException38.addSuppressed((java.lang.Throwable) bookingException40);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException43 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException38.addSuppressed((java.lang.Throwable) invalidBookingActionException43);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException38);
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException49 = new scheduler.exception.BookingException("");
        bookingException47.addSuppressed((java.lang.Throwable) bookingException49);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException52 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException47.addSuppressed((java.lang.Throwable) invalidBookingActionException52);
        bookingException38.addSuppressed((java.lang.Throwable) bookingException47);
        bookingException22.addSuppressed((java.lang.Throwable) bookingException47);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException47);
        java.lang.String str57 = bookingException1.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertArrayEquals(throwableArray36, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str57, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray33 = bookingException3.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException35 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: ");
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException35);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: hi!");
        java.lang.String str2 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!" + "'", str2, "scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray4 = invalidBookingActionException3.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Class<?> wildcardClass15 = invalidBookingActionException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException7.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.RoomUnavailableException roomUnavailableException12 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException14 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException12.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray16 = roomUnavailableException14.getSuppressed();
        bookingException7.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray18 = roomUnavailableException14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = roomUnavailableException14.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Class<?> wildcardClass21 = roomUnavailableException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        java.lang.Class<?> wildcardClass2 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Class<?> wildcardClass5 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException7.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.RoomUnavailableException roomUnavailableException12 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException14 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException12.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray16 = roomUnavailableException14.getSuppressed();
        bookingException7.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray18 = roomUnavailableException14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = roomUnavailableException14.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray21 = bookingException3.getSuppressed();
        java.lang.String str22 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str22, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        java.lang.Throwable[] throwableArray39 = invalidBookingActionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        java.lang.Class<?> wildcardClass2 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.String str15 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str15, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        java.lang.Class<?> wildcardClass8 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("");
        java.lang.String str2 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.RoomUnavailableException: " + "'", str2, "scheduler.exception.RoomUnavailableException: ");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.String str6 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.BookingException: " + "'", str6, "scheduler.exception.BookingException: ");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        java.lang.String str6 = roomUnavailableException1.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: " + "'", str6, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray7 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = roomUnavailableException52.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException52);
        java.lang.Class<?> wildcardClass55 = bookingException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Class<?> wildcardClass2 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        java.lang.String str3 = roomUnavailableException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str3, "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: scheduler.exception.BookingException: ");
        java.lang.Class<?> wildcardClass2 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException7.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.RoomUnavailableException roomUnavailableException12 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException14 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException12.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray16 = roomUnavailableException14.getSuppressed();
        bookingException7.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray18 = roomUnavailableException14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = roomUnavailableException14.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        roomUnavailableException14.addSuppressed((java.lang.Throwable) bookingException22);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        java.lang.String str3 = invalidBookingActionException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str3, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: ");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.String str2 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException14 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException12.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        invalidBookingActionException10.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        java.lang.String str18 = invalidBookingActionException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str18, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!");
        java.lang.Class<?> wildcardClass2 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        java.lang.Class<?> wildcardClass39 = bookingException29.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException8.getSuppressed();
        java.lang.Throwable[] throwableArray13 = roomUnavailableException8.getSuppressed();
        java.lang.Throwable[] throwableArray14 = roomUnavailableException8.getSuppressed();
        java.lang.String str15 = roomUnavailableException8.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "scheduler.exception.RoomUnavailableException: " + "'", str15, "scheduler.exception.RoomUnavailableException: ");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException16 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException18.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        scheduler.exception.RoomUnavailableException roomUnavailableException23 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException25 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException23.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        java.lang.Throwable[] throwableArray27 = roomUnavailableException25.getSuppressed();
        bookingException18.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        java.lang.Throwable[] throwableArray29 = roomUnavailableException25.getSuppressed();
        roomUnavailableException16.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertArrayEquals(throwableArray29, new java.lang.Throwable[] {});
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        java.lang.Throwable[] throwableArray6 = roomUnavailableException4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str2, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray23 = invalidBookingActionException22.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException25 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException27 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException25.addSuppressed((java.lang.Throwable) roomUnavailableException27);
        java.lang.Throwable[] throwableArray29 = roomUnavailableException25.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException31 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException31.addSuppressed((java.lang.Throwable) bookingException33);
        roomUnavailableException25.addSuppressed((java.lang.Throwable) bookingException33);
        invalidBookingActionException22.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        bookingException9.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        java.lang.Throwable[] throwableArray38 = roomUnavailableException25.getSuppressed();
        java.lang.String str39 = roomUnavailableException25.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: " + "'", str39, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        java.lang.Throwable[] throwableArray12 = bookingException9.getSuppressed();
        java.lang.String str13 = bookingException9.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str13, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray32 = invalidBookingActionException31.getSuppressed();
        invalidBookingActionException28.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException35.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        java.lang.Class<?> wildcardClass44 = bookingException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.String str5 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str5, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException4 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException6.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException4.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        java.lang.Throwable[] throwableArray12 = invalidBookingActionException1.getSuppressed();
        java.lang.String str13 = invalidBookingActionException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.InvalidBookingActionException: " + "'", str13, "scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.String str12 = roomUnavailableException8.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "scheduler.exception.RoomUnavailableException: " + "'", str12, "scheduler.exception.RoomUnavailableException: ");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.String str5 = roomUnavailableException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: " + "'", str5, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray23 = invalidBookingActionException22.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException25 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException27 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException25.addSuppressed((java.lang.Throwable) roomUnavailableException27);
        java.lang.Throwable[] throwableArray29 = roomUnavailableException25.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException31 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException31.addSuppressed((java.lang.Throwable) bookingException33);
        roomUnavailableException25.addSuppressed((java.lang.Throwable) bookingException33);
        invalidBookingActionException22.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        bookingException9.addSuppressed((java.lang.Throwable) roomUnavailableException25);
        java.lang.String str38 = bookingException9.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str38, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: ");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Class<?> wildcardClass5 = invalidBookingActionException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        java.lang.Throwable[] throwableArray6 = roomUnavailableException4.getSuppressed();
        java.lang.String str7 = roomUnavailableException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str7, "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Class<?> wildcardClass2 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException4 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException6.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException4.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        java.lang.Throwable[] throwableArray12 = invalidBookingActionException1.getSuppressed();
        java.lang.Throwable[] throwableArray13 = invalidBookingActionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: hi!");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: hi!" + "'", str2, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        java.lang.String str51 = bookingException42.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str51, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        java.lang.String str16 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.BookingException: " + "'", str16, "scheduler.exception.BookingException: ");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            invalidBookingActionException6.addSuppressed(throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException6.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException11 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray12 = invalidBookingActionException11.getSuppressed();
        invalidBookingActionException8.addSuppressed((java.lang.Throwable) invalidBookingActionException11);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException15 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException19 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        invalidBookingActionException15.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        invalidBookingActionException11.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        java.lang.Throwable[] throwableArray28 = bookingException26.getSuppressed();
        java.lang.Throwable[] throwableArray29 = bookingException26.getSuppressed();
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("");
        bookingException31.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException36 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException31.addSuppressed((java.lang.Throwable) invalidBookingActionException36);
        bookingException26.addSuppressed((java.lang.Throwable) bookingException31);
        invalidBookingActionException11.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.RoomUnavailableException roomUnavailableException41 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException43 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException41.addSuppressed((java.lang.Throwable) roomUnavailableException43);
        java.lang.Throwable[] throwableArray45 = roomUnavailableException41.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException47 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException49 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException47.addSuppressed((java.lang.Throwable) bookingException49);
        roomUnavailableException41.addSuppressed((java.lang.Throwable) bookingException49);
        invalidBookingActionException11.addSuppressed((java.lang.Throwable) bookingException49);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) invalidBookingActionException11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertArrayEquals(throwableArray29, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.RoomUnavailableException roomUnavailableException22 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray23 = roomUnavailableException22.getSuppressed();
        bookingException9.addSuppressed((java.lang.Throwable) roomUnavailableException22);
        java.lang.Throwable[] throwableArray25 = bookingException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        java.lang.Throwable[] throwableArray17 = bookingException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = bookingException15.getSuppressed();
        scheduler.exception.BookingException bookingException20 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("");
        bookingException20.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException25 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException20.addSuppressed((java.lang.Throwable) invalidBookingActionException25);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException20);
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException20.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("");
        bookingException38.addSuppressed((java.lang.Throwable) bookingException40);
        java.lang.Throwable[] throwableArray42 = bookingException40.getSuppressed();
        java.lang.Throwable[] throwableArray43 = bookingException40.getSuppressed();
        scheduler.exception.BookingException bookingException45 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("");
        bookingException45.addSuppressed((java.lang.Throwable) bookingException47);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException50 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException45.addSuppressed((java.lang.Throwable) invalidBookingActionException50);
        bookingException40.addSuppressed((java.lang.Throwable) bookingException45);
        scheduler.exception.BookingException bookingException54 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException56 = new scheduler.exception.BookingException("");
        bookingException54.addSuppressed((java.lang.Throwable) bookingException56);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException59 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException54.addSuppressed((java.lang.Throwable) invalidBookingActionException59);
        bookingException45.addSuppressed((java.lang.Throwable) bookingException54);
        bookingException29.addSuppressed((java.lang.Throwable) bookingException54);
        scheduler.exception.BookingException bookingException64 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException66 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException64.addSuppressed((java.lang.Throwable) invalidBookingActionException66);
        java.lang.Throwable[] throwableArray68 = invalidBookingActionException66.getSuppressed();
        bookingException54.addSuppressed((java.lang.Throwable) invalidBookingActionException66);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException54);
        java.lang.Class<?> wildcardClass71 = bookingException54.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertArrayEquals(throwableArray17, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertArrayEquals(throwableArray42, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertArrayEquals(throwableArray43, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertArrayEquals(throwableArray68, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: ");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
        java.lang.Class<?> wildcardClass2 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Class<?> wildcardClass2 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.String str11 = bookingException1.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "scheduler.exception.BookingException: " + "'", str11, "scheduler.exception.BookingException: ");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        java.lang.String str16 = bookingException8.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str16, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = roomUnavailableException52.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException52);
        java.lang.String str55 = roomUnavailableException52.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str55, "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException14 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException12.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        invalidBookingActionException10.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        java.lang.String str18 = invalidBookingActionException14.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str18, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
        java.lang.Class<?> wildcardClass2 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray18 = invalidBookingActionException17.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        java.lang.Throwable[] throwableArray20 = invalidBookingActionException17.getSuppressed();
        java.lang.Class<?> wildcardClass21 = throwableArray20.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        java.lang.Throwable[] throwableArray16 = invalidBookingActionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException12 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException10.addSuppressed((java.lang.Throwable) invalidBookingActionException12);
        java.lang.Throwable[] throwableArray14 = bookingException10.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: ");
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        java.lang.String str19 = invalidBookingActionException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str19, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        java.lang.Class<?> wildcardClass6 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException12 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray13 = roomUnavailableException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = roomUnavailableException12.getSuppressed();
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("");
        bookingException16.addSuppressed((java.lang.Throwable) bookingException18);
        java.lang.Throwable[] throwableArray20 = bookingException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = bookingException18.getSuppressed();
        scheduler.exception.BookingException bookingException23 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("");
        bookingException23.addSuppressed((java.lang.Throwable) bookingException25);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException23.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        bookingException18.addSuppressed((java.lang.Throwable) bookingException23);
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException34 = new scheduler.exception.BookingException("");
        bookingException32.addSuppressed((java.lang.Throwable) bookingException34);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException37 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException32.addSuppressed((java.lang.Throwable) invalidBookingActionException37);
        bookingException23.addSuppressed((java.lang.Throwable) bookingException32);
        scheduler.exception.BookingException bookingException41 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException43 = new scheduler.exception.BookingException("");
        bookingException41.addSuppressed((java.lang.Throwable) bookingException43);
        java.lang.Throwable[] throwableArray45 = bookingException43.getSuppressed();
        java.lang.Throwable[] throwableArray46 = bookingException43.getSuppressed();
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException50 = new scheduler.exception.BookingException("");
        bookingException48.addSuppressed((java.lang.Throwable) bookingException50);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException53 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException48.addSuppressed((java.lang.Throwable) invalidBookingActionException53);
        bookingException43.addSuppressed((java.lang.Throwable) bookingException48);
        scheduler.exception.BookingException bookingException57 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException59 = new scheduler.exception.BookingException("");
        bookingException57.addSuppressed((java.lang.Throwable) bookingException59);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException62 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException57.addSuppressed((java.lang.Throwable) invalidBookingActionException62);
        bookingException48.addSuppressed((java.lang.Throwable) bookingException57);
        bookingException32.addSuppressed((java.lang.Throwable) bookingException57);
        roomUnavailableException12.addSuppressed((java.lang.Throwable) bookingException57);
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException12);
        java.lang.String str68 = roomUnavailableException12.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertArrayEquals(throwableArray45, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str68, "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException16.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        java.lang.Throwable[] throwableArray20 = invalidBookingActionException18.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        java.lang.Class<?> wildcardClass22 = invalidBookingActionException18.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray18 = invalidBookingActionException17.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        java.lang.String str20 = invalidBookingActionException17.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "scheduler.exception.InvalidBookingActionException: " + "'", str20, "scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.RoomUnavailableException roomUnavailableException34 = new scheduler.exception.RoomUnavailableException("hi!");
        java.lang.Throwable[] throwableArray35 = roomUnavailableException34.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException34);
        java.lang.String str37 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "scheduler.exception.BookingException: " + "'", str37, "scheduler.exception.BookingException: ");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = roomUnavailableException52.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException52);
        scheduler.exception.RoomUnavailableException roomUnavailableException56 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException58 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException56.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        java.lang.Throwable[] throwableArray60 = roomUnavailableException56.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException62 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException64 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException62.addSuppressed((java.lang.Throwable) bookingException64);
        roomUnavailableException56.addSuppressed((java.lang.Throwable) bookingException64);
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException56);
        java.lang.String str68 = bookingException17.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str68, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.RoomUnavailableException roomUnavailableException40 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException44 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException44);
        scheduler.exception.RoomUnavailableException roomUnavailableException47 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException49 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException47.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        java.lang.Throwable[] throwableArray51 = roomUnavailableException49.getSuppressed();
        bookingException42.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        java.lang.Throwable[] throwableArray53 = roomUnavailableException49.getSuppressed();
        roomUnavailableException40.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        bookingException29.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        scheduler.exception.RoomUnavailableException roomUnavailableException57 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException59 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException61 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException59.addSuppressed((java.lang.Throwable) invalidBookingActionException61);
        scheduler.exception.RoomUnavailableException roomUnavailableException64 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException66 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException64.addSuppressed((java.lang.Throwable) roomUnavailableException66);
        java.lang.Throwable[] throwableArray68 = roomUnavailableException66.getSuppressed();
        bookingException59.addSuppressed((java.lang.Throwable) roomUnavailableException66);
        java.lang.Throwable[] throwableArray70 = roomUnavailableException66.getSuppressed();
        roomUnavailableException57.addSuppressed((java.lang.Throwable) roomUnavailableException66);
        scheduler.exception.BookingException bookingException73 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException75 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException73.addSuppressed((java.lang.Throwable) roomUnavailableException75);
        java.lang.Throwable[] throwableArray77 = bookingException73.getSuppressed();
        roomUnavailableException66.addSuppressed((java.lang.Throwable) bookingException73);
        scheduler.exception.RoomUnavailableException roomUnavailableException80 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.BookingException: ");
        roomUnavailableException66.addSuppressed((java.lang.Throwable) roomUnavailableException80);
        bookingException29.addSuppressed((java.lang.Throwable) roomUnavailableException80);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertArrayEquals(throwableArray51, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertArrayEquals(throwableArray68, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertArrayEquals(throwableArray70, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray77);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException5 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException5);
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        java.lang.Throwable[] throwableArray37 = bookingException35.getSuppressed();
        java.lang.Throwable[] throwableArray38 = bookingException35.getSuppressed();
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("");
        bookingException40.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException45 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException40.addSuppressed((java.lang.Throwable) invalidBookingActionException45);
        bookingException35.addSuppressed((java.lang.Throwable) bookingException40);
        scheduler.exception.BookingException bookingException49 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException51 = new scheduler.exception.BookingException("");
        bookingException49.addSuppressed((java.lang.Throwable) bookingException51);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException54 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException49.addSuppressed((java.lang.Throwable) invalidBookingActionException54);
        bookingException40.addSuppressed((java.lang.Throwable) bookingException49);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException49);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException49);
        java.lang.Throwable[] throwableArray59 = bookingException3.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertArrayEquals(throwableArray37, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertArrayEquals(throwableArray38, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException16.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        java.lang.Throwable[] throwableArray20 = invalidBookingActionException18.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        java.lang.Throwable[] throwableArray22 = invalidBookingActionException18.getSuppressed();
        java.lang.Class<?> wildcardClass23 = throwableArray22.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray4 = invalidBookingActionException3.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException16 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray17 = invalidBookingActionException16.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException19 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException21 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException19.addSuppressed((java.lang.Throwable) roomUnavailableException21);
        java.lang.Throwable[] throwableArray23 = roomUnavailableException19.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException25 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException27 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException25.addSuppressed((java.lang.Throwable) bookingException27);
        roomUnavailableException19.addSuppressed((java.lang.Throwable) bookingException27);
        invalidBookingActionException16.addSuppressed((java.lang.Throwable) roomUnavailableException19);
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException32.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        scheduler.exception.RoomUnavailableException roomUnavailableException37 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException39 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException37.addSuppressed((java.lang.Throwable) roomUnavailableException39);
        java.lang.Throwable[] throwableArray41 = roomUnavailableException39.getSuppressed();
        bookingException32.addSuppressed((java.lang.Throwable) roomUnavailableException39);
        java.lang.Throwable[] throwableArray43 = roomUnavailableException39.getSuppressed();
        roomUnavailableException19.addSuppressed((java.lang.Throwable) roomUnavailableException39);
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException39);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertArrayEquals(throwableArray17, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertArrayEquals(throwableArray41, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertArrayEquals(throwableArray43, new java.lang.Throwable[] {});
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray32 = invalidBookingActionException31.getSuppressed();
        invalidBookingActionException28.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException35.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        java.lang.String str44 = invalidBookingActionException31.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str44, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.String str5 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str5, "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = roomUnavailableException52.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException52);
        scheduler.exception.RoomUnavailableException roomUnavailableException56 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException58 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException56.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException62 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray63 = invalidBookingActionException62.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException65 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException67 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException69 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException67.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        invalidBookingActionException65.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        invalidBookingActionException62.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        java.lang.Class<?> wildcardClass74 = invalidBookingActionException69.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertArrayEquals(throwableArray63, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.String str6 = bookingException1.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str6, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException52 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = invalidBookingActionException52.getSuppressed();
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException52);
        java.lang.Throwable[] throwableArray55 = bookingException42.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray14 = roomUnavailableException10.getSuppressed();
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray16 = roomUnavailableException10.getSuppressed();
        java.lang.Class<?> wildcardClass17 = throwableArray16.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException7.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.RoomUnavailableException roomUnavailableException12 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException14 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException12.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray16 = roomUnavailableException14.getSuppressed();
        bookingException7.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray18 = roomUnavailableException14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = roomUnavailableException14.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray21 = roomUnavailableException14.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        java.lang.Throwable[] throwableArray17 = bookingException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = bookingException15.getSuppressed();
        scheduler.exception.BookingException bookingException20 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("");
        bookingException20.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException25 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException20.addSuppressed((java.lang.Throwable) invalidBookingActionException25);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException20);
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException20.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("");
        bookingException38.addSuppressed((java.lang.Throwable) bookingException40);
        java.lang.Throwable[] throwableArray42 = bookingException40.getSuppressed();
        java.lang.Throwable[] throwableArray43 = bookingException40.getSuppressed();
        scheduler.exception.BookingException bookingException45 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("");
        bookingException45.addSuppressed((java.lang.Throwable) bookingException47);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException50 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException45.addSuppressed((java.lang.Throwable) invalidBookingActionException50);
        bookingException40.addSuppressed((java.lang.Throwable) bookingException45);
        scheduler.exception.BookingException bookingException54 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException56 = new scheduler.exception.BookingException("");
        bookingException54.addSuppressed((java.lang.Throwable) bookingException56);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException59 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException54.addSuppressed((java.lang.Throwable) invalidBookingActionException59);
        bookingException45.addSuppressed((java.lang.Throwable) bookingException54);
        bookingException29.addSuppressed((java.lang.Throwable) bookingException54);
        scheduler.exception.BookingException bookingException64 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException66 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException64.addSuppressed((java.lang.Throwable) invalidBookingActionException66);
        java.lang.Throwable[] throwableArray68 = invalidBookingActionException66.getSuppressed();
        bookingException54.addSuppressed((java.lang.Throwable) invalidBookingActionException66);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException54);
        java.lang.Throwable[] throwableArray71 = bookingException54.getSuppressed();
        scheduler.exception.BookingException bookingException73 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException75 = new scheduler.exception.BookingException("");
        bookingException73.addSuppressed((java.lang.Throwable) bookingException75);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException78 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException73.addSuppressed((java.lang.Throwable) invalidBookingActionException78);
        bookingException54.addSuppressed((java.lang.Throwable) bookingException73);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertArrayEquals(throwableArray17, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertArrayEquals(throwableArray42, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertArrayEquals(throwableArray43, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertArrayEquals(throwableArray68, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray71);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: ");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.String str5 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.RoomUnavailableException: " + "'", str5, "scheduler.exception.RoomUnavailableException: ");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.String str2 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str2, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("");
        bookingException6.addSuppressed((java.lang.Throwable) bookingException8);
        java.lang.Throwable[] throwableArray10 = bookingException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = bookingException8.getSuppressed();
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException27 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException22.addSuppressed((java.lang.Throwable) invalidBookingActionException27);
        bookingException13.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("");
        bookingException31.addSuppressed((java.lang.Throwable) bookingException33);
        java.lang.Throwable[] throwableArray35 = bookingException33.getSuppressed();
        java.lang.Throwable[] throwableArray36 = bookingException33.getSuppressed();
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("");
        bookingException38.addSuppressed((java.lang.Throwable) bookingException40);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException43 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException38.addSuppressed((java.lang.Throwable) invalidBookingActionException43);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException38);
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException49 = new scheduler.exception.BookingException("");
        bookingException47.addSuppressed((java.lang.Throwable) bookingException49);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException52 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException47.addSuppressed((java.lang.Throwable) invalidBookingActionException52);
        bookingException38.addSuppressed((java.lang.Throwable) bookingException47);
        bookingException22.addSuppressed((java.lang.Throwable) bookingException47);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException47);
        java.lang.Class<?> wildcardClass57 = bookingException47.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertArrayEquals(throwableArray36, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = roomUnavailableException52.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException52);
        scheduler.exception.BookingException bookingException56 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException58 = new scheduler.exception.BookingException("");
        bookingException56.addSuppressed((java.lang.Throwable) bookingException58);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException61 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException56.addSuppressed((java.lang.Throwable) invalidBookingActionException61);
        roomUnavailableException52.addSuppressed((java.lang.Throwable) bookingException56);
        java.lang.Class<?> wildcardClass64 = bookingException56.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str2, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Class<?> wildcardClass13 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.RoomUnavailableException roomUnavailableException40 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException44 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException44);
        scheduler.exception.RoomUnavailableException roomUnavailableException47 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException49 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException47.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        java.lang.Throwable[] throwableArray51 = roomUnavailableException49.getSuppressed();
        bookingException42.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        java.lang.Throwable[] throwableArray53 = roomUnavailableException49.getSuppressed();
        roomUnavailableException40.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        bookingException29.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        java.lang.Class<?> wildcardClass56 = roomUnavailableException49.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertArrayEquals(throwableArray51, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray32 = invalidBookingActionException31.getSuppressed();
        invalidBookingActionException28.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException35.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException45 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray46 = invalidBookingActionException45.getSuppressed();
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException45);
        java.lang.Class<?> wildcardClass48 = invalidBookingActionException45.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray32 = invalidBookingActionException31.getSuppressed();
        invalidBookingActionException28.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException35.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException45 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray46 = invalidBookingActionException45.getSuppressed();
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException45);
        java.lang.String str48 = invalidBookingActionException45.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "scheduler.exception.InvalidBookingActionException: " + "'", str48, "scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: hi!");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray18 = invalidBookingActionException17.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException21 = new scheduler.exception.BookingException("scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException23 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("");
        bookingException23.addSuppressed((java.lang.Throwable) bookingException25);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException23.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        bookingException21.addSuppressed((java.lang.Throwable) bookingException23);
        invalidBookingActionException17.addSuppressed((java.lang.Throwable) bookingException21);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("");
        bookingException4.addSuppressed((java.lang.Throwable) bookingException6);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException6);
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingException6.addSuppressed(throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray13 = roomUnavailableException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!");
        java.lang.String str2 = invalidBookingActionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!" + "'", str2, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray32 = invalidBookingActionException31.getSuppressed();
        invalidBookingActionException28.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException35.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException45 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray46 = invalidBookingActionException45.getSuppressed();
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException45);
        java.lang.Throwable throwable48 = null;
        // The following exception was thrown during execution in test generation
        try {
            invalidBookingActionException31.addSuppressed(throwable48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("");
        bookingException5.addSuppressed((java.lang.Throwable) bookingException7);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException5.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException14 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray15 = roomUnavailableException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = roomUnavailableException14.getSuppressed();
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException20 = new scheduler.exception.BookingException("");
        bookingException18.addSuppressed((java.lang.Throwable) bookingException20);
        java.lang.Throwable[] throwableArray22 = bookingException20.getSuppressed();
        java.lang.Throwable[] throwableArray23 = bookingException20.getSuppressed();
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException27 = new scheduler.exception.BookingException("");
        bookingException25.addSuppressed((java.lang.Throwable) bookingException27);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException30 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException25.addSuppressed((java.lang.Throwable) invalidBookingActionException30);
        bookingException20.addSuppressed((java.lang.Throwable) bookingException25);
        scheduler.exception.BookingException bookingException34 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException36 = new scheduler.exception.BookingException("");
        bookingException34.addSuppressed((java.lang.Throwable) bookingException36);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException34.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException25.addSuppressed((java.lang.Throwable) bookingException34);
        scheduler.exception.BookingException bookingException43 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException45 = new scheduler.exception.BookingException("");
        bookingException43.addSuppressed((java.lang.Throwable) bookingException45);
        java.lang.Throwable[] throwableArray47 = bookingException45.getSuppressed();
        java.lang.Throwable[] throwableArray48 = bookingException45.getSuppressed();
        scheduler.exception.BookingException bookingException50 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException52 = new scheduler.exception.BookingException("");
        bookingException50.addSuppressed((java.lang.Throwable) bookingException52);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException55 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException50.addSuppressed((java.lang.Throwable) invalidBookingActionException55);
        bookingException45.addSuppressed((java.lang.Throwable) bookingException50);
        scheduler.exception.BookingException bookingException59 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException61 = new scheduler.exception.BookingException("");
        bookingException59.addSuppressed((java.lang.Throwable) bookingException61);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException64 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException59.addSuppressed((java.lang.Throwable) invalidBookingActionException64);
        bookingException50.addSuppressed((java.lang.Throwable) bookingException59);
        bookingException34.addSuppressed((java.lang.Throwable) bookingException59);
        roomUnavailableException14.addSuppressed((java.lang.Throwable) bookingException59);
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray71 = roomUnavailableException14.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertArrayEquals(throwableArray47, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertArrayEquals(throwableArray48, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray71);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Class<?> wildcardClass5 = invalidBookingActionException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray4 = invalidBookingActionException3.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.String str15 = bookingException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str15, "scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        java.lang.String str39 = invalidBookingActionException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "scheduler.exception.InvalidBookingActionException: " + "'", str39, "scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException12 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException10.addSuppressed((java.lang.Throwable) invalidBookingActionException12);
        java.lang.Throwable[] throwableArray14 = bookingException10.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: ");
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        java.lang.String str19 = invalidBookingActionException17.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: " + "'", str19, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        java.lang.Throwable[] throwableArray19 = bookingException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = bookingException17.getSuppressed();
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException27 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException22.addSuppressed((java.lang.Throwable) invalidBookingActionException27);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("");
        bookingException31.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException36 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException31.addSuppressed((java.lang.Throwable) invalidBookingActionException36);
        bookingException22.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.BookingException bookingException40 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("");
        bookingException40.addSuppressed((java.lang.Throwable) bookingException42);
        java.lang.Throwable[] throwableArray44 = bookingException42.getSuppressed();
        java.lang.Throwable[] throwableArray45 = bookingException42.getSuppressed();
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException49 = new scheduler.exception.BookingException("");
        bookingException47.addSuppressed((java.lang.Throwable) bookingException49);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException52 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException47.addSuppressed((java.lang.Throwable) invalidBookingActionException52);
        bookingException42.addSuppressed((java.lang.Throwable) bookingException47);
        scheduler.exception.BookingException bookingException56 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException58 = new scheduler.exception.BookingException("");
        bookingException56.addSuppressed((java.lang.Throwable) bookingException58);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException61 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException56.addSuppressed((java.lang.Throwable) invalidBookingActionException61);
        bookingException47.addSuppressed((java.lang.Throwable) bookingException56);
        bookingException31.addSuppressed((java.lang.Throwable) bookingException56);
        scheduler.exception.BookingException bookingException66 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException68 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException66.addSuppressed((java.lang.Throwable) invalidBookingActionException68);
        java.lang.Throwable[] throwableArray70 = invalidBookingActionException68.getSuppressed();
        bookingException56.addSuppressed((java.lang.Throwable) invalidBookingActionException68);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException56);
        java.lang.Throwable[] throwableArray73 = bookingException3.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertArrayEquals(throwableArray44, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertArrayEquals(throwableArray45, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertArrayEquals(throwableArray70, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.RoomUnavailableException roomUnavailableException34 = new scheduler.exception.RoomUnavailableException("hi!");
        java.lang.Throwable[] throwableArray35 = roomUnavailableException34.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException34);
        java.lang.Class<?> wildcardClass37 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        java.lang.String str9 = invalidBookingActionException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str9, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.RoomUnavailableException roomUnavailableException40 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException44 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException44);
        scheduler.exception.RoomUnavailableException roomUnavailableException47 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException49 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException47.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        java.lang.Throwable[] throwableArray51 = roomUnavailableException49.getSuppressed();
        bookingException42.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        java.lang.Throwable[] throwableArray53 = roomUnavailableException49.getSuppressed();
        roomUnavailableException40.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        bookingException29.addSuppressed((java.lang.Throwable) roomUnavailableException49);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException57 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray58 = invalidBookingActionException57.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException60 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException62 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException60.addSuppressed((java.lang.Throwable) roomUnavailableException62);
        java.lang.Throwable[] throwableArray64 = roomUnavailableException60.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException66 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException68 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException66.addSuppressed((java.lang.Throwable) bookingException68);
        roomUnavailableException60.addSuppressed((java.lang.Throwable) bookingException68);
        invalidBookingActionException57.addSuppressed((java.lang.Throwable) roomUnavailableException60);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException73 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray74 = invalidBookingActionException73.getSuppressed();
        roomUnavailableException60.addSuppressed((java.lang.Throwable) invalidBookingActionException73);
        java.lang.Throwable[] throwableArray76 = invalidBookingActionException73.getSuppressed();
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException73);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertArrayEquals(throwableArray51, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertArrayEquals(throwableArray58, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertArrayEquals(throwableArray74, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertArrayEquals(throwableArray76, new java.lang.Throwable[] {});
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray11 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray12 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException7.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.RoomUnavailableException roomUnavailableException12 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException14 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException12.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray16 = roomUnavailableException14.getSuppressed();
        bookingException7.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.Throwable[] throwableArray18 = roomUnavailableException14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = roomUnavailableException14.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.String str21 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str21, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Class<?> wildcardClass2 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: ");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.String str5 = invalidBookingActionException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: " + "'", str5, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException1.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("");
        bookingException10.addSuppressed((java.lang.Throwable) bookingException12);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException15 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException10.addSuppressed((java.lang.Throwable) invalidBookingActionException15);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("hi!");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        java.lang.Class<?> wildcardClass22 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("");
        bookingException4.addSuppressed((java.lang.Throwable) bookingException6);
        java.lang.Throwable[] throwableArray8 = bookingException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = bookingException6.getSuppressed();
        scheduler.exception.BookingException bookingException11 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("");
        bookingException11.addSuppressed((java.lang.Throwable) bookingException13);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException16 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException11.addSuppressed((java.lang.Throwable) invalidBookingActionException16);
        bookingException6.addSuppressed((java.lang.Throwable) bookingException11);
        scheduler.exception.BookingException bookingException20 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("");
        bookingException20.addSuppressed((java.lang.Throwable) bookingException22);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException25 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException20.addSuppressed((java.lang.Throwable) invalidBookingActionException25);
        bookingException11.addSuppressed((java.lang.Throwable) bookingException20);
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        java.lang.Throwable[] throwableArray33 = bookingException31.getSuppressed();
        java.lang.Throwable[] throwableArray34 = bookingException31.getSuppressed();
        scheduler.exception.BookingException bookingException36 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("");
        bookingException36.addSuppressed((java.lang.Throwable) bookingException38);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException41 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException36.addSuppressed((java.lang.Throwable) invalidBookingActionException41);
        bookingException31.addSuppressed((java.lang.Throwable) bookingException36);
        scheduler.exception.BookingException bookingException45 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("");
        bookingException45.addSuppressed((java.lang.Throwable) bookingException47);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException50 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException45.addSuppressed((java.lang.Throwable) invalidBookingActionException50);
        bookingException36.addSuppressed((java.lang.Throwable) bookingException45);
        bookingException20.addSuppressed((java.lang.Throwable) bookingException45);
        scheduler.exception.RoomUnavailableException roomUnavailableException55 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray56 = roomUnavailableException55.getSuppressed();
        bookingException20.addSuppressed((java.lang.Throwable) roomUnavailableException55);
        scheduler.exception.RoomUnavailableException roomUnavailableException59 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException61 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException59.addSuppressed((java.lang.Throwable) roomUnavailableException61);
        java.lang.Throwable[] throwableArray63 = roomUnavailableException59.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException65 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException67 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException65.addSuppressed((java.lang.Throwable) bookingException67);
        roomUnavailableException59.addSuppressed((java.lang.Throwable) bookingException67);
        bookingException20.addSuppressed((java.lang.Throwable) roomUnavailableException59);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException20);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertArrayEquals(throwableArray33, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertArrayEquals(throwableArray34, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertArrayEquals(throwableArray56, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray18 = invalidBookingActionException17.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.RoomUnavailableException roomUnavailableException21 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray22 = roomUnavailableException21.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException21);
        java.lang.String str24 = roomUnavailableException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: " + "'", str24, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException19 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        scheduler.exception.RoomUnavailableException roomUnavailableException22 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException24 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException22.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.Throwable[] throwableArray26 = roomUnavailableException24.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.Throwable[] throwableArray28 = roomUnavailableException24.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.String str30 = roomUnavailableException24.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "scheduler.exception.RoomUnavailableException: " + "'", str30, "scheduler.exception.RoomUnavailableException: ");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.RoomUnavailableException roomUnavailableException34 = new scheduler.exception.RoomUnavailableException("hi!");
        java.lang.Throwable[] throwableArray35 = roomUnavailableException34.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException34);
        scheduler.exception.RoomUnavailableException roomUnavailableException38 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        roomUnavailableException34.addSuppressed((java.lang.Throwable) roomUnavailableException38);
        java.lang.Class<?> wildcardClass40 = roomUnavailableException38.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        java.lang.String str6 = roomUnavailableException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str6, "scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomUnavailableException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException4 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException6.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException4.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        scheduler.exception.RoomUnavailableException roomUnavailableException13 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException15 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException13.addSuppressed((java.lang.Throwable) roomUnavailableException15);
        java.lang.Throwable[] throwableArray17 = roomUnavailableException13.getSuppressed();
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException13);
        scheduler.exception.BookingException bookingException20 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException22 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException20.addSuppressed((java.lang.Throwable) roomUnavailableException22);
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException27 = new scheduler.exception.BookingException("");
        bookingException25.addSuppressed((java.lang.Throwable) bookingException27);
        java.lang.Throwable[] throwableArray29 = bookingException27.getSuppressed();
        java.lang.Throwable[] throwableArray30 = bookingException27.getSuppressed();
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException34 = new scheduler.exception.BookingException("");
        bookingException32.addSuppressed((java.lang.Throwable) bookingException34);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException37 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException32.addSuppressed((java.lang.Throwable) invalidBookingActionException37);
        bookingException27.addSuppressed((java.lang.Throwable) bookingException32);
        scheduler.exception.BookingException bookingException41 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException43 = new scheduler.exception.BookingException("");
        bookingException41.addSuppressed((java.lang.Throwable) bookingException43);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException46 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException41.addSuppressed((java.lang.Throwable) invalidBookingActionException46);
        bookingException32.addSuppressed((java.lang.Throwable) bookingException41);
        scheduler.exception.BookingException bookingException50 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException52 = new scheduler.exception.BookingException("");
        bookingException50.addSuppressed((java.lang.Throwable) bookingException52);
        java.lang.Throwable[] throwableArray54 = bookingException52.getSuppressed();
        java.lang.Throwable[] throwableArray55 = bookingException52.getSuppressed();
        scheduler.exception.BookingException bookingException57 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException59 = new scheduler.exception.BookingException("");
        bookingException57.addSuppressed((java.lang.Throwable) bookingException59);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException62 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException57.addSuppressed((java.lang.Throwable) invalidBookingActionException62);
        bookingException52.addSuppressed((java.lang.Throwable) bookingException57);
        scheduler.exception.BookingException bookingException66 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException68 = new scheduler.exception.BookingException("");
        bookingException66.addSuppressed((java.lang.Throwable) bookingException68);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException71 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException66.addSuppressed((java.lang.Throwable) invalidBookingActionException71);
        bookingException57.addSuppressed((java.lang.Throwable) bookingException66);
        bookingException41.addSuppressed((java.lang.Throwable) bookingException66);
        bookingException20.addSuppressed((java.lang.Throwable) bookingException66);
        java.lang.Throwable[] throwableArray76 = bookingException20.getSuppressed();
        roomUnavailableException13.addSuppressed((java.lang.Throwable) bookingException20);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertArrayEquals(throwableArray29, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertArrayEquals(throwableArray54, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertArrayEquals(throwableArray55, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray76);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException5 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException3.addSuppressed((java.lang.Throwable) roomUnavailableException5);
        java.lang.Throwable[] throwableArray7 = roomUnavailableException3.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException9 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException11 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException9.addSuppressed((java.lang.Throwable) bookingException11);
        roomUnavailableException3.addSuppressed((java.lang.Throwable) roomUnavailableException9);
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException9);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException6.getSuppressed();
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException14 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException12.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        invalidBookingActionException10.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException21 = new scheduler.exception.BookingException("");
        bookingException19.addSuppressed((java.lang.Throwable) bookingException21);
        java.lang.Throwable[] throwableArray23 = bookingException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = bookingException21.getSuppressed();
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        bookingException21.addSuppressed((java.lang.Throwable) bookingException26);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.RoomUnavailableException roomUnavailableException36 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException38 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException36.addSuppressed((java.lang.Throwable) roomUnavailableException38);
        java.lang.Throwable[] throwableArray40 = roomUnavailableException36.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException42 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException42.addSuppressed((java.lang.Throwable) bookingException44);
        roomUnavailableException36.addSuppressed((java.lang.Throwable) bookingException44);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.BookingException bookingException49 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException51 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException49.addSuppressed((java.lang.Throwable) invalidBookingActionException51);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException54 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray55 = invalidBookingActionException54.getSuppressed();
        invalidBookingActionException51.addSuppressed((java.lang.Throwable) invalidBookingActionException54);
        scheduler.exception.BookingException bookingException58 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException60 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException58.addSuppressed((java.lang.Throwable) invalidBookingActionException60);
        java.lang.Throwable[] throwableArray62 = bookingException58.getSuppressed();
        invalidBookingActionException54.addSuppressed((java.lang.Throwable) bookingException58);
        bookingException44.addSuppressed((java.lang.Throwable) invalidBookingActionException54);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertArrayEquals(throwableArray55, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        java.lang.Throwable[] throwableArray7 = invalidBookingActionException5.getSuppressed();
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        java.lang.String str9 = invalidBookingActionException5.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str9, "scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException12 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray13 = roomUnavailableException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = roomUnavailableException12.getSuppressed();
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("");
        bookingException16.addSuppressed((java.lang.Throwable) bookingException18);
        java.lang.Throwable[] throwableArray20 = bookingException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = bookingException18.getSuppressed();
        scheduler.exception.BookingException bookingException23 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("");
        bookingException23.addSuppressed((java.lang.Throwable) bookingException25);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException23.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        bookingException18.addSuppressed((java.lang.Throwable) bookingException23);
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException34 = new scheduler.exception.BookingException("");
        bookingException32.addSuppressed((java.lang.Throwable) bookingException34);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException37 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException32.addSuppressed((java.lang.Throwable) invalidBookingActionException37);
        bookingException23.addSuppressed((java.lang.Throwable) bookingException32);
        scheduler.exception.BookingException bookingException41 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException43 = new scheduler.exception.BookingException("");
        bookingException41.addSuppressed((java.lang.Throwable) bookingException43);
        java.lang.Throwable[] throwableArray45 = bookingException43.getSuppressed();
        java.lang.Throwable[] throwableArray46 = bookingException43.getSuppressed();
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException50 = new scheduler.exception.BookingException("");
        bookingException48.addSuppressed((java.lang.Throwable) bookingException50);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException53 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException48.addSuppressed((java.lang.Throwable) invalidBookingActionException53);
        bookingException43.addSuppressed((java.lang.Throwable) bookingException48);
        scheduler.exception.BookingException bookingException57 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException59 = new scheduler.exception.BookingException("");
        bookingException57.addSuppressed((java.lang.Throwable) bookingException59);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException62 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException57.addSuppressed((java.lang.Throwable) invalidBookingActionException62);
        bookingException48.addSuppressed((java.lang.Throwable) bookingException57);
        bookingException32.addSuppressed((java.lang.Throwable) bookingException57);
        roomUnavailableException12.addSuppressed((java.lang.Throwable) bookingException57);
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException12);
        scheduler.exception.BookingException bookingException69 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException69);
        java.lang.Throwable[] throwableArray71 = bookingException69.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertArrayEquals(throwableArray45, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertArrayEquals(throwableArray71, new java.lang.Throwable[] {});
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray4 = roomUnavailableException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = roomUnavailableException3.getSuppressed();
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.String str7 = roomUnavailableException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str7, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        java.lang.Throwable[] throwableArray7 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray8 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException14 = new scheduler.exception.BookingException("");
        bookingException12.addSuppressed((java.lang.Throwable) bookingException14);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException12.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException12);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("hi!");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException4 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray5 = invalidBookingActionException4.getSuppressed();
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException4);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray7 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray8 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException12 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray13 = roomUnavailableException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = roomUnavailableException12.getSuppressed();
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("");
        bookingException16.addSuppressed((java.lang.Throwable) bookingException18);
        java.lang.Throwable[] throwableArray20 = bookingException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = bookingException18.getSuppressed();
        scheduler.exception.BookingException bookingException23 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("");
        bookingException23.addSuppressed((java.lang.Throwable) bookingException25);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException23.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        bookingException18.addSuppressed((java.lang.Throwable) bookingException23);
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException34 = new scheduler.exception.BookingException("");
        bookingException32.addSuppressed((java.lang.Throwable) bookingException34);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException37 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException32.addSuppressed((java.lang.Throwable) invalidBookingActionException37);
        bookingException23.addSuppressed((java.lang.Throwable) bookingException32);
        scheduler.exception.BookingException bookingException41 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException43 = new scheduler.exception.BookingException("");
        bookingException41.addSuppressed((java.lang.Throwable) bookingException43);
        java.lang.Throwable[] throwableArray45 = bookingException43.getSuppressed();
        java.lang.Throwable[] throwableArray46 = bookingException43.getSuppressed();
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException50 = new scheduler.exception.BookingException("");
        bookingException48.addSuppressed((java.lang.Throwable) bookingException50);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException53 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException48.addSuppressed((java.lang.Throwable) invalidBookingActionException53);
        bookingException43.addSuppressed((java.lang.Throwable) bookingException48);
        scheduler.exception.BookingException bookingException57 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException59 = new scheduler.exception.BookingException("");
        bookingException57.addSuppressed((java.lang.Throwable) bookingException59);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException62 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException57.addSuppressed((java.lang.Throwable) invalidBookingActionException62);
        bookingException48.addSuppressed((java.lang.Throwable) bookingException57);
        bookingException32.addSuppressed((java.lang.Throwable) bookingException57);
        roomUnavailableException12.addSuppressed((java.lang.Throwable) bookingException57);
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException12);
        scheduler.exception.BookingException bookingException69 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException69);
        java.lang.Throwable[] throwableArray71 = bookingException1.getSuppressed();
        scheduler.exception.BookingException bookingException73 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException75 = new scheduler.exception.BookingException("");
        bookingException73.addSuppressed((java.lang.Throwable) bookingException75);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException78 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException73.addSuppressed((java.lang.Throwable) invalidBookingActionException78);
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException78);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertArrayEquals(throwableArray45, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertArrayEquals(throwableArray46, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray71);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = roomUnavailableException52.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException52);
        scheduler.exception.RoomUnavailableException roomUnavailableException56 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException58 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException56.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        java.lang.Throwable[] throwableArray60 = roomUnavailableException56.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException62 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException64 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException62.addSuppressed((java.lang.Throwable) bookingException64);
        roomUnavailableException56.addSuppressed((java.lang.Throwable) bookingException64);
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException56);
        java.lang.Throwable[] throwableArray68 = bookingException17.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray68);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: hi!");
        java.lang.Class<?> wildcardClass2 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.String str13 = bookingException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.BookingException: " + "'", str13, "scheduler.exception.BookingException: ");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray4 = invalidBookingActionException3.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray15 = bookingException1.getSuppressed();
        java.lang.String str16 = bookingException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str16, "scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("");
        bookingException7.addSuppressed((java.lang.Throwable) bookingException9);
        java.lang.Throwable[] throwableArray11 = bookingException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = bookingException9.getSuppressed();
        scheduler.exception.BookingException bookingException14 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("");
        bookingException14.addSuppressed((java.lang.Throwable) bookingException16);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException19 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException14.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException14);
        scheduler.exception.BookingException bookingException23 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("");
        bookingException23.addSuppressed((java.lang.Throwable) bookingException25);
        java.lang.Throwable[] throwableArray27 = bookingException25.getSuppressed();
        java.lang.Throwable[] throwableArray28 = bookingException25.getSuppressed();
        scheduler.exception.BookingException bookingException30 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("");
        bookingException30.addSuppressed((java.lang.Throwable) bookingException32);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException30.addSuppressed((java.lang.Throwable) invalidBookingActionException35);
        bookingException25.addSuppressed((java.lang.Throwable) bookingException30);
        scheduler.exception.BookingException bookingException39 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException41 = new scheduler.exception.BookingException("");
        bookingException39.addSuppressed((java.lang.Throwable) bookingException41);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException44 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException39.addSuppressed((java.lang.Throwable) invalidBookingActionException44);
        bookingException30.addSuppressed((java.lang.Throwable) bookingException39);
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException50 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException48.addSuppressed((java.lang.Throwable) invalidBookingActionException50);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException53 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray54 = invalidBookingActionException53.getSuppressed();
        invalidBookingActionException50.addSuppressed((java.lang.Throwable) invalidBookingActionException53);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException57 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException59 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException61 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException59.addSuppressed((java.lang.Throwable) invalidBookingActionException61);
        invalidBookingActionException57.addSuppressed((java.lang.Throwable) invalidBookingActionException61);
        invalidBookingActionException53.addSuppressed((java.lang.Throwable) invalidBookingActionException61);
        bookingException30.addSuppressed((java.lang.Throwable) invalidBookingActionException53);
        scheduler.exception.RoomUnavailableException roomUnavailableException67 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException69 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException67.addSuppressed((java.lang.Throwable) bookingException69);
        java.lang.Throwable[] throwableArray71 = bookingException69.getSuppressed();
        scheduler.exception.BookingException bookingException73 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException75 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException73.addSuppressed((java.lang.Throwable) invalidBookingActionException75);
        scheduler.exception.RoomUnavailableException roomUnavailableException78 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException80 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException78.addSuppressed((java.lang.Throwable) roomUnavailableException80);
        java.lang.Throwable[] throwableArray82 = roomUnavailableException80.getSuppressed();
        bookingException73.addSuppressed((java.lang.Throwable) roomUnavailableException80);
        java.lang.Throwable[] throwableArray84 = roomUnavailableException80.getSuppressed();
        java.lang.Throwable[] throwableArray85 = roomUnavailableException80.getSuppressed();
        bookingException69.addSuppressed((java.lang.Throwable) roomUnavailableException80);
        bookingException30.addSuppressed((java.lang.Throwable) bookingException69);
        bookingException14.addSuppressed((java.lang.Throwable) bookingException30);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException14);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertArrayEquals(throwableArray54, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertArrayEquals(throwableArray71, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertArrayEquals(throwableArray82, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertArrayEquals(throwableArray84, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertArrayEquals(throwableArray85, new java.lang.Throwable[] {});
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException4 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException6.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException4.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        java.lang.Class<?> wildcardClass12 = invalidBookingActionException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray11 = bookingException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray7 = bookingException1.getSuppressed();
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException11 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException9.addSuppressed((java.lang.Throwable) invalidBookingActionException11);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException14 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray15 = invalidBookingActionException14.getSuppressed();
        invalidBookingActionException11.addSuppressed((java.lang.Throwable) invalidBookingActionException14);
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException18.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        java.lang.Throwable[] throwableArray22 = bookingException18.getSuppressed();
        invalidBookingActionException14.addSuppressed((java.lang.Throwable) bookingException18);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException25 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: ");
        invalidBookingActionException14.addSuppressed((java.lang.Throwable) invalidBookingActionException25);
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException25);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass11 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.String str33 = bookingException24.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str33, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException13);
        java.lang.String str21 = bookingException9.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "scheduler.exception.BookingException: hi!" + "'", str21, "scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException19 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        scheduler.exception.RoomUnavailableException roomUnavailableException22 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException24 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException22.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.Throwable[] throwableArray26 = roomUnavailableException24.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.Throwable[] throwableArray28 = roomUnavailableException24.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.Throwable[] throwableArray30 = roomUnavailableException4.getSuppressed();
        java.lang.String str31 = roomUnavailableException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: " + "'", str31, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray4 = roomUnavailableException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = roomUnavailableException3.getSuppressed();
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("");
        bookingException7.addSuppressed((java.lang.Throwable) bookingException9);
        java.lang.Throwable[] throwableArray11 = bookingException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = bookingException9.getSuppressed();
        scheduler.exception.BookingException bookingException14 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("");
        bookingException14.addSuppressed((java.lang.Throwable) bookingException16);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException19 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException14.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException14);
        scheduler.exception.BookingException bookingException23 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("");
        bookingException23.addSuppressed((java.lang.Throwable) bookingException25);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException23.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        bookingException14.addSuppressed((java.lang.Throwable) bookingException23);
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException34 = new scheduler.exception.BookingException("");
        bookingException32.addSuppressed((java.lang.Throwable) bookingException34);
        java.lang.Throwable[] throwableArray36 = bookingException34.getSuppressed();
        java.lang.Throwable[] throwableArray37 = bookingException34.getSuppressed();
        scheduler.exception.BookingException bookingException39 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException41 = new scheduler.exception.BookingException("");
        bookingException39.addSuppressed((java.lang.Throwable) bookingException41);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException44 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException39.addSuppressed((java.lang.Throwable) invalidBookingActionException44);
        bookingException34.addSuppressed((java.lang.Throwable) bookingException39);
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException50 = new scheduler.exception.BookingException("");
        bookingException48.addSuppressed((java.lang.Throwable) bookingException50);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException53 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException48.addSuppressed((java.lang.Throwable) invalidBookingActionException53);
        bookingException39.addSuppressed((java.lang.Throwable) bookingException48);
        bookingException23.addSuppressed((java.lang.Throwable) bookingException48);
        roomUnavailableException3.addSuppressed((java.lang.Throwable) bookingException48);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException48);
        java.lang.Class<?> wildcardClass59 = bookingException48.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertArrayEquals(throwableArray36, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertArrayEquals(throwableArray37, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.RoomUnavailableException roomUnavailableException40 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException42 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException40.addSuppressed((java.lang.Throwable) roomUnavailableException42);
        java.lang.Throwable[] throwableArray44 = roomUnavailableException40.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException46 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException46.addSuppressed((java.lang.Throwable) bookingException48);
        roomUnavailableException40.addSuppressed((java.lang.Throwable) bookingException48);
        scheduler.exception.BookingException bookingException52 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException54 = new scheduler.exception.BookingException("");
        bookingException52.addSuppressed((java.lang.Throwable) bookingException54);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException57 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException52.addSuppressed((java.lang.Throwable) invalidBookingActionException57);
        bookingException48.addSuppressed((java.lang.Throwable) bookingException52);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException61 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray62 = invalidBookingActionException61.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException64 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException66 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException64.addSuppressed((java.lang.Throwable) roomUnavailableException66);
        java.lang.Throwable[] throwableArray68 = roomUnavailableException64.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException70 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException72 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException70.addSuppressed((java.lang.Throwable) bookingException72);
        roomUnavailableException64.addSuppressed((java.lang.Throwable) bookingException72);
        invalidBookingActionException61.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        bookingException48.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        scheduler.exception.BookingException bookingException79 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException81 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException79.addSuppressed((java.lang.Throwable) invalidBookingActionException81);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException84 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray85 = invalidBookingActionException84.getSuppressed();
        invalidBookingActionException81.addSuppressed((java.lang.Throwable) invalidBookingActionException84);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException88 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException90 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException92 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException90.addSuppressed((java.lang.Throwable) invalidBookingActionException92);
        invalidBookingActionException88.addSuppressed((java.lang.Throwable) invalidBookingActionException92);
        invalidBookingActionException84.addSuppressed((java.lang.Throwable) invalidBookingActionException92);
        java.lang.Throwable[] throwableArray96 = invalidBookingActionException92.getSuppressed();
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) invalidBookingActionException92);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertArrayEquals(throwableArray62, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertArrayEquals(throwableArray85, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertArrayEquals(throwableArray96, new java.lang.Throwable[] {});
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException1.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("");
        bookingException10.addSuppressed((java.lang.Throwable) bookingException12);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException15 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException10.addSuppressed((java.lang.Throwable) invalidBookingActionException15);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("hi!");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        java.lang.Class<?> wildcardClass22 = invalidBookingActionException20.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray4 = invalidBookingActionException3.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray15 = bookingException1.getSuppressed();
        java.lang.Class<?> wildcardClass16 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.InvalidBookingActionException: hi!");
        java.lang.Class<?> wildcardClass2 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = bookingException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray32 = invalidBookingActionException31.getSuppressed();
        invalidBookingActionException28.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException35.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        java.lang.Throwable[] throwableArray44 = invalidBookingActionException31.getSuppressed();
        java.lang.Throwable[] throwableArray45 = invalidBookingActionException31.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.RoomUnavailableException roomUnavailableException40 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException42 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException40.addSuppressed((java.lang.Throwable) roomUnavailableException42);
        java.lang.Throwable[] throwableArray44 = roomUnavailableException40.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException46 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException46.addSuppressed((java.lang.Throwable) bookingException48);
        roomUnavailableException40.addSuppressed((java.lang.Throwable) bookingException48);
        scheduler.exception.BookingException bookingException52 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException54 = new scheduler.exception.BookingException("");
        bookingException52.addSuppressed((java.lang.Throwable) bookingException54);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException57 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException52.addSuppressed((java.lang.Throwable) invalidBookingActionException57);
        bookingException48.addSuppressed((java.lang.Throwable) bookingException52);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException61 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray62 = invalidBookingActionException61.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException64 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException66 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException64.addSuppressed((java.lang.Throwable) roomUnavailableException66);
        java.lang.Throwable[] throwableArray68 = roomUnavailableException64.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException70 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException72 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException70.addSuppressed((java.lang.Throwable) bookingException72);
        roomUnavailableException64.addSuppressed((java.lang.Throwable) bookingException72);
        invalidBookingActionException61.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        bookingException48.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        scheduler.exception.BookingException bookingException79 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException81 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException79.addSuppressed((java.lang.Throwable) invalidBookingActionException81);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException84 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray85 = invalidBookingActionException84.getSuppressed();
        invalidBookingActionException81.addSuppressed((java.lang.Throwable) invalidBookingActionException84);
        scheduler.exception.BookingException bookingException88 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException90 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException88.addSuppressed((java.lang.Throwable) invalidBookingActionException90);
        java.lang.Throwable[] throwableArray92 = bookingException88.getSuppressed();
        invalidBookingActionException84.addSuppressed((java.lang.Throwable) bookingException88);
        roomUnavailableException64.addSuppressed((java.lang.Throwable) bookingException88);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertArrayEquals(throwableArray62, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertArrayEquals(throwableArray85, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException1.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("");
        bookingException10.addSuppressed((java.lang.Throwable) bookingException12);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException15 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException10.addSuppressed((java.lang.Throwable) invalidBookingActionException15);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = roomUnavailableException52.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException52);
        scheduler.exception.RoomUnavailableException roomUnavailableException56 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException58 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException56.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException62 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray63 = invalidBookingActionException62.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException65 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException67 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException69 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException67.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        invalidBookingActionException65.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        invalidBookingActionException62.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        java.lang.Throwable[] throwableArray74 = invalidBookingActionException69.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertArrayEquals(throwableArray63, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertArrayEquals(throwableArray74, new java.lang.Throwable[] {});
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingException3.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: scheduler.exception.BookingException: ");
        java.lang.String str2 = roomUnavailableException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: scheduler.exception.BookingException: " + "'", str2, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass5 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException12 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray13 = invalidBookingActionException12.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        invalidBookingActionException12.addSuppressed((java.lang.Throwable) bookingException17);
        java.lang.Throwable[] throwableArray20 = invalidBookingActionException12.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException6.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray10 = roomUnavailableException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException8.getSuppressed();
        java.lang.Throwable[] throwableArray13 = roomUnavailableException8.getSuppressed();
        java.lang.Throwable[] throwableArray14 = roomUnavailableException8.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException16 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException18 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException16.addSuppressed((java.lang.Throwable) roomUnavailableException18);
        java.lang.Throwable[] throwableArray20 = roomUnavailableException16.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException22 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException22.addSuppressed((java.lang.Throwable) bookingException24);
        roomUnavailableException16.addSuppressed((java.lang.Throwable) roomUnavailableException22);
        java.lang.Throwable[] throwableArray27 = roomUnavailableException16.getSuppressed();
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException16);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: ");
        java.lang.Class<?> wildcardClass2 = roomUnavailableException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException3 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray4 = invalidBookingActionException3.getSuppressed();
        scheduler.exception.BookingException bookingException6 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException6.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException11 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray12 = invalidBookingActionException11.getSuppressed();
        invalidBookingActionException8.addSuppressed((java.lang.Throwable) invalidBookingActionException11);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException15 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException19 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        invalidBookingActionException15.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        invalidBookingActionException11.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        java.lang.Throwable[] throwableArray28 = bookingException26.getSuppressed();
        java.lang.Throwable[] throwableArray29 = bookingException26.getSuppressed();
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("");
        bookingException31.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException36 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException31.addSuppressed((java.lang.Throwable) invalidBookingActionException36);
        bookingException26.addSuppressed((java.lang.Throwable) bookingException31);
        invalidBookingActionException11.addSuppressed((java.lang.Throwable) bookingException31);
        invalidBookingActionException3.addSuppressed((java.lang.Throwable) bookingException31);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException31);
        java.lang.Throwable[] throwableArray42 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertArrayEquals(throwableArray29, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        java.lang.Throwable[] throwableArray21 = bookingException19.getSuppressed();
        java.lang.Throwable[] throwableArray22 = bookingException19.getSuppressed();
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException19.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException44 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray48 = invalidBookingActionException47.getSuppressed();
        invalidBookingActionException44.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException51 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException53 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException55 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException53.addSuppressed((java.lang.Throwable) invalidBookingActionException55);
        invalidBookingActionException51.addSuppressed((java.lang.Throwable) invalidBookingActionException55);
        invalidBookingActionException47.addSuppressed((java.lang.Throwable) invalidBookingActionException55);
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        scheduler.exception.RoomUnavailableException roomUnavailableException61 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException63 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException61.addSuppressed((java.lang.Throwable) bookingException63);
        java.lang.Throwable[] throwableArray65 = bookingException63.getSuppressed();
        scheduler.exception.BookingException bookingException67 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException69 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException67.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        scheduler.exception.RoomUnavailableException roomUnavailableException72 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException74 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException72.addSuppressed((java.lang.Throwable) roomUnavailableException74);
        java.lang.Throwable[] throwableArray76 = roomUnavailableException74.getSuppressed();
        bookingException67.addSuppressed((java.lang.Throwable) roomUnavailableException74);
        java.lang.Throwable[] throwableArray78 = roomUnavailableException74.getSuppressed();
        java.lang.Throwable[] throwableArray79 = roomUnavailableException74.getSuppressed();
        bookingException63.addSuppressed((java.lang.Throwable) roomUnavailableException74);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException63);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.BookingException bookingException84 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException84);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertArrayEquals(throwableArray48, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertArrayEquals(throwableArray65, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertArrayEquals(throwableArray76, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertArrayEquals(throwableArray78, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertArrayEquals(throwableArray79, new java.lang.Throwable[] {});
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("");
        bookingException5.addSuppressed((java.lang.Throwable) bookingException7);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException10 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException5.addSuppressed((java.lang.Throwable) invalidBookingActionException10);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException14 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray15 = roomUnavailableException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = roomUnavailableException14.getSuppressed();
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException20 = new scheduler.exception.BookingException("");
        bookingException18.addSuppressed((java.lang.Throwable) bookingException20);
        java.lang.Throwable[] throwableArray22 = bookingException20.getSuppressed();
        java.lang.Throwable[] throwableArray23 = bookingException20.getSuppressed();
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException27 = new scheduler.exception.BookingException("");
        bookingException25.addSuppressed((java.lang.Throwable) bookingException27);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException30 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException25.addSuppressed((java.lang.Throwable) invalidBookingActionException30);
        bookingException20.addSuppressed((java.lang.Throwable) bookingException25);
        scheduler.exception.BookingException bookingException34 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException36 = new scheduler.exception.BookingException("");
        bookingException34.addSuppressed((java.lang.Throwable) bookingException36);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException34.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException25.addSuppressed((java.lang.Throwable) bookingException34);
        scheduler.exception.BookingException bookingException43 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException45 = new scheduler.exception.BookingException("");
        bookingException43.addSuppressed((java.lang.Throwable) bookingException45);
        java.lang.Throwable[] throwableArray47 = bookingException45.getSuppressed();
        java.lang.Throwable[] throwableArray48 = bookingException45.getSuppressed();
        scheduler.exception.BookingException bookingException50 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException52 = new scheduler.exception.BookingException("");
        bookingException50.addSuppressed((java.lang.Throwable) bookingException52);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException55 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException50.addSuppressed((java.lang.Throwable) invalidBookingActionException55);
        bookingException45.addSuppressed((java.lang.Throwable) bookingException50);
        scheduler.exception.BookingException bookingException59 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException61 = new scheduler.exception.BookingException("");
        bookingException59.addSuppressed((java.lang.Throwable) bookingException61);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException64 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException59.addSuppressed((java.lang.Throwable) invalidBookingActionException64);
        bookingException50.addSuppressed((java.lang.Throwable) bookingException59);
        bookingException34.addSuppressed((java.lang.Throwable) bookingException59);
        roomUnavailableException14.addSuppressed((java.lang.Throwable) bookingException59);
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException14);
        java.lang.String str71 = invalidBookingActionException1.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertArrayEquals(throwableArray47, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertArrayEquals(throwableArray48, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!" + "'", str71, "scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = invalidBookingActionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException28 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException26.addSuppressed((java.lang.Throwable) invalidBookingActionException28);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException31 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray32 = invalidBookingActionException31.getSuppressed();
        invalidBookingActionException28.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException35 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException37 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException39 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException37.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException35.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        invalidBookingActionException31.addSuppressed((java.lang.Throwable) invalidBookingActionException39);
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException31);
        scheduler.exception.RoomUnavailableException roomUnavailableException45 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException45.addSuppressed((java.lang.Throwable) bookingException47);
        java.lang.Throwable[] throwableArray49 = bookingException47.getSuppressed();
        scheduler.exception.BookingException bookingException51 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException53 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException51.addSuppressed((java.lang.Throwable) invalidBookingActionException53);
        scheduler.exception.RoomUnavailableException roomUnavailableException56 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException58 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException56.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        java.lang.Throwable[] throwableArray60 = roomUnavailableException58.getSuppressed();
        bookingException51.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        java.lang.Throwable[] throwableArray62 = roomUnavailableException58.getSuppressed();
        java.lang.Throwable[] throwableArray63 = roomUnavailableException58.getSuppressed();
        bookingException47.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException47);
        scheduler.exception.BookingException bookingException67 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException69 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException67.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException72 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray73 = invalidBookingActionException72.getSuppressed();
        invalidBookingActionException69.addSuppressed((java.lang.Throwable) invalidBookingActionException72);
        scheduler.exception.BookingException bookingException76 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException78 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException76.addSuppressed((java.lang.Throwable) invalidBookingActionException78);
        java.lang.Throwable[] throwableArray80 = bookingException76.getSuppressed();
        invalidBookingActionException72.addSuppressed((java.lang.Throwable) bookingException76);
        bookingException47.addSuppressed((java.lang.Throwable) invalidBookingActionException72);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertArrayEquals(throwableArray32, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertArrayEquals(throwableArray49, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertArrayEquals(throwableArray60, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertArrayEquals(throwableArray62, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertArrayEquals(throwableArray63, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertArrayEquals(throwableArray73, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray80);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.InvalidBookingActionException: ");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        java.lang.String str3 = roomUnavailableException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: " + "'", str3, "scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException5 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException5);
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException10.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        java.lang.Throwable[] throwableArray14 = roomUnavailableException10.getSuppressed();
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException10);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException19 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException19);
        java.lang.Throwable[] throwableArray21 = bookingException17.getSuppressed();
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException17);
        java.lang.String str23 = roomUnavailableException10.toString();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "scheduler.exception.RoomUnavailableException: " + "'", str23, "scheduler.exception.RoomUnavailableException: ");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray11 = bookingException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = invalidBookingActionException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray18 = invalidBookingActionException17.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.RoomUnavailableException roomUnavailableException21 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray22 = roomUnavailableException21.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException21);
        java.lang.Throwable[] throwableArray24 = roomUnavailableException21.getSuppressed();
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        java.lang.Throwable[] throwableArray50 = bookingException33.getSuppressed();
        roomUnavailableException21.addSuppressed((java.lang.Throwable) bookingException33);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        scheduler.exception.BookingException bookingException13 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("");
        bookingException13.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException18 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException13.addSuppressed((java.lang.Throwable) invalidBookingActionException18);
        bookingException9.addSuppressed((java.lang.Throwable) bookingException13);
        java.lang.Throwable[] throwableArray21 = bookingException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: hi!");
        java.lang.Throwable[] throwableArray2 = roomUnavailableException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = roomUnavailableException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        java.lang.String str3 = invalidBookingActionException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: " + "'", str3, "scheduler.exception.InvalidBookingActionException: scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException7 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException7.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException12 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray13 = invalidBookingActionException12.getSuppressed();
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException12);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException16 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException18.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        invalidBookingActionException16.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        invalidBookingActionException12.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        scheduler.exception.BookingException bookingException25 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException27 = new scheduler.exception.BookingException("");
        bookingException25.addSuppressed((java.lang.Throwable) bookingException27);
        java.lang.Throwable[] throwableArray29 = bookingException27.getSuppressed();
        java.lang.Throwable[] throwableArray30 = bookingException27.getSuppressed();
        scheduler.exception.BookingException bookingException32 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException34 = new scheduler.exception.BookingException("");
        bookingException32.addSuppressed((java.lang.Throwable) bookingException34);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException37 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException32.addSuppressed((java.lang.Throwable) invalidBookingActionException37);
        bookingException27.addSuppressed((java.lang.Throwable) bookingException32);
        invalidBookingActionException12.addSuppressed((java.lang.Throwable) bookingException32);
        scheduler.exception.RoomUnavailableException roomUnavailableException42 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException44 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException42.addSuppressed((java.lang.Throwable) roomUnavailableException44);
        java.lang.Throwable[] throwableArray46 = roomUnavailableException42.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException48 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException50 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException48.addSuppressed((java.lang.Throwable) bookingException50);
        roomUnavailableException42.addSuppressed((java.lang.Throwable) bookingException50);
        invalidBookingActionException12.addSuppressed((java.lang.Throwable) bookingException50);
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException12);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertArrayEquals(throwableArray29, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        java.lang.Throwable[] throwableArray12 = bookingException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = bookingException10.getSuppressed();
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException10.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("");
        bookingException24.addSuppressed((java.lang.Throwable) bookingException26);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        bookingException15.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException24);
        scheduler.exception.RoomUnavailableException roomUnavailableException34 = new scheduler.exception.RoomUnavailableException("hi!");
        java.lang.Throwable[] throwableArray35 = roomUnavailableException34.getSuppressed();
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException34);
        scheduler.exception.RoomUnavailableException roomUnavailableException38 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        roomUnavailableException34.addSuppressed((java.lang.Throwable) roomUnavailableException38);
        scheduler.exception.RoomUnavailableException roomUnavailableException41 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException43 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException41.addSuppressed((java.lang.Throwable) bookingException43);
        java.lang.Throwable[] throwableArray45 = bookingException43.getSuppressed();
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException49 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException47.addSuppressed((java.lang.Throwable) invalidBookingActionException49);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException54 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException52.addSuppressed((java.lang.Throwable) roomUnavailableException54);
        java.lang.Throwable[] throwableArray56 = roomUnavailableException54.getSuppressed();
        bookingException47.addSuppressed((java.lang.Throwable) roomUnavailableException54);
        java.lang.Throwable[] throwableArray58 = roomUnavailableException54.getSuppressed();
        java.lang.Throwable[] throwableArray59 = roomUnavailableException54.getSuppressed();
        bookingException43.addSuppressed((java.lang.Throwable) roomUnavailableException54);
        roomUnavailableException34.addSuppressed((java.lang.Throwable) bookingException43);
        java.lang.String str62 = roomUnavailableException34.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertArrayEquals(throwableArray45, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertArrayEquals(throwableArray56, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertArrayEquals(throwableArray58, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertArrayEquals(throwableArray59, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "scheduler.exception.RoomUnavailableException: hi!" + "'", str62, "scheduler.exception.RoomUnavailableException: hi!");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.BookingException bookingException8 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("");
        bookingException8.addSuppressed((java.lang.Throwable) bookingException10);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException8.addSuppressed((java.lang.Throwable) invalidBookingActionException13);
        bookingException3.addSuppressed((java.lang.Throwable) bookingException8);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException19 = new scheduler.exception.BookingException("");
        bookingException17.addSuppressed((java.lang.Throwable) bookingException19);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException22 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException22);
        bookingException8.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        bookingException17.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.RoomUnavailableException roomUnavailableException52 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray53 = roomUnavailableException52.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException52);
        scheduler.exception.RoomUnavailableException roomUnavailableException56 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException58 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException56.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException58);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException62 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray63 = invalidBookingActionException62.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException65 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException67 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException69 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException67.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        invalidBookingActionException65.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        invalidBookingActionException62.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException69);
        java.lang.Throwable throwable74 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingException17.addSuppressed(throwable74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertArrayEquals(throwableArray53, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertArrayEquals(throwableArray63, new java.lang.Throwable[] {});
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException4 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        java.lang.Throwable[] throwableArray8 = roomUnavailableException4.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException10 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException12 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException10.addSuppressed((java.lang.Throwable) bookingException12);
        roomUnavailableException4.addSuppressed((java.lang.Throwable) bookingException12);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException4);
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException19 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException17.addSuppressed((java.lang.Throwable) invalidBookingActionException19);
        scheduler.exception.RoomUnavailableException roomUnavailableException22 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException24 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException22.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.Throwable[] throwableArray26 = roomUnavailableException24.getSuppressed();
        bookingException17.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.Throwable[] throwableArray28 = roomUnavailableException24.getSuppressed();
        roomUnavailableException4.addSuppressed((java.lang.Throwable) roomUnavailableException24);
        java.lang.Throwable[] throwableArray30 = roomUnavailableException4.getSuppressed();
        java.lang.Class<?> wildcardClass31 = roomUnavailableException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: scheduler.exception.InvalidBookingActionException: hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("");
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Throwable[] throwableArray5 = bookingException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException3.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException8 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException10 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException8.addSuppressed((java.lang.Throwable) bookingException10);
        bookingException3.addSuppressed((java.lang.Throwable) roomUnavailableException8);
        java.lang.Class<?> wildcardClass13 = bookingException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: ");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: hi!");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException3);
        scheduler.exception.RoomUnavailableException roomUnavailableException6 = new scheduler.exception.RoomUnavailableException("scheduler.exception.RoomUnavailableException: scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException6);
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException11 = new scheduler.exception.BookingException("");
        bookingException9.addSuppressed((java.lang.Throwable) bookingException11);
        java.lang.Throwable[] throwableArray13 = bookingException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = bookingException11.getSuppressed();
        scheduler.exception.BookingException bookingException16 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException18 = new scheduler.exception.BookingException("");
        bookingException16.addSuppressed((java.lang.Throwable) bookingException18);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException21 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException16.addSuppressed((java.lang.Throwable) invalidBookingActionException21);
        bookingException11.addSuppressed((java.lang.Throwable) bookingException16);
        java.lang.Throwable[] throwableArray24 = bookingException11.getSuppressed();
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException11);
        scheduler.exception.BookingException bookingException27 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException29 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException27.addSuppressed((java.lang.Throwable) invalidBookingActionException29);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException32 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray33 = invalidBookingActionException32.getSuppressed();
        invalidBookingActionException29.addSuppressed((java.lang.Throwable) invalidBookingActionException32);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException36 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException38 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException40 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException38.addSuppressed((java.lang.Throwable) invalidBookingActionException40);
        invalidBookingActionException36.addSuppressed((java.lang.Throwable) invalidBookingActionException40);
        invalidBookingActionException32.addSuppressed((java.lang.Throwable) invalidBookingActionException40);
        scheduler.exception.BookingException bookingException45 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException47 = new scheduler.exception.BookingException("");
        bookingException45.addSuppressed((java.lang.Throwable) bookingException47);
        java.lang.Throwable[] throwableArray49 = bookingException47.getSuppressed();
        java.lang.Throwable[] throwableArray50 = bookingException47.getSuppressed();
        scheduler.exception.BookingException bookingException52 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException54 = new scheduler.exception.BookingException("");
        bookingException52.addSuppressed((java.lang.Throwable) bookingException54);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException57 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException52.addSuppressed((java.lang.Throwable) invalidBookingActionException57);
        bookingException47.addSuppressed((java.lang.Throwable) bookingException52);
        invalidBookingActionException32.addSuppressed((java.lang.Throwable) bookingException52);
        java.lang.Throwable[] throwableArray61 = bookingException52.getSuppressed();
        bookingException11.addSuppressed((java.lang.Throwable) bookingException52);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertArrayEquals(throwableArray33, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertArrayEquals(throwableArray49, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertArrayEquals(throwableArray50, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: scheduler.exception.BookingException: ");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException1 = new scheduler.exception.InvalidBookingActionException("");
        java.lang.Throwable[] throwableArray2 = invalidBookingActionException1.getSuppressed();
        scheduler.exception.BookingException bookingException4 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException6 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException4.addSuppressed((java.lang.Throwable) invalidBookingActionException6);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException9 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray10 = invalidBookingActionException9.getSuppressed();
        invalidBookingActionException6.addSuppressed((java.lang.Throwable) invalidBookingActionException9);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException13 = new scheduler.exception.InvalidBookingActionException("hi!");
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException17 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException13.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) invalidBookingActionException17);
        scheduler.exception.BookingException bookingException22 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("");
        bookingException22.addSuppressed((java.lang.Throwable) bookingException24);
        java.lang.Throwable[] throwableArray26 = bookingException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = bookingException24.getSuppressed();
        scheduler.exception.BookingException bookingException29 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException31 = new scheduler.exception.BookingException("");
        bookingException29.addSuppressed((java.lang.Throwable) bookingException31);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException34 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException29.addSuppressed((java.lang.Throwable) invalidBookingActionException34);
        bookingException24.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException9.addSuppressed((java.lang.Throwable) bookingException29);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) bookingException29);
        scheduler.exception.RoomUnavailableException roomUnavailableException40 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException42 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException40.addSuppressed((java.lang.Throwable) roomUnavailableException42);
        java.lang.Throwable[] throwableArray44 = roomUnavailableException40.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException46 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException48 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException46.addSuppressed((java.lang.Throwable) bookingException48);
        roomUnavailableException40.addSuppressed((java.lang.Throwable) bookingException48);
        scheduler.exception.BookingException bookingException52 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException54 = new scheduler.exception.BookingException("");
        bookingException52.addSuppressed((java.lang.Throwable) bookingException54);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException57 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException52.addSuppressed((java.lang.Throwable) invalidBookingActionException57);
        bookingException48.addSuppressed((java.lang.Throwable) bookingException52);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException61 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray62 = invalidBookingActionException61.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException64 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException66 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException64.addSuppressed((java.lang.Throwable) roomUnavailableException66);
        java.lang.Throwable[] throwableArray68 = roomUnavailableException64.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException70 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException72 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException70.addSuppressed((java.lang.Throwable) bookingException72);
        roomUnavailableException64.addSuppressed((java.lang.Throwable) bookingException72);
        invalidBookingActionException61.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        bookingException48.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        invalidBookingActionException1.addSuppressed((java.lang.Throwable) roomUnavailableException64);
        scheduler.exception.BookingException bookingException79 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException81 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException79.addSuppressed((java.lang.Throwable) invalidBookingActionException81);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException84 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray85 = invalidBookingActionException84.getSuppressed();
        invalidBookingActionException81.addSuppressed((java.lang.Throwable) invalidBookingActionException84);
        scheduler.exception.BookingException bookingException88 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException90 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException88.addSuppressed((java.lang.Throwable) invalidBookingActionException90);
        java.lang.Throwable[] throwableArray92 = bookingException88.getSuppressed();
        invalidBookingActionException84.addSuppressed((java.lang.Throwable) bookingException88);
        roomUnavailableException64.addSuppressed((java.lang.Throwable) invalidBookingActionException84);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertArrayEquals(throwableArray62, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertArrayEquals(throwableArray85, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        bookingException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = bookingException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = bookingException1.getSuppressed();
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        java.lang.Throwable[] throwableArray9 = invalidBookingActionException8.getSuppressed();
        bookingException1.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        java.lang.Throwable[] throwableArray11 = bookingException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException5 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException3.addSuppressed((java.lang.Throwable) roomUnavailableException5);
        java.lang.Throwable[] throwableArray7 = roomUnavailableException3.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException9 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException11 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException9.addSuppressed((java.lang.Throwable) bookingException11);
        roomUnavailableException3.addSuppressed((java.lang.Throwable) bookingException11);
        scheduler.exception.BookingException bookingException15 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException17 = new scheduler.exception.BookingException("");
        bookingException15.addSuppressed((java.lang.Throwable) bookingException17);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException20 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException15.addSuppressed((java.lang.Throwable) invalidBookingActionException20);
        bookingException11.addSuppressed((java.lang.Throwable) bookingException15);
        scheduler.exception.BookingException bookingException24 = new scheduler.exception.BookingException("scheduler.exception.InvalidBookingActionException: hi!");
        scheduler.exception.BookingException bookingException26 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException28 = new scheduler.exception.BookingException("");
        bookingException26.addSuppressed((java.lang.Throwable) bookingException28);
        java.lang.Throwable[] throwableArray30 = bookingException28.getSuppressed();
        java.lang.Throwable[] throwableArray31 = bookingException28.getSuppressed();
        scheduler.exception.BookingException bookingException33 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException35 = new scheduler.exception.BookingException("");
        bookingException33.addSuppressed((java.lang.Throwable) bookingException35);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException38 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException33.addSuppressed((java.lang.Throwable) invalidBookingActionException38);
        bookingException28.addSuppressed((java.lang.Throwable) bookingException33);
        scheduler.exception.BookingException bookingException42 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException44 = new scheduler.exception.BookingException("");
        bookingException42.addSuppressed((java.lang.Throwable) bookingException44);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException47 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException42.addSuppressed((java.lang.Throwable) invalidBookingActionException47);
        bookingException33.addSuppressed((java.lang.Throwable) bookingException42);
        scheduler.exception.BookingException bookingException51 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException53 = new scheduler.exception.BookingException("");
        bookingException51.addSuppressed((java.lang.Throwable) bookingException53);
        java.lang.Throwable[] throwableArray55 = bookingException53.getSuppressed();
        java.lang.Throwable[] throwableArray56 = bookingException53.getSuppressed();
        scheduler.exception.BookingException bookingException58 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException60 = new scheduler.exception.BookingException("");
        bookingException58.addSuppressed((java.lang.Throwable) bookingException60);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException63 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException58.addSuppressed((java.lang.Throwable) invalidBookingActionException63);
        bookingException53.addSuppressed((java.lang.Throwable) bookingException58);
        scheduler.exception.BookingException bookingException67 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException69 = new scheduler.exception.BookingException("");
        bookingException67.addSuppressed((java.lang.Throwable) bookingException69);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException72 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException67.addSuppressed((java.lang.Throwable) invalidBookingActionException72);
        bookingException58.addSuppressed((java.lang.Throwable) bookingException67);
        bookingException42.addSuppressed((java.lang.Throwable) bookingException67);
        scheduler.exception.BookingException bookingException77 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.InvalidBookingActionException invalidBookingActionException79 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.BookingException: ");
        bookingException77.addSuppressed((java.lang.Throwable) invalidBookingActionException79);
        java.lang.Throwable[] throwableArray81 = invalidBookingActionException79.getSuppressed();
        bookingException67.addSuppressed((java.lang.Throwable) invalidBookingActionException79);
        bookingException24.addSuppressed((java.lang.Throwable) invalidBookingActionException79);
        java.lang.Throwable[] throwableArray84 = bookingException24.getSuppressed();
        bookingException11.addSuppressed((java.lang.Throwable) bookingException24);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException11);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertArrayEquals(throwableArray30, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertArrayEquals(throwableArray31, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertArrayEquals(throwableArray55, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertArrayEquals(throwableArray56, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertArrayEquals(throwableArray81, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray84);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        scheduler.exception.BookingException bookingException1 = new scheduler.exception.BookingException("");
        scheduler.exception.BookingException bookingException3 = new scheduler.exception.BookingException("hi!");
        scheduler.exception.BookingException bookingException5 = new scheduler.exception.BookingException("");
        bookingException3.addSuppressed((java.lang.Throwable) bookingException5);
        scheduler.exception.InvalidBookingActionException invalidBookingActionException8 = new scheduler.exception.InvalidBookingActionException("scheduler.exception.InvalidBookingActionException: scheduler.exception.BookingException: ");
        bookingException3.addSuppressed((java.lang.Throwable) invalidBookingActionException8);
        bookingException1.addSuppressed((java.lang.Throwable) bookingException3);
        java.lang.Class<?> wildcardClass11 = bookingException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        scheduler.exception.RoomUnavailableException roomUnavailableException1 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.RoomUnavailableException roomUnavailableException3 = new scheduler.exception.RoomUnavailableException("");
        roomUnavailableException1.addSuppressed((java.lang.Throwable) roomUnavailableException3);
        java.lang.Throwable[] throwableArray5 = roomUnavailableException1.getSuppressed();
        scheduler.exception.RoomUnavailableException roomUnavailableException7 = new scheduler.exception.RoomUnavailableException("scheduler.exception.BookingException: ");
        scheduler.exception.BookingException bookingException9 = new scheduler.exception.BookingException("hi!");
        roomUnavailableException7.addSuppressed((java.lang.Throwable) bookingException9);
        roomUnavailableException1.addSuppressed((java.lang.Throwable) bookingException9);
        java.lang.Throwable[] throwableArray12 = roomUnavailableException1.getSuppressed();
        java.lang.String str13 = roomUnavailableException1.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: " + "'", str13, "scheduler.exception.RoomUnavailableException: scheduler.exception.BookingException: ");
    }
}

