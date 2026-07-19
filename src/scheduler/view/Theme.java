package scheduler.view;

import java.awt.*;

/**
 * Central color / font palette, sourced from the UI design PDF:
 * black sidebar, white content, red accent, gray for disabled/secondary states.
 */
public final class Theme {
    private Theme() {}

    // Core palette
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color SIDEBAR_HOVER = new Color(32, 32, 32);
    public static final Color RED = new Color(255, 61, 61);
    public static final Color RED_DARK = new Color(224, 40, 40);
    public static final Color RED_SOFT = new Color(255, 129, 129);
    public static final Color WHITE = Color.WHITE;
    public static final Color GRAY = new Color(166, 166, 166);
    public static final Color GRAY_LIGHT = new Color(231, 231, 231);
    public static final Color GRAY_BORDER = new Color(214, 214, 214);
    public static final Color TEXT_DARK = new Color(30, 30, 30);
    public static final Color TEXT_BODY = new Color(76, 76, 76);
    public static final Color BG = Color.WHITE;

    // Fonts
    public static final String FONT_FAMILY = "SansSerif";

    public static Font titleFont(int size) {
        return new Font(FONT_FAMILY, Font.BOLD, size);
    }

    public static Font bodyFont(int size) {
        return new Font(FONT_FAMILY, Font.PLAIN, size);
    }

    public static Font boldFont(int size) {
        return new Font(FONT_FAMILY, Font.BOLD, size);
    }
}
