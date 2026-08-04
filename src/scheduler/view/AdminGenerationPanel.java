package scheduler.view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import scheduler.model.Administrator;
import scheduler.service.RoomManagementFacade;

public class AdminGenerationPanel extends JPanel {
    private final RoomManagementFacade facade;
    private final InlineMessagePanel messagePanel;

    private final JTextField adminIDField;
    private final JTextField adminNameField;
    private final JTextField adminEmailField;
    private final JTextField adminPasswordField;

    public AdminGenerationPanel() {
        this(null);
    }

    /** onBackToRoomsRequested may be null (e.g. no navigation available) - the link is simply omitted. */
    public AdminGenerationPanel(Runnable onBackToRoomsRequested) {
        facade = new RoomManagementFacade();

        setLayout(new BorderLayout(20, 20));
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(28, 30, 28, 30));

        adminIDField = new JTextField();
        adminNameField = new JTextField();
        adminEmailField = new JTextField();
        adminPasswordField = new JTextField();

        messagePanel = new InlineMessagePanel();

        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.setOpaque(false);

        JLabel title = new JLabel("Generate Admin");
        title.setFont(Theme.titleFont(32));
        title.setForeground(Theme.TEXT_DARK);

        JLabel subtitle = new JLabel("(Chief Event Coordinator) Generate a new administrator account for the system.");
        subtitle.setFont(Theme.bodyFont(15));
        subtitle.setForeground(Theme.TEXT_BODY);

        header.add(title);
        header.add(Box.createVerticalStrut(4));
        header.add(subtitle);

        if (onBackToRoomsRequested != null) {
            header.add(Box.createVerticalStrut(10));

            RoundedButton backLink = new RoundedButton("\u2190 Back to Room Management", RoundedButton.Style.SECONDARY);
            backLink.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            backLink.addActionListener(event -> onBackToRoomsRequested.run());

            JPanel linkWrap = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
            linkWrap.setOpaque(false);
            linkWrap.add(backLink);
            header.add(linkWrap);
        }

        header.add(Box.createVerticalStrut(10));
        header.add(messagePanel);

        add(header, BorderLayout.NORTH);
        add(createBody(), BorderLayout.CENTER);
    }

    private JComponent createBody() {
        CardPanel card = new CardPanel(new BorderLayout(16, 16));
        card.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));
        card.add(sectionTitle("Administrator Account"), BorderLayout.NORTH);
        card.add(createForm(), BorderLayout.CENTER);
        return card;
    }

    private JPanel createForm() {
        JPanel form = new JPanel(new GridBagLayout());
        form.setOpaque(false);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(6, 0, 6, 12);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;

        int row = 0;
        addFieldRow(form, constraints, row++, "Admin ID", adminIDField);
        addFieldRow(form, constraints, row++, "Name", adminNameField);
        addFieldRow(form, constraints, row++, "Email", adminEmailField);
        addFieldRow(form, constraints, row++, "Password", adminPasswordField);

        RoundedButton generateButton = new RoundedButton("Generate Admin", RoundedButton.Style.PRIMARY);
        generateButton.addActionListener(event -> generateAdmin());

        constraints.gridx = 0;
        constraints.gridy = row;
        constraints.gridwidth = 2;
        form.add(generateButton, constraints);

        return form;
    }

    private void addFieldRow(JPanel form, GridBagConstraints constraints, int row, String labelText, JTextField field) {
        JLabel label = new JLabel(labelText);
        label.setFont(Theme.boldFont(13));
        label.setForeground(Theme.TEXT_DARK);

        field.setFont(Theme.bodyFont(13));
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.GRAY_BORDER),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));

        constraints.gridwidth = 1;
        constraints.gridy = row;
        constraints.gridx = 0;
        constraints.weightx = 0.25;
        form.add(label, constraints);

        constraints.gridx = 1;
        constraints.weightx = 0.75;
        form.add(field, constraints);
    }

    private JLabel sectionTitle(String text) {
        JLabel title = new JLabel(text);
        title.setFont(Theme.boldFont(18));
        title.setForeground(Theme.TEXT_DARK);
        return title;
    }

    private void generateAdmin() {
        try {
            Administrator administrator = new Administrator(
                    Integer.parseInt(adminIDField.getText().trim()),
                    adminNameField.getText().trim(),
                    adminEmailField.getText().trim(),
                    adminPasswordField.getText().trim()
            );

            facade.generateAdministrator(administrator);
            messagePanel.showSuccess("Administrator created successfully.");
        } catch (NumberFormatException exception) {
            messagePanel.showError("Admin ID must be a valid number.");
        } catch (RuntimeException exception) {
            messagePanel.showError("Unable to create administrator: " + exception.getMessage());
        }
    }
}