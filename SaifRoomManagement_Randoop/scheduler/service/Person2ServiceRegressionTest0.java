package scheduler.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Person2ServiceRegressionTest0 {

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
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test01");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        scheduler.model.Administrator administrator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomManagementFacade0.generateAdministrator(administrator1);
// flaky "1) test01(scheduler.service.Person2ServiceRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test02");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.disableRoom("hi!");
        scheduler.model.Administrator administrator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomManagementFacade0.generateAdministrator(administrator3);
// flaky "2) test02(scheduler.service.Person2ServiceRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test03");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        roomManagementFacade0.disableRoom("");
        java.lang.Class<?> wildcardClass7 = roomManagementFacade0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test04");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        java.util.List<scheduler.model.Room> roomList3 = roomManagementFacade0.getAllRooms();
        scheduler.model.Administrator administrator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomManagementFacade0.generateAdministrator(administrator4);
// flaky "3) test04(scheduler.service.Person2ServiceRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomList3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test05");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        java.util.List<scheduler.model.Room> roomList5 = roomManagementFacade0.getAllRooms();
        roomManagementFacade0.enableRoom("");
        org.junit.Assert.assertNotNull(roomList5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test06");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        scheduler.model.Administrator administrator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomManagementFacade0.generateAdministrator(administrator5);
// flaky "4) test06(scheduler.service.Person2ServiceRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test07");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        roomManagementFacade0.disableRoom("");
        roomManagementFacade0.disableRoom("");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test08");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.disableRoom("hi!");
        java.util.List<scheduler.model.Room> roomList3 = roomManagementFacade0.getAllRooms();
        java.lang.Class<?> wildcardClass4 = roomManagementFacade0.getClass();
        org.junit.Assert.assertNotNull(roomList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test09");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        java.lang.Class<?> wildcardClass3 = roomManagementFacade0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test10");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        java.util.List<scheduler.model.Room> roomList5 = roomManagementFacade0.getAllRooms();
        java.lang.Class<?> wildcardClass6 = roomManagementFacade0.getClass();
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test11");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.disableRoom("");
        java.util.List<scheduler.model.Room> roomList3 = roomManagementFacade0.getAllRooms();
        org.junit.Assert.assertNotNull(roomList3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test12");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        roomManagementFacade0.disableRoom("hi!");
        java.util.List<scheduler.model.Room> roomList7 = roomManagementFacade0.getAllRooms();
        scheduler.model.Administrator administrator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomManagementFacade0.generateAdministrator(administrator8);
// flaky "5) test12(scheduler.service.Person2ServiceRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomList7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test13");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        roomManagementFacade0.closeRoom("");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test14");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.disableRoom("hi!");
        java.util.List<scheduler.model.Room> roomList3 = roomManagementFacade0.getAllRooms();
        scheduler.model.Room room4 = null;
        roomManagementFacade0.addRoom(room4);
        scheduler.model.Administrator administrator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomManagementFacade0.generateAdministrator(administrator6);
// flaky "6) test14(scheduler.service.Person2ServiceRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomList3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test15");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.disableRoom("hi!");
        roomManagementFacade0.disableRoom("hi!");
        java.util.List<scheduler.model.Room> roomList5 = roomManagementFacade0.getAllRooms();
        org.junit.Assert.assertNotNull(roomList5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test16");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        roomManagementFacade0.disableRoom("hi!");
        java.util.List<scheduler.model.Room> roomList7 = roomManagementFacade0.getAllRooms();
        roomManagementFacade0.closeRoom("");
        org.junit.Assert.assertNotNull(roomList7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test17");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        scheduler.model.Room room3 = null;
        roomManagementFacade0.addRoom(room3);
        java.util.List<scheduler.model.Room> roomList5 = roomManagementFacade0.getAllRooms();
        org.junit.Assert.assertNotNull(roomList5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test18");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        scheduler.model.Room room3 = null;
        roomManagementFacade0.addRoom(room3);
        scheduler.model.Administrator administrator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomManagementFacade0.generateAdministrator(administrator5);
// flaky "7) test18(scheduler.service.Person2ServiceRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test19");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        roomManagementFacade0.disableRoom("");
        java.util.List<scheduler.model.Room> roomList7 = roomManagementFacade0.getAllRooms();
        java.lang.Class<?> wildcardClass8 = roomList7.getClass();
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test20");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        scheduler.model.Room room3 = null;
        roomManagementFacade0.addRoom(room3);
        java.util.List<scheduler.model.Room> roomList5 = roomManagementFacade0.getAllRooms();
        org.junit.Assert.assertNotNull(roomList5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test21");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        java.util.List<scheduler.model.Room> roomList3 = roomManagementFacade0.getAllRooms();
        roomManagementFacade0.enableRoom("");
        roomManagementFacade0.closeRoom("");
        org.junit.Assert.assertNotNull(roomList3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test22");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        java.util.List<scheduler.model.Room> roomList3 = roomManagementFacade0.getAllRooms();
        roomManagementFacade0.enableRoom("");
        roomManagementFacade0.closeRoom("hi!");
        org.junit.Assert.assertNotNull(roomList3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test23");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.disableRoom("hi!");
        roomManagementFacade0.disableRoom("hi!");
        roomManagementFacade0.enableRoom("");
        scheduler.model.Administrator administrator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomManagementFacade0.generateAdministrator(administrator7);
// flaky "8) test23(scheduler.service.Person2ServiceRegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Administrator.getAdminID()\" because \"admin\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test24");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        java.util.List<scheduler.model.Room> roomList3 = roomManagementFacade0.getAllRooms();
        roomManagementFacade0.closeRoom("hi!");
        roomManagementFacade0.disableRoom("");
        scheduler.model.Room room8 = null;
        roomManagementFacade0.addRoom(room8);
        org.junit.Assert.assertNotNull(roomList3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test25");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        java.util.List<scheduler.model.Room> roomList3 = roomManagementFacade0.getAllRooms();
        java.util.List<scheduler.model.Room> roomList4 = roomManagementFacade0.getAllRooms();
        java.util.List<scheduler.model.Room> roomList5 = roomManagementFacade0.getAllRooms();
        roomManagementFacade0.closeRoom("");
        org.junit.Assert.assertNotNull(roomList3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(roomList5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test26");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.enableRoom("hi!");
        roomManagementFacade0.disableRoom("");
        java.util.List<scheduler.model.Room> roomList5 = roomManagementFacade0.getAllRooms();
        scheduler.model.Room room6 = null;
        roomManagementFacade0.addRoom(room6);
        org.junit.Assert.assertNotNull(roomList5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Person2ServiceRegressionTest0.test27");
        scheduler.service.RoomManagementFacade roomManagementFacade0 = new scheduler.service.RoomManagementFacade();
        roomManagementFacade0.closeRoom("hi!");
        roomManagementFacade0.disableRoom("");
    }
}
