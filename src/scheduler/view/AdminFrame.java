package scheduler.view;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;

/**
 * Dedicated window for Room Management / Generate Admin, opened directly from
 * the login screen's "Room Management" tab once an admin logs in there.
 * Administrators aren't RegisteredUsers, so this deliberately bypasses
 * MainFrame/UserContext/the regular booking app entirely, instead of making
 * an admin log in a second time as if they were a student/faculty/staff/
 * partner account.
 */
public class AdminFrame extends JFrame {

    private final CardLayout cardLayout = new CardLayout();
    private final JPanel content = new JPanel(cardLayout);

    /** onBackToSignIn re-opens the login screen (Main.java's original AuthFrame) after this window closes. */
    public AdminFrame(Runnable onBackToSignIn) {
        setTitle("YorkU Conference Room Scheduler \u2014 Room Management");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Theme.BG);

        RoomManagementPanel roomManagementPanel = new RoomManagementPanel(() -> cardLayout.show(content, "AdminGeneration"));
        AdminGenerationPanel adminGenerationPanel = new AdminGenerationPanel(() -> cardLayout.show(content, "RoomManagement"));

        content.setBackground(Theme.BG);
        content.add(roomManagementPanel, "RoomManagement");
        content.add(adminGenerationPanel, "AdminGeneration");

        add(createTopBar(onBackToSignIn), BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        cardLayout.show(content, "RoomManagement");
    }

    private JPanel createTopBar(Runnable onBackToSignIn) {
        JPanel topBar = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        topBar.setBackground(Theme.BG);
        topBar.setBorder(BorderFactory.createEmptyBorder(14, 20, 0, 20));

        RoundedButton backButton = new RoundedButton("Log Out / Back to Sign In", RoundedButton.Style.SECONDARY);
        backButton.addActionListener(event -> {
            dispose();
            if (onBackToSignIn != null) {
                onBackToSignIn.run();
            }
        });

        topBar.add(backButton);
        return topBar;
    }
}