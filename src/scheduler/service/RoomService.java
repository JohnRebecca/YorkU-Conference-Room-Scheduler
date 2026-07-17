package scheduler.service;

import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.model.Room;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private List<Room> rooms;
    private List<Booking> bookings;

    public RoomService() {
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addBookingRecord(Booking booking) {
        bookings.add(booking);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public boolean isRoomAvailable(Room room, LocalDateTime startTime, LocalDateTime endTime) {
        return isRoomAvailable(room, startTime, endTime, null);
    }

    public boolean isRoomAvailable(Room room, LocalDateTime startTime, LocalDateTime endTime, Booking bookingToIgnore) {
        if (!room.isAvailableForBooking()) {
            return false;
        }

        for (Booking booking : bookings) {
            if (bookingToIgnore != null && booking.getBookingId().equals(bookingToIgnore.getBookingId())) {
                continue;
            }

            if (!booking.getRoom().getRoomId().equals(room.getRoomId())) {
                continue;
            }

            if (booking.getStatus() == BookingStatus.CANCELLED || booking.getStatus() == BookingStatus.EXPIRED) {
                continue;
            }

            boolean overlaps = startTime.isBefore(booking.getEndTime()) && endTime.isAfter(booking.getStartTime());

            if (overlaps) {
                return false;
            }
        }

        return true;
    }

    public List<Room> findAvailableRooms(LocalDateTime startTime, LocalDateTime endTime) {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (isRoomAvailable(room, startTime, endTime)) {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }
}