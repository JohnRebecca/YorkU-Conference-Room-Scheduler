package scheduler.view;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * A sidebar navigation button styled after the UI design PDF:
 * transparent/black by default, solid red when active or hovered.
 */
public class SidebarButton extends JButton {
    private boolean active = false;
    private boolean hover = false;

    public SidebarButton(String text) {
        this(text, null);
    }

    /** iconFileName is looked up under the images/ folder via IconLoader; pass null for no icon. */
    public SidebarButton(String text, String iconFileName) {
        super(text);

        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        setForeground(Theme.WHITE);
        setFont(Theme.boldFont(15));
        setHorizontalAlignment(SwingConstants.LEFT);
        setIconTextGap(12);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setBorder(BorderFactory.createEmptyBorder(14, 24, 14, 16));
        setAlignmentX(Component.LEFT_ALIGNMENT);

        if (iconFileName != null) {
            ImageIcon icon = IconLoader.load(iconFileName, 20, 20);
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
    }

    public void setActive(boolean active) {
        this.active = active;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (active || hover) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(active ? Theme.RED : Theme.SIDEBAR_HOVER);
            g2.fill(new RoundRectangle2D.Float(6, 3, getWidth() - 12, getHeight() - 6, 8, 8));
            g2.dispose();
        }
        super.paintComponent(g);
    }
}
