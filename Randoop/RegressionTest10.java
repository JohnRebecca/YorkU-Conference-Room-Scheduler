import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        scheduler.sensor.SensorReading.Source source10 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading13 = new scheduler.sensor.SensorReading(source10, "", "CH-hi!");
        java.time.LocalDateTime localDateTime14 = sensorReading13.getTimestamp();
        java.time.LocalDateTime localDateTime20 = null;
        scheduler.sensor.BadgeScanRecord.Result result21 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord22 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime20, result21);
        scheduler.sensor.BadgeScanRecord badgeScanRecord23 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-hi!", localDateTime14, result21);
        scheduler.sensor.SensorReading.Source source29 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading32 = new scheduler.sensor.SensorReading(source29, "", "CH-hi!");
        java.time.LocalDateTime localDateTime33 = sensorReading32.getTimestamp();
        java.time.LocalDateTime localDateTime39 = null;
        scheduler.sensor.BadgeScanRecord.Result result40 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord41 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime39, result40);
        scheduler.sensor.BadgeScanRecord badgeScanRecord42 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-hi!", localDateTime33, result40);
        scheduler.sensor.BadgeScanRecord badgeScanRecord43 = new scheduler.sensor.BadgeScanRecord("%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?", "CH-%YU^hi!^1785815794?", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-AcmeSense LMU-900 (fw 2.4.1, simulated)", "CH-hi!", localDateTime14, result40);
        java.lang.String str44 = badgeScanRecord43.getIdentificationNumber();
        java.lang.String str45 = badgeScanRecord43.getUserId();
        scheduler.sensor.BadgeScanRecord.Result result46 = badgeScanRecord43.getResult();
        org.junit.Assert.assertTrue("'" + source10 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source10.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + result21 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result21.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        org.junit.Assert.assertTrue("'" + source29 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source29.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + result40 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result40.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!" + "'", str44.equals("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?" + "'", str45.equals("%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?"));
        org.junit.Assert.assertTrue("'" + result46 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result46.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        scheduler.sensor.SensorReading.Source source0 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading3 = new scheduler.sensor.SensorReading(source0, "", "CH-hi!");
        scheduler.sensor.SensorReading sensorReading6 = new scheduler.sensor.SensorReading(source0, "CH-hi!", "AcmeSense LMU-900 (fw 2.4.1, simulated)");
        scheduler.sensor.SensorReading sensorReading9 = new scheduler.sensor.SensorReading(source0, "hi!", "SwipeTech MSR-210 (fw 1.0.7, simulated)");
        scheduler.sensor.SensorReading sensorReading12 = new scheduler.sensor.SensorReading(source0, "CH-[23:56:36] OCCUPANCY_SENSOR (): CH-hi!", "AcmeSense LMU-900 (fw 2.4.1, simulated)");
        scheduler.sensor.SensorReading sensorReading15 = new scheduler.sensor.SensorReading(source0, "%YU^%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?^1785815797?", "%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?");
        scheduler.sensor.SensorReading sensorReading18 = new scheduler.sensor.SensorReading(source0, "[23:56:37] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "%YU^[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?");
        scheduler.sensor.SensorReading sensorReading21 = new scheduler.sensor.SensorReading(source0, "CH-", "CH-%YU^^1785815802?");
        scheduler.sensor.SensorReading sensorReading24 = new scheduler.sensor.SensorReading(source0, "%YU^[23:56:48] OCCUPANCY_SENSOR (): CH-hi!^1785815817?", "%YU^[23:56:42] BADGE_SCANNER (CH-hi!): CH-AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815810?");
        org.junit.Assert.assertTrue("'" + source0 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source0.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        scheduler.sensor.SensorReading.Source source5 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading8 = new scheduler.sensor.SensorReading(source5, "", "CH-hi!");
        java.lang.String str9 = sensorReading8.getRoomId();
        java.lang.String str10 = sensorReading8.getDetail();
        scheduler.sensor.SensorReading.Source source11 = sensorReading8.getSource();
        java.time.LocalDateTime localDateTime12 = sensorReading8.getTimestamp();
        scheduler.util.AppClock.jumpTo(localDateTime12);
        scheduler.util.AppClock.jumpTo(localDateTime12);
        scheduler.util.AppClock.jumpTo(localDateTime12);
        scheduler.sensor.BadgeScanRecord.Result result16 = null;
        scheduler.sensor.BadgeScanRecord badgeScanRecord17 = new scheduler.sensor.BadgeScanRecord("[23:56:38] OCCUPANCY_SENSOR (): CH-hi!", "%YU^+0m^1785815800?", "CH-[Aug 3, 23:56:51] CH-AcmeSense LMU-900 (fw 2.4.1, simulated)  CH-%YU^hi!^1785815794? ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!)  TAPPED IN", "[23:56:43] BADGE_SCANNER (CH-hi!): CH-AcmeSense LMU-900 (fw 2.4.1, simulated)", "[23:57:01] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", localDateTime12, result16);
        java.lang.String str18 = badgeScanRecord17.toString();
        java.time.LocalDateTime localDateTime19 = badgeScanRecord17.getScannedAt();
        org.junit.Assert.assertTrue("'" + source5 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source5.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "CH-hi!" + "'", str10.equals("CH-hi!"));
        org.junit.Assert.assertTrue("'" + source11 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source11.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[Aug 3, 23:57:33] [23:56:43] BADGE_SCANNER (CH-hi!): CH-AcmeSense LMU-900 (fw 2.4.1, simulated)  %YU^+0m^1785815800? (CH-[Aug 3, 23:56:51] CH-AcmeSense LMU-900 (fw 2.4.1, simulated)  CH-%YU^hi!^1785815794? ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!)  TAPPED IN)  TAPPED IN" + "'", str18.equals("[Aug 3, 23:57:33] [23:56:43] BADGE_SCANNER (CH-hi!): CH-AcmeSense LMU-900 (fw 2.4.1, simulated)  %YU^+0m^1785815800? (CH-[Aug 3, 23:56:51] CH-AcmeSense LMU-900 (fw 2.4.1, simulated)  CH-%YU^hi!^1785815794? ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!)  TAPPED IN)  TAPPED IN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = null;
        scheduler.sensor.SensorDataLog sensorDataLog1 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter2 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog1);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit3 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader4 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader8 = null;
        scheduler.sensor.SensorDataLog sensorDataLog9 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter10 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader8, sensorDataLog9);
        scheduler.sensor.SensorSimulationController sensorSimulationController11 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit3, magStripeBadgeReader4, motionUnitOccupancyAdapter7, magStripeBadgeAdapter10);
        scheduler.service.CheckInService checkInService12 = null;
        scheduler.service.BookingService bookingService13 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository14 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog15 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService16 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter2, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter10, checkInService12, bookingService13, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository14, sensorDataLog15);
        scheduler.sensor.SensorReading.Source source19 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading22 = new scheduler.sensor.SensorReading(source19, "", "CH-hi!");
        java.time.LocalDateTime localDateTime23 = sensorReading22.getTimestamp();
        boolean boolean24 = false; // flaky: sqliteBadgeScanRepository14.hasTapped("%YU^hi!^1785815794?", "CH-hi!", localDateTime23);
        scheduler.sensor.SensorReading.Source source30 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading33 = new scheduler.sensor.SensorReading(source30, "", "CH-hi!");
        java.time.LocalDateTime localDateTime34 = sensorReading33.getTimestamp();
        java.time.LocalDateTime localDateTime40 = null;
        scheduler.sensor.BadgeScanRecord.Result result41 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord42 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime40, result41);
        scheduler.sensor.BadgeScanRecord badgeScanRecord43 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-hi!", localDateTime34, result41);
        java.lang.String str44 = badgeScanRecord43.getUserId();
        java.lang.String str45 = badgeScanRecord43.toString();
        java.time.LocalDateTime localDateTime46 = badgeScanRecord43.getScannedAt();
        java.lang.String str47 = badgeScanRecord43.getBookingId();
        java.lang.String str48 = badgeScanRecord43.getIdentificationNumber();
        java.lang.String str49 = badgeScanRecord43.getUserId();
        scheduler.sensor.BadgeScanRecord.Result result50 = badgeScanRecord43.getResult();
// flaky:         sqliteBadgeScanRepository14.save(badgeScanRecord43);
        scheduler.sensor.SensorReading.Source source53 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading56 = new scheduler.sensor.SensorReading(source53, "", "CH-hi!");
        java.lang.String str57 = sensorReading56.getRoomId();
        java.lang.String str58 = sensorReading56.getDetail();
        scheduler.sensor.SensorReading.Source source59 = sensorReading56.getSource();
        java.time.LocalDateTime localDateTime60 = sensorReading56.getTimestamp();
        scheduler.util.AppClock.jumpTo(localDateTime60);
        scheduler.util.AppClock.jumpTo(localDateTime60);
        int int63 = 0; // flaky: sqliteBadgeScanRepository14.countDistinctTappersForBooking("[Aug 3, 23:57:05] %YU^%YU^%YU^[23:56:38] OCCUPANCY_SENSOR (): CH-hi!^1785815800?^1785815802?^1785815803?  [23:56:42] OCCUPANCY_SENSOR ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-AcmeSense LMU-900 (fw 2.4.1, simulated) (CH-[23:56:41] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated))  TAPPED IN", localDateTime60);
        org.junit.Assert.assertTrue("'" + source19 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source19.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + source30 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source30.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + result41 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result41.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "%YU^hi!^1785815794?" + "'", str44.equals("%YU^hi!^1785815794?"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[Aug 3, 23:57:33] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN" + "'", str45.equals("[Aug 3, 23:57:33] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "CH-hi!" + "'", str47.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "%YU^hi!^1785815794?" + "'", str49.equals("%YU^hi!^1785815794?"));
        org.junit.Assert.assertTrue("'" + result50 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result50.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        org.junit.Assert.assertTrue("'" + source53 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source53.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "CH-hi!" + "'", str58.equals("CH-hi!"));
        org.junit.Assert.assertTrue("'" + source59 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source59.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        boolean boolean22 = sensorSimulationController20.isBadgeWaiting("CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        boolean boolean25 = sensorSimulationController20.personLeavesRoom("CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        boolean boolean27 = sensorSimulationController20.isRoomEmpty("[23:56:50] null (SwipeTech MSR-210 (fw 1.0.7, simulated)): CH-hi!");
        boolean boolean29 = sensorSimulationController20.isRoomEmpty("[Aug 3, 23:57:06] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        boolean boolean32 = sensorSimulationController20.isPersonInside("[Aug 3, 23:56:47] CH-CH-%YU^hi!^1785815794?  %YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796? (+0m)  TAPPED IN", "CH-%YU^[Aug 3, 23:56:36] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN^1785815802?");
        boolean boolean34 = sensorSimulationController20.isBadgeWaiting("CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        scheduler.sensor.SensorReading.Source source15 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading18 = new scheduler.sensor.SensorReading(source15, "", "CH-hi!");
        java.time.LocalDateTime localDateTime19 = sensorReading18.getTimestamp();
        java.time.LocalDateTime localDateTime25 = null;
        scheduler.sensor.BadgeScanRecord.Result result26 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord27 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime25, result26);
        scheduler.sensor.BadgeScanRecord badgeScanRecord28 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-hi!", localDateTime19, result26);
        java.lang.String str29 = badgeScanRecord28.getUserId();
        java.lang.String str30 = badgeScanRecord28.toString();
        java.time.LocalDateTime localDateTime31 = badgeScanRecord28.getScannedAt();
        scheduler.util.AppClock.jumpTo(localDateTime31);
        java.time.LocalDateTime localDateTime38 = null;
        scheduler.sensor.BadgeScanRecord.Result result39 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord40 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime38, result39);
        java.time.LocalDateTime localDateTime41 = badgeScanRecord40.getScannedAt();
        java.lang.String str42 = badgeScanRecord40.getIdentificationNumber();
        java.lang.String str43 = badgeScanRecord40.getBookingId();
        java.lang.String str44 = badgeScanRecord40.getIdentificationNumber();
        scheduler.sensor.BadgeScanRecord.Result result45 = badgeScanRecord40.getResult();
        scheduler.sensor.BadgeScanRecord.Result result46 = badgeScanRecord40.getResult();
        scheduler.sensor.BadgeScanRecord badgeScanRecord47 = new scheduler.sensor.BadgeScanRecord("[Aug 3, 23:56:37] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN", "[23:56:37] OCCUPANCY_SENSOR (): CH-hi!", "%YU^SwipeTech MSR-210 (fw 1.0.7, simulated)^1785815797?", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-%YU^%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?^1785815798?", localDateTime31, result46);
        scheduler.sensor.SensorReading.Source source53 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading56 = new scheduler.sensor.SensorReading(source53, "", "CH-hi!");
        java.time.LocalDateTime localDateTime57 = sensorReading56.getTimestamp();
        java.time.LocalDateTime localDateTime63 = null;
        scheduler.sensor.BadgeScanRecord.Result result64 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord65 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime63, result64);
        scheduler.sensor.BadgeScanRecord badgeScanRecord66 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-hi!", localDateTime57, result64);
        scheduler.sensor.BadgeScanRecord badgeScanRecord67 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "CH-CH-%YU^hi!^1785815794?", "CH-%YU^%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?^1785815798?", "[23:56:38] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", localDateTime31, result64);
        java.lang.String str68 = badgeScanRecord67.getFullName();
        java.lang.String str69 = badgeScanRecord67.getRoomId();
        org.junit.Assert.assertTrue("'" + source15 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source15.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + result26 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result26.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "%YU^hi!^1785815794?" + "'", str29.equals("%YU^hi!^1785815794?"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[Aug 3, 23:57:33] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN" + "'", str30.equals("[Aug 3, 23:57:33] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + result39 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result39.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue("'" + result45 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result45.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        org.junit.Assert.assertTrue("'" + result46 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result46.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        org.junit.Assert.assertTrue("'" + source53 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source53.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + result64 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result64.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "CH-CH-%YU^hi!^1785815794?" + "'", str68.equals("CH-CH-%YU^hi!^1785815794?"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[23:56:38] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!" + "'", str69.equals("[23:56:38] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!"));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        int int5 = legacyMotionUnit0.pollMotionLevel((int) '#');
        int int7 = legacyMotionUnit0.pollMotionLevel((-1));
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit8 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit8.injectMotion(0, (int) '#');
        int int13 = legacyMotionUnit8.pollMotionLevel((int) '#');
        int int15 = legacyMotionUnit8.pollMotionLevel((-1));
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit16 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit16.injectMotion(0, (int) '#');
        java.lang.String str20 = legacyMotionUnit16.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = null;
        scheduler.sensor.SensorDataLog sensorDataLog22 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter23 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit21, sensorDataLog22);
        scheduler.sensor.SensorReading sensorReading24 = null;
        sensorDataLog22.record(sensorReading24);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter26 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit16, sensorDataLog22);
        java.lang.String str27 = legacyMotionUnit16.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit28 = null;
        scheduler.sensor.SensorDataLog sensorDataLog29 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter30 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit28, sensorDataLog29);
        scheduler.sensor.SensorReading sensorReading31 = null;
        sensorDataLog29.record(sensorReading31);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter33 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit16, sensorDataLog29);
        java.lang.String str34 = motionUnitOccupancyAdapter33.getSensorDescription();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit35 = null;
        scheduler.sensor.SensorDataLog sensorDataLog36 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter37 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit35, sensorDataLog36);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit38 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader39 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit40 = null;
        scheduler.sensor.SensorDataLog sensorDataLog41 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter42 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit40, sensorDataLog41);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader43 = null;
        scheduler.sensor.SensorDataLog sensorDataLog44 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter45 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader43, sensorDataLog44);
        scheduler.sensor.SensorSimulationController sensorSimulationController46 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit38, magStripeBadgeReader39, motionUnitOccupancyAdapter42, magStripeBadgeAdapter45);
        scheduler.service.CheckInService checkInService47 = null;
        scheduler.service.BookingService bookingService48 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository49 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog50 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService51 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter37, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter45, checkInService47, bookingService48, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository49, sensorDataLog50);
        scheduler.sensor.BadgeScanner badgeScanner52 = sensorCheckInService51.getBadgeScanner();
        scheduler.service.CheckInService checkInService53 = null;
        scheduler.service.BookingService bookingService54 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit55 = null;
        scheduler.sensor.SensorDataLog sensorDataLog56 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter57 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit55, sensorDataLog56);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit58 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader59 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit60 = null;
        scheduler.sensor.SensorDataLog sensorDataLog61 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter62 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit60, sensorDataLog61);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader63 = null;
        scheduler.sensor.SensorDataLog sensorDataLog64 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter65 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader63, sensorDataLog64);
        scheduler.sensor.SensorSimulationController sensorSimulationController66 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit58, magStripeBadgeReader59, motionUnitOccupancyAdapter62, magStripeBadgeAdapter65);
        scheduler.service.CheckInService checkInService67 = null;
        scheduler.service.BookingService bookingService68 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository69 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog70 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService71 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter57, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter65, checkInService67, bookingService68, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository69, sensorDataLog70);
        scheduler.repository.BadgeScanRepository badgeScanRepository72 = sensorCheckInService71.getBadgeScanRepository();
        scheduler.repository.BadgeScanRepository badgeScanRepository73 = sensorCheckInService71.getBadgeScanRepository();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit74 = null;
        scheduler.sensor.SensorDataLog sensorDataLog75 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter76 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit74, sensorDataLog75);
        scheduler.sensor.SensorReading sensorReading77 = null;
        sensorDataLog75.record(sensorReading77);
        scheduler.sensor.SensorReading.Source source79 = scheduler.sensor.SensorReading.Source.SYSTEM;
        sensorDataLog75.record(source79, "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        scheduler.sensor.SensorCheckInService sensorCheckInService83 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter33, badgeScanner52, checkInService53, bookingService54, badgeScanRepository73, sensorDataLog75);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter84 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit8, sensorDataLog75);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter85 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog75);
        java.lang.Class<?> wildcardClass86 = legacyMotionUnit0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str20.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str27.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str34.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository73);
        org.junit.Assert.assertTrue("'" + source79 + "' != '" + scheduler.sensor.SensorReading.Source.SYSTEM + "'", source79.equals(scheduler.sensor.SensorReading.Source.SYSTEM));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        int int5 = legacyMotionUnit0.pollMotionLevel((int) '#');
        int int7 = legacyMotionUnit0.pollMotionLevel((-1));
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit8 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader9 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit10 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader11 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit12 = null;
        scheduler.sensor.SensorDataLog sensorDataLog13 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter14 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit12, sensorDataLog13);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader15 = null;
        scheduler.sensor.SensorDataLog sensorDataLog16 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter17 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader15, sensorDataLog16);
        scheduler.sensor.SensorSimulationController sensorSimulationController18 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit10, magStripeBadgeReader11, motionUnitOccupancyAdapter14, magStripeBadgeAdapter17);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit19 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader20 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = null;
        scheduler.sensor.SensorDataLog sensorDataLog22 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter23 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit21, sensorDataLog22);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader24 = null;
        scheduler.sensor.SensorDataLog sensorDataLog25 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter26 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader24, sensorDataLog25);
        scheduler.sensor.SensorSimulationController sensorSimulationController27 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit19, magStripeBadgeReader20, motionUnitOccupancyAdapter23, magStripeBadgeAdapter26);
        scheduler.sensor.SensorSimulationController sensorSimulationController28 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit8, magStripeBadgeReader9, motionUnitOccupancyAdapter14, magStripeBadgeAdapter26);
        boolean boolean30 = magStripeBadgeReader9.hasPendingCard("CH-hi!");
        java.lang.String str32 = magStripeBadgeReader9.readTrack("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        boolean boolean34 = magStripeBadgeReader9.hasPendingCard("AcmeSense LMU-900 (fw 2.4.1, simulated)");
        boolean boolean36 = magStripeBadgeReader9.hasPendingCard("[Aug 3, 23:56:36] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        java.lang.String str38 = magStripeBadgeReader9.readTrack("CH-CH-%YU^hi!^1785815794?");
        java.lang.String str40 = magStripeBadgeReader9.readTrack("[23:56:39] OCCUPANCY_SENSOR (): CH-hi!");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit41 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit41.injectMotion(0, (int) '#');
        java.lang.String str45 = legacyMotionUnit41.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit46 = null;
        scheduler.sensor.SensorDataLog sensorDataLog47 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter48 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit46, sensorDataLog47);
        scheduler.sensor.SensorReading sensorReading49 = null;
        sensorDataLog47.record(sensorReading49);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter51 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit41, sensorDataLog47);
        java.lang.String str52 = legacyMotionUnit41.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit53 = null;
        scheduler.sensor.SensorDataLog sensorDataLog54 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter55 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit53, sensorDataLog54);
        scheduler.sensor.SensorReading sensorReading56 = null;
        sensorDataLog54.record(sensorReading56);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter58 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit41, sensorDataLog54);
        java.lang.String str59 = motionUnitOccupancyAdapter58.getSensorDescription();
        boolean boolean61 = motionUnitOccupancyAdapter58.isOccupancyDetected("");
        boolean boolean63 = motionUnitOccupancyAdapter58.isOccupancyDetected("");
        int int65 = motionUnitOccupancyAdapter58.zoneCodeFor("CH-%YU^%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?^1785815798?");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit66 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit66.injectMotion(0, (int) '#');
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader70 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit71 = null;
        scheduler.sensor.SensorDataLog sensorDataLog72 = null;
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter73 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit71, sensorDataLog72);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit74 = null;
        scheduler.sensor.SensorDataLog sensorDataLog75 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter76 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit74, sensorDataLog75);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit77 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader78 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit79 = null;
        scheduler.sensor.SensorDataLog sensorDataLog80 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter81 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit79, sensorDataLog80);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader82 = null;
        scheduler.sensor.SensorDataLog sensorDataLog83 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter84 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader82, sensorDataLog83);
        scheduler.sensor.SensorSimulationController sensorSimulationController85 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit77, magStripeBadgeReader78, motionUnitOccupancyAdapter81, magStripeBadgeAdapter84);
        scheduler.service.CheckInService checkInService86 = null;
        scheduler.service.BookingService bookingService87 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository88 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog89 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService90 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter76, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter84, checkInService86, bookingService87, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository88, sensorDataLog89);
        scheduler.sensor.SensorSimulationController sensorSimulationController91 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit66, magStripeBadgeReader70, motionUnitOccupancyAdapter73, magStripeBadgeAdapter84);
        scheduler.sensor.SensorSimulationController sensorSimulationController92 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader9, motionUnitOccupancyAdapter58, magStripeBadgeAdapter84);
        boolean boolean94 = sensorSimulationController92.sensorReadsOccupied("");
        int int96 = sensorSimulationController92.currentMotionLevel("CH-[Aug 3, 23:56:36] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        boolean boolean98 = sensorSimulationController92.sensorReadsOccupied("[23:57:27] OCCUPANCY_SENSOR ([23:56:48] OCCUPANCY_SENSOR (): CH-hi!): [23:56:38] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str45.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str52.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str59.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        java.lang.String str4 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.SensorReading sensorReading8 = null;
        sensorDataLog6.record(sensorReading8);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter10 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog6);
        java.lang.String str11 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit12 = null;
        scheduler.sensor.SensorDataLog sensorDataLog13 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter14 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit12, sensorDataLog13);
        scheduler.sensor.SensorReading sensorReading15 = null;
        sensorDataLog13.record(sensorReading15);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter17 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog13);
        java.lang.String str18 = motionUnitOccupancyAdapter17.getSensorDescription();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit19 = null;
        scheduler.sensor.SensorDataLog sensorDataLog20 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter21 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit19, sensorDataLog20);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit22 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader23 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit24 = null;
        scheduler.sensor.SensorDataLog sensorDataLog25 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter26 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit24, sensorDataLog25);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader27 = null;
        scheduler.sensor.SensorDataLog sensorDataLog28 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter29 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader27, sensorDataLog28);
        scheduler.sensor.SensorSimulationController sensorSimulationController30 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit22, magStripeBadgeReader23, motionUnitOccupancyAdapter26, magStripeBadgeAdapter29);
        scheduler.service.CheckInService checkInService31 = null;
        scheduler.service.BookingService bookingService32 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository33 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog34 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService35 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter21, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter29, checkInService31, bookingService32, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository33, sensorDataLog34);
        scheduler.sensor.BadgeScanner badgeScanner36 = sensorCheckInService35.getBadgeScanner();
        scheduler.service.CheckInService checkInService37 = null;
        scheduler.service.BookingService bookingService38 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit39 = null;
        scheduler.sensor.SensorDataLog sensorDataLog40 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter41 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit39, sensorDataLog40);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit42 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader43 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit44 = null;
        scheduler.sensor.SensorDataLog sensorDataLog45 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter46 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit44, sensorDataLog45);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader47 = null;
        scheduler.sensor.SensorDataLog sensorDataLog48 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter49 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader47, sensorDataLog48);
        scheduler.sensor.SensorSimulationController sensorSimulationController50 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit42, magStripeBadgeReader43, motionUnitOccupancyAdapter46, magStripeBadgeAdapter49);
        scheduler.service.CheckInService checkInService51 = null;
        scheduler.service.BookingService bookingService52 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository53 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog54 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService55 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter41, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter49, checkInService51, bookingService52, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository53, sensorDataLog54);
        scheduler.repository.BadgeScanRepository badgeScanRepository56 = sensorCheckInService55.getBadgeScanRepository();
        scheduler.repository.BadgeScanRepository badgeScanRepository57 = sensorCheckInService55.getBadgeScanRepository();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit58 = null;
        scheduler.sensor.SensorDataLog sensorDataLog59 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter60 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit58, sensorDataLog59);
        scheduler.sensor.SensorReading sensorReading61 = null;
        sensorDataLog59.record(sensorReading61);
        scheduler.sensor.SensorReading.Source source63 = scheduler.sensor.SensorReading.Source.SYSTEM;
        sensorDataLog59.record(source63, "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        scheduler.sensor.SensorCheckInService sensorCheckInService67 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter17, badgeScanner36, checkInService37, bookingService38, badgeScanRepository57, sensorDataLog59);
        scheduler.sensor.OccupancySensor occupancySensor68 = sensorCheckInService67.getOccupancySensor();
        scheduler.sensor.BadgeScanner badgeScanner69 = sensorCheckInService67.getBadgeScanner();
        scheduler.model.Booking booking70 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int71 = sensorCheckInService67.getTappedInCount(booking70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getBookingId()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str4.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str11.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str18.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository57);
        org.junit.Assert.assertTrue("'" + source63 + "' != '" + scheduler.sensor.SensorReading.Source.SYSTEM + "'", source63.equals(scheduler.sensor.SensorReading.Source.SYSTEM));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner69);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader0 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        magStripeBadgeReader0.insertCard("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "%YU^hi!^1785815794?");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.SensorReading.Source source7 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading10 = new scheduler.sensor.SensorReading(source7, "", "CH-hi!");
        java.lang.String str11 = sensorReading10.getRoomId();
        sensorDataLog5.record(sensorReading10);
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter13 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader0, sensorDataLog5);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit14 = null;
        scheduler.sensor.SensorDataLog sensorDataLog15 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter16 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit14, sensorDataLog15);
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter17 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader0, sensorDataLog15);
        java.lang.String str19 = magStripeBadgeAdapter17.scanBadge("%YU^[23:56:36] OCCUPANCY_SENSOR (): CH-hi!^1785815796?");
        java.lang.String str21 = magStripeBadgeAdapter17.scanBadge("%YU^SwipeTech MSR-210 (fw 1.0.7, simulated)^1785815797?");
        java.lang.String str23 = magStripeBadgeAdapter17.channelFor("[23:56:46] OCCUPANCY_SENSOR (): CH-hi!");
        java.lang.String str25 = magStripeBadgeAdapter17.channelFor("[Aug 3, 23:57:16] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        org.junit.Assert.assertTrue("'" + source7 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source7.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "CH-[23:56:46] OCCUPANCY_SENSOR (): CH-hi!" + "'", str23.equals("CH-[23:56:46] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "CH-[Aug 3, 23:57:16] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN" + "'", str25.equals("CH-[Aug 3, 23:57:16] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN"));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        scheduler.sensor.OccupancySensor occupancySensor0 = null;
        scheduler.sensor.BadgeScanner badgeScanner1 = null;
        scheduler.service.CheckInService checkInService2 = null;
        scheduler.service.BookingService bookingService3 = null;
        scheduler.repository.BadgeScanRepository badgeScanRepository4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = null;
        scheduler.sensor.SensorCheckInService sensorCheckInService6 = new scheduler.sensor.SensorCheckInService(occupancySensor0, badgeScanner1, checkInService2, bookingService3, badgeScanRepository4, sensorDataLog5);
        scheduler.sensor.BadgeScanner badgeScanner7 = sensorCheckInService6.getBadgeScanner();
        scheduler.repository.BadgeScanRepository badgeScanRepository8 = sensorCheckInService6.getBadgeScanRepository();
        scheduler.sensor.BadgeScanner badgeScanner9 = sensorCheckInService6.getBadgeScanner();
        scheduler.sensor.BadgeScanner badgeScanner10 = sensorCheckInService6.getBadgeScanner();
        scheduler.repository.BadgeScanRepository badgeScanRepository11 = sensorCheckInService6.getBadgeScanRepository();
        scheduler.repository.BadgeScanRepository badgeScanRepository12 = sensorCheckInService6.getBadgeScanRepository();
        scheduler.model.Booking booking13 = null;
        scheduler.model.RegisteredUser registeredUser14 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.sensor.SensorCheckInService.ScanOutcome scanOutcome15 = sensorCheckInService6.processBadgePresentation(booking13, registeredUser14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getRoom()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanRepository8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanner9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanner10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanRepository11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanRepository12);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.sensor.BadgeScanRecord.Result result6 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord7 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime5, result6);
        java.time.LocalDateTime localDateTime8 = badgeScanRecord7.getScannedAt();
        java.lang.String str9 = badgeScanRecord7.getIdentificationNumber();
        java.time.LocalDateTime localDateTime10 = badgeScanRecord7.getScannedAt();
        java.lang.String str11 = badgeScanRecord7.getFullName();
        java.lang.String str12 = badgeScanRecord7.getBookingId();
        java.lang.String str13 = badgeScanRecord7.getFullName();
        java.lang.String str14 = badgeScanRecord7.getFullName();
        java.lang.String str15 = badgeScanRecord7.getIdentificationNumber();
        java.lang.String str16 = badgeScanRecord7.getUserId();
        org.junit.Assert.assertTrue("'" + result6 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result6.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader22 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit23 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader24 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit25 = null;
        scheduler.sensor.SensorDataLog sensorDataLog26 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter27 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit25, sensorDataLog26);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader28 = null;
        scheduler.sensor.SensorDataLog sensorDataLog29 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter30 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader28, sensorDataLog29);
        scheduler.sensor.SensorSimulationController sensorSimulationController31 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit23, magStripeBadgeReader24, motionUnitOccupancyAdapter27, magStripeBadgeAdapter30);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit32 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader33 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit34 = null;
        scheduler.sensor.SensorDataLog sensorDataLog35 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter36 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit34, sensorDataLog35);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader37 = null;
        scheduler.sensor.SensorDataLog sensorDataLog38 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter39 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader37, sensorDataLog38);
        scheduler.sensor.SensorSimulationController sensorSimulationController40 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit32, magStripeBadgeReader33, motionUnitOccupancyAdapter36, magStripeBadgeAdapter39);
        scheduler.sensor.SensorSimulationController sensorSimulationController41 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit21, magStripeBadgeReader22, motionUnitOccupancyAdapter27, magStripeBadgeAdapter39);
        java.lang.String str42 = magStripeBadgeReader22.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit43 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader44 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter47 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit45, sensorDataLog46);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader48 = null;
        scheduler.sensor.SensorDataLog sensorDataLog49 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter50 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader48, sensorDataLog49);
        scheduler.sensor.SensorSimulationController sensorSimulationController51 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit43, magStripeBadgeReader44, motionUnitOccupancyAdapter47, magStripeBadgeAdapter50);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit52 = null;
        scheduler.sensor.SensorDataLog sensorDataLog53 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter54 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit52, sensorDataLog53);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit55 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader56 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit57 = null;
        scheduler.sensor.SensorDataLog sensorDataLog58 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter59 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit57, sensorDataLog58);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader60 = null;
        scheduler.sensor.SensorDataLog sensorDataLog61 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter62 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader60, sensorDataLog61);
        scheduler.sensor.SensorSimulationController sensorSimulationController63 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit55, magStripeBadgeReader56, motionUnitOccupancyAdapter59, magStripeBadgeAdapter62);
        scheduler.service.CheckInService checkInService64 = null;
        scheduler.service.BookingService bookingService65 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository66 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog67 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService68 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter54, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter62, checkInService64, bookingService65, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository66, sensorDataLog67);
        java.lang.String str70 = magStripeBadgeAdapter62.channelFor("hi!");
        java.lang.String str72 = magStripeBadgeAdapter62.channelFor("AcmeSense LMU-900 (fw 2.4.1, simulated)");
        scheduler.service.CheckInService checkInService73 = null;
        scheduler.service.BookingService bookingService74 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository75 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog76 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService77 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter47, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter62, checkInService73, bookingService74, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository75, sensorDataLog76);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader78 = null;
        scheduler.sensor.SensorDataLog sensorDataLog79 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter80 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader78, sensorDataLog79);
        java.lang.String str82 = magStripeBadgeAdapter80.channelFor("hi!");
        scheduler.sensor.SensorSimulationController sensorSimulationController83 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader22, motionUnitOccupancyAdapter47, magStripeBadgeAdapter80);
        java.lang.String str85 = magStripeBadgeReader22.readTrack("");
        java.lang.String str86 = magStripeBadgeReader22.getFirmwareBanner();
        boolean boolean88 = magStripeBadgeReader22.hasPendingCard("[Aug 3, 23:56:50] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        magStripeBadgeReader22.insertCard("%YU^[23:56:39] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!^1785815813?", "[23:56:44] OCCUPANCY_SENSOR ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-AcmeSense LMU-900 (fw 2.4.1, simulated)");
        java.lang.String str92 = magStripeBadgeReader22.getFirmwareBanner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "SwipeTech MSR-210 (fw 1.0.7, simulated)" + "'", str42.equals("SwipeTech MSR-210 (fw 1.0.7, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "CH-hi!" + "'", str70.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "CH-AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str72.equals("CH-AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "CH-hi!" + "'", str82.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "SwipeTech MSR-210 (fw 1.0.7, simulated)" + "'", str86.equals("SwipeTech MSR-210 (fw 1.0.7, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "SwipeTech MSR-210 (fw 1.0.7, simulated)" + "'", str92.equals("SwipeTech MSR-210 (fw 1.0.7, simulated)"));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = null;
        scheduler.sensor.SensorDataLog sensorDataLog1 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter2 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog1);
        scheduler.sensor.SensorReading.Source source3 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading6 = new scheduler.sensor.SensorReading(source3, "", "CH-hi!");
        java.lang.String str7 = sensorReading6.getRoomId();
        sensorDataLog1.record(sensorReading6);
        java.lang.String str9 = sensorReading6.getDetail();
        java.lang.String str10 = sensorReading6.toString();
        java.time.LocalDateTime localDateTime11 = sensorReading6.getTimestamp();
        java.lang.String str12 = sensorReading6.getDetail();
        org.junit.Assert.assertTrue("'" + source3 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source3.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "CH-hi!" + "'", str9.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[23:57:33] OCCUPANCY_SENSOR (): CH-hi!" + "'", str10.equals("[23:57:33] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "CH-hi!" + "'", str12.equals("CH-hi!"));
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        java.lang.String str4 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.SensorReading sensorReading8 = null;
        sensorDataLog6.record(sensorReading8);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter10 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog6);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader14 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit15 = null;
        scheduler.sensor.SensorDataLog sensorDataLog16 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter17 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit15, sensorDataLog16);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader18 = null;
        scheduler.sensor.SensorDataLog sensorDataLog19 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter20 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader18, sensorDataLog19);
        scheduler.sensor.SensorSimulationController sensorSimulationController21 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit13, magStripeBadgeReader14, motionUnitOccupancyAdapter17, magStripeBadgeAdapter20);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit22 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader23 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit24 = null;
        scheduler.sensor.SensorDataLog sensorDataLog25 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter26 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit24, sensorDataLog25);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader27 = null;
        scheduler.sensor.SensorDataLog sensorDataLog28 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter29 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader27, sensorDataLog28);
        scheduler.sensor.SensorSimulationController sensorSimulationController30 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit22, magStripeBadgeReader23, motionUnitOccupancyAdapter26, magStripeBadgeAdapter29);
        scheduler.sensor.SensorSimulationController sensorSimulationController31 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter17, magStripeBadgeAdapter29);
        java.lang.String str33 = magStripeBadgeReader12.readTrack("CH-hi!");
        magStripeBadgeReader12.insertCard("hi!", "");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit37 = null;
        scheduler.sensor.SensorDataLog sensorDataLog38 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter39 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit37, sensorDataLog38);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit40 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader41 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit42 = null;
        scheduler.sensor.SensorDataLog sensorDataLog43 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter44 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit42, sensorDataLog43);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter47 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader45, sensorDataLog46);
        scheduler.sensor.SensorSimulationController sensorSimulationController48 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit40, magStripeBadgeReader41, motionUnitOccupancyAdapter44, magStripeBadgeAdapter47);
        scheduler.service.CheckInService checkInService49 = null;
        scheduler.service.BookingService bookingService50 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository51 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog52 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService53 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter39, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter47, checkInService49, bookingService50, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository51, sensorDataLog52);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader54 = null;
        scheduler.sensor.SensorDataLog sensorDataLog55 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter56 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader54, sensorDataLog55);
        scheduler.sensor.SensorSimulationController sensorSimulationController57 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader12, motionUnitOccupancyAdapter39, magStripeBadgeAdapter56);
        magStripeBadgeReader12.insertCard("[23:56:37] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "%YU^%YU^[23:56:38] OCCUPANCY_SENSOR (): CH-hi!^1785815800?^1785815802?");
        boolean boolean62 = magStripeBadgeReader12.hasPendingCard("[23:57:08] OCCUPANCY_SENSOR (): CH-hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str4.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        scheduler.sensor.SensorReading.Source source5 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading8 = new scheduler.sensor.SensorReading(source5, "", "CH-hi!");
        java.time.LocalDateTime localDateTime9 = sensorReading8.getTimestamp();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit15 = null;
        scheduler.sensor.SensorDataLog sensorDataLog16 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter17 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit15, sensorDataLog16);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit18 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader19 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit20 = null;
        scheduler.sensor.SensorDataLog sensorDataLog21 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter22 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit20, sensorDataLog21);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader23 = null;
        scheduler.sensor.SensorDataLog sensorDataLog24 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter25 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader23, sensorDataLog24);
        scheduler.sensor.SensorSimulationController sensorSimulationController26 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit18, magStripeBadgeReader19, motionUnitOccupancyAdapter22, magStripeBadgeAdapter25);
        scheduler.service.CheckInService checkInService27 = null;
        scheduler.service.BookingService bookingService28 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository29 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog30 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService31 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter17, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter25, checkInService27, bookingService28, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository29, sensorDataLog30);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit33 = null;
        scheduler.sensor.SensorDataLog sensorDataLog34 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter35 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit33, sensorDataLog34);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit36 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader37 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit38 = null;
        scheduler.sensor.SensorDataLog sensorDataLog39 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter40 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit38, sensorDataLog39);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader41 = null;
        scheduler.sensor.SensorDataLog sensorDataLog42 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter43 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader41, sensorDataLog42);
        scheduler.sensor.SensorSimulationController sensorSimulationController44 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit36, magStripeBadgeReader37, motionUnitOccupancyAdapter40, magStripeBadgeAdapter43);
        scheduler.service.CheckInService checkInService45 = null;
        scheduler.service.BookingService bookingService46 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository47 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog48 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService49 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter35, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter43, checkInService45, bookingService46, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository47, sensorDataLog48);
        scheduler.sensor.SensorReading.Source source52 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading55 = new scheduler.sensor.SensorReading(source52, "", "CH-hi!");
        java.time.LocalDateTime localDateTime56 = sensorReading55.getTimestamp();
        boolean boolean57 = false; // flaky: sqliteBadgeScanRepository47.hasTapped("%YU^hi!^1785815794?", "CH-hi!", localDateTime56);
        int int58 = 0; // flaky: sqliteBadgeScanRepository29.countDistinctTappersForBooking("AcmeSense LMU-900 (fw 2.4.1, simulated)", localDateTime56);
        scheduler.sensor.BadgeScanRecord.Result result59 = scheduler.sensor.BadgeScanRecord.Result.OWNER_CHECK_IN;
        scheduler.sensor.BadgeScanRecord badgeScanRecord60 = new scheduler.sensor.BadgeScanRecord("+0m", "%YU^%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?^1785815797?", "[23:56:37] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "%YU^[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?", "", localDateTime56, result59);
        scheduler.sensor.BadgeScanRecord badgeScanRecord61 = new scheduler.sensor.BadgeScanRecord("[23:56:40] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "[23:56:41] OCCUPANCY_SENSOR (): CH-hi!", "%YU^CH-%YU^hi!^1785815794?^1785815801?", "[Aug 3, 23:56:38] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", localDateTime9, result59);
        java.lang.String str62 = badgeScanRecord61.getBookingId();
        java.lang.String str63 = badgeScanRecord61.getUserId();
        java.lang.String str64 = badgeScanRecord61.getBookingId();
        org.junit.Assert.assertTrue("'" + source5 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source5.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + source52 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source52.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + result59 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.OWNER_CHECK_IN + "'", result59.equals(scheduler.sensor.BadgeScanRecord.Result.OWNER_CHECK_IN));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!" + "'", str62.equals("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[23:56:40] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str63.equals("[23:56:40] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!" + "'", str64.equals("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!"));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        boolean boolean22 = magStripeBadgeReader1.hasPendingCard("CH-hi!");
        java.lang.String str24 = magStripeBadgeReader1.readTrack("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        magStripeBadgeReader1.insertCard("[Aug 3, 23:56:36] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN", "SwipeTech MSR-210 (fw 1.0.7, simulated)");
        magStripeBadgeReader1.insertCard("[23:56:44] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "%YU^[23:56:39] OCCUPANCY_SENSOR (): CH-hi!^1785815802?");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit31 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit31.injectMotion(0, (int) '#');
        int int36 = legacyMotionUnit31.registerZone("hi!");
        java.lang.String str37 = legacyMotionUnit31.getFirmwareBanner();
        int int39 = legacyMotionUnit31.registerZone("SwipeTech MSR-210 (fw 1.0.7, simulated)");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit40 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit40.injectMotion(0, (int) '#');
        java.lang.String str44 = legacyMotionUnit40.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter47 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit45, sensorDataLog46);
        scheduler.sensor.SensorReading sensorReading48 = null;
        sensorDataLog46.record(sensorReading48);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter50 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit40, sensorDataLog46);
        java.lang.String str51 = legacyMotionUnit40.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit52 = null;
        scheduler.sensor.SensorDataLog sensorDataLog53 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter54 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit52, sensorDataLog53);
        scheduler.sensor.SensorReading sensorReading55 = null;
        sensorDataLog53.record(sensorReading55);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter57 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit40, sensorDataLog53);
        int int59 = legacyMotionUnit40.pollMotionLevel((int) (short) 1);
        scheduler.sensor.SensorDataLog sensorDataLog60 = new scheduler.sensor.SensorDataLog();
        java.util.List<scheduler.sensor.SensorReading> sensorReadingList61 = sensorDataLog60.getReadings();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter62 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit40, sensorDataLog60);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter63 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit31, sensorDataLog60);
        java.util.List<scheduler.sensor.SensorReading> sensorReadingList64 = sensorDataLog60.getReadings();
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter65 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader1, sensorDataLog60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str37.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str44.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str51.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorReadingList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorReadingList64);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        boolean boolean22 = sensorSimulationController20.isBadgeWaiting("CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        boolean boolean25 = sensorSimulationController20.personLeavesRoom("CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        boolean boolean28 = sensorSimulationController20.isPersonInside("[23:56:44] OCCUPANCY_SENSOR (AcmeSense LMU-900 (fw 2.4.1, simulated)): CH-CH-[23:56:36] OCCUPANCY_SENSOR (): CH-hi!", "[Aug 3, 23:56:45] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        boolean boolean31 = sensorSimulationController20.isPersonInside("[23:56:44] OCCUPANCY_SENSOR (AcmeSense LMU-900 (fw 2.4.1, simulated)): CH-CH-[23:56:36] OCCUPANCY_SENSOR (): CH-hi!", "[Aug 3, 23:56:59] CH-AcmeSense LMU-900 (fw 2.4.1, simulated)  CH-%YU^hi!^1785815794? ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!)  TAPPED IN");
        sensorSimulationController20.personSwipesBadge("[23:56:45] OCCUPANCY_SENSOR (CH-[23:56:36] OCCUPANCY_SENSOR (): CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "%YU^CH-[23:56:44] OCCUPANCY_SENSOR (): CH-hi!^1785815804?");
        sensorSimulationController20.personSwipesBadge("[23:57:04] BADGE_SCANNER (CH-hi!): CH-AcmeSense LMU-900 (fw 2.4.1, simulated)", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        java.lang.String str22 = magStripeBadgeReader1.readTrack("CH-hi!");
        scheduler.sensor.SensorDataLog sensorDataLog23 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter24 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader1, sensorDataLog23);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit25 = null;
        scheduler.sensor.SensorDataLog sensorDataLog26 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter27 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit25, sensorDataLog26);
        scheduler.sensor.SensorReading sensorReading28 = null;
        sensorDataLog26.record(sensorReading28);
        scheduler.sensor.SensorReading.Source source30 = scheduler.sensor.SensorReading.Source.SYSTEM;
        sensorDataLog26.record(source30, "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        java.lang.Runnable runnable34 = null;
        sensorDataLog26.addUpdateCallback(runnable34);
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter36 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader1, sensorDataLog26);
        java.lang.String str38 = magStripeBadgeAdapter36.channelFor("[23:56:38] OCCUPANCY_SENSOR (): CH-hi!");
        java.lang.String str40 = magStripeBadgeAdapter36.channelFor("[23:57:14] OCCUPANCY_SENSOR (%YU^%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?^1785815797?): %YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + source30 + "' != '" + scheduler.sensor.SensorReading.Source.SYSTEM + "'", source30.equals(scheduler.sensor.SensorReading.Source.SYSTEM));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "CH-[23:56:38] OCCUPANCY_SENSOR (): CH-hi!" + "'", str38.equals("CH-[23:56:38] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "CH-[23:57:14] OCCUPANCY_SENSOR (%YU^%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?^1785815797?): %YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?" + "'", str40.equals("CH-[23:57:14] OCCUPANCY_SENSOR (%YU^%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?^1785815797?): %YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?"));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        java.lang.String str4 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.SensorReading sensorReading8 = null;
        sensorDataLog6.record(sensorReading8);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter10 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog6);
        java.lang.String str11 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit12 = null;
        scheduler.sensor.SensorDataLog sensorDataLog13 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter14 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit12, sensorDataLog13);
        scheduler.sensor.SensorReading sensorReading15 = null;
        sensorDataLog13.record(sensorReading15);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter17 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog13);
        int int19 = legacyMotionUnit0.pollMotionLevel((int) (short) 1);
        scheduler.sensor.SensorDataLog sensorDataLog20 = new scheduler.sensor.SensorDataLog();
        java.util.List<scheduler.sensor.SensorReading> sensorReadingList21 = sensorDataLog20.getReadings();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter22 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog20);
        int int24 = legacyMotionUnit0.pollMotionLevel((int) '#');
        int int26 = legacyMotionUnit0.registerZone("[Aug 3, 23:57:31] CH-AcmeSense LMU-900 (fw 2.4.1, simulated)  CH-%YU^hi!^1785815794? ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!)  TAPPED IN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str4.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str11.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorReadingList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = null;
        scheduler.sensor.SensorDataLog sensorDataLog22 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter23 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit21, sensorDataLog22);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit24 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader25 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit26 = null;
        scheduler.sensor.SensorDataLog sensorDataLog27 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter28 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit26, sensorDataLog27);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader29 = null;
        scheduler.sensor.SensorDataLog sensorDataLog30 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter31 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader29, sensorDataLog30);
        scheduler.sensor.SensorSimulationController sensorSimulationController32 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit24, magStripeBadgeReader25, motionUnitOccupancyAdapter28, magStripeBadgeAdapter31);
        scheduler.service.CheckInService checkInService33 = null;
        scheduler.service.BookingService bookingService34 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository35 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog36 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService37 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter23, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter31, checkInService33, bookingService34, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository35, sensorDataLog36);
        scheduler.service.CheckInService checkInService38 = null;
        scheduler.service.BookingService bookingService39 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit40 = null;
        scheduler.sensor.SensorDataLog sensorDataLog41 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter42 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit40, sensorDataLog41);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit43 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader44 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter47 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit45, sensorDataLog46);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader48 = null;
        scheduler.sensor.SensorDataLog sensorDataLog49 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter50 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader48, sensorDataLog49);
        scheduler.sensor.SensorSimulationController sensorSimulationController51 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit43, magStripeBadgeReader44, motionUnitOccupancyAdapter47, magStripeBadgeAdapter50);
        scheduler.service.CheckInService checkInService52 = null;
        scheduler.service.BookingService bookingService53 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository54 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog55 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService56 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter42, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter50, checkInService52, bookingService53, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository54, sensorDataLog55);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit57 = null;
        scheduler.sensor.SensorDataLog sensorDataLog58 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter59 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit57, sensorDataLog58);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit60 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader61 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit62 = null;
        scheduler.sensor.SensorDataLog sensorDataLog63 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter64 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit62, sensorDataLog63);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader65 = null;
        scheduler.sensor.SensorDataLog sensorDataLog66 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter67 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader65, sensorDataLog66);
        scheduler.sensor.SensorSimulationController sensorSimulationController68 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit60, magStripeBadgeReader61, motionUnitOccupancyAdapter64, magStripeBadgeAdapter67);
        scheduler.service.CheckInService checkInService69 = null;
        scheduler.service.BookingService bookingService70 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository71 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog72 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService73 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter59, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter67, checkInService69, bookingService70, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository71, sensorDataLog72);
        scheduler.sensor.SensorCheckInService sensorCheckInService74 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter6, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter31, checkInService38, bookingService39, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository54, sensorDataLog72);
        scheduler.repository.BadgeScanRepository badgeScanRepository75 = sensorCheckInService74.getBadgeScanRepository();
        scheduler.sensor.BadgeScanner badgeScanner76 = sensorCheckInService74.getBadgeScanner();
        scheduler.sensor.OccupancySensor occupancySensor77 = sensorCheckInService74.getOccupancySensor();
        scheduler.repository.BadgeScanRepository badgeScanRepository78 = sensorCheckInService74.getBadgeScanRepository();
        scheduler.model.Booking booking79 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime80 = sensorCheckInService74.checkInOpensAt(booking79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository78);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.time.LocalDateTime localDateTime5 = null;
        scheduler.sensor.BadgeScanRecord.Result result6 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord7 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime5, result6);
        java.lang.String str8 = badgeScanRecord7.getRoomId();
        java.lang.String str9 = badgeScanRecord7.getFullName();
        java.lang.String str10 = badgeScanRecord7.getFullName();
        java.lang.String str11 = badgeScanRecord7.getUserId();
        scheduler.sensor.BadgeScanRecord.Result result12 = badgeScanRecord7.getResult();
        java.lang.String str13 = badgeScanRecord7.getUserId();
        java.lang.String str14 = badgeScanRecord7.getBookingId();
        org.junit.Assert.assertTrue("'" + result6 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result6.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + result12 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result12.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        scheduler.sensor.OccupancySensor occupancySensor0 = null;
        scheduler.sensor.BadgeScanner badgeScanner1 = null;
        scheduler.service.CheckInService checkInService2 = null;
        scheduler.service.BookingService bookingService3 = null;
        scheduler.repository.BadgeScanRepository badgeScanRepository4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = null;
        scheduler.sensor.SensorCheckInService sensorCheckInService6 = new scheduler.sensor.SensorCheckInService(occupancySensor0, badgeScanner1, checkInService2, bookingService3, badgeScanRepository4, sensorDataLog5);
        scheduler.sensor.BadgeScanner badgeScanner7 = sensorCheckInService6.getBadgeScanner();
        scheduler.sensor.BadgeScanner badgeScanner8 = sensorCheckInService6.getBadgeScanner();
        scheduler.sensor.OccupancySensor occupancySensor9 = sensorCheckInService6.getOccupancySensor();
        scheduler.sensor.OccupancySensor occupancySensor10 = sensorCheckInService6.getOccupancySensor();
        scheduler.sensor.BadgeScanner badgeScanner11 = sensorCheckInService6.getBadgeScanner();
        scheduler.sensor.BadgeScanner badgeScanner12 = sensorCheckInService6.getBadgeScanner();
        scheduler.sensor.BadgeScanner badgeScanner13 = sensorCheckInService6.getBadgeScanner();
        scheduler.sensor.OccupancySensor occupancySensor14 = sensorCheckInService6.getOccupancySensor();
        scheduler.model.Booking booking15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = sensorCheckInService6.isTooEarly(booking15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanner8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(occupancySensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(occupancySensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanner11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanner12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(badgeScanner13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(occupancySensor14);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader22 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit23 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader24 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit25 = null;
        scheduler.sensor.SensorDataLog sensorDataLog26 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter27 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit25, sensorDataLog26);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader28 = null;
        scheduler.sensor.SensorDataLog sensorDataLog29 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter30 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader28, sensorDataLog29);
        scheduler.sensor.SensorSimulationController sensorSimulationController31 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit23, magStripeBadgeReader24, motionUnitOccupancyAdapter27, magStripeBadgeAdapter30);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit32 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader33 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit34 = null;
        scheduler.sensor.SensorDataLog sensorDataLog35 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter36 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit34, sensorDataLog35);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader37 = null;
        scheduler.sensor.SensorDataLog sensorDataLog38 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter39 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader37, sensorDataLog38);
        scheduler.sensor.SensorSimulationController sensorSimulationController40 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit32, magStripeBadgeReader33, motionUnitOccupancyAdapter36, magStripeBadgeAdapter39);
        scheduler.sensor.SensorSimulationController sensorSimulationController41 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit21, magStripeBadgeReader22, motionUnitOccupancyAdapter27, magStripeBadgeAdapter39);
        java.lang.String str42 = magStripeBadgeReader22.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit43 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader44 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter47 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit45, sensorDataLog46);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader48 = null;
        scheduler.sensor.SensorDataLog sensorDataLog49 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter50 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader48, sensorDataLog49);
        scheduler.sensor.SensorSimulationController sensorSimulationController51 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit43, magStripeBadgeReader44, motionUnitOccupancyAdapter47, magStripeBadgeAdapter50);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit52 = null;
        scheduler.sensor.SensorDataLog sensorDataLog53 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter54 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit52, sensorDataLog53);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit55 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader56 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit57 = null;
        scheduler.sensor.SensorDataLog sensorDataLog58 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter59 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit57, sensorDataLog58);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader60 = null;
        scheduler.sensor.SensorDataLog sensorDataLog61 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter62 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader60, sensorDataLog61);
        scheduler.sensor.SensorSimulationController sensorSimulationController63 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit55, magStripeBadgeReader56, motionUnitOccupancyAdapter59, magStripeBadgeAdapter62);
        scheduler.service.CheckInService checkInService64 = null;
        scheduler.service.BookingService bookingService65 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository66 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog67 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService68 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter54, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter62, checkInService64, bookingService65, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository66, sensorDataLog67);
        java.lang.String str70 = magStripeBadgeAdapter62.channelFor("hi!");
        java.lang.String str72 = magStripeBadgeAdapter62.channelFor("AcmeSense LMU-900 (fw 2.4.1, simulated)");
        scheduler.service.CheckInService checkInService73 = null;
        scheduler.service.BookingService bookingService74 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository75 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog76 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService77 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter47, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter62, checkInService73, bookingService74, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository75, sensorDataLog76);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader78 = null;
        scheduler.sensor.SensorDataLog sensorDataLog79 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter80 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader78, sensorDataLog79);
        java.lang.String str82 = magStripeBadgeAdapter80.channelFor("hi!");
        scheduler.sensor.SensorSimulationController sensorSimulationController83 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader22, motionUnitOccupancyAdapter47, magStripeBadgeAdapter80);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit84 = null;
        scheduler.sensor.SensorDataLog sensorDataLog85 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter86 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit84, sensorDataLog85);
        scheduler.sensor.SensorReading sensorReading87 = null;
        sensorDataLog85.record(sensorReading87);
        scheduler.sensor.SensorReading.Source source89 = scheduler.sensor.SensorReading.Source.SYSTEM;
        sensorDataLog85.record(source89, "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter93 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader22, sensorDataLog85);
        java.lang.String str95 = magStripeBadgeAdapter93.channelFor("[Aug 3, 23:56:40] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        java.lang.String str96 = magStripeBadgeAdapter93.getScannerDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "SwipeTech MSR-210 (fw 1.0.7, simulated)" + "'", str42.equals("SwipeTech MSR-210 (fw 1.0.7, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "CH-hi!" + "'", str70.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "CH-AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str72.equals("CH-AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "CH-hi!" + "'", str82.equals("CH-hi!"));
        org.junit.Assert.assertTrue("'" + source89 + "' != '" + scheduler.sensor.SensorReading.Source.SYSTEM + "'", source89.equals(scheduler.sensor.SensorReading.Source.SYSTEM));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "CH-[Aug 3, 23:56:40] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN" + "'", str95.equals("CH-[Aug 3, 23:56:40] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "SwipeTech MSR-210 (fw 1.0.7, simulated)" + "'", str96.equals("SwipeTech MSR-210 (fw 1.0.7, simulated)"));
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        java.lang.String str4 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.SensorReading sensorReading8 = null;
        sensorDataLog6.record(sensorReading8);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter10 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog6);
        java.lang.String str11 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit12 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit12.injectMotion(0, (int) '#');
        int int17 = legacyMotionUnit12.pollMotionLevel((int) '#');
        int int19 = legacyMotionUnit12.pollMotionLevel((-1));
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit20 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit20.injectMotion(0, (int) '#');
        java.lang.String str24 = legacyMotionUnit20.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit25 = null;
        scheduler.sensor.SensorDataLog sensorDataLog26 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter27 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit25, sensorDataLog26);
        scheduler.sensor.SensorReading sensorReading28 = null;
        sensorDataLog26.record(sensorReading28);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter30 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit20, sensorDataLog26);
        java.lang.String str31 = legacyMotionUnit20.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit32 = null;
        scheduler.sensor.SensorDataLog sensorDataLog33 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter34 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit32, sensorDataLog33);
        scheduler.sensor.SensorReading sensorReading35 = null;
        sensorDataLog33.record(sensorReading35);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter37 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit20, sensorDataLog33);
        java.lang.String str38 = motionUnitOccupancyAdapter37.getSensorDescription();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit39 = null;
        scheduler.sensor.SensorDataLog sensorDataLog40 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter41 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit39, sensorDataLog40);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit42 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader43 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit44 = null;
        scheduler.sensor.SensorDataLog sensorDataLog45 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter46 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit44, sensorDataLog45);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader47 = null;
        scheduler.sensor.SensorDataLog sensorDataLog48 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter49 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader47, sensorDataLog48);
        scheduler.sensor.SensorSimulationController sensorSimulationController50 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit42, magStripeBadgeReader43, motionUnitOccupancyAdapter46, magStripeBadgeAdapter49);
        scheduler.service.CheckInService checkInService51 = null;
        scheduler.service.BookingService bookingService52 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository53 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog54 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService55 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter41, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter49, checkInService51, bookingService52, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository53, sensorDataLog54);
        scheduler.sensor.BadgeScanner badgeScanner56 = sensorCheckInService55.getBadgeScanner();
        scheduler.service.CheckInService checkInService57 = null;
        scheduler.service.BookingService bookingService58 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit59 = null;
        scheduler.sensor.SensorDataLog sensorDataLog60 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter61 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit59, sensorDataLog60);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit62 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader63 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit64 = null;
        scheduler.sensor.SensorDataLog sensorDataLog65 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter66 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit64, sensorDataLog65);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader67 = null;
        scheduler.sensor.SensorDataLog sensorDataLog68 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter69 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader67, sensorDataLog68);
        scheduler.sensor.SensorSimulationController sensorSimulationController70 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit62, magStripeBadgeReader63, motionUnitOccupancyAdapter66, magStripeBadgeAdapter69);
        scheduler.service.CheckInService checkInService71 = null;
        scheduler.service.BookingService bookingService72 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository73 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog74 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService75 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter61, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter69, checkInService71, bookingService72, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository73, sensorDataLog74);
        scheduler.repository.BadgeScanRepository badgeScanRepository76 = sensorCheckInService75.getBadgeScanRepository();
        scheduler.repository.BadgeScanRepository badgeScanRepository77 = sensorCheckInService75.getBadgeScanRepository();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit78 = null;
        scheduler.sensor.SensorDataLog sensorDataLog79 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter80 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit78, sensorDataLog79);
        scheduler.sensor.SensorReading sensorReading81 = null;
        sensorDataLog79.record(sensorReading81);
        scheduler.sensor.SensorReading.Source source83 = scheduler.sensor.SensorReading.Source.SYSTEM;
        sensorDataLog79.record(source83, "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        scheduler.sensor.SensorCheckInService sensorCheckInService87 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter37, badgeScanner56, checkInService57, bookingService58, badgeScanRepository77, sensorDataLog79);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter88 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit12, sensorDataLog79);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter89 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog79);
        legacyMotionUnit0.injectMotion(102, (int) (short) 10);
        java.lang.String str93 = legacyMotionUnit0.getFirmwareBanner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str4.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str11.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str24.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str31.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str38.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository77);
        org.junit.Assert.assertTrue("'" + source83 + "' != '" + scheduler.sensor.SensorReading.Source.SYSTEM + "'", source83.equals(scheduler.sensor.SensorReading.Source.SYSTEM));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str93.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = null;
        scheduler.sensor.SensorDataLog sensorDataLog22 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter23 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit21, sensorDataLog22);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit24 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader25 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit26 = null;
        scheduler.sensor.SensorDataLog sensorDataLog27 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter28 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit26, sensorDataLog27);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader29 = null;
        scheduler.sensor.SensorDataLog sensorDataLog30 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter31 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader29, sensorDataLog30);
        scheduler.sensor.SensorSimulationController sensorSimulationController32 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit24, magStripeBadgeReader25, motionUnitOccupancyAdapter28, magStripeBadgeAdapter31);
        scheduler.service.CheckInService checkInService33 = null;
        scheduler.service.BookingService bookingService34 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository35 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog36 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService37 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter23, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter31, checkInService33, bookingService34, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository35, sensorDataLog36);
        scheduler.service.CheckInService checkInService38 = null;
        scheduler.service.BookingService bookingService39 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit40 = null;
        scheduler.sensor.SensorDataLog sensorDataLog41 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter42 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit40, sensorDataLog41);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit43 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader44 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter47 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit45, sensorDataLog46);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader48 = null;
        scheduler.sensor.SensorDataLog sensorDataLog49 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter50 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader48, sensorDataLog49);
        scheduler.sensor.SensorSimulationController sensorSimulationController51 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit43, magStripeBadgeReader44, motionUnitOccupancyAdapter47, magStripeBadgeAdapter50);
        scheduler.service.CheckInService checkInService52 = null;
        scheduler.service.BookingService bookingService53 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository54 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog55 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService56 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter42, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter50, checkInService52, bookingService53, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository54, sensorDataLog55);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit57 = null;
        scheduler.sensor.SensorDataLog sensorDataLog58 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter59 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit57, sensorDataLog58);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit60 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader61 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit62 = null;
        scheduler.sensor.SensorDataLog sensorDataLog63 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter64 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit62, sensorDataLog63);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader65 = null;
        scheduler.sensor.SensorDataLog sensorDataLog66 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter67 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader65, sensorDataLog66);
        scheduler.sensor.SensorSimulationController sensorSimulationController68 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit60, magStripeBadgeReader61, motionUnitOccupancyAdapter64, magStripeBadgeAdapter67);
        scheduler.service.CheckInService checkInService69 = null;
        scheduler.service.BookingService bookingService70 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository71 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog72 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService73 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter59, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter67, checkInService69, bookingService70, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository71, sensorDataLog72);
        scheduler.sensor.SensorCheckInService sensorCheckInService74 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter6, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter31, checkInService38, bookingService39, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository54, sensorDataLog72);
        scheduler.sensor.BadgeScanner badgeScanner75 = sensorCheckInService74.getBadgeScanner();
        scheduler.repository.BadgeScanRepository badgeScanRepository76 = sensorCheckInService74.getBadgeScanRepository();
        scheduler.sensor.BadgeScanner badgeScanner77 = sensorCheckInService74.getBadgeScanner();
        scheduler.sensor.OccupancySensor occupancySensor78 = sensorCheckInService74.getOccupancySensor();
        scheduler.sensor.BadgeScanner badgeScanner79 = sensorCheckInService74.getBadgeScanner();
        scheduler.repository.BadgeScanRepository badgeScanRepository80 = sensorCheckInService74.getBadgeScanRepository();
        scheduler.sensor.BadgeScanner badgeScanner81 = sensorCheckInService74.getBadgeScanner();
        scheduler.sensor.BadgeScanner badgeScanner82 = sensorCheckInService74.getBadgeScanner();
        scheduler.repository.BadgeScanRepository badgeScanRepository83 = sensorCheckInService74.getBadgeScanRepository();
        scheduler.sensor.OccupancySensor occupancySensor84 = sensorCheckInService74.getOccupancySensor();
        scheduler.model.Booking booking85 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorCheckInService74.checkInOnline(booking85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getRoom()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor84);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        java.lang.String str4 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.SensorReading sensorReading8 = null;
        sensorDataLog6.record(sensorReading8);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter10 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog6);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader14 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit15 = null;
        scheduler.sensor.SensorDataLog sensorDataLog16 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter17 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit15, sensorDataLog16);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader18 = null;
        scheduler.sensor.SensorDataLog sensorDataLog19 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter20 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader18, sensorDataLog19);
        scheduler.sensor.SensorSimulationController sensorSimulationController21 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit13, magStripeBadgeReader14, motionUnitOccupancyAdapter17, magStripeBadgeAdapter20);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit22 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader23 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit24 = null;
        scheduler.sensor.SensorDataLog sensorDataLog25 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter26 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit24, sensorDataLog25);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader27 = null;
        scheduler.sensor.SensorDataLog sensorDataLog28 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter29 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader27, sensorDataLog28);
        scheduler.sensor.SensorSimulationController sensorSimulationController30 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit22, magStripeBadgeReader23, motionUnitOccupancyAdapter26, magStripeBadgeAdapter29);
        scheduler.sensor.SensorSimulationController sensorSimulationController31 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter17, magStripeBadgeAdapter29);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit32 = null;
        scheduler.sensor.SensorDataLog sensorDataLog33 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter34 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit32, sensorDataLog33);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader35 = null;
        scheduler.sensor.SensorDataLog sensorDataLog36 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter37 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader35, sensorDataLog36);
        java.lang.String str39 = magStripeBadgeAdapter37.channelFor("hi!");
        scheduler.sensor.SensorSimulationController sensorSimulationController40 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader12, motionUnitOccupancyAdapter34, magStripeBadgeAdapter37);
        boolean boolean42 = sensorSimulationController40.isRoomEmpty("AcmeSense LMU-900 (fw 2.4.1, simulated)");
        boolean boolean45 = sensorSimulationController40.personLeavesRoom("[23:56:40] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "[23:56:43] OCCUPANCY_SENSOR (): CH-hi!");
        boolean boolean48 = sensorSimulationController40.isPersonInside("[Aug 3, 23:56:56] %YU^%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?^1785815798?  %YU^hi!^1785815794? (CH-CH-%YU^hi!^1785815794?)  OWNER - CHECKED IN", "CH-[Aug 3, 23:56:41] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        boolean boolean50 = sensorSimulationController40.isBadgeWaiting("[23:56:49] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)");
        boolean boolean52 = sensorSimulationController40.isRoomEmpty("[23:57:12] OCCUPANCY_SENSOR ([23:56:45] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!): %YU^CH-[23:56:44] OCCUPANCY_SENSOR (): CH-hi!^1785815804?");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str4.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "CH-hi!" + "'", str39.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader0 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        magStripeBadgeReader0.insertCard("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "%YU^hi!^1785815794?");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.SensorReading.Source source7 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading10 = new scheduler.sensor.SensorReading(source7, "", "CH-hi!");
        java.lang.String str11 = sensorReading10.getRoomId();
        sensorDataLog5.record(sensorReading10);
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter13 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader0, sensorDataLog5);
        java.lang.String str15 = magStripeBadgeReader0.readTrack("CH-%YU^hi!^1785815794?");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter18 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit16, sensorDataLog17);
        scheduler.sensor.SensorReading sensorReading19 = null;
        sensorDataLog17.record(sensorReading19);
        scheduler.sensor.SensorReading.Source source21 = scheduler.sensor.SensorReading.Source.SYSTEM;
        sensorDataLog17.record(source21, "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        java.util.List<scheduler.sensor.SensorReading> sensorReadingList25 = sensorDataLog17.getReadings();
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter26 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader0, sensorDataLog17);
        java.lang.String str28 = magStripeBadgeAdapter26.channelFor("%YU^[23:57:09] OCCUPANCY_SENSOR (): CH-hi!^1785815844?");
        java.lang.String str30 = magStripeBadgeAdapter26.scanBadge("[23:57:11] OCCUPANCY_SENSOR (): CH-hi!");
        org.junit.Assert.assertTrue("'" + source7 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source7.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + source21 + "' != '" + scheduler.sensor.SensorReading.Source.SYSTEM + "'", source21.equals(scheduler.sensor.SensorReading.Source.SYSTEM));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorReadingList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "CH-%YU^[23:57:09] OCCUPANCY_SENSOR (): CH-hi!^1785815844?" + "'", str28.equals("CH-%YU^[23:57:09] OCCUPANCY_SENSOR (): CH-hi!^1785815844?"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = null;
        scheduler.sensor.SensorDataLog sensorDataLog1 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter2 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog1);
        scheduler.sensor.SensorReading.Source source3 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading6 = new scheduler.sensor.SensorReading(source3, "", "CH-hi!");
        java.lang.String str7 = sensorReading6.getRoomId();
        sensorDataLog1.record(sensorReading6);
        scheduler.sensor.SensorReading.Source source9 = sensorReading6.getSource();
        java.lang.String str10 = sensorReading6.toString();
        java.time.LocalDateTime localDateTime11 = sensorReading6.getTimestamp();
        scheduler.sensor.SensorReading.Source source12 = sensorReading6.getSource();
        org.junit.Assert.assertTrue("'" + source3 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source3.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + source9 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source9.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[23:57:33] OCCUPANCY_SENSOR (): CH-hi!" + "'", str10.equals("[23:57:33] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + source12 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source12.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit10 = null;
        scheduler.sensor.SensorDataLog sensorDataLog11 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter12 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit10, sensorDataLog11);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader14 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit15 = null;
        scheduler.sensor.SensorDataLog sensorDataLog16 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter17 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit15, sensorDataLog16);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader18 = null;
        scheduler.sensor.SensorDataLog sensorDataLog19 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter20 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader18, sensorDataLog19);
        scheduler.sensor.SensorSimulationController sensorSimulationController21 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit13, magStripeBadgeReader14, motionUnitOccupancyAdapter17, magStripeBadgeAdapter20);
        scheduler.service.CheckInService checkInService22 = null;
        scheduler.service.BookingService bookingService23 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository24 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog25 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService26 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter12, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter20, checkInService22, bookingService23, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository24, sensorDataLog25);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit28 = null;
        scheduler.sensor.SensorDataLog sensorDataLog29 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter30 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit28, sensorDataLog29);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit31 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader32 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit33 = null;
        scheduler.sensor.SensorDataLog sensorDataLog34 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter35 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit33, sensorDataLog34);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader36 = null;
        scheduler.sensor.SensorDataLog sensorDataLog37 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter38 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader36, sensorDataLog37);
        scheduler.sensor.SensorSimulationController sensorSimulationController39 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit31, magStripeBadgeReader32, motionUnitOccupancyAdapter35, magStripeBadgeAdapter38);
        scheduler.service.CheckInService checkInService40 = null;
        scheduler.service.BookingService bookingService41 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository42 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog43 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService44 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter30, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter38, checkInService40, bookingService41, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository42, sensorDataLog43);
        scheduler.sensor.SensorReading.Source source47 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading50 = new scheduler.sensor.SensorReading(source47, "", "CH-hi!");
        java.time.LocalDateTime localDateTime51 = sensorReading50.getTimestamp();
        boolean boolean52 = false; // flaky: sqliteBadgeScanRepository42.hasTapped("%YU^hi!^1785815794?", "CH-hi!", localDateTime51);
        int int53 = 0; // flaky: sqliteBadgeScanRepository24.countDistinctTappersForBooking("AcmeSense LMU-900 (fw 2.4.1, simulated)", localDateTime51);
        scheduler.sensor.SensorReading.Source source59 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading62 = new scheduler.sensor.SensorReading(source59, "", "CH-hi!");
        java.time.LocalDateTime localDateTime63 = sensorReading62.getTimestamp();
        java.time.LocalDateTime localDateTime69 = null;
        scheduler.sensor.BadgeScanRecord.Result result70 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord71 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime69, result70);
        scheduler.sensor.BadgeScanRecord badgeScanRecord72 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-hi!", localDateTime63, result70);
        scheduler.sensor.BadgeScanRecord badgeScanRecord73 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?", "+0m", "CH-CH-%YU^hi!^1785815794?", "%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?", localDateTime51, result70);
        java.time.LocalDateTime localDateTime79 = null;
        scheduler.sensor.BadgeScanRecord.Result result80 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord81 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime79, result80);
        java.lang.String str82 = badgeScanRecord81.getFullName();
        scheduler.sensor.BadgeScanRecord.Result result83 = badgeScanRecord81.getResult();
        scheduler.sensor.BadgeScanRecord badgeScanRecord84 = new scheduler.sensor.BadgeScanRecord("%YU^[23:56:36] OCCUPANCY_SENSOR (): CH-hi!^1785815796?", "", "hi!", "%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?", "[23:56:40] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", localDateTime51, result83);
        java.lang.String str85 = badgeScanRecord84.getBookingId();
        java.lang.String str86 = badgeScanRecord84.getFullName();
        org.junit.Assert.assertTrue("'" + source47 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source47.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + source59 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source59.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + result70 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result70.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        org.junit.Assert.assertTrue("'" + result80 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result80.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!" + "'", str82.equals("hi!"));
        org.junit.Assert.assertTrue("'" + result83 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result83.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "[23:56:40] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str85.equals("[23:56:40] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        java.lang.String str4 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.SensorReading sensorReading8 = null;
        sensorDataLog6.record(sensorReading8);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter10 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog6);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader14 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit15 = null;
        scheduler.sensor.SensorDataLog sensorDataLog16 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter17 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit15, sensorDataLog16);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader18 = null;
        scheduler.sensor.SensorDataLog sensorDataLog19 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter20 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader18, sensorDataLog19);
        scheduler.sensor.SensorSimulationController sensorSimulationController21 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit13, magStripeBadgeReader14, motionUnitOccupancyAdapter17, magStripeBadgeAdapter20);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit22 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader23 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit24 = null;
        scheduler.sensor.SensorDataLog sensorDataLog25 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter26 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit24, sensorDataLog25);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader27 = null;
        scheduler.sensor.SensorDataLog sensorDataLog28 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter29 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader27, sensorDataLog28);
        scheduler.sensor.SensorSimulationController sensorSimulationController30 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit22, magStripeBadgeReader23, motionUnitOccupancyAdapter26, magStripeBadgeAdapter29);
        scheduler.sensor.SensorSimulationController sensorSimulationController31 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter17, magStripeBadgeAdapter29);
        java.lang.String str33 = magStripeBadgeReader12.readTrack("CH-hi!");
        magStripeBadgeReader12.insertCard("hi!", "");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit37 = null;
        scheduler.sensor.SensorDataLog sensorDataLog38 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter39 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit37, sensorDataLog38);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit40 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader41 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit42 = null;
        scheduler.sensor.SensorDataLog sensorDataLog43 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter44 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit42, sensorDataLog43);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter47 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader45, sensorDataLog46);
        scheduler.sensor.SensorSimulationController sensorSimulationController48 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit40, magStripeBadgeReader41, motionUnitOccupancyAdapter44, magStripeBadgeAdapter47);
        scheduler.service.CheckInService checkInService49 = null;
        scheduler.service.BookingService bookingService50 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository51 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog52 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService53 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter39, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter47, checkInService49, bookingService50, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository51, sensorDataLog52);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader54 = null;
        scheduler.sensor.SensorDataLog sensorDataLog55 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter56 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader54, sensorDataLog55);
        scheduler.sensor.SensorSimulationController sensorSimulationController57 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader12, motionUnitOccupancyAdapter39, magStripeBadgeAdapter56);
        sensorSimulationController57.personSwipesBadge("[23:56:37] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "[23:56:39] OCCUPANCY_SENSOR (): CH-hi!");
        boolean boolean63 = sensorSimulationController57.isPersonInside("[23:56:47] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)", "[23:56:46] OCCUPANCY_SENSOR (CH-hi!): AcmeSense LMU-900 (fw 2.4.1, simulated)");
        boolean boolean66 = sensorSimulationController57.personLeavesRoom("%YU^%YU^%YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796?^1785815797?^1785815801?", "[23:57:00] OCCUPANCY_SENSOR ([23:56:43] BADGE_SCANNER (CH-CH-%YU^hi!^1785815794?): SwipeTech MSR-210 (fw 1.0.7, simulated)): CH-%YU^^1785815802?");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = sensorSimulationController57.sensorReadsOccupied("[Aug 3, 23:56:47] CH-CH-%YU^hi!^1785815794?  %YU^AcmeSense LMU-900 (fw 2.4.1, simulated)^1785815796? (+0m)  TAPPED IN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"this.motionUnit\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str4.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        scheduler.sensor.SensorReading.Source source0 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading3 = new scheduler.sensor.SensorReading(source0, "", "CH-hi!");
        scheduler.sensor.SensorReading sensorReading6 = new scheduler.sensor.SensorReading(source0, "CH-hi!", "AcmeSense LMU-900 (fw 2.4.1, simulated)");
        java.lang.String str7 = sensorReading6.getRoomId();
        scheduler.sensor.SensorReading.Source source8 = sensorReading6.getSource();
        java.lang.String str9 = sensorReading6.getDetail();
        scheduler.sensor.SensorReading.Source source10 = sensorReading6.getSource();
        java.time.LocalDateTime localDateTime11 = sensorReading6.getTimestamp();
        org.junit.Assert.assertTrue("'" + source0 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source0.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CH-hi!" + "'", str7.equals("CH-hi!"));
        org.junit.Assert.assertTrue("'" + source8 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source8.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str9.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        org.junit.Assert.assertTrue("'" + source10 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source10.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = null;
        scheduler.sensor.SensorDataLog sensorDataLog22 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter23 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit21, sensorDataLog22);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit24 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader25 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit26 = null;
        scheduler.sensor.SensorDataLog sensorDataLog27 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter28 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit26, sensorDataLog27);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader29 = null;
        scheduler.sensor.SensorDataLog sensorDataLog30 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter31 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader29, sensorDataLog30);
        scheduler.sensor.SensorSimulationController sensorSimulationController32 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit24, magStripeBadgeReader25, motionUnitOccupancyAdapter28, magStripeBadgeAdapter31);
        scheduler.service.CheckInService checkInService33 = null;
        scheduler.service.BookingService bookingService34 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository35 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog36 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService37 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter23, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter31, checkInService33, bookingService34, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository35, sensorDataLog36);
        scheduler.service.CheckInService checkInService38 = null;
        scheduler.service.BookingService bookingService39 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit40 = null;
        scheduler.sensor.SensorDataLog sensorDataLog41 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter42 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit40, sensorDataLog41);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit43 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader44 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter47 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit45, sensorDataLog46);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader48 = null;
        scheduler.sensor.SensorDataLog sensorDataLog49 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter50 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader48, sensorDataLog49);
        scheduler.sensor.SensorSimulationController sensorSimulationController51 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit43, magStripeBadgeReader44, motionUnitOccupancyAdapter47, magStripeBadgeAdapter50);
        scheduler.service.CheckInService checkInService52 = null;
        scheduler.service.BookingService bookingService53 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository54 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog55 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService56 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter42, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter50, checkInService52, bookingService53, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository54, sensorDataLog55);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit57 = null;
        scheduler.sensor.SensorDataLog sensorDataLog58 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter59 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit57, sensorDataLog58);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit60 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader61 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit62 = null;
        scheduler.sensor.SensorDataLog sensorDataLog63 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter64 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit62, sensorDataLog63);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader65 = null;
        scheduler.sensor.SensorDataLog sensorDataLog66 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter67 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader65, sensorDataLog66);
        scheduler.sensor.SensorSimulationController sensorSimulationController68 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit60, magStripeBadgeReader61, motionUnitOccupancyAdapter64, magStripeBadgeAdapter67);
        scheduler.service.CheckInService checkInService69 = null;
        scheduler.service.BookingService bookingService70 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository71 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog72 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService73 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter59, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter67, checkInService69, bookingService70, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository71, sensorDataLog72);
        scheduler.sensor.SensorCheckInService sensorCheckInService74 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter6, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter31, checkInService38, bookingService39, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository54, sensorDataLog72);
        scheduler.sensor.BadgeScanner badgeScanner75 = sensorCheckInService74.getBadgeScanner();
        scheduler.repository.BadgeScanRepository badgeScanRepository76 = sensorCheckInService74.getBadgeScanRepository();
        scheduler.sensor.OccupancySensor occupancySensor77 = sensorCheckInService74.getOccupancySensor();
        scheduler.repository.BadgeScanRepository badgeScanRepository78 = sensorCheckInService74.getBadgeScanRepository();
        scheduler.model.Booking booking79 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorCheckInService74.checkInOnline(booking79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"scheduler.model.Booking.getRoom()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository78);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader4 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = null;
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit8 = null;
        scheduler.sensor.SensorDataLog sensorDataLog9 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter10 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit8, sensorDataLog9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.service.CheckInService checkInService20 = null;
        scheduler.service.BookingService bookingService21 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository22 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog23 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService24 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter10, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter18, checkInService20, bookingService21, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository22, sensorDataLog23);
        scheduler.sensor.SensorSimulationController sensorSimulationController25 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader4, motionUnitOccupancyAdapter7, magStripeBadgeAdapter18);
        boolean boolean27 = sensorSimulationController25.isRoomEmpty("%YU^hi!^1785815794?");
        sensorSimulationController25.personSwipesBadge("[Aug 3, 23:56:39] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN", "%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?");
        boolean boolean32 = sensorSimulationController25.isRoomEmpty("[Aug 3, 23:56:38] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        boolean boolean35 = sensorSimulationController25.isPersonInside("[Aug 3, 23:57:06] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN", "%YU^CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!^1785815796?");
        boolean boolean38 = sensorSimulationController25.personLeavesRoom("[Aug 3, 23:56:42] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN", "%YU^CH-%YU^^1785815802?^1785815808?");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        legacyMotionUnit0.injectMotion(0, (int) '#');
        java.lang.String str4 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.SensorReading sensorReading8 = null;
        sensorDataLog6.record(sensorReading8);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter10 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog6);
        java.lang.String str11 = legacyMotionUnit0.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit12 = null;
        scheduler.sensor.SensorDataLog sensorDataLog13 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter14 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit12, sensorDataLog13);
        scheduler.sensor.SensorReading sensorReading15 = null;
        sensorDataLog13.record(sensorReading15);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter17 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog13);
        boolean boolean19 = motionUnitOccupancyAdapter17.isOccupancyDetected("CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!");
        java.lang.String str20 = motionUnitOccupancyAdapter17.getSensorDescription();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader21 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        magStripeBadgeReader21.insertCard("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "%YU^hi!^1785815794?");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit25 = null;
        scheduler.sensor.SensorDataLog sensorDataLog26 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter27 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit25, sensorDataLog26);
        scheduler.sensor.SensorReading.Source source28 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading31 = new scheduler.sensor.SensorReading(source28, "", "CH-hi!");
        java.lang.String str32 = sensorReading31.getRoomId();
        sensorDataLog26.record(sensorReading31);
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter34 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader21, sensorDataLog26);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit35 = null;
        scheduler.sensor.SensorDataLog sensorDataLog36 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter37 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit35, sensorDataLog36);
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter38 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader21, sensorDataLog36);
        scheduler.service.CheckInService checkInService39 = null;
        scheduler.service.BookingService bookingService40 = null;
        scheduler.repository.BadgeScanRepository badgeScanRepository41 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit42 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader43 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit44 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader45 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit46 = null;
        scheduler.sensor.SensorDataLog sensorDataLog47 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter48 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit46, sensorDataLog47);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader49 = null;
        scheduler.sensor.SensorDataLog sensorDataLog50 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter51 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader49, sensorDataLog50);
        scheduler.sensor.SensorSimulationController sensorSimulationController52 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit44, magStripeBadgeReader45, motionUnitOccupancyAdapter48, magStripeBadgeAdapter51);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit53 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader54 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit55 = null;
        scheduler.sensor.SensorDataLog sensorDataLog56 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter57 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit55, sensorDataLog56);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader58 = null;
        scheduler.sensor.SensorDataLog sensorDataLog59 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter60 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader58, sensorDataLog59);
        scheduler.sensor.SensorSimulationController sensorSimulationController61 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit53, magStripeBadgeReader54, motionUnitOccupancyAdapter57, magStripeBadgeAdapter60);
        scheduler.sensor.SensorSimulationController sensorSimulationController62 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit42, magStripeBadgeReader43, motionUnitOccupancyAdapter48, magStripeBadgeAdapter60);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit63 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader64 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit65 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader66 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit67 = null;
        scheduler.sensor.SensorDataLog sensorDataLog68 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter69 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit67, sensorDataLog68);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader70 = null;
        scheduler.sensor.SensorDataLog sensorDataLog71 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter72 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader70, sensorDataLog71);
        scheduler.sensor.SensorSimulationController sensorSimulationController73 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit65, magStripeBadgeReader66, motionUnitOccupancyAdapter69, magStripeBadgeAdapter72);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit74 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader75 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit76 = null;
        scheduler.sensor.SensorDataLog sensorDataLog77 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter78 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit76, sensorDataLog77);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader79 = null;
        scheduler.sensor.SensorDataLog sensorDataLog80 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter81 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader79, sensorDataLog80);
        scheduler.sensor.SensorSimulationController sensorSimulationController82 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit74, magStripeBadgeReader75, motionUnitOccupancyAdapter78, magStripeBadgeAdapter81);
        scheduler.sensor.SensorSimulationController sensorSimulationController83 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit63, magStripeBadgeReader64, motionUnitOccupancyAdapter69, magStripeBadgeAdapter81);
        scheduler.sensor.SensorDataLog sensorDataLog84 = new scheduler.sensor.SensorDataLog();
        java.util.List<scheduler.sensor.SensorReading> sensorReadingList85 = sensorDataLog84.getReadings();
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter86 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader64, sensorDataLog84);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter87 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit42, sensorDataLog84);
        scheduler.sensor.SensorCheckInService sensorCheckInService88 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter17, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter38, checkInService39, bookingService40, badgeScanRepository41, sensorDataLog84);
        int int90 = motionUnitOccupancyAdapter17.zoneCodeFor("%YU^%YU^[23:56:37] OCCUPANCY_SENSOR (): CH-hi!^1785815810?^1785815815?");
        java.lang.String str91 = motionUnitOccupancyAdapter17.getSensorDescription();
        java.lang.String str92 = motionUnitOccupancyAdapter17.getSensorDescription();
        int int94 = motionUnitOccupancyAdapter17.zoneCodeFor("%YU^[Aug 3, 23:56:46] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN^1785815838?");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str4.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str11.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str20.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        org.junit.Assert.assertTrue("'" + source28 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source28.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorReadingList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 101 + "'", int90 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str91.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str92.equals("AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 102 + "'", int94 == 102);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        scheduler.sensor.SensorReading.Source source0 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading3 = new scheduler.sensor.SensorReading(source0, "", "CH-hi!");
        scheduler.sensor.SensorReading sensorReading6 = new scheduler.sensor.SensorReading(source0, "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "");
        scheduler.sensor.SensorReading.Source source7 = sensorReading6.getSource();
        scheduler.sensor.SensorReading sensorReading10 = new scheduler.sensor.SensorReading(source7, "[Aug 3, 23:56:43] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN", "[23:56:40] OCCUPANCY_SENSOR (): CH-hi!");
        scheduler.sensor.SensorReading.Source source11 = sensorReading10.getSource();
        java.lang.String str12 = sensorReading10.toString();
        java.lang.String str13 = sensorReading10.getRoomId();
        java.time.LocalDateTime localDateTime14 = sensorReading10.getTimestamp();
        scheduler.util.AppClock.jumpTo(localDateTime14);
        org.junit.Assert.assertTrue("'" + source0 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source0.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        org.junit.Assert.assertTrue("'" + source7 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source7.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        org.junit.Assert.assertTrue("'" + source11 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source11.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[23:57:33] OCCUPANCY_SENSOR ([Aug 3, 23:56:43] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN): [23:56:40] OCCUPANCY_SENSOR (): CH-hi!" + "'", str12.equals("[23:57:33] OCCUPANCY_SENSOR ([Aug 3, 23:56:43] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN): [23:56:40] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[Aug 3, 23:56:43] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN" + "'", str13.equals("[Aug 3, 23:56:43] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.SensorDataLog sensorDataLog3 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter4 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit2, sensorDataLog3);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter7 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader5, sensorDataLog6);
        scheduler.sensor.SensorSimulationController sensorSimulationController8 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter4, magStripeBadgeAdapter7);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit9 = null;
        scheduler.sensor.SensorDataLog sensorDataLog10 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter11 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit9, sensorDataLog10);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit12 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader13 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit14 = null;
        scheduler.sensor.SensorDataLog sensorDataLog15 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter16 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit14, sensorDataLog15);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader17 = null;
        scheduler.sensor.SensorDataLog sensorDataLog18 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter19 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader17, sensorDataLog18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit12, magStripeBadgeReader13, motionUnitOccupancyAdapter16, magStripeBadgeAdapter19);
        scheduler.service.CheckInService checkInService21 = null;
        scheduler.service.BookingService bookingService22 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository23 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog24 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService25 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter11, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter19, checkInService21, bookingService22, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository23, sensorDataLog24);
        java.lang.String str27 = magStripeBadgeAdapter19.channelFor("hi!");
        java.lang.String str29 = magStripeBadgeAdapter19.channelFor("AcmeSense LMU-900 (fw 2.4.1, simulated)");
        scheduler.service.CheckInService checkInService30 = null;
        scheduler.service.BookingService bookingService31 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository32 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog33 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService34 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter4, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter19, checkInService30, bookingService31, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository32, sensorDataLog33);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit36 = null;
        scheduler.sensor.SensorDataLog sensorDataLog37 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter38 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit36, sensorDataLog37);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit39 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader40 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit41 = null;
        scheduler.sensor.SensorDataLog sensorDataLog42 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter43 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit41, sensorDataLog42);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader44 = null;
        scheduler.sensor.SensorDataLog sensorDataLog45 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter46 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader44, sensorDataLog45);
        scheduler.sensor.SensorSimulationController sensorSimulationController47 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit39, magStripeBadgeReader40, motionUnitOccupancyAdapter43, magStripeBadgeAdapter46);
        scheduler.service.CheckInService checkInService48 = null;
        scheduler.service.BookingService bookingService49 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository50 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog51 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService52 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter38, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter46, checkInService48, bookingService49, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository50, sensorDataLog51);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit54 = null;
        scheduler.sensor.SensorDataLog sensorDataLog55 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter56 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit54, sensorDataLog55);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit57 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader58 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit59 = null;
        scheduler.sensor.SensorDataLog sensorDataLog60 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter61 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit59, sensorDataLog60);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader62 = null;
        scheduler.sensor.SensorDataLog sensorDataLog63 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter64 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader62, sensorDataLog63);
        scheduler.sensor.SensorSimulationController sensorSimulationController65 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit57, magStripeBadgeReader58, motionUnitOccupancyAdapter61, magStripeBadgeAdapter64);
        scheduler.service.CheckInService checkInService66 = null;
        scheduler.service.BookingService bookingService67 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository68 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog69 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService70 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter56, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter64, checkInService66, bookingService67, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository68, sensorDataLog69);
        scheduler.sensor.SensorReading.Source source73 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading76 = new scheduler.sensor.SensorReading(source73, "", "CH-hi!");
        java.time.LocalDateTime localDateTime77 = sensorReading76.getTimestamp();
        boolean boolean78 = false; // flaky: sqliteBadgeScanRepository68.hasTapped("%YU^hi!^1785815794?", "CH-hi!", localDateTime77);
        int int79 = 0; // flaky: sqliteBadgeScanRepository50.countDistinctTappersForBooking("AcmeSense LMU-900 (fw 2.4.1, simulated)", localDateTime77);
        int int80 = 0; // flaky: sqliteBadgeScanRepository32.countDistinctTappersForBooking("", localDateTime77);
        scheduler.sensor.SensorReading.Source source82 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading85 = new scheduler.sensor.SensorReading(source82, "", "CH-hi!");
        java.lang.String str86 = sensorReading85.getRoomId();
        java.time.LocalDateTime localDateTime87 = sensorReading85.getTimestamp();
        int int88 = 0; // flaky: sqliteBadgeScanRepository32.countDistinctTappersForBooking("SwipeTech MSR-210 (fw 1.0.7, simulated)", localDateTime87);
        scheduler.util.AppClock.jumpTo(localDateTime87);
        scheduler.util.AppClock.jumpTo(localDateTime87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "CH-hi!" + "'", str27.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "CH-AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str29.equals("CH-AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        org.junit.Assert.assertTrue("'" + source73 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source73.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + source82 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source82.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        scheduler.sensor.SensorReading.Source source0 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading3 = new scheduler.sensor.SensorReading(source0, "", "CH-hi!");
        java.time.LocalDateTime localDateTime4 = sensorReading3.getTimestamp();
        java.time.LocalDateTime localDateTime5 = sensorReading3.getTimestamp();
        java.lang.String str6 = sensorReading3.toString();
        scheduler.sensor.SensorReading.Source source7 = sensorReading3.getSource();
        org.junit.Assert.assertTrue("'" + source0 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source0.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[23:57:33] OCCUPANCY_SENSOR (): CH-hi!" + "'", str6.equals("[23:57:33] OCCUPANCY_SENSOR (): CH-hi!"));
        org.junit.Assert.assertTrue("'" + source7 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source7.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader22 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit23 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader24 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit25 = null;
        scheduler.sensor.SensorDataLog sensorDataLog26 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter27 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit25, sensorDataLog26);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader28 = null;
        scheduler.sensor.SensorDataLog sensorDataLog29 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter30 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader28, sensorDataLog29);
        scheduler.sensor.SensorSimulationController sensorSimulationController31 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit23, magStripeBadgeReader24, motionUnitOccupancyAdapter27, magStripeBadgeAdapter30);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit32 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader33 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit34 = null;
        scheduler.sensor.SensorDataLog sensorDataLog35 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter36 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit34, sensorDataLog35);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader37 = null;
        scheduler.sensor.SensorDataLog sensorDataLog38 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter39 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader37, sensorDataLog38);
        scheduler.sensor.SensorSimulationController sensorSimulationController40 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit32, magStripeBadgeReader33, motionUnitOccupancyAdapter36, magStripeBadgeAdapter39);
        scheduler.sensor.SensorSimulationController sensorSimulationController41 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit21, magStripeBadgeReader22, motionUnitOccupancyAdapter27, magStripeBadgeAdapter39);
        scheduler.sensor.SensorDataLog sensorDataLog42 = new scheduler.sensor.SensorDataLog();
        java.util.List<scheduler.sensor.SensorReading> sensorReadingList43 = sensorDataLog42.getReadings();
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter44 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader22, sensorDataLog42);
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter45 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog42);
        java.util.List<scheduler.sensor.SensorReading> sensorReadingList46 = sensorDataLog42.getReadings();
        scheduler.sensor.SensorReading.Source source47 = null;
        scheduler.sensor.SensorReading sensorReading50 = new scheduler.sensor.SensorReading(source47, "%YU^CH-%YU^^1785815802?^1785815808?", "[Aug 3, 23:56:41] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN");
        scheduler.sensor.SensorReading.Source source51 = sensorReading50.getSource();
        sensorDataLog42.record(sensorReading50);
        java.util.List<scheduler.sensor.SensorReading> sensorReadingList53 = sensorDataLog42.getReadings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorReadingList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorReadingList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(source51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensorReadingList53);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository0 = new scheduler.repository.SqliteBadgeScanRepository();
        java.util.List<scheduler.sensor.BadgeScanRecord> badgeScanRecordList2 = null; // flaky: sqliteBadgeScanRepository0.findRecent((int) '4');
        java.util.List<scheduler.sensor.BadgeScanRecord> badgeScanRecordList4 = null; // flaky: sqliteBadgeScanRepository0.findRecent((int) (short) -1);
        java.util.List<scheduler.sensor.BadgeScanRecord> badgeScanRecordList6 = null; // flaky: sqliteBadgeScanRepository0.findRecent((int) (short) 1);
        scheduler.sensor.SensorReading.Source source9 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading12 = new scheduler.sensor.SensorReading(source9, "", "CH-hi!");
        scheduler.sensor.SensorReading sensorReading15 = new scheduler.sensor.SensorReading(source9, "CH-hi!", "AcmeSense LMU-900 (fw 2.4.1, simulated)");
        scheduler.sensor.SensorReading sensorReading18 = new scheduler.sensor.SensorReading(source9, "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-AcmeSense LMU-900 (fw 2.4.1, simulated)");
        java.lang.String str19 = sensorReading18.getRoomId();
        java.time.LocalDateTime localDateTime20 = sensorReading18.getTimestamp();
        scheduler.util.AppClock.jumpTo(localDateTime20);
        scheduler.util.AppClock.jumpTo(localDateTime20);
        boolean boolean23 = false; // flaky: sqliteBadgeScanRepository0.hasTapped("CH-[Aug 3, 23:56:39] CH-AcmeSense LMU-900 (fw 2.4.1, simulated)  CH-%YU^hi!^1785815794? ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!)  TAPPED IN", "CH-%YU^%YU^SwipeTech MSR-210 (fw 1.0.7, simulated)^1785815797?^1785815805?", localDateTime20);
        java.util.List<scheduler.sensor.BadgeScanRecord> badgeScanRecordList25 = null; // flaky: sqliteBadgeScanRepository0.findRecent((int) ' ');
        scheduler.sensor.SensorReading.Source source32 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading35 = new scheduler.sensor.SensorReading(source32, "", "CH-hi!");
        java.time.LocalDateTime localDateTime36 = sensorReading35.getTimestamp();
        java.time.LocalDateTime localDateTime42 = null;
        scheduler.sensor.BadgeScanRecord.Result result43 = scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY;
        scheduler.sensor.BadgeScanRecord badgeScanRecord44 = new scheduler.sensor.BadgeScanRecord("", "hi!", "", "hi!", "hi!", localDateTime42, result43);
        scheduler.sensor.BadgeScanRecord badgeScanRecord45 = new scheduler.sensor.BadgeScanRecord("%YU^hi!^1785815794?", "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "", "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-hi!", localDateTime36, result43);
        java.lang.String str46 = badgeScanRecord45.getUserId();
        java.time.LocalDateTime localDateTime47 = badgeScanRecord45.getScannedAt();
        int int48 = 0; // flaky: sqliteBadgeScanRepository0.countDistinctTappersForBooking("[23:57:13] BADGE_SCANNER (CH-CH-%YU^hi!^1785815794?): SwipeTech MSR-210 (fw 1.0.7, simulated)", localDateTime47);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(badgeScanRecordList2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(badgeScanRecordList4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(badgeScanRecordList6);
        org.junit.Assert.assertTrue("'" + source9 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source9.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[23:56:35] OCCUPANCY_SENSOR (): CH-hi!" + "'", str19.equals("[23:56:35] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(badgeScanRecordList25);
        org.junit.Assert.assertTrue("'" + source32 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source32.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + result43 + "' != '" + scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY + "'", result43.equals(scheduler.sensor.BadgeScanRecord.Result.GUEST_ENTRY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "%YU^hi!^1785815794?" + "'", str46.equals("%YU^hi!^1785815794?"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader1 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit2 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader3 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit4 = null;
        scheduler.sensor.SensorDataLog sensorDataLog5 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter6 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit4, sensorDataLog5);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader7 = null;
        scheduler.sensor.SensorDataLog sensorDataLog8 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter9 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader7, sensorDataLog8);
        scheduler.sensor.SensorSimulationController sensorSimulationController10 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit2, magStripeBadgeReader3, motionUnitOccupancyAdapter6, magStripeBadgeAdapter9);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit11 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader12 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit13 = null;
        scheduler.sensor.SensorDataLog sensorDataLog14 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter15 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit13, sensorDataLog14);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader16 = null;
        scheduler.sensor.SensorDataLog sensorDataLog17 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter18 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader16, sensorDataLog17);
        scheduler.sensor.SensorSimulationController sensorSimulationController19 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit11, magStripeBadgeReader12, motionUnitOccupancyAdapter15, magStripeBadgeAdapter18);
        scheduler.sensor.SensorSimulationController sensorSimulationController20 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader1, motionUnitOccupancyAdapter6, magStripeBadgeAdapter18);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit21 = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader22 = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit23 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader24 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit25 = null;
        scheduler.sensor.SensorDataLog sensorDataLog26 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter27 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit25, sensorDataLog26);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader28 = null;
        scheduler.sensor.SensorDataLog sensorDataLog29 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter30 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader28, sensorDataLog29);
        scheduler.sensor.SensorSimulationController sensorSimulationController31 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit23, magStripeBadgeReader24, motionUnitOccupancyAdapter27, magStripeBadgeAdapter30);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit32 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader33 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit34 = null;
        scheduler.sensor.SensorDataLog sensorDataLog35 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter36 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit34, sensorDataLog35);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader37 = null;
        scheduler.sensor.SensorDataLog sensorDataLog38 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter39 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader37, sensorDataLog38);
        scheduler.sensor.SensorSimulationController sensorSimulationController40 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit32, magStripeBadgeReader33, motionUnitOccupancyAdapter36, magStripeBadgeAdapter39);
        scheduler.sensor.SensorSimulationController sensorSimulationController41 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit21, magStripeBadgeReader22, motionUnitOccupancyAdapter27, magStripeBadgeAdapter39);
        java.lang.String str42 = magStripeBadgeReader22.getFirmwareBanner();
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit43 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader44 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit45 = null;
        scheduler.sensor.SensorDataLog sensorDataLog46 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter47 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit45, sensorDataLog46);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader48 = null;
        scheduler.sensor.SensorDataLog sensorDataLog49 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter50 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader48, sensorDataLog49);
        scheduler.sensor.SensorSimulationController sensorSimulationController51 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit43, magStripeBadgeReader44, motionUnitOccupancyAdapter47, magStripeBadgeAdapter50);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit52 = null;
        scheduler.sensor.SensorDataLog sensorDataLog53 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter54 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit52, sensorDataLog53);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit55 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader56 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit57 = null;
        scheduler.sensor.SensorDataLog sensorDataLog58 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter59 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit57, sensorDataLog58);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader60 = null;
        scheduler.sensor.SensorDataLog sensorDataLog61 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter62 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader60, sensorDataLog61);
        scheduler.sensor.SensorSimulationController sensorSimulationController63 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit55, magStripeBadgeReader56, motionUnitOccupancyAdapter59, magStripeBadgeAdapter62);
        scheduler.service.CheckInService checkInService64 = null;
        scheduler.service.BookingService bookingService65 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository66 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog67 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService68 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter54, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter62, checkInService64, bookingService65, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository66, sensorDataLog67);
        java.lang.String str70 = magStripeBadgeAdapter62.channelFor("hi!");
        java.lang.String str72 = magStripeBadgeAdapter62.channelFor("AcmeSense LMU-900 (fw 2.4.1, simulated)");
        scheduler.service.CheckInService checkInService73 = null;
        scheduler.service.BookingService bookingService74 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository75 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog76 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService77 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter47, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter62, checkInService73, bookingService74, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository75, sensorDataLog76);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader78 = null;
        scheduler.sensor.SensorDataLog sensorDataLog79 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter80 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader78, sensorDataLog79);
        java.lang.String str82 = magStripeBadgeAdapter80.channelFor("hi!");
        scheduler.sensor.SensorSimulationController sensorSimulationController83 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit0, magStripeBadgeReader22, motionUnitOccupancyAdapter47, magStripeBadgeAdapter80);
        java.lang.String str85 = magStripeBadgeReader22.readTrack("");
        java.lang.String str87 = magStripeBadgeReader22.readTrack("%YU^[Aug 3, 23:56:36] [23:56:35] OCCUPANCY_SENSOR (): CH-hi!  CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi! ()  TAPPED IN^1785815802?");
        magStripeBadgeReader22.insertCard("%YU^CH-CH-[23:56:36] OCCUPANCY_SENSOR (): CH-hi!^1785815802?", "[23:56:39] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!");
        java.lang.String str92 = magStripeBadgeReader22.readTrack("[23:57:33] OCCUPANCY_SENSOR ([23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-AcmeSense LMU-900 (fw 2.4.1, simulated)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "SwipeTech MSR-210 (fw 1.0.7, simulated)" + "'", str42.equals("SwipeTech MSR-210 (fw 1.0.7, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "CH-hi!" + "'", str70.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "CH-AcmeSense LMU-900 (fw 2.4.1, simulated)" + "'", str72.equals("CH-AcmeSense LMU-900 (fw 2.4.1, simulated)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "CH-hi!" + "'", str82.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit0 = null;
        scheduler.sensor.SensorDataLog sensorDataLog1 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter2 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit0, sensorDataLog1);
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit3 = null;
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader4 = null;
        scheduler.sensor.hardware.LegacyMotionUnit legacyMotionUnit5 = null;
        scheduler.sensor.SensorDataLog sensorDataLog6 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter motionUnitOccupancyAdapter7 = new scheduler.sensor.MotionUnitOccupancyAdapter(legacyMotionUnit5, sensorDataLog6);
        scheduler.sensor.hardware.MagStripeBadgeReader magStripeBadgeReader8 = null;
        scheduler.sensor.SensorDataLog sensorDataLog9 = null;
        scheduler.sensor.MagStripeBadgeAdapter magStripeBadgeAdapter10 = new scheduler.sensor.MagStripeBadgeAdapter(magStripeBadgeReader8, sensorDataLog9);
        scheduler.sensor.SensorSimulationController sensorSimulationController11 = new scheduler.sensor.SensorSimulationController(legacyMotionUnit3, magStripeBadgeReader4, motionUnitOccupancyAdapter7, magStripeBadgeAdapter10);
        scheduler.service.CheckInService checkInService12 = null;
        scheduler.service.BookingService bookingService13 = null;
        scheduler.repository.SqliteBadgeScanRepository sqliteBadgeScanRepository14 = new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorDataLog sensorDataLog15 = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.SensorCheckInService sensorCheckInService16 = new scheduler.sensor.SensorCheckInService((scheduler.sensor.OccupancySensor) motionUnitOccupancyAdapter2, (scheduler.sensor.BadgeScanner) magStripeBadgeAdapter10, checkInService12, bookingService13, (scheduler.repository.BadgeScanRepository) sqliteBadgeScanRepository14, sensorDataLog15);
        scheduler.repository.BadgeScanRepository badgeScanRepository17 = sensorCheckInService16.getBadgeScanRepository();
        scheduler.sensor.OccupancySensor occupancySensor18 = sensorCheckInService16.getOccupancySensor();
        scheduler.sensor.BadgeScanner badgeScanner19 = sensorCheckInService16.getBadgeScanner();
        scheduler.repository.BadgeScanRepository badgeScanRepository20 = sensorCheckInService16.getBadgeScanRepository();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanner19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(badgeScanRepository20);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        scheduler.sensor.SensorReading.Source source0 = scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR;
        scheduler.sensor.SensorReading sensorReading3 = new scheduler.sensor.SensorReading(source0, "", "CH-hi!");
        scheduler.sensor.SensorReading sensorReading6 = new scheduler.sensor.SensorReading(source0, "CH-hi!", "AcmeSense LMU-900 (fw 2.4.1, simulated)");
        scheduler.sensor.SensorReading sensorReading9 = new scheduler.sensor.SensorReading(source0, "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!", "CH-hi!");
        scheduler.sensor.SensorReading.Source source10 = sensorReading9.getSource();
        java.lang.String str11 = sensorReading9.toString();
        java.lang.String str12 = sensorReading9.getDetail();
        java.lang.String str13 = sensorReading9.getRoomId();
        java.time.LocalDateTime localDateTime14 = sensorReading9.getTimestamp();
        org.junit.Assert.assertTrue("'" + source0 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source0.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        org.junit.Assert.assertTrue("'" + source10 + "' != '" + scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR + "'", source10.equals(scheduler.sensor.SensorReading.Source.OCCUPANCY_SENSOR));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[23:57:33] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!" + "'", str11.equals("[23:57:33] OCCUPANCY_SENSOR (CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "CH-hi!" + "'", str12.equals("CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!" + "'", str13.equals("CH-[23:56:35] OCCUPANCY_SENSOR (): CH-hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
    }
}
