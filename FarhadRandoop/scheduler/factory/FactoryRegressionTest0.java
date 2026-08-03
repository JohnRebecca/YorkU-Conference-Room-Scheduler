package scheduler.factory;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FactoryRegressionTest0 {

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
            System.out.format("%n%s%n", "FactoryRegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test02");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "", "hi!", "hi!", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test03");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        java.lang.Class<?> wildcardClass1 = registeredUserFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test04");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("", "", "hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test05");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "hi!", "hi!", "hi!", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test06");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("hi!", "hi!", "hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student, employee, or organization ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test07");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "", "", "hi!", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test08");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("", "", "", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test09");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "", "hi!", "", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test10");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("hi!", "", "", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test11");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "hi!", "", "hi!", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test12");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "", "", "", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test13");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("", "", "", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test14");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "hi!", "", "hi!", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test15");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("hi!", "hi!", "", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student, employee, or organization ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test16");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "hi!", "hi!", "hi!", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Account status is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test17");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("hi!", "", "hi!", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test18");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("", "", "hi!", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test19");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("hi!", "hi!", "", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Account type is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test20");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "", "", "hi!", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test21");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "", "", "hi!", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test22");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "hi!", "hi!", "hi!", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test23");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "hi!", "hi!", "", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test24");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("", "hi!", "hi!", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test25");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("", "hi!", "", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test26");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("", "hi!", "", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test27");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "", "hi!", "hi!", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test28");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("", "hi!", "hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test29");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "", "", "", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test30");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "", "hi!", "hi!", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test31");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "", "hi!", "", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test32");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("hi!", "", "", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test33");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("hi!", "hi!", "hi!", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Account type is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test34");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "hi!", "hi!", "hi!", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Account status is required.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test35");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "", "", "", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test36");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "hi!", "hi!", "", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password hash is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test37");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "", "hi!", "", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test38");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "hi!", "hi!", "", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test39");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "", "", "", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test40");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "hi!", "", "", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test41");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountType accountType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser6 = registeredUserFactory0.createUser("hi!", "", "hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test42");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "", "hi!", "hi!", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test43");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "", "", "hi!", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Full name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test44");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "hi!", "hi!", "", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password hash is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test45");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "hi!", "", "", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test46");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "hi!", "", "hi!", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test47");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "hi!", "", "", accountStatus5, localDateTime6, "", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test48");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "hi!", "", "hi!", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test49");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("hi!", "hi!", "", "", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FactoryRegressionTest0.test50");
        scheduler.factory.RegisteredUserFactory registeredUserFactory0 = new scheduler.factory.RegisteredUserFactory();
        scheduler.model.AccountStatus accountStatus5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        scheduler.model.AccountType accountType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.model.RegisteredUser registeredUser9 = registeredUserFactory0.buildUser("", "", "hi!", "", accountStatus5, localDateTime6, "hi!", accountType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User ID is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

