package scheduler.view;

import scheduler.util.AppClock;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.sensor.SensorCheckInService;
import scheduler.sensor.SensorDataLog;
import scheduler.sensor.SensorReading;
import scheduler.sensor.SensorSimulationController;
import scheduler.service.BookingService;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Check In screen - the ONLINE version of check-in (Req4/Req5).
 *
 * The booking owner selects their confirmed booking and checks in from the
 * app: the booking module's State Pattern enforces the 30-minute window (on
 * time: deposit applied to the final cost; late: forfeited). Timestamps and
 * a live countdown are shown.
 *
 * There is no occupancy input here. Occupancy is DISPLAYED only: the count
 * equals the number of ID badge scans recorded at the room (see the ID Badge
 * Sensor tab), and the occupancy sensor reads occupied once people have
 * entered. A background sweep expires confirmed bookings whose window has
 * closed, forfeiting the deposit.
 */
public class CheckInPanel extends JPanel {

    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("MMM d, HH:mm");
    private static final DateTimeFormatter CLOCK_FORMAT = DateTimeFormatter.ofPattern("EEE, MMM d yyyy  HH:mm:ss");

    private final BookingService bookingService;
    private final SensorCheckInService sensorCheckInService;
    private final SensorSimulationController simulation;
    private final SensorDataLog dataLog;
    private final UserContext userContext;
    private final Runnable onBookingsChanged;

    private final JComboBox<Booking> bookingCombo = new JComboBox<>();
    private final InlineMessagePanel messagePanel = new InlineMessagePanel();
    private final JLabel clockLabel = new JLabel();
    private final JLabel startLabel = new JLabel(" ");
    private final JLabel windowLabel = new JLabel(" ");
    private final JLabel occupancyLabel = new JLabel(" ");
    private final DefaultListModel<String> feedModel = new DefaultListModel<>();

    private RoundedButton checkInButton;

    public CheckInPanel(
            BookingService bookingService,
            SensorCheckInService sensorCheckInService,
            SensorSimulationController simulation,
            SensorDataLog dataLog,
            UserContext userContext,
            Runnable onBookingsChanged
    ) {
        this.bookingService = bookingService;
        this.sensorCheckInService = sensorCheckInService;
        this.simulation = simulation;
        this.dataLog = dataLog;
        this.userContext = userContext;
        this.onBookingsChanged = onBookingsChanged;

        setLayout(new BorderLayout(20, 20));
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(28, 30, 28, 30));

        add(createHeader(), BorderLayout.NORTH);
        add(createBody(), BorderLayout.CENTER);

        dataLog.addUpdateCallback(this::refreshFeed);
        userContext.addListener(() -> {
            messagePanel.clear();
            refreshBookings();
        });

        // Live clock, countdown and occupancy (once per second).
        new Timer(1000, e -> refreshStatus()).start();

        // Req4 sweep: expire confirmed bookings whose 30-min window closed.
        new Timer(15000, e -> runExpirySweep()).start();

        // When the demo clock jumps, re-evaluate immediately: overdue
        // bookings expire on the spot and countdowns update.
        AppClock.addListener(() -> {
            runExpirySweep();
            refreshBookings();
        });

        refreshBookings();
    }

    // ---------------------------------------------------------------
    // Layout
    // ---------------------------------------------------------------

    private JPanel createHeader() {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Theme.BG);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBackground(Theme.BG);

        JLabel titleLabel = new JLabel("Check In");
        titleLabel.setFont(Theme.titleFont(32));
        titleLabel.setForeground(Theme.TEXT_DARK);

        JLabel subtitleLabel = new JLabel(
                "Online check-in for your confirmed booking. To check in at the room itself, scan your ID on the ID Badge Sensor tab.");
        subtitleLabel.setFont(Theme.bodyFont(15));
        subtitleLabel.setForeground(Theme.TEXT_BODY);

        clockLabel.setFont(Theme.boldFont(16));
        clockLabel.setForeground(Theme.RED_DARK);
        clockLabel.setText(AppClock.now().format(CLOCK_FORMAT));

        textPanel.add(titleLabel);
        textPanel.add(Box.createVerticalStrut(6));
        textPanel.add(subtitleLabel);
        textPanel.add(Box.createVerticalStrut(8));
        textPanel.add(clockLabel);
        textPanel.add(Box.createVerticalStrut(10));
        textPanel.add(messagePanel);

        headerPanel.add(textPanel, BorderLayout.CENTER);
        return headerPanel;
    }

    private JPanel createBody() {
        JPanel body = new JPanel(new GridBagLayout());
        body.setBackground(Theme.BG);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 18);
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.55;
        c.weighty = 1;
        body.add(createCheckInCard(), c);

        c.gridx = 1;
        c.weightx = 0.45;
        c.insets = new Insets(0, 0, 0, 0);
        body.add(createFeedCard(), c);

        return body;
    }

    /** Left card: booking picker, timestamps, countdown, occupancy display, check-in button. */
    private JPanel createCheckInCard() {
        CardPanel card = new CardPanel(new BorderLayout(0, 14));
        card.setBorder(BorderFactory.createEmptyBorder(20, 22, 20, 22));

        JPanel top = new JPanel();
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.setOpaque(false);

        JLabel pickLabel = sectionLabel("Confirmed booking to check in");
        pickLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        bookingCombo.setFont(Theme.bodyFont(14));
        bookingCombo.setBackground(Theme.WHITE);
        bookingCombo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        bookingCombo.setAlignmentX(Component.LEFT_ALIGNMENT);
        bookingCombo.setRenderer(new BookingRenderer());
        bookingCombo.addActionListener(e -> {
            messagePanel.clear();
            refreshStatus();
        });

        startLabel.setFont(Theme.bodyFont(14));
        startLabel.setForeground(Theme.TEXT_BODY);
        startLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        windowLabel.setFont(Theme.boldFont(14));
        windowLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        occupancyLabel.setFont(Theme.boldFont(14));
        occupancyLabel.setForeground(Theme.TEXT_DARK);
        occupancyLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        top.add(pickLabel);
        top.add(Box.createVerticalStrut(6));
        top.add(bookingCombo);
        top.add(Box.createVerticalStrut(14));
        top.add(startLabel);
        top.add(Box.createVerticalStrut(8));
        top.add(windowLabel);
        top.add(Box.createVerticalStrut(8));
        top.add(occupancyLabel);

        checkInButton = new RoundedButton("Check In Online", RoundedButton.Style.PRIMARY);
        checkInButton.addActionListener(e -> runOnlineCheckIn());

        JPanel bottom = new JPanel(new GridLayout(0, 1, 8, 8));
        bottom.setOpaque(false);
        bottom.add(checkInButton);

        card.add(top, BorderLayout.NORTH);
        card.add(bottom, BorderLayout.SOUTH);
        return card;
    }

    /** Right card: Req5 - the live feed of sensor data received by the system. */
    private JPanel createFeedCard() {
        CardPanel card = new CardPanel(new BorderLayout(0, 10));
        card.setBorder(BorderFactory.createEmptyBorder(20, 22, 20, 22));

        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.setOpaque(false);

        JLabel feedTitle = sectionLabel("Sensor data received by the system");

        JLabel devices = new JLabel("<html>"
                + escape(sensorCheckInService.getOccupancySensor().getSensorDescription())
                + "<br>"
                + escape(sensorCheckInService.getBadgeScanner().getScannerDescription())
                + "</html>");
        devices.setFont(Theme.bodyFont(12));
        devices.setForeground(Theme.GRAY);

        header.add(feedTitle);
        header.add(Box.createVerticalStrut(4));
        header.add(devices);

        JList<String> feedList = new JList<>(feedModel);
        feedList.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        feedList.setForeground(Theme.TEXT_BODY);
        feedList.setBackground(Theme.WHITE);
        feedList.setSelectionBackground(Theme.GRAY_LIGHT);

        JScrollPane scroll = new JScrollPane(feedList);
        scroll.setBorder(BorderFactory.createLineBorder(Theme.GRAY_BORDER));
        scroll.getVerticalScrollBar().setUnitIncrement(14);

        card.add(header, BorderLayout.NORTH);
        card.add(scroll, BorderLayout.CENTER);
        return card;
    }

    private JLabel sectionLabel(String text) {
        JLabel label = new JLabel(text.toUpperCase());
        label.setFont(Theme.boldFont(12));
        label.setForeground(Theme.GRAY);
        return label;
    }

    // ---------------------------------------------------------------
    // Actions
    // ---------------------------------------------------------------

    private void runOnlineCheckIn() {
        Booking booking = selectedBooking();
        if (booking == null) {
            return;
        }

        try {
            sensorCheckInService.checkInOnline(booking);
            messagePanel.showSuccess("Checked in to " + booking.getRoom().getRoomId()
                    + " at " + AppClock.now().format(TIME_FORMAT)
                    + ". Your $" + booking.getDeposit().getAmount()
                    + " deposit has been applied to the final cost.");
            bookingsChanged();
        } catch (RuntimeException e) {
            messagePanel.showError(e.getMessage());
            bookingsChanged(); // a late attempt may have expired the booking
        }
        refreshStatus();
    }

    // ---------------------------------------------------------------
    // Refresh helpers
    // ---------------------------------------------------------------

    /** Reloads the confirmed bookings of the signed-in user into the picker. */
    public void refreshBookings() {
        Booking previous = selectedBooking();
        bookingCombo.removeAllItems();

        List<Booking> userBookings = bookingService.getBookingsForUser(userContext.getCurrentUser());
        for (Booking booking : userBookings) {
            if (booking.getStatus() == BookingStatus.CONFIRMED) {
                bookingCombo.addItem(booking);
            }
        }

        if (previous != null) {
            bookingCombo.setSelectedItem(previous);
        }

        checkInButton.setEnabled(bookingCombo.getItemCount() > 0);
        refreshStatus();
    }

    private void refreshStatus() {
        clockLabel.setText(AppClock.now().format(CLOCK_FORMAT));

        Booking booking = selectedBooking();

        if (booking == null) {
            startLabel.setText("No confirmed booking. Pay the deposit under My Bookings first.");
            windowLabel.setText(" ");
            windowLabel.setForeground(Theme.GRAY);
            occupancyLabel.setText("Tapped in: -   |   Occupancy sensor: -");
            return;
        }

        String roomId = booking.getRoom().getRoomId();
        LocalDateTime windowClose = booking.getStartTime()
                .plusMinutes(SensorCheckInService.CHECK_IN_WINDOW_MINUTES);
        LocalDateTime now = AppClock.now();

        startLabel.setText("Booking: " + roomId + "  starts " + booking.getStartTime().format(TIME_FORMAT)
                + ", ends " + booking.getEndTime().format(TIME_FORMAT));

        LocalDateTime opensAt = sensorCheckInService.checkInOpensAt(booking);

        if (now.isBefore(opensAt)) {
            windowLabel.setText("Check-in opens " + opensAt.format(TIME_FORMAT)
                    + " (15 min before start) and closes " + windowClose.format(TIME_FORMAT) + ".");
            windowLabel.setForeground(Theme.GRAY);
        } else if (now.isBefore(booking.getStartTime())) {
            windowLabel.setText("Check-in is OPEN now. Window closes " + windowClose.format(TIME_FORMAT)
                    + " (30 min after start).");
            windowLabel.setForeground(Theme.TEXT_DARK);
        } else if (now.isBefore(windowClose)) {
            Duration left = Duration.between(now, windowClose);
            windowLabel.setText("Check-in window closes in "
                    + left.toMinutes() + " min " + (left.toSeconds() % 60) + " sec - deposit at stake!");
            windowLabel.setForeground(Theme.RED_DARK);
        } else {
            windowLabel.setText("Check-in window has closed. The deposit will be forfeited.");
            windowLabel.setForeground(Theme.RED_DARK);
        }

        // Tapped in = number of badge scans at the room (Req5). The occupancy
        // sensor reads OCCUPIED / EMPTY based on people physically entering
        // and leaving the room (see the ID Badge Sensor tab).
        int tappedIn = sensorCheckInService.getTappedInCount(booking);
        boolean occupied = simulation.sensorReadsOccupied(roomId);
        occupancyLabel.setText("Tapped in: " + tappedIn + " (badge scans)"
                + "   |   Occupancy sensor: " + (occupied ? "OCCUPIED" : "EMPTY"));
        occupancyLabel.setForeground(occupied ? Theme.RED_DARK : Theme.TEXT_DARK);
    }

    private void refreshFeed() {
        feedModel.clear();
        List<SensorReading> readings = dataLog.getReadings();
        for (int i = readings.size() - 1; i >= 0; i--) {
            feedModel.addElement(readings.get(i).toString());
        }
    }

    private void runExpirySweep() {
        List<Booking> expired = sensorCheckInService.expireOverdueBookings();
        if (!expired.isEmpty()) {
            bookingsChanged();
            Booking selected = selectedBooking();
            if (selected != null && expired.contains(selected)) {
                messagePanel.showError("Your booking expired: no check-in within 30 minutes of the start time. "
                        + "The deposit has been forfeited.");
            }
        }
    }

    private void bookingsChanged() {
        refreshBookings();
        if (onBookingsChanged != null) {
            onBookingsChanged.run();
        }
    }

    private Booking selectedBooking() {
        return (Booking) bookingCombo.getSelectedItem();
    }

    private String escape(String s) {
        return s == null ? "" : s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }

    /** Compact one-line rendering of a booking in the combo box. */
    private static class BookingRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof Booking booking) {
                setText(booking.getRoom().getRoomId() + "  |  "
                        + booking.getStartTime().format(TIME_FORMAT) + " - "
                        + booking.getEndTime().toLocalTime());
            }
            return this;
        }
    }
}
