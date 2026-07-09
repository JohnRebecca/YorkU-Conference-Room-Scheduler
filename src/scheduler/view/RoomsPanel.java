package scheduler.view;

import scheduler.model.Room;
import scheduler.service.RoomService;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.function.Consumer;

/**
 * Step 1 of the booking flow: a card grid of all rooms. Selecting a room
 * hands off to BookingFormPanel (calendar + time + ID entry) via onRoomSelected.
 */
public class RoomsPanel extends JPanel {
    private RoomService roomService;
    private UserContext userContext;
    private Consumer<Room> onRoomSelected;

    private JPanel roomListPanel;
    private InlineMessagePanel messagePanel;

    public RoomsPanel(
            RoomService roomService,
            UserContext userContext,
            Consumer<Room> onRoomSelected
    ) {
        this.roomService = roomService;
        this.userContext = userContext;
        this.onRoomSelected = onRoomSelected;

        setLayout(new BorderLayout(20, 20));
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(28, 30, 28, 30));

        add(createHeader(), BorderLayout.NORTH);
        add(createRoomCardsPanel(), BorderLayout.CENTER);

        userContext.addListener(this::refreshRoomCards);
    }

    private JPanel createHeader() {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Theme.BG);

        JLabel titleLabel = new JLabel("Rooms");
        titleLabel.setFont(Theme.titleFont(32));
        titleLabel.setForeground(Theme.TEXT_DARK);

        JLabel subtitleLabel = new JLabel("Select a room to see availability and create a booking.");
        subtitleLabel.setFont(Theme.bodyFont(15));
        subtitleLabel.setForeground(Theme.TEXT_BODY);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBackground(Theme.BG);
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

        headerPanel.add(textAndMessage, BorderLayout.WEST);

        return headerPanel;
    }

    private JScrollPane createRoomCardsPanel() {
        roomListPanel = new JPanel();
        roomListPanel.setLayout(new BoxLayout(roomListPanel, BoxLayout.Y_AXIS));
        roomListPanel.setBackground(Theme.BG);

        populateRoomCards();

        JScrollPane scrollPane = new JScrollPane(roomListPanel);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(Theme.BG);
        scrollPane.getVerticalScrollBar().setUnitIncrement(14);

        return scrollPane;
    }

    private void populateRoomCards() {
        List<Room> rooms = roomService.getRooms();

        if (rooms.isEmpty()) {
            CardPanel emptyPanel = new CardPanel(new BorderLayout());
            emptyPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

            JLabel emptyLabel = new JLabel("No rooms available.", SwingConstants.CENTER);
            emptyLabel.setFont(Theme.boldFont(20));
            emptyLabel.setForeground(Theme.TEXT_DARK);

            emptyPanel.add(emptyLabel, BorderLayout.CENTER);
            roomListPanel.add(emptyPanel);
            return;
        }

        for (Room room : rooms) {
            roomListPanel.add(createRoomCard(room));
            roomListPanel.add(Box.createVerticalStrut(16));
        }
    }

    private void refreshRoomCards() {
        roomListPanel.removeAll();
        populateRoomCards();
        roomListPanel.revalidate();
        roomListPanel.repaint();
    }

    private JPanel createRoomCard(Room room) {
        CardPanel card = new CardPanel(new BorderLayout(18, 18));
        card.setMaximumSize(new Dimension(Integer.MAX_VALUE, 180));
        card.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 22));

        JLabel imageLabel = new JLabel("", SwingConstants.CENTER);
        ImageIcon roomImage = IconLoader.loadRoomImage(room.getRoomId(), 180, 130);
        imageLabel.setPreferredSize(new Dimension(180, 130));
        imageLabel.setOpaque(true);
        imageLabel.setBackground(Theme.GRAY_LIGHT);
        if (roomImage != null) {
            imageLabel.setIcon(roomImage);
        } else {
            imageLabel.setText(room.getRoomId());
            imageLabel.setForeground(Theme.GRAY);
            imageLabel.setFont(Theme.boldFont(14));
        }

        JPanel infoPanel = new JPanel(new GridLayout(6, 1, 4, 4));
        infoPanel.setOpaque(false);

        JLabel roomName = new JLabel(room.getRoomId());
        roomName.setFont(Theme.boldFont(22));
        roomName.setForeground(Theme.TEXT_DARK);

        JLabel building = infoLine("Building: " + room.getBuilding());
        JLabel location = infoLine("Location: " + room.getLocation());
        JLabel capacity = infoLine("Capacity: " + room.getCapacity());
        JLabel rate = infoLine("Hourly Rate: $" + userContext.getCurrentUser().getAccountType().getHourlyRate()
                + " / hour (" + userContext.getCurrentUser().getAccountType().getTypeName() + ")");
        JLabel status = infoLine("Status: " + getRoomStatusText(room));

        infoPanel.add(roomName);
        infoPanel.add(building);
        infoPanel.add(location);
        infoPanel.add(capacity);
        infoPanel.add(rate);
        infoPanel.add(status);

        JPanel actionPanel = new JPanel(new GridLayout(3, 1, 8, 8));
        actionPanel.setOpaque(false);
        actionPanel.setPreferredSize(new Dimension(150, 0));

        boolean available = room.isAvailableForBooking();

        RoundedButton selectButton = new RoundedButton("Select Room",
                available ? RoundedButton.Style.PRIMARY : RoundedButton.Style.DISABLED, 10, "icon_book.png");
        RoundedButton viewButton = new RoundedButton("View Info", RoundedButton.Style.SECONDARY);

        JLabel availabilityLabel = new JLabel(getRoomStatusText(room), SwingConstants.CENTER);
        availabilityLabel.setFont(Theme.boldFont(13));
        availabilityLabel.setForeground(available ? Theme.RED : Theme.GRAY);

        selectButton.setEnabled(available);
        selectButton.addActionListener(e -> onRoomSelected.accept(room));
        viewButton.addActionListener(e -> showRoomInfo(room));

        actionPanel.add(selectButton);
        actionPanel.add(viewButton);
        actionPanel.add(availabilityLabel);

        JPanel centerWrap = new JPanel(new BorderLayout(18, 0));
        centerWrap.setOpaque(false);
        centerWrap.add(imageLabel, BorderLayout.WEST);
        centerWrap.add(infoPanel, BorderLayout.CENTER);

        card.add(centerWrap, BorderLayout.CENTER);
        card.add(actionPanel, BorderLayout.EAST);

        return card;
    }

    private JLabel infoLine(String text) {
        JLabel label = new JLabel(text);
        label.setFont(Theme.bodyFont(13));
        label.setForeground(Theme.TEXT_BODY);
        return label;
    }

    private void showRoomInfo(Room room) {
        messagePanel.showInfo(
                room.getRoomId() + " \u2014 " + room.getBuilding() + ", " + room.getLocation()
                        + ". Capacity " + room.getCapacity() + ". $"
                        + userContext.getCurrentUser().getAccountType().getHourlyRate()
                        + "/hour. Status: " + getRoomStatusText(room) + "."
        );
    }

    private String getRoomStatusText(Room room) {
        if (!room.isEnabled()) {
            return "Unavailable";
        }

        if (room.isClosedForMaintenance()) {
            return "Closed for Maintenance";
        }

        return "Available";
    }
}
