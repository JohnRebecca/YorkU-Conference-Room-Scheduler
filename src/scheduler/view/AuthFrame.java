package scheduler.view;

import scheduler.model.AccountType;
import scheduler.service.AccountRegistrationService;
import scheduler.service.AuthenticationService;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.function.Consumer;
import scheduler.model.RegisteredUser;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

public final class AuthFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private final JTabbedPane tabbedPane = new JTabbedPane();

    private final StatusPanel statusPanel = new StatusPanel();

    private final RegisterPanel registerPanel;
    private final LoginPanel loginPanel;
    private final AccountTypePanel accountTypePanel;
    private final JLabel currentUserLabel = new JLabel("Guest");
    private final Consumer<RegisteredUser> onLoginSuccess;

    public AuthFrame(
            AccountRegistrationService registrationService,
            AuthenticationService authenticationService,
            Consumer<RegisteredUser> onLoginSuccess
    ) {
        super("YorkU Conference Room Scheduler");
        this.onLoginSuccess = onLoginSuccess;

        loginPanel = new LoginPanel( authenticationService, statusPanel, this::handleAuthenticationChanged );
        registerPanel = new RegisterPanel( registrationService, statusPanel,loginPanel::setEmail);

        accountTypePanel = new AccountTypePanel( registrationService, statusPanel, this::handleAccountTypeCreated );

        configureFrame();
    }

    private void configureFrame() {
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );

        setMinimumSize( new Dimension(1100, 720));

        setSize( new Dimension(1200, 780));

        setLayout(new BorderLayout());

        AuthSidebar sidebar = new AuthSidebar(tabbedPane::setSelectedIndex);

        add(sidebar, BorderLayout.WEST);
        add(createMainContent(), BorderLayout.CENTER);

        setLocationRelativeTo(null);
    }

    private JPanel createMainContent() {
        JPanel content = new JPanel(new BorderLayout());

        content.setBackground( AuthTheme.PAGE_BACKGROUND);

        content.setBorder( new EmptyBorder(28, 36, 28, 36));

        content.add( createHeading(), BorderLayout.NORTH );

        tabbedPane.setFont( AuthTheme.LABEL_FONT );
        tabbedPane.addTab( "Register", AuthViewUtils.createScrollable( registerPanel ));
        tabbedPane.addTab( "Login", AuthViewUtils.createScrollable(loginPanel));
        tabbedPane.addTab( "Add Account Type", AuthViewUtils.createScrollable(accountTypePanel));
        tabbedPane.setSelectedIndex(1);

        JPanel center = new JPanel(new BorderLayout());
        center.setOpaque(false);
        center.setBorder( new EmptyBorder(24, 0, 18, 0));
        center.add( tabbedPane, BorderLayout.CENTER );
        content.add( center, BorderLayout.CENTER );
        content.add( statusPanel, BorderLayout.SOUTH);

        return content;
    }

    private JPanel createHeading() {
        JPanel headingPanel = new JPanel(new BorderLayout());
        headingPanel.setOpaque(false);

        JPanel titlePanel = new JPanel();
        titlePanel.setOpaque(false);
        titlePanel.setLayout(new BoxLayout( titlePanel, BoxLayout.Y_AXIS ));
        JLabel title = new JLabel( "Account & Authentication" );
        title.setFont( AuthTheme.PAGE_TITLE_FONT );
        JLabel subtitle = new JLabel( "Create accounts, log in, " + "and manage account types." );

        subtitle.setFont( AuthTheme.NORMAL_FONT);
        subtitle.setForeground( AuthTheme.MUTED_TEXT);

        titlePanel.add(title);
        titlePanel.add( Box.createVerticalStrut(5));
        titlePanel.add(subtitle);
        configureCurrentUserLabel();
        headingPanel.add( titlePanel, BorderLayout.WEST );
        headingPanel.add( currentUserLabel, BorderLayout.EAST );

        return headingPanel;
    }
    
    private void configureCurrentUserLabel() {
        currentUserLabel.setFont( AuthTheme.LABEL_FONT );

        currentUserLabel.setForeground( AuthTheme.MUTED_TEXT );

        currentUserLabel.setBorder(
                BorderFactory.createCompoundBorder(
                        new LineBorder(
                                AuthTheme.BORDER_COLOR,
                                1,
                                true
                        ),
                        new EmptyBorder(
                                10,
                                16,
                                10,
                                16
                        )
                )
        );
    }
    
    private void handleAuthenticationChanged( RegisteredUser user ) {
        if (user == null) {
            currentUserLabel.setText("Guest");
            currentUserLabel.setForeground( AuthTheme.MUTED_TEXT );
        } else {
            currentUserLabel.setText(
                    "Logged in: " + user.getFullName()
            );
            currentUserLabel.setForeground( AuthTheme.YORK_RED);
            onLoginSuccess.accept(user);
        }
    }

    private void handleAccountTypeCreated( AccountType accountType ) {
        registerPanel.reloadAccountTypes();
        registerPanel.selectAccountTypeById( accountType.getAccountTypeId());
        tabbedPane.setSelectedIndex(0);
    }
}