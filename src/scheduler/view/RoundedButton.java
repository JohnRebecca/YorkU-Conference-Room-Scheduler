package scheduler.view;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * A flat, rounded-corner button. Supports a PRIMARY (red), SECONDARY (white / outlined)
 * and DISABLED (gray) look, mirroring the button styles in the UI design PDF.
 */
public class RoundedButton extends JButton {

    public enum Style { PRIMARY, SECONDARY, DISABLED }

    private Style style;
    private final int arc;
    private boolean hover = false;

    public RoundedButton(String text, Style style) {
        this(text, style, 10);
    }

    public RoundedButton(String text, Style style, int arc) {
        this(text, style, arc, null);
    }

    /** iconFileName is looked up under the images/ folder via IconLoader; pass null for no icon. */
    public RoundedButton(String text, Style style, int arc, String iconFileName) {
        super(text);
        this.style = style;
        this.arc = arc;

        setFont(Theme.boldFont(13));
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setOpaque(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setBorder(BorderFactory.createEmptyBorder(10, 18, 10, 18));
        setIconTextGap(8);

        if (iconFileName != null) {
            ImageIcon icon = IconLoader.load(iconFileName, 16, 16);
            if (icon != null) {
                setIcon(icon);
            }
        }

        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover = true;
                repaint();
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover = false;
                repaint();
            }
        });

        applyStyle();
    }

    public void setStyle(Style style) {
        this.style = style;
        applyStyle();
        repaint();
    }

    private void applyStyle() {
        switch (style) {
            case PRIMARY:
                setForeground(Theme.WHITE);
                setEnabled(true);
                break;
            case SECONDARY:
                setForeground(Theme.TEXT_DARK);
                setEnabled(true);
                break;
            case DISABLED:
                setForeground(Theme.WHITE);
                setEnabled(false);
                break;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Color fill;
        if (!isEnabled() || style == Style.DISABLED) {
            fill = Theme.GRAY;
        } else if (style == Style.PRIMARY) {
            fill = hover ? Theme.RED_DARK : Theme.RED;
        } else {
            fill = hover ? Theme.GRAY_LIGHT : Theme.WHITE;
        }

        g2.setColor(fill);
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arc, arc));

        if (style == Style.SECONDARY) {
            g2.setColor(Theme.GRAY_BORDER);
            g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arc, arc));
        }

        g2.dispose();
        super.paintComponent(g);
    }
}
