package scheduler.view;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *   images/
 *     logo.png                  (sidebar logo, ~40x40)
 *     icon_rooms.png            (~22x22 nav icon)
 *     icon_my_bookings.png
 *     icon_edit_booking.png
 *     icon_check_in.png
 *     icon_payment.png
 *     icon_profile.png
 *     icon_back.png             (back arrow, used on the booking form)
 *     icon_book.png             (used on the "Select Room" / "Confirm Booking" buttons)
 *     rooms/
 *       placeholder.png         (fallback thumbnail, ~220x140, used if a room has no photo)
 *       DB-1001.png             (filename must match Room.getRoomId() exactly)
 *       LAS-2045.png
 *       VH-3002.png
 *       ACW-109.png
 */
public final class IconLoader {
    private static final String IMAGES_DIR = "images";
    private static final Map<String, ImageIcon> CACHE = new HashMap<>();

    private IconLoader() {}

    public static ImageIcon load(String relativeFileName, int width, int height) {
        String cacheKey = relativeFileName + "@" + width + "x" + height;
        if (CACHE.containsKey(cacheKey)) {
            return CACHE.get(cacheKey);
        }

        File file = new File(IMAGES_DIR, relativeFileName);
        ImageIcon result = null;

        if (file.exists() && file.isFile()) {
            try {
                ImageIcon raw = new ImageIcon(file.getPath());
                result = new ImageIcon(highQualityScale(raw.getImage(), width, height));
            } catch (Exception ex) {
                result = null;
            }
        }

        CACHE.put(cacheKey, result);
        return result;
    }

    /**
     * Scales an image down using Graphics2D with bicubic interpolation instead of
     * Image.getScaledInstance(SCALE_SMOOTH), which produces blocky/pixelated results
     * on large downscale ratios (e.g. a 2000x2000 source drawn at 20x20).
     * For big reductions (>2x), scales down in gradual half-steps, which further
     * improves sharpness over a single big jump.
     */
    private static BufferedImage highQualityScale(Image source, int targetWidth, int targetHeight) {
        BufferedImage src = toBufferedImage(source);
        int currentWidth = src.getWidth();
        int currentHeight = src.getHeight();
        BufferedImage current = src;

        // Step down by halves until we're close to the target size
        while (currentWidth / 2 > targetWidth && currentHeight / 2 > targetHeight) {
            currentWidth = Math.max(targetWidth, currentWidth / 2);
            currentHeight = Math.max(targetHeight, currentHeight / 2);
            current = renderScaled(current, currentWidth, currentHeight);
        }

        return renderScaled(current, targetWidth, targetHeight);
    }

    private static BufferedImage renderScaled(BufferedImage src, int width, int height) {
        BufferedImage dest = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = dest.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawImage(src, 0, 0, width, height, null);
        g2.dispose();
        return dest;
    }

    private static BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }
        BufferedImage buffered = new BufferedImage(
                image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffered.createGraphics();
        g2.drawImage(image, 0, 0, null);
        g2.dispose();
        return buffered;
    }

    /** Looks up images/rooms/{roomId}.png, falling back to images/rooms/placeholder.png. */
    public static ImageIcon loadRoomImage(String roomId, int width, int height) {
        ImageIcon icon = load("rooms/" + roomId + ".png", width, height);
        if (icon == null) {
            icon = load("rooms/placeholder.png", width, height);
        }
        return icon;
    }
}
