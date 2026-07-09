package scheduler.view;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * A dismissible, non-modal status banner used in place of JOptionPane popups.
 * Hidden by default; call showError/showSuccess/showInfo to display a message,
 * or clear() to hide it again. Safe to place inline in any layout - it takes
 * up no space while hidden.
 */
public class InlineMessagePanel extends JPanel {

    public enum Type { ERROR, SUCCESS, INFO }

    private final JLabel textLabel;

    public InlineMessagePanel() {
        super(new BorderLayout(10, 0));
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14));

        textLabel = new JLabel();
        textLabel.setFont(Theme.bodyFont(13));

        JButton closeButton = new JButton("\u2715");
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setFocusPainted(false);
        closeButton.setFont(Theme.bodyFont(12));
        closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        closeButton.addActionListener(e -> clear());

        add(textLabel, BorderLayout.CENTER);
        add(closeButton, BorderLayout.EAST);

        clear();
    }

    public void showError(String message) {
        show(message, Type.ERROR);
    }

    public void showSuccess(String message) {
        show(message, Type.SUCCESS);
    }

    public void showInfo(String message) {
        show(message, Type.INFO);
    }

    public void show(String message, Type type) {
        textLabel.setText("<html><body style='width: 100%'>" + escapeHtml(message) + "</body></html>");

        Color bg;
        Color fg;

        switch (type) {
            case SUCCESS:
                bg = new Color(230, 247, 235);
                fg = new Color(30, 120, 60);
                break;
            case INFO:
                bg = Theme.GRAY_LIGHT;
                fg = Theme.TEXT_DARK;
                break;
            case ERROR:
            default:
                bg = new Color(255, 231, 231);
                fg = Theme.RED_DARK;
                break;
        }

        setBackground(bg);
        textLabel.setForeground(fg);
        setOpaque(true);
        setVisible(true);
        revalidate();
        repaint();
    }

    public void clear() {
        setVisible(false);
        setOpaque(false);
        textLabel.setText("");
        revalidate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (isOpaque()) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 10, 10));
            g2.dispose();
        }
        super.paintComponent(g);
    }

    private String escapeHtml(String s) {
        if (s == null) {
            return "";
        }
        return s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }
}
