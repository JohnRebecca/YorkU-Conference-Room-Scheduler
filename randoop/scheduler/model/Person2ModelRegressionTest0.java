package scheduler.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Person2ModelRegressionTest0 {

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
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test001");
        scheduler.model.Room room4 = new scheduler.model.Room("", 1, "", "");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test002");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (short) 10, "hi!", "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test003");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            chiefEventCoordinator0.generateAdministrator(administrator1);
// flaky "1) test003(scheduler.model.Person2ModelRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test004");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test005");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        room4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test006");
        scheduler.model.Room room4 = new scheduler.model.Room("", (int) (byte) 0, "hi!", "");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test007");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isEnabled();
        boolean boolean9 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test008");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        java.lang.Class<?> wildcardClass20 = administrator14.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test009");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        room4.disable();
        room4.closeForMaintenance();
        int int10 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test010");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        java.lang.String str5 = administrator4.getEmail();
        java.lang.Class<?> wildcardClass6 = administrator4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test011");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) ' ', "", "hi! - hi! -  - Capacity: 0", "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test012");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str8, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test013");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        boolean boolean9 = room4.isAvailableForBooking();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test014");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        java.lang.String str6 = room4.getBuilding();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test015");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        java.lang.String str6 = room4.getBuilding();
        java.lang.String str7 = room4.toString();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test016");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        int int7 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        java.lang.Class<?> wildcardClass9 = administrator5.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test017");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        room4.disable();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test018");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        java.lang.String str7 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test019");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test020");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        boolean boolean7 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test021");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.Class<?> wildcardClass5 = administrator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test022");
        scheduler.model.Room room4 = new scheduler.model.Room("", 0, "hi! - hi! -  - Capacity: 0", "");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test023");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        java.lang.String str6 = room4.getBuilding();
        java.lang.String str7 = room4.getRoomId();
        java.lang.String str8 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test024");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isClosedForMaintenance();
        room4.disable();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test025");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        java.lang.String str7 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test026");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        java.lang.String str8 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test027");
        scheduler.model.Room room4 = new scheduler.model.Room("", (int) (byte) 0, "hi! -  -  - Capacity: 52", "hi! -  -  - Capacity: 52");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test028");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        int int5 = administrator4.getAdminID();
        int int6 = administrator4.getAdminID();
        java.lang.String str7 = administrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test029");
        scheduler.model.Room room4 = new scheduler.model.Room("", 1, "", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        room4.disable();
        int int8 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test030");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getRoomId();
        boolean boolean7 = room4.isAvailableForBooking();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test031");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isClosedForMaintenance();
        room4.disable();
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test032");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator(100, "hi!", "hi!", "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test033");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        room4.disable();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test034");
        scheduler.model.Room room4 = new scheduler.model.Room("", 1, "", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test035");
        scheduler.model.Room room4 = new scheduler.model.Room("", (int) (byte) 1, "", "hi! -  -  - Capacity: 52");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test036");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test037");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test038");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isClosedForMaintenance();
        int int8 = room4.getCapacity();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test039");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        boolean boolean9 = room4.isAvailableForBooking();
        boolean boolean10 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test040");
        scheduler.model.Room room4 = new scheduler.model.Room("", 1, "", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        room4.disable();
        java.lang.String str8 = room4.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test041");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        room4.disable();
        java.lang.String str9 = room4.getBuilding();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test042");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int5 = administrator4.getAdminID();
        int int6 = administrator4.getAdminID();
        java.lang.String str7 = administrator4.getPassword();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test043");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test044");
        scheduler.model.Room room4 = new scheduler.model.Room("", (int) (byte) 100, "hi! - hi! -  - Capacity: 0", "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test045");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test046");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0", (int) '#', "", "hi!");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test047");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.disable();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test048");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getRoomId();
        boolean boolean7 = room4.isAvailableForBooking();
        boolean boolean8 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test049");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        int int7 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator13 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        int int14 = administrator13.getAdminID();
        int int15 = administrator13.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator13);
        java.lang.String str17 = administrator13.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str17, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test050");
        scheduler.model.Room room4 = new scheduler.model.Room("", (int) (short) -1, "hi! -  -  - Capacity: 52", "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test051");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isClosedForMaintenance();
        boolean boolean10 = room4.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test052");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        java.lang.String str6 = room4.getBuilding();
        boolean boolean7 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test053");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        java.lang.String str5 = room4.toString();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str5, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test054");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        room4.closeForMaintenance();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str8, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test055");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) 100, "hi!", "hi! - hi! -  - Capacity: 0", "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test056");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        room4.disable();
        room4.closeForMaintenance();
        boolean boolean10 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test057");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.closeForMaintenance();
        boolean boolean6 = room4.isAvailableForBooking();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test058");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        java.lang.String str28 = administrator24.getName();
        java.lang.Class<?> wildcardClass29 = administrator24.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test059");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        int int5 = administrator4.getAdminID();
        java.lang.String str6 = administrator4.getName();
        java.lang.String str7 = administrator4.getPassword();
        java.lang.String str8 = administrator4.getEmail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test060");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test061");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        room4.enable();
        boolean boolean11 = room4.isClosedForMaintenance();
        boolean boolean12 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test062");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        java.lang.String str7 = room4.getLocation();
        room4.reopenFromMaintenance();
        room4.enable();
        java.lang.String str10 = room4.toString();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str10, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test063");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) '4', "", "");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test064");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        boolean boolean13 = room4.isEnabled();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test065");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        room4.disable();
        java.lang.String str8 = room4.toString();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str8, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test066");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        java.lang.String str5 = administrator4.getName();
        int int6 = administrator4.getAdminID();
        java.lang.String str7 = administrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test067");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isClosedForMaintenance();
        room4.enable();
        int int9 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test068");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test069");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        boolean boolean12 = room4.isAvailableForBooking();
        room4.enable();
        room4.enable();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test070");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.closeForMaintenance();
        boolean boolean6 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        java.lang.String str8 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test071");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test072");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean9 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test073");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        int int7 = room4.getCapacity();
        room4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test074");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        room4.disable();
        room4.closeForMaintenance();
        java.lang.String str10 = room4.getLocation();
        java.lang.String str11 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test075");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        boolean boolean12 = room4.isEnabled();
        boolean boolean13 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test076");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        java.lang.String str28 = administrator24.getPassword();
        java.lang.String str29 = administrator24.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test077");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.Administrator administrator42 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str43 = administrator42.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator42);
        java.lang.String str45 = administrator42.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test078");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        int int7 = room4.getCapacity();
        boolean boolean8 = room4.isAvailableForBooking();
        room4.enable();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test079");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) (byte) 100, " -  -  - Capacity: 1", "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test080");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        java.lang.String str5 = administrator4.getName();
        java.lang.String str6 = administrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test081");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        int int7 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        java.lang.String str9 = administrator5.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test082");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getRoomId();
        boolean boolean7 = room4.isAvailableForBooking();
        room4.disable();
        java.lang.String str9 = room4.getRoomId();
        int int10 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test083");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator(100, " -  -  - Capacity: 1", "hi! - hi! -  - Capacity: 0", "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test084");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        room4.enable();
        room4.reopenFromMaintenance();
        boolean boolean9 = room4.isClosedForMaintenance();
        java.lang.String str10 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test085");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getBuilding();
        java.lang.String str7 = room4.getBuilding();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test086");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, "hi! - hi! -  - Capacity: 0", "", "hi! -  -  - Capacity: 52");
        java.lang.String str5 = administrator4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test087");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.closeForMaintenance();
        boolean boolean6 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test088");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0", (int) '#', "", "hi!");
        room4.closeForMaintenance();
        java.lang.String str6 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test089");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        java.lang.String str28 = administrator24.getEmail();
        java.lang.String str29 = administrator24.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str28, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test090");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator1 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator6 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int7 = administrator6.getAdminID();
        chiefEventCoordinator1.generateAdministrator(administrator6);
        int int9 = administrator6.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator6);
        java.lang.String str11 = administrator6.getName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(chiefEventCoordinator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str11, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test091");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test092");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        room4.enable();
        boolean boolean11 = room4.isClosedForMaintenance();
        int int12 = room4.getCapacity();
        room4.reopenFromMaintenance();
        int int14 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test093");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        boolean boolean7 = room4.isEnabled();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test094");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        int int7 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator13 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str14 = administrator13.getEmail();
        chiefEventCoordinator0.generateAdministrator(administrator13);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator16 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator21 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int22 = administrator21.getAdminID();
        int int23 = administrator21.getAdminID();
        chiefEventCoordinator16.generateAdministrator(administrator21);
        chiefEventCoordinator0.generateAdministrator(administrator21);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator26 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator31 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int32 = administrator31.getAdminID();
        chiefEventCoordinator26.generateAdministrator(administrator31);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator34 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator35 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator40 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int41 = administrator40.getAdminID();
        int int42 = administrator40.getAdminID();
        chiefEventCoordinator35.generateAdministrator(administrator40);
        chiefEventCoordinator34.generateAdministrator(administrator40);
        chiefEventCoordinator26.generateAdministrator(administrator40);
        chiefEventCoordinator0.generateAdministrator(administrator40);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(chiefEventCoordinator16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator34);
        org.junit.Assert.assertNotNull(chiefEventCoordinator35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test095");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.toString();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str14, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test096");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        room4.disable();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test097");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isAvailableForBooking();
        boolean boolean8 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test098");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        java.lang.String str13 = room4.getBuilding();
        java.lang.String str14 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test099");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        int int5 = administrator4.getAdminID();
        java.lang.String str6 = administrator4.getName();
        java.lang.String str7 = administrator4.getPassword();
        java.lang.String str8 = administrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test100");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str5 = administrator4.getEmail();
        int int6 = administrator4.getAdminID();
        java.lang.String str7 = administrator4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str5, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test101");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean8 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str10, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test102");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        int int7 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator13 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        int int14 = administrator13.getAdminID();
        int int15 = administrator13.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator13);
        java.lang.String str17 = administrator13.getName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test103");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        room4.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test104");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        int int7 = room4.getCapacity();
        room4.reopenFromMaintenance();
        room4.disable();
        int int10 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test105");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) ' ', "", "hi! - hi! -  - Capacity: 0", "hi! -  -  - Capacity: 52");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test106");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test107");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getBuilding();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test108");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        room4.disable();
        room4.closeForMaintenance();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test109");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getBuilding();
        boolean boolean14 = room4.isClosedForMaintenance();
        boolean boolean15 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test110");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        boolean boolean10 = room4.isAvailableForBooking();
        java.lang.String str11 = room4.getBuilding();
        room4.enable();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test111");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        room4.disable();
        java.lang.String str9 = room4.getBuilding();
        boolean boolean10 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test112");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        java.lang.String str7 = room4.getLocation();
        room4.reopenFromMaintenance();
        room4.disable();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test113");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.Administrator administrator42 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str43 = administrator42.getEmail();
        chiefEventCoordinator0.generateAdministrator(administrator42);
        scheduler.model.Administrator administrator49 = new scheduler.model.Administrator((int) (short) 1, "hi!", " -  -  - Capacity: 1", " -  -  - Capacity: 1");
        chiefEventCoordinator0.generateAdministrator(administrator49);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test114");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isEnabled();
        room4.enable();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test115");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        java.lang.String str38 = administrator32.getName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test116");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        room4.disable();
        int int8 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test117");
        scheduler.model.Room room4 = new scheduler.model.Room("", 1, "", "");
        java.lang.String str5 = room4.getLocation();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test118");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        room4.closeForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str9 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test119");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test120");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        int int6 = administrator5.getAdminID();
        java.lang.String str7 = administrator5.getEmail();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        java.lang.String str9 = administrator5.getName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test121");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        room4.disable();
        room4.closeForMaintenance();
        java.lang.String str10 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test122");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        boolean boolean10 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test123");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test124");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator11 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        chiefEventCoordinator0.generateAdministrator(administrator11);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test125");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        room4.enable();
        room4.reopenFromMaintenance();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test126");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator(100, " -  -  - Capacity: 1", "hi! - hi! -  - Capacity: 0", "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test127");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str5 = administrator4.getPassword();
        java.lang.String str6 = administrator4.getName();
        java.lang.Class<?> wildcardClass7 = administrator4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test128");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isEnabled();
        boolean boolean8 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test129");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator(1, "hi! - hi! -  - Capacity: 0", "hi! - hi! -  - Capacity: 0", "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test130");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        room4.enable();
        room4.reopenFromMaintenance();
        room4.enable();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test131");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        boolean boolean10 = room4.isAvailableForBooking();
        java.lang.String str11 = room4.getLocation();
        java.lang.String str12 = room4.getBuilding();
        int int13 = room4.getCapacity();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test132");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        java.lang.String str5 = administrator4.getName();
        int int6 = administrator4.getAdminID();
        java.lang.String str7 = administrator4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test133");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        boolean boolean9 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test134");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator(10, "hi! -  -  - Capacity: 52", "hi! - hi! -  - Capacity: 0", "hi!");
        int int5 = administrator4.getAdminID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test135");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        java.lang.String str7 = room4.getLocation();
        java.lang.String str8 = room4.getLocation();
        room4.closeForMaintenance();
        boolean boolean10 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test136");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0", (int) '#', "hi! -  -  - Capacity: 52", "hi!");
        int int5 = room4.getCapacity();
        room4.enable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test137");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        java.lang.String str6 = room4.getBuilding();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test138");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.Administrator administrator42 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str43 = administrator42.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator42);
        scheduler.model.Administrator administrator49 = new scheduler.model.Administrator(1, "hi! -  -  - Capacity: 52", "", "hi! - hi! -  - Capacity: 0");
        chiefEventCoordinator0.generateAdministrator(administrator49);
        java.lang.String str51 = administrator49.getName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi! -  -  - Capacity: 52" + "'", str51, "hi! -  -  - Capacity: 52");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test139");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str5 = administrator4.getEmail();
        int int6 = administrator4.getAdminID();
        java.lang.String str7 = administrator4.getPassword();
        java.lang.String str8 = administrator4.getName();
        java.lang.Class<?> wildcardClass9 = administrator4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str5, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test140");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        room4.enable();
        boolean boolean11 = room4.isClosedForMaintenance();
        boolean boolean12 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test141");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        boolean boolean10 = room4.isAvailableForBooking();
        java.lang.String str11 = room4.getLocation();
        room4.closeForMaintenance();
        java.lang.String str13 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test142");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        room4.enable();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test143");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        boolean boolean10 = room4.isAvailableForBooking();
        java.lang.String str11 = room4.getLocation();
        boolean boolean12 = room4.isEnabled();
        room4.disable();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test144");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getBuilding();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test145");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (byte) 100, " -  -  - Capacity: 1", "", " -  -  - Capacity: 1");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test146");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        java.lang.String str9 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test147");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        boolean boolean10 = room4.isAvailableForBooking();
        java.lang.String str11 = room4.getLocation();
        boolean boolean12 = room4.isEnabled();
        boolean boolean13 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test148");
        scheduler.model.Room room4 = new scheduler.model.Room(" -  -  - Capacity: 1", (int) ' ', "hi! -  -  - Capacity: 52", "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test149");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isClosedForMaintenance();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test150");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        boolean boolean9 = room4.isClosedForMaintenance();
        java.lang.String str10 = room4.getLocation();
        boolean boolean11 = room4.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test151");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getRoomId();
        boolean boolean7 = room4.isAvailableForBooking();
        room4.disable();
        java.lang.String str9 = room4.getRoomId();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test152");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        int int7 = room4.getCapacity();
        room4.reopenFromMaintenance();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test153");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator28 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator29 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator34 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int35 = administrator34.getAdminID();
        chiefEventCoordinator29.generateAdministrator(administrator34);
        int int37 = administrator34.getAdminID();
        chiefEventCoordinator28.generateAdministrator(administrator34);
        chiefEventCoordinator0.generateAdministrator(administrator34);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(chiefEventCoordinator28);
        org.junit.Assert.assertNotNull(chiefEventCoordinator29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test154");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        boolean boolean12 = room4.isAvailableForBooking();
        java.lang.String str13 = room4.getRoomId();
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str14, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test155");
        scheduler.model.Room room4 = new scheduler.model.Room(" -  -  - Capacity: 1", (int) (short) 0, "hi!", "hi!");
        room4.reopenFromMaintenance();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test156");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean8 = room4.isClosedForMaintenance();
        java.lang.String str9 = room4.getLocation();
        boolean boolean10 = room4.isClosedForMaintenance();
        java.lang.String str11 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str11, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test157");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        java.lang.String str6 = room4.getBuilding();
        room4.enable();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test158");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isClosedForMaintenance();
        java.lang.String str10 = room4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test159");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        java.lang.String str8 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test160");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean8 = room4.isClosedForMaintenance();
        java.lang.String str9 = room4.getLocation();
        boolean boolean10 = room4.isClosedForMaintenance();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test161");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        boolean boolean7 = room4.isEnabled();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test162");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test163");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator12 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str13 = administrator12.getEmail();
        java.lang.String str14 = administrator12.getEmail();
        int int15 = administrator12.getAdminID();
        java.lang.String str16 = administrator12.getPassword();
        int int17 = administrator12.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator12);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator19 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int25 = administrator24.getAdminID();
        chiefEventCoordinator19.generateAdministrator(administrator24);
        java.lang.String str27 = administrator24.getEmail();
        java.lang.String str28 = administrator24.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str13, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str14, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(chiefEventCoordinator19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test164");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        java.lang.String str9 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test165");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        int int7 = room4.getCapacity();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test166");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str5 = administrator4.getEmail();
        java.lang.String str6 = administrator4.getEmail();
        int int7 = administrator4.getAdminID();
        java.lang.String str8 = administrator4.getPassword();
        int int9 = administrator4.getAdminID();
        java.lang.String str10 = administrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str5, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test167");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test168");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        int int8 = administrator5.getAdminID();
        java.lang.String str9 = administrator5.getEmail();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test169");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        room4.disable();
        java.lang.String str9 = room4.getBuilding();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test170");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.Administrator administrator42 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str43 = administrator42.getEmail();
        chiefEventCoordinator0.generateAdministrator(administrator42);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator45 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator50 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int51 = administrator50.getAdminID();
        chiefEventCoordinator45.generateAdministrator(administrator50);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator53 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator54 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator59 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int60 = administrator59.getAdminID();
        int int61 = administrator59.getAdminID();
        chiefEventCoordinator54.generateAdministrator(administrator59);
        chiefEventCoordinator53.generateAdministrator(administrator59);
        chiefEventCoordinator45.generateAdministrator(administrator59);
        scheduler.model.Administrator administrator69 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int70 = administrator69.getAdminID();
        int int71 = administrator69.getAdminID();
        chiefEventCoordinator45.generateAdministrator(administrator69);
        scheduler.model.Administrator administrator77 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str78 = administrator77.getEmail();
        chiefEventCoordinator45.generateAdministrator(administrator77);
        chiefEventCoordinator0.generateAdministrator(administrator77);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(chiefEventCoordinator45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator53);
        org.junit.Assert.assertNotNull(chiefEventCoordinator54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test171");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! -  -  - Capacity: 52", 10, "hi!", "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test172");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isClosedForMaintenance();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test173");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isClosedForMaintenance();
        room4.disable();
        java.lang.String str15 = room4.toString();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str15, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test174");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        java.lang.String str13 = room4.toString();
        room4.enable();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str13, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test175");
        scheduler.model.Room room4 = new scheduler.model.Room("", (-1), "", " -  -  - Capacity: 1");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test176");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        int int7 = room4.getCapacity();
        boolean boolean8 = room4.isAvailableForBooking();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test177");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator12 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        chiefEventCoordinator0.generateAdministrator(administrator12);
        java.lang.String str14 = administrator12.getEmail();
        java.lang.String str15 = administrator12.getName();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str15, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test178");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.Administrator administrator42 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str43 = administrator42.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator42);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator45 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator50 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int51 = administrator50.getAdminID();
        chiefEventCoordinator45.generateAdministrator(administrator50);
        scheduler.model.Administrator administrator57 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        chiefEventCoordinator45.generateAdministrator(administrator57);
        java.lang.String str59 = administrator57.getName();
        chiefEventCoordinator0.generateAdministrator(administrator57);
        java.lang.String str61 = administrator57.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(chiefEventCoordinator45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str59, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test179");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator1 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator6 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int7 = administrator6.getAdminID();
        int int8 = administrator6.getAdminID();
        chiefEventCoordinator1.generateAdministrator(administrator6);
        chiefEventCoordinator0.generateAdministrator(administrator6);
        int int11 = administrator6.getAdminID();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(chiefEventCoordinator1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test180");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        room4.enable();
        boolean boolean11 = room4.isClosedForMaintenance();
        int int12 = room4.getCapacity();
        boolean boolean13 = room4.isEnabled();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test181");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        java.lang.String str28 = administrator24.getName();
        java.lang.String str29 = administrator24.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test182");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        room4.enable();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str14, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test183");
        scheduler.model.Room room4 = new scheduler.model.Room("", 10, "hi! - hi! -  - Capacity: 0", "hi! - hi! -  - Capacity: 0");
        int int5 = room4.getCapacity();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test184");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        int int7 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test185");
        scheduler.model.Room room4 = new scheduler.model.Room("", (int) (short) 0, "hi! -  -  - Capacity: 52", "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test186");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        room4.enable();
        boolean boolean11 = room4.isClosedForMaintenance();
        int int12 = room4.getCapacity();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test187");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.Administrator administrator42 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str43 = administrator42.getEmail();
        chiefEventCoordinator0.generateAdministrator(administrator42);
        java.lang.String str45 = administrator42.getName();
        java.lang.String str46 = administrator42.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str45, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test188");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0", (-1), "hi!", "hi! -  -  - Capacity: 52");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test189");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        int int7 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator13 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        int int14 = administrator13.getAdminID();
        int int15 = administrator13.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator13);
        scheduler.model.Administrator administrator21 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int22 = administrator21.getAdminID();
        java.lang.String str23 = administrator21.getEmail();
        chiefEventCoordinator0.generateAdministrator(administrator21);
        scheduler.model.Administrator administrator29 = new scheduler.model.Administrator((int) (short) 100, "", "hi!", "");
        java.lang.String str30 = administrator29.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator29);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test190");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isEnabled();
        room4.reopenFromMaintenance();
        boolean boolean9 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test191");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test192");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", (int) '4', "", "");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomId();
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  - Capacity: 52" + "'", str5, "hi! -  -  - Capacity: 52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  - Capacity: 52" + "'", str7, "hi! -  -  - Capacity: 52");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test193");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        room4.disable();
        java.lang.String str9 = room4.getBuilding();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test194");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) '4', "", "hi! -  -  - Capacity: 52", "hi! -  -  - Capacity: 52");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test195");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getBuilding();
        java.lang.String str14 = room4.getLocation();
        boolean boolean15 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test196");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0", 100, " -  -  - Capacity: 1", "");
        java.lang.String str5 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  - Capacity: 0 -  -  -  - Capacity: 1 -  - Capacity: 100" + "'", str5, "hi! - hi! -  - Capacity: 0 -  -  -  - Capacity: 1 -  - Capacity: 100");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test197");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0", (int) ' ', "", "");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test198");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        java.lang.String str5 = room4.toString();
        room4.disable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str5, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test199");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0 -  -  -  - Capacity: 1 -  - Capacity: 100", 0, " -  -  - Capacity: 1", "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test200");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isClosedForMaintenance();
        java.lang.String str14 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test201");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isClosedForMaintenance();
        room4.disable();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str15, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test202");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) 1, "hi!", " -  -  - Capacity: 1", " -  -  - Capacity: 1");
        java.lang.String str5 = administrator4.getName();
        java.lang.String str6 = administrator4.getPassword();
        int int7 = administrator4.getAdminID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  - Capacity: 1" + "'", str6, " -  -  - Capacity: 1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test203");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        room4.enable();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str10 = room4.getRoomId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test204");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        room4.enable();
        room4.reopenFromMaintenance();
        java.lang.String str15 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test205");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        boolean boolean11 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test206");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator38 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator39 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator44 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int45 = administrator44.getAdminID();
        int int46 = administrator44.getAdminID();
        chiefEventCoordinator39.generateAdministrator(administrator44);
        chiefEventCoordinator38.generateAdministrator(administrator44);
        chiefEventCoordinator0.generateAdministrator(administrator44);
        java.lang.Class<?> wildcardClass50 = chiefEventCoordinator0.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(chiefEventCoordinator38);
        org.junit.Assert.assertNotNull(chiefEventCoordinator39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test207");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) 100, "hi! - hi! -  - Capacity: 0", "hi! - hi! -  - Capacity: 0 -  -  -  - Capacity: 1 -  - Capacity: 100", "hi! - hi! -  - Capacity: 0 -  -  -  - Capacity: 1 -  - Capacity: 100");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test208");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isClosedForMaintenance();
        java.lang.String str6 = room4.getBuilding();
        java.lang.String str7 = room4.getRoomId();
        boolean boolean8 = room4.isClosedForMaintenance();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test209");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str8, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test210");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str16 = room4.getBuilding();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test211");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        room4.enable();
        room4.reopenFromMaintenance();
        room4.enable();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test212");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) 10, "hi!", "hi! - hi! -  - Capacity: 0", "hi! -  -  - Capacity: 52");
        java.lang.String str5 = administrator4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str5, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test213");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isClosedForMaintenance();
        room4.disable();
        int int15 = room4.getCapacity();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test214");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator12 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str13 = administrator12.getEmail();
        java.lang.String str14 = administrator12.getEmail();
        int int15 = administrator12.getAdminID();
        java.lang.String str16 = administrator12.getPassword();
        int int17 = administrator12.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator12);
        java.lang.String str19 = administrator12.getEmail();
        java.lang.String str20 = administrator12.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str13, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str14, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str19, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test215");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        java.lang.String str9 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test216");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getLocation();
        java.lang.String str8 = room4.getBuilding();
        java.lang.String str9 = room4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test217");
        scheduler.model.Room room4 = new scheduler.model.Room("", 1, "", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        room4.disable();
        boolean boolean8 = room4.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test218");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean8 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str10 = room4.getLocation();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test219");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        boolean boolean10 = room4.isAvailableForBooking();
        java.lang.String str11 = room4.getLocation();
        java.lang.String str12 = room4.getBuilding();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test220");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isEnabled();
        room4.reopenFromMaintenance();
        room4.disable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test221");
        scheduler.model.Room room4 = new scheduler.model.Room("", 1, "", "");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  - Capacity: 1" + "'", str5, " -  -  - Capacity: 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test222");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        boolean boolean10 = room4.isAvailableForBooking();
        java.lang.String str11 = room4.getBuilding();
        room4.disable();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getLocation();
        java.lang.String str15 = room4.getBuilding();
        java.lang.String str16 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str13, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test223");
        scheduler.model.Room room4 = new scheduler.model.Room(" -  -  - Capacity: 1", 10, "hi! - hi! -  - Capacity: 0", "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test224");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str5 = administrator4.getEmail();
        java.lang.String str6 = administrator4.getEmail();
        int int7 = administrator4.getAdminID();
        java.lang.String str8 = administrator4.getPassword();
        int int9 = administrator4.getAdminID();
        java.lang.String str10 = administrator4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str5, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str10, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test225");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean8 = room4.isClosedForMaintenance();
        java.lang.String str9 = room4.getLocation();
        boolean boolean10 = room4.isClosedForMaintenance();
        boolean boolean11 = room4.isEnabled();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test226");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str9, "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test227");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator12 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        chiefEventCoordinator0.generateAdministrator(administrator12);
        scheduler.model.Administrator administrator18 = new scheduler.model.Administrator((int) '#', "", "", "");
        chiefEventCoordinator0.generateAdministrator(administrator18);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test228");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        boolean boolean9 = room4.isClosedForMaintenance();
        java.lang.String str10 = room4.getLocation();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str11, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test229");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        java.lang.String str20 = administrator14.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test230");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator20 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator25 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int26 = administrator25.getAdminID();
        chiefEventCoordinator20.generateAdministrator(administrator25);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator28 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator29 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator34 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int35 = administrator34.getAdminID();
        int int36 = administrator34.getAdminID();
        chiefEventCoordinator29.generateAdministrator(administrator34);
        chiefEventCoordinator28.generateAdministrator(administrator34);
        chiefEventCoordinator20.generateAdministrator(administrator34);
        int int40 = administrator34.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator34);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator28);
        org.junit.Assert.assertNotNull(chiefEventCoordinator29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test231");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0 -  -  -  - Capacity: 1 -  - Capacity: 100", (int) (short) 0, "hi!", "hi! - hi! -  - Capacity: 0");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test232");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.Administrator administrator42 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str43 = administrator42.getEmail();
        chiefEventCoordinator0.generateAdministrator(administrator42);
        java.lang.String str45 = administrator42.getPassword();
        java.lang.Class<?> wildcardClass46 = administrator42.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test233");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean8 = room4.isClosedForMaintenance();
        java.lang.String str9 = room4.getLocation();
        room4.enable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test234");
        scheduler.model.Room room4 = new scheduler.model.Room("hi! - hi! -  - Capacity: 0", (int) (short) 10, "hi!", "hi! -  -  - Capacity: 52");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test235");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getBuilding();
        java.lang.String str9 = room4.getBuilding();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test236");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test237");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.toString();
        room4.reopenFromMaintenance();
        boolean boolean8 = room4.isClosedForMaintenance();
        boolean boolean9 = room4.isClosedForMaintenance();
        java.lang.String str10 = room4.getLocation();
        boolean boolean11 = room4.isAvailableForBooking();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test238");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        java.lang.String str38 = administrator32.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test239");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        room4.closeForMaintenance();
        room4.enable();
        room4.reopenFromMaintenance();
        boolean boolean9 = room4.isClosedForMaintenance();
        boolean boolean10 = room4.isAvailableForBooking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test240");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        java.lang.String str28 = administrator24.getName();
        java.lang.String str29 = administrator24.getEmail();
        int int30 = administrator24.getAdminID();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str29, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test241");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean8 = room4.isClosedForMaintenance();
        java.lang.String str9 = room4.getLocation();
        boolean boolean10 = room4.isClosedForMaintenance();
        room4.closeForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test242");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator8 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator9 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator14 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int15 = administrator14.getAdminID();
        int int16 = administrator14.getAdminID();
        chiefEventCoordinator9.generateAdministrator(administrator14);
        chiefEventCoordinator8.generateAdministrator(administrator14);
        chiefEventCoordinator0.generateAdministrator(administrator14);
        scheduler.model.Administrator administrator24 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str25 = administrator24.getEmail();
        int int26 = administrator24.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator24);
        scheduler.model.Administrator administrator32 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        java.lang.String str33 = administrator32.getEmail();
        java.lang.String str34 = administrator32.getEmail();
        int int35 = administrator32.getAdminID();
        java.lang.String str36 = administrator32.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator32);
        scheduler.model.Administrator administrator42 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str43 = administrator42.getPassword();
        chiefEventCoordinator0.generateAdministrator(administrator42);
        scheduler.model.Administrator administrator49 = new scheduler.model.Administrator((int) (short) -1, "", "hi! - hi! -  - Capacity: 0", "hi!");
        chiefEventCoordinator0.generateAdministrator(administrator49);
        java.lang.String str51 = administrator49.getPassword();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chiefEventCoordinator8);
        org.junit.Assert.assertNotNull(chiefEventCoordinator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str25, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str33, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str34, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test243");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        java.lang.String str6 = room4.getLocation();
        java.lang.String str7 = room4.getLocation();
        boolean boolean8 = room4.isAvailableForBooking();
        boolean boolean9 = room4.isEnabled();
        room4.enable();
        java.lang.String str11 = room4.getLocation();
        room4.reopenFromMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test244");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.reopenFromMaintenance();
        java.lang.String str8 = room4.getRoomId();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomId();
        java.lang.String str12 = room4.getRoomId();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isEnabled();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str14, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test245");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) '#', "", "", "");
        int int5 = administrator4.getAdminID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test246");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        java.lang.String str6 = room4.getBuilding();
        java.lang.String str7 = room4.getBuilding();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test247");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        boolean boolean5 = room4.isAvailableForBooking();
        boolean boolean6 = room4.isClosedForMaintenance();
        room4.enable();
        boolean boolean8 = room4.isClosedForMaintenance();
        java.lang.String str9 = room4.getLocation();
        boolean boolean10 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test248");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (byte) 100, "hi!", "hi!", "hi! - hi! -  - Capacity: 0");
        int int6 = administrator5.getAdminID();
        java.lang.String str7 = administrator5.getEmail();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        scheduler.model.Administrator administrator13 = new scheduler.model.Administrator((int) 'a', "hi!", " -  -  - Capacity: 1", " -  -  - Capacity: 1");
        chiefEventCoordinator0.generateAdministrator(administrator13);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test249");
        scheduler.model.Room room4 = new scheduler.model.Room("hi!", 0, "hi!", "");
        room4.reopenFromMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuilding();
        boolean boolean9 = room4.isAvailableForBooking();
        room4.closeForMaintenance();
        java.lang.String str11 = room4.getBuilding();
        room4.disable();
        java.lang.String str13 = room4.getRoomId();
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str7, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test250");
        scheduler.model.Room room4 = new scheduler.model.Room("", (int) (byte) 0, "hi!", "");
        room4.disable();
        java.lang.String str6 = room4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! -  - Capacity: 0" + "'", str6, " - hi! -  - Capacity: 0");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test251");
        scheduler.model.Administrator administrator4 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        java.lang.String str5 = administrator4.getPassword();
        java.lang.String str6 = administrator4.getName();
        java.lang.String str7 = administrator4.getPassword();
        java.lang.String str8 = administrator4.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  - Capacity: 0" + "'", str6, "hi! - hi! -  - Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ModelRegressionTest0.test252");
        scheduler.model.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.model.ChiefEventCoordinator.getInstance();
        scheduler.model.Administrator administrator5 = new scheduler.model.Administrator((int) (short) 1, "hi! - hi! -  - Capacity: 0", "", "");
        int int6 = administrator5.getAdminID();
        chiefEventCoordinator0.generateAdministrator(administrator5);
        java.lang.String str8 = administrator5.getEmail();
        java.lang.String str9 = administrator5.getPassword();
        int int10 = administrator5.getAdminID();
        int int11 = administrator5.getAdminID();
        java.lang.Class<?> wildcardClass12 = administrator5.getClass();
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}
