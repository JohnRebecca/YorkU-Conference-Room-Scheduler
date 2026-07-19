package scheduler.sensor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * One ID badge scan captured by a room's badge reader (Req5).
 *
 * Every scan - whether by the booking owner or a guest joining the meeting -
 * is persisted to the database with who scanned, at which room, and when.
 * The room's occupancy count is the number of scans recorded for the active
 * booking.
 */
public class BadgeScanRecord {

    public enum Result {
        /** The scanner is the booking owner: the booking was checked in automatically. */
        OWNER_CHECK_IN,
        /** A counted tap while the room is open (guest, or owner re-entry). */
        GUEST_ENTRY
    }

    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("MMM d, HH:mm:ss");

    private final String userId;
    private final String fullName;
    private final String identificationNumber;
    private final String roomId;
    private final String bookingId;
    private final LocalDateTime scannedAt;
    private final Result result;

    public BadgeScanRecord(String userId, String fullName, String identificationNumber,
                           String roomId, String bookingId, LocalDateTime scannedAt, Result result) {
        this.userId = userId;
        this.fullName = fullName;
        this.identificationNumber = identificationNumber;
        this.roomId = roomId;
        this.bookingId = bookingId;
        this.scannedAt = scannedAt;
        this.result = result;
    }

    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public LocalDateTime getScannedAt() {
        return scannedAt;
    }

    public Result getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "[" + scannedAt.format(TIME_FORMAT) + "] " + roomId + "  "
                + fullName + " (" + identificationNumber + ")  "
                + (result == Result.OWNER_CHECK_IN ? "OWNER - CHECKED IN" : "TAPPED IN");
    }
}
