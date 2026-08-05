
# YorkU Conference Room Scheduler

A GUI-based Java application for booking and managing conference/meeting rooms at York University, built for students, faculty, staff, and external partners. Developed as a group project for EECS3311.

## Features

- **Accounts & Authentication** — Register with a unique email and a strong password (uppercase, lowercase, numbers, symbols). Account types (Student, Faculty, Staff, Partner) each carry their own hourly booking rate, with the flexibility to add new types. University accounts require verification.
- **Booking Management** — Browse available rooms, book by date/time and duration, and edit, cancel, or extend a booking before it starts (or before it expires, for extensions). All time-based rules (past-date rejection, overlap detection, the 30-minute check-in grace period) are enforced server-side, not just in the UI.
- **Deposit & Payment** — One hour's fee is charged upfront as a deposit when booking. Pay it with a credit card, debit card, or institutional billing directly from the booking card. If check-in doesn't happen within 30 minutes of the start time, the deposit is forfeited; otherwise it's applied to the final cost.
- **Check-In** — Two ways to check in: an inline occupancy/badge confirmation on the booking card, or a simulated sensor pipeline (occupancy sensor + ID badge scanner, wrapped behind an Adapter pattern) with its own demo clock to fast-forward time for testing the grace-period rule.
- **Room Management (Admin)** — Add, enable, disable, or temporarily close a room. Reachable either from inside the app (after logging in and clicking "Room Management," which then asks for admin credentials) or directly from the login screen itself, since administrators aren't regular accounts and shouldn't have to log in twice.
- **Chief Event Coordinator** — The sole account able to auto-generate new administrator accounts, from inside the Room Management screen.
- **Profile** — View and update account details after logging in.

## Tech Stack

- Java (Swing for the UI)
- SQLite, via the [sqlite-jdbc](https://github.com/xerial/sqlite-jdbc) driver, for account, room, and administrator persistence
- No external frameworks — plain JDBC and hand-rolled UI components

## Getting Started

### Requirements
- JDK 21
- Eclipse (or any IDE that can import a standard Java project)

### Setup
1. Clone the repository and import it into Eclipse as an existing Java project.
2. Add the SQLite driver to your build path: right-click the project → **Build Path → Configure Build Path → Libraries → Add JARs…** → select `lib/sqlite-jdbc-3.53.2.0.jar`.
3. Confirm the `images/` folder sits at the project root (the same level as `src`), not nested inside `src`.
4. Run `src/scheduler/Main.java`.

### First run
The database and its tables are created automatically on first launch. There's no seeded regular user account — register one from the login screen. A default administrator account is seeded automatically:

- **Email:** `chief@yorku.ca`
- **Password:** `ChiefAdmin123!`

Use it to log into Room Management (from either the login screen or inside the app) and, from there, generate further administrator accounts as needed.

## Project Structure

```
src/scheduler/
├── model/         Domain objects (Booking, Room, RegisteredUser, Deposit, Administrator, ...)
├── state/         State pattern implementation for booking lifecycle (Pending → Confirmed → Checked-In → Completed, plus Cancelled/Expired)
├── service/       Business logic (BookingService, RoomService, AuthenticationService, ProfileService, ...)
├── repository/    SQLite persistence (UserRepository, RoomDAO, AdminDAO, ...)
├── sensor/        Simulated room hardware (occupancy + badge scanning) behind an Adapter pattern
├── payment/       Deposit payment: Strategy pattern for credit card / debit card / institutional billing
├── exception/     Domain-specific exceptions
├── factory/       Account creation
├── util/          Shared helpers (password hashing/validation, email validation, the demo clock)
├── database/      SQLite connection and schema setup
└── view/          All Swing UI (MainFrame, AuthFrame, and every screen/panel)
```

## Design Patterns

- **State** — `Booking` delegates all lifecycle actions (edit, cancel, extend, check in, complete, expire) to a `BookingState` implementation; each state only allows the transitions that are actually valid from it.
- **Strategy** — Payment method selection (`CreditCardStrategy`, `DebitCardStrategy`, `InstitutionalBillingStrategy`) behind a common `PaymentStrategy` interface.
- **Adapter** — Simulated sensor hardware (`LegacyMotionUnit`, `MagStripeBadgeReader`) wrapped behind `OccupancySensor`/`BadgeScanner` interfaces, decoupling the check-in logic from the specific (simulated) hardware.
- **Singleton** — `ChiefEventCoordinator`, the sole gateway for generating new administrator accounts.
- **Factory** — `AccountFactory`/`RegisteredUserFactory` for account creation during registration.

## Known Limitations

- Adding, enabling, or disabling a room from Room Management doesn't live-refresh the Rooms tab for someone already logged into the app — it shows up on the next app launch.
- A dedicated payment-history screen isn't wired in yet; deposit status and payment method are visible per-booking on each booking card.
- Administrator passwords are stored in plain text, unlike regular account passwords (which are hashed). Not production-appropriate; acceptable for the current scope of the project.

## Team

| Module | Contributor |
|---|---|
| Booking Management | Rebecca |
| Account & Authentication | Farhad |
| Room Management | Saif |
| Sensor Check-In | Rudra |
| Payment | Amal |


## Booking Management Scope

## Design Pattern Used

## State Pattern

The main design pattern used in this module is the **State Pattern**.

A booking changes behavior depending on its current state. For example, a pending booking can be edited or cancelled before the start time, but a cancelled booking cannot be edited, extended, checked in, or completed.

Instead of placing all booking rules into one large conditional block, each booking state is represented by a separate class.

---

## Booking States

| State Class           | Main Behavior                                                   |
| --------------------- | --------------------------------------------------------------- |
| `PendingPaymentState` | Allows edit, cancel, and payment confirmation before start time |
| `ConfirmedState`      | Allows edit, cancel, extend, and check-in based on time rules   |
| `CheckedInState`      | Allows extension before expiry and completion                   |
| `CancelledState`      | Blocks further booking actions                                  |
| `CompletedState`      | Blocks further booking actions                                  |
| `ExpiredState`        | Blocks further booking actions                                  |

---

## Package Structure

```text
scheduler
scheduler.model
scheduler.state
scheduler.service
scheduler.exception
scheduler.view
```

---

## Main Classes

### Model Classes

| Class            | Purpose                                                           |
| ---------------- | ----------------------------------------------------------------- |
| `AccountType`    | Stores user type and hourly rate                                  |
| `RegisteredUser` | Represents a registered user who can book rooms                   |
| `Room`           | Represents a bookable room                                        |
| `Booking`        | Represents a room booking and delegates behavior to state classes |
| `BookingStatus`  | Enum for booking lifecycle status                                 |
| `Deposit`        | Represents upfront fee/deposit information                        |

### State Classes

| Class                 | Purpose                                      |
| --------------------- | -------------------------------------------- |
| `BookingState`        | Interface for booking state behavior         |
| `PendingPaymentState` | Handles behavior before payment confirmation |
| `ConfirmedState`      | Handles confirmed booking behavior           |
| `CheckedInState`      | Handles active checked-in booking behavior   |
| `CancelledState`      | Blocks actions on cancelled bookings         |
| `CompletedState`      | Blocks actions on completed bookings         |
| `ExpiredState`        | Blocks actions on expired bookings           |

### Service Classes

| Class            | Purpose                                                   |
| ---------------- | --------------------------------------------------------- |
| `BookingService` | Creates, edits, cancels, extends, and retrieves bookings  |
| `RoomService`    | Checks room availability and manages room booking records |
| `CheckInService` | Placeholder service connection for check-in behavior      |

### Exception Classes

| Class                           | Purpose                                                        |
| ------------------------------- | -------------------------------------------------------------- |
| `BookingException`              | Parent exception for booking-related errors                    |
| `RoomUnavailableException`      | Thrown when a room is unavailable                              |
| `InvalidBookingActionException` | Thrown when an action is invalid for the current booking state |

---

## Frontend

The frontend is implemented using **Java Swing**.

---

## How to Run the Project

### Using Eclipse

1. Open Eclipse.
2. Select **File → Open Projects from File System**.
3. Choose the project folder:

```text
YorkURoomScheduler
```

4. Open:

```text
src/scheduler/Main.java
```

5. Right-click `Main.java`.
6. Select **Run As → Java Application**.

The Java Swing application window should open.

### Using VS Code

1. Open the project folder in VS Code.
2. Make sure the Java Extension Pack is installed.
3. Open:

```text
src/scheduler/Main.java
```

4. Click **Run** above the `main` method, or run from the terminal if Java is configured.

---

## Contributor

Booking Management implementation by:

**Rebecca John**

````

