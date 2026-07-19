package scheduler.view;

import scheduler.model.Administrator;
import scheduler.repository.AdminDAO;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

/**
 * Req2: the gate in front of Room Management. Logs in against the administrators
 * table (seeded with one Chief Event Coordinator account at first launch; more
 * admins can be created afterward from inside AdminDashboard's "Generate Admin"
 * button). On success, opens AdminDashboard as its own window.
 *
 * Password check is plaintext right now, matching how Administrator currently
 * stores it - same follow-up as flagged separately (RegisteredUser passwords go
 * through PasswordHasher; Administrator doesn't yet).
 */
public class AdminLoginPanel extends JPanel {

    private final AdminDAO adminDAO = new AdminDAO();

    private JTextField emailField;
    private JPasswordField passwordField;
    private InlineMessagePanel messagePanel;

    public AdminLoginPanel() {
        setLayout(new BorderLayout());
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));

        add(createHeader(), BorderLayout.NORTH);
        add(createFormCard(), BorderLayout.CENTER);
    }

    private JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.setBackground(Theme.BG);
        header.setBorder(BorderFactory.createEmptyBorder(0, 0, 24, 0));

        JLabel title = new JLabel("Room Management");
        title.setFont(Theme.boldFont(28));
        title.setForeground(Theme.TEXT_DARK);
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel subtitle = new JLabel("Sign in with an administrator account to add, enable, or disable rooms.");
        subtitle.setFont(Theme.bodyFont(14));
        subtitle.setForeground(Theme.TEXT_BODY);
        subtitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        messagePanel = new InlineMessagePanel();

        header.add(title);
        header.add(Box.createVerticalStrut(4));
        header.add(subtitle);
        header.add(Box.createVerticalStrut(14));
        header.add(messagePanel);

        return header;
    }

    private JPanel createFormCard() {
        CardPanel card = new CardPanel(new GridBagLayout());
        card.setMaximumSize(new Dimension(420, 260));
        card.setBorder(BorderFactory.createEmptyBorder(28, 28, 28, 28));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(6, 0, 6, 0);

        JLabel emailLabel = new JLabel("Admin Email");
        emailLabel.setFont(Theme.bodyFont(12));
        emailLabel.setForeground(Theme.TEXT_BODY);

        emailField = new JTextField();
        emailField.setFont(Theme.bodyFont(14));

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(Theme.bodyFont(12));
        passwordLabel.setForeground(Theme.TEXT_BODY);

        passwordField = new JPasswordField();
        passwordField.setFont(Theme.bodyFont(14));
        passwordField.addActionListener(e -> attemptLogin());

        RoundedButton loginButton = new RoundedButton("Log In", RoundedButton.Style.PRIMARY);
        loginButton.addActionListener(e -> attemptLogin());

        gbc.gridy = 0;
        card.add(emailLabel, gbc);
        gbc.gridy = 1;
        card.add(emailField, gbc);
        gbc.gridy = 2;
        card.add(passwordLabel, gbc);
        gbc.gridy = 3;
        card.add(passwordField, gbc);
        gbc.gridy = 4;
        gbc.insets = new Insets(18, 0, 0, 0);
        card.add(loginButton, gbc);

        JPanel wrap = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        wrap.setBackground(Theme.BG);
        wrap.add(card);
        return wrap;
    }

    private void attemptLogin() {
        String email = emailField.getText() == null ? "" : emailField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (email.isEmpty() || password.isEmpty()) {
            messagePanel.showError("Enter both an email and a password.");
            return;
        }

        Optional<Administrator> match = adminDAO.findByEmail(email);

        if (match.isEmpty() || !match.get().getPassword().equals(password)) {
            messagePanel.showError("Incorrect admin email or password.");
            return;
        }

        messagePanel.clear();
        passwordField.setText("");
        new AdminDashboard().setVisible(true);
    }
}