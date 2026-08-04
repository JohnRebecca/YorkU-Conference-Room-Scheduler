package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import scheduler.sensor.BadgeScanRecord;

class AIBadgeScanRecordBehaviorTest {

    @Test
    void gettersReturnConstructorData() {
        LocalDateTime scannedAt = LocalDateTime.of(2026, 8, 4, 10, 15, 30);
        BadgeScanRecord record = new BadgeScanRecord(
                "U-7", "Sam Lee", "ID-77", "VH-3002", "B-9",
                scannedAt, BadgeScanRecord.Result.GUEST_ENTRY);

        assertAll(
                () -> assertEquals("U-7", record.getUserId()),
                () -> assertEquals("Sam Lee", record.getFullName()),
                () -> assertEquals("ID-77", record.getIdentificationNumber()),
                () -> assertEquals("VH-3002", record.getRoomId()),
                () -> assertEquals("B-9", record.getBookingId()),
                () -> assertEquals(scannedAt, record.getScannedAt()),
                () -> assertEquals(BadgeScanRecord.Result.GUEST_ENTRY, record.getResult())
        );
    }

    @Test
    void ownerResultUsesOwnerLabel() {
        BadgeScanRecord record = new BadgeScanRecord(
                "U1", "Owner", "100", "R1", "B1",
                LocalDateTime.of(2026, 1, 2, 9, 5),
                BadgeScanRecord.Result.OWNER_CHECK_IN);

        assertTrue(record.toString().contains("OWNER - CHECKED IN"));
    }

    @Test
    void guestResultUsesTappedInLabel() {
        BadgeScanRecord record = new BadgeScanRecord(
                "U2", "Guest", "200", "R1", "B1",
                LocalDateTime.of(2026, 1, 2, 9, 5),
                BadgeScanRecord.Result.GUEST_ENTRY);

        assertTrue(record.toString().contains("TAPPED IN"));
    }

    @Test
    void formattedTextIncludesIdentityAndRoom() {
        BadgeScanRecord record = new BadgeScanRecord(
                "U2", "Guest Name", "STU-200", "LAS-2045", "B1",
                LocalDateTime.of(2026, 1, 2, 9, 5),
                BadgeScanRecord.Result.GUEST_ENTRY);

        String text = record.toString();
        assertTrue(text.contains("Guest Name"));
        assertTrue(text.contains("STU-200"));
        assertTrue(text.contains("LAS-2045"));
    }
}
