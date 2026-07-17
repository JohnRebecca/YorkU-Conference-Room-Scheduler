package scheduler.service;

import scheduler.model.Booking;
import scheduler.model.BookingStatus;
import scheduler.model.Room;
import scheduler.repository.RoomDAO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Rooms are now persisted through Saif's RoomDAO/SQLite "rooms" table instead of
 * a hardcoded in-memory list, so admin actions (add / disable / reopen a room)
 * are visible here too. The in-memory `rooms` list below is kept as a read cache
 * so the booking-side methods (isRoomAvailable, findAvailableRooms) don't need to
 * change - it's just loaded from the database once at startup instead of being
 * built by hand.
 */
public class RoomService {
    private final RoomDAO roomDAO;
    private List<Room> rooms;
    private List<Booking> bookings;

    public RoomService() {
        this.roomDAO = new RoomDAO();
        this.bookings = new ArrayList<>();
        this.rooms = new ArrayList<>(roomDAO.getAllRooms());
    }

    public void addRoom(Room room) {
        roomDAO.insertRoom(room);
        rooms.add(room);
    }

    /** Enables or disables a room (e.g. from the admin dashboard) and keeps the in-memory cache in sync. */
    public void setRoomEnabled(String roomId, boolean enabled) {
        roomDAO.updateRoomStatus(roomId, enabled);

        for (Room room : rooms) {
            if (room.getRoomId().equals(roomId)) {
                if (enabled) {
                    room.enable();
                } else {
                    room.disable();
                }
                break;
            }
        }
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