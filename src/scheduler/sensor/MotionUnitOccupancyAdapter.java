package scheduler.sensor;

import scheduler.sensor.hardware.LegacyMotionUnit;

import java.util.HashMap;
import java.util.Map;

/**
 * Adapter Pattern - Adapter.
 *
 * Adapts the vendor {@link LegacyMotionUnit} (integer zone codes, raw 0-100
 * motion levels) to the {@link OccupancySensor} interface the scheduler
 * expects (room IDs, a simple yes/no occupancy answer).
 *
 * Translation performed:
 *   - room ID  -&gt; vendor zone code (registered lazily per room),
 *   - motion level &gt;= threshold -&gt; "occupancy detected".
 *
 * Every poll is also reported to the {@link SensorDataLog}, satisfying Req5's
 * requirement that sensor data is sent to the system.
 */
public class MotionUnitOccupancyAdapter implements OccupancySensor {

    /** Vendor levels at or above this count as a person present. */
    private static final int OCCUPANCY_THRESHOLD = 40;

    private final LegacyMotionUnit motionUnit;
    private final SensorDataLog dataLog;
    private final Map<String, Integer> zoneCodeByRoomId = new HashMap<>();

    public MotionUnitOccupancyAdapter(LegacyMotionUnit motionUnit, SensorDataLog dataLog) {
        this.motionUnit = motionUnit;
        this.dataLog = dataLog;
    }

    @Override
    public boolean isOccupancyDetected(String roomId) {
        int zoneCode = zoneCodeFor(roomId);
        int level = motionUnit.pollMotionLevel(zoneCode);
        boolean detected = level >= OCCUPANCY_THRESHOLD;

        dataLog.record(SensorReading.Source.OCCUPANCY_SENSOR, roomId,
                "Motion level " + level + "/100 -> " + (detected ? "OCCUPIED" : "empty"));

        return detected;
    }

    @Override
    public String getSensorDescription() {
        return motionUnit.getFirmwareBanner();
    }

    /**
     * Exposed so the simulation controls can address the vendor device the
     * same way the adapter does. Real hardware would not need this.
     */
    public int zoneCodeFor(String roomId) {
        return zoneCodeByRoomId.computeIfAbsent(roomId, motionUnit::registerZone);
    }
}
