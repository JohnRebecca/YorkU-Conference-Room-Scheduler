package scheduler.view;

import scheduler.exception.AuthenticationException;
import scheduler.model.RegisteredUser;
import scheduler.service.AuthenticationService;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.util.function.Consumer;

public final class LoginPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final AuthenticationService authenticationService;
    private final StatusPanel statusPanel;
    private final Consumer<RegisteredUser> authenticationStateHandler;

    private final JTextField emailField = new JTextField(22);

    private final JPasswordField passwordField = new JPasswordField(22);
    private final JCheckBox showPasswordCheckBox = new JCheckBox("Show password");
    private final JButton loginButton = AuthViewUtils.createPrimaryButton( "Login" );
    private final JButton logoutButton = AuthViewUtils.createSecondaryButton( "Logout" );

    private char defaultEchoCharacter;

    public LoginPanel(
            AuthenticationService authenticationService,
            StatusPanel statusPanel,
            Consumer<RegisteredUser> authenticationStateHandler
    ) {
        this.authenticationService = authenticationService;
        this.statusPanel = statusPanel;
        this.authenticationStateHandler = authenticationStateHandler;

        configurePanel();
        updateAuthenticationControls();
    }

    private void configurePanel() {
        setLayout(new BorderLayout());
        setBackground(AuthTheme.PAGE_BACKGROUND);

        defaultEchoCharacter = passwordField.getEchoChar();

        JPanel wrapper = AuthViewUtils.createPageWrapper();

        JPanel card = AuthViewUtils.createCard(
                "Login",
                "Enter your username or email and password." );

        JPanel form = AuthViewUtils.createFormPanel();
        GridBagConstraints constraints = AuthViewUtils.createConstraints();

        AuthViewUtils.addRow( form, constraints, 0, "Username / Email", emailField );
        AuthViewUtils.addRow( form, constraints, 1, "Password", passwordField );
        configureShowPasswordCheckBox();

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.weightx = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        form.add( showPasswordCheckBox, constraints );
        loginButton.addActionListener(event -> login() );
        logoutButton.addActionListener( event -> logout() );
        JPanel buttonPanel = new JPanel(
                             new FlowLayout(
                                FlowLayout.LEFT,
                                10,
                                0 ));
        buttonPanel.setOpaque(false);
        buttonPanel.add(loginButton);
        buttonPanel.add(logoutButton);

        AuthViewUtils.addButtonRow( form, constraints, 3, buttonPanel );

        card.add( form, BorderLayout.CENTER );
        wrapper.add( card, BorderLayout.NORTH );
        add( wrapper, BorderLayout.CENTER );
    }

    private void configureShowPasswordCheckBox() {
        showPasswordCheckBox.setOpaque(false);
        showPasswordCheckBox.setFont( AuthTheme.NORMAL_FONT );

        showPasswordCheckBox.addActionListener(
                event -> {
                    if (showPasswordCheckBox.isSelected()) {
                        passwordField.setEchoChar((char) 0);
                    } else {
                        passwordField.setEchoChar( defaultEchoCharacter );
                    }
                });
    }

    public void setEmail(String email) {
        emailField.setText(email);
    }

    private void login() {
        try {
            RegisteredUser user = authenticationService.authenticate(
                                  emailField.getText(),
                                   new String( passwordField.getPassword()));
            statusPanel.showMessage(
                    "Login successful.\n\n"
                            + "Welcome, "
                            + user.getFullName()
                            + ".\nAccount type: "
                            + user.getAccountType().getName()
                            + "\nHourly rate: $"
                            + String.format(
                                    "%.2f",
                                    user.getHourlyRate()
                            ));
            clearPasswordField();
            updateAuthenticationControls();

            authenticationStateHandler.accept(user);

        } catch (
                AuthenticationException exception
        ) {
            showError(
                    exception.getMessage()
            );

        } catch (RuntimeException exception) {
            showError(
                    "Login failed: "
                            + exception.getMessage()
            );
        }
    }

    private void logout() {
        authenticationService.logout();
        statusPanel.showMessage( "The current user has logged out." );

        clearPasswordField();
        updateAuthenticationControls();

        authenticationStateHandler.accept(null);
    }

    private void updateAuthenticationControls() {
        boolean loggedIn = authenticationService.isLoggedIn();
        loginButton.setEnabled(!loggedIn);
        logoutButton.setEnabled(loggedIn);
        emailField.setEnabled(!loggedIn);
        passwordField.setEnabled(!loggedIn);
        showPasswordCheckBox.setEnabled(!loggedIn);
    }

    private void clearPasswordField() {
        passwordField.setText("");
        showPasswordCheckBox.setSelected(false);

        passwordField.setEchoChar( defaultEchoCharacter );
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog( this, message, "Authentication Error", JOptionPane.ERROR_MESSAGE );
    }
}