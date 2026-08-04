package scheduler.sensor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the badge scan that gets persisted to the database (Req5):
 * who scanned, at which room, for which booking, when, and whether the scan
 * checked the owner in or simply logged a person tapping in.
 */
@DisplayName("BadgeScanRecord (persisted badge scan)")
class BadgeScanRecordTest {

    private static final LocalDateTime SCANNED_AT = LocalDateTime.of(2026, 7, 18, 9, 5, 30);

    private BadgeScanRecord ownerScan;

    @BeforeEach
    void setUp() {
        ownerScan = new BadgeScanRecord(
                "U1", "Rudra Iqbal", "216000001",
                "DB-1001", "booking-123", SCANNED_AT,
                BadgeScanRecord.Result.OWNER_CHECK_IN);
    }

    @Test
    @DisplayName("the scanning account is preserved")
    void userIdIsPreserved() {
        assertEquals("U1", ownerScan.getUserId());
    }

    @Test
    @DisplayName("the person's name is preserved")
    void fullNameIsPreserved() {
        assertEquals("Rudra Iqbal", ownerScan.getFullName());
    }

    @Test
    @DisplayName("the identification number on the badge is preserved")
    void identificationNumberIsPreserved() {
        assertEquals("216000001", ownerScan.getIdentificationNumber());
    }

    @Test
    @DisplayName("the room is preserved")
    void roomIsPreserved() {
        assertEquals("DB-1001", ownerScan.getRoomId());
    }

    @Test
    @DisplayName("the booking the scan belongs to is preserved")
    void bookingIsPreserved() {
        assertEquals("booking-123", ownerScan.getBookingId());
    }

    @Test
    @DisplayName("the exact scan time is preserved")
    void timestampIsPreserved() {
        assertEquals(SCANNED_AT, ownerScan.getScannedAt());
    }

    @Test
    @DisplayName("the scan result is preserved")
    void resultIsPreserved() {
        assertEquals(BadgeScanRecord.Result.OWNER_CHECK_IN, ownerScan.getResult());
    }

    @Test
    @DisplayName("an owner check-in is described as such in the feed line")
    void ownerCheckInIsLabelled() {
        assertTrue(ownerScan.toString().contains("OWNER"), "was: " + ownerScan);
        assertTrue(ownerScan.toString().contains("CHECKED IN"), "was: " + ownerScan);
    }

    @Test
    @DisplayName("a guest entry is described as a tap-in in the feed line")
    void guestEntryIsLabelled() {
        BadgeScanRecord guestScan = new BadgeScanRecord(
                "U2", "Tasnim Nisha", "216000002",
                "DB-1001", "booking-123", SCANNED_AT,
                BadgeScanRecord.Result.GUEST_ENTRY);

        assertTrue(guestScan.toString().contains("TAPPED IN"), "was: " + guestScan);
    }

    @Test
    @DisplayName("the feed line shows the room, the name and the ID number")
    void feedLineShowsWhoScannedWhere() {
        String line = ownerScan.toString();

        assertTrue(line.contains("DB-1001"), "was: " + line);
        assertTrue(line.contains("Rudra Iqbal"), "was: " + line);
        assertTrue(line.contains("216000001"), "was: " + line);
    }

    @Test
    @DisplayName("the feed line starts with the bracketed scan time")
    void feedLineStartsWithTimestamp() {
        String line = ownerScan.toString();

        assertTrue(line.startsWith("["), "was: " + line);
        assertTrue(line.contains("09:05:30"), "was: " + line);
    }

    @Test
    @DisplayName("both scan results are available")
    void bothResultsExist() {
        assertEquals(2, BadgeScanRecord.Result.values().length);
        assertNotNull(BadgeScanRecord.Result.valueOf("OWNER_CHECK_IN"));
        assertNotNull(BadgeScanRecord.Result.valueOf("GUEST_ENTRY"));
    }
}
