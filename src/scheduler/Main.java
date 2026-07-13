package scheduler;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import scheduler.database.DatabaseManager;
import scheduler.factory.AccountFactory;
import scheduler.factory.RegisteredUserFactory;
import scheduler.repository.AccountTypeRepository;
import scheduler.repository.SqliteAccountTypeRepository;
import scheduler.repository.SqliteUserRepository;
import scheduler.repository.UserRepository;
import scheduler.service.AccountRegistrationService;
import scheduler.service.AuthenticationService;
import scheduler.service.VerificationService;
import scheduler.view.AuthFrame;

public final class Main {

    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {

        // Create the SQLite database and tables if they do not already exist
        DatabaseManager.initializeDatabase();

        // Create repositories
        UserRepository userRepository = new SqliteUserRepository();
        AccountTypeRepository accountTypeRepository = new SqliteAccountTypeRepository();
        // Create services
        VerificationService verificationService = new VerificationService();
        AccountFactory accountFactory = new RegisteredUserFactory();

        AccountRegistrationService registrationService = new AccountRegistrationService(
                        userRepository,
                        accountTypeRepository,
                        verificationService,
                        accountFactory);

        AuthenticationService authenticationService = new AuthenticationService(userRepository);

        SwingUtilities.invokeLater(() -> {
            setLookAndFeel();
            AuthFrame frame = new AuthFrame( registrationService, authenticationService);
            frame.setVisible(true);

        });

    }

    private static void setLookAndFeel() {

        try {

            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );

        } catch (Exception ignored) {

            

        }

    }

}