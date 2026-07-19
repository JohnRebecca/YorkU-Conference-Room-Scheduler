package scheduler.view;

import scheduler.exception.ProfileException;
import scheduler.model.RegisteredUser;
import scheduler.service.ProfileService;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public final class ProfilePanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MMM d, yyyy 'at' h:mm a");
    private final ProfileService profileService;
    private final UserContext userContext;

    // Editable profile field
    private final JTextField fullNameField = new JTextField(24);

    // Read-only account fields
    private final JTextField emailField = createReadOnlyField();

    private final JTextField accountTypeField = createReadOnlyField();

    private final JTextField hourlyRateField = createReadOnlyField();

    private final JTextField identificationField = createReadOnlyField();

    private final JTextField verificationField = createReadOnlyField();

    private final JTextField accountStatusField = createReadOnlyField();

    private final JTextField createdAtField = createReadOnlyField();

    // Password change fields
    private final JPasswordField currentPasswordField = new JPasswordField(24);

    private final JPasswordField newPasswordField = new JPasswordField(24);

    private final JPasswordField confirmPasswordField = new JPasswordField(24);

    private final JCheckBox showPasswordsCheckBox = new JCheckBox("Show passwords");

    private final JLabel statusLabel = new JLabel(" ");

    private char defaultPasswordEchoCharacter;

    public ProfilePanel( ProfileService profileService, UserContext userContext ) {
        this.profileService = Objects.requireNonNull( profileService, "Profile service is required." );
        this.userContext = Objects.requireNonNull( userContext, "User context is required." );
        configurePanel();
        loadUserInformation();

        userContext.addListener(this::loadUserInformation);
    }

    private void configurePanel() {
        setLayout(new BorderLayout());
        setBackground(Theme.BG);
        defaultPasswordEchoCharacter = currentPasswordField.getEchoChar();

        add(createHeader(), BorderLayout.NORTH);
        add(createScrollableContent(), BorderLayout.CENTER);
    }

    private JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout( new BoxLayout(header, BoxLayout.Y_AXIS));

        header.setBackground(Theme.BG);
        header.setBorder( new EmptyBorder(30, 36, 10, 36));
        JLabel title = new JLabel("Profile");
        title.setFont(Theme.titleFont(30));
        title.setForeground(Theme.TEXT_DARK);
        title.setAlignmentX(LEFT_ALIGNMENT);

        JLabel subtitle = new JLabel( "View your account information and update " + "your name or password.");

        subtitle.setFont(Theme.bodyFont(14));
        subtitle.setForeground(Theme.TEXT_BODY);
        subtitle.setAlignmentX(LEFT_ALIGNMENT);

        header.add(title);
        header.add(Box.createVerticalStrut(6));
        header.add(subtitle);

        return header;
    }

    private JScrollPane createScrollableContent() {
        JPanel contentColumn = new JPanel();
        contentColumn.setLayout(new BoxLayout(contentColumn, BoxLayout.Y_AXIS));
        contentColumn.setBackground(Theme.BG);

        contentColumn.setBorder(new EmptyBorder(16, 0, 36, 0));
        contentColumn.setMaximumSize(new Dimension(780, Integer.MAX_VALUE));
        JPanel personalInformationCard = createPersonalInformationCard();
        JPanel accountInformationCard = createAccountInformationCard();
        JPanel passwordCard = createPasswordCard();
        JPanel actionPanel = createActionPanel();

        personalInformationCard.setAlignmentX( CENTER_ALIGNMENT );
        accountInformationCard.setAlignmentX( CENTER_ALIGNMENT );
        passwordCard.setAlignmentX( CENTER_ALIGNMENT );
        actionPanel.setAlignmentX( CENTER_ALIGNMENT );
        contentColumn.add(personalInformationCard);
        contentColumn.add(Box.createVerticalStrut(18));
        contentColumn.add(accountInformationCard);
        contentColumn.add(Box.createVerticalStrut(18));
        contentColumn.add(passwordCard);
        contentColumn.add(Box.createVerticalStrut(16));
        contentColumn.add(actionPanel);

        JPanel outerPanel = new JPanel(new GridBagLayout());
        outerPanel.setBackground(Theme.BG);
        GridBagConstraints outerConstraints = new GridBagConstraints();
        outerConstraints.gridx = 0;
        outerConstraints.gridy = 0;
        outerConstraints.weightx = 1;
        outerConstraints.weighty = 1;
        outerConstraints.anchor = GridBagConstraints.NORTH;
        outerConstraints.fill = GridBagConstraints.NONE;
        outerConstraints.insets = new Insets(0, 28, 0, 28);

        outerPanel.add( contentColumn, outerConstraints);
        JScrollPane scrollPane = new JScrollPane(outerPanel);

        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(18);
        scrollPane.getViewport().setBackground(Theme.BG);
        return scrollPane;
    }

    private JPanel createPersonalInformationCard() {
        JPanel card = createCard("Personal Information", "Your full name can be updated.");
        JPanel form = createFormPanel();

        GridBagConstraints constraints = createConstraints();

        addFormRow( form, constraints, 0, "Full name", fullNameField );

        JLabel helpLabel = new JLabel( "This name is displayed throughout the application." );

        helpLabel.setFont(Theme.bodyFont(12));
        helpLabel.setForeground(Theme.GRAY);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        form.add(helpLabel, constraints);
        card.add(form, BorderLayout.CENTER);

        return card;
    }

    private JPanel createAccountInformationCard() {
        JPanel card = createCard( "Account Information", "These details are read-only because they are tied to account verification and booking rates." );
        JPanel form = createFormPanel();

        GridBagConstraints constraints = createConstraints();

        addFormRow( form, constraints, 0, "Email", emailField );
        addFormRow( form, constraints, 1, "Account type", accountTypeField );
        addFormRow( form, constraints, 2, "Hourly rate", hourlyRateField );
        addFormRow( form, constraints, 3, "Identification number", identificationField );
        addFormRow( form, constraints, 4, "Verification", verificationField );
        addFormRow( form, constraints, 5, "Account status", accountStatusField );
        addFormRow( form, constraints, 6, "Account created", createdAtField );
        card.add(form, BorderLayout.CENTER);

        return card;
    }

    private JPanel createPasswordCard() {
        JPanel card = createCard(
                "Change Password",
                "Leave these fields blank when you only want "
                        + "to update your full name."
        );

        JPanel form = createFormPanel();
        GridBagConstraints constraints = createConstraints();

        addFormRow( form, constraints, 0, "Current password", currentPasswordField );
        addFormRow( form, constraints, 1, "New password", newPasswordField );
        addFormRow( form, constraints, 2, "Confirm password", confirmPasswordField );
        configureShowPasswordsCheckBox();

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        form.add(showPasswordsCheckBox, constraints);
        JLabel passwordHelp = new JLabel(
                        "<html>"
                        + "The new password must contain at least "
                        + "8 characters, including uppercase, "
                        + "lowercase, a number, and a special character."
                        + "</html>" );

        passwordHelp.setFont(Theme.bodyFont(12));
        passwordHelp.setForeground(Theme.GRAY);

        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        form.add(passwordHelp, constraints);

        card.add(form, BorderLayout.CENTER);

        return card;
    }

    private JPanel createActionPanel() {
        JPanel outer = new JPanel(new BorderLayout());
        outer.setOpaque(false);
        outer.setMaximumSize(new Dimension(760, 75));
        outer.setPreferredSize(new Dimension(760, 75));
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0 ));
        buttons.setOpaque(false);
        JButton saveButton = createPrimaryButton("Save Changes");

        JButton resetButton = createSecondaryButton("Reset");
        saveButton.addActionListener(
                event -> saveChanges()
        );

        resetButton.addActionListener(
                event -> resetForm()
        );

        buttons.add(saveButton);
        buttons.add(resetButton);

        statusLabel.setFont(Theme.bodyFont(13));
        statusLabel.setForeground(Theme.TEXT_BODY);
        statusLabel.setHorizontalAlignment( SwingConstants.LEFT );
        outer.add(buttons, BorderLayout.NORTH);
        outer.add(statusLabel, BorderLayout.SOUTH);
        return outer;
    }

    private JPanel createCard( String titleText, String descriptionText ) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Theme.WHITE);

        card.setMaximumSize(new Dimension(760, Integer.MAX_VALUE));
        card.setAlignmentX(CENTER_ALIGNMENT);
        card.setBorder( BorderFactory.createCompoundBorder(
                        new LineBorder(
                                Theme.GRAY_BORDER,
                                1,
                                true ),
                        new EmptyBorder(
                                22,
                                24,
                                26,
                                24
                        )));

        JPanel heading = new JPanel();
        heading.setOpaque(false);
        heading.setLayout(new BoxLayout(heading, BoxLayout.Y_AXIS));
        JLabel title = new JLabel(titleText);
        title.setFont(Theme.titleFont(20));
        title.setForeground(Theme.TEXT_DARK);
        title.setAlignmentX(LEFT_ALIGNMENT);

        JLabel description = new JLabel(descriptionText);

        description.setFont(Theme.bodyFont(13));
        description.setForeground(Theme.TEXT_BODY);
        description.setAlignmentX(LEFT_ALIGNMENT);

        heading.add(title);
        heading.add(Box.createVerticalStrut(5));
        heading.add(description);

        card.add(heading, BorderLayout.NORTH);

        return card;
    }

    private JPanel createFormPanel() {
        JPanel form = new JPanel(new GridBagLayout());
        form.setOpaque(false);
        form.setBorder( new EmptyBorder(18, 0, 0, 0));
        form.setMaximumSize(new Dimension(700, Integer.MAX_VALUE));
        return form;
    }

    private GridBagConstraints createConstraints() {
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(7, 7, 7, 7);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        return constraints;
    }

    private void addFormRow(
            JPanel form,
            GridBagConstraints constraints,
            int row,
            String labelText,
            JTextField field
    ) {
    	JLabel label = new JLabel(labelText);
        label.setFont(Theme.boldFont(13));
        label.setForeground(Theme.TEXT_DARK);

        constraints.gridx = 0;
        constraints.gridy = row;
        constraints.weightx = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;

        form.add(label, constraints);

        styleTextField(field);

        constraints.gridx = 1;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        form.add(field, constraints);
    }

    private void styleTextField(JTextField field) {
        field.setFont(Theme.bodyFont(14));

        field.setPreferredSize( new Dimension(390, 38));

        field.setBorder(BorderFactory.createCompoundBorder(
                        new LineBorder(
                                Theme.GRAY_BORDER,
                                1,
                                true),
                        new EmptyBorder(
                                7,
                                10,
                                7,
                                10
                        )));
    }

    private static JTextField createReadOnlyField() {
        JTextField field = new JTextField(24);
        field.setEditable(false);
        field.setFocusable(false);

        field.setBackground(new java.awt.Color(247, 247, 247));

        field.setForeground(Theme.TEXT_BODY);

        return field;
    }

    private void configureShowPasswordsCheckBox() {
        showPasswordsCheckBox.setOpaque(false);
        showPasswordsCheckBox.setFont(Theme.bodyFont(13));
        showPasswordsCheckBox.addActionListener(
                event -> {
                    char echoCharacter = showPasswordsCheckBox.isSelected() ? (char) 0 : defaultPasswordEchoCharacter;
                    currentPasswordField.setEchoChar( echoCharacter );
                    newPasswordField.setEchoChar( echoCharacter );
                    confirmPasswordField.setEchoChar( echoCharacter );
                }
        );
    }

    private JButton createPrimaryButton( String text ) {
        JButton button = new JButton(text);
        button.setBackground(Theme.RED);
        button.setForeground(Theme.WHITE);
        button.setFont(Theme.boldFont(14));

        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);

        button.setPreferredSize( new Dimension(155, 42));

        return button;
    }

    private JButton createSecondaryButton( String text ) {
        JButton button = new JButton(text);
        button.setBackground(Theme.WHITE);
        button.setForeground(Theme.TEXT_DARK);
        button.setFont(Theme.boldFont(14));

        button.setFocusPainted(false);

        button.setBorder( new LineBorder(
                        Theme.GRAY_BORDER,
                        1,
                        true
                ));
        button.setPreferredSize(new Dimension(110, 42));
        return button;
    }

    private void loadUserInformation() {
        RegisteredUser user = userContext.getCurrentUser();

        if (user == null) {
            clearDisplayedInformation();
            statusLabel.setText("No user is currently signed in.");
            statusLabel.setForeground(Theme.RED_DARK);
            return;
        }

        fullNameField.setText( user.getFullName());

        emailField.setText(user.getEmail());
        accountTypeField.setText(user.getAccountType().getName());
        hourlyRateField.setText(String.format("$%.2f per hour", user.getHourlyRate()));
        identificationField.setText(user.getIdentificationNumber());
        verificationField.setText(user.isVerified() ? "Verified" : "Not verified");
        accountStatusField.setText( formatEnumValue( user.getAccountStatus().name()));
        createdAtField.setText( user.getCreatedAt().format(DATE_FORMAT));

        statusLabel.setText(" ");
        statusLabel.setForeground(Theme.TEXT_BODY);
    }

    private void saveChanges() {
        RegisteredUser currentUser = userContext.getCurrentUser();

        if (currentUser == null) {
            showError( "No user is currently signed in.");
            return;
        }

        String currentPassword = new String(currentPasswordField.getPassword());
        String newPassword = new String(newPasswordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        try {
            RegisteredUser updatedUser = profileService.updateProfile(
                            currentUser,
                            fullNameField.getText(),
                            currentPassword,
                            newPassword,
                            confirmPassword
                    );

            /*
             * This notifies MainFrame and other interested panels
             * that the active user's information has changed.
             */
            userContext.setCurrentUser(updatedUser);

            clearPasswordFields();

            statusLabel.setText("Profile updated successfully.");
            statusLabel.setForeground(new java.awt.Color(25, 120, 55));

            JOptionPane.showMessageDialog(
                    this,
                    "Your profile was updated successfully.",
                    "Profile Updated",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (ProfileException exception) {
            showError(exception.getMessage());

        } catch (RuntimeException exception) {
            showError("The profile could not be updated: " + exception.getMessage());
        }
    }

    private void resetForm() {
        loadUserInformation();
        clearPasswordFields();
        statusLabel.setText("Unsaved changes were reset.");
        statusLabel.setForeground( Theme.TEXT_BODY );
    }

    private void clearPasswordFields() {
        currentPasswordField.setText("");
        newPasswordField.setText("");
        confirmPasswordField.setText("");
        showPasswordsCheckBox.setSelected(false);
        currentPasswordField.setEchoChar(defaultPasswordEchoCharacter); 
        newPasswordField.setEchoChar(defaultPasswordEchoCharacter);
        confirmPasswordField.setEchoChar(defaultPasswordEchoCharacter);
    }

    private void clearDisplayedInformation() {
        fullNameField.setText("");
        emailField.setText("");
        accountTypeField.setText("");
        hourlyRateField.setText("");
        identificationField.setText("");
        verificationField.setText("");
        accountStatusField.setText("");
        createdAtField.setText("");

        clearPasswordFields();
    }

    private String formatEnumValue(String value) {
        if (value == null || value.isBlank()) {
            return "";
        }

        String formatted = value.toLowerCase().replace('_', ' ');

        return Character.toUpperCase(formatted.charAt(0)) + formatted.substring(1);
    }

    private void showError(String message) {
        statusLabel.setText(message);
        statusLabel.setForeground(Theme.RED_DARK);

        JOptionPane.showMessageDialog(
                this,
                message,
                "Profile Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
}