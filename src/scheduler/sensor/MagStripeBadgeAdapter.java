package scheduler.sensor;

import scheduler.sensor.hardware.MagStripeBadgeReader;

/**
 * Adapter Pattern - Adapter.
 *
 * Adapts the vendor {@link MagStripeBadgeReader} (string device channels, raw
 * track data "%YU^&lt;idNumber&gt;^&lt;epochSeconds&gt;?") to the
 * {@link BadgeScanner} interface the scheduler expects (room IDs, a decoded
 * ID number).
 *
 * Translation performed:
 *   - room ID -&gt; vendor device channel ("CH-" + roomId),
 *   - raw track data -&gt; the ID number between the '^' separators.
 *
 * Each scan is reported to the {@link SensorDataLog} (Req5).
 */
public class MagStripeBadgeAdapter implements BadgeScanner {

    private final MagStripeBadgeReader reader;
    private final SensorDataLog dataLog;

    public MagStripeBadgeAdapter(MagStripeBadgeReader reader, SensorDataLog dataLog) {
        this.reader = reader;
        this.dataLog = dataLog;
    }

    @Override
    public String scanBadge(String roomId) {
        String rawTrack = reader.readTrack(channelFor(roomId));

        if (rawTrack == null) {
            dataLog.record(SensorReading.Source.BADGE_SCANNER, roomId, "No badge presented");
            return null;
        }

        String idNumber = decodeTrack(rawTrack);

        if (idNumber == null) {
            dataLog.record(SensorReading.Source.BADGE_SCANNER, roomId,
                    "Unreadable badge data: " + rawTrack);
        } else {
            dataLog.record(SensorReading.Source.BADGE_SCANNER, roomId,
                    "Badge read, ID " + idNumber);
        }

        return idNumber;
    }

    @Override
    public String getScannerDescription() {
        return reader.getFirmwareBanner();
    }

    /** Vendor channel naming convention used at install time. */
    public String channelFor(String roomId) {
        return "CH-" + roomId;
    }

    /** Builds vendor-format track data; used by the simulation to "swipe" a badge. */
    public static String encodeTrack(String idNumber) {
        return "%YU^" + idNumber + "^" + (System.currentTimeMillis() / 1000) + "?";
    }

    /** Decodes "%YU^idNumber^epoch?" -&gt; idNumber, or null if malformed. */
    private String decodeTrack(String rawTrack) {
        if (rawTrack == null || !rawTrack.startsWith("%YU^") || !rawTrack.endsWith("?")) {
            return null;
        }

        String[] parts = rawTrack.substring(1, rawTrack.length() - 1).split("\\^");

        if (parts.length < 2 || parts[1].isBlank()) {
            return null;
        }

        return parts[1];
    }
}
