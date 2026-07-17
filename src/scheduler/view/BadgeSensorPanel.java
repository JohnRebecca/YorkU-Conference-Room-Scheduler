package scheduler.view;

import scheduler.util.AppClock;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.sensor.BadgeScanRecord;
import scheduler.sensor.SensorCheckInService;
import scheduler.sensor.SensorSimulationController;
import scheduler.service.BookingService;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * ID Badge Sensor screen (Req5) - the software stand-in for the badge reader
 * and occupancy sensor mounted at each room.
 *
 * Every registered account can use it. It shows the current time and every
 * booked room with two independent readings:
 *
 *   TAPPED IN - the number of counted badge scans. Scanning your ID while the
 *   room is open (owner checked in) taps you in and stores the scan in the
 *   database. The booking owner's own scan opens the room (auto check-in).
 *   Before the owner checks in, other people's taps are rejected with
 *   "room not open" and not counted.
 *
 *   OCCUPANCY SENSOR - OCCUPIED or EMPTY, driven by people physically
 *   entering and leaving the room (Enter Room / Leave Room). Anyone can
 *   enter or leave at any time; when the last person leaves, the sensor
 *   reads EMPTY.
 */
public class BadgeSensorPanel extends JPanel {

    private static final DateTimeFormatter CLOCK_FORMAT = DateTimeFormatter.ofPattern("EEE, MMM d yyyy  HH:mm:ss");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("MMM d, HH:mm");

    private final BookingService bookingService;
    private final SensorCheckInService sensorCheckInService;
    private final SensorSimulationController simulation;
    private final UserContext userContext;
    private final Runnable onBookingsChanged;

    private final JLabel clockLabel = new JLabel();
    private final JLabel simulatedTag = new JLabel();
    private RoundedButton resetClockButton;
    private final InlineMessagePanel messagePanel = new InlineMessagePanel();
    private final JPanel roomListPanel = new JPanel();
    private final DefaultListModel<String> scanLogModel = new DefaultListModel<>();

    public BadgeSensorPanel(
            BookingService bookingService,
            SensorCheckInService sensorCheckInService,
            SensorSimulationController simulation,
            UserContext userContext,
            Runnable onBookingsChanged
    ) {
        this.bookingService = bookingService;
        this.sensorCheckInService = sensorCheckInService;
        this.simulation = simulation;
        this.userContext = userContext;
        this.onBookingsChanged = onBookingsChanged;

        setLayout(new BorderLayout(20, 16));
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(28, 30, 28, 30));

        add(createHeader(), BorderLayout.NORTH);
        add(createBody(), BorderLayout.CENTER);

        userContext.addListener(() -> {
            messagePanel.clear();
            refresh();
        });

        // Live wall clock, exactly like the display on the physical reader.
        new Timer(1000, e -> updateClockDisplay()).start();
        updateClockDisplay();

        // When the demo clock jumps, everything on this screen re-evaluates
        // immediately (which rooms are open, too-early states, countdowns).
        AppClock.addListener(() -> {
            updateClockDisplay();
            refresh();
        });

        refresh();
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

        JLabel titleLabel = new JLabel("ID Badge Sensor");
        titleLabel.setFont(Theme.titleFont(32));
        titleLabel.setForeground(Theme.TEXT_DARK);

        JLabel subtitleLabel = new JLabel(
                "<html>The badge reader and occupancy sensor at each booked room. The owner's scan opens the room (auto check-in); "
                        + "others tap in once it's open. Enter / Leave Room drives the occupancy sensor.</html>");
        subtitleLabel.setFont(Theme.bodyFont(15));
        subtitleLabel.setForeground(Theme.TEXT_BODY);

        clockLabel.setFont(Theme.boldFont(20));
        clockLabel.setForeground(Theme.RED_DARK);

        simulatedTag.setFont(Theme.boldFont(12));
        simulatedTag.setForeground(new Color(180, 120, 0));
        simulatedTag.setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 0));

        JPanel clockRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        clockRow.setBackground(Theme.BG);
        clockRow.setAlignmentX(Component.LEFT_ALIGNMENT);
        clockRow.add(clockLabel);
        clockRow.add(simulatedTag);

        textPanel.add(titleLabel);
        textPanel.add(Box.createVerticalStrut(6));
        textPanel.add(subtitleLabel);
        textPanel.add(Box.createVerticalStrut(10));
        textPanel.add(clockRow);
        textPanel.add(Box.createVerticalStrut(8));
        textPanel.add(createDemoClockRow());
        textPanel.add(Box.createVerticalStrut(10));
        textPanel.add(messagePanel);

        headerPanel.add(textPanel, BorderLayout.CENTER);
        return headerPanel;
    }

    /**
     * The Demo Clock (testing tool): pushes the whole app's time forward so
     * time-dependent rules - the 15-minute check-in opening, the 30-minute
     * deposit forfeit - can be tested without waiting. Reset returns to real
     * time.
     */
    private JPanel createDemoClockRow() {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        row.setBackground(Theme.BG);
        row.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel caption = new JLabel("DEMO CLOCK");
        caption.setFont(Theme.boldFont(11));
        caption.setForeground(Theme.GRAY);
        caption.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 4));

        RoundedButton plusHour = new RoundedButton("+1 Hour", RoundedButton.Style.SECONDARY);
        RoundedButton plusDay = new RoundedButton("+1 Day", RoundedButton.Style.SECONDARY);
        RoundedButton openNext = new RoundedButton("Open Next Window", RoundedButton.Style.SECONDARY);
        resetClockButton = new RoundedButton("Reset to Real Time", RoundedButton.Style.SECONDARY);
        for (RoundedButton b : new RoundedButton[]{plusHour, plusDay, openNext, resetClockButton}) {
            b.setFont(Theme.boldFont(12));
        }

        plusHour.addActionListener(e -> advanceClock(Duration.ofHours(1)));
        plusDay.addActionListener(e -> advanceClock(Duration.ofDays(1)));
        openNext.addActionListener(e -> jumpToNextCheckInWindow());
        resetClockButton.addActionListener(e -> {
            AppClock.reset();
            messagePanel.showInfo("Demo clock reset - the app is back on real time.");
            if (onBookingsChanged != null) {
                onBookingsChanged.run();
            }
        });
        resetClockButton.setEnabled(false);

        row.add(caption);
        row.add(plusHour);
        row.add(plusDay);
        row.add(openNext);
        row.add(resetClockButton);
        return row;
    }

    private void advanceClock(Duration amount) {
        AppClock.advance(amount);
        messagePanel.showInfo("Demo clock advanced. App time is now "
                + AppClock.now().format(CLOCK_FORMAT) + ".");
        if (onBookingsChanged != null) {
            onBookingsChanged.run();
        }
    }

    /** Jumps to the moment the next not-yet-open booking's check-in window opens. */
    private void jumpToNextCheckInWindow() {
        Booking next = null;
        for (Booking booking : bookingService.getAllBookings()) {
            boolean upcoming = booking.getStatus() == BookingStatus.CONFIRMED
                    && sensorCheckInService.isTooEarly(booking);
            if (upcoming && (next == null || booking.getStartTime().isBefore(next.getStartTime()))) {
                next = booking;
            }
        }

        if (next == null) {
            messagePanel.showInfo("No upcoming booking is waiting for its check-in window "
                    + "- every confirmed booking is already open (or none exists).");
            return;
        }

        AppClock.jumpTo(sensorCheckInService.checkInOpensAt(next));
        messagePanel.showInfo("Demo clock jumped to " + AppClock.now().format(CLOCK_FORMAT)
                + " - check-in for " + next.getRoom().getRoomId() + " ("
                + next.getStartTime().format(TIME_FORMAT) + ") is now open.");
        if (onBookingsChanged != null) {
            onBookingsChanged.run();
        }
    }

    private void updateClockDisplay() {
        clockLabel.setText(AppClock.now().format(CLOCK_FORMAT));
        boolean simulated = AppClock.isSimulated();
        simulatedTag.setText(simulated ? "SIMULATED  (" + AppClock.describeOffset() + ")" : "");
        if (resetClockButton != null) {
            resetClockButton.setEnabled(simulated);
        }
    }

    private JPanel createBody() {
        JPanel body = new JPanel(new GridBagLayout());
        body.setBackground(Theme.BG);

        roomListPanel.setLayout(new BoxLayout(roomListPanel, BoxLayout.Y_AXIS));
        roomListPanel.setBackground(Theme.BG);

        // Tracks the viewport width so room cards can never overflow
        // sideways and push their buttons off-screen - vertical scroll only.
        VerticalScrollPanel roomListWrapper = new VerticalScrollPanel(new BorderLayout());
        roomListWrapper.setBackground(Theme.BG);
        roomListWrapper.add(roomListPanel, BorderLayout.NORTH);

        JScrollPane roomScroll = new JScrollPane(
                roomListWrapper,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        roomScroll.setBorder(null);
        roomScroll.getVerticalScrollBar().setUnitIncrement(16);
        roomScroll.getViewport().setBackground(Theme.BG);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0, 0, 0, 18);
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.6;
        c.weighty = 1;
        body.add(roomScroll, c);

        c.gridx = 1;
        c.weightx = 0.4;
        c.insets = new Insets(0, 0, 0, 0);
        body.add(createScanLogCard(), c);

        return body;
    }

    /** Right card: the tap-in history stored in the database. */
    private JPanel createScanLogCard() {
        CardPanel card = new CardPanel(new BorderLayout(0, 10));
        card.setBorder(BorderFactory.createEmptyBorder(20, 22, 20, 22));

        JLabel logTitle = new JLabel("SCANS RECORDED IN THE DATABASE");
        logTitle.setFont(Theme.boldFont(12));
        logTitle.setForeground(Theme.GRAY);

        JList<String> logList = new JList<>(scanLogModel);
        logList.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        logList.setForeground(Theme.TEXT_BODY);
        logList.setBackground(Theme.WHITE);
        logList.setSelectionBackground(Theme.GRAY_LIGHT);

        JScrollPane scroll = new JScrollPane(logList);
        scroll.setBorder(BorderFactory.createLineBorder(Theme.GRAY_BORDER));
        scroll.getVerticalScrollBar().setUnitIncrement(14);

        card.add(logTitle, BorderLayout.NORTH);
        card.add(scroll, BorderLayout.CENTER);
        return card;
    }

    // ---------------------------------------------------------------
    // Refresh
    // ---------------------------------------------------------------

    /** Rebuilds the booked-room cards and reloads the scan history. */
    public void refresh() {
        roomListPanel.removeAll();

        List<Booking> bookings = bookingService.getAllBookings();
        boolean any = false;

        for (Booking booking : bookings) {
            boolean active = (booking.getStatus() == BookingStatus.CONFIRMED
                    || booking.getStatus() == BookingStatus.CHECKED_IN)
                    && booking.getEndTime().isAfter(AppClock.now());
            if (!active) {
                continue;
            }
            any = true;
            roomListPanel.add(createRoomCard(booking));
            roomListPanel.add(Box.createVerticalStrut(12));
        }

        if (!any) {
            JLabel empty = new JLabel(
                    "<html>No rooms are currently booked. Book a room and pay its deposit first.</html>");
            empty.setFont(Theme.bodyFont(14));
            empty.setForeground(Theme.GRAY);
            roomListPanel.add(empty);
        }

        refreshScanLog();
        roomListPanel.revalidate();
        roomListPanel.repaint();
    }

    private JPanel createRoomCard(Booking booking) {
        String roomId = booking.getRoom().getRoomId();

        CardPanel card = new CardPanel(new BorderLayout(14, 0));
        card.setBorder(BorderFactory.createEmptyBorder(16, 18, 16, 18));
        card.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel info = new JPanel();
        info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
        info.setOpaque(false);

        JLabel roomLabel = new JLabel(roomId + "  -  " + booking.getRoom().getBuilding());
        roomLabel.setFont(Theme.boldFont(16));
        roomLabel.setForeground(Theme.TEXT_DARK);

        JLabel timeLabel = new JLabel("Booked " + booking.getStartTime().format(TIME_FORMAT)
                + " - " + booking.getEndTime().toLocalTime());
        timeLabel.setFont(Theme.bodyFont(13));
        timeLabel.setForeground(Theme.TEXT_BODY);

        boolean open = booking.getStatus() == BookingStatus.CHECKED_IN;
        JLabel statusLabel = new JLabel("Status: " + booking.getStatus()
                + (open ? "  (room open)" : "  (not open yet)"));
        statusLabel.setFont(Theme.bodyFont(13));
        statusLabel.setForeground(open ? new Color(30, 120, 60) : Theme.GRAY);

        int tappedIn = sensorCheckInService.getTappedInCount(booking);
        boolean occupied = simulation.sensorReadsOccupied(roomId);

        JLabel tappedLabel = new JLabel("Tapped in: " + tappedIn);
        tappedLabel.setFont(Theme.boldFont(13));
        tappedLabel.setForeground(Theme.TEXT_DARK);

        JLabel sensorLabel = new JLabel("Occupancy sensor: " + (occupied ? "OCCUPIED" : "EMPTY"));
        sensorLabel.setFont(Theme.boldFont(13));
        sensorLabel.setForeground(occupied ? Theme.RED_DARK : Theme.GRAY);

        info.add(roomLabel);
        info.add(Box.createVerticalStrut(5));
        info.add(timeLabel);
        info.add(Box.createVerticalStrut(5));
        info.add(statusLabel);
        info.add(Box.createVerticalStrut(5));
        info.add(tappedLabel);
        info.add(Box.createVerticalStrut(3));
        info.add(sensorLabel);

        RoundedButton scanButton = new RoundedButton("Scan My ID Badge", RoundedButton.Style.PRIMARY);
        scanButton.addActionListener(e -> scanBadge(booking));

        RoundedButton enterButton = new RoundedButton("Enter Room", RoundedButton.Style.SECONDARY);
        enterButton.addActionListener(e -> enterRoom(booking));

        RoundedButton leaveButton = new RoundedButton("Leave Room", RoundedButton.Style.SECONDARY);
        leaveButton.addActionListener(e -> leaveRoom(booking));

        // Buttons live in a row UNDER the info, not beside it - putting them
        // to the right squeezed the text into "DB..." / "CHECKED_IN..."
        // truncation on narrower windows.
        JPanel buttons = new JPanel(new GridLayout(1, 3, 8, 0));
        buttons.setOpaque(false);
        buttons.add(scanButton);
        buttons.add(enterButton);
        buttons.add(leaveButton);

        JPanel south = new JPanel(new BorderLayout());
        south.setOpaque(false);
        south.setBorder(BorderFactory.createEmptyBorder(12, 0, 0, 0));
        south.add(buttons, BorderLayout.CENTER);

        card.add(info, BorderLayout.CENTER);
        card.add(south, BorderLayout.SOUTH);

        // Cap the height at the card's own preferred height so BoxLayout
        // doesn't stretch it, while the width follows the viewport.
        card.setMaximumSize(new Dimension(Integer.MAX_VALUE, card.getPreferredSize().height));
        return card;
    }

    private void refreshScanLog() {
        scanLogModel.clear();
        for (BadgeScanRecord record : sensorCheckInService.getBadgeScanRepository().findRecent(50)) {
            scanLogModel.addElement(record.toString());
        }
    }

    // ---------------------------------------------------------------
    // Actions: scanning and physical movement
    // ---------------------------------------------------------------

    private void scanBadge(Booking booking) {
        String roomId = booking.getRoom().getRoomId();
        var user = userContext.getCurrentUser();

        // The physical act: the person presents their badge at the reader.
        simulation.personSwipesBadge(roomId, user.getIdentificationNumber());

        try {
            SensorCheckInService.ScanOutcome outcome =
                    sensorCheckInService.processBadgePresentation(booking, user);

            switch (outcome) {
                case OWNER_CHECKED_IN -> messagePanel.showSuccess(
                        "Welcome, " + user.getFullName() + ". Your booking at " + roomId
                                + " is checked in, the room is now open, and the deposit has been applied.");
                case TAPPED_IN -> messagePanel.showSuccess(
                        "Tapped in: " + user.getFullName() + " at " + roomId + ".");
                case ALREADY_TAPPED_IN -> messagePanel.showInfo(
                        "Tap recorded for " + user.getFullName() + " - you were already tapped in "
                                + "for this booking, so the count stays the same.");
                case ROOM_NOT_OPEN -> messagePanel.showError(
                        "Room not open - the booking owner hasn't checked in yet. Your tap was not counted, "
                                + "but you can still enter or leave the room.");
                case TOO_EARLY -> messagePanel.showError(
                        "Too early - check-in and badge taps for " + roomId + " open 15 minutes "
                                + "before the start time (at "
                                + sensorCheckInService.checkInOpensAt(booking).format(TIME_FORMAT) + ").");
                case OWNER_TOO_LATE -> messagePanel.showError(
                        "You scanned after the 30-minute check-in window. The booking has expired "
                                + "and the deposit was forfeited.");
            }

            if (onBookingsChanged != null) {
                onBookingsChanged.run();
            }
        } catch (RuntimeException e) {
            messagePanel.showError(e.getMessage());
        }

        refresh();
    }

    private void enterRoom(Booking booking) {
        String roomId = booking.getRoom().getRoomId();
        String idNumber = userContext.getCurrentUser().getIdentificationNumber();

        if (!simulation.personEntersRoom(roomId, idNumber)) {
            messagePanel.showError("You are already inside " + roomId
                    + " - you can't enter twice. Leave the room first.");
            return;
        }

        messagePanel.showInfo("You entered " + roomId + ". Occupancy sensor: OCCUPIED.");
        refresh();
    }

    private void leaveRoom(Booking booking) {
        String roomId = booking.getRoom().getRoomId();
        String idNumber = userContext.getCurrentUser().getIdentificationNumber();

        if (!simulation.personLeavesRoom(roomId, idNumber)) {
            messagePanel.showError("You are not inside " + roomId + ", so you can't leave it.");
            return;
        }

        boolean nowEmpty = simulation.isRoomEmpty(roomId);
        messagePanel.showInfo("One person left " + roomId + "."
                + (nowEmpty ? " Occupancy sensor: EMPTY." : " Occupancy sensor: OCCUPIED."));
        refresh();
    }

    /**
     * A panel whose width always tracks the scroll viewport, so content can
     * only ever scroll vertically. Without this, wide cards force a
     * horizontal scrollbar and their right-hand buttons get pushed
     * off-screen.
     */
    private static class VerticalScrollPanel extends JPanel implements Scrollable {

        VerticalScrollPanel(LayoutManager layout) {
            super(layout);
        }

        @Override
        public Dimension getPreferredScrollableViewportSize() {
            return getPreferredSize();
        }

        @Override
        public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
            return 16;
        }

        @Override
        public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
            return 64;
        }

        @Override
        public boolean getScrollableTracksViewportWidth() {
            return true;
        }

        @Override
        public boolean getScrollableTracksViewportHeight() {
            return false;
        }
    }
}
