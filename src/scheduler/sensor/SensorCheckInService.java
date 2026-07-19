package scheduler.sensor;

import scheduler.util.AppClock;
import scheduler.exception.BookingException;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.model.RegisteredUser;
import scheduler.repository.BadgeScanRepository;
import scheduler.service.BookingService;
import scheduler.service.CheckInService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Sensor Check-In System (Req5 + the check-in half of Req4).
 *
 * Two ways into a room:
 *
 *   PHYSICAL - the ID Badge Sensor at the room. ANY registered account can
 *   scan: the badge is read through the {@link BadgeScanner} adapter, the
 *   scan (name, ID, room, time) is persisted to the database, and the room's
 *   occupancy count goes up by one. If the scanned ID belongs to the booking
 *   owner, the booking is checked in automatically; anyone else is recorded
 *   as a guest entry.
 *
 *   ONLINE - the Check In screen. The booking owner checks in from the app
 *   without hardware; the 30-minute window rule is enforced by the booking
 *   module's State Pattern either way (on time: deposit applied; late:
 *   forfeited).
 *
 * Occupancy: the {@link OccupancySensor} reports the room as occupied once
 * people have entered, but the occupancy COUNT is the number of badge scans
 * recorded for the active booking.
 */
public class SensorCheckInService {

    public static final int CHECK_IN_WINDOW_MINUTES = 30;

    /** Check-in (and badge taps) only open this many minutes before the start time. */
    public static final int CHECK_IN_OPENS_BEFORE_MINUTES = 15;

    /** Outcome of presenting a badge at a room's reader. */
    public enum ScanOutcome {
        /** The scanner is the booking owner: the booking was checked in automatically. */
        OWNER_CHECKED_IN,
        /** The room is open (owner checked in) and this first tap was counted. */
        TAPPED_IN,
        /** A repeat tap: the data was recorded, but the person was already counted. */
        ALREADY_TAPPED_IN,
        /** The owner has not checked in yet, so taps are not counted. */
        ROOM_NOT_OPEN,
        /** The owner scanned after the 30-minute window: booking expired, deposit forfeited. */
        OWNER_TOO_LATE,
        /** Scanned more than 15 minutes before the booking start: nothing happens yet. */
        TOO_EARLY
    }

    /**
     * When this app session began. Bookings live only in memory, so every
     * legitimate tap for a booking happens after launch; scans from earlier
     * runs (whose booking IDs may have been reused, e.g. B0001) are excluded.
     */
    private final LocalDateTime sessionStart = AppClock.now();

    private final OccupancySensor occupancySensor;
    private final BadgeScanner badgeScanner;
    private final CheckInService checkInService;
    private final BookingService bookingService;
    private final BadgeScanRepository badgeScanRepository;
    private final SensorDataLog dataLog;

    public SensorCheckInService(
            OccupancySensor occupancySensor,
            BadgeScanner badgeScanner,
            CheckInService checkInService,
            BookingService bookingService,
            BadgeScanRepository badgeScanRepository,
            SensorDataLog dataLog
    ) {
        this.occupancySensor = occupancySensor;
        this.badgeScanner = badgeScanner;
        this.checkInService = checkInService;
        this.bookingService = bookingService;
        this.badgeScanRepository = badgeScanRepository;
        this.dataLog = dataLog;
    }

    /**
     * Processes a badge presented at the given booking's room reader. The
     * scanning person is the account signed in at the panel; the reader
     * itself only yields the ID number on the badge, which must match that
     * account's registered identification number.
     */
    public ScanOutcome processBadgePresentation(Booking booking, RegisteredUser scanningUser) {
        String roomId = booking.getRoom().getRoomId();

        String badgeId = badgeScanner.scanBadge(roomId);

        if (badgeId == null) {
            dataLog.record(SensorReading.Source.SYSTEM, roomId, "Scan failed: no badge readable");
            throw new IllegalArgumentException("The reader could not read a badge. Try scanning again.");
        }

        if (!badgeId.equals(scanningUser.getIdentificationNumber())) {
            dataLog.record(SensorReading.Source.SYSTEM, roomId,
                    "Scan rejected: badge " + badgeId + " does not belong to " + scanningUser.getFullName());
            throw new IllegalArgumentException(
                    "Badge ID " + badgeId + " does not match your registered ID. Verification failed.");
        }

        // Req4/realism: the reader only accepts taps from 15 minutes before
        // the start time. A booking made for next week cannot be checked in
        // or tapped today.
        if (isTooEarly(booking)) {
            dataLog.record(SensorReading.Source.SYSTEM, roomId,
                    "Tap rejected for " + scanningUser.getFullName() + ": check-in opens at "
                            + checkInOpensAt(booking).format(DateTimeFormatter.ofPattern("MMM d, HH:mm")) + ".");
            return ScanOutcome.TOO_EARLY;
        }

        // Ownership is decided by ACCOUNT, not by ID number: registration does
        // not enforce unique identification numbers, so a guest whose badge
        // happens to carry the same number as the owner's must NOT be able to
        // check in someone else's booking.
        boolean isOwner = scanningUser.getUserId().equals(booking.getUser().getUserId());

        // Owner scanning a still-confirmed booking -> automatic check-in opens the room.
        if (isOwner && booking.getStatus() == BookingStatus.CONFIRMED) {
            try {
                checkInService.processCheckIn(booking, true, true);
                recordScan(booking, scanningUser, BadgeScanRecord.Result.OWNER_CHECK_IN);
                dataLog.record(SensorReading.Source.SYSTEM, roomId,
                        "Owner badge verified. Booking checked in automatically; deposit applied.");
                return ScanOutcome.OWNER_CHECKED_IN;
            } catch (BookingException | IllegalArgumentException e) {
                // Late scan: the State Pattern expired the booking and forfeited
                // the deposit. The room never opened, so the tap is not counted.
                dataLog.record(SensorReading.Source.SYSTEM, roomId,
                        "Owner badge scanned too late: " + e.getMessage());
                return ScanOutcome.OWNER_TOO_LATE;
            }
        }

        // The room is only "open" once the owner has checked in. Until then,
        // other people's taps are rejected and NOT counted (they can still
        // physically enter or leave the room).
        if (booking.getStatus() != BookingStatus.CHECKED_IN) {
            dataLog.record(SensorReading.Source.SYSTEM, roomId,
                    "Tap rejected for " + scanningUser.getFullName()
                            + ": room not open, the booking owner has not checked in yet.");
            return ScanOutcome.ROOM_NOT_OPEN;
        }

        // Room is open: every tap is stored (the data is captured each time),
        // but a person only counts towards the tapped-in number once per
        // booking - repeat taps do not increment it.
        boolean alreadyTapped = badgeScanRepository.hasTapped(
                booking.getBookingId(), scanningUser.getUserId(), sessionStart);
        recordScan(booking, scanningUser, BadgeScanRecord.Result.GUEST_ENTRY);
        dataLog.record(SensorReading.Source.SYSTEM, roomId,
                (alreadyTapped ? "Repeat tap recorded (already counted): " : "Tapped in: ")
                        + scanningUser.getFullName() + " (" + badgeId + ")");
        return alreadyTapped ? ScanOutcome.ALREADY_TAPPED_IN : ScanOutcome.TAPPED_IN;
    }

    private void recordScan(Booking booking, RegisteredUser user, BadgeScanRecord.Result result) {
        badgeScanRepository.save(new BadgeScanRecord(
                user.getUserId(),
                user.getFullName(),
                user.getIdentificationNumber(),
                booking.getRoom().getRoomId(),
                booking.getBookingId(),
                AppClock.now(),
                result
        ));
    }

    /**
     * Online check-in from the Check In screen (no hardware involved).
     * The booking module's State Pattern enforces the 30-minute rule and the
     * deposit outcome (Req4).
     */
    public void checkInOnline(Booking booking) {
        String roomId = booking.getRoom().getRoomId();

        if (isTooEarly(booking)) {
            dataLog.record(SensorReading.Source.SYSTEM, roomId,
                    "Online check-in rejected: opens at "
                            + checkInOpensAt(booking).format(DateTimeFormatter.ofPattern("MMM d, HH:mm")) + ".");
            throw new IllegalArgumentException("Check-in opens " + CHECK_IN_OPENS_BEFORE_MINUTES
                    + " minutes before the start time (at "
                    + checkInOpensAt(booking).format(DateTimeFormatter.ofPattern("MMM d, HH:mm")) + ").");
        }

        try {
            checkInService.processCheckIn(booking, true, true);
            dataLog.record(SensorReading.Source.SYSTEM, roomId,
                    "Online check-in confirmed for " + booking.getUser().getEmail()
                            + ". Deposit applied to final cost.");
        } catch (BookingException | IllegalArgumentException e) {
            dataLog.record(SensorReading.Source.SYSTEM, roomId,
                    "Online check-in rejected: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Tapped-in count for a booking = number of DISTINCT accounts that have
     * tapped their badge for it (user IDs are unique even when two accounts
     * were registered with the same identification number). Every tap is stored in the database, but a
     * person tapping repeatedly is only counted once per booking. The
     * occupancy sensor's OCCUPIED / EMPTY reading is separate and comes from
     * people physically entering and leaving the room.
     */
    public int getTappedInCount(Booking booking) {
        return badgeScanRepository.countDistinctTappersForBooking(
                booking.getBookingId(), sessionStart);
    }

    /**
     * Expires every confirmed booking whose check-in window has closed
     * (start time + 30 minutes in the past), forfeiting the deposit (Req4).
     */
    public List<Booking> expireOverdueBookings() {
        List<Booking> expired = new ArrayList<>();
        LocalDateTime now = AppClock.now();

        for (Booking booking : bookingService.getAllBookings()) {
            if (booking.getStatus() != BookingStatus.CONFIRMED) {
                continue;
            }

            LocalDateTime windowClose = booking.getStartTime().plusMinutes(CHECK_IN_WINDOW_MINUTES);

            if (now.isAfter(windowClose)) {
                checkInService.markExpiredIfNoCheckIn(booking);
                expired.add(booking);
                dataLog.record(SensorReading.Source.SYSTEM, booking.getRoom().getRoomId(),
                        "No check-in within " + CHECK_IN_WINDOW_MINUTES
                                + " min of start. Booking expired, deposit forfeited.");
            }
        }

        return expired;
    }

    /** True if it is more than 15 minutes before the booking's start time. */
    public boolean isTooEarly(Booking booking) {
        return AppClock.now().isBefore(checkInOpensAt(booking));
    }

    /** The moment the check-in window opens: start time minus 15 minutes. */
    public LocalDateTime checkInOpensAt(Booking booking) {
        return booking.getStartTime().minusMinutes(CHECK_IN_OPENS_BEFORE_MINUTES);
    }

    public OccupancySensor getOccupancySensor() {
        return occupancySensor;
    }

    public BadgeScanner getBadgeScanner() {
        return badgeScanner;
    }

    public BadgeScanRepository getBadgeScanRepository() {
        return badgeScanRepository;
    }
}
