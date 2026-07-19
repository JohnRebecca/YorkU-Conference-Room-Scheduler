package scheduler.sensor.hardware;

import java.util.HashMap;
import java.util.Map;

/**
 * Adapter Pattern - Adaptee (simulated hardware).
 *
 * Stands in for a third-party motion-detection unit whose SDK we cannot
 * change. Its API is deliberately incompatible with what the scheduler needs:
 *
 *   - it knows nothing about room IDs; it works with integer "zone codes"
 *     that must be registered up front,
 *   - it does not answer "is someone in the room?"; it reports a raw motion
 *     level from 0 to 100 that the caller must interpret.
 *
 * Since the physical sensor is not available, this class also exposes
 * simulation hooks ({@link #injectMotion(int, int)}) that the demo UI uses to
 * act as "the physical world" - a person walking into or out of a room.
 */
public class LegacyMotionUnit {

    private final Map<Integer, Integer> motionLevelByZone = new HashMap<>();
    private final Map<String, Integer> zoneByLabel = new HashMap<>();
    private int nextZoneCode = 100;

    /** Vendor API: registers a monitoring zone and returns its zone code. */
    public int registerZone(String zoneLabel) {
        return zoneByLabel.computeIfAbsent(zoneLabel, label -> {
            int code = nextZoneCode++;
            motionLevelByZone.put(code, 0);
            return code;
        });
    }

    /** Vendor API: raw motion level 0-100 for a zone (0 = no motion). */
    public int pollMotionLevel(int zoneCode) {
        Integer level = motionLevelByZone.get(zoneCode);
        if (level == null) {
            return -1; // vendor's error convention for an unknown zone
        }
        return level;
    }

    /** Simulation hook: pretends a person entered/left, changing motion level. */
    public void injectMotion(int zoneCode, int level) {
        if (motionLevelByZone.containsKey(zoneCode)) {
            motionLevelByZone.put(zoneCode, Math.max(0, Math.min(100, level)));
        }
    }

    public String getFirmwareBanner() {
        return "AcmeSense LMU-900 (fw 2.4.1, simulated)";
    }
}
