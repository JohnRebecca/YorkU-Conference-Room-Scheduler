package scheduler.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scheduler.TestSupport;
import scheduler.sensor.BadgeScanRecord;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration tests for badge scan persistence (Req5: sensor data is sent to
 * and stored by the system). Each test runs against a freshly created
 * database file.
 *
 * The key rule under test: every tap is stored, but the tapped-in count is
 * the number of DISTINCT ACCOUNTS - two accounts registered with the same
 * identification number must still count as two people.
 */
@DisplayName("SqliteBadgeScanRepository (badge scan persistence)")
class SqliteBadgeScanRepositoryTest {

    private static final String BOOKING = "booking-123";
    private static final String OTHER_BOOKING = "booking-999";
    private static final String ROOM = "DB-1001";

    private BadgeScanRepository repository;
    private LocalDateTime sessionStart;

    @BeforeEach
    void setUp() {
        TestSupport.resetDatabase();
        repository = new SqliteBadgeScanRepository();
        sessionStart = LocalDateTime.now().minusMinutes(1);
    }

    private BadgeScanRecord scan(String userId, String idNumber, BadgeScanRecord.Result result) {
        return scan(userId, idNumber, result, LocalDateTime.now(), BOOKING);
    }

    private BadgeScanRecord scan(String userId, String idNumber, BadgeScanRecord.Result result,
                                 LocalDateTime scannedAt, String bookingId) {
        return new BadgeScanRecord(userId, "Person " + userId, idNumber, ROOM, bookingId, scannedAt, result);
    }

    @Test
    @DisplayName("a fresh database holds no scans")
    void freshDatabaseIsEmpty() {
        assertTrue(repository.findRecent(50).isEmpty());
    }

    @Test
    @DisplayName("a saved scan can be read back")
    void savedScanIsReadBack() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN));

        assertEquals(1, repository.findRecent(50).size());
    }

    @Test
    @DisplayName("every field of a scan survives the round trip")
    void allFieldsRoundTrip() {
        LocalDateTime scannedAt = LocalDateTime.now().withNano(0);
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN, scannedAt, BOOKING));

        BadgeScanRecord stored = repository.findRecent(1).get(0);

        assertEquals("U1", stored.getUserId());
        assertEquals("Person U1", stored.getFullName());
        assertEquals("216000001", stored.getIdentificationNumber());
        assertEquals(ROOM, stored.getRoomId());
        assertEquals(BOOKING, stored.getBookingId());
        assertEquals(scannedAt, stored.getScannedAt());
        assertEquals(BadgeScanRecord.Result.OWNER_CHECK_IN, stored.getResult());
    }

    @Test
    @DisplayName("an unknown booking has no tapped-in people")
    void unknownBookingHasNoTappers() {
        assertEquals(0, repository.countDistinctTappersForBooking("no-such-booking", sessionStart));
    }

    @Test
    @DisplayName("one person tapping in counts as one")
    void onePersonCountsAsOne() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN));

        assertEquals(1, repository.countDistinctTappersForBooking(BOOKING, sessionStart));
    }

    @Test
    @DisplayName("the same person tapping repeatedly still counts as one")
    void repeatTapsCountOnce() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN));
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.GUEST_ENTRY));
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.GUEST_ENTRY));

        assertEquals(1, repository.countDistinctTappersForBooking(BOOKING, sessionStart));
        assertEquals(3, repository.findRecent(50).size(), "every tap must still be stored");
    }

    @Test
    @DisplayName("two different people count as two")
    void twoPeopleCountAsTwo() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN));
        repository.save(scan("U2", "216000002", BadgeScanRecord.Result.GUEST_ENTRY));

        assertEquals(2, repository.countDistinctTappersForBooking(BOOKING, sessionStart));
    }

    @Test
    @DisplayName("two accounts sharing one identification number still count as two people")
    void duplicateIdentificationNumbersCountSeparately() {
        repository.save(scan("U1", "123456789", BadgeScanRecord.Result.OWNER_CHECK_IN));
        repository.save(scan("U2", "123456789", BadgeScanRecord.Result.GUEST_ENTRY));

        assertEquals(2, repository.countDistinctTappersForBooking(BOOKING, sessionStart),
                "identity is keyed by account, not by badge number");
    }

    @Test
    @DisplayName("hasTapped is false before a person taps and true afterwards")
    void hasTappedReflectsHistory() {
        assertFalse(repository.hasTapped(BOOKING, "U1", sessionStart));

        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN));

        assertTrue(repository.hasTapped(BOOKING, "U1", sessionStart));
    }

    @Test
    @DisplayName("hasTapped is per account, not per booking-wide")
    void hasTappedIsPerAccount() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN));

        assertTrue(repository.hasTapped(BOOKING, "U1", sessionStart));
        assertFalse(repository.hasTapped(BOOKING, "U2", sessionStart));
    }

    @Test
    @DisplayName("hasTapped is scoped to the booking")
    void hasTappedIsScopedToBooking() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.GUEST_ENTRY, LocalDateTime.now(), BOOKING));

        assertTrue(repository.hasTapped(BOOKING, "U1", sessionStart));
        assertFalse(repository.hasTapped(OTHER_BOOKING, "U1", sessionStart));
    }

    @Test
    @DisplayName("scans from before the session start are excluded from the count")
    void olderScansAreExcluded() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.GUEST_ENTRY,
                LocalDateTime.now().minusDays(3), BOOKING));

        assertEquals(0, repository.countDistinctTappersForBooking(BOOKING, sessionStart),
                "a stale row from an earlier run must not leak into this session");
        assertFalse(repository.hasTapped(BOOKING, "U1", sessionStart));
        assertEquals(1, repository.findRecent(50).size(), "the row is still stored, just not counted");
    }

    @Test
    @DisplayName("counts are scoped to one booking")
    void countsAreScopedToBooking() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN, LocalDateTime.now(), BOOKING));
        repository.save(scan("U2", "216000002", BadgeScanRecord.Result.GUEST_ENTRY, LocalDateTime.now(), OTHER_BOOKING));

        assertEquals(1, repository.countDistinctTappersForBooking(BOOKING, sessionStart));
        assertEquals(1, repository.countDistinctTappersForBooking(OTHER_BOOKING, sessionStart));
    }

    @Test
    @DisplayName("recent scans are returned newest first")
    void recentScansAreNewestFirst() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN,
                LocalDateTime.now().minusMinutes(10), BOOKING));
        repository.save(scan("U2", "216000002", BadgeScanRecord.Result.GUEST_ENTRY,
                LocalDateTime.now(), BOOKING));

        List<BadgeScanRecord> recent = repository.findRecent(50);

        assertEquals("U2", recent.get(0).getUserId(), "newest scan should come first");
        assertEquals("U1", recent.get(1).getUserId());
    }

    @Test
    @DisplayName("findRecent respects the requested limit")
    void findRecentRespectsLimit() {
        for (int i = 0; i < 5; i++) {
            repository.save(scan("U" + i, "21600000" + i, BadgeScanRecord.Result.GUEST_ENTRY));
        }

        assertEquals(2, repository.findRecent(2).size());
    }

    @Test
    @DisplayName("both scan results survive persistence")
    void bothResultsArePersisted() {
        repository.save(scan("U1", "216000001", BadgeScanRecord.Result.OWNER_CHECK_IN));
        repository.save(scan("U2", "216000002", BadgeScanRecord.Result.GUEST_ENTRY));

        List<BadgeScanRecord> recent = repository.findRecent(50);
        boolean hasOwner = recent.stream().anyMatch(r -> r.getResult() == BadgeScanRecord.Result.OWNER_CHECK_IN);
        boolean hasGuest = recent.stream().anyMatch(r -> r.getResult() == BadgeScanRecord.Result.GUEST_ENTRY);

        assertTrue(hasOwner);
        assertTrue(hasGuest);
    }
}
