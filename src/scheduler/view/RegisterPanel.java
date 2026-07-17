package scheduler.view;

import scheduler.exception.AccountException;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.service.AccountRegistrationService;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.util.List;
import java.util.function.Consumer;

public final class RegisterPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final AccountRegistrationService registrationService;
    private final StatusPanel statusPanel;
    private final Consumer<String> loginEmailHandler;

    private final JTextField nameField = new JTextField(22);
    private final JTextField emailField = new JTextField(22);
    private final JPasswordField passwordField = new JPasswordField(22);
    private final JCheckBox showPasswordCheckBox = new JCheckBox("Show password");
    private final JTextField identificationField = new JTextField(22);
    private final JComboBox<AccountType> accountTypeBox = new JComboBox<>();

    private char defaultEchoCharacter;

    public RegisterPanel(
            AccountRegistrationService registrationService,
            StatusPanel statusPanel,
            Consumer<String> loginEmailHandler
    ) {
        this.registrationService = registrationService;
        this.statusPanel = statusPanel;
        this.loginEmailHandler = loginEmailHandler;

        configurePanel();
        reloadAccountTypes();
    }

    private void configurePanel() {
        setLayout(new BorderLayout());
        setBackground(AuthTheme.PAGE_BACKGROUND);

        defaultEchoCharacter = passwordField.getEchoChar();

        JPanel wrapper = AuthViewUtils.createPageWrapper();
        JPanel card = AuthViewUtils.createCard(
                        "Create an Account",
                        "Register as a student, faculty member, staff member, "
                                + "partner, or another supported account type."
                );

        JPanel form = AuthViewUtils.createFormPanel();
        GridBagConstraints constraints = AuthViewUtils.createConstraints();
        AuthViewUtils.addRow( form, constraints, 0, "Full name", nameField );
        AuthViewUtils.addRow( form, constraints, 1, "Email", emailField );
        AuthViewUtils.addRow( form, constraints, 2, "Password", passwordField );
        configureShowPasswordCheckBox();

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.weightx = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        form.add( showPasswordCheckBox, constraints );
        AuthViewUtils.addRow( form, constraints, 4, "Account type", accountTypeBox );

        AuthViewUtils.addRow( form, constraints, 5, "Student / employee / organization ID",
                identificationField );

        JLabel passwordHelp = new JLabel(
                                "<html>"
                                + "Password must contain at least 8 characters, "
                                + "including uppercase, lowercase, number, "
                                + "and special character."
                                + "</html>" );

        passwordHelp.setForeground( AuthTheme.MUTED_TEXT );
        passwordHelp.setFont( AuthTheme.NORMAL_FONT );

        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.weightx = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        form.add( passwordHelp, constraints );

        JButton registerButton = AuthViewUtils.createPrimaryButton( "Create Account" );
        registerButton.addActionListener( event -> register() );
        AuthViewUtils.addButtonRow( form, constraints, 7, registerButton );

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

    public void reloadAccountTypes() {
        String selectedId = getSelectedTypeId();
        accountTypeBox.removeAllItems();

        List<AccountType> accountTypes = registrationService.getAvailableAccountTypes();

        for (AccountType accountType : accountTypes) {
            accountTypeBox.addItem(accountType);
        }

        if (selectedId != null) {
            selectAccountTypeById(selectedId);
        }
    }

    public void selectAccountTypeById( String accountTypeId ) {
        for ( int index = 0;index < accountTypeBox.getItemCount();index++) {
            AccountType accountType = accountTypeBox.getItemAt(index);
            if ( accountType.getAccountTypeId().equals(accountTypeId) ) {
                accountTypeBox.setSelectedIndex(index);
                return;
            }
        }
    }

    private String getSelectedTypeId() {
        AccountType selected = (AccountType)accountTypeBox.getSelectedItem();
        if (selected == null) {
            return null;
        }

        return selected.getAccountTypeId();
    }

    private void register() {
        AccountType selectedType = (AccountType)accountTypeBox.getSelectedItem();
        if (selectedType == null) {
            showError( "Select an account type." );
            return;
        }

        try {
            RegisteredUser user = registrationService.createAccount(
                                  nameField.getText(),
                                  emailField.getText(),
                                  new String( passwordField.getPassword()),
                                  selectedType.getAccountTypeId(),
                                  identificationField.getText());

            statusPanel.showMessage(
                    "Account created successfully.\n\n"
                            + "User: "
                            + user.getFullName()
                            + "\nEmail: "
                            + user.getEmail()
                            + "\nType: "
                            + user.getAccountType().getName()
                            + "\nHourly rate: $"
                            + String.format( "%.2f", user.getHourlyRate())
                            + "\nStatus: "
                            + user.getAccountStatus()
            );

            loginEmailHandler.accept(
                    user.getEmail()
            );

            clearPasswordField();

        } catch (AccountException exception) {
            showError( exception.getMessage() );
        } catch (RuntimeException exception) {
            showError( "The account could not be created: " + exception.getMessage());
        }
    }

    private void clearPasswordField() {
        passwordField.setText("");
        showPasswordCheckBox.setSelected(false);
        passwordField.setEchoChar( defaultEchoCharacter );
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog( this, message, "Account Error", JOptionPane.ERROR_MESSAGE );
    }
}