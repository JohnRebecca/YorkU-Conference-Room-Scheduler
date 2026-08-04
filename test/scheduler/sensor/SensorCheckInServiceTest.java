package scheduler.sensor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scheduler.TestSupport;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.repository.BadgeScanRepository;
import scheduler.repository.SqliteBadgeScanRepository;
import scheduler.sensor.hardware.LegacyMotionUnit;
import scheduler.sensor.hardware.MagStripeBadgeReader;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;
import scheduler.service.RoomService;
import scheduler.util.AppClock;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the heart of the Sensor Check-In module (Req5 and the check-in
 * half of Req4):
 *
 *   - the booking owner's badge opens the room (automatic check-in, deposit
 *     applied to the final cost),
 *   - other people may only tap in once the room is open,
 *   - the check-in window opens 15 minutes before the start time and closes
 *     30 minutes after it, when the deposit is forfeited,
 *   - the tapped-in number counts DISTINCT ACCOUNTS while every tap is stored.
 */
@DisplayName("SensorCheckInService (sensor check-in rules)")
class SensorCheckInServiceTest {

    private static final String ROOM_ID = "DB-1001";

    private RegisteredUser owner;
    private RegisteredUser guest;
    private Room room;
    private RoomService roomService;
    private BookingService bookingService;
    private BadgeScanRepository badgeScanRepository;
    private SensorCheckInService service;
    private SensorSimulationController simulation;

    @BeforeEach
    void setUp() {
        TestSupport.resetDatabase();

        owner = TestSupport.owner();
        guest = TestSupport.guest();
        room = TestSupport.room(ROOM_ID);

        roomService = new RoomService();
        roomService.addRoom(room);
        bookingService = new BookingService(roomService);

        LegacyMotionUnit motionUnit = new LegacyMotionUnit();
        MagStripeBadgeReader badgeReader = new MagStripeBadgeReader();
        SensorDataLog dataLog = new SensorDataLog();
        MotionUnitOccupancyAdapter occupancyAdapter = new MotionUnitOccupancyAdapter(motionUnit, dataLog);
        MagStripeBadgeAdapter badgeAdapter = new MagStripeBadgeAdapter(badgeReader, dataLog);
        badgeScanRepository = new SqliteBadgeScanRepository();

        service = new SensorCheckInService(
                occupancyAdapter, badgeAdapter, new CheckInService(),
                bookingService, badgeScanRepository, dataLog);
        simulation = new SensorSimulationController(motionUnit, badgeReader, occupancyAdapter, badgeAdapter);
    }

    @AfterEach
    void restoreRealTime() {
        AppClock.reset();
    }

    /** A confirmed (deposit paid) booking of the default room, starting in {@code minutes} minutes. */
    private Booking confirmedBookingStartingIn(long minutes) {
        return confirmedBookingStartingIn(minutes, room);
    }

    /** A confirmed booking of a specific room, so two bookings can overlap in time. */
    private Booking confirmedBookingStartingIn(long minutes, Room bookedRoom) {
        Booking booking = bookingService.createBooking(owner, bookedRoom,
                AppClock.now().plusMinutes(minutes), AppClock.now().plusMinutes(minutes + 120));
        booking.payUpfrontFee();
        return booking;
    }

    /** Registers and returns an extra room. */
    private Room extraRoom(String roomId) {
        Room extra = TestSupport.room(roomId);
        roomService.addRoom(extra);
        return extra;
    }

    /** Presents the given person's badge at the room reader and processes it. */
    private SensorCheckInService.ScanOutcome scan(Booking booking, RegisteredUser person) {
        simulation.personSwipesBadge(booking.getRoom().getRoomId(), person.getIdentificationNumber());
        return service.processBadgePresentation(booking, person);
    }

    // ---------------------------------------------------------------
    // Owner check-in via badge (Req5 + Req4)
    // ---------------------------------------------------------------

    @Test
    @DisplayName("the owner's badge inside the window checks the booking in")
    void ownerBadgeChecksIn() {
        Booking booking = confirmedBookingStartingIn(10);

        assertEquals(SensorCheckInService.ScanOutcome.OWNER_CHECKED_IN, scan(booking, owner));
        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
    }

    @Test
    @DisplayName("checking in applies the deposit to the final cost")
    void checkInAppliesDeposit() {
        Booking booking = confirmedBookingStartingIn(10);

        scan(booking, owner);

        assertTrue(booking.getDeposit().isAppliedToFinalCost());
        assertFalse(booking.getDeposit().isForfeited());
    }

    @Test
    @DisplayName("after check-in the remaining balance excludes the deposit")
    void remainingBalanceExcludesDeposit() {
        Booking booking = confirmedBookingStartingIn(10);

        scan(booking, owner);

        assertEquals(booking.getTotalCost() - booking.getDeposit().getAmount(),
                booking.getRemainingBalance(), 0.001);
    }

    @Test
    @DisplayName("the owner's own check-in counts them as tapped in")
    void ownerCountsAsTappedIn() {
        Booking booking = confirmedBookingStartingIn(10);

        scan(booking, owner);

        assertEquals(1, service.getTappedInCount(booking));
    }

    @Test
    @DisplayName("the owner scanning again after check-in is a repeat tap")
    void ownerRescanIsRepeatTap() {
        Booking booking = confirmedBookingStartingIn(10);
        scan(booking, owner);

        assertEquals(SensorCheckInService.ScanOutcome.ALREADY_TAPPED_IN, scan(booking, owner));
        assertEquals(1, service.getTappedInCount(booking), "a repeat tap must not raise the count");
    }

    // ---------------------------------------------------------------
    // Guests and the "room not open" rule
    // ---------------------------------------------------------------

    @Test
    @DisplayName("a guest tapping before the owner checks in is told the room is not open")
    void guestBeforeOwnerIsRejected() {
        Booking booking = confirmedBookingStartingIn(10);

        assertEquals(SensorCheckInService.ScanOutcome.ROOM_NOT_OPEN, scan(booking, guest));
    }

    @Test
    @DisplayName("a rejected guest tap leaves the booking untouched and stores nothing")
    void rejectedGuestTapChangesNothing() {
        Booking booking = confirmedBookingStartingIn(10);

        scan(booking, guest);

        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
        assertEquals(0, service.getTappedInCount(booking));
        assertTrue(badgeScanRepository.findRecent(50).isEmpty());
    }

    @Test
    @DisplayName("a guest tapping after the room is open is counted")
    void guestAfterOwnerIsCounted() {
        Booking booking = confirmedBookingStartingIn(10);
        scan(booking, owner);

        assertEquals(SensorCheckInService.ScanOutcome.TAPPED_IN, scan(booking, guest));
        assertEquals(2, service.getTappedInCount(booking));
    }

    @Test
    @DisplayName("a guest tapping repeatedly is only counted once")
    void guestRepeatTapsCountOnce() {
        Booking booking = confirmedBookingStartingIn(10);
        scan(booking, owner);
        scan(booking, guest);

        assertEquals(SensorCheckInService.ScanOutcome.ALREADY_TAPPED_IN, scan(booking, guest));
        assertEquals(SensorCheckInService.ScanOutcome.ALREADY_TAPPED_IN, scan(booking, guest));
        assertEquals(2, service.getTappedInCount(booking));
    }

    @Test
    @DisplayName("repeat taps are still stored, so the entry data is never lost")
    void repeatTapsAreStillStored() {
        Booking booking = confirmedBookingStartingIn(10);
        scan(booking, owner);
        scan(booking, guest);
        scan(booking, guest);
        scan(booking, guest);

        assertEquals(4, badgeScanRepository.findRecent(50).size());
        assertEquals(2, service.getTappedInCount(booking), "four taps, two people");
    }

    // ---------------------------------------------------------------
    // Badge verification
    // ---------------------------------------------------------------

    @Test
    @DisplayName("processing a scan with no badge presented is rejected")
    void missingBadgeIsRejected() {
        Booking booking = confirmedBookingStartingIn(10);

        assertThrows(IllegalArgumentException.class,
                () -> service.processBadgePresentation(booking, owner));
    }

    @Test
    @DisplayName("a badge that does not belong to the person scanning is rejected")
    void mismatchedBadgeIsRejected() {
        Booking booking = confirmedBookingStartingIn(10);
        simulation.personSwipesBadge(ROOM_ID, "999999999");

        assertThrows(IllegalArgumentException.class,
                () -> service.processBadgePresentation(booking, owner));
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
    }

    @Test
    @DisplayName("a guest sharing the owner's identification number cannot open the booking")
    void duplicateIdentificationNumberCannotImpersonateOwner() {
        RegisteredUser impostor = TestSupport.user("U9", "Impostor", owner.getIdentificationNumber());
        Booking booking = confirmedBookingStartingIn(10);

        assertEquals(SensorCheckInService.ScanOutcome.ROOM_NOT_OPEN, scan(booking, impostor));
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus(), "ownership is decided by account, not badge number");
    }

    @Test
    @DisplayName("a guest sharing the owner's identification number still counts as a second person")
    void duplicateIdentificationNumberCountsSeparately() {
        RegisteredUser sameNumberGuest = TestSupport.user("U9", "Same Number", owner.getIdentificationNumber());
        Booking booking = confirmedBookingStartingIn(10);
        scan(booking, owner);

        assertEquals(SensorCheckInService.ScanOutcome.TAPPED_IN, scan(booking, sameNumberGuest));
        assertEquals(2, service.getTappedInCount(booking));
    }

    // ---------------------------------------------------------------
    // The check-in window
    // ---------------------------------------------------------------

    @Test
    @DisplayName("a booking further away than the opening time cannot be tapped yet")
    void tooEarlyScanIsRejected() {
        Booking booking = confirmedBookingStartingIn(60 * 24 * 7);

        assertEquals(SensorCheckInService.ScanOutcome.TOO_EARLY, scan(booking, owner));
    }

    @Test
    @DisplayName("a too-early scan changes nothing and stores nothing")
    void tooEarlyScanChangesNothing() {
        Booking booking = confirmedBookingStartingIn(60 * 24 * 7);

        scan(booking, owner);

        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
        assertEquals(0, service.getTappedInCount(booking));
        assertTrue(badgeScanRepository.findRecent(50).isEmpty());
    }

    @Test
    @DisplayName("check-in opens exactly 15 minutes before the start time")
    void checkInOpensFifteenMinutesBeforeStart() {
        Booking booking = confirmedBookingStartingIn(60);

        assertEquals(booking.getStartTime().minusMinutes(SensorCheckInService.CHECK_IN_OPENS_BEFORE_MINUTES),
                service.checkInOpensAt(booking));
    }

    @Test
    @DisplayName("isTooEarly flips at the boundary of the opening time")
    void isTooEarlyBoundary() {
        Booking justOutside = confirmedBookingStartingIn(16);
        Booking justInside = confirmedBookingStartingIn(14, extraRoom("LAS-2045"));

        assertTrue(service.isTooEarly(justOutside), "16 minutes away is still too early");
        assertFalse(service.isTooEarly(justInside), "14 minutes away is inside the window");
    }

    @Test
    @DisplayName("the owner scanning more than 30 minutes late loses the deposit")
    void lateOwnerScanForfeitsDeposit() {
        Booking booking = confirmedBookingStartingIn(10);

        AppClock.advance(Duration.ofMinutes(45));

        assertEquals(SensorCheckInService.ScanOutcome.OWNER_TOO_LATE, scan(booking, owner));
        assertEquals(BookingStatus.EXPIRED, booking.getStatus());
        assertTrue(booking.getDeposit().isForfeited());
        assertFalse(booking.getDeposit().isAppliedToFinalCost());
    }

    @Test
    @DisplayName("the documented window constants are 15 minutes before and 30 minutes after")
    void windowConstants() {
        assertEquals(30, SensorCheckInService.CHECK_IN_WINDOW_MINUTES);
        assertEquals(15, SensorCheckInService.CHECK_IN_OPENS_BEFORE_MINUTES);
    }

    // ---------------------------------------------------------------
    // Online check-in
    // ---------------------------------------------------------------

    @Test
    @DisplayName("online check-in inside the window checks in and applies the deposit")
    void onlineCheckInSucceedsInsideWindow() {
        Booking booking = confirmedBookingStartingIn(10);

        service.checkInOnline(booking);

        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
        assertTrue(booking.getDeposit().isAppliedToFinalCost());
    }

    @Test
    @DisplayName("online check-in before the window opens is refused")
    void onlineCheckInTooEarlyIsRefused() {
        Booking booking = confirmedBookingStartingIn(60 * 24);

        assertThrows(IllegalArgumentException.class, () -> service.checkInOnline(booking));
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
    }

    @Test
    @DisplayName("online check-in does not count anyone as tapped in")
    void onlineCheckInDoesNotCountAsTap() {
        Booking booking = confirmedBookingStartingIn(10);

        service.checkInOnline(booking);

        assertEquals(0, service.getTappedInCount(booking),
                "the tapped-in number comes only from badge scans");
    }

    @Test
    @DisplayName("online check-in after the window closes forfeits the deposit")
    void onlineCheckInTooLateForfeitsDeposit() {
        Booking booking = confirmedBookingStartingIn(10);
        AppClock.advance(Duration.ofMinutes(45));

        assertThrows(RuntimeException.class, () -> service.checkInOnline(booking));
        assertEquals(BookingStatus.EXPIRED, booking.getStatus());
        assertTrue(booking.getDeposit().isForfeited());
    }

    // ---------------------------------------------------------------
    // Expiry sweep (Req4)
    // ---------------------------------------------------------------

    @Test
    @DisplayName("the sweep expires a confirmed booking whose window has closed")
    void sweepExpiresOverdueBooking() {
        Booking booking = confirmedBookingStartingIn(10);
        AppClock.advance(Duration.ofMinutes(45));

        List<Booking> expired = service.expireOverdueBookings();

        assertEquals(1, expired.size());
        assertTrue(expired.contains(booking));
        assertEquals(BookingStatus.EXPIRED, booking.getStatus());
        assertTrue(booking.getDeposit().isForfeited());
    }

    @Test
    @DisplayName("the sweep leaves upcoming bookings alone")
    void sweepIgnoresUpcomingBookings() {
        Booking booking = confirmedBookingStartingIn(120);

        assertTrue(service.expireOverdueBookings().isEmpty());
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
        assertFalse(booking.getDeposit().isForfeited());
    }

    @Test
    @DisplayName("the sweep leaves already checked-in bookings alone")
    void sweepIgnoresCheckedInBookings() {
        Booking booking = confirmedBookingStartingIn(10);
        scan(booking, owner);

        AppClock.advance(Duration.ofMinutes(45));

        assertTrue(service.expireOverdueBookings().isEmpty());
        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
        assertTrue(booking.getDeposit().isAppliedToFinalCost());
    }

    @Test
    @DisplayName("the sweep does not expire a booking that is still inside its window")
    void sweepRespectsTheThirtyMinuteWindow() {
        Booking booking = confirmedBookingStartingIn(10);

        AppClock.advance(Duration.ofMinutes(20));

        assertTrue(service.expireOverdueBookings().isEmpty(), "still 20 minutes inside the window");
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
    }

    // ---------------------------------------------------------------
    // Wiring
    // ---------------------------------------------------------------

    @Test
    @DisplayName("the service exposes the collaborators the GUI needs")
    void serviceExposesCollaborators() {
        assertNotNull(service.getOccupancySensor());
        assertNotNull(service.getBadgeScanner());
        assertNotNull(service.getBadgeScanRepository());
        assertNotNull(service.getOccupancySensor().getSensorDescription());
        assertNotNull(service.getBadgeScanner().getScannerDescription());
    }
}
