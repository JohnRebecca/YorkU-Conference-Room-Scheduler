package scheduler.view;

import scheduler.model.Booking;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;
import service.PaymentService;  // ← ADDED

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MyBookingsPanel extends JPanel {
    private BookingService bookingService;
    private CheckInService checkInService;
    private PaymentService paymentService;  // ← ADDED
    private UserContext userContext;
    private JPanel bookingListPanel;
    private InlineMessagePanel messagePanel;

    // ← UPDATED CONSTRUCTOR
    public MyBookingsPanel(BookingService bookingService, CheckInService checkInService, 
                           UserContext userContext, PaymentService paymentService) {
        this.bookingService = bookingService;
        this.checkInService = checkInService;
        this.userContext = userContext;
        this.paymentService = paymentService;  // ← ADDED

        setLayout(new BorderLayout(20, 20));
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(28, 30, 28, 30));

        add(createHeader(), BorderLayout.NORTH);
        add(createBookingScrollPane(), BorderLayout.CENTER);

        refreshBookings();
        userContext.addListener(() -> {
            messagePanel.clear();
            refreshBookings();
        });
    }

    private JPanel createHeader() {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Theme.BG);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBackground(Theme.BG);

        JLabel titleLabel = new JLabel("My Bookings");
        titleLabel.setFont(Theme.titleFont(32));
        titleLabel.setForeground(Theme.TEXT_DARK);

        JLabel subtitleLabel = new JLabel("View, edit, cancel, extend, or check in to your bookings.");
        subtitleLabel.setFont(Theme.bodyFont(15));
        subtitleLabel.setForeground(Theme.TEXT_BODY);

        textPanel.add(titleLabel);
        textPanel.add(Box.createVerticalStrut(4));
        textPanel.add(subtitleLabel);

        messagePanel = new InlineMessagePanel();

        JPanel textAndMessage = new JPanel();
        textAndMessage.setLayout(new BoxLayout(textAndMessage, BoxLayout.Y_AXIS));
        textAndMessage.setBackground(Theme.BG);
        textAndMessage.add(textPanel);
        textAndMessage.add(Box.createVerticalStrut(10));
        textAndMessage.add(messagePanel);

        RoundedButton refreshButton = new RoundedButton("Refresh", RoundedButton.Style.PRIMARY);
        refreshButton.addActionListener(e -> refreshBookings());

        headerPanel.add(textAndMessage, BorderLayout.WEST);
        headerPanel.add(refreshButton, BorderLayout.EAST);

        return headerPanel;
    }

    private JScrollPane createBookingScrollPane() {
        bookingListPanel = new JPanel();
        bookingListPanel.setLayout(new BoxLayout(bookingListPanel, BoxLayout.Y_AXIS));
        bookingListPanel.setBackground(Theme.BG);

        JScrollPane scrollPane = new JScrollPane(bookingListPanel);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(Theme.BG);
        scrollPane.getVerticalScrollBar().setUnitIncrement(14);

        return scrollPane;
    }

    public void refreshBookings() {
        bookingListPanel.removeAll();

        List<Booking> bookings = bookingService.getBookingsForUser(userContext.getCurrentUser());

        if (bookings.isEmpty()) {
            CardPanel emptyPanel = new CardPanel(new BorderLayout());
            emptyPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

            JLabel emptyLabel = new JLabel("No bookings found for this account yet.", SwingConstants.CENTER);
            emptyLabel.setFont(Theme.boldFont(20));
            emptyLabel.setForeground(Theme.TEXT_DARK);

            emptyPanel.add(emptyLabel, BorderLayout.CENTER);
            bookingListPanel.add(emptyPanel);
        } else {
        	for (Booking booking : bookings) {
                
                bookingListPanel.add(new BookingCardPanel(
                    booking, 
                    bookingService, 
                    checkInService, 
                    this::refreshBookings, 
                    messagePanel,
                    paymentService  // ← ADDED
                ));
                bookingListPanel.add(Box.createVerticalStrut(16));
            }
        }

        bookingListPanel.revalidate();
        bookingListPanel.repaint();
    }
}