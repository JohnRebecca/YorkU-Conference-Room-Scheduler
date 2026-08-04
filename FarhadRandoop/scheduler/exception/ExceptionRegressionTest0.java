package scheduler.exception;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExceptionRegressionTest0 {

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
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test001");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        authenticationException1.addSuppressed((java.lang.Throwable) accountException6);
        java.lang.Class<?> wildcardClass8 = accountException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test002");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray3 = authenticationException2.getSuppressed();
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException2);
        java.lang.String str5 = authenticationException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.AuthenticationException: " + "'", str5, "scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test003");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test004");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException2);
        java.lang.Class<?> wildcardClass4 = profileException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test005");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test006");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray3 = authenticationException2.getSuppressed();
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException2);
        java.lang.String str5 = accountException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.AccountException: " + "'", str5, "scheduler.exception.AccountException: ");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test007");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Class<?> wildcardClass6 = profileException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test008");
        java.lang.Throwable throwable1 = null;
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("hi!", throwable1);
        scheduler.exception.DuplicateEmailException duplicateEmailException4 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        accountException2.addSuppressed((java.lang.Throwable) duplicateEmailException4);
        java.lang.String str6 = accountException2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.AccountException: hi!" + "'", str6, "scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test009");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("");
        java.lang.Class<?> wildcardClass2 = verificationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test010");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("");
        java.lang.String str2 = authenticationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.AuthenticationException: " + "'", str2, "scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test011");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("");
        java.lang.String str2 = profileException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.ProfileException: " + "'", str2, "scheduler.exception.ProfileException: ");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test012");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("hi!");
        java.lang.Class<?> wildcardClass2 = profileException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test013");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException6 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray7 = authenticationException6.getSuppressed();
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException6);
        authenticationException3.addSuppressed((java.lang.Throwable) accountException8);
        verificationException1.addSuppressed((java.lang.Throwable) authenticationException3);
        java.lang.Class<?> wildcardClass11 = authenticationException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test014");
        java.lang.Throwable throwable1 = null;
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("hi!", throwable1);
        scheduler.exception.DuplicateEmailException duplicateEmailException4 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        accountException2.addSuppressed((java.lang.Throwable) duplicateEmailException4);
        java.lang.Class<?> wildcardClass6 = accountException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test015");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.String str6 = profileException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.ProfileException: " + "'", str6, "scheduler.exception.ProfileException: ");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test016");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test017");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("hi!");
        java.lang.Throwable[] throwableArray2 = profileException1.getSuppressed();
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        profileException1.addSuppressed((java.lang.Throwable) authenticationException4);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test018");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray8 = authenticationException7.getSuppressed();
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException7);
        authenticationException4.addSuppressed((java.lang.Throwable) accountException9);
        verificationException2.addSuppressed((java.lang.Throwable) authenticationException4);
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) authenticationException4);
        java.lang.Class<?> wildcardClass13 = accountException12.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test019");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Throwable[] throwableArray6 = profileException5.getSuppressed();
        java.lang.Class<?> wildcardClass7 = profileException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test020");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.String str6 = profileException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.ProfileException: " + "'", str6, "scheduler.exception.ProfileException: ");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test021");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) profileException6);
        java.lang.String str9 = profileException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "scheduler.exception.ProfileException: " + "'", str9, "scheduler.exception.ProfileException: ");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test022");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Class<?> wildcardClass6 = profileException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test023");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test024");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("hi!");
        java.lang.Throwable[] throwableArray3 = authenticationException2.getSuppressed();
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException2);
        java.lang.String str5 = accountException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.AccountException: " + "'", str5, "scheduler.exception.AccountException: ");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test025");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test026");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException6);
        java.lang.String str8 = profileException6.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "scheduler.exception.ProfileException: " + "'", str8, "scheduler.exception.ProfileException: ");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test027");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray4 = authenticationException3.getSuppressed();
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException3);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException3);
        scheduler.exception.VerificationException verificationException9 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException9);
        profileException6.addSuppressed((java.lang.Throwable) verificationException9);
        java.lang.Class<?> wildcardClass12 = verificationException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test028");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException7);
        verificationException3.addSuppressed((java.lang.Throwable) accountException8);
        java.lang.Throwable[] throwableArray10 = accountException8.getSuppressed();
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException8);
        java.lang.String str12 = accountException8.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: " + "'", str12, "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test029");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        authenticationException1.addSuppressed((java.lang.Throwable) accountException6);
        java.lang.String str8 = accountException6.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "scheduler.exception.AccountException: " + "'", str8, "scheduler.exception.AccountException: ");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test030");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: ");
        java.lang.String str2 = authenticationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: " + "'", str2, "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test031");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test032");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("hi!");
        java.lang.Throwable[] throwableArray2 = profileException1.getSuppressed();
        java.lang.String str3 = profileException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scheduler.exception.ProfileException: hi!" + "'", str3, "scheduler.exception.ProfileException: hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test033");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("hi!");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        java.lang.String str3 = authenticationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scheduler.exception.AuthenticationException: hi!" + "'", str3, "scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test034");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test035");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) duplicateEmailException2);
        java.lang.Class<?> wildcardClass4 = duplicateEmailException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test036");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: hi!");
        profileException1.addSuppressed((java.lang.Throwable) verificationException3);
        java.lang.Class<?> wildcardClass5 = verificationException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test037");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException2);
        java.lang.Class<?> wildcardClass4 = authenticationException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test038");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException6);
        scheduler.exception.DuplicateEmailException duplicateEmailException10 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException10);
        scheduler.exception.VerificationException verificationException15 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException15);
        scheduler.exception.AuthenticationException authenticationException19 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException20 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException19);
        verificationException15.addSuppressed((java.lang.Throwable) accountException20);
        scheduler.exception.ProfileException profileException22 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException15);
        java.lang.Throwable[] throwableArray23 = verificationException15.getSuppressed();
        duplicateEmailException10.addSuppressed((java.lang.Throwable) verificationException15);
        profileException6.addSuppressed((java.lang.Throwable) duplicateEmailException10);
        java.lang.String str26 = duplicateEmailException10.toString();
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: ." + "'", str26, "scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test039");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException2);
        java.lang.Throwable[] throwableArray4 = profileException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test040");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException7);
        verificationException3.addSuppressed((java.lang.Throwable) accountException8);
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException3);
        java.lang.String str11 = verificationException3.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "scheduler.exception.VerificationException: " + "'", str11, "scheduler.exception.VerificationException: ");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test041");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException2);
        scheduler.exception.AuthenticationException authenticationException6 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException6);
        authenticationException2.addSuppressed((java.lang.Throwable) authenticationException6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test042");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray4 = authenticationException3.getSuppressed();
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException3);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) accountException5);
        java.lang.Class<?> wildcardClass7 = profileException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test043");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException8);
        verificationException4.addSuppressed((java.lang.Throwable) accountException9);
        java.lang.Throwable[] throwableArray11 = accountException9.getSuppressed();
        authenticationException1.addSuppressed((java.lang.Throwable) accountException9);
        java.lang.String str13 = accountException9.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: " + "'", str13, "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test044");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .");
        java.lang.Class<?> wildcardClass2 = accountException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test045");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray4 = authenticationException3.getSuppressed();
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException3);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException3);
        java.lang.String str7 = authenticationException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.AuthenticationException: " + "'", str7, "scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test046");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException6.addSuppressed((java.lang.Throwable) verificationException10);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException10);
        java.lang.Class<?> wildcardClass14 = profileException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test047");
        scheduler.exception.DuplicateEmailException duplicateEmailException4 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) accountException6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test048");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        java.lang.String str2 = verificationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: " + "'", str2, "scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test049");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.ProfileException: ");
        java.lang.String str2 = verificationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.VerificationException: scheduler.exception.ProfileException: " + "'", str2, "scheduler.exception.VerificationException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test050");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException2);
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException7);
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException11);
        verificationException7.addSuppressed((java.lang.Throwable) accountException12);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException7);
        java.lang.Throwable[] throwableArray15 = verificationException7.getSuppressed();
        duplicateEmailException2.addSuppressed((java.lang.Throwable) verificationException7);
        java.lang.Throwable[] throwableArray17 = duplicateEmailException2.getSuppressed();
        java.lang.Class<?> wildcardClass18 = duplicateEmailException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test051");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException9);
        verificationException5.addSuppressed((java.lang.Throwable) accountException10);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException5);
        java.lang.Throwable[] throwableArray13 = verificationException5.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException5);
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) accountException14);
        java.lang.Class<?> wildcardClass16 = accountException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test052");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        authenticationException1.addSuppressed((java.lang.Throwable) accountException6);
        java.lang.Throwable[] throwableArray8 = accountException6.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test053");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException8);
        verificationException4.addSuppressed((java.lang.Throwable) accountException9);
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException4);
        java.lang.Throwable[] throwableArray12 = verificationException4.getSuppressed();
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) verificationException4);
        java.lang.Class<?> wildcardClass14 = profileException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test054");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AccountException: hi!");
        java.lang.Class<?> wildcardClass2 = accountException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test055");
        java.lang.Throwable throwable1 = null;
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("hi!", throwable1);
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException7);
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException11);
        verificationException7.addSuppressed((java.lang.Throwable) accountException12);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException7);
        java.lang.Throwable[] throwableArray15 = verificationException7.getSuppressed();
        scheduler.exception.AccountException accountException16 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException7);
        accountException2.addSuppressed((java.lang.Throwable) accountException16);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test056");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("hi!");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = authenticationException1.getSuppressed();
        java.lang.String str4 = authenticationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "scheduler.exception.AuthenticationException: hi!" + "'", str4, "scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test057");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray3 = authenticationException2.getSuppressed();
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException2);
        java.lang.Throwable[] throwableArray5 = authenticationException2.getSuppressed();
        scheduler.exception.DuplicateEmailException duplicateEmailException7 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        authenticationException2.addSuppressed((java.lang.Throwable) duplicateEmailException7);
        java.lang.Throwable[] throwableArray9 = duplicateEmailException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test058");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test059");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException2);
        java.lang.Throwable[] throwableArray4 = accountException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test060");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException6);
        verificationException2.addSuppressed((java.lang.Throwable) verificationException6);
        scheduler.exception.ProfileException profileException15 = new scheduler.exception.ProfileException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) verificationException6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test061");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray3 = authenticationException2.getSuppressed();
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException2);
        java.lang.Throwable[] throwableArray5 = accountException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test062");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray3 = authenticationException2.getSuppressed();
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) authenticationException2);
        java.lang.String str5 = authenticationException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.AuthenticationException: " + "'", str5, "scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test063");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("hi!");
        java.lang.Throwable[] throwableArray2 = profileException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = profileException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test064");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Throwable[] throwableArray6 = profileException5.getSuppressed();
        scheduler.exception.VerificationException verificationException9 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException9);
        profileException5.addSuppressed((java.lang.Throwable) verificationException9);
        java.lang.Throwable[] throwableArray12 = verificationException9.getSuppressed();
        java.lang.Class<?> wildcardClass13 = throwableArray12.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test065");
        scheduler.exception.ProfileException profileException2 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) profileException2);
        java.lang.Class<?> wildcardClass4 = accountException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test066");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: hi!");
        java.lang.Throwable[] throwableArray2 = duplicateEmailException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test067");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException6.addSuppressed((java.lang.Throwable) verificationException10);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException10);
        java.lang.String str14 = profileException13.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.ProfileException: " + "'", str14, "scheduler.exception.ProfileException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test068");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException5 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray9 = authenticationException8.getSuppressed();
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException8);
        authenticationException5.addSuppressed((java.lang.Throwable) accountException10);
        verificationException3.addSuppressed((java.lang.Throwable) authenticationException5);
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) authenticationException5);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) accountException13);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test069");
        java.lang.Throwable throwable2 = null;
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("hi!", throwable2);
        scheduler.exception.DuplicateEmailException duplicateEmailException5 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        accountException3.addSuppressed((java.lang.Throwable) duplicateEmailException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException3);
        java.lang.String str8 = profileException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: " + "'", str8, "scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test070");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test071");
        java.lang.Throwable throwable1 = null;
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("", throwable1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test072");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException8);
        verificationException4.addSuppressed((java.lang.Throwable) accountException9);
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException4);
        java.lang.Throwable[] throwableArray12 = verificationException4.getSuppressed();
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException4);
        java.lang.Class<?> wildcardClass14 = verificationException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test073");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException2);
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray11 = authenticationException10.getSuppressed();
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException10);
        authenticationException7.addSuppressed((java.lang.Throwable) accountException12);
        verificationException5.addSuppressed((java.lang.Throwable) authenticationException7);
        authenticationException2.addSuppressed((java.lang.Throwable) verificationException5);
        java.lang.Throwable[] throwableArray16 = verificationException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test074");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException9);
        verificationException5.addSuppressed((java.lang.Throwable) accountException10);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException5);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) profileException12);
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) profileException12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test075");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.VerificationException: ");
        java.lang.String str2 = authenticationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: " + "'", str2, "scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test076");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException8);
        verificationException4.addSuppressed((java.lang.Throwable) accountException9);
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException4);
        java.lang.Throwable[] throwableArray12 = verificationException4.getSuppressed();
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) verificationException4);
        java.lang.Class<?> wildcardClass14 = verificationException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test077");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test078");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test079");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test080");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException4);
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: ");
        accountException4.addSuppressed((java.lang.Throwable) verificationException7);
        profileException1.addSuppressed((java.lang.Throwable) accountException4);
        java.lang.Throwable[] throwableArray10 = accountException4.getSuppressed();
        scheduler.exception.VerificationException verificationException16 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException16);
        scheduler.exception.AuthenticationException authenticationException20 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException21 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException20);
        verificationException16.addSuppressed((java.lang.Throwable) accountException21);
        scheduler.exception.ProfileException profileException23 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException16);
        java.lang.Throwable[] throwableArray24 = verificationException16.getSuppressed();
        scheduler.exception.AccountException accountException25 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException16);
        scheduler.exception.ProfileException profileException26 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException25);
        accountException4.addSuppressed((java.lang.Throwable) accountException25);
        java.lang.Throwable[] throwableArray28 = accountException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test081");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test082");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test083");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test084");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Throwable[] throwableArray6 = profileException5.getSuppressed();
        scheduler.exception.VerificationException verificationException9 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException9);
        profileException5.addSuppressed((java.lang.Throwable) verificationException9);
        java.lang.Class<?> wildcardClass12 = profileException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test085");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException4);
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: ");
        accountException4.addSuppressed((java.lang.Throwable) verificationException7);
        profileException1.addSuppressed((java.lang.Throwable) accountException4);
        scheduler.exception.DuplicateEmailException duplicateEmailException13 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException13);
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("", (java.lang.Throwable) duplicateEmailException13);
        accountException4.addSuppressed((java.lang.Throwable) accountException15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test086");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray4 = authenticationException3.getSuppressed();
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException3);
        java.lang.Throwable[] throwableArray6 = authenticationException3.getSuppressed();
        scheduler.exception.DuplicateEmailException duplicateEmailException8 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        authenticationException3.addSuppressed((java.lang.Throwable) duplicateEmailException8);
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) authenticationException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test087");
        java.lang.Throwable throwable1 = null;
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ", throwable1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test088");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException7);
        verificationException3.addSuppressed((java.lang.Throwable) accountException8);
        java.lang.Throwable[] throwableArray10 = accountException8.getSuppressed();
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException8);
        java.lang.Throwable[] throwableArray12 = accountException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test089");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException2);
        java.lang.Throwable[] throwableArray4 = accountException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test090");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        java.lang.String str2 = authenticationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: " + "'", str2, "scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test091");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException2);
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray11 = authenticationException10.getSuppressed();
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException10);
        authenticationException7.addSuppressed((java.lang.Throwable) accountException12);
        verificationException5.addSuppressed((java.lang.Throwable) authenticationException7);
        authenticationException2.addSuppressed((java.lang.Throwable) verificationException5);
        java.lang.String str16 = verificationException5.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.VerificationException: " + "'", str16, "scheduler.exception.VerificationException: ");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test092");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException2);
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: ");
        accountException2.addSuppressed((java.lang.Throwable) verificationException5);
        java.lang.Class<?> wildcardClass7 = accountException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test093");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException4);
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: ");
        accountException4.addSuppressed((java.lang.Throwable) verificationException7);
        profileException1.addSuppressed((java.lang.Throwable) accountException4);
        java.lang.Throwable[] throwableArray10 = accountException4.getSuppressed();
        scheduler.exception.VerificationException verificationException16 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException16);
        scheduler.exception.AuthenticationException authenticationException20 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException21 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException20);
        verificationException16.addSuppressed((java.lang.Throwable) accountException21);
        scheduler.exception.ProfileException profileException23 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException16);
        java.lang.Throwable[] throwableArray24 = verificationException16.getSuppressed();
        scheduler.exception.AccountException accountException25 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException16);
        scheduler.exception.ProfileException profileException26 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException25);
        accountException4.addSuppressed((java.lang.Throwable) accountException25);
        scheduler.exception.VerificationException verificationException30 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException31 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException30);
        scheduler.exception.AuthenticationException authenticationException34 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException35 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException34);
        verificationException30.addSuppressed((java.lang.Throwable) accountException35);
        java.lang.Throwable[] throwableArray37 = accountException35.getSuppressed();
        accountException25.addSuppressed((java.lang.Throwable) accountException35);
        java.lang.Class<?> wildcardClass39 = accountException35.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertArrayEquals(throwableArray37, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test094");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException6);
        java.lang.Throwable[] throwableArray8 = profileException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test095");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ");
        java.lang.Throwable[] throwableArray2 = accountException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test096");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.ProfileException: ");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test097");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        java.lang.Throwable[] throwableArray2 = accountException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test098");
        scheduler.exception.DuplicateEmailException duplicateEmailException4 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ");
        duplicateEmailException4.addSuppressed((java.lang.Throwable) profileException9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test099");
        scheduler.exception.DuplicateEmailException duplicateEmailException3 = new scheduler.exception.DuplicateEmailException("hi!");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) duplicateEmailException3);
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) accountException4);
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException11);
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException12);
        accountException5.addSuppressed((java.lang.Throwable) profileException12);
        java.lang.String str15 = profileException12.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "scheduler.exception.ProfileException: " + "'", str15, "scheduler.exception.ProfileException: ");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test100");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException2);
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: ");
        accountException2.addSuppressed((java.lang.Throwable) verificationException5);
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray12 = authenticationException11.getSuppressed();
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException11);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException11);
        scheduler.exception.ProfileException profileException15 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException11);
        accountException2.addSuppressed((java.lang.Throwable) authenticationException11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test101");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.AuthenticationException: hi!");
        java.lang.Class<?> wildcardClass2 = verificationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test102");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test103");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException6);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) profileException13);
        accountException1.addSuppressed((java.lang.Throwable) profileException13);
        java.lang.Class<?> wildcardClass16 = accountException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test104");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException6);
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException7);
        scheduler.exception.DuplicateEmailException duplicateEmailException11 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException11);
        scheduler.exception.VerificationException verificationException16 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException16);
        scheduler.exception.AuthenticationException authenticationException20 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException21 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException20);
        verificationException16.addSuppressed((java.lang.Throwable) accountException21);
        scheduler.exception.ProfileException profileException23 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException16);
        java.lang.Throwable[] throwableArray24 = verificationException16.getSuppressed();
        duplicateEmailException11.addSuppressed((java.lang.Throwable) verificationException16);
        profileException7.addSuppressed((java.lang.Throwable) duplicateEmailException11);
        scheduler.exception.AccountException accountException27 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException7);
        java.lang.Throwable[] throwableArray28 = accountException27.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test105");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Throwable[] throwableArray6 = profileException5.getSuppressed();
        scheduler.exception.VerificationException verificationException9 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException9);
        profileException5.addSuppressed((java.lang.Throwable) verificationException9);
        scheduler.exception.AuthenticationException authenticationException14 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException14);
        scheduler.exception.VerificationException verificationException17 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException19 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException22 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray23 = authenticationException22.getSuppressed();
        scheduler.exception.AccountException accountException24 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException22);
        authenticationException19.addSuppressed((java.lang.Throwable) accountException24);
        verificationException17.addSuppressed((java.lang.Throwable) authenticationException19);
        authenticationException14.addSuppressed((java.lang.Throwable) verificationException17);
        profileException5.addSuppressed((java.lang.Throwable) authenticationException14);
        scheduler.exception.DuplicateEmailException duplicateEmailException30 = new scheduler.exception.DuplicateEmailException("scheduler.exception.ProfileException: hi!");
        authenticationException14.addSuppressed((java.lang.Throwable) duplicateEmailException30);
        java.lang.Class<?> wildcardClass32 = duplicateEmailException30.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test106");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test107");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.ProfileException: hi!");
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException7);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException8);
        java.lang.Throwable[] throwableArray10 = profileException9.getSuppressed();
        scheduler.exception.VerificationException verificationException13 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException13);
        profileException9.addSuppressed((java.lang.Throwable) verificationException13);
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException13);
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException13);
        duplicateEmailException1.addSuppressed((java.lang.Throwable) profileException17);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test108");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Throwable[] throwableArray6 = profileException5.getSuppressed();
        scheduler.exception.VerificationException verificationException9 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException9);
        profileException5.addSuppressed((java.lang.Throwable) verificationException9);
        scheduler.exception.AuthenticationException authenticationException14 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException14);
        scheduler.exception.VerificationException verificationException17 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException19 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException22 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray23 = authenticationException22.getSuppressed();
        scheduler.exception.AccountException accountException24 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException22);
        authenticationException19.addSuppressed((java.lang.Throwable) accountException24);
        verificationException17.addSuppressed((java.lang.Throwable) authenticationException19);
        authenticationException14.addSuppressed((java.lang.Throwable) verificationException17);
        profileException5.addSuppressed((java.lang.Throwable) authenticationException14);
        java.lang.String str29 = authenticationException14.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!" + "'", str29, "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test109");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException9);
        verificationException5.addSuppressed((java.lang.Throwable) accountException10);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException5);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) profileException12);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) profileException13);
        java.lang.String str15 = profileException13.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "scheduler.exception.ProfileException: hi!" + "'", str15, "scheduler.exception.ProfileException: hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test110");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test111");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test112");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException6.addSuppressed((java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray13 = verificationException10.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ", (java.lang.Throwable) verificationException10);
        java.lang.Class<?> wildcardClass15 = verificationException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test113");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test114");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException4);
        java.lang.Throwable[] throwableArray9 = profileException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test115");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("hi!");
        java.lang.Throwable[] throwableArray4 = authenticationException3.getSuppressed();
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException3);
        java.lang.Throwable[] throwableArray6 = accountException5.getSuppressed();
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) accountException5);
        scheduler.exception.DuplicateEmailException duplicateEmailException12 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException12);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException12);
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException12);
        accountException5.addSuppressed((java.lang.Throwable) duplicateEmailException12);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test116");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("");
        java.lang.Class<?> wildcardClass2 = authenticationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test117");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException6.addSuppressed((java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray13 = verificationException10.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) verificationException10);
        java.lang.Class<?> wildcardClass15 = accountException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test118");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: ");
        java.lang.Throwable[] throwableArray2 = duplicateEmailException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test119");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("", (java.lang.Throwable) accountException2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test120");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Throwable[] throwableArray6 = profileException5.getSuppressed();
        scheduler.exception.VerificationException verificationException9 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException9);
        profileException5.addSuppressed((java.lang.Throwable) verificationException9);
        java.lang.Throwable[] throwableArray12 = verificationException9.getSuppressed();
        java.lang.String str13 = verificationException9.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.VerificationException: " + "'", str13, "scheduler.exception.VerificationException: ");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test121");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test122");
        scheduler.exception.DuplicateEmailException duplicateEmailException4 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) duplicateEmailException4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test123");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: hi!");
        profileException1.addSuppressed((java.lang.Throwable) verificationException3);
        java.lang.String str5 = profileException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.ProfileException: " + "'", str5, "scheduler.exception.ProfileException: ");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test124");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test125");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException6);
        java.lang.Throwable[] throwableArray14 = verificationException6.getSuppressed();
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException6);
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("", (java.lang.Throwable) accountException15);
        scheduler.exception.AccountException accountException17 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException15);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test126");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException6.addSuppressed((java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray13 = verificationException10.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ", (java.lang.Throwable) verificationException10);
        scheduler.exception.DuplicateEmailException duplicateEmailException17 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.ProfileException profileException18 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ", (java.lang.Throwable) duplicateEmailException17);
        accountException14.addSuppressed((java.lang.Throwable) profileException18);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test127");
        scheduler.exception.DuplicateEmailException duplicateEmailException3 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ", (java.lang.Throwable) duplicateEmailException3);
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) profileException4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test128");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AccountException: hi!");
        java.lang.Throwable[] throwableArray2 = accountException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test129");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("hi!");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = authenticationException1.getSuppressed();
        java.lang.Class<?> wildcardClass4 = authenticationException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test130");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException3);
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test131");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test132");
        scheduler.exception.AuthenticationException authenticationException5 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray6 = authenticationException5.getSuppressed();
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException5);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException5);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException5);
        scheduler.exception.AuthenticationException authenticationException12 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException16 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException16);
        scheduler.exception.AuthenticationException authenticationException20 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException21 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException20);
        verificationException16.addSuppressed((java.lang.Throwable) accountException21);
        java.lang.Throwable[] throwableArray23 = accountException21.getSuppressed();
        scheduler.exception.AccountException accountException24 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException21);
        authenticationException12.addSuppressed((java.lang.Throwable) accountException24);
        scheduler.exception.ProfileException profileException26 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException12);
        authenticationException5.addSuppressed((java.lang.Throwable) authenticationException12);
        scheduler.exception.ProfileException profileException28 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) authenticationException12);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertArrayEquals(throwableArray23, new java.lang.Throwable[] {});
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test133");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("hi!");
        java.lang.Class<?> wildcardClass2 = verificationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test134");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException2);
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException7);
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException11);
        verificationException7.addSuppressed((java.lang.Throwable) accountException12);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException7);
        java.lang.Throwable[] throwableArray15 = verificationException7.getSuppressed();
        duplicateEmailException2.addSuppressed((java.lang.Throwable) verificationException7);
        java.lang.Class<?> wildcardClass17 = verificationException7.getClass();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test135");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException7);
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException8);
        scheduler.exception.DuplicateEmailException duplicateEmailException12 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException12);
        scheduler.exception.VerificationException verificationException17 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException18 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException17);
        scheduler.exception.AuthenticationException authenticationException21 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException22 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException21);
        verificationException17.addSuppressed((java.lang.Throwable) accountException22);
        scheduler.exception.ProfileException profileException24 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException17);
        java.lang.Throwable[] throwableArray25 = verificationException17.getSuppressed();
        duplicateEmailException12.addSuppressed((java.lang.Throwable) verificationException17);
        profileException8.addSuppressed((java.lang.Throwable) duplicateEmailException12);
        scheduler.exception.ProfileException profileException28 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException8);
        scheduler.exception.ProfileException profileException29 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException8);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test136");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test137");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test138");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray4 = authenticationException3.getSuppressed();
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException3);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException3);
        java.lang.String str7 = profileException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.AuthenticationException: " + "'", str7, "scheduler.exception.ProfileException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test139");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException6.addSuppressed((java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray13 = verificationException10.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ", (java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray15 = accountException14.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test140");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
        accountException1.addSuppressed((java.lang.Throwable) accountException3);
        java.lang.String str5 = accountException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: " + "'", str5, "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test141");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException5 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray6 = authenticationException5.getSuppressed();
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException5);
        authenticationException2.addSuppressed((java.lang.Throwable) accountException7);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) accountException7);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ");
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException16 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException15);
        scheduler.exception.VerificationException verificationException18 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: ");
        accountException15.addSuppressed((java.lang.Throwable) verificationException18);
        profileException12.addSuppressed((java.lang.Throwable) accountException15);
        java.lang.Throwable[] throwableArray21 = accountException15.getSuppressed();
        scheduler.exception.VerificationException verificationException27 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException28 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException27);
        scheduler.exception.AuthenticationException authenticationException31 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException32 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException31);
        verificationException27.addSuppressed((java.lang.Throwable) accountException32);
        scheduler.exception.ProfileException profileException34 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException27);
        java.lang.Throwable[] throwableArray35 = verificationException27.getSuppressed();
        scheduler.exception.AccountException accountException36 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException27);
        scheduler.exception.ProfileException profileException37 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException36);
        accountException15.addSuppressed((java.lang.Throwable) accountException36);
        scheduler.exception.AccountException accountException39 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) accountException15);
        accountException7.addSuppressed((java.lang.Throwable) accountException15);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test142");
        scheduler.exception.ProfileException profileException2 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) profileException2);
        scheduler.exception.AuthenticationException authenticationException5 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        accountException3.addSuppressed((java.lang.Throwable) authenticationException5);
        java.lang.Class<?> wildcardClass7 = accountException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test143");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test144");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException8 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException8);
        scheduler.exception.AuthenticationException authenticationException12 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException12);
        verificationException8.addSuppressed((java.lang.Throwable) accountException13);
        scheduler.exception.ProfileException profileException15 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException8);
        java.lang.Throwable[] throwableArray16 = verificationException8.getSuppressed();
        scheduler.exception.AccountException accountException17 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException8);
        scheduler.exception.ProfileException profileException18 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException17);
        scheduler.exception.AccountException accountException19 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException17);
        accountException1.addSuppressed((java.lang.Throwable) accountException17);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test145");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException2);
        scheduler.exception.VerificationException verificationException9 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException9);
        scheduler.exception.AuthenticationException authenticationException13 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException13);
        verificationException9.addSuppressed((java.lang.Throwable) accountException14);
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException9);
        java.lang.Throwable[] throwableArray17 = verificationException9.getSuppressed();
        scheduler.exception.AccountException accountException18 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException9);
        scheduler.exception.AccountException accountException19 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) accountException18);
        accountException2.addSuppressed((java.lang.Throwable) accountException18);
        java.lang.Throwable throwable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountException2.addSuppressed(throwable21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test146");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) profileException4);
        java.lang.String str6 = profileException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.ProfileException: " + "'", str6, "scheduler.exception.ProfileException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test147");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: ");
        java.lang.Throwable[] throwableArray3 = duplicateEmailException2.getSuppressed();
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test148");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test149");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray8 = authenticationException7.getSuppressed();
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException7);
        authenticationException4.addSuppressed((java.lang.Throwable) accountException9);
        verificationException2.addSuppressed((java.lang.Throwable) authenticationException4);
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) authenticationException4);
        java.lang.String str13 = authenticationException4.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.AuthenticationException: " + "'", str13, "scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test150");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        java.lang.Class<?> wildcardClass2 = authenticationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test151");
        scheduler.exception.DuplicateEmailException duplicateEmailException4 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        java.lang.String str8 = accountException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: " + "'", str8, "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test152");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException2);
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: ");
        accountException2.addSuppressed((java.lang.Throwable) verificationException5);
        java.lang.Throwable[] throwableArray7 = accountException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test153");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test154");
        scheduler.exception.DuplicateEmailException duplicateEmailException5 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ", (java.lang.Throwable) duplicateEmailException5);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException6);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) accountException7);
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) accountException7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test155");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.ProfileException: hi!");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException4);
        duplicateEmailException1.addSuppressed((java.lang.Throwable) profileException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("scheduler.exception.VerificationException: ");
        java.lang.Throwable[] throwableArray10 = authenticationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = authenticationException9.getSuppressed();
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) authenticationException9);
        profileException5.addSuppressed((java.lang.Throwable) authenticationException9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test156");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException2);
        scheduler.exception.VerificationException verificationException9 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException9);
        scheduler.exception.AuthenticationException authenticationException13 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException13);
        verificationException9.addSuppressed((java.lang.Throwable) accountException14);
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException9);
        java.lang.Throwable[] throwableArray17 = verificationException9.getSuppressed();
        scheduler.exception.AccountException accountException18 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException9);
        scheduler.exception.AccountException accountException19 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) accountException18);
        accountException2.addSuppressed((java.lang.Throwable) accountException18);
        scheduler.exception.AuthenticationException authenticationException23 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException26 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray27 = authenticationException26.getSuppressed();
        scheduler.exception.AccountException accountException28 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException26);
        authenticationException23.addSuppressed((java.lang.Throwable) accountException28);
        scheduler.exception.ProfileException profileException30 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) accountException28);
        scheduler.exception.AuthenticationException authenticationException33 = new scheduler.exception.AuthenticationException("scheduler.exception.VerificationException: ");
        java.lang.Throwable[] throwableArray34 = authenticationException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = authenticationException33.getSuppressed();
        scheduler.exception.AccountException accountException36 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) authenticationException33);
        profileException30.addSuppressed((java.lang.Throwable) accountException36);
        accountException18.addSuppressed((java.lang.Throwable) accountException36);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertArrayEquals(throwableArray34, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] {});
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test157");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException8);
        profileException5.addSuppressed((java.lang.Throwable) authenticationException8);
        java.lang.String str11 = authenticationException8.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!" + "'", str11, "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test158");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        java.lang.Class<?> wildcardClass2 = accountException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test159");
        scheduler.exception.AuthenticationException authenticationException5 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray6 = authenticationException5.getSuppressed();
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException5);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) accountException7);
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ", (java.lang.Throwable) accountException7);
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) accountException7);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test160");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test161");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test162");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException4);
        java.lang.Class<?> wildcardClass9 = profileException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test163");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test164");
        scheduler.exception.DuplicateEmailException duplicateEmailException3 = new scheduler.exception.DuplicateEmailException("hi!");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) duplicateEmailException3);
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) accountException4);
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException11);
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException12);
        accountException5.addSuppressed((java.lang.Throwable) profileException12);
        scheduler.exception.DuplicateEmailException duplicateEmailException16 = new scheduler.exception.DuplicateEmailException("");
        profileException12.addSuppressed((java.lang.Throwable) duplicateEmailException16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test165");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test166");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: ");
        java.lang.String str2 = duplicateEmailException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.VerificationException: ." + "'", str2, "scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.VerificationException: .");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test167");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: hi!");
        scheduler.exception.DuplicateEmailException duplicateEmailException3 = new scheduler.exception.DuplicateEmailException("scheduler.exception.ProfileException: ");
        duplicateEmailException1.addSuppressed((java.lang.Throwable) duplicateEmailException3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test168");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("hi!");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        java.lang.Throwable[] throwableArray7 = authenticationException4.getSuppressed();
        accountException1.addSuppressed((java.lang.Throwable) authenticationException4);
        java.lang.Throwable[] throwableArray9 = authenticationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test169");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException9);
        profileException6.addSuppressed((java.lang.Throwable) authenticationException9);
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) authenticationException9);
        java.lang.String str13 = accountException12.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: hi!" + "'", str13, "scheduler.exception.AccountException: scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test170");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("scheduler.exception.VerificationException: ");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) authenticationException4);
        authenticationException1.addSuppressed((java.lang.Throwable) authenticationException4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test171");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException2);
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException7);
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException11);
        verificationException7.addSuppressed((java.lang.Throwable) accountException12);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException7);
        java.lang.Throwable[] throwableArray15 = verificationException7.getSuppressed();
        duplicateEmailException2.addSuppressed((java.lang.Throwable) verificationException7);
        java.lang.Throwable[] throwableArray17 = verificationException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test172");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException4);
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException15 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException15);
        scheduler.exception.AuthenticationException authenticationException19 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException20 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException19);
        verificationException15.addSuppressed((java.lang.Throwable) accountException20);
        java.lang.Throwable[] throwableArray22 = accountException20.getSuppressed();
        scheduler.exception.AccountException accountException23 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException20);
        authenticationException11.addSuppressed((java.lang.Throwable) accountException23);
        scheduler.exception.ProfileException profileException25 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException11);
        authenticationException4.addSuppressed((java.lang.Throwable) authenticationException11);
        java.lang.Class<?> wildcardClass27 = authenticationException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test173");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException7);
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException8);
        scheduler.exception.DuplicateEmailException duplicateEmailException12 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException12);
        scheduler.exception.VerificationException verificationException17 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException18 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException17);
        scheduler.exception.AuthenticationException authenticationException21 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException22 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException21);
        verificationException17.addSuppressed((java.lang.Throwable) accountException22);
        scheduler.exception.ProfileException profileException24 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException17);
        java.lang.Throwable[] throwableArray25 = verificationException17.getSuppressed();
        duplicateEmailException12.addSuppressed((java.lang.Throwable) verificationException17);
        profileException8.addSuppressed((java.lang.Throwable) duplicateEmailException12);
        scheduler.exception.ProfileException profileException28 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException8);
        scheduler.exception.AccountException accountException29 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) profileException28);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test174");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test175");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException2);
        java.lang.String str4 = verificationException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "scheduler.exception.VerificationException: " + "'", str4, "scheduler.exception.VerificationException: ");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test176");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        java.lang.Class<?> wildcardClass2 = authenticationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test177");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException6);
        scheduler.exception.VerificationException verificationException12 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException12);
        scheduler.exception.AuthenticationException authenticationException16 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException17 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException16);
        verificationException12.addSuppressed((java.lang.Throwable) accountException17);
        scheduler.exception.ProfileException profileException19 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException12);
        java.lang.Throwable[] throwableArray20 = verificationException12.getSuppressed();
        scheduler.exception.AccountException accountException21 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException12);
        profileException6.addSuppressed((java.lang.Throwable) accountException21);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test178");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) profileException4);
        java.lang.Throwable[] throwableArray6 = profileException5.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test179");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: hi!");
        profileException1.addSuppressed((java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: hi!");
        verificationException3.addSuppressed((java.lang.Throwable) profileException6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test180");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AccountException: ");
        java.lang.Class<?> wildcardClass2 = duplicateEmailException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test181");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.ProfileException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test182");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("", (java.lang.Throwable) accountException2);
        java.lang.Class<?> wildcardClass4 = accountException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test183");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ");
        java.lang.String str2 = accountException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.AccountException: scheduler.exception.ProfileException: " + "'", str2, "scheduler.exception.AccountException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test184");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("scheduler.exception.VerificationException: ");
        java.lang.Throwable[] throwableArray4 = authenticationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = authenticationException3.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) authenticationException3);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) accountException6);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test185");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test186");
        scheduler.exception.DuplicateEmailException duplicateEmailException3 = new scheduler.exception.DuplicateEmailException("hi!");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) duplicateEmailException3);
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) accountException4);
        java.lang.Throwable[] throwableArray6 = accountException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test187");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test188");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: ");
        java.lang.Throwable[] throwableArray2 = duplicateEmailException1.getSuppressed();
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException6);
        duplicateEmailException1.addSuppressed((java.lang.Throwable) verificationException6);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test189");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException6);
        scheduler.exception.DuplicateEmailException duplicateEmailException10 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException10);
        scheduler.exception.VerificationException verificationException15 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException15);
        scheduler.exception.AuthenticationException authenticationException19 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException20 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException19);
        verificationException15.addSuppressed((java.lang.Throwable) accountException20);
        scheduler.exception.ProfileException profileException22 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException15);
        java.lang.Throwable[] throwableArray23 = verificationException15.getSuppressed();
        duplicateEmailException10.addSuppressed((java.lang.Throwable) verificationException15);
        profileException6.addSuppressed((java.lang.Throwable) duplicateEmailException10);
        scheduler.exception.VerificationException verificationException27 = new scheduler.exception.VerificationException("hi!");
        java.lang.Throwable[] throwableArray28 = verificationException27.getSuppressed();
        duplicateEmailException10.addSuppressed((java.lang.Throwable) verificationException27);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test190");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException4);
        java.lang.Class<?> wildcardClass9 = authenticationException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test191");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test192");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test193");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: hi!");
        java.lang.String str2 = verificationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.VerificationException: scheduler.exception.AccountException: hi!" + "'", str2, "scheduler.exception.VerificationException: scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test194");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException3);
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        scheduler.exception.AuthenticationException authenticationException14 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException14);
        verificationException10.addSuppressed((java.lang.Throwable) accountException15);
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray18 = verificationException10.getSuppressed();
        scheduler.exception.AccountException accountException19 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException10);
        scheduler.exception.AccountException accountException20 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) accountException19);
        accountException3.addSuppressed((java.lang.Throwable) accountException19);
        scheduler.exception.AccountException accountException22 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) accountException19);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test195");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException6);
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException7);
        scheduler.exception.DuplicateEmailException duplicateEmailException11 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException11);
        scheduler.exception.VerificationException verificationException16 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException16);
        scheduler.exception.AuthenticationException authenticationException20 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException21 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException20);
        verificationException16.addSuppressed((java.lang.Throwable) accountException21);
        scheduler.exception.ProfileException profileException23 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException16);
        java.lang.Throwable[] throwableArray24 = verificationException16.getSuppressed();
        duplicateEmailException11.addSuppressed((java.lang.Throwable) verificationException16);
        profileException7.addSuppressed((java.lang.Throwable) duplicateEmailException11);
        scheduler.exception.ProfileException profileException27 = new scheduler.exception.ProfileException("", (java.lang.Throwable) duplicateEmailException11);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test196");
        scheduler.exception.AuthenticationException authenticationException5 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray6 = authenticationException5.getSuppressed();
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException5);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException5);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException5);
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) profileException9);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test197");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException2);
        java.lang.Throwable[] throwableArray4 = verificationException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test198");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        java.lang.Throwable[] throwableArray2 = accountException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = accountException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test199");
        java.lang.Throwable throwable3 = null;
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("hi!", throwable3);
        scheduler.exception.DuplicateEmailException duplicateEmailException6 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        accountException4.addSuppressed((java.lang.Throwable) duplicateEmailException6);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException4);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!", (java.lang.Throwable) profileException8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test200");
        java.lang.Throwable throwable1 = null;
        scheduler.exception.ProfileException profileException2 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", throwable1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test201");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException8);
        profileException5.addSuppressed((java.lang.Throwable) authenticationException8);
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException13);
        authenticationException8.addSuppressed((java.lang.Throwable) profileException14);
        java.lang.Class<?> wildcardClass16 = profileException14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test202");
        scheduler.exception.DuplicateEmailException duplicateEmailException4 = new scheduler.exception.DuplicateEmailException("");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test203");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        java.lang.Class<?> wildcardClass2 = accountException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test204");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("hi!");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test205");
        java.lang.Throwable throwable1 = null;
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", throwable1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test206");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test207");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("scheduler.exception.ProfileException: hi!");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException5);
        duplicateEmailException2.addSuppressed((java.lang.Throwable) profileException6);
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) duplicateEmailException2);
        java.lang.Class<?> wildcardClass9 = accountException8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test208");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
        accountException3.addSuppressed((java.lang.Throwable) accountException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException3);
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test209");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException6);
        java.lang.Throwable[] throwableArray8 = profileException7.getSuppressed();
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) profileException7);
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) profileException9);
        java.lang.String str11 = profileException9.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.ProfileException: " + "'", str11, "scheduler.exception.ProfileException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test210");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException6);
        java.lang.Throwable[] throwableArray14 = verificationException6.getSuppressed();
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException6);
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("", (java.lang.Throwable) accountException15);
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) accountException15);
        java.lang.Throwable[] throwableArray18 = profileException17.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test211");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException6);
        java.lang.Throwable[] throwableArray8 = profileException7.getSuppressed();
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) profileException7);
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) profileException9);
        java.lang.Class<?> wildcardClass11 = profileException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test212");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException6 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray7 = authenticationException6.getSuppressed();
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException6);
        authenticationException3.addSuppressed((java.lang.Throwable) accountException8);
        verificationException1.addSuppressed((java.lang.Throwable) authenticationException3);
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("hi!");
        authenticationException3.addSuppressed((java.lang.Throwable) accountException12);
        scheduler.exception.VerificationException verificationException17 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException18 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException17);
        scheduler.exception.ProfileException profileException19 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) verificationException17);
        accountException12.addSuppressed((java.lang.Throwable) profileException19);
        java.lang.Throwable[] throwableArray21 = profileException19.getSuppressed();
        scheduler.exception.DuplicateEmailException duplicateEmailException25 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException26 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException25);
        scheduler.exception.ProfileException profileException27 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException25);
        profileException19.addSuppressed((java.lang.Throwable) profileException27);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test213");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException5 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray6 = authenticationException5.getSuppressed();
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException5);
        authenticationException2.addSuppressed((java.lang.Throwable) accountException7);
        java.lang.Throwable[] throwableArray9 = accountException7.getSuppressed();
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) accountException7);
        java.lang.Throwable[] throwableArray11 = profileException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test214");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException7);
        verificationException3.addSuppressed((java.lang.Throwable) accountException8);
        java.lang.Throwable[] throwableArray10 = accountException8.getSuppressed();
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException8);
        java.lang.Class<?> wildcardClass12 = accountException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test215");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        java.lang.Throwable[] throwableArray13 = accountException11.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException11);
        authenticationException2.addSuppressed((java.lang.Throwable) accountException14);
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException2);
        scheduler.exception.ProfileException profileException19 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException20 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException19);
        java.lang.Throwable[] throwableArray21 = profileException19.getSuppressed();
        authenticationException2.addSuppressed((java.lang.Throwable) profileException19);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test216");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = authenticationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test217");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.VerificationException: .");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test218");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("scheduler.exception.ProfileException: hi!");
        verificationException1.addSuppressed((java.lang.Throwable) verificationException3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test219");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test220");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException7 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray8 = authenticationException7.getSuppressed();
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException7);
        authenticationException4.addSuppressed((java.lang.Throwable) accountException9);
        verificationException2.addSuppressed((java.lang.Throwable) authenticationException4);
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("hi!");
        authenticationException4.addSuppressed((java.lang.Throwable) accountException13);
        scheduler.exception.VerificationException verificationException18 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException19 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException18);
        scheduler.exception.ProfileException profileException20 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) verificationException18);
        accountException13.addSuppressed((java.lang.Throwable) profileException20);
        java.lang.Throwable[] throwableArray22 = profileException20.getSuppressed();
        scheduler.exception.VerificationException verificationException27 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException28 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException27);
        scheduler.exception.ProfileException profileException29 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException28);
        scheduler.exception.AccountException accountException30 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException29);
        profileException20.addSuppressed((java.lang.Throwable) accountException30);
        scheduler.exception.ProfileException profileException32 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) profileException20);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test221");
        scheduler.exception.VerificationException verificationException2 = new scheduler.exception.VerificationException("scheduler.exception.ProfileException: ");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) verificationException2);
        java.lang.Throwable throwable5 = null;
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", throwable5);
        scheduler.exception.VerificationException verificationException11 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException11);
        scheduler.exception.AuthenticationException authenticationException15 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException16 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException15);
        verificationException11.addSuppressed((java.lang.Throwable) accountException16);
        java.lang.Throwable[] throwableArray18 = accountException16.getSuppressed();
        scheduler.exception.AccountException accountException19 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException16);
        scheduler.exception.AccountException accountException20 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) accountException16);
        profileException6.addSuppressed((java.lang.Throwable) accountException20);
        profileException3.addSuppressed((java.lang.Throwable) profileException6);
        java.lang.Throwable[] throwableArray23 = profileException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test222");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.ProfileException: hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test223");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException6.addSuppressed((java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray13 = verificationException10.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray15 = accountException14.getSuppressed();
        java.lang.Class<?> wildcardClass16 = accountException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test224");
        java.lang.Throwable throwable3 = null;
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("hi!", throwable3);
        scheduler.exception.DuplicateEmailException duplicateEmailException6 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        accountException4.addSuppressed((java.lang.Throwable) duplicateEmailException6);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) accountException4);
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test225");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        java.lang.Throwable[] throwableArray13 = accountException11.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException11);
        authenticationException2.addSuppressed((java.lang.Throwable) accountException14);
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException2);
        scheduler.exception.AuthenticationException authenticationException19 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray20 = authenticationException19.getSuppressed();
        scheduler.exception.ProfileException profileException21 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) authenticationException19);
        authenticationException2.addSuppressed((java.lang.Throwable) authenticationException19);
        java.lang.String str23 = authenticationException19.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "scheduler.exception.AuthenticationException: " + "'", str23, "scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test226");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException6 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray7 = authenticationException6.getSuppressed();
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException6);
        authenticationException3.addSuppressed((java.lang.Throwable) accountException8);
        verificationException1.addSuppressed((java.lang.Throwable) authenticationException3);
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("hi!");
        authenticationException3.addSuppressed((java.lang.Throwable) accountException12);
        scheduler.exception.VerificationException verificationException17 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException18 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException17);
        scheduler.exception.ProfileException profileException19 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) verificationException17);
        accountException12.addSuppressed((java.lang.Throwable) profileException19);
        java.lang.Throwable[] throwableArray21 = profileException19.getSuppressed();
        scheduler.exception.VerificationException verificationException26 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException27 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException26);
        scheduler.exception.ProfileException profileException28 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException27);
        scheduler.exception.AccountException accountException29 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException28);
        profileException19.addSuppressed((java.lang.Throwable) accountException29);
        java.lang.Class<?> wildcardClass31 = accountException29.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test227");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test228");
        scheduler.exception.ProfileException profileException2 = new scheduler.exception.ProfileException("");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: hi!");
        profileException2.addSuppressed((java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException4);
        java.lang.String str7 = profileException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.AccountException: " + "'", str7, "scheduler.exception.ProfileException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test229");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("hi!");
        java.lang.Throwable[] throwableArray3 = authenticationException2.getSuppressed();
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException2);
        java.lang.String str5 = authenticationException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scheduler.exception.AuthenticationException: hi!" + "'", str5, "scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test230");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException6);
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("hi!", (java.lang.Throwable) profileException13);
        accountException1.addSuppressed((java.lang.Throwable) profileException13);
        scheduler.exception.AccountException accountException17 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!");
        profileException13.addSuppressed((java.lang.Throwable) accountException17);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test231");
        java.lang.Throwable throwable1 = null;
        scheduler.exception.ProfileException profileException2 = new scheduler.exception.ProfileException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.VerificationException: .", throwable1);
        java.lang.Throwable[] throwableArray3 = profileException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test232");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException4);
        java.lang.Throwable[] throwableArray9 = authenticationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test233");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException6);
        scheduler.exception.AuthenticationException authenticationException10 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException11 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException10);
        verificationException6.addSuppressed((java.lang.Throwable) accountException11);
        java.lang.Throwable[] throwableArray13 = accountException11.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException11);
        authenticationException2.addSuppressed((java.lang.Throwable) accountException14);
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException2);
        java.lang.Throwable[] throwableArray17 = authenticationException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test234");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException7.addSuppressed((java.lang.Throwable) verificationException10);
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ", (java.lang.Throwable) profileException7);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test235");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException4);
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException15 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException16 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException15);
        scheduler.exception.AuthenticationException authenticationException19 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException20 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException19);
        verificationException15.addSuppressed((java.lang.Throwable) accountException20);
        java.lang.Throwable[] throwableArray22 = accountException20.getSuppressed();
        scheduler.exception.AccountException accountException23 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException20);
        authenticationException11.addSuppressed((java.lang.Throwable) accountException23);
        scheduler.exception.ProfileException profileException25 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException11);
        authenticationException4.addSuppressed((java.lang.Throwable) authenticationException11);
        java.lang.Class<?> wildcardClass27 = authenticationException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test236");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.ProfileException: hi!");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException4);
        duplicateEmailException1.addSuppressed((java.lang.Throwable) profileException5);
        java.lang.String str7 = duplicateEmailException1.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.ProfileException: hi!." + "'", str7, "scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.ProfileException: hi!.");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test237");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        java.lang.Throwable[] throwableArray6 = profileException5.getSuppressed();
        java.lang.String str7 = profileException5.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scheduler.exception.ProfileException: " + "'", str7, "scheduler.exception.ProfileException: ");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test238");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) duplicateEmailException2);
        java.lang.Class<?> wildcardClass4 = accountException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test239");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException8 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException8);
        scheduler.exception.AuthenticationException authenticationException12 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException12);
        verificationException8.addSuppressed((java.lang.Throwable) accountException13);
        java.lang.Throwable[] throwableArray15 = accountException13.getSuppressed();
        scheduler.exception.AccountException accountException16 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException13);
        authenticationException4.addSuppressed((java.lang.Throwable) accountException16);
        scheduler.exception.ProfileException profileException18 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException4);
        profileException1.addSuppressed((java.lang.Throwable) profileException18);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test240");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test241");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException6);
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException7);
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) accountException8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test242");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException7);
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException11);
        verificationException7.addSuppressed((java.lang.Throwable) accountException12);
        java.lang.Throwable[] throwableArray14 = accountException12.getSuppressed();
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) accountException12);
        authenticationException3.addSuppressed((java.lang.Throwable) accountException15);
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException3);
        scheduler.exception.ProfileException profileException18 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException17);
        java.lang.Class<?> wildcardClass19 = profileException18.getClass();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test243");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException9);
        verificationException5.addSuppressed((java.lang.Throwable) accountException10);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException5);
        verificationException1.addSuppressed((java.lang.Throwable) verificationException5);
        java.lang.Throwable[] throwableArray14 = verificationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test244");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.ProfileException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test245");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.VerificationException: ");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test246");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException8);
        profileException5.addSuppressed((java.lang.Throwable) authenticationException8);
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException13);
        authenticationException8.addSuppressed((java.lang.Throwable) profileException14);
        java.lang.String str16 = authenticationException8.toString();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!" + "'", str16, "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test247");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("hi!");
        java.lang.Throwable[] throwableArray3 = authenticationException2.getSuppressed();
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException2);
        java.lang.Throwable[] throwableArray5 = accountException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = accountException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test248");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        java.lang.String str2 = duplicateEmailException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ." + "'", str2, "scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AccountException: scheduler.exception.AuthenticationException: .");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test249");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test250");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException9);
        profileException6.addSuppressed((java.lang.Throwable) authenticationException9);
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException15 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException14);
        authenticationException9.addSuppressed((java.lang.Throwable) profileException15);
        java.lang.Throwable[] throwableArray17 = authenticationException9.getSuppressed();
        scheduler.exception.AccountException accountException18 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) authenticationException9);
        scheduler.exception.VerificationException verificationException25 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException26 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException25);
        scheduler.exception.AuthenticationException authenticationException29 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException30 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException29);
        verificationException25.addSuppressed((java.lang.Throwable) accountException30);
        scheduler.exception.ProfileException profileException32 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException25);
        java.lang.Throwable[] throwableArray33 = verificationException25.getSuppressed();
        scheduler.exception.AccountException accountException34 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException25);
        scheduler.exception.ProfileException profileException35 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException34);
        scheduler.exception.AccountException accountException36 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException34);
        authenticationException9.addSuppressed((java.lang.Throwable) accountException34);
        java.lang.String str38 = authenticationException9.toString();
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!" + "'", str38, "scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test251");
        scheduler.exception.AccountException accountException2 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.ProfileException: ");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException2);
        java.lang.Class<?> wildcardClass4 = accountException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test252");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test253");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) accountException6);
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ", (java.lang.Throwable) accountException6);
        java.lang.Throwable[] throwableArray9 = accountException6.getSuppressed();
        java.lang.Class<?> wildcardClass10 = accountException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test254");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        profileException6.addSuppressed((java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray13 = verificationException10.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) verificationException10);
        java.lang.Throwable[] throwableArray15 = accountException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = accountException14.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertArrayEquals(throwableArray15, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test255");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test256");
        scheduler.exception.VerificationException verificationException7 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException7);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException8);
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("", (java.lang.Throwable) profileException9);
        scheduler.exception.DuplicateEmailException duplicateEmailException13 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException13);
        scheduler.exception.VerificationException verificationException18 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException19 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException18);
        scheduler.exception.AuthenticationException authenticationException22 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException23 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException22);
        verificationException18.addSuppressed((java.lang.Throwable) accountException23);
        scheduler.exception.ProfileException profileException25 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException18);
        java.lang.Throwable[] throwableArray26 = verificationException18.getSuppressed();
        duplicateEmailException13.addSuppressed((java.lang.Throwable) verificationException18);
        profileException9.addSuppressed((java.lang.Throwable) duplicateEmailException13);
        scheduler.exception.AccountException accountException29 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) duplicateEmailException13);
        scheduler.exception.AccountException accountException30 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) accountException29);
        scheduler.exception.ProfileException profileException31 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) accountException30);
        scheduler.exception.DuplicateEmailException duplicateEmailException35 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.ProfileException profileException36 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ", (java.lang.Throwable) duplicateEmailException35);
        scheduler.exception.AccountException accountException37 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException36);
        accountException30.addSuppressed((java.lang.Throwable) profileException36);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test257");
        scheduler.exception.DuplicateEmailException duplicateEmailException4 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) duplicateEmailException4);
        scheduler.exception.VerificationException verificationException10 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException10);
        scheduler.exception.AuthenticationException authenticationException14 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException14);
        verificationException10.addSuppressed((java.lang.Throwable) accountException15);
        java.lang.Throwable[] throwableArray17 = accountException15.getSuppressed();
        duplicateEmailException4.addSuppressed((java.lang.Throwable) accountException15);
        java.lang.Class<?> wildcardClass19 = accountException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertArrayEquals(throwableArray17, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test258");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException3);
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) accountException3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test259");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.VerificationException: .");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException4);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test260");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException3);
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException8);
        profileException5.addSuppressed((java.lang.Throwable) authenticationException8);
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: ");
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) accountException13);
        authenticationException8.addSuppressed((java.lang.Throwable) profileException14);
        java.lang.Throwable[] throwableArray16 = authenticationException8.getSuppressed();
        java.lang.Throwable[] throwableArray17 = authenticationException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test261");
        scheduler.exception.AuthenticationException authenticationException1 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test262");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException3);
        scheduler.exception.VerificationException verificationException6 = new scheduler.exception.VerificationException("");
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException11 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray12 = authenticationException11.getSuppressed();
        scheduler.exception.AccountException accountException13 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException11);
        authenticationException8.addSuppressed((java.lang.Throwable) accountException13);
        verificationException6.addSuppressed((java.lang.Throwable) authenticationException8);
        authenticationException3.addSuppressed((java.lang.Throwable) verificationException6);
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) verificationException6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test263");
        scheduler.exception.VerificationException verificationException3 = new scheduler.exception.VerificationException("scheduler.exception.AccountException: hi!");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException3);
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test264");
        java.lang.Throwable throwable3 = null;
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("hi!", throwable3);
        scheduler.exception.DuplicateEmailException duplicateEmailException6 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        accountException4.addSuppressed((java.lang.Throwable) duplicateEmailException6);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("", (java.lang.Throwable) accountException4);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test265");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) profileException6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test266");
        scheduler.exception.DuplicateEmailException duplicateEmailException1 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        java.lang.Throwable[] throwableArray2 = duplicateEmailException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test267");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        java.lang.Throwable[] throwableArray7 = profileException6.getSuppressed();
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) profileException6);
        java.lang.Throwable[] throwableArray9 = profileException6.getSuppressed();
        java.lang.Class<?> wildcardClass10 = throwableArray9.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test268");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("");
        scheduler.exception.AuthenticationException authenticationException5 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray6 = authenticationException5.getSuppressed();
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException5);
        authenticationException2.addSuppressed((java.lang.Throwable) accountException7);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) accountException7);
        scheduler.exception.DuplicateEmailException duplicateEmailException14 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.ProfileException profileException15 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ", (java.lang.Throwable) duplicateEmailException14);
        scheduler.exception.AccountException accountException16 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException15);
        scheduler.exception.ProfileException profileException17 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) accountException16);
        profileException9.addSuppressed((java.lang.Throwable) accountException16);
        java.lang.Throwable[] throwableArray19 = profileException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test269");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .");
        scheduler.exception.AuthenticationException authenticationException3 = new scheduler.exception.AuthenticationException("scheduler.exception.AccountException: hi!");
        profileException1.addSuppressed((java.lang.Throwable) authenticationException3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test270");
        scheduler.exception.VerificationException verificationException1 = new scheduler.exception.VerificationException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test271");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("hi!", (java.lang.Throwable) duplicateEmailException2);
        java.lang.String str4 = accountException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "scheduler.exception.AccountException: hi!" + "'", str4, "scheduler.exception.AccountException: hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test272");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException9);
        verificationException5.addSuppressed((java.lang.Throwable) accountException10);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException5);
        java.lang.Throwable[] throwableArray13 = verificationException5.getSuppressed();
        scheduler.exception.ProfileException profileException14 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) verificationException5);
        scheduler.exception.AccountException accountException15 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) verificationException5);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test273");
        scheduler.exception.ProfileException profileException2 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!");
        scheduler.exception.ProfileException profileException3 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) profileException2);
        java.lang.Throwable[] throwableArray4 = profileException3.getSuppressed();
        java.lang.Class<?> wildcardClass5 = profileException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test274");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) authenticationException4);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: hi!", (java.lang.Throwable) authenticationException4);
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.AccountException accountException12 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ");
        accountException10.addSuppressed((java.lang.Throwable) accountException12);
        profileException8.addSuppressed((java.lang.Throwable) accountException12);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test275");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AccountException: scheduler.exception.AuthenticationException: .");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test276");
        scheduler.exception.ProfileException profileException1 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test277");
        java.lang.Throwable throwable2 = null;
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("hi!", throwable2);
        scheduler.exception.DuplicateEmailException duplicateEmailException5 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        accountException3.addSuppressed((java.lang.Throwable) duplicateEmailException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("", (java.lang.Throwable) accountException3);
        java.lang.Throwable[] throwableArray8 = profileException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test278");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) profileException5);
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", (java.lang.Throwable) profileException6);
        java.lang.String str8 = profileException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.AccountException: " + "'", str8, "scheduler.exception.ProfileException: scheduler.exception.AccountException: ");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test279");
        scheduler.exception.DuplicateEmailException duplicateEmailException5 = new scheduler.exception.DuplicateEmailException("scheduler.exception.VerificationException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("scheduler.exception.VerificationException: ", (java.lang.Throwable) duplicateEmailException5);
        scheduler.exception.AccountException accountException7 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) profileException6);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) accountException7);
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) accountException7);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test280");
        scheduler.exception.AuthenticationException authenticationException2 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException9);
        verificationException5.addSuppressed((java.lang.Throwable) accountException10);
        java.lang.Throwable[] throwableArray12 = accountException10.getSuppressed();
        authenticationException2.addSuppressed((java.lang.Throwable) accountException10);
        java.lang.Throwable[] throwableArray14 = accountException10.getSuppressed();
        scheduler.exception.ProfileException profileException15 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException10);
        java.lang.Throwable[] throwableArray16 = accountException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test281");
        scheduler.exception.VerificationException verificationException4 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException5 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException4);
        scheduler.exception.AuthenticationException authenticationException8 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException9 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException8);
        verificationException4.addSuppressed((java.lang.Throwable) accountException9);
        scheduler.exception.ProfileException profileException11 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException4);
        java.lang.Throwable[] throwableArray12 = verificationException4.getSuppressed();
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) verificationException4);
        java.lang.Throwable[] throwableArray14 = verificationException4.getSuppressed();
        java.lang.Throwable[] throwableArray15 = verificationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test282");
        scheduler.exception.VerificationException verificationException5 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException6 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException5);
        scheduler.exception.AuthenticationException authenticationException9 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException10 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException9);
        verificationException5.addSuppressed((java.lang.Throwable) accountException10);
        scheduler.exception.ProfileException profileException12 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException5);
        java.lang.Throwable[] throwableArray13 = verificationException5.getSuppressed();
        scheduler.exception.AccountException accountException14 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ", (java.lang.Throwable) verificationException5);
        scheduler.exception.ProfileException profileException15 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException14);
        java.lang.String str16 = profileException15.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.ProfileException: scheduler.exception.ProfileException: " + "'", str16, "scheduler.exception.ProfileException: scheduler.exception.ProfileException: scheduler.exception.ProfileException: ");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test283");
        scheduler.exception.AuthenticationException authenticationException4 = new scheduler.exception.AuthenticationException("");
        java.lang.Throwable[] throwableArray5 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException6 = new scheduler.exception.AccountException("", (java.lang.Throwable) authenticationException4);
        java.lang.Throwable[] throwableArray7 = authenticationException4.getSuppressed();
        scheduler.exception.AccountException accountException8 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.AuthenticationException: .", (java.lang.Throwable) authenticationException4);
        java.lang.Throwable[] throwableArray9 = authenticationException4.getSuppressed();
        scheduler.exception.ProfileException profileException10 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: hi!", (java.lang.Throwable) authenticationException4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test284");
        java.lang.Throwable throwable3 = null;
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("hi!", throwable3);
        scheduler.exception.DuplicateEmailException duplicateEmailException6 = new scheduler.exception.DuplicateEmailException("scheduler.exception.AuthenticationException: ");
        accountException4.addSuppressed((java.lang.Throwable) duplicateEmailException6);
        scheduler.exception.ProfileException profileException8 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) accountException4);
        scheduler.exception.ProfileException profileException9 = new scheduler.exception.ProfileException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.ProfileException: hi!.", (java.lang.Throwable) profileException8);
        java.lang.String str10 = profileException8.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: " + "'", str10, "scheduler.exception.ProfileException: scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test285");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException4 = new scheduler.exception.AccountException("scheduler.exception.AccountException: ");
        scheduler.exception.AccountException accountException5 = new scheduler.exception.AccountException("", (java.lang.Throwable) accountException4);
        accountException1.addSuppressed((java.lang.Throwable) accountException4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test286");
        java.lang.Throwable throwable3 = null;
        scheduler.exception.ProfileException profileException4 = new scheduler.exception.ProfileException("scheduler.exception.AuthenticationException: ", throwable3);
        java.lang.Throwable throwable6 = null;
        scheduler.exception.ProfileException profileException7 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: ", throwable6);
        scheduler.exception.VerificationException verificationException12 = new scheduler.exception.VerificationException("");
        scheduler.exception.ProfileException profileException13 = new scheduler.exception.ProfileException("", (java.lang.Throwable) verificationException12);
        scheduler.exception.AuthenticationException authenticationException16 = new scheduler.exception.AuthenticationException("hi!");
        scheduler.exception.AccountException accountException17 = new scheduler.exception.AccountException("scheduler.exception.AuthenticationException: ", (java.lang.Throwable) authenticationException16);
        verificationException12.addSuppressed((java.lang.Throwable) accountException17);
        scheduler.exception.ProfileException profileException19 = new scheduler.exception.ProfileException("scheduler.exception.ProfileException: ", (java.lang.Throwable) verificationException12);
        java.lang.Throwable[] throwableArray20 = verificationException12.getSuppressed();
        scheduler.exception.ProfileException profileException21 = new scheduler.exception.ProfileException("scheduler.exception.AccountException: hi!", (java.lang.Throwable) verificationException12);
        profileException7.addSuppressed((java.lang.Throwable) profileException21);
        profileException4.addSuppressed((java.lang.Throwable) profileException7);
        scheduler.exception.AccountException accountException24 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: scheduler.exception.VerificationException: ", (java.lang.Throwable) profileException7);
        scheduler.exception.AccountException accountException25 = new scheduler.exception.AccountException("scheduler.exception.VerificationException: scheduler.exception.ProfileException: ", (java.lang.Throwable) accountException24);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test287");
        scheduler.exception.DuplicateEmailException duplicateEmailException2 = new scheduler.exception.DuplicateEmailException("hi!");
        scheduler.exception.AccountException accountException3 = new scheduler.exception.AccountException("scheduler.exception.AccountException: scheduler.exception.AuthenticationException: ", (java.lang.Throwable) duplicateEmailException2);
        java.lang.Throwable[] throwableArray4 = accountException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionRegressionTest0.test288");
        scheduler.exception.AccountException accountException1 = new scheduler.exception.AccountException("scheduler.exception.DuplicateEmailException: An account already exists for scheduler.exception.ProfileException: hi!.");
    }
}

