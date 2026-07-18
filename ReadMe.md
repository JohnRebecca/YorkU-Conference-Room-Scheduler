# YorkU Conference Room Scheduler

A Java Swing-based room booking system for York University Event Services.

## Sensor Check-In Module — Rudra

This branch adds my portion of the project: **Rudra Iqbal: Sensor Check-In System**.

### Requirements Covered

- **Req5:** Simulates room sensors that detect occupancy and scan ID badges.
- **Part of Req4:** Supports check-in within 30 minutes of the booking start time so the deposit can be applied or forfeited.

### Design Pattern

**Adapter Pattern**

Physical sensors are not connected to the project, so the system uses simulated hardware classes. The adapter converts simulated occupancy and badge-reader input into sensor data that the scheduler can process.

### Main Additions

- Added an **ID Badge Sensor** tab.
- Simulated room occupancy sensor.
- Simulated ID badge scanner.
- Sensor data includes room ID, badge/user ID, occupancy status, and timestamp.
- Booking owner badge scan can trigger check-in.
- Guest badge scans can be recorded as room entry data.
- Check-in logic supports the 30-minute deposit rule.
- Supports multiple registered users logging in and scanning their own ID badges.

### Main Classes Added

- `sensor.OccupancySensor`
- `sensor.BadgeScanner`
- `sensor.SensorReading`
- `sensor.SensorDataLog`
- `sensor.SensorCheckInService`
- `sensor.MotionUnitOccupancyAdapter`
- `sensor.MagStripeBadgeAdapter`
- `sensor.hardware.LegacyMotionUnit`
- `sensor.hardware.MagStripeBadgeReader`
- `view.BadgeSensorPanel`
- `view.CheckInPanel`

### How to Run

Run:

```text
scheduler.Main