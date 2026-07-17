package scheduler.util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The application's single source of time.
 *
 * All time-dependent rules (the 15-minute check-in opening, the 30-minute
 * deposit window, booking validation, calendar "today") read the current
 * moment from here instead of calling LocalDateTime.now() directly.
 *
 * Normally {@link #now()} is exactly the real system time. For testing and
 * demos, the Demo Clock on the ID Badge Sensor screen can push time forward
 * by an offset - so a booking made for next week can be checked in and
 * tapped right away, and the late-forfeit rule can be demonstrated in
 * seconds instead of waiting 30 real minutes. Resetting returns the app to
 * real time.
 */
public final class AppClock {

    private static Duration offset = Duration.ZERO;
    private static final List<Runnable> listeners = new ArrayList<>();

    private AppClock() {
    }

    /** The app's current moment: real time plus the demo offset (if any). */
    public static LocalDateTime now() {
        return LocalDateTime.now().plus(offset);
    }

    /** The app's current date (used by calendars / "today" checks). */
    public static LocalDate today() {
        return now().toLocalDate();
    }

    /** Pushes the app's time forward (demo/testing only). */
    public static void advance(Duration amount) {
        if (amount.isNegative()) {
            return; // only forward jumps are supported
        }
        offset = offset.plus(amount);
        notifyListeners();
    }

    /** Jumps straight to a target moment (must not be in the app's past). */
    public static void jumpTo(LocalDateTime target) {
        Duration jump = Duration.between(now(), target);
        advance(jump);
    }

    /** Returns to real system time. */
    public static void reset() {
        offset = Duration.ZERO;
        notifyListeners();
    }

    public static boolean isSimulated() {
        return !offset.isZero();
    }

    /** Human-readable offset like "+2d 3h 15m" for the clock display. */
    public static String describeOffset() {
        long totalMinutes = offset.toMinutes();
        long days = totalMinutes / (24 * 60);
        long hours = (totalMinutes % (24 * 60)) / 60;
        long minutes = totalMinutes % 60;
        StringBuilder text = new StringBuilder("+");
        if (days > 0) {
            text.append(days).append("d ");
        }
        if (hours > 0 || days > 0) {
            text.append(hours).append("h ");
        }
        text.append(minutes).append("m");
        return text.toString();
    }

    /** UI panels register here to refresh immediately when time jumps. */
    public static void addListener(Runnable listener) {
        listeners.add(listener);
    }

    private static void notifyListeners() {
        for (Runnable listener : new ArrayList<>(listeners)) {
            listener.run();
        }
    }
}
