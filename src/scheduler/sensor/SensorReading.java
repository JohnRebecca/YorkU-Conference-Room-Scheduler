package scheduler.sensor;

import scheduler.util.AppClock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A single piece of sensor data sent to the system (Req5: "Data is sent to
 * the system"). Every adapter reading and check-in decision is recorded as
 * one of these so the UI can show a live feed of what the sensors reported.
 */
public class SensorReading {

    public enum Source { OCCUPANCY_SENSOR, BADGE_SCANNER, SYSTEM }

    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    private final LocalDateTime timestamp;
    private final Source source;
    private final String roomId;
    private final String detail;

    public SensorReading(Source source, String roomId, String detail) {
        this.timestamp = AppClock.now();
        this.source = source;
        this.roomId = roomId;
        this.detail = detail;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Source getSource() {
        return source;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return "[" + timestamp.format(TIME_FORMAT) + "] "
                + source + " (" + roomId + "): " + detail;
    }
}
