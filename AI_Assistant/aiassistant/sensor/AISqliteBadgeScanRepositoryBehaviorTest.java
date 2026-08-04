package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.database.DatabaseManager;
import scheduler.repository.SqliteBadgeScanRepository;
import scheduler.sensor.BadgeScanRecord;

class AISqliteBadgeScanRepositoryBehaviorTest {

    private SqliteBadgeScanRepository repository;

    @BeforeEach
    void clearBadgeTable() throws Exception {
        DatabaseManager.initializeDatabase();
        try (Connection connection = DatabaseManager.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("DELETE FROM badge_scans");
        }
        repository = new SqliteBadgeScanRepository();
    }

    private BadgeScanRecord record(
            String user, String booking, LocalDateTime time,
            BadgeScanRecord.Result result) {
        return new BadgeScanRecord(
                user, "Name " + user, "ID-" + user,
                "DB-1001", booking, time, result);
    }

    @Test
    void savedRecordCanBeLoadedWithSameValues() {
        LocalDateTime time = LocalDateTime.of(2026, 8, 4, 8, 30);
        repository.save(record("U1", "B1", time,
                BadgeScanRecord.Result.OWNER_CHECK_IN));

        List<BadgeScanRecord> loaded = repository.findRecent(10);

        assertEquals(1, loaded.size());
        assertEquals("U1", loaded.get(0).getUserId());
        assertEquals(time, loaded.get(0).getScannedAt());
        assertEquals(BadgeScanRecord.Result.OWNER_CHECK_IN,
                loaded.get(0).getResult());
    }

    @Test
    void distinctCountIgnoresRepeatScansFromSameUser() {
        LocalDateTime base = LocalDateTime.of(2026, 8, 4, 8, 0);
        repository.save(record("U1", "B1", base.plusMinutes(1),
                BadgeScanRecord.Result.GUEST_ENTRY));
        repository.save(record("U1", "B1", base.plusMinutes(2),
                BadgeScanRecord.Result.GUEST_ENTRY));
        repository.save(record("U2", "B1", base.plusMinutes(3),
                BadgeScanRecord.Result.GUEST_ENTRY));

        assertEquals(2,
                repository.countDistinctTappersForBooking("B1", base));
    }

    @Test
    void sinceFilterExcludesOlderRows() {
        LocalDateTime base = LocalDateTime.of(2026, 8, 4, 8, 0);
        repository.save(record("OLD", "B1", base,
                BadgeScanRecord.Result.GUEST_ENTRY));
        repository.save(record("NEW", "B1", base.plusHours(2),
                BadgeScanRecord.Result.GUEST_ENTRY));

        assertEquals(1, repository.countDistinctTappersForBooking(
                "B1", base.plusHours(1)));
    }

    @Test
    void hasTappedMatchesBookingUserAndTimeWindow() {
        LocalDateTime time = LocalDateTime.of(2026, 8, 4, 9, 0);
        repository.save(record("U1", "B1", time,
                BadgeScanRecord.Result.GUEST_ENTRY));

        assertTrue(repository.hasTapped("B1", "U1", time.minusSeconds(1)));
        assertFalse(repository.hasTapped("B2", "U1", time.minusSeconds(1)));
        assertFalse(repository.hasTapped("B1", "U2", time.minusSeconds(1)));
        assertFalse(repository.hasTapped("B1", "U1", time.plusSeconds(1)));
    }

    @Test
    void recentRowsAreNewestFirstAndRespectLimit() {
        LocalDateTime base = LocalDateTime.of(2026, 8, 4, 10, 0);
        repository.save(record("U1", "B1", base,
                BadgeScanRecord.Result.GUEST_ENTRY));
        repository.save(record("U2", "B1", base.plusMinutes(1),
                BadgeScanRecord.Result.GUEST_ENTRY));
        repository.save(record("U3", "B1", base.plusMinutes(2),
                BadgeScanRecord.Result.GUEST_ENTRY));

        List<BadgeScanRecord> recent = repository.findRecent(2);

        assertEquals(2, recent.size());
        assertEquals("U3", recent.get(0).getUserId());
        assertEquals("U2", recent.get(1).getUserId());
    }

    @Test
    void emptyRepositoryReturnsEmptyResults() {
        assertEquals(0, repository.countDistinctTappersForBooking(
                "none", LocalDateTime.MIN));
        assertFalse(repository.hasTapped(
                "none", "none", LocalDateTime.MIN));
        assertTrue(repository.findRecent(10).isEmpty());
    }
}
