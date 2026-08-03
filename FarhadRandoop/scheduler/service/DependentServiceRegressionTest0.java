package scheduler.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DependentServiceRegressionTest0 {

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
            System.out.format("%n%s%n", "DependentServiceRegressionTest0.test1");
        scheduler.repository.UserRepository userRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.service.AuthenticationService authenticationService1 = new scheduler.service.AuthenticationService(userRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DependentServiceRegressionTest0.test2");
        scheduler.repository.UserRepository userRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.service.ProfileService profileService1 = new scheduler.service.ProfileService(userRepository0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User repository is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DependentServiceRegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DependentServiceRegressionTest0.test4");
        scheduler.repository.UserRepository userRepository0 = null;
        scheduler.repository.AccountTypeRepository accountTypeRepository1 = null;
        scheduler.service.VerificationService verificationService2 = null;
        scheduler.factory.AccountFactory accountFactory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.service.AccountRegistrationService accountRegistrationService4 = new scheduler.service.AccountRegistrationService(userRepository0, accountTypeRepository1, verificationService2, accountFactory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

