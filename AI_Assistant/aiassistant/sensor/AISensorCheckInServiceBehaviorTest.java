package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.database.DatabaseManager;
import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.model.VerificationMode;
import scheduler.repository.BadgeScanRepository;
import scheduler.sensor.BadgeScanRecord;
import scheduler.sensor.BadgeScanner;
import scheduler.sensor.OccupancySensor;
import scheduler.sensor.SensorCheckInService;
import scheduler.sensor.SensorDataLog;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;
import scheduler.service.RoomService;
import scheduler.util.AppClock;

class AISensorCheckInServiceBehaviorTest {

    private MutableScanner scanner;
    private MemoryBadgeRepository repository;
    private SensorDataLog log;
    private BookingService bookingService;
    private SensorCheckInService service;
    private RegisteredUser owner;
    private RegisteredUser guest;
    private Room room;

    @BeforeEach
    void prepareFixture() {
        DatabaseManager.initializeDatabase();
        AppClock.reset();
        scanner = new MutableScanner();
        repository = new MemoryBadgeRepository();
        log = new SensorDataLog();
        bookingService = new BookingService(new RoomService());
        service = new SensorCheckInService(
                new AlwaysOccupiedSensor(),
                scanner,
                new CheckInService(),
                bookingService,
                repository,
                log
        );
        owner = user("owner", "Owner User", "OWNER-ID");
        guest = user("guest", "Guest User", "GUEST-ID");
        room = new Room("AI-ROOM", 10, "AI Building", "Floor 1");
    }

    @AfterEach
    void restoreClock() {
        AppClock.reset();
    }

    private RegisteredUser user(String id, String name, String badge) {
        AccountType type = new AccountType(
                "student-" + id, "Student", 20.0, VerificationMode.UNIVERSITY);
        return new RegisteredUser(
                id, name, id + "@example.com", "hash",
                AccountStatus.ACTIVE, AppClock.now(),
                badge, true, type);
    }

    private Booking confirmedBooking(int startsInMinutes) {
        Booking booking = new Booking(
                "B-" + startsInMinutes + "-" + System.nanoTime(),
                owner,
                room,
                AppClock.now().plusMinutes(startsInMinutes),
                AppClock.now().plusMinutes(startsInMinutes + 60));
        booking.payUpfrontFee();
        bookingService.getAllBookings().add(booking);
        return booking;
    }

    @Test
    void ownerScanWithinWindowChecksInAndPersistsOwnerRecord() {
        Booking booking = confirmedBooking(5);
        scanner.nextBadge = owner.getIdentificationNumber();

        SensorCheckInService.ScanOutcome outcome =
                service.processBadgePresentation(booking, owner);

        assertEquals(SensorCheckInService.ScanOutcome.OWNER_CHECKED_IN, outcome);
        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
        assertTrue(booking.getDeposit().isAppliedToFinalCost());
        assertEquals(1, repository.records.size());
        assertEquals(BadgeScanRecord.Result.OWNER_CHECK_IN,
                repository.records.get(0).getResult());
    }

    @Test
    void guestCannotOpenConfirmedRoom() {
        Booking booking = confirmedBooking(5);
        scanner.nextBadge = guest.getIdentificationNumber();

        SensorCheckInService.ScanOutcome outcome =
                service.processBadgePresentation(booking, guest);

        assertEquals(SensorCheckInService.ScanOutcome.ROOM_NOT_OPEN, outcome);
        assertTrue(repository.records.isEmpty());
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
    }

    @Test
    void guestFirstTapAfterOwnerCheckInIsCounted() {
        Booking booking = confirmedBooking(5);
        scanner.nextBadge = owner.getIdentificationNumber();
        service.processBadgePresentation(booking, owner);
        scanner.nextBadge = guest.getIdentificationNumber();

        SensorCheckInService.ScanOutcome outcome =
                service.processBadgePresentation(booking, guest);

        assertEquals(SensorCheckInService.ScanOutcome.TAPPED_IN, outcome);
        assertEquals(2, service.getTappedInCount(booking));
    }

    @Test
    void repeatedGuestTapIsRecordedButNotCountedTwice() {
        Booking booking = confirmedBooking(5);
        scanner.nextBadge = owner.getIdentificationNumber();
        service.processBadgePresentation(booking, owner);
        scanner.nextBadge = guest.getIdentificationNumber();
        service.processBadgePresentation(booking, guest);

        SensorCheckInService.ScanOutcome second =
                service.processBadgePresentation(booking, guest);

        assertEquals(SensorCheckInService.ScanOutcome.ALREADY_TAPPED_IN, second);
        assertEquals(2, service.getTappedInCount(booking));
        assertEquals(3, repository.records.size());
    }

    @Test
    void unreadableBadgeThrowsAndLogsFailure() {
        Booking booking = confirmedBooking(5);
        scanner.nextBadge = null;

        IllegalArgumentException error = assertThrows(
                IllegalArgumentException.class,
                () -> service.processBadgePresentation(booking, owner));

        assertTrue(error.getMessage().contains("could not read"));
        assertTrue(log.getReadings().stream()
                .anyMatch(r -> r.getDetail().contains("no badge readable")));
    }

    @Test
    void badgeBelongingToDifferentAccountIsRejected() {
        Booking booking = confirmedBooking(5);
        scanner.nextBadge = "SOMEONE-ELSE";

        assertThrows(IllegalArgumentException.class,
                () -> service.processBadgePresentation(booking, owner));
        assertTrue(repository.records.isEmpty());
    }

    @Test
    void scanBeforeOpeningTimeReturnsTooEarlyWithoutPersistence() {
        Booking booking = confirmedBooking(60);
        scanner.nextBadge = owner.getIdentificationNumber();

        assertEquals(SensorCheckInService.ScanOutcome.TOO_EARLY,
                service.processBadgePresentation(booking, owner));
        assertTrue(repository.records.isEmpty());
    }

    @Test
    void ownerAfterThirtyMinuteDeadlineExpiresAndForfeitsDeposit() {
        Booking booking = confirmedBooking(1);
        AppClock.advance(Duration.ofMinutes(32));
        scanner.nextBadge = owner.getIdentificationNumber();

        assertEquals(SensorCheckInService.ScanOutcome.OWNER_TOO_LATE,
                service.processBadgePresentation(booking, owner));
        assertEquals(BookingStatus.EXPIRED, booking.getStatus());
        assertTrue(booking.getDeposit().isForfeited());
    }

    @Test
    void onlineCheckInBeforeOpeningThrows() {
        Booking booking = confirmedBooking(90);

        assertThrows(IllegalArgumentException.class,
                () -> service.checkInOnline(booking));
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
    }

    @Test
    void onlineCheckInWithinWindowChangesStateWithoutBadgeRecord() {
        Booking booking = confirmedBooking(10);

        service.checkInOnline(booking);

        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
        assertTrue(repository.records.isEmpty());
    }

    @Test
    void expirySweepOnlyExpiresOverdueConfirmedBookings() {
        Booking overdue = confirmedBooking(1);
        Booking future = confirmedBooking(90);
        AppClock.advance(Duration.ofMinutes(40));

        List<Booking> expired = service.expireOverdueBookings();

        assertTrue(expired.contains(overdue));
        assertFalse(expired.contains(future));
        assertEquals(BookingStatus.EXPIRED, overdue.getStatus());
        assertEquals(BookingStatus.CONFIRMED, future.getStatus());
    }

    @Test
    void openingMomentIsFifteenMinutesBeforeStart() {
        Booking booking = confirmedBooking(45);

        assertEquals(booking.getStartTime().minusMinutes(15),
                service.checkInOpensAt(booking));
        assertTrue(service.isTooEarly(booking));
    }

    @Test
    void gettersExposeInjectedDependencies() {
        assertSame(scanner, service.getBadgeScanner());
        assertSame(repository, service.getBadgeScanRepository());
        assertNotNull(service.getOccupancySensor());
    }

    private static final class AlwaysOccupiedSensor implements OccupancySensor {
        @Override
        public boolean isOccupancyDetected(String roomId) {
            return true;
        }

        @Override
        public String getSensorDescription() {
            return "AI occupancy sensor";
        }
    }

    private static final class MutableScanner implements BadgeScanner {
        String nextBadge;

        @Override
        public String scanBadge(String roomId) {
            return nextBadge;
        }

        @Override
        public String getScannerDescription() {
            return "AI mutable scanner";
        }
    }

    private static final class MemoryBadgeRepository
            implements BadgeScanRepository {
        final List<BadgeScanRecord> records = new ArrayList<>();

        @Override
        public void save(BadgeScanRecord record) {
            records.add(record);
        }

        @Override
        public int countDistinctTappersForBooking(
                String bookingId, LocalDateTime since) {
            Set<String> users = new HashSet<>();
            for (BadgeScanRecord record : records) {
                if (record.getBookingId().equals(bookingId)
                        && !record.getScannedAt().isBefore(since)) {
                    users.add(record.getUserId());
                }
            }
            return users.size();
        }

        @Override
        public boolean hasTapped(
                String bookingId, String userId, LocalDateTime since) {
            return records.stream().anyMatch(record ->
                    record.getBookingId().equals(bookingId)
                    && record.getUserId().equals(userId)
                    && !record.getScannedAt().isBefore(since));
        }

        @Override
        public List<BadgeScanRecord> findRecent(int limit) {
            int from = Math.max(0, records.size() - limit);
            return new ArrayList<>(records.subList(from, records.size()));
        }
    }
}
