package scheduler.sensor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The system-side collection point for sensor data (Req5). Adapters and the
 * check-in service append readings here; the Check In screen renders the log
 * as a live feed. A simple refresh callback lets the UI repaint when new data
 * arrives without the log knowing anything about Swing.
 */
public class SensorDataLog {

    private final List<SensorReading> readings = new ArrayList<>();
    private final List<Runnable> onUpdateCallbacks = new ArrayList<>();

    public void record(SensorReading reading) {
        readings.add(reading);
        for (Runnable callback : new ArrayList<>(onUpdateCallbacks)) {
            callback.run();
        }
    }

    public void record(SensorReading.Source source, String roomId, String detail) {
        record(new SensorReading(source, roomId, detail));
    }

    /** Newest reading last. */
    public List<SensorReading> getReadings() {
        return Collections.unmodifiableList(readings);
    }

    public void addUpdateCallback(Runnable callback) {
        onUpdateCallbacks.add(callback);
    }
}
