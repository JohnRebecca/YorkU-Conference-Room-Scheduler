package scheduler;

import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.Booking;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.model.VerificationMode;

import java.time.LocalDateTime;

/**
 * Shared object builders for tests, so every test class constructs users,
 * rooms, and bookings the same consistent way instead of duplicating
 * boilerplate. Not a test class itself - contains no @Test methods.
 */
public final class TestFixtures {

    private TestFixtures() {
    }

    public static AccountType studentType() {
        return new AccountType("student", "Student", 20.00, VerificationMode.UNIVERSITY);
    }

    public static AccountType facultyType() {
        return new AccountType("faculty", "Faculty", 30.00, VerificationMode.UNIVERSITY);
    }

    public static AccountType partnerType() {
        return new AccountType("partner", "Partner", 50.00, VerificationMode.PARTNER);
    }

    public static RegisteredUser studentUser() {
        return new RegisteredUser(
                "U001", "Test Student", "student@yorku.ca", "hashedpw",
                AccountStatus.ACTIVE, LocalDateTime.now(),
                "216000000", true, studentType()
        );
    }

    public static RegisteredUser secondStudentUser() {
        return new RegisteredUser(
                "U002", "Second Student", "student2@yorku.ca", "hashedpw",
                AccountStatus.ACTIVE, LocalDateTime.now(),
                "216000001", true, studentType()
        );
    }

    public static Room room() {
        return new Room("DB-1001", 40, "DB Building", "First Floor");
    }

    public static Room secondRoom() {
        return new Room("LAS-2045", 25, "Lassonde Building", "Second Floor");
    }

    /** A booking starting 1 day from now, lasting 1 hour, in the default PendingPayment state. */
    public static Booking pendingBooking() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        return new Booking("B-TEST-1", studentUser(), room(), start, start.plusHours(1));
    }

    public static Booking pendingBooking(RegisteredUser user, Room room, LocalDateTime start, LocalDateTime end) {
        return new Booking("B-TEST-CUSTOM", user, room, start, end);
    }

    /** A booking already paid and moved to CONFIRMED, for tests targeting later states. */
    public static Booking confirmedBooking() {
        Booking booking = pendingBooking();
        booking.payUpfrontFee();
        return booking;
    }
}
