package scheduler;

import scheduler.database.DatabaseManager;
import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.Room;
import scheduler.model.VerificationMode;
import scheduler.util.AppClock;

import java.io.File;
import java.time.LocalDateTime;

/**
 * Shared fixtures for the Sensor Check-In test suite.
 *
 * Not a test class - it only builds the users, rooms and database state the
 * tests need, so each test class stays focused on assertions.
 */
public final class TestSupport {

    public static final String DATABASE_PATH = "data" + File.separator + "scheduler.db";

    private TestSupport() {
    }

    /**
     * Gives the test a clean database and a real (non-simulated) clock.
     * Required by any test that touches rooms or badge-scan persistence.
     */
    public static void resetDatabase() {
        AppClock.reset();
        new File(DATABASE_PATH).delete();
        DatabaseManager.initializeDatabase();
    }

    public static AccountType studentType() {
        return new AccountType("student", "Student", 20.0, VerificationMode.UNIVERSITY);
    }

    public static AccountType facultyType() {
        return new AccountType("faculty", "Faculty", 30.0, VerificationMode.UNIVERSITY);
    }

    /** A verified, active account. userId is unique; identificationNumber may be shared on purpose. */
    public static RegisteredUser user(String userId, String fullName, String identificationNumber) {
        return new RegisteredUser(
                userId,
                fullName,
                userId.toLowerCase() + "@yorku.ca",
                "hashed-password",
                AccountStatus.ACTIVE,
                LocalDateTime.now(),
                identificationNumber,
                true,
                studentType());
    }

    public static RegisteredUser owner() {
        return user("U1", "Rudra Iqbal", "216000001");
    }

    public static RegisteredUser guest() {
        return user("U2", "Tasnim Nisha", "216000002");
    }

    public static Room room(String roomId) {
        return new Room(roomId, 40, "DB Building", "First Floor");
    }
}
