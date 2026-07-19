package scheduler;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import scheduler.database.DatabaseManager;
import scheduler.factory.AccountFactory;
import scheduler.factory.RegisteredUserFactory;
import scheduler.model.RegisteredUser;
import scheduler.repository.AccountTypeRepository;
import scheduler.repository.SqliteAccountTypeRepository;
import scheduler.repository.SqliteUserRepository;
import scheduler.repository.UserRepository;
import scheduler.service.AccountRegistrationService;
import scheduler.service.AuthenticationService;
import scheduler.service.ProfileService;
import scheduler.service.VerificationService;
import scheduler.view.AuthFrame;
import scheduler.view.MainFrame;

public final class Main {

    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {

        // Create the SQLite database and tables if they do not already exist.
        // Owned by scheduler.database (Farhad's account/authentication module).
        DatabaseManager.initializeDatabase();

        // Create repositories
        UserRepository userRepository = new SqliteUserRepository();
        AccountTypeRepository accountTypeRepository = new SqliteAccountTypeRepository();

        // Create auth-side services
        VerificationService verificationService = new VerificationService();
        AccountFactory accountFactory = new RegisteredUserFactory();

        AccountRegistrationService registrationService = new AccountRegistrationService(
                userRepository,
                accountTypeRepository,
                verificationService,
                accountFactory
        );
        
        ProfileService profileService = new ProfileService(userRepository);

        AuthenticationService authenticationService = new AuthenticationService(userRepository);

        SwingUtilities.invokeLater(() -> {
            setLookAndFeel();

            // AuthFrame handles registration/login/account types. Once someone logs
            // in successfully, it hands the authenticated RegisteredUser back here,
            // and this is the one place that decides what happens next: close the
            // auth window and open the booking management screens (Req3, Req8, Req9).
            showAuthFrame(registrationService, authenticationService, profileService );
        });
    }
    private static void showAuthFrame(
            AccountRegistrationService registrationService,
            AuthenticationService authenticationService,
            ProfileService profileService
    ) {
        AuthFrame[] authFrameHolder = new AuthFrame[1];

        authFrameHolder[0] = new AuthFrame(
                        registrationService,
                        authenticationService,
                        user -> {
                            authFrameHolder[0].dispose();
                            showMainFrame(
                                    user,
                                    registrationService,
                                    authenticationService,
                                    profileService
                            );
                        });
        authFrameHolder[0].setVisible(true);
    }

    /**
     * The one MainFrame for the whole run. Bookings live in memory inside its
     * services, so logging out hides this frame and the next login re-shows
     * it (switching the signed-in user) instead of constructing a fresh one -
     * otherwise every logout would silently erase all bookings.
     */
    private static MainFrame mainFrame;

    private static void showMainFrame(
            RegisteredUser user,
            AccountRegistrationService registrationService,
            AuthenticationService authenticationService,
            ProfileService profileService
    ) {
        if (mainFrame == null) {
            mainFrame =
                    new MainFrame(
                            user,
                            profileService,
                            () -> {
                                authenticationService.logout();
                                showAuthFrame(
                                        registrationService,
                                        authenticationService,
                                        profileService
                                );
                            });
        } else {
            mainFrame.switchUser(user);
        }
        mainFrame.setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
            // Fall back to the default look and feel.
        }
    }
}
