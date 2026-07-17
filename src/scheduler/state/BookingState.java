package scheduler.state;

import scheduler.model.Booking;

import java.time.LocalDateTime;

public interface BookingState {
    void payUpfrontFee(Booking booking);

    void edit(Booking booking, LocalDateTime newStartTime, LocalDateTime newEndTime);

    void cancel(Booking booking);

    void extend(Booking booking, LocalDateTime newEndTime);

    void checkIn(Booking booking);

    void complete(Booking booking);

    void expire(Booking booking);
}