package test.manual.scheduler.payment.service;

import org.junit.jupiter.api.Test;
import scheduler.payment.service.CheckInService;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CheckInServiceTest {
    private CheckInService service = CheckInService.getInstance();

    @Test
    void testGetInstance() {
         CheckInService instance1 = CheckInService.getInstance();
         CheckInService instance2 = CheckInService.getInstance();
        assertSame(instance1, instance2);
    }

     @Test
    void testCheckInWithinGracePeriod() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(5);
        assertTrue(service.checkIn(101, "BADGE-123", start));
    }

    @Test
    void testCheckInExceedsGracePeriod() {
         LocalDateTime start = LocalDateTime.now().minusMinutes(35);
        assertFalse(service.checkIn(101, "BADGE-123", start));
    }

    @Test
    void testCheckInAtExactlyGracePeriod() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(30);
        assertTrue(service.checkIn(101, "BADGE-123", start));
    }

    @Test
    void testCheckInAtOneMinuteBefore() {
         LocalDateTime start = LocalDateTime.now().minusMinutes(29);
        assertTrue(service.checkIn(101, "BADGE-123", start));
    }

    @Test
    void testCheckInAtOneMinuteAfter() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(31);
         assertFalse(service.checkIn(101, "BADGE-123", start));
    } 

    @Test
    void testIsWithinGracePeriod() {
         LocalDateTime start = LocalDateTime.now().minusMinutes(10);
        assertTrue(service.isWithinGracePeriod(start));
    }

    @Test
    void testIsNotWithinGracePeriod() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(45);
        assertFalse(service.isWithinGracePeriod(start));
    }

    @Test
    void testGetMinutesElapsed() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(15);
        long elapsed = service.getMinutesElapsed(start);
         assertTrue(elapsed >= 14 && elapsed <= 16);
    }

    @Test
    void testGetMinutesElapsedReturnsZeroForNullStart() {
         assertEquals(0, service.getMinutesElapsed(null));
    }

    @Test
    void testGetRemainingMinutes() {
        LocalDateTime start = LocalDateTime.now();
        long remaining = service.getRemainingMinutes(start);
        assertTrue(remaining <= 30 && remaining >= 28);
    }

    @Test
    void testCheckInWithNullBadgeId() {
       LocalDateTime start = LocalDateTime.now().minusMinutes(5);
         assertTrue(service.checkIn(101, null, start));
    }

    @Test
    void testCheckInWithEmptyBadgeId() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(5);
        assertTrue(service.checkIn(101, "", start));
    }

    @Test
    void testGetRemainingMinutesReturnsNegativeIfExpired() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(45);
       long remaining = service.getRemainingMinutes(start);
        assertTrue(remaining < 0);
    }

    @Test
    void testIsWithinGracePeriodAtBoundary() {
       LocalDateTime start = LocalDateTime.now().minusMinutes(30);
        assertTrue(service.isWithinGracePeriod(start));
    }
}