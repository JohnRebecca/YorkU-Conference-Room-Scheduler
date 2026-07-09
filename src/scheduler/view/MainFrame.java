package scheduler.view;

import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;
import scheduler.service.RoomService;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainContentPanel;

    private RoomService roomService;
    private BookingService bookingService;
    private CheckInService checkInService;
    private UserContext userContext;

    private MyBookingsPanel myBookingsPanel;
    private BookingFormPanel bookingFormPanel;

    private final Map<String, SidebarButton> navButtons = new LinkedHashMap<>();

    public MainFrame() {
        setTitle("YorkU Conference Room Scheduler");
        setSize(1150, 760);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Theme.BG);

        setupDemoData();
        setupLayout();
    }

    private void setupDemoData() {
        // Req3: rates vary by account type. These four demo accounts let the
        // booking flow be tested against every rate without a real login system.
        AccountType studentType = new AccountType("Student", 20.00, true);
        AccountType facultyType = new AccountType("Faculty", 30.00, true);
        AccountType staffType = new AccountType("Staff", 40.00, true);
        AccountType partnerType = new AccountType("Partner", 50.00, false);

        List<RegisteredUser> demoUsers = new ArrayList<>();
        demoUsers.add(new RegisteredUser("U001", "student@yorku.ca", "216000000", studentType));
        demoUsers.add(new RegisteredUser("U002", "faculty@yorku.ca", "F-10021", facultyType));
        demoUsers.add(new RegisteredUser("U003", "staff@yorku.ca", "S-55210", staffType));
        demoUsers.add(new RegisteredUser("U004", "partner@example.com", "ORG-4471", partnerType));

        userContext = new UserContext(demoUsers);

        Room room1 = new Room("DB-1001", 40, "DB Building", "First Floor");
        Room room2 = new Room("LAS-2045", 25, "Lassonde Building", "Second Floor");
        Room room3 = new Room("VH-3002", 60, "Vari Hall", "Third Floor");
        Room room4 = new Room("ACW-109", 18, "Accolade West", "Main Floor");

        room3.disable();

        roomService = new RoomService();
        roomService.addRoom(room1);
        roomService.addRoom(room2);
        roomService.addRoom(room3);
        roomService.addRoom(room4);

        bookingService = new BookingService(roomService);
        checkInService = new CheckInService();
    }

    private void setupLayout() {
        setLayout(new BorderLayout());

        JPanel sidebarPanel = createSidebarPanel();

        cardLayout = new CardLayout();
        mainContentPanel = new JPanel(cardLayout);
        mainContentPanel.setBackground(Theme.BG);

        myBookingsPanel = new MyBookingsPanel(bookingService, checkInService, userContext);

        bookingFormPanel = new BookingFormPanel(
                bookingService,
                userContext,
                () -> showCard("Rooms"),
                () -> {
                    myBookingsPanel.refreshBookings();
                    showCard("MyBookings");
                }
        );

        RoomsPanel roomsPanel = new RoomsPanel(
                roomService,
                userContext,
                room -> {
                    bookingFormPanel.setRoom(room);
                    showCard("BookRoom");
                }
        );

        PlaceholderPanel paymentPanel = new PlaceholderPanel(
                "Payment",
                "Credit card, debit card, and institutional billing are handled by another module. Booking management only tracks the 1-hour upfront deposit and remaining balance."
        );

        PlaceholderPanel profilePanel = new PlaceholderPanel(
                "Profile",
                "Account creation, password rules, and university verification are handled by another module. Use the account switcher in the sidebar to test booking behavior under each account type."
        );

        PlaceholderPanel checkInPanel = new PlaceholderPanel(
                "Check In",
                "Check in from the \"Check In\" button on a confirmed booking under My Bookings. The room sensor and badge scanner are simulated there since no physical hardware is connected."
        );

        mainContentPanel.add(roomsPanel, "Rooms");
        mainContentPanel.add(bookingFormPanel, "BookRoom");
        mainContentPanel.add(myBookingsPanel, "MyBookings");
        mainContentPanel.add(paymentPanel, "Payment");
        mainContentPanel.add(profilePanel, "Profile");
        mainContentPanel.add(checkInPanel, "CheckIn");

        add(sidebarPanel, BorderLayout.WEST);
        add(mainContentPanel, BorderLayout.CENTER);

        showCard("Rooms");
    }

    private void showCard(String name) {
        cardLayout.show(mainContentPanel, name);

        // BookRoom is reached only via a room card, not a direct sidebar link,
        // so treat "Rooms" as the active nav item while on the booking form too.
        String activeNav = name.equals("BookRoom") ? "Rooms" : name;

        for (Map.Entry<String, SidebarButton> entry : navButtons.entrySet()) {
            entry.getValue().setActive(entry.getKey().equals(activeNav));
        }
    }

    private JPanel createSidebarPanel() {
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BorderLayout());
        sidebarPanel.setPreferredSize(new Dimension(230, 0));
        sidebarPanel.setBackground(Theme.BLACK);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setBackground(Theme.BLACK);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(26, 22, 20, 22));

        JLabel logo = new JLabel();
        ImageIcon logoIcon = IconLoader.load("logo.png", 40, 40);
        if (logoIcon != null) {
            logo.setIcon(logoIcon);
            logo.setAlignmentX(Component.LEFT_ALIGNMENT);
            titlePanel.add(logo);
            titlePanel.add(Box.createVerticalStrut(10));
        }

        JLabel title = new JLabel("YorkU");
        title.setForeground(Theme.WHITE);
        title.setFont(Theme.titleFont(28));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel subtitle = new JLabel("Room Scheduler");
        subtitle.setForeground(Theme.RED);
        subtitle.setFont(Theme.boldFont(14));
        subtitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        titlePanel.add(title);
        titlePanel.add(Box.createVerticalStrut(4));
        titlePanel.add(subtitle);
        titlePanel.add(Box.createVerticalStrut(16));
        titlePanel.add(createUserSwitcher());

        JSeparator separator = new JSeparator();
        separator.setForeground(Theme.SIDEBAR_HOVER);
        separator.setBackground(Theme.SIDEBAR_HOVER);

        JPanel navWrapper = new JPanel();
        navWrapper.setLayout(new BoxLayout(navWrapper, BoxLayout.Y_AXIS));
        navWrapper.setBackground(Theme.BLACK);
        navWrapper.setBorder(BorderFactory.createEmptyBorder(16, 0, 0, 0));

        registerNavButton(navWrapper, "Rooms", "Rooms", "icon_rooms.png");
        registerNavButton(navWrapper, "MyBookings", "My Bookings", "icon_my_bookings.png");
        registerNavButton(navWrapper, "CheckIn", "Check In", "icon_check_in.png");
        registerNavButton(navWrapper, "Payment", "Payment", "icon_payment.png");
        registerNavButton(navWrapper, "Profile", "Profile", "icon_profile.png");

        JPanel north = new JPanel(new BorderLayout());
        north.setBackground(Theme.BLACK);
        north.add(titlePanel, BorderLayout.NORTH);
        north.add(separator, BorderLayout.SOUTH);

        sidebarPanel.add(north, BorderLayout.NORTH);
        sidebarPanel.add(navWrapper, BorderLayout.CENTER);

        return sidebarPanel;
    }

    /**
     * There's no login system yet, so this lets you switch between the four demo
     * accounts (one per account type) to test that hourly rates, IDs, and booking
     * lists all behave correctly per account type (Req3).
     */
    private JPanel createUserSwitcher() {
        JPanel wrap = new JPanel(new BorderLayout(0, 4));
        wrap.setOpaque(false);
        wrap.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel label = new JLabel("Demo Account (testing)");
        label.setForeground(Theme.GRAY);
        label.setFont(Theme.bodyFont(11));

        JComboBox<RegisteredUser> comboBox = new JComboBox<>(userContext.getUsers().toArray(new RegisteredUser[0]));
        comboBox.setFont(Theme.bodyFont(12));
        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof RegisteredUser) {
                    RegisteredUser u = (RegisteredUser) value;
                    setText(u.getAccountType().getTypeName() + " ($" + u.getAccountType().getHourlyRate() + "/hr)");
                }
                return this;
            }
        });

        comboBox.addActionListener(e -> {
            RegisteredUser selected = (RegisteredUser) comboBox.getSelectedItem();
            if (selected != null) {
                userContext.setCurrentUser(selected);
            }
        });

        wrap.add(label, BorderLayout.NORTH);
        wrap.add(comboBox, BorderLayout.CENTER);

        return wrap;
    }

    private void registerNavButton(JPanel container, String cardName, String label, String iconFileName) {
        SidebarButton button = new SidebarButton(label, iconFileName);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 46));

        button.addActionListener(e -> {
            if (cardName.equals("MyBookings")) {
                myBookingsPanel.refreshBookings();
            }
            showCard(cardName);
        });

        navButtons.put(cardName, button);
        container.add(button);
        container.add(Box.createVerticalStrut(2));
    }
}
