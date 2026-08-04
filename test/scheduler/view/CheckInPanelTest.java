package scheduler.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scheduler.TestSupport;
import scheduler.model.Booking;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.repository.SqliteBadgeScanRepository;
import scheduler.sensor.MagStripeBadgeAdapter;
import scheduler.sensor.MotionUnitOccupancyAdapter;
import scheduler.sensor.SensorCheckInService;
import scheduler.sensor.SensorDataLog;
import scheduler.sensor.SensorReading;
import scheduler.sensor.SensorSimulationController;
import scheduler.sensor.hardware.LegacyMotionUnit;
import scheduler.sensor.hardware.MagStripeBadgeReader;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;
import scheduler.service.RoomService;
import scheduler.util.AppClock;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Smoke tests for the online Check In screen: the booking picker only offers
 * confirmed bookings, a booking can be pre-selected when the user arrives
 * from the Check In button on a booking card, and the screen displays the
 * tapped-in number and occupancy sensor state without offering any occupancy
 * input.
 *
 * The tests never open a window, so they run headless.
 */
@DisplayName("CheckInPanel (online check-in screen)")
class CheckInPanelTest {

    private static final String ROOM_ID = "DB-1001";

    private RegisteredUser owner;
    private Room room;
    private RoomService roomService;
    private BookingService bookingService;
    private SensorCheckInService sensorCheckInService;
    private SensorSimulationController simulation;
    private SensorDataLog dataLog;
    private UserContext userContext;

    @BeforeAll
    static void runHeadless() {
        System.setProperty("java.awt.headless", "true");
    }

    @BeforeEach
    void setUp() {
        TestSupport.resetDatabase();

        owner = TestSupport.owner();
        room = TestSupport.room(ROOM_ID);

        roomService = new RoomService();
        roomService.addRoom(room);
        bookingService = new BookingService(roomService);

        LegacyMotionUnit motionUnit = new LegacyMotionUnit();
        MagStripeBadgeReader badgeReader = new MagStripeBadgeReader();
        dataLog = new SensorDataLog();
        MotionUnitOccupancyAdapter occupancyAdapter = new MotionUnitOccupancyAdapter(motionUnit, dataLog);
        MagStripeBadgeAdapter badgeAdapter = new MagStripeBadgeAdapter(badgeReader, dataLog);

        sensorCheckInService = new SensorCheckInService(
                occupancyAdapter, badgeAdapter, new CheckInService(),
                bookingService, new SqliteBadgeScanRepository(), dataLog);
        simulation = new SensorSimulationController(motionUnit, badgeReader, occupancyAdapter, badgeAdapter);

        userContext = new UserContext(owner);
    }

    @AfterEach
    void restoreRealTime() {
        AppClock.reset();
    }

    private CheckInPanel newPanel() throws Exception {
        CheckInPanel[] holder = new CheckInPanel[1];
        SwingUtilities.invokeAndWait(() -> holder[0] = new CheckInPanel(
                bookingService, sensorCheckInService, simulation, dataLog, userContext, null));
        return holder[0];
    }

    private Booking confirmedBooking(String roomId, long startsInMinutes) {
        Room bookedRoom = roomId.equals(ROOM_ID) ? room : TestSupport.room(roomId);
        if (bookedRoom != room) {
            roomService.addRoom(bookedRoom);
        }
        Booking booking = bookingService.createBooking(owner, bookedRoom,
                AppClock.now().plusMinutes(startsInMinutes), AppClock.now().plusMinutes(startsInMinutes + 120));
        booking.payUpfrontFee();
        return booking;
    }

    private static <T extends Component> T find(Component component, Class<T> type) {
        if (type.isInstance(component)) {
            return type.cast(component);
        }
        if (component instanceof Container container) {
            for (Component child : container.getComponents()) {
                T found = find(child, type);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }

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
    @DisplayName("the panel builds with no bookings present")
    void panelBuilds() throws Exception {
        CheckInPanel panel = newPanel();

        assertNotNull(panel);
        assertTrue(panel.getComponentCount() > 0);
        assertTrue(panel instanceof JPanel);
    }

    @Test
    @DisplayName("the booking picker is empty when the user has no confirmed booking")
    void pickerIsEmptyWithoutBookings() throws Exception {
        CheckInPanel panel = newPanel();

        JComboBox<?> picker = find(panel, JComboBox.class);
        assertNotNull(picker, "the screen should offer a booking picker");
        assertEquals(0, picker.getItemCount());
    }

    @Test
    @DisplayName("the screen explains what to do when there is nothing to check in")
    void emptyStateExplainsNextStep() throws Exception {
        CheckInPanel panel = newPanel();

        assertTrue(anyLabelContains(panel, "No confirmed booking"), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("a confirmed booking shows up in the picker after a refresh")
    void confirmedBookingAppearsInPicker() throws Exception {
        CheckInPanel panel = newPanel();
        confirmedBooking(ROOM_ID, 10);

        panel.refreshBookings();

        assertEquals(1, find(panel, JComboBox.class).getItemCount());
    }

    @Test
    @DisplayName("bookings that are not confirmed are left out of the picker")
    void onlyConfirmedBookingsAreOffered() throws Exception {
        Booking cancelled = confirmedBooking(ROOM_ID, 10);
        cancelled.cancel();
        confirmedBooking("LAS-2045", 10);

        CheckInPanel panel = newPanel();

        JComboBox<?> picker = find(panel, JComboBox.class);
        assertEquals(1, picker.getItemCount(), "only the confirmed booking should be offered");
        assertNotSame(cancelled, picker.getItemAt(0));
    }

    @Test
    @DisplayName("selectBooking pre-selects the requested booking")
    void selectBookingPreSelects() throws Exception {
        confirmedBooking(ROOM_ID, 10);
        Booking second = confirmedBooking("LAS-2045", 10);
        CheckInPanel panel = newPanel();

        panel.selectBooking(second);

        assertSame(second, find(panel, JComboBox.class).getSelectedItem());
    }

    @Test
    @DisplayName("selectBooking can switch the selection again")
    void selectBookingCanSwitchSelection() throws Exception {
        Booking first = confirmedBooking(ROOM_ID, 10);
        Booking second = confirmedBooking("LAS-2045", 10);
        CheckInPanel panel = newPanel();

        panel.selectBooking(second);
        panel.selectBooking(first);

        assertSame(first, find(panel, JComboBox.class).getSelectedItem());
    }

    @Test
    @DisplayName("the screen shows the tapped-in number and the occupancy sensor state")
    void readingsAreDisplayed() throws Exception {
        Booking booking = confirmedBooking(ROOM_ID, 10);
        CheckInPanel panel = newPanel();
        panel.selectBooking(booking);

        assertTrue(anyLabelContains(panel, "Tapped in: 0"), "labels were: " + labelTexts(panel));
        assertTrue(anyLabelContains(panel, "Occupancy sensor:"), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("a booking that has already been checked in is no longer offered for online check-in")
    void checkedInBookingLeavesThePicker() throws Exception {
        Booking booking = confirmedBooking(ROOM_ID, 10);
        CheckInPanel panel = newPanel();
        assertEquals(1, find(panel, JComboBox.class).getItemCount());

        simulation.personSwipesBadge(ROOM_ID, owner.getIdentificationNumber());
        sensorCheckInService.processBadgePresentation(booking, owner);
        panel.refreshBookings();

        assertEquals(0, find(panel, JComboBox.class).getItemCount(),
                "there is nothing left to check in online once the booking is checked in");
    }

    @Test
    @DisplayName("a booking outside the window shows when check-in opens instead of a countdown")
    void tooEarlyBookingShowsOpeningTime() throws Exception {
        Booking booking = confirmedBooking(ROOM_ID, 60 * 24);
        CheckInPanel panel = newPanel();

        panel.selectBooking(booking);

        assertTrue(anyLabelContains(panel, "Check-in opens"), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("a booking inside the window is shown as open for check-in")
    void bookingInsideWindowIsShownAsOpen() throws Exception {
        Booking booking = confirmedBooking(ROOM_ID, 10);
        CheckInPanel panel = newPanel();

        panel.selectBooking(booking);

        assertTrue(anyLabelContains(panel, "OPEN"), "labels were: " + labelTexts(panel));
    }

    @Test
    @DisplayName("the sensor data feed is present and receives readings")
    void sensorFeedReceivesReadings() throws Exception {
        CheckInPanel panel = newPanel();
        JList<?> feed = find(panel, JList.class);
        assertNotNull(feed, "the screen should show a sensor data feed");

        dataLog.record(SensorReading.Source.SYSTEM, ROOM_ID, "Check-in confirmed");

        assertTrue(feed.getModel().getSize() > 0, "the feed should follow the sensor data log");
    }

    @Test
    @DisplayName("repeated refreshes stay stable")
    void repeatedRefreshesAreStable() throws Exception {
        confirmedBooking(ROOM_ID, 10);
        CheckInPanel panel = newPanel();

        assertDoesNotThrow(() -> {
            for (int i = 0; i < 5; i++) {
                panel.refreshBookings();
            }
        });
        assertEquals(1, find(panel, JComboBox.class).getItemCount());
    }

    @Test
    @DisplayName("the panel builds and refreshes while the demo clock is simulated")
    void panelWorksWithSimulatedClock() throws Exception {
        confirmedBooking(ROOM_ID, 10);
        AppClock.advance(java.time.Duration.ofDays(1));

        CheckInPanel panel = newPanel();

        assertDoesNotThrow(panel::refreshBookings);
    }
}
