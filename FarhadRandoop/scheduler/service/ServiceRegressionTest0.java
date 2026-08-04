package scheduler.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ServiceRegressionTest0 {

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
            System.out.format("%n%s%n", "ServiceRegressionTest0.test1");
        scheduler.service.VerificationService verificationService0 = new scheduler.service.VerificationService();
        java.lang.Class<?> wildcardClass1 = verificationService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ServiceRegressionTest0.test2");
        scheduler.service.VerificationService verificationService0 = new scheduler.service.VerificationService();
        scheduler.model.RegisteredUser registeredUser1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = verificationService0.verifyUniversityAccount(registeredUser1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getEmail()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ServiceRegressionTest0.test3");
        scheduler.service.VerificationService verificationService0 = new scheduler.service.VerificationService();
        scheduler.model.RegisteredUser registeredUser1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = verificationService0.verify(registeredUser1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getAccountType()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ServiceRegressionTest0.test4");
        scheduler.service.VerificationService verificationService0 = new scheduler.service.VerificationService();
        scheduler.model.RegisteredUser registeredUser1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = verificationService0.verifyPartnerAccount(registeredUser1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.RegisteredUser.getIdentificationNumber()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ServiceRegressionTest0.test5");
        scheduler.service.VerificationService verificationService0 = new scheduler.service.VerificationService();
        scheduler.model.AccountType accountType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = verificationService0.expectedIdentificationDescription(accountType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.AccountType.getVerificationMode()\" because \"accountType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ServiceRegressionTest0.test6");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

