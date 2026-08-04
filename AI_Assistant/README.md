# Independent AI-Assisted JUnit 5 Test Suite

This suite was generated independently from the production classes under `src`.
It was not copied from the manual `test` suite.

## Scope

The suite covers the non-GUI classes in the Sensor Check-In subsystem:

- `sensor.SensorCheckInService`
- `sensor.SensorSimulationController`
- `sensor.MotionUnitOccupancyAdapter`
- `sensor.MagStripeBadgeAdapter`
- `sensor.SensorReading`
- `sensor.SensorDataLog`
- `sensor.BadgeScanRecord`
- `sensor.hardware.LegacyMotionUnit`
- `sensor.hardware.MagStripeBadgeReader`
- `repository.SqliteBadgeScanRepository`
- `util.AppClock`

The interfaces `BadgeScanner`, `OccupancySensor`, and `BadgeScanRepository`
are exercised through fakes or concrete implementations.

## AI prompt used

> Generate an independent JUnit 5 test suite for the non-GUI Sensor Check-In
> subsystem of the YorkU Conference Room Scheduler. Base the tests only on the
> production source code. Do not copy or paraphrase the existing manual tests.
> Use plain JUnit 5 without Mockito. Prefer behavior-focused tests with different
> fixtures, method names, and assertion structure. Use small in-memory fakes for
> hardware/persistence interfaces where appropriate. Include normal cases,
> boundary cases, invalid inputs, state transitions, persistence behavior, and
> time-dependent behavior. Keep the suite readable and suitable for measuring
> production-code coverage.

## Integration

1. Extract the `AI_Assistant_Independent` folder into the Eclipse project root.
2. Right-click the folder in Eclipse.
3. Choose **Build Path > Use as Source Folder**.
4. Ensure JUnit 5 is on the build path.
5. Run the folder using **Run As > JUnit Test**.
6. Run it separately using **Coverage As > JUnit Test** for AI-only coverage.

## Important review notes

- The SQLite test clears only the `badge_scans` table before each test.
- `AppClock.reset()` is used after time-sensitive tests.
- The service tests use independent in-memory fakes rather than SQLite.
- GUI classes were intentionally excluded because the assignment comparison
  focuses on non-GUI production classes.
