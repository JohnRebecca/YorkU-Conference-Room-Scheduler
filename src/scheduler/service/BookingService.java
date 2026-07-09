package scheduler.service;

import scheduler.exception.InvalidBookingActionException;
import scheduler.exception.RoomUnavailableException;
import scheduler.model.Booking;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingService {
    private List<Booking> bookings;
    private RoomService roomService;

    public BookingService(RoomService roomService) {
        this.bookings = new ArrayList<>();
        this.roomService = roomService;
    }

    public Booking createBooking(RegisteredUser user, Room room, LocalDateTime startTime, LocalDateTime endTime) {
        if (room == null) {
            throw new IllegalArgumentException("A room must be selected to create a booking.");
        }

        validateAccountType(user);
        validateBookingTime(startTime, endTime);

        if (!roomService.isRoomAvailable(room, startTime, endTime)) {
            throw new RoomUnavailableException("Room is not available for the selected time.");
        }

        String bookingId = UUID.randomUUID().toString();

        Booking booking = new Booking(bookingId, user, room, startTime, endTime);

        bookings.add(booking);
        roomService.addBookingRecord(booking);

        return booking;
    }

    public void payUpfrontFee(Booking booking) {
        booking.payUpfrontFee();
    }

    public void editBooking(Booking booking, LocalDateTime newStartTime, LocalDateTime newEndTime) {
        validateBookingTime(newStartTime, newEndTime);

        if (!roomService.isRoomAvailable(booking.getRoom(), newStartTime, newEndTime, booking)) {
            throw new RoomUnavailableException("Room is not available for the updated time.");
        }

        booking.edit(newStartTime, newEndTime);
    }

    public void cancelBooking(Booking booking) {
        booking.cancel();
    }

    public void extendBooking(Booking booking, LocalDateTime newEndTime) {
        if (!newEndTime.isAfter(booking.getEndTime())) {
            throw new InvalidBookingActionException("New end time must be after current booking end time.");
        }

        if (!roomService.isRoomAvailable(booking.getRoom(), booking.getEndTime(), newEndTime, booking)) {
            throw new RoomUnavailableException("Room is not available for the extension period.");
        }

        booking.extend(newEndTime);
    }

    public void checkInBooking(Booking booking) {
        booking.checkIn();
    }

    public void completeBooking(Booking booking) {
        booking.complete();
    }

    public List<Booking> getBookingsForUser(RegisteredUser user) {
        List<Booking> userBookings = new ArrayList<>();

        for (Booking booking : bookings) {
            if (booking.getUser().getUserId().equals(user.getUserId())) {
                userBookings.add(booking);
            }
        }

        return userBookings;
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }

    /**
     * Shared time validation for both create and edit.
     * Req3 edge cases: reject null/backwards/zero-length ranges, and reject any
     * booking whose start time is not strictly in the future 
     */
    private void validateBookingTime(LocalDateTime startTime, LocalDateTime endTime) {
        if (startTime == null || endTime == null) {
            throw new IllegalArgumentException("Start time and end time are required.");
        }

        if (!endTime.isAfter(startTime)) {
            throw new IllegalArgumentException("End time must be after start time.");
        }

        if (!startTime.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Booking start time must be in the future.");
        }
    }

    /** Req3: cost depends on account-type hourly rate, so both must be valid before a booking can be created. */
    private void validateAccountType(RegisteredUser user) {
        if (user == null || user.getAccountType() == null) {
            throw new IllegalArgumentException("A valid account type is required to book a room.");
        }

        if (user.getAccountType().getHourlyRate() <= 0) {
            throw new IllegalArgumentException("Account type has an invalid hourly rate.");
        }
    }
}