package scheduler.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the application's single source of time and the Demo Clock
 * used to test the 30-minute check-in rule without waiting.
 *
 * AppClock holds global state, so every test resets it afterwards.
 */
@DisplayName("AppClock (single source of time + Demo Clock)")
class AppClockTest {

    @BeforeEach
    void startFromRealTime() {
        AppClock.reset();
    }

    @AfterEach
    void restoreRealTime() {
        AppClock.reset();
    }

    @Test
    @DisplayName("with no offset the clock matches the system time")
    void matchesSystemTimeWhenReset() {
        long secondsApart = Math.abs(Duration.between(LocalDateTime.now(), AppClock.now()).toSeconds());

        assertTrue(secondsApart <= 2, "clock drifted by " + secondsApart + " s");
    }

    @Test
    @DisplayName("today() is the date part of now()")
    void todayMatchesNow() {
        assertEquals(AppClock.now().toLocalDate(), AppClock.today());
    }

    @Test
    @DisplayName("a freshly reset clock is not simulated")
    void resetClockIsNotSimulated() {
        assertFalse(AppClock.isSimulated());
    }

    @Test
    @DisplayName("advancing moves the clock forward by the requested amount")
    void advanceMovesTimeForward() {
        LocalDateTime before = AppClock.now();

        AppClock.advance(Duration.ofHours(1));

        long minutesGained = Duration.between(before, AppClock.now()).toMinutes();
        assertTrue(minutesGained >= 59 && minutesGained <= 61, "gained " + minutesGained + " min");
    }

    @Test
    @DisplayName("advancing twice accumulates the offset")
    void advanceAccumulates() {
        AppClock.advance(Duration.ofHours(1));
        AppClock.advance(Duration.ofHours(2));

        long hoursAhead = Duration.between(LocalDateTime.now(), AppClock.now()).toHours();
        assertEquals(3, hoursAhead);
    }

    @Test
    @DisplayName("the clock reports itself as simulated once advanced")
    void advancedClockIsSimulated() {
        AppClock.advance(Duration.ofMinutes(30));

        assertTrue(AppClock.isSimulated());
    }

    @Test
    @DisplayName("negative jumps are ignored - time never runs backwards")
    void negativeAdvanceIsIgnored() {
        AppClock.advance(Duration.ofHours(-5));

        assertFalse(AppClock.isSimulated());
    }

    @Test
    @DisplayName("jumpTo lands on the requested future moment")
    void jumpToLandsOnTarget() {
        LocalDateTime target = LocalDateTime.now().plusDays(2).withHour(8).withMinute(45).withSecond(0).withNano(0);

        AppClock.jumpTo(target);

        long secondsApart = Math.abs(Duration.between(target, AppClock.now()).toSeconds());
        assertTrue(secondsApart <= 2, "landed " + secondsApart + " s away from the target");
    }

    @Test
    @DisplayName("jumping to a past moment is ignored")
    void jumpToPastIsIgnored() {
        AppClock.jumpTo(LocalDateTime.now().minusDays(1));

        assertFalse(AppClock.isSimulated());
    }

    @Test
    @DisplayName("reset returns the clock to real time")
    void resetReturnsToRealTime() {
        AppClock.advance(Duration.ofDays(3));

        AppClock.reset();

        assertFalse(AppClock.isSimulated());
        long secondsApart = Math.abs(Duration.between(LocalDateTime.now(), AppClock.now()).toSeconds());
        assertTrue(secondsApart <= 2, "clock drifted by " + secondsApart + " s after reset");
    }

    @Test
    @DisplayName("the offset description shows minutes only for sub-hour jumps")
    void offsetDescriptionForMinutes() {
        AppClock.advance(Duration.ofMinutes(30));

        assertEquals("+30m", AppClock.describeOffset());
    }

    @Test
    @DisplayName("the offset description shows hours and minutes")
    void offsetDescriptionForHours() {
        AppClock.advance(Duration.ofHours(2));

        assertEquals("+2h 0m", AppClock.describeOffset());
    }

    @Test
    @DisplayName("the offset description shows days, hours and minutes")
    void offsetDescriptionForDays() {
        AppClock.advance(Duration.ofDays(1).plusHours(3).plusMinutes(15));

        assertEquals("+1d 3h 15m", AppClock.describeOffset());
    }

    @Test
    @DisplayName("listeners are notified when time is advanced")
    void listenersFireOnAdvance() {
        AtomicInteger notifications = new AtomicInteger();
        AppClock.addListener(notifications::incrementAndGet);

        AppClock.advance(Duration.ofHours(1));

        assertEquals(1, notifications.get());
    }

    @Test
    @DisplayName("listeners are notified when the clock is reset")
    void listenersFireOnReset() {
        AppClock.advance(Duration.ofHours(1));
        AtomicInteger notifications = new AtomicInteger();
        AppClock.addListener(notifications::incrementAndGet);

        AppClock.reset();

        assertEquals(1, notifications.get());
    }

    @Test
    @DisplayName("an ignored negative jump does not notify listeners")
    void ignoredJumpDoesNotNotify() {
        AtomicInteger notifications = new AtomicInteger();
        AppClock.addListener(notifications::incrementAndGet);

        AppClock.advance(Duration.ofMinutes(-10));

        assertEquals(0, notifications.get());
    }

    @Test
    @DisplayName("the simulated date can move to a different calendar day")
    void simulatedClockCanChangeTheDate() {
        LocalDate realToday = LocalDate.now();

        AppClock.advance(Duration.ofDays(2));

        assertTrue(AppClock.today().isAfter(realToday));
    }
}
