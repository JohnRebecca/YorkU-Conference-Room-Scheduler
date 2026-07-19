package scheduler.view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

public final class StatusPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final JTextArea outputArea = new JTextArea(7, 50);

    public StatusPanel() {
        setLayout(new BorderLayout());
        setOpaque(false);

        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setFont(AuthTheme.NORMAL_FONT);
        outputArea.setBackground( AuthTheme.PANEL_BACKGROUND);

        outputArea.setBorder( new EmptyBorder(12, 12, 12, 12));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setPreferredSize( new Dimension(0, 155));

        scrollPane.setBorder( BorderFactory.createTitledBorder(
                              new LineBorder( AuthTheme.BORDER_COLOR ),
                              "Status" ));
        add(scrollPane, BorderLayout.CENTER);
    }

    public void showMessage(String message) {
        outputArea.setText(message);
        outputArea.setCaretPosition(0);
    }

    public void clear() {
        outputArea.setText("");
    }
}