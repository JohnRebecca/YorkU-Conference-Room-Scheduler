package scheduler.view;

import scheduler.util.AppClock;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class BookingCardPanel extends CardPanel {

    private static final String[] ALL_START_TIMES = {
            "09:00", "10:00", "11:00", "12:00",
            "13:00", "14:00", "15:00", "16:00", "17:00"
    };

    private static final String VIEW_NORMAL = "normal";
    private static final String VIEW_CONFIRM_CANCEL = "confirmCancel";
    private static final String VIEW_EDIT = "edit";
    private static final String VIEW_EXTEND = "extend";
    private static final String VIEW_CHECKIN_OCCUPANCY = "checkinOccupancy";
    private static final String VIEW_CHECKIN_BADGE = "checkinBadge";
    private static final String VIEW_PAYMENT = "payment";

    private final Booking booking;
    private final BookingService bookingService;
    private final CheckInService checkInService;
    /** When set, the Check In button navigates to the Check In tab instead of the inline simulation. */
    private final java.util.function.Consumer<Booking> onCheckInRequested;
    private final Runnable refreshCallback;
    private final InlineMessagePanel messagePanel;

    private final CardLayout actionCardLayout = new CardLayout();
    private final JPanel actionContainer = new JPanel(actionCardLayout);

    // Edit form controls
    private CalendarPanel editCalendar;
    private JComboBox<String> editStartTimeCombo;
    private JComboBox<Integer> editDurationCombo;

    // Extend form controls
    private JComboBox<Integer> extendHoursCombo;

    // Payment form controls (Req10)
    private JRadioButton creditCardRadio;
    private JRadioButton debitCardRadio;
    private JRadioButton institutionalRadio;
    private CardLayout paymentMethodCardLayout;
    private JPanel paymentMethodFields;
    private JTextField cardNumberField;
    private JTextField cardExpiryField;
    private JTextField cardCvvField;
    private JTextField institutionIdField;
    private JTextField departmentCodeField;

    public BookingCardPanel(
            Booking booking,
            BookingService bookingService,
            CheckInService checkInService,
            Runnable refreshCallback,
            InlineMessagePanel messagePanel
    ,
            java.util.function.Consumer<Booking> onCheckInRequested
    ) {
        super(new BorderLayout(18, 18));
        this.booking = booking;
        this.bookingService = bookingService;
        this.checkInService = checkInService;
        this.onCheckInRequested = onCheckInRequested;
        this.refreshCallback = refreshCallback;
        this.messagePanel = messagePanel;

        setMaximumSize(new Dimension(Integer.MAX_VALUE, 480));
        setBorder(BorderFactory.createEmptyBorder(20, 22, 20, 22));

        add(createInfoPanel(), BorderLayout.CENTER);
        add(createActionArea(), BorderLayout.EAST);
    }

    private JPanel createInfoPanel() {
        JPanel panel = new JPanel(new GridLayout(10, 1, 3, 3));
        panel.setOpaque(false);

        JLabel title = new JLabel(booking.getRoom().getRoomId() + " Booking");
        title.setFont(Theme.boldFont(21));
        title.setForeground(Theme.TEXT_DARK);

        panel.add(title);
        panel.add(infoLine("Booking ID: " + booking.getBookingId()));
        panel.add(infoLine("Room: " + booking.getRoom().getRoomId()));
        panel.add(infoLine("Date: " + booking.getStartTime().toLocalDate()));
        panel.add(infoLine("Time: " + booking.getStartTime().toLocalTime() + " - " + booking.getEndTime().toLocalTime()));
        panel.add(infoLine("Total Cost: $" + booking.getTotalCost()));
        panel.add(infoLine("Deposit (1 hr): $" + booking.getDeposit().getAmount() + " - " + depositStatusText()));
        panel.add(infoLine("Remaining Balance: $" + booking.getRemainingBalance()));
        panel.add(infoLine("Status: " + booking.getStatus()));
        panel.add(infoLine("State Pattern Class: " + booking.getState().getClass().getSimpleName()));

        return panel;
    }

    private String depositStatusText() {
        if (booking.getDeposit().isForfeited()) {
            return "Forfeited (missed check-in window)";
        }
        if (booking.getDeposit().isAppliedToFinalCost()) {
            return "Paid, applied to final cost";
        }
        if (booking.getDeposit().isPaid()) {
            return "Paid, pending check-in";
        }
        return "Not yet paid";
    }

    private JLabel infoLine(String text) {
        JLabel label = new JLabel(text);
        label.setFont(Theme.bodyFont(13));
        label.setForeground(Theme.TEXT_BODY);
        return label;
    }

    private JPanel createActionArea() {
        JPanel wrapper = new JPanel(new BorderLayout());
        wrapper.setOpaque(false);
        wrapper.setPreferredSize(new Dimension(220, 0));

        actionContainer.setOpaque(false);
        actionContainer.add(createNormalActions(), VIEW_NORMAL);
        actionContainer.add(createConfirmCancelView(), VIEW_CONFIRM_CANCEL);
        actionContainer.add(createEditView(), VIEW_EDIT);
        actionContainer.add(createExtendView(), VIEW_EXTEND);
        actionContainer.add(createCheckInOccupancyView(), VIEW_CHECKIN_OCCUPANCY);
        actionContainer.add(createCheckInBadgeView(), VIEW_CHECKIN_BADGE);
        actionContainer.add(createPaymentView(), VIEW_PAYMENT);

        wrapper.add(actionContainer, BorderLayout.CENTER);
        return wrapper;
    }

    private void showView(String viewName) {
        actionCardLayout.show(actionContainer, viewName);
    }

    // ---------------------------------------------------------------
    // Normal button row
    // ---------------------------------------------------------------

    private JPanel createNormalActions() {
        JPanel panel = new JPanel(new GridLayout(5, 1, 8, 8));
        panel.setOpaque(false);

        BookingStatus status = booking.getStatus();
        boolean beforeStart = AppClock.now().isBefore(booking.getStartTime());
        boolean beforeEnd = AppClock.now().isBefore(booking.getEndTime());

        boolean canEditOrCancel = (status == BookingStatus.PENDING_PAYMENT || status == BookingStatus.CONFIRMED) && beforeStart;
        boolean canPayDeposit = status == BookingStatus.PENDING_PAYMENT;
        boolean canCheckIn = status == BookingStatus.CONFIRMED;
        boolean canExtend = (status == BookingStatus.CONFIRMED || status == BookingStatus.CHECKED_IN) && beforeEnd;

        RoundedButton payDepositButton = new RoundedButton("Pay Deposit",
                canPayDeposit ? RoundedButton.Style.PRIMARY : RoundedButton.Style.DISABLED);
        RoundedButton checkInButton = new RoundedButton("Check In",
                canCheckIn ? RoundedButton.Style.PRIMARY : RoundedButton.Style.DISABLED);
        RoundedButton editButton = new RoundedButton("Edit",
                canEditOrCancel ? RoundedButton.Style.SECONDARY : RoundedButton.Style.DISABLED);
        RoundedButton extendButton = new RoundedButton("Extend",
                canExtend ? RoundedButton.Style.SECONDARY : RoundedButton.Style.DISABLED);
        RoundedButton cancelButton = new RoundedButton("Cancel",
                canEditOrCancel ? RoundedButton.Style.PRIMARY : RoundedButton.Style.DISABLED);

        payDepositButton.setEnabled(canPayDeposit);
        checkInButton.setEnabled(canCheckIn);
        editButton.setEnabled(canEditOrCancel);
        extendButton.setEnabled(canExtend);
        cancelButton.setEnabled(canEditOrCancel);

        payDepositButton.addActionListener(e -> openPaymentView());
        checkInButton.addActionListener(e -> {
            if (onCheckInRequested != null) {
                // Hand off to the Check In tab (sensor module) instead of the
                // older inline occupancy/badge simulation on this card.
                onCheckInRequested.accept(booking);
            } else {
                showView(VIEW_CHECKIN_OCCUPANCY);
            }
        });
        editButton.addActionListener(e -> openEditForm());
        extendButton.addActionListener(e -> openExtendForm());
        cancelButton.addActionListener(e -> showView(VIEW_CONFIRM_CANCEL));

        panel.add(payDepositButton);
        panel.add(checkInButton);
        panel.add(editButton);
        panel.add(extendButton);
        panel.add(cancelButton);

        return panel;
    }

    // ---------------------------------------------------------------
    // Cancel confirmation (inline, replaces JOptionPane confirm dialog)
    // ---------------------------------------------------------------

    private JPanel createConfirmCancelView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        JLabel prompt = new JLabel("<html>Cancel this booking?</html>");
        prompt.setFont(Theme.bodyFont(13));
        prompt.setForeground(Theme.TEXT_DARK);
        prompt.setAlignmentX(Component.LEFT_ALIGNMENT);

        RoundedButton yesButton = new RoundedButton("Yes, Cancel It", RoundedButton.Style.PRIMARY);
        RoundedButton noButton = new RoundedButton("Keep Booking", RoundedButton.Style.SECONDARY);
        yesButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        noButton.setAlignmentX(Component.LEFT_ALIGNMENT);

        yesButton.addActionListener(e -> {
            try {
                bookingService.cancelBooking(booking);
                messagePanel.showSuccess("Booking " + booking.getBookingId() + " was cancelled.");
                refreshCallback.run();
            } catch (Exception ex) {
                messagePanel.showError(ex.getMessage());
                showView(VIEW_NORMAL);
            }
        });
        noButton.addActionListener(e -> showView(VIEW_NORMAL));

        panel.add(prompt);
        panel.add(Box.createVerticalStrut(10));
        panel.add(yesButton);
        panel.add(Box.createVerticalStrut(6));
        panel.add(noButton);

        return panel;
    }

    // ---------------------------------------------------------------
    // Edit form (inline, replaces 3 chained JOptionPane input dialogs)
    // ---------------------------------------------------------------

    private JPanel createEditView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        editCalendar = new CalendarPanel(date -> refreshEditStartTimes());
        editCalendar.setPreferredSize(new Dimension(220, 190));

        editStartTimeCombo = new JComboBox<>();
        editDurationCombo = new JComboBox<>(new Integer[]{1, 2, 3, 4});

        JLabel startLabel = new JLabel("Start Time");
        startLabel.setFont(Theme.bodyFont(12));
        startLabel.setForeground(Theme.TEXT_BODY);

        JLabel durationLabel = new JLabel("Duration (hours)");
        durationLabel.setFont(Theme.bodyFont(12));
        durationLabel.setForeground(Theme.TEXT_BODY);

        RoundedButton saveButton = new RoundedButton("Save Changes", RoundedButton.Style.PRIMARY);
        RoundedButton cancelButton = new RoundedButton("Cancel", RoundedButton.Style.SECONDARY);

        saveButton.addActionListener(e -> saveEdit(saveButton));
        cancelButton.addActionListener(e -> showView(VIEW_NORMAL));

        panel.add(editCalendar);
        panel.add(Box.createVerticalStrut(8));
        panel.add(startLabel);
        panel.add(editStartTimeCombo);
        panel.add(Box.createVerticalStrut(6));
        panel.add(durationLabel);
        panel.add(editDurationCombo);
        panel.add(Box.createVerticalStrut(10));
        panel.add(saveButton);
        panel.add(Box.createVerticalStrut(6));
        panel.add(cancelButton);

        return panel;
    }

    private void openEditForm() {
        editCalendar.setSelectedDate(booking.getStartTime().toLocalDate());
        editDurationCombo.setSelectedItem((int) java.time.Duration.between(booking.getStartTime(), booking.getEndTime()).toHours());
        refreshEditStartTimes();
        // Pre-select the booking's current start time if it's still a valid option.
        editStartTimeCombo.setSelectedItem(booking.getStartTime().toLocalTime().toString());
        showView(VIEW_EDIT);
    }

    /** Same "no past times for today" filtering used on the create-booking form. */
    private void refreshEditStartTimes() {
        LocalDate selected = editCalendar.getSelectedDate();
        boolean isToday = selected.equals(AppClock.today());
        LocalTime now = LocalTime.now();

        editStartTimeCombo.removeAllItems();
        for (String time : ALL_START_TIMES) {
            if (isToday && !LocalTime.parse(time).isAfter(now)) {
                continue;
            }
            editStartTimeCombo.addItem(time);
        }
    }

    private void saveEdit(RoundedButton saveButton) {
        if (editStartTimeCombo.getSelectedItem() == null) {
            messagePanel.showError("No available start time for that date.");
            return;
        }

        saveButton.setEnabled(false);
        try {
            LocalDate newDate = editCalendar.getSelectedDate();
            LocalTime newStart = LocalTime.parse((String) editStartTimeCombo.getSelectedItem());
            int newDuration = (Integer) editDurationCombo.getSelectedItem();

            LocalDateTime newStartDateTime = LocalDateTime.of(newDate, newStart);
            LocalDateTime newEndDateTime = newStartDateTime.plusHours(newDuration);

            bookingService.editBooking(booking, newStartDateTime, newEndDateTime);

            messagePanel.showSuccess("Booking " + booking.getBookingId() + " was updated.");
            refreshCallback.run();
        } catch (Exception ex) {
            messagePanel.showError(ex.getMessage());
        } finally {
            saveButton.setEnabled(true);
        }
    }

    // ---------------------------------------------------------------
    // Extend form (inline, replaces JOptionPane free-text hours input)
    // ---------------------------------------------------------------

    private JPanel createExtendView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        JLabel label = new JLabel("Extend by how many hours?");
        label.setFont(Theme.bodyFont(13));
        label.setForeground(Theme.TEXT_DARK);

        extendHoursCombo = new JComboBox<>(new Integer[]{1, 2, 3, 4});

        RoundedButton saveButton = new RoundedButton("Confirm Extension", RoundedButton.Style.PRIMARY);
        RoundedButton cancelButton = new RoundedButton("Cancel", RoundedButton.Style.SECONDARY);

        saveButton.addActionListener(e -> saveExtend(saveButton));
        cancelButton.addActionListener(e -> showView(VIEW_NORMAL));

        panel.add(label);
        panel.add(Box.createVerticalStrut(8));
        panel.add(extendHoursCombo);
        panel.add(Box.createVerticalStrut(10));
        panel.add(saveButton);
        panel.add(Box.createVerticalStrut(6));
        panel.add(cancelButton);

        return panel;
    }

    private void openExtendForm() {
        extendHoursCombo.setSelectedIndex(0);
        showView(VIEW_EXTEND);
    }

    private void saveExtend(RoundedButton saveButton) {
        saveButton.setEnabled(false);
        try {
            int extraHours = (Integer) extendHoursCombo.getSelectedItem();
            LocalDateTime newEndTime = booking.getEndTime().plusHours(extraHours);

            bookingService.extendBooking(booking, newEndTime);

            messagePanel.showSuccess("Booking " + booking.getBookingId() + " was extended to " + newEndTime.toLocalTime() + ".");
            refreshCallback.run();
        } catch (Exception ex) {
            messagePanel.showError(ex.getMessage());
        } finally {
            saveButton.setEnabled(true);
        }
    }

    // ---------------------------------------------------------------
    // Check-in flow (inline two-step sensor/badge simulation,
    // replaces two chained JOptionPane confirm dialogs)
    // ---------------------------------------------------------------

    /**
     * Req5: rooms detect occupancy and scan ID badges, sending that data to the system.
     * There's no real sensor hardware here, so this simulates the two signals as an
     * inline two-step flow and passes the result into CheckInService exactly as real
     * sensor input would arrive.
     */
    private JPanel createCheckInOccupancyView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        JLabel label = new JLabel("<html>Simulated room sensor:<br>was occupancy detected?</html>");
        label.setFont(Theme.bodyFont(13));
        label.setForeground(Theme.TEXT_DARK);

        RoundedButton yesButton = new RoundedButton("Yes, Detected", RoundedButton.Style.PRIMARY);
        RoundedButton noButton = new RoundedButton("No", RoundedButton.Style.SECONDARY);

        yesButton.addActionListener(e -> showView(VIEW_CHECKIN_BADGE));
        noButton.addActionListener(e -> {
            messagePanel.showError("Check-in requires occupancy to be detected.");
            showView(VIEW_NORMAL);
        });

        panel.add(label);
        panel.add(Box.createVerticalStrut(10));
        panel.add(yesButton);
        panel.add(Box.createVerticalStrut(6));
        panel.add(noButton);

        return panel;
    }

    private JPanel createCheckInBadgeView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        JLabel label = new JLabel("<html>Simulated badge scanner:<br>was the ID badge verified?</html>");
        label.setFont(Theme.bodyFont(13));
        label.setForeground(Theme.TEXT_DARK);

        RoundedButton yesButton = new RoundedButton("Yes, Verified", RoundedButton.Style.PRIMARY);
        RoundedButton noButton = new RoundedButton("No", RoundedButton.Style.SECONDARY);

        yesButton.addActionListener(e -> completeCheckIn());
        noButton.addActionListener(e -> {
            messagePanel.showError("Check-in requires a verified ID badge.");
            showView(VIEW_NORMAL);
        });

        panel.add(label);
        panel.add(Box.createVerticalStrut(10));
        panel.add(yesButton);
        panel.add(Box.createVerticalStrut(6));
        panel.add(noButton);

        return panel;
    }

    private void completeCheckIn() {
        try {
            checkInService.processCheckIn(booking, true, true);
            messagePanel.showSuccess(
                    "Checked in successfully. The $" + booking.getDeposit().getAmount()
                            + " deposit is now applied to the final cost."
            );
        } catch (Exception ex) {
            messagePanel.showError(ex.getMessage());
        } finally {
            refreshCallback.run();
        }
    }

    // ---------------------------------------------------------------
    // Payment
    // ---------------------------------------------------------------

    // ---------------------------------------------------------------
    // Payment (Req10: credit card, debit card, or institutional billing)
    // ---------------------------------------------------------------

    /**
     * Uses scheduler.payment.strategy's Strategy pattern (CreditCardStrategy /
     * DebitCardStrategy / InstitutionalBillingStrategy) purely to select and
     * validate a payment method - the actual state change still goes through
     * BookingService.payUpfrontFee(), which is what correctly drives the
     * booking's state machine to CONFIRMED. The payment method chosen here is
     * recorded onto the booking's own Deposit object for the record.
     */
    private JPanel createPaymentView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        JLabel label = new JLabel("<html>Pay the $" + booking.getDeposit().getAmount() + " upfront deposit</html>");
        label.setFont(Theme.bodyFont(13));
        label.setForeground(Theme.TEXT_DARK);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        creditCardRadio = new JRadioButton("Credit Card", true);
        debitCardRadio = new JRadioButton("Debit Card");
        institutionalRadio = new JRadioButton("Institutional Billing");
        for (JRadioButton radio : new JRadioButton[]{creditCardRadio, debitCardRadio, institutionalRadio}) {
            radio.setOpaque(false);
            radio.setFont(Theme.bodyFont(12));
            radio.setForeground(Theme.TEXT_DARK);
            radio.setAlignmentX(Component.LEFT_ALIGNMENT);
            radio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        ButtonGroup methodGroup = new ButtonGroup();
        methodGroup.add(creditCardRadio);
        methodGroup.add(debitCardRadio);
        methodGroup.add(institutionalRadio);

        paymentMethodCardLayout = new CardLayout();
        paymentMethodFields = new JPanel(paymentMethodCardLayout);
        paymentMethodFields.setOpaque(false);
        paymentMethodFields.setAlignmentX(Component.LEFT_ALIGNMENT);

        cardNumberField = new JTextField();
        cardExpiryField = new JTextField();
        cardCvvField = new JTextField();
        institutionIdField = new JTextField();
        departmentCodeField = new JTextField();

        JPanel cardFields = new JPanel();
        cardFields.setLayout(new BoxLayout(cardFields, BoxLayout.Y_AXIS));
        cardFields.setOpaque(false);
        cardFields.add(fieldLabel("Card Number"));
        cardFields.add(cardNumberField);
        cardFields.add(Box.createVerticalStrut(4));
        cardFields.add(fieldLabel("Expiry (MM/YY)"));
        cardFields.add(cardExpiryField);
        cardFields.add(Box.createVerticalStrut(4));
        cardFields.add(fieldLabel("CVV"));
        cardFields.add(cardCvvField);

        JPanel institutionalFields = new JPanel();
        institutionalFields.setLayout(new BoxLayout(institutionalFields, BoxLayout.Y_AXIS));
        institutionalFields.setOpaque(false);
        institutionalFields.add(fieldLabel("Institution ID"));
        institutionalFields.add(institutionIdField);
        institutionalFields.add(Box.createVerticalStrut(4));
        institutionalFields.add(fieldLabel("Department Code (optional)"));
        institutionalFields.add(departmentCodeField);

        paymentMethodFields.add(cardFields, "card");
        paymentMethodFields.add(institutionalFields, "institutional");

        creditCardRadio.addActionListener(e -> paymentMethodCardLayout.show(paymentMethodFields, "card"));
        debitCardRadio.addActionListener(e -> paymentMethodCardLayout.show(paymentMethodFields, "card"));
        institutionalRadio.addActionListener(e -> paymentMethodCardLayout.show(paymentMethodFields, "institutional"));

        RoundedButton payButton = new RoundedButton("Pay $" + booking.getDeposit().getAmount() + " Deposit", RoundedButton.Style.PRIMARY);
        RoundedButton cancelButton = new RoundedButton("Cancel", RoundedButton.Style.SECONDARY);

        payButton.addActionListener(e -> submitPayment(payButton));
        cancelButton.addActionListener(e -> showView(VIEW_NORMAL));

        panel.add(label);
        panel.add(Box.createVerticalStrut(10));
        panel.add(creditCardRadio);
        panel.add(debitCardRadio);
        panel.add(institutionalRadio);
        panel.add(Box.createVerticalStrut(8));
        panel.add(paymentMethodFields);
        panel.add(Box.createVerticalStrut(10));
        panel.add(payButton);
        panel.add(Box.createVerticalStrut(6));
        panel.add(cancelButton);

        return panel;
    }

    private JLabel fieldLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(Theme.bodyFont(11));
        label.setForeground(Theme.TEXT_BODY);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        return label;
    }

    private void openPaymentView() {
        // Reset to a clean form each time it's opened.
        creditCardRadio.setSelected(true);
        paymentMethodCardLayout.show(paymentMethodFields, "card");
        cardNumberField.setText("");
        cardExpiryField.setText("");
        cardCvvField.setText("");
        institutionIdField.setText("");
        departmentCodeField.setText("");
        showView(VIEW_PAYMENT);
    }

    private void submitPayment(RoundedButton payButton) {
        scheduler.payment.strategy.PaymentStrategy strategy;

        if (creditCardRadio.isSelected() || debitCardRadio.isSelected()) {
            String cardNumber = cardNumberField.getText().trim();
            String expiry = cardExpiryField.getText().trim();
            String cvv = cardCvvField.getText().trim();

            if (cardNumber.isEmpty() || expiry.isEmpty() || cvv.isEmpty()) {
                messagePanel.showError("Enter the card number, expiry, and CVV.");
                return;
            }

            strategy = creditCardRadio.isSelected()
                    ? new scheduler.payment.strategy.CreditCardStrategy(cardNumber, expiry, cvv)
                    : new scheduler.payment.strategy.DebitCardStrategy(cardNumber, expiry, cvv);
        } else {
            String institutionId = institutionIdField.getText().trim();
            if (institutionId.isEmpty()) {
                messagePanel.showError("Enter an institution ID.");
                return;
            }
            String departmentCode = departmentCodeField.getText().trim();
            strategy = departmentCode.isEmpty()
                    ? new scheduler.payment.strategy.InstitutionalBillingStrategy(institutionId)
                    : new scheduler.payment.strategy.InstitutionalBillingStrategy(institutionId, departmentCode);
        }

        payButton.setEnabled(false);
        try {
            double amount = booking.getDeposit().getAmount();

            scheduler.payment.strategy.PaymentProcessor processor = new scheduler.payment.strategy.PaymentProcessor(strategy);
            processor.processPayment(amount);

            // The real state transition (PENDING_PAYMENT -> CONFIRMED) already lives in
            // BookingService/the state pattern - that logic doesn't change. The payment
            // method chosen here is just recorded onto the booking's existing deposit.
            bookingService.payUpfrontFee(booking);
            booking.getDeposit().setPaymentMethod(strategy.getPaymentMethodName());
            if (strategy instanceof scheduler.payment.strategy.InstitutionalBillingStrategy) {
                booking.getDeposit().setInstitutionId(strategy.getPaymentID());
            } else {
                booking.getDeposit().setCardNumber(strategy.getPaymentID());
            }

            messagePanel.showSuccess(
                    "Deposit of $" + amount + " paid via " + strategy.getPaymentMethodName()
                            + ". Booking is now confirmed. Check in within 30 minutes of the start time "
                            + "or the deposit will be forfeited."
            );
            refreshCallback.run();
        } catch (Exception ex) {
            messagePanel.showError(ex.getMessage());
        } finally {
            payButton.setEnabled(true);
        }
    }
}