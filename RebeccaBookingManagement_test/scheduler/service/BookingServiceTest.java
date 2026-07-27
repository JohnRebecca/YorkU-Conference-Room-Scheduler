package scheduler.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import scheduler.TestFixtures;
import scheduler.database.DatabaseManager;
import scheduler.exception.InvalidBookingActionException;
import scheduler.exception.RoomUnavailableException;
import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.util.AppClock;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * NOTE: BookingService is constructed with a RoomService, whose constructor
 * talks to the real SQLite database (see RoomServiceTest for details). Room
 * IDs here are also uniquely suffixed to avoid colliding across repeated runs.
 * Bookings themselves are never persisted to the database, so no cleanup is
 * needed for booking data between runs.
 */
class BookingServiceTest {

    private RoomService roomService;
    private BookingService bookingService;
    private RegisteredUser user;
    private Room room;

    @BeforeAll
    static void setUpDatabase() {
        DatabaseManager.initializeDatabase();
    }

    @BeforeEach
    void setUp() {
        roomService = new RoomService();
        bookingService = new BookingService(roomService);
        user = TestFixtures.studentUser();
        room = new Room("TEST-BS-" + System.nanoTime(), 10, "Test Building", "Test Floor");
        roomService.addRoom(room);
    }

    @AfterEach
    void resetClock() {
        AppClock.reset();
    }

    @Test
    void createBookingSucceedsForAValidFutureTime() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(1));

        assertNotNull(booking);
        assertEquals(BookingStatus.PENDING_PAYMENT, booking.getStatus());
    }

    @Test
    void createBookingThrowsWhenRoomIsNull() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        assertThrows(IllegalArgumentException.class,
                () -> bookingService.createBooking(user, null, start, start.plusHours(1)));
    }

    @Test
    void createBookingThrowsWhenStartTimeIsInThePast() {
        LocalDateTime start = LocalDateTime.now().minusDays(1);
        assertThrows(IllegalArgumentException.class,
                () -> bookingService.createBooking(user, room, start, start.plusHours(1)));
    }

    @Test
    void createBookingThrowsWhenStartTimeIsNotStrictlyInTheFuture() {
        // "Right now" should be rejected too, not just times already in the past.
        LocalDateTime start = AppClock.now();
        assertThrows(IllegalArgumentException.class,
                () -> bookingService.createBooking(user, room, start, start.plusHours(1)));
    }

    @Test
    void createBookingThrowsWhenEndTimeIsBeforeStartTime() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        assertThrows(IllegalArgumentException.class,
                () -> bookingService.createBooking(user, room, start, start.minusHours(1)));
    }

    @Test
    void createBookingThrowsWhenStartAndEndTimeAreEqual() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        assertThrows(IllegalArgumentException.class,
                () -> bookingService.createBooking(user, room, start, start));
    }

    @Test
    void createBookingThrowsWhenRoomIsDisabled() {
        room.disable();
        LocalDateTime start = LocalDateTime.now().plusDays(1);

        assertThrows(RoomUnavailableException.class,
                () -> bookingService.createBooking(user, room, start, start.plusHours(1)));
    }

    @Test
    void createBookingThrowsWhenOverlappingAnExistingBooking() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        bookingService.createBooking(user, room, start, start.plusHours(2));

        assertThrows(RoomUnavailableException.class,
                () -> bookingService.createBooking(user, room, start.plusMinutes(30), start.plusMinutes(90)));
    }

    @Test
    void createBookingCalculatesCostFromAccountHourlyRate() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(2));

        assertEquals(40.00, booking.getTotalCost());
    }

    @Test
    void editBookingSucceedsWhenNewTimeIsValidAndAvailable() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(1));

        LocalDateTime newStart = start.plusHours(3);
        bookingService.editBooking(booking, newStart, newStart.plusHours(1));

        assertEquals(newStart, booking.getStartTime());
    }

    @Test
    void editBookingThrowsWhenNewTimeOverlapsAnotherBooking() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking first = bookingService.createBooking(user, room, start, start.plusHours(1));
        Booking second = bookingService.createBooking(user, room, start.plusHours(2), start.plusHours(3));

        assertThrows(RoomUnavailableException.class,
                () -> bookingService.editBooking(second, start.plusMinutes(30), start.plusMinutes(90)));

        // First booking should be unaffected.
        assertEquals(start, first.getStartTime());
    }

    @Test
    void editBookingDoesNotFalselyConflictWithItself() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(1));

        // Editing to the exact same time should not be treated as a conflict with itself.
        assertDoesNotThrow(() -> bookingService.editBooking(booking, start, start.plusHours(1)));
    }

    @Test
    void cancelBookingMarksItCancelled() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(1));

        bookingService.cancelBooking(booking);

        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }

    @Test
    void cancelledBookingNoLongerBlocksTheRoom() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(1));
        bookingService.cancelBooking(booking);

        assertTrue(roomService.isRoomAvailable(room, start, start.plusHours(1)));
    }

    @Test
    void extendBookingThrowsWhenNewEndTimeIsNotLater() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(1));

        assertThrows(InvalidBookingActionException.class,
                () -> bookingService.extendBooking(booking, booking.getEndTime()));
    }

    @Test
    void extendBookingThrowsWhenExtensionOverlapsAnotherBooking() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(1));
        bookingService.payUpfrontFee(booking); // Confirmed, so this genuinely tests the overlap check, not payment state
        bookingService.createBooking(user, room, start.plusHours(1).plusMinutes(30), start.plusHours(2).plusMinutes(30));

        assertThrows(RoomUnavailableException.class,
                () -> bookingService.extendBooking(booking, start.plusHours(2)));
    }

    @Test
    void extendBookingSucceedsWhenRoomStillFree() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Booking booking = bookingService.createBooking(user, room, start, start.plusHours(1));
        bookingService.payUpfrontFee(booking); // must be Confirmed (not Pending Payment) before it can be extended

        bookingService.extendBooking(booking, start.plusHours(2));

        assertEquals(start.plusHours(2), booking.getEndTime());
    }

    @Test
    void getBookingsForUserOnlyReturnsThatUsersBookings() {
        RegisteredUser otherUser = TestFixtures.secondStudentUser();
        LocalDateTime start = LocalDateTime.now().plusDays(1);

        bookingService.createBooking(user, room, start, start.plusHours(1));
        bookingService.createBooking(otherUser, room, start.plusHours(2), start.plusHours(3));

        var userBookings = bookingService.getBookingsForUser(user);

        assertEquals(1, userBookings.size());
        assertEquals(user.getUserId(), userBookings.get(0).getUser().getUserId());
    }

    @Test
    void getAllBookingsIncludesEveryCreatedBooking() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        bookingService.createBooking(user, room, start, start.plusHours(1));
        bookingService.createBooking(user, room, start.plusHours(2), start.plusHours(3));

        assertEquals(2, bookingService.getAllBookings().size());
    }
}