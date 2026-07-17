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
import scheduler.view.MainFrame;

public final class Main {

    private Main() {
       
    }

    public static void main(String[] args) {

        
        DatabaseManager.initializeDatabase();

        UserRepository userRepository = new SqliteUserRepository();
        AccountTypeRepository accountTypeRepository = new SqliteAccountTypeRepository();

        VerificationService verificationService = new VerificationService();
        AccountFactory accountFactory = new RegisteredUserFactory();

        AccountRegistrationService registrationService = new AccountRegistrationService(
                userRepository,
                accountTypeRepository,
                verificationService,
                accountFactory
        );

        AuthenticationService authenticationService = new AuthenticationService(userRepository);

        SwingUtilities.invokeLater(() -> {
            setLookAndFeel();

            // AuthFrame handles registration/login/account types. Once someone logs
            // in successfully, it hands the authenticated RegisteredUser back here,
            // and this is the one place that decides what happens next: close the
            // auth window and open the booking management screens (Req3, Req8, Req9).
            AuthFrame[] authFrameHolder = new AuthFrame[1];
            authFrameHolder[0] = new AuthFrame(
                    registrationService,
                    authenticationService,
                    user -> {
                        authFrameHolder[0].dispose();
                        MainFrame mainFrame = new MainFrame(user);
                        mainFrame.setVisible(true);
                    }
            );
            authFrameHolder[0].setVisible(true);
        });
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
          
        }
    }
}
