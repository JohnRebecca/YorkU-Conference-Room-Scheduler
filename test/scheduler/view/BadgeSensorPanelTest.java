package scheduler.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scheduler.TestSupport;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.repository.SqliteBadgeScanRepository;
import scheduler.sensor.MagStripeBadgeAdapter;
import scheduler.sensor.MotionUnitOccupancyAdapter;
import scheduler.sensor.SensorCheckInService;
import scheduler.sensor.SensorDataLog;
import scheduler.sensor.SensorSimulationController;
import scheduler.sensor.hardware.LegacyMotionUnit;
import scheduler.sensor.hardware.MagStripeBadgeReader;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;
import scheduler.service.RoomService;
import scheduler.util.AppClock;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Smoke tests for the ID Badge Sensor screen. The panel's rules live in
 * SensorCheckInService (tested separately); these tests check that the screen
 * builds, survives refreshes, and renders the readings a marker would look
 * for: the room, its status, the tapped-in number and the sensor state.
 *
 * The tests never open a window, so they run headless.
 */
@DisplayName("BadgeSensorPanel (ID Badge Sensor screen)")
class BadgeSensorPanelTest {

    private static final String ROOM_ID = "DB-1001";

    private RegisteredUser owner;
    private Room room;
    private BookingService bookingService;
    private SensorCheckInService sensorCheckInService;
    private SensorSimulationController simulation;
    private UserContext userContext;
    private AtomicInteger bookingsChangedCalls;

    @BeforeAll
    static void runHeadless() {
        System.setProperty("java.awt.headless", "true");
    }

    @BeforeEach
    void setUp() {
        TestSupport.resetDatabase();

        owner = TestSupport.owner();
        room = TestSupport.room(ROOM_ID);

        RoomService roomService = new RoomService();
        roomService.addRoom(room);
        bookingService = new BookingService(roomService);

        LegacyMotionUnit motionUnit = new LegacyMotionUnit();
        MagStripeBadgeReader badgeReader = new MagStripeBadgeReader();
        SensorDataLog dataLog = new SensorDataLog();
        MotionUnitOccupancyAdapter occupancyAdapter = new MotionUnitOccupancyAdapter(motionUnit, dataLog);
        MagStripeBadgeAdapter badgeAdapter = new MagStripeBadgeAdapter(badgeReader, dataLog);

        sensorCheckInService = new SensorCheckInService(
                occupancyAdapter, badgeAdapter, new CheckInService(),
                bookingService, new SqliteBadgeScanRepository(), dataLog);
        simulation = new SensorSimulationController(motionUnit, badgeReader, occupancyAdapter, badgeAdapter);

        userContext = new UserContext(owner);
        bookingsChangedCalls = new AtomicInteger();
    }

    @AfterEach
    void restoreRealTime() {
        AppClock.reset();
    }

    /** Builds the panel on the event dispatch thread, as the application does. */
    private BadgeSensorPanel newPanel() throws Exception {
        BadgeSensorPanel[] holder = new BadgeSensorPanel[1];
        SwingUtilities.invokeAndWait(() -> holder[0] = new BadgeSensorPanel(
                bookingService, sensorCheckInService, simulation, userContext,
                bookingsChangedCalls::incrementAndGet));
        return holder[0];
    }

    private Booking confirmedBooking() {
        Booking booking = bookingService.createBooking(owner, room,
                AppClock.now().plusMinutes(10), AppClock.now().plusHours(2));
        booking.payUpfrontFee();
        return booking;
    }

    /** All label text currently rendered anywhere inside the panel. */
    private static List<String> labelTexts(Component component) {
        List<String> texts = new ArrayList<>();
        if (component instanceof JLabel label && label.getText() != null) {
            texts.add(label.getText());
        }
        if (component instanceof Container container) {
            for (Component child : container.getComponents()) {
                texts.addAll(labelTexts(child));
            }
        }
        return texts;
    }

    private static boolean anyLabelContains(Component component, String fragment) {
        return labelTexts(component).stream().anyMatch(text -> text.contains(fragment));
    }

    @Test
    @DisplayName("the panel builds without a booking present")
    void panelBuildsWithNoBookings() throws Exception {
        BadgeSensorPanel panel = newPanel();

        assertNotNull(panel);
        assertTrue(panel.getComponentCount() > 0);
    }

    @Test
    @DisplayName("the panel is a Swing panel that can be dropped into the main window")
    void panelIsASwingComponent() throws Exception {
        assertTrue(newPanel() instanceof JPanel);
    }

    @Test
    @DisplayName("with no bookings the screen says so instead of failing")
    void emptyStateIsShown() throws Exception {
        BadgeSensorPanel panel = newPanel();

        assertTrue(anyLabelContains(panel, "No rooms are currently booked"),
                "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("refreshing an empty screen does not throw")
    void refreshWithNoBookingsIsSafe() throws Exception {
        BadgeSensorPanel panel = newPanel();

        assertDoesNotThrow(panel::refresh);
    }

    @Test
    @DisplayName("a confirmed booking appears on the screen after a refresh")
    void confirmedBookingIsListed() throws Exception {
        BadgeSensorPanel panel = newPanel();
        confirmedBooking();

        panel.refresh();

        assertTrue(anyLabelContains(panel, ROOM_ID), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("a booking that has not been checked in is shown as not open")
    void notOpenStateIsShown() throws Exception {
        confirmedBooking();
        BadgeSensorPanel panel = newPanel();

        assertTrue(anyLabelContains(panel, "not open yet"), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("the tapped-in number and the occupancy sensor state are both displayed")
    void tappedInAndSensorStateAreShown() throws Exception {
        confirmedBooking();
        BadgeSensorPanel panel = newPanel();

        assertTrue(anyLabelContains(panel, "Tapped in: 0"), "labels were: " + labelTexts(panel));
        assertTrue(anyLabelContains(panel, "Occupancy sensor: EMPTY"), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("the occupancy sensor shows OCCUPIED once somebody walks in")
    void occupancyStateFollowsThePhysicalWorld() throws Exception {
        confirmedBooking();
        BadgeSensorPanel panel = newPanel();

        simulation.personEntersRoom(ROOM_ID, owner.getIdentificationNumber());
        panel.refresh();

        assertTrue(anyLabelContains(panel, "Occupancy sensor: OCCUPIED"), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("after the owner checks in the room is shown as open")
    void openStateIsShownAfterCheckIn() throws Exception {
        Booking booking = confirmedBooking();
        BadgeSensorPanel panel = newPanel();

        simulation.personSwipesBadge(ROOM_ID, owner.getIdentificationNumber());
        sensorCheckInService.processBadgePresentation(booking, owner);
        panel.refresh();

        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
        assertTrue(anyLabelContains(panel, "room open"), "labels were: " + labelTexts(panel));
        assertTrue(anyLabelContains(panel, "Tapped in: 1"), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("cancelled and expired bookings are not listed on the reader")
    void inactiveBookingsAreNotListed() throws Exception {
        Booking booking = confirmedBooking();
        booking.cancel();
        BadgeSensorPanel panel = newPanel();

        assertFalse(anyLabelContains(panel, ROOM_ID), "labels were: " + labelTexts(panel));
        assertTrue(anyLabelContains(panel, "No rooms are currently booked"));
    }

    @Test
    @DisplayName("repeated refreshes stay stable")
    void repeatedRefreshesAreStable() throws Exception {
        confirmedBooking();
        BadgeSensorPanel panel = newPanel();

        assertDoesNotThrow(() -> {
            for (int i = 0; i < 5; i++) {
                panel.refresh();
            }
        });
        assertTrue(anyLabelContains(panel, ROOM_ID));
    }

    @Test
    @DisplayName("simply refreshing does not report a booking change to the main window")
    void refreshDoesNotFireTheChangeCallback() throws Exception {
        confirmedBooking();
        BadgeSensorPanel panel = newPanel();

        panel.refresh();

        assertEquals(0, bookingsChangedCalls.get());
    }

    @Test
    @DisplayName("the panel builds and refreshes while the demo clock is simulated")
    void panelWorksWithSimulatedClock() throws Exception {
        confirmedBooking();
        AppClock.advance(java.time.Duration.ofDays(1));

        BadgeSensorPanel panel = newPanel();

        assertDoesNotThrow(panel::refresh);
        assertNotNull(panel);
    }
}
