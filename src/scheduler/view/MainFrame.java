package scheduler.view;

import scheduler.model.Administrator;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.repository.AdminDAO;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;
import scheduler.service.ProfileService;
import scheduler.service.RoomService;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainContentPanel;

    private RoomService roomService;
    private BookingService bookingService;
    private CheckInService checkInService;
    private UserContext userContext;

    private MyBookingsPanel myBookingsPanel;
    private CheckInPanel checkInPanel;
    private BadgeSensorPanel badgeSensorPanel;
    private RoomManagementPanel roomManagementPanel;
    private AdminGenerationPanel adminGenerationPanel;
    private BookingFormPanel bookingFormPanel;
    private JLabel userLabel;
    private final Runnable logoutHandler;

    private final Map<String, SidebarButton> navButtons = new LinkedHashMap<>();

    public MainFrame(RegisteredUser currentUser, ProfileService profileService, Runnable logoutHandler) {
        setTitle("YorkU Conference Room Scheduler");
        setSize(1150, 760);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Theme.BG);
        this.logoutHandler = logoutHandler;

        setupData(currentUser);
        setupLayout(profileService);
    }

    /**
     * Rooms now live in Saif's SQLite "rooms" table via RoomService/RoomDAO.
     * These four are only inserted the first time the app runs against an empty
     * database (e.g. a fresh clone) - once they exist, RoomService loads them
     * back from the database instead of recreating them on every launch.
     */
    private void setupData(RegisteredUser currentUser) {
        userContext = new UserContext(currentUser);

        roomService = new RoomService();

        if (roomService.getRooms().isEmpty()) {
            Room room1 = new Room("DB-1001", 40, "DB Building", "First Floor");
            Room room2 = new Room("LAS-2045", 25, "Lassonde Building", "Second Floor");
            Room room3 = new Room("VH-3002", 60, "Vari Hall", "Third Floor");
            Room room4 = new Room("ACW-109", 18, "Accolade West", "Main Floor");

            room3.disable();

            roomService.addRoom(room1);
            roomService.addRoom(room2);
            roomService.addRoom(room3);
            roomService.addRoom(room4);
        }

        bookingService = new BookingService(roomService);
        checkInService = new CheckInService();

        seedChiefEventCoordinatorIfMissing();
    }

    /**
     * Req2: bootstraps exactly one administrator account so there's a way to log
     * into Room Management the first time - AdminDashboard's own "Generate Admin"
     * button (routed through the ChiefEventCoordinator singleton) can create more
     * from there. Only runs once; skipped once this email already exists.
     */
    private void seedChiefEventCoordinatorIfMissing() {
        AdminDAO adminDAO = new AdminDAO();
        String chiefEmail = "chief@yorku.ca";

        if (adminDAO.emailExists(chiefEmail)) {
            return;
        }

        Administrator chief = new Administrator(1, "Chief Event Coordinator", chiefEmail, "ChiefAdmin123!");
        adminDAO.insertAdmin(chief);
    }

    private void setupLayout(ProfileService profileService) {
        setLayout(new BorderLayout());

        JPanel sidebarPanel = createSidebarPanel();

        cardLayout = new CardLayout();
        mainContentPanel = new JPanel(cardLayout);
        mainContentPanel.setBackground(Theme.BG);

        myBookingsPanel = new MyBookingsPanel(bookingService, checkInService, userContext,
                booking -> {
                    if (checkInPanel != null) {
                        checkInPanel.selectBooking(booking);
                        showCard("CheckIn");
                    }
                });

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

        ProfilePanel profilePanel =  new ProfilePanel( profileService, userContext );

        // Sensor Check-In module (Adapter Pattern): simulated vendor hardware
        // wrapped behind the OccupancySensor / BadgeScanner interfaces.
        scheduler.sensor.hardware.LegacyMotionUnit motionUnit = new scheduler.sensor.hardware.LegacyMotionUnit();
        scheduler.sensor.hardware.MagStripeBadgeReader badgeReader = new scheduler.sensor.hardware.MagStripeBadgeReader();
        scheduler.sensor.SensorDataLog sensorDataLog = new scheduler.sensor.SensorDataLog();
        scheduler.sensor.MotionUnitOccupancyAdapter occupancyAdapter =
                new scheduler.sensor.MotionUnitOccupancyAdapter(motionUnit, sensorDataLog);
        scheduler.sensor.MagStripeBadgeAdapter badgeAdapter =
                new scheduler.sensor.MagStripeBadgeAdapter(badgeReader, sensorDataLog);
        scheduler.repository.BadgeScanRepository badgeScanRepository =
                new scheduler.repository.SqliteBadgeScanRepository();
        scheduler.sensor.SensorCheckInService sensorCheckInService = new scheduler.sensor.SensorCheckInService(
                occupancyAdapter, badgeAdapter, checkInService, bookingService, badgeScanRepository, sensorDataLog);
        scheduler.sensor.SensorSimulationController sensorSimulation =
                new scheduler.sensor.SensorSimulationController(motionUnit, badgeReader, occupancyAdapter, badgeAdapter);

        // Online check-in (Check In tab) and the room badge reader hardware
        // (ID Badge Sensor tab) refresh each other and My Bookings whenever a
        // scan or check-in changes booking state.
        checkInPanel = new CheckInPanel(
                bookingService,
                sensorCheckInService,
                sensorSimulation,
                sensorDataLog,
                userContext,
                () -> {
                    myBookingsPanel.refreshBookings();
                    if (badgeSensorPanel != null) {
                        badgeSensorPanel.refresh();
                    }
                }
        );

        badgeSensorPanel = new BadgeSensorPanel(
                bookingService,
                sensorCheckInService,
                sensorSimulation,
                userContext,
                () -> {
                    myBookingsPanel.refreshBookings();
                    checkInPanel.refreshBookings();
                }
        );

        // Req2/Req6: Room Management sits behind AdminLoginPanel; a successful login
        // navigates into the real RoomManagementPanel (replacing the old standalone
        // AdminDashboard popup entirely). "Generate New Admin" and "Back to Room
        // Management" link the two admin screens to each other.
        roomManagementPanel = new RoomManagementPanel(() -> showCard("AdminGeneration"));
        adminGenerationPanel = new AdminGenerationPanel(() -> showCard("RoomManagementHome"));
        AdminLoginPanel adminLoginPanel = new AdminLoginPanel(() -> showCard("RoomManagementHome"));

        mainContentPanel.add(roomsPanel, "Rooms");
        mainContentPanel.add(bookingFormPanel, "BookRoom");
        mainContentPanel.add(myBookingsPanel, "MyBookings");
        mainContentPanel.add(paymentPanel, "Payment");
        mainContentPanel.add(profilePanel, "Profile");
        mainContentPanel.add(checkInPanel, "CheckIn");
        mainContentPanel.add(badgeSensorPanel, "BadgeSensor");
        mainContentPanel.add(adminLoginPanel, "RoomManagement");
        mainContentPanel.add(roomManagementPanel, "RoomManagementHome");
        mainContentPanel.add(adminGenerationPanel, "AdminGeneration");

        add(sidebarPanel, BorderLayout.WEST);
        add(mainContentPanel, BorderLayout.CENTER);

        showCard("Rooms");
    }

    /**
     * Signs a different account into this same window. Bookings live in
     * memory, so reusing the frame across logins (instead of building a new
     * one) is what lets an owner book a room, log out, and a guest log in
     * and scan their badge at that room - all in one run. Panels refresh
     * through their UserContext listeners.
     */
    public void switchUser(RegisteredUser user) {
        userContext.setCurrentUser(user);
    }

    private void showCard(String name) {
        if (name.equals("CheckIn") && checkInPanel != null) {
            checkInPanel.refreshBookings();
        }
        if (name.equals("BadgeSensor") && badgeSensorPanel != null) {
            badgeSensorPanel.refresh();
        }
        if (name.equals("RoomManagementHome") && roomManagementPanel != null) {
            roomManagementPanel.refreshRooms();
        }
        cardLayout.show(mainContentPanel, name);

        // BookRoom, RoomManagementHome, and AdminGeneration are only reached through
        // in-app navigation (a room card, a successful admin login, or the links
        // between the two admin screens), not a direct sidebar link - so keep
        // whichever sidebar item started that flow highlighted instead of none.
        String activeNav = name.equals("BookRoom") ? "Rooms"
                : (name.equals("RoomManagementHome") || name.equals("AdminGeneration")) ? "RoomManagement"
                : name;

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
        registerNavButton(navWrapper, "BadgeSensor", "ID Badge Sensor", "icon_check_in.png");
        registerNavButton(navWrapper, "Payment", "Payment", "icon_payment.png");
        registerNavButton(navWrapper, "Profile", "Profile", "icon_profile.png");

        // Req2: Room Management now sits behind its own admin login tab (AdminLoginPanel)
        // instead of opening AdminDashboard directly - anyone could click straight into
        // it before. AdminDashboard itself is still opened as its own window from there.
        registerNavButton(navWrapper, "RoomManagement", "Room Management", null);

        JPanel north = new JPanel(new BorderLayout());
        north.setBackground(Theme.BLACK);
        north.add(titlePanel, BorderLayout.NORTH);
        north.add(separator, BorderLayout.SOUTH);

        sidebarPanel.add(north, BorderLayout.NORTH);
        sidebarPanel.add(navWrapper, BorderLayout.CENTER);
        sidebarPanel.add(createLogoutPanel(), BorderLayout.SOUTH);

        return sidebarPanel;
    }
    
    private JPanel createLogoutPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Theme.BLACK);
        panel.setBorder( BorderFactory.createEmptyBorder(12, 10, 18, 10));
        SidebarButton logoutButton = new SidebarButton("Log Out", null);
        logoutButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 46));
        logoutButton.addActionListener(
                event -> confirmLogout()
        );
        panel.add(logoutButton, BorderLayout.CENTER);
        return panel;
    }

    private void confirmLogout() {
        int result = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to log out?",
                "Confirm Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (result != JOptionPane.YES_OPTION) {
            return;
        }
        // Hide rather than dispose: bookings are in-memory, so the frame (and
        // its services) must survive the logout for the next account to see
        // existing bookings. Main re-shows this same frame on the next login.
        setVisible(false);
        logoutHandler.run();
    }

    /** Shows who is logged in per scheduler.service.AuthenticationService - no more switching between demo accounts. */
    private JPanel createCurrentUserLabel() {
        JPanel wrap = new JPanel(new BorderLayout(0, 4));
        wrap.setOpaque(false);
        wrap.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel label = new JLabel("Signed in as");
        label.setForeground(Theme.GRAY);
        label.setFont(Theme.bodyFont(11));

        userLabel = new JLabel();
        userLabel.setForeground(Theme.WHITE);
        userLabel.setFont(Theme.bodyFont(12));
        
        updateCurrentUserLabel();

        wrap.add(label, BorderLayout.NORTH);
        wrap.add(userLabel, BorderLayout.CENTER);
        
        userContext.addListener(this::updateCurrentUserLabel);

        return wrap;
    }
    
    private void updateCurrentUserLabel() {
        if (userLabel == null) {
            return;
        }
        RegisteredUser user = userContext.getCurrentUser();
        if (user == null) {
            userLabel.setText("No user signed in");
            return;
        }

        userLabel.setText(
                "<html>"
                        + escapeHtml(user.getFullName())
                        + "<br>"
                        + escapeHtml(user.getAccountType().getName())
                        + " ($"
                        + String.format(
                                "%.2f",
                                user.getHourlyRate()
                        )
                        + "/hr)"
                        + "</html>" );

        userLabel.revalidate();
        userLabel.repaint();
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
    
    private String escapeHtml(String value) {
        if (value == null) {
            return "";
        }

        return value
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}