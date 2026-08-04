package scheduler.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModelRegressionTest0 {

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
            System.out.format("%n%s%n", "ModelRegressionTest0.test001");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) '#', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test002");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "", "hi!", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test003");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (byte) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test004");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test006");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 100.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test007");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "", "", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test008");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (short) -1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test009");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "", "hi!", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test010");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (short) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test011");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) '#', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test012");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) '#', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test013");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (-1), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test014");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "", "hi!", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test015");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 10L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test016");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "hi!", "hi!", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test017");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (short) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test018");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test019");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (byte) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test020");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "hi!", "hi!", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test021");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "hi!", "", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test022");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "hi!", "", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test023");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) ' ', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test024");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "hi!", "", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password hash is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test025");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", 10.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test026");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", 0.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test027");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (-1L), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test028");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "", "hi!", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test029");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 10L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test030");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", 100.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test031");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (-1.0f), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test032");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "hi!", "hi!", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test033");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) '#', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test034");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "", "", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test035");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test036");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 'a', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test037");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (byte) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test038");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (byte) -1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test039");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (byte) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test040");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "hi!", "hi!", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test041");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (byte) -1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hourly rate cannot be negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test042");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 'a', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test043");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (short) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test044");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) ' ', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test045");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "", "", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test046");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "", "", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test047");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "", "", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test048");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (-1.0f), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test049");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (-1L), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test050");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 10.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test051");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "", "hi!", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test052");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "hi!", "hi!", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Account status is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test053");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (short) -1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test054");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "hi!", "hi!", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Account status is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test055");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test056");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "hi!", "hi!", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test057");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (-1.0d), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test058");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (short) -1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test059");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 1.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test060");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "hi!", "", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test061");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "hi!", "hi!", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test062");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "", "hi!", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test063");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", 1.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test064");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "", "", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test065");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 10L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test066");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "hi!", "hi!", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test067");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", 0.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test068");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "hi!", "hi!", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test069");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 0L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test070");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "", "hi!", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test071");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "hi!", "", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test072");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "hi!", "hi!", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Account status is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test073");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test074");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (byte) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test075");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 0L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test076");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "", "", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test077");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "", "", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test078");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "", "", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test079");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", 1.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test080");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "hi!", "", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test081");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "hi!", "", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test082");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "", "hi!", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test083");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 0L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test084");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (short) -1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hourly rate cannot be negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test085");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "", "", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test086");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 10.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test087");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (-1.0d), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test088");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "hi!", "", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password hash is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test089");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 1L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test090");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "", "", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test091");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (-1), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test092");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test093");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test094");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 'a', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test095");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "hi!", "", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test096");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "", "", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test097");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", 0.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test098");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 1L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test099");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 100.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test100");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (byte) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test101");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "hi!", "", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password hash is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test102");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "", "hi!", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test103");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (byte) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test104");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", 0.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test105");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "", "hi!", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test106");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "", "hi!", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test107");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 0.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test108");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (short) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test109");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "", "hi!", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test110");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "", "", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test111");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (byte) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test112");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 10L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test113");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "hi!", "", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test114");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "", "", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test115");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 1.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test116");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 100.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test117");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (short) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test118");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "hi!", "", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test119");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 100L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test120");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", 10.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test121");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "hi!", "hi!", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test122");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "", "", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test123");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "hi!", "", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test124");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) ' ', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test125");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 1.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test126");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) '4', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test127");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "hi!", "hi!", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test128");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", 10.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test129");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "", "hi!", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test130");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test131");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test132");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "hi!", "hi!", accountStatus4, localDateTime5, "hi!", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test133");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "", "", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test134");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 10.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test135");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test136");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (short) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test137");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test138");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "hi!", "hi!", "", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test139");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (short) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test140");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 10.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test141");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (short) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test142");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (byte) -1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test143");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (byte) -1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test144");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 100L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test145");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test146");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", 100.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test147");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "hi!", "hi!", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Account status is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test148");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (-1), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test149");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (byte) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test150");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 100.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test151");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test152");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (byte) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test153");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 0.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test154");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("", "", "hi!", "", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test155");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (short) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test156");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 1L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test157");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", 1.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test158");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "", "hi!", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test159");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (short) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test160");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (byte) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test161");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 100L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test162");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (short) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test163");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 100L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test164");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (short) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test165");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "hi!", "", accountStatus4, localDateTime5, "", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password hash is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test166");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", 1.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test167");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (-1L), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test168");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (short) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test169");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", 100.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test170");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "", "hi!", accountStatus4, localDateTime5, "", true, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test171");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (short) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test172");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "hi!", "", "hi!", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test173");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) '4', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test174");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (short) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test175");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (byte) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test176");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (-1.0d), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hourly rate cannot be negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test177");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (-1.0f), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test178");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 0.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test179");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (byte) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test180");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 'a', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test181");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (-1.0f), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hourly rate cannot be negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test182");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (-1.0d), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test183");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 1L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test184");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", 100.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test185");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (-1), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hourly rate cannot be negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test186");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) 1.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test187");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 100, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test188");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", 10.0d, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test189");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) (short) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test190");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (-1L), verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hourly rate cannot be negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test191");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) 0.0f, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test192");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) ' ', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test193");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) '4', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test194");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) '4', verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test195");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 0L, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test196");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "", (double) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test197");
        scheduler.model.AccountStatus accountStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = new scheduler.model.RegisteredUser("hi!", "", "hi!", "hi!", accountStatus4, localDateTime5, "hi!", false, accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test198");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("", "hi!", (double) (byte) 10, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test199");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test200");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "hi!", (double) (byte) 0, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Verification mode is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ModelRegressionTest0.test201");
        scheduler.model.VerificationMode verificationMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.AccountType accountType4 = new scheduler.model.AccountType("hi!", "", (double) (byte) 1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

