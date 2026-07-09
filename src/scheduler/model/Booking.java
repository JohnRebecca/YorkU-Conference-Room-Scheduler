package scheduler.model;

import scheduler.state.BookingState;
import scheduler.state.PendingPaymentState;

import java.time.Duration;
import java.time.LocalDateTime;

public class Booking {
    private String bookingId;
    private RegisteredUser user;
    private Room room;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private BookingStatus status;
    private double hourlyRate;
    private double totalCost;
    private Deposit deposit;

    private BookingState state;

    public Booking(String bookingId, RegisteredUser user, Room room, LocalDateTime startTime, LocalDateTime endTime) {
        this.bookingId = bookingId;
        this.user = user;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hourlyRate = user.getAccountType().getHourlyRate();
        this.totalCost = calculateTotalCost();
        this.deposit = new Deposit(hourlyRate);
        this.status = BookingStatus.PENDING_PAYMENT;
        this.state = new PendingPaymentState();
    }

    public String getBookingId() {
        return bookingId;
    }

    public RegisteredUser getUser() {
        return user;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    /**
     * Amount still owed at checkout. If the deposit was paid and not forfeited,
     * it counts toward the total (Req4: "applied to the final cost"). If it was
     * never paid, or was forfeited for a missed check-in, the full total is still owed.
     */
    public double getRemainingBalance() {
        if (deposit.isPaid() && !deposit.isForfeited()) {
            return Math.max(0, totalCost - deposit.getAmount());
        }
        return totalCost;
    }

    public BookingState getState() {
        return state;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public void setState(BookingState state) {
        this.state = state;
    }

    public void updateTime(LocalDateTime newStartTime, LocalDateTime newEndTime) {
        this.startTime = newStartTime;
        this.endTime = newEndTime;
        this.totalCost = calculateTotalCost();
    }

    public void extendEndTime(LocalDateTime newEndTime) {
        this.endTime = newEndTime;
        this.totalCost = calculateTotalCost();
    }

    public double calculateTotalCost() {
        long minutes = Duration.between(startTime, endTime).toMinutes();

        if (minutes <= 0) {
            throw new IllegalArgumentException("Booking end time must be after start time.");
        }

        long hours = minutes / 60;

        if (minutes % 60 != 0) {
            hours++;
        }

        return hours * hourlyRate;
    }

    public void payUpfrontFee() {
        state.payUpfrontFee(this);
    }

    public void edit(LocalDateTime newStartTime, LocalDateTime newEndTime) {
        state.edit(this, newStartTime, newEndTime);
    }

    public void cancel() {
        state.cancel(this);
    }

    public void extend(LocalDateTime newEndTime) {
        state.extend(this, newEndTime);
    }

    public void checkIn() {
        state.checkIn(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void expire() {
        state.expire(this);
    }
}