# YorkU Conference Room Scheduler

A Java Swing-based room booking system for York University Event Services. The system supports account registration, room booking, check-in, payment/deposit handling, and simulated room sensor functionality.

This branch adds **Person 5: Sensor Check-In System**, covering **Req5** and part of **Req4**.

---

## Rudra Iqbal: Sensor Check-In System

### Covered Requirements

**Req5:**  
Each room has sensors to detect occupancy and scan ID badges for verification. Sensor data is sent to the system.

**Part of Req4:**  
If the booking user checks in within 30 minutes of the booking start time, the deposit is applied to the final cost. If the user does not check in within the allowed time, the deposit is forfeited.

---

## Design Pattern Used

### Adapter Pattern

The project does not use real physical sensors or badge-scanning hardware. Therefore, this module simulates those devices inside the Java application.

The **Adapter Pattern** is used to convert simulated hardware output into clean system data that the scheduler can understand.

Example:

```text
Simulated hardware input
→ Sensor adapter
→ Sensor data
→ Check-in service
→ Booking/deposit update
```

This keeps the sensor logic separate from the booking logic. If real hardware were added later, only the adapter layer would need to change.

---

## Main Features Added

### 1. ID Badge Sensor Tab

A new **ID Badge Sensor** tab was added to the GUI.

This tab acts as the simulated physical sensor interface. It allows registered users to scan their ID badge for a booked room.

The tab displays:

- booked rooms
- current system/demo time
- sensor data feed
- badge scan activity
- occupancy information

---

### 2. Simulated Occupancy Sensor

The occupancy sensor simulates whether a person is physically present in the room.

This supports Req5 by representing the room sensor that detects room usage.

---

### 3. Simulated Badge Scanner

The badge scanner simulates scanning a user’s ID badge.

The scanned badge/user ID is sent to the system and compared with booking information.

If the scanned badge belongs to the booking owner, the system can use it for official check-in.

If the scanned badge belongs to another registered user, the scan may be recorded as a room entry but does not trigger official booking check-in.

---

### 4. Sensor Data Sent to the System

Each scan produces sensor data such as:

- room ID
- badge/user ID
- occupancy status
- timestamp

This satisfies the requirement that sensor information is sent to the system.

---

### 5. Check-In Validation

The check-in logic verifies:

1. A booked room exists.
2. Occupancy is detected.
3. The scanned badge belongs to the booking owner.
4. The scan occurs within the allowed 30-minute check-in window.

If these conditions are met, the booking is checked in and the deposit is applied to the final cost.

If the booking owner does not check in within the 30-minute window, the deposit is forfeited.

---

## Important Classes Added

### Sensor Package

```text
scheduler.sensor
```

Main classes include:

```text
BadgeScanner
OccupancySensor
SensorData
SensorCheckInService
SensorSimulationController
MotionUnitOccupancyAdapter
MagStripeBadgeAdapter
BadgeScanRecord
SensorDataLog
```

### Simulated Hardware Package

```text
scheduler.sensor.hardware
```

Main classes include:

```text
LegacyMotionUnit
MagStripeBadgeReader
```

### Repository Classes

```text
BadgeScanRepository
SqliteBadgeScanRepository
```

These classes store badge scan records.

### GUI Classes

```text
BadgeSensorPanel
CheckInPanel
```

These classes provide the user interface for the simulated sensor and check-in flow.

---

## How to Run

1. Open the project in Eclipse.
2. Make sure the Java version is set to Java 21 or compatible.
3. Run:

```text
scheduler.Main
```

4. Log in or create an account.
5. Book a room.
6. Open the **ID Badge Sensor** tab.
7. Select a booked room and scan an ID badge.
8. If the scanned badge belongs to the booking owner and the scan is within 30 minutes of the start time, the system checks in the booking.

---

## Notes

- Physical sensors are not connected.
- Sensor behavior is simulated in the Java GUI.
- The Adapter Pattern allows the simulated hardware to work with the rest of the scheduler system.
- This branch focuses only on Person 5’s Sensor Check-In System.