package scheduler.sensor.hardware;

import java.util.HashMap;
import java.util.Map;

/**
 * Adapter Pattern - Adaptee (simulated hardware).
 *
 * Stands in for a magnetic-stripe badge reader with a raw vendor API that is
 * incompatible with the scheduler:
 *
 *   - readers are addressed by string "device channels" (e.g. "CH-DB-1001"),
 *     not by room,
 *   - a read returns unparsed track data in the vendor's format:
 *         %YU^&lt;idNumber&gt;^&lt;epochSeconds&gt;?
 *     which the caller must decode to get the badge holder's ID number.
 *
 * Since no physical reader is connected, {@link #insertCard(String, String)}
 * lets the demo UI simulate a badge swipe by writing raw track data onto a
 * channel. A read consumes the swipe (like a real one-shot card read).
 */
public class MagStripeBadgeReader {

    private final Map<String, String> pendingTrackByChannel = new HashMap<>();

    /** Simulation hook: a person swipes their badge at the given channel. */
    public void insertCard(String deviceChannel, String rawTrackData) {
        pendingTrackByChannel.put(deviceChannel, rawTrackData);
    }

    /**
     * Vendor API: returns and consumes the raw track data at a channel,
     * or null if no card has been swiped since the last read.
     */
    public String readTrack(String deviceChannel) {
        return pendingTrackByChannel.remove(deviceChannel);
    }

    /** Vendor API: peeks without consuming (used for status displays). */
    public boolean hasPendingCard(String deviceChannel) {
        return pendingTrackByChannel.containsKey(deviceChannel);
    }

    public String getFirmwareBanner() {
        return "SwipeTech MSR-210 (fw 1.0.7, simulated)";
    }
}
