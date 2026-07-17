package scheduler.view;

import scheduler.exception.AccountException;
import scheduler.model.AccountType;
import scheduler.model.VerificationMode;
import scheduler.service.AccountRegistrationService;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.util.function.Consumer;

public final class AccountTypePanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final AccountRegistrationService registrationService;
    private final StatusPanel statusPanel;
    private final Consumer<AccountType> accountTypeCreatedHandler;

    private final JTextField typeIdField = new JTextField(22);
    private final JTextField typeNameField = new JTextField(22);
    private final JTextField hourlyRateField = new JTextField(22);

    private final JComboBox<VerificationMode> verificationModeBox = new JComboBox<>(VerificationMode.values());

    public AccountTypePanel(
            AccountRegistrationService registrationService,
            StatusPanel statusPanel,
            Consumer<AccountType> accountTypeCreatedHandler
    ) {
        this.registrationService = registrationService;
        this.statusPanel = statusPanel;
        this.accountTypeCreatedHandler = accountTypeCreatedHandler;

        configurePanel();
    }

    private void configurePanel() {
        setLayout(new BorderLayout());
        setBackground(AuthTheme.PAGE_BACKGROUND);

        JPanel wrapper = AuthViewUtils.createPageWrapper();

        JPanel card = AuthViewUtils.createCard(
                "Add a New Account Type",
                "Create another account category without "
                        + "changing the Java source code."
        );

        JPanel form =  AuthViewUtils.createFormPanel();

        GridBagConstraints constraints = AuthViewUtils.createConstraints();

        AuthViewUtils.addRow( form, constraints, 0, "Account type ID", typeIdField );
        AuthViewUtils.addRow( form, constraints, 1,"Display name", typeNameField );
        AuthViewUtils.addRow( form, constraints, 2, "Hourly rate", hourlyRateField);
        AuthViewUtils.addRow( form, constraints, 3, "Verification mode", verificationModeBox);

        JLabel helpText = new JLabel(
                "<html>"
                        + "UNIVERSITY requires a York email "
                        + "and student or employee ID.<br><br>"
                        + "PARTNER requires an organization ID "
                        + "beginning with ORG-.<br><br>"
                        + "NONE does not require additional "
                        + "affiliation verification."
                        + "</html>"
        );

        helpText.setForeground( AuthTheme.MUTED_TEXT );

        helpText.setFont( AuthTheme.NORMAL_FONT );

        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        form.add(helpText, constraints);

        javax.swing.JButton addButton = AuthViewUtils.createPrimaryButton( "Add Account Type");

        addButton.addActionListener( event -> addAccountType());

        AuthViewUtils.addButtonRow( form, constraints, 5, addButton );
        card.add(form, BorderLayout.CENTER);
        wrapper.add(card, BorderLayout.NORTH);

        add(wrapper, BorderLayout.CENTER);
    }

    private void addAccountType() {
        double hourlyRate;

        try {
            hourlyRate = Double.parseDouble( hourlyRateField.getText().trim() );

        } catch (NumberFormatException exception) {
            showError( "Hourly rate must be a valid number.");
            return;
        }

        try {
            VerificationMode mode = (VerificationMode)verificationModeBox.getSelectedItem();

            AccountType accountType = registrationService.createAccountType(
                            typeIdField.getText(),
                            typeNameField.getText(),
                            hourlyRate,
                            mode
                    );

            statusPanel.showMessage(
                    "Account type created successfully.\n\n"
                            + "ID: "
                            + accountType.getAccountTypeId()
                            + "\nName: "
                            + accountType.getName()
                            + "\nHourly rate: $"
                            + String.format(
                                    "%.2f",
                                    accountType.getHourlyRate()
                            )
                            + "\nVerification: "
                            + accountType
                                    .getVerificationMode()
                            + "\n\nThe new type is now "
                            + "available on the Register page."
            );

            clearForm();

            accountTypeCreatedHandler.accept( accountType );

        } catch (AccountException exception) {
            showError(exception.getMessage());

        } catch (RuntimeException exception) {
            showError( "The account type could not be created: " + exception.getMessage());
        }
    }

    private void clearForm() {
        typeIdField.setText("");
        typeNameField.setText("");
        hourlyRateField.setText("");

        verificationModeBox.setSelectedItem( VerificationMode.NONE );
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog( this, message, "Account Type Error", JOptionPane.ERROR_MESSAGE );
    }
}