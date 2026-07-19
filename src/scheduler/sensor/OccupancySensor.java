package scheduler.sensor;

/**
 * Adapter Pattern - Target interface.
 *
 * This is the occupancy-sensing interface that the scheduler system expects
 * (Req5: "Each room has sensors to detect occupancy"). The system never talks
 * to sensor hardware directly; it only talks to this interface.
 *
 * Because no physical hardware is available, the concrete implementation is an
 * adapter ({@link MotionUnitOccupancyAdapter}) that wraps a simulated vendor
 * device with an incompatible API. When real hardware arrives, only a new
 * adapter needs to be written - no scheduler code changes.
 */
public interface OccupancySensor {

    /** @return true if the sensor currently detects a person in the given room. */
    boolean isOccupancyDetected(String roomId);

    /** @return a human-readable identifier for the underlying sensor device. */
    String getSensorDescription();
}
