package scheduler.payment.service;

import java.time.LocalDateTime;
import java.time.Duration;

/**
 * CheckInService handles the 30-minute grace period rule for check-in.
 * t.
 * 
 * @author Amal Aden
 */
public class CheckInService {
    // SINGLETON PATTERN used
  
    
    private static CheckInService instance;
    
    private CheckInService() {
       // Private constructor prevents instantiation from outside
    }
    
    public static CheckInService getInstance() {
         if (instance == null) {
            instance = new CheckInService();
        }
        return instance;
    }
    
    // CONSTANTS

    
    /** Grace period in minutes (Req4) 
    private static final int GRACE_PERIOD_MINUTES = 30;
    
     // CHECK-IN METHODS

    
    /**
     * Attempts to check in a user for a booking.
     * 
     * @param bookingId   The ID of the booking
     * @param badgeId     The badge ID scanned at the room sensor
     * @param startTime   The booking start time
     * @return true if check-in is successful (within 30 minutes), false otherwise
     */
    public boolean checkIn(int bookingId, String badgeId, LocalDateTime startTime) {
        LocalDateTime now = LocalDateTime.now();
        Duration elapsed = Duration.between(startTime, now);
        long minutesElapsed = elapsed.toMinutes();
        
        if (minutesElapsed <= 30) {
            System.out.println ("Check-in successful for booking #" + bookingId + " (Badge: " + badgeId + ")");
            System.out.println("   Time elapsed: " + minutesElapsed + " / " + 30 + " minutes");
            return true;
        } else {
            System.out.println("Check-in FAILED for booking #" + bookingId);
            System.out.println("   Time elapsed: " + minutesElapsed + " minutes (max " + 30 + ")");
            return false;
        }
    }
    
    /**
     * Checks if the current time is within the 30-minute grace period.
     * 
     * @param startTime   The booking start time
     * @return true if within grace period, false otherwise
     */
    public boolean isWithinGracePeriod(LocalDateTime startTime) {
        return getMinutesElapsed(startTime) <= 30;
    }
    
    /**
     * Gets the number of minutes elapsed since the start time.
     * @param startTime   The booking start time
     * @return Number of minutes elapsed
     */
    public long getMinutesElapsed(LocalDateTime startTime) {
        if (startTime == null) {
            return 0;
        }
        return Duration.between(startTime, LocalDateTime.now()).toMinutes();
    }
    
    /**
     * Gets the remaining minutes in the grace period.
     * @param startTime   The booking start time
     * @return Remaining minutes (can be negative if expired)
     */
    public long getRemainingMinutes(LocalDateTime startTime) {
        return 30 - getMinutesElapsed(startTime);
    }
}