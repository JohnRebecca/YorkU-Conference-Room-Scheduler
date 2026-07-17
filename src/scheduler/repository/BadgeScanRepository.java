package scheduler.repository;

import scheduler.sensor.BadgeScanRecord;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Persistence for ID badge scans (Req5: sensor data is sent to the system and
 * stored). Follows the same repository style as the account/authentication
 * module so the storage technology stays swappable.
 */
public interface BadgeScanRepository {

    /** Persists one badge scan. */
    void save(BadgeScanRecord record);

    /**
     * Tapped-in count for a booking: the number of DISTINCT people who have
     * tapped their badge for it since the given lower time bound (callers
     * pass the app-session start: bookings are in-memory, so booking IDs can
     * be reused across runs, and scans from earlier runs must not leak into
     * this run's counts). Every tap is stored, but a person tapping
     * repeatedly only counts once per booking.
     */
    int countDistinctTappersForBooking(String bookingId, LocalDateTime since);

    /** True if this person has already tapped in for the booking. */
    boolean hasTapped(String bookingId, String identificationNumber, LocalDateTime since);

    /** Most recent scans first, at most {@code limit} of them. */
    List<BadgeScanRecord> findRecent(int limit);
}
