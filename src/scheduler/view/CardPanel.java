package scheduler.view;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * A white, rounded-corner panel with a light gray border, used for room cards,
 * booking cards, and other elevated content blocks.
 */
public class CardPanel extends JPanel {
    private final int arc;

    public CardPanel(LayoutManager layout, int arc) {
        super(layout);
        this.arc = arc;
        setOpaque(false);
    }

    public CardPanel(LayoutManager layout) {
        this(layout, 14);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Theme.WHITE);
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arc, arc));

        g2.setColor(Theme.GRAY_BORDER);
        g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arc, arc));

        g2.dispose();
        super.paintComponent(g);
    }
}
