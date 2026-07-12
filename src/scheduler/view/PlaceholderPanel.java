package scheduler.view;

import javax.swing.*;
import java.awt.*;

public class PlaceholderPanel extends JPanel {
    public PlaceholderPanel(String title, String message) {
        setLayout(new BorderLayout());
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(28, 30, 28, 30));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(Theme.titleFont(30));
        titleLabel.setForeground(Theme.TEXT_DARK);

        CardPanel messageCard = new CardPanel(new BorderLayout());
        messageCard.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JTextArea textArea = new JTextArea(message);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(Theme.bodyFont(16));
        textArea.setForeground(Theme.TEXT_BODY);
        textArea.setBackground(Theme.WHITE);
        textArea.setOpaque(false);

        messageCard.add(textArea, BorderLayout.CENTER);

        JPanel titleWrap = new JPanel(new BorderLayout());
        titleWrap.setBackground(Theme.BG);
        titleWrap.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        titleWrap.add(titleLabel, BorderLayout.WEST);

        add(titleWrap, BorderLayout.NORTH);
        add(messageCard, BorderLayout.CENTER);
    }
}
