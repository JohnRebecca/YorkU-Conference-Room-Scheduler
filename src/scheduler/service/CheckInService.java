package scheduler.service;

import scheduler.model.Booking;

public class CheckInService {

    public void processCheckIn(Booking booking, boolean occupancyDetected, boolean badgeVerified) {
        if (!occupancyDetected) {
            throw new IllegalArgumentException("Occupancy was not detected by the room sensor.");
        }

        if (!badgeVerified) {
            throw new IllegalArgumentException("Badge verification failed.");
        }

        booking.checkIn();
    }

    public void markExpiredIfNoCheckIn(Booking booking) {
        booking.expire();
    }
}