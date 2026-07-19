package scheduler.database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import scheduler.util.PasswordHasher;

public final class DatabaseManager {

    private static final String DATABASE_FOLDER = "data";
    private static final String DATABASE_PATH = DATABASE_FOLDER + File.separator + "scheduler.db";
    private static final String DATABASE_URL = "jdbc:sqlite:" + DATABASE_PATH;

    private DatabaseManager() {
    }

    public static Connection getConnection() throws SQLException {
        ensureDatabaseDirectory();

        Connection connection = DriverManager.getConnection(DATABASE_URL);

        try (Statement statement = connection.createStatement()) {
            statement.execute("PRAGMA foreign_keys = ON");
        }

        return connection;
    }

    public static void initializeDatabase() {
        ensureDatabaseDirectory();

        String createAccountTypes = """
            CREATE TABLE IF NOT EXISTS account_types (
                account_type_id TEXT PRIMARY KEY,
                name TEXT NOT NULL UNIQUE COLLATE NOCASE,
                hourly_rate REAL NOT NULL CHECK (hourly_rate >= 0),
                verification_mode TEXT NOT NULL
                    CHECK (verification_mode IN ('UNIVERSITY', 'PARTNER', 'NONE'))
            )
            """;


        String createUsers = """
            CREATE TABLE IF NOT EXISTS users (
                user_id TEXT PRIMARY KEY,
                full_name TEXT NOT NULL,
                email TEXT NOT NULL UNIQUE COLLATE NOCASE,
                password_hash TEXT NOT NULL,
                account_status TEXT NOT NULL
                    CHECK (
                        account_status IN (
                            'PENDING_VERIFICATION',
                            'ACTIVE',
                            'SUSPENDED',
                            'DISABLED'
                        )
                    ),
                created_at TEXT NOT NULL,
                identification_number TEXT NOT NULL,
                is_verified INTEGER NOT NULL DEFAULT 0
                    CHECK (is_verified IN (0, 1)),
                account_type_id TEXT NOT NULL,

                FOREIGN KEY (account_type_id)
                    REFERENCES account_types(account_type_id)
                    ON UPDATE CASCADE
                    ON DELETE RESTRICT
            )
            """;


        // Sensor check-in module (Req5): every ID badge scan at a room reader
        // is stored - who scanned, at which room, when, and whether it was the
        // booking owner (auto check-in) or a guest entry.
        String createBadgeScans = """
            CREATE TABLE IF NOT EXISTS badge_scans (
                scan_id INTEGER PRIMARY KEY AUTOINCREMENT,
                user_id TEXT NOT NULL,
                full_name TEXT NOT NULL,
                identification_number TEXT NOT NULL,
                room_id TEXT NOT NULL,
                booking_id TEXT NOT NULL,
                scanned_at TEXT NOT NULL,
                result TEXT NOT NULL
                    CHECK (result IN ('OWNER_CHECK_IN', 'GUEST_ENTRY'))
            )
            """;

        String createAdministrators = """
            CREATE TABLE IF NOT EXISTS administrators (
                admin_id INTEGER PRIMARY KEY,
                name TEXT NOT NULL,
                email TEXT NOT NULL UNIQUE,
                password TEXT NOT NULL
            )
            """;


        String createRooms = """
            CREATE TABLE IF NOT EXISTS rooms (
                room_id TEXT PRIMARY KEY,
                capacity INTEGER NOT NULL CHECK (capacity > 0),
                building TEXT NOT NULL,
                location TEXT NOT NULL,
                enabled INTEGER NOT NULL DEFAULT 1
                    CHECK (enabled IN (0, 1)),
                closed_for_maintenance INTEGER NOT NULL DEFAULT 0
                    CHECK (closed_for_maintenance IN (0, 1))
            )
            """;


        String seedAccountTypes = """
            INSERT OR IGNORE INTO account_types (
                account_type_id,
                name,
                hourly_rate,
                verification_mode
            )
            VALUES
                ('student', 'Student', 20.00, 'UNIVERSITY'),
                ('faculty', 'Faculty', 30.00, 'UNIVERSITY'),
                ('staff', 'Staff', 40.00, 'UNIVERSITY'),
                ('partner', 'Partner', 50.00, 'PARTNER'),
                ('admin', 'Admin', 0.00, 'NONE')
            """;


        String seedAdministrators = """
            INSERT OR IGNORE INTO administrators (
                admin_id,
                name,
                email,
                password
            )
            VALUES (1, 'System Admin', 'admin@yorku.ca', 'Admin123!')
            """;


        String seedRooms = """
            INSERT OR IGNORE INTO rooms (
                room_id,
                capacity,
                building,
                location,
                enabled,
                closed_for_maintenance
            )
            VALUES
                ('DB-1001', 40, 'DB Building', 'First Floor', 1, 0),
                ('LAS-2045', 25, 'Lassonde Building', 'Second Floor', 1, 0),
                ('VH-3002', 60, 'Vari Hall', 'Third Floor', 0, 0),
                ('ACW-109', 18, 'Accolade West', 'Main Floor', 1, 0)
            """;


        String seedAdminUser = """
            INSERT OR IGNORE INTO users (
                user_id,
                full_name,
                email,
                password_hash,
                account_status,
                created_at,
                identification_number,
                is_verified,
                account_type_id
            )
            VALUES (?, 'System Admin', 'admin@yorku.ca', ?, 'ACTIVE', ?, 'ADMIN-001', 1, 'admin')
            """;


        String seedChiefEventCoordinatorUser = """
            INSERT OR IGNORE INTO users (
                user_id,
                full_name,
                email,
                password_hash,
                account_status,
                created_at,
                identification_number,
                is_verified,
                account_type_id
            )
            VALUES (?, 'Chief Event Coordinator', 'chief.event.coordinator@yorku.ca', ?, 'ACTIVE', ?, 'CEC-001', 1, 'admin')
            """;


        try (
                Connection connection = getConnection();
                Statement statement = connection.createStatement()
        ) {

            statement.execute(createAccountTypes);
            statement.execute(createUsers);

            statement.execute(createAdministrators);
            statement.execute(createRooms);
            statement.execute(createBadgeScans);

            statement.executeUpdate(seedAccountTypes);
            statement.executeUpdate(seedAdministrators);
            statement.executeUpdate(seedRooms);

            try (
                    var adminStatement = connection.prepareStatement(seedAdminUser)
            ) {
                adminStatement.setString(1, "system-admin");
                adminStatement.setString(2, PasswordHasher.hash("Admin123!"));
                adminStatement.setString(3, java.time.LocalDateTime.now().toString());
                adminStatement.executeUpdate();
            }

            try (
                    var chiefStatement = connection.prepareStatement(seedChiefEventCoordinatorUser)
            ) {
                chiefStatement.setString(1, "chief-event-coordinator");
                chiefStatement.setString(2, PasswordHasher.hash("Chief123!"));
                chiefStatement.setString(3, java.time.LocalDateTime.now().toString());
                chiefStatement.executeUpdate();
            }

        } catch (SQLException exception) {

            throw new IllegalStateException(
                    "Could not initialize the SQLite database.",
                    exception
            );
        }
    }


    private static void ensureDatabaseDirectory() {

        File directory = new File(DATABASE_FOLDER);

        if (!directory.exists() && !directory.mkdirs()) {

            throw new IllegalStateException(
                    "Could not create the database directory."
            );
        }
    }
}