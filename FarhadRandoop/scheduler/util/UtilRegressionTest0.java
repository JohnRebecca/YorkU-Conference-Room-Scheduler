package scheduler.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilRegressionTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UtilRegressionTest0.test1");
        java.lang.String str0 = scheduler.util.PasswordValidator.requirementsMessage();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Password must contain at least 8 characters, including an uppercase letter, lowercase letter, digit, and special character." + "'", str0, "Password must contain at least 8 characters, including an uppercase letter, lowercase letter, digit, and special character.");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UtilRegressionTest0.test2");
        boolean boolean1 = scheduler.util.EmailValidator.isValidFormat("Password must contain at least 8 characters, including an uppercase letter, lowercase letter, digit, and special character.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UtilRegressionTest0.test3");
        boolean boolean1 = scheduler.util.PasswordValidator.isStrong("Password must contain at least 8 characters, including an uppercase letter, lowercase letter, digit, and special character.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UtilRegressionTest0.test4");
        boolean boolean1 = scheduler.util.PasswordValidator.isStrong("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UtilRegressionTest0.test5");
        boolean boolean1 = scheduler.util.PasswordValidator.isStrong("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UtilRegressionTest0.test6");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UtilRegressionTest0.test7");
        boolean boolean1 = scheduler.util.EmailValidator.isValidFormat("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UtilRegressionTest0.test8");
        boolean boolean1 = scheduler.util.EmailValidator.isValidFormat("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

