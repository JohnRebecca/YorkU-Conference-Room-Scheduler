package scheduler.view;

import scheduler.util.AppClock;
import scheduler.model.Booking;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.service.BookingService;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Step 2 of the booking flow: reached after a room is selected from RoomsPanel.
 * Lets the user pick a date/time on the calendar, confirm their organization ID
 * or student number, and submit the booking under the currently active demo user.
 */
public class BookingFormPanel extends JPanel {
    private final BookingService bookingService;
    private final UserContext userContext;
    private final Runnable onBackToRooms;
    private final Runnable onBookingConfirmed;

    private Room room;
    private LocalDate selectedDate;

    private JLabel roomImageLabel;
    private JLabel roomTitleLabel;
    private JLabel roomDetailLabel;
    private JLabel roomRateLabel;
    private JLabel roomStatusLabel;

    private static final String[] ALL_START_TIMES = {
            "09:00", "10:00", "11:00", "12:00",
            "13:00", "14:00", "15:00", "16:00", "17:00"
    };

    private CalendarPanel calendarPanel;
    private JComboBox<String> startTimeComboBox;
    private JComboBox<Integer> durationComboBox;
    private JTextField idField;
    private RoundedButton confirmButton;
    private InlineMessagePanel messagePanel;

    public BookingFormPanel(
            BookingService bookingService,
            UserContext userContext,
            Runnable onBackToRooms,
            Runnable onBookingConfirmed
    ) {
        this.bookingService = bookingService;
        this.userContext = userContext;
        this.onBackToRooms = onBackToRooms;
        this.onBookingConfirmed = onBookingConfirmed;
        this.selectedDate = AppClock.today();

        setLayout(new BorderLayout(20, 20));
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(28, 30, 28, 30));

        add(createHeader(), BorderLayout.NORTH);
        add(createMainContent(), BorderLayout.CENTER);

        userContext.addListener(this::refreshForCurrentUser);
    }

    /** Called by RoomsPanel right before this panel is shown. */
    public void setRoom(Room room) {
        this.room = room;
        refreshForCurrentUser();
    }

    private void refreshForCurrentUser() {
        if (room == null) {
            return;
        }

        RegisteredUser user = userContext.getCurrentUser();

        roomImageLabel.setIcon(IconLoader.loadRoomImage(room.getRoomId(), 220, 140));
        roomImageLabel.setText(roomImageLabel.getIcon() == null ? room.getRoomId() : "");

        roomTitleLabel.setText(room.getRoomId());
        roomDetailLabel.setText(
                "<html>Building: " + room.getBuilding()
                        + "<br>Location: " + room.getLocation()
                        + "<br>Capacity: " + room.getCapacity() + "</html>"
        );
        roomRateLabel.setText("Hourly Rate: $" + user.getAccountType().getHourlyRate()
                + " / hour (" + user.getAccountType().getName() + ")");

        boolean available = room.isAvailableForBooking();
        roomStatusLabel.setText("Status: " + (available ? "Available" : "Unavailable"));
        roomStatusLabel.setForeground(available ? Theme.RED : Theme.GRAY);

        confirmButton.setStyle(available ? RoundedButton.Style.PRIMARY : RoundedButton.Style.DISABLED);
        confirmButton.setEnabled(available);

        idField.setText(user.getIdentificationNumber());

        if (messagePanel != null) {
            messagePanel.clear();
        }

        refreshAvailableStartTimes();
    }

    private JPanel createHeader() {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Theme.BG);

        RoundedButton backButton = new RoundedButton("Back to Rooms", RoundedButton.Style.SECONDARY, 10, "icon_back.png");
        backButton.addActionListener(e -> onBackToRooms.run());

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBackground(Theme.BG);

        JLabel titleLabel = new JLabel("Book a Room");
        titleLabel.setFont(Theme.titleFont(32));
        titleLabel.setForeground(Theme.TEXT_DARK);

        JLabel subtitleLabel = new JLabel("Choose a date and time, confirm your ID, and submit your booking.");
        subtitleLabel.setFont(Theme.bodyFont(15));
        subtitleLabel.setForeground(Theme.TEXT_BODY);

        textPanel.add(titleLabel);
        textPanel.add(Box.createVerticalStrut(4));
        textPanel.add(subtitleLabel);

        JPanel top = new JPanel(new BorderLayout());
        top.setBackground(Theme.BG);
        top.setBorder(BorderFactory.createEmptyBorder(0, 0, 16, 0));
        top.add(backButton, BorderLayout.WEST);

        messagePanel = new InlineMessagePanel();

        JPanel textAndMessage = new JPanel();
        textAndMessage.setLayout(new BoxLayout(textAndMessage, BoxLayout.Y_AXIS));
        textAndMessage.setBackground(Theme.BG);
        textAndMessage.add(textPanel);
        textAndMessage.add(Box.createVerticalStrut(10));
        textAndMessage.add(messagePanel);

        headerPanel.add(top, BorderLayout.NORTH);
        headerPanel.add(textAndMessage, BorderLayout.CENTER);

        return headerPanel;
    }

    private JPanel createMainContent() {
        JPanel mainPanel = new JPanel(new BorderLayout(20, 20));
        mainPanel.setBackground(Theme.BG);

        mainPanel.add(createRoomSummaryCard(), BorderLayout.WEST);
        mainPanel.add(createSchedulingCard(), BorderLayout.CENTER);

        return mainPanel;
    }

    private JPanel createRoomSummaryCard() {
        CardPanel card = new CardPanel(new BorderLayout(14, 14));
        card.setPreferredSize(new Dimension(300, 0));
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        roomImageLabel = new JLabel("", SwingConstants.CENTER);
        roomImageLabel.setPreferredSize(new Dimension(256, 150));
        roomImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        roomImageLabel.setFont(Theme.boldFont(16));
        roomImageLabel.setForeground(Theme.GRAY);
        roomImageLabel.setOpaque(true);
        roomImageLabel.setBackground(Theme.GRAY_LIGHT);

        roomTitleLabel = new JLabel("Select a room");
        roomTitleLabel.setFont(Theme.boldFont(22));
        roomTitleLabel.setForeground(Theme.TEXT_DARK);

        roomDetailLabel = new JLabel("");
        roomDetailLabel.setFont(Theme.bodyFont(13));
        roomDetailLabel.setForeground(Theme.TEXT_BODY);

        roomRateLabel = new JLabel("");
        roomRateLabel.setFont(Theme.bodyFont(13));
        roomRateLabel.setForeground(Theme.TEXT_BODY);

        roomStatusLabel = new JLabel("");
        roomStatusLabel.setFont(Theme.boldFont(13));

        JPanel infoWrap = new JPanel();
        infoWrap.setLayout(new BoxLayout(infoWrap, BoxLayout.Y_AXIS));
        infoWrap.setOpaque(false);
        infoWrap.add(roomTitleLabel);
        infoWrap.add(Box.createVerticalStrut(8));
        infoWrap.add(roomDetailLabel);
        infoWrap.add(Box.createVerticalStrut(8));
        infoWrap.add(roomRateLabel);
        infoWrap.add(Box.createVerticalStrut(4));
        infoWrap.add(roomStatusLabel);

        card.add(roomImageLabel, BorderLayout.NORTH);
        card.add(infoWrap, BorderLayout.CENTER);

        return card;
    }

    private JPanel createSchedulingCard() {
        CardPanel card = new CardPanel(new BorderLayout(14, 14));
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        calendarPanel = new CalendarPanel(date -> {
            selectedDate = date;
            refreshAvailableStartTimes();
        });

        JPanel detailsPanel = new JPanel();
        detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.Y_AXIS));
        detailsPanel.setOpaque(false);
        detailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        JPanel timeRow = new JPanel(new GridLayout(1, 2, 12, 0));
        timeRow.setOpaque(false);

        startTimeComboBox = new JComboBox<>(ALL_START_TIMES);
        durationComboBox = new JComboBox<>(new Integer[]{1, 2, 3, 4});

        timeRow.add(labeledField("Start Time", startTimeComboBox));
        timeRow.add(labeledField("Duration (hours)", durationComboBox));

        idField = new JTextField();
        idField.setFont(Theme.bodyFont(14));
        idField.setEditable(false);
        idField.setFocusable(false);
        idField.setBackground(Theme.GRAY_LIGHT);

        JLabel idLabel = new JLabel("Student / Organization ID (from your account)");
        idLabel.setFont(Theme.bodyFont(13));
        idLabel.setForeground(Theme.TEXT_BODY);

        JPanel idPanel = new JPanel(new BorderLayout(4, 4));
        idPanel.setOpaque(false);
        idPanel.setBorder(BorderFactory.createEmptyBorder(14, 0, 0, 0));
        idPanel.add(idLabel, BorderLayout.NORTH);
        idPanel.add(idField, BorderLayout.CENTER);

        confirmButton = new RoundedButton("Confirm Booking", RoundedButton.Style.PRIMARY, 10, "icon_book.png");
        confirmButton.addActionListener(e -> confirmBooking());

        JPanel confirmWrap = new JPanel(new BorderLayout());
        confirmWrap.setOpaque(false);
        confirmWrap.setBorder(BorderFactory.createEmptyBorder(18, 0, 0, 0));
        confirmWrap.add(confirmButton, BorderLayout.EAST);

        detailsPanel.add(timeRow);
        detailsPanel.add(idPanel);
        detailsPanel.add(confirmWrap);

        card.add(calendarPanel, BorderLayout.CENTER);
        card.add(detailsPanel, BorderLayout.SOUTH);

        refreshAvailableStartTimes();

        return card;
    }

    /**
     * Rebuilds the start-time dropdown based on the selected date. If the selected
     * date is today, times that have already passed are removed so a user can't
     * book a slot that's already in the past. If every slot for today has already
     * passed, booking is disabled with an explanatory message.
     */
    private void refreshAvailableStartTimes() {
        if (startTimeComboBox == null) {
            return;
        }

        List<String> availableTimes = new ArrayList<>();
        boolean isToday = selectedDate.equals(AppClock.today());
        LocalTime now = LocalTime.now();

        for (String time : ALL_START_TIMES) {
            if (isToday && !LocalTime.parse(time).isAfter(now)) {
                continue;
            }
            availableTimes.add(time);
        }

        startTimeComboBox.removeAllItems();

        if (availableTimes.isEmpty()) {
            startTimeComboBox.setEnabled(false);
            durationComboBox.setEnabled(false);
            if (confirmButton != null) {
                confirmButton.setEnabled(false);
                confirmButton.setStyle(RoundedButton.Style.DISABLED);
            }
            if (messagePanel != null) {
                messagePanel.showInfo("No more time slots are available today. Please choose a different date.");
            }
        } else {
            for (String time : availableTimes) {
                startTimeComboBox.addItem(time);
            }
            startTimeComboBox.setEnabled(true);
            durationComboBox.setEnabled(true);
            if (messagePanel != null && room != null) {
                messagePanel.clear();
            }
            if (confirmButton != null && room != null) {
                boolean available = room.isAvailableForBooking();
                confirmButton.setEnabled(available);
                confirmButton.setStyle(available ? RoundedButton.Style.PRIMARY : RoundedButton.Style.DISABLED);
            }
        }
    }

    private JPanel labeledField(String label, JComponent field) {
        JPanel panel = new JPanel(new BorderLayout(4, 4));
        panel.setOpaque(false);

        JLabel labelComponent = new JLabel(label);
        labelComponent.setFont(Theme.bodyFont(13));
        labelComponent.setForeground(Theme.TEXT_BODY);

        panel.add(labelComponent, BorderLayout.NORTH);
        panel.add(field, BorderLayout.CENTER);

        return panel;
    }

    private void confirmBooking() {
        if (room == null) {
            messagePanel.showError("Select a room first.");
            return;
        }

        if (startTimeComboBox.getSelectedItem() == null) {
            messagePanel.showError("No available time slot is selected.");
            return;
        }

        // Guard against double-clicks creating duplicate bookings while the first request is processing.
        confirmButton.setEnabled(false);

        try {
            RegisteredUser user = userContext.getCurrentUser();

            String selectedStart = (String) startTimeComboBox.getSelectedItem();
            int selectedDuration = (Integer) durationComboBox.getSelectedItem();

            LocalTime startTime = LocalTime.parse(selectedStart);
            LocalDateTime startDateTime = LocalDateTime.of(selectedDate, startTime);
            LocalDateTime endDateTime = startDateTime.plusHours(selectedDuration);

            Booking booking = bookingService.createBooking(user, room, startDateTime, endDateTime);

            messagePanel.showSuccess(
                    "Booking created. Booking ID: " + booking.getBookingId()
                            + " \u2014 " + booking.getRoom().getRoomId()
                            + " on " + selectedDate + " from " + startDateTime.toLocalTime()
                            + " to " + endDateTime.toLocalTime()
                            + ". Upfront deposit due: $" + booking.getDeposit().getAmount()
                            + ". Status: " + booking.getStatus() + "."
            );

            onBookingConfirmed.run();

        } catch (Exception ex) {
            messagePanel.showError(ex.getMessage());
        } finally {
            confirmButton.setEnabled(room != null && room.isAvailableForBooking()
                    && startTimeComboBox.getItemCount() > 0);
        }
    }
}
