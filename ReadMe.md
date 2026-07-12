
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



