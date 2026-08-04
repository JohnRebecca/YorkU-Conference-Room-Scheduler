package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import scheduler.util.AppClock;

class AIAppClockBehaviorTest {

    @AfterEach
    void restoreRealClock() {
        AppClock.reset();
    }

    @Test
    void advancingClockMovesNowForwardByApproximatelyRequestedDuration() {
        LocalDateTime before = AppClock.now();
        AppClock.advance(Duration.ofMinutes(75));
        LocalDateTime after = AppClock.now();

        long movedMinutes = Duration.between(before, after).toMinutes();
        assertTrue(movedMinutes >= 74 && movedMinutes <= 76);
        assertTrue(AppClock.isSimulated());
    }

    @Test
    void negativeAdvanceIsIgnored() {
        LocalDateTime before = AppClock.now();
        AppClock.advance(Duration.ofMinutes(-10));
        LocalDateTime after = AppClock.now();

        assertFalse(AppClock.isSimulated());
        assertTrue(Math.abs(Duration.between(before, after).toSeconds()) <= 2);
    }

    @Test
    void jumpToFutureTargetUsesTargetMoment() {
        LocalDateTime target = AppClock.now().plusHours(3);
        AppClock.jumpTo(target);

        assertTrue(Math.abs(Duration.between(target, AppClock.now()).toSeconds()) <= 2);
    }

    @Test
    void resetRemovesSimulationOffset() {
        AppClock.advance(Duration.ofDays(2));
        assertTrue(AppClock.isSimulated());

        AppClock.reset();

        assertFalse(AppClock.isSimulated());
        assertTrue(Math.abs(Duration.between(LocalDateTime.now(), AppClock.now()).toSeconds()) <= 2);
    }

    @Test
    void offsetDescriptionIncludesDaysHoursAndMinutes() {
        AppClock.advance(Duration.ofDays(1).plusHours(2).plusMinutes(3));

        assertEquals("+1d 2h 3m", AppClock.describeOffset());
    }

    @Test
    void listenerRunsWhenTimeChanges() {
        AtomicInteger calls = new AtomicInteger();
        AppClock.addListener(calls::incrementAndGet);

        AppClock.advance(Duration.ofMinutes(1));
        AppClock.reset();

        assertTrue(calls.get() >= 2);
    }

    @Test
    void todayMatchesDatePortionOfNow() {
        LocalDate expected = AppClock.now().toLocalDate();
        assertEquals(expected, AppClock.today());
    }
}
