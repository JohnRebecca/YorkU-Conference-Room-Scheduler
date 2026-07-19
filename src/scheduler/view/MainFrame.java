package scheduler.view;

import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;
import scheduler.service.RoomManagementFacade;
import scheduler.service.RoomService;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainContentPanel;

    private RoomManagementFacade roomManagementFacade;
    private RoomService roomService;
    private BookingService bookingService;
    private CheckInService checkInService;
    private UserContext userContext;

    private MyBookingsPanel myBookingsPanel;
    private BookingFormPanel bookingFormPanel;
    private RoomManagementPanel roomManagementPanel;
    private AdminGenerationPanel adminGenerationPanel;

    private final Map<String, SidebarButton> navButtons = new LinkedHashMap<>();

    public MainFrame(RegisteredUser currentUser) {
        setTitle("YorkU Conference Room Scheduler");
        setSize(1150, 760);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Theme.BG);

        setupData(currentUser);
        setupLayout();
    }

    /**
     * Rooms are this subsystem's own data (no other module owns them), so they're
     * still seeded here. The account/authentication side no longer is - currentUser
     * comes in already authenticated by scheduler.service.AuthenticationService.
     */
    private void setupData(RegisteredUser currentUser) {
        userContext = new UserContext(currentUser);

        roomManagementFacade = new RoomManagementFacade();

        if (roomManagementFacade.getAllRooms().isEmpty()) {
            roomManagementFacade.addRoom(new Room("DB-1001", 40, "DB Building", "First Floor"));
            roomManagementFacade.addRoom(new Room("LAS-2045", 25, "Lassonde Building", "Second Floor"));

            Room room3 = new Room("VH-3002", 60, "Vari Hall", "Third Floor");
            room3.disable();
            roomManagementFacade.addRoom(room3);

            roomManagementFacade.addRoom(new Room("ACW-109", 18, "Accolade West", "Main Floor"));
        }

        roomService = new RoomService();
        refreshRoomsFromDatabase();

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
                "Account creation, password rules, and university verification are handled by the account & authentication module. Log in with a different account to test booking behavior under a different account type."
        );

        PlaceholderPanel checkInPanel = new PlaceholderPanel(
                "Check In",
                "Check in from the \"Check In\" button on a confirmed booking under My Bookings. The room sensor and badge scanner are simulated there since no physical hardware is connected."
        );

        roomManagementPanel = new RoomManagementPanel();
        adminGenerationPanel = new AdminGenerationPanel(userContext.getCurrentUser());

        mainContentPanel.add(roomsPanel, "Rooms");
        mainContentPanel.add(bookingFormPanel, "BookRoom");
        mainContentPanel.add(myBookingsPanel, "MyBookings");
        mainContentPanel.add(paymentPanel, "Payment");
        mainContentPanel.add(profilePanel, "Profile");
        mainContentPanel.add(checkInPanel, "CheckIn");
        mainContentPanel.add(roomManagementPanel, "RoomManagement");
        mainContentPanel.add(adminGenerationPanel, "AdminGeneration");

        add(sidebarPanel, BorderLayout.WEST);
        add(mainContentPanel, BorderLayout.CENTER);

        showCard("Rooms");
    }

    private void showCard(String name) {
        refreshRoomsFromDatabase();

        if (roomManagementPanel != null && "RoomManagement".equals(name)) {
            roomManagementPanel.refreshRooms();
        }

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
        titlePanel.add(createCurrentUserLabel());

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

        if (canAccessRoomManagement()) {
            SidebarButton roomManagementButton = new SidebarButton("Room Management");
            roomManagementButton.setForeground(Theme.RED);
            roomManagementButton.setAlignmentX(Component.LEFT_ALIGNMENT);
            roomManagementButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 46));
            roomManagementButton.addActionListener(e -> showCard("RoomManagement"));

            navButtons.put("RoomManagement", roomManagementButton);
            navWrapper.add(roomManagementButton);
            navWrapper.add(Box.createVerticalStrut(2));
        }

        if (canGenerateAdmins()) {
            SidebarButton adminGenerationButton = new SidebarButton("Generate Admin");
            adminGenerationButton.setForeground(Theme.RED);
            adminGenerationButton.setAlignmentX(Component.LEFT_ALIGNMENT);
            adminGenerationButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 46));
            adminGenerationButton.addActionListener(e -> showCard("AdminGeneration"));

            navButtons.put("AdminGeneration", adminGenerationButton);
            navWrapper.add(adminGenerationButton);
            navWrapper.add(Box.createVerticalStrut(2));
        }

        JPanel north = new JPanel(new BorderLayout());
        north.setBackground(Theme.BLACK);
        north.add(titlePanel, BorderLayout.NORTH);
        north.add(separator, BorderLayout.SOUTH);

        sidebarPanel.add(north, BorderLayout.NORTH);
        sidebarPanel.add(navWrapper, BorderLayout.CENTER);

        return sidebarPanel;
    }

    /** Shows who is logged in per scheduler.service.AuthenticationService - no more switching between demo accounts. */
    private JPanel createCurrentUserLabel() {
        JPanel wrap = new JPanel(new BorderLayout(0, 4));
        wrap.setOpaque(false);
        wrap.setAlignmentX(Component.LEFT_ALIGNMENT);

        RegisteredUser user = userContext.getCurrentUser();

        JLabel label = new JLabel("Signed in as");
        label.setForeground(Theme.GRAY);
        label.setFont(Theme.bodyFont(11));

        JLabel userLabel = new JLabel(
                user.getFullName() + " \u2014 " + user.getAccountType().getName()
                        + " ($" + user.getAccountType().getHourlyRate() + "/hr)"
        );
        userLabel.setForeground(Theme.WHITE);
        userLabel.setFont(Theme.bodyFont(12));

        wrap.add(label, BorderLayout.NORTH);
        wrap.add(userLabel, BorderLayout.CENTER);

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

    private void refreshRoomsFromDatabase() {
        roomService.getRooms().clear();
        roomService.getRooms().addAll(roomManagementFacade.getAllRooms());
    }

    private boolean canAccessRoomManagement() {
        String accountTypeName = userContext.getCurrentUser().getAccountType().getName();
        return accountTypeName != null && accountTypeName.equalsIgnoreCase("Admin");
    }

    private boolean canGenerateAdmins() {
        RegisteredUser currentUser = userContext.getCurrentUser();
        String email = currentUser.getEmail();
        String fullName = currentUser.getFullName();

        return (email != null && email.equalsIgnoreCase("chief.event.coordinator@yorku.ca"))
                || (fullName != null && fullName.equalsIgnoreCase("Chief Event Coordinator"));
    }
}
