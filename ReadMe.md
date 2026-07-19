# YorkU Conference Room Scheduler

A Java Swing application for booking and managing York University conference rooms.

## Sensor Check-In Module

This branch adds my portion of the project: **Rudra: Sensor Check-In System**.

### Requirements Covered

- **Req5:** Simulates room sensors that detect occupancy and scan ID badges. Sensor data is sent to the system.
- **Part of Req4:** Supports the 30-minute check-in rule. If the booking owner checks in on time, the deposit is applied to the final cost. If the owner does not check in within 30 minutes after the start time, the deposit is forfeited.

### Design Pattern Used

**Adapter Pattern**

Physical occupancy sensors and ID badge scanners are not connected to the project. The module uses simulated hardware classes and adapter classes to convert raw simulated hardware input into data the scheduler can process.

Main adapter-related classes:

- `sensor.OccupancySensor`
- `sensor.BadgeScanner`
- `sensor.MotionUnitOccupancyAdapter`
- `sensor.MagStripeBadgeAdapter`
- `sensor.hardware.LegacyMotionUnit`
- `sensor.hardware.MagStripeBadgeReader`

### Main Features Added

- Added an **ID Badge Sensor** tab.
- Added simulated room occupancy sensor behavior.
- Added simulated ID badge scanner behavior.
- Sensor data includes room ID, badge/user ID, occupancy status, timestamp, and scan result.
- Booking owner badge scan can automatically check in the booking.
- Guest badge scans can be recorded after the room is open.
- Repeated scans by the same active user do not incorrectly increase the tapped-in count.
- Added database storage for badge scan records.
- Added an online **Check In** page that displays timestamp and occupancy information.
- The **My Bookings** check-in button redirects to the Check In page instead of using the old inline flow.
- Supports multiple registered users logging in and scanning their own ID badges during the same run.

### Main Classes Added

- `sensor.SensorCheckInService`
- `sensor.SensorSimulationController`
- `sensor.SensorDataLog`
- `sensor.SensorReading`
- `sensor.BadgeScanRecord`
- `repository.BadgeScanRepository`
- `repository.SqliteBadgeScanRepository`
- `view.BadgeSensorPanel`
- `view.CheckInPanel`
- `util.AppClock`

### Database Update

A `badge_scans` table was added through `DatabaseManager` to store badge scan records, including the scanned user, room, booking, timestamp, and scan result.

### How to Run

Run:

```text
scheduler.Main
```

Then log in, book a room, and open the **ID Badge Sensor** tab to simulate badge scanning and occupancy detection.

### Demo Flow

1. Log in as a registered user.
2. Book a room and pay the deposit.
3. Open the **ID Badge Sensor** tab.
4. Scan the booking owner’s badge.
5. The system records the scan data and checks in the booking if it is within the valid check-in window.
6. Log out and log in as another registered user to demonstrate multiple-user badge scanning.
7. Open **Check In** to show the selected booking, timestamp information, and occupancy status.
