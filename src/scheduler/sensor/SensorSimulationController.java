package scheduler.sensor;

import scheduler.sensor.hardware.LegacyMotionUnit;
import scheduler.sensor.hardware.MagStripeBadgeReader;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Stands in for the physical world, since no real hardware is connected.
 *
 * It tracks WHICH people are physically inside each room (entering and
 * leaving via the Enter Room / Leave Room controls) and drives the vendor
 * motion unit accordingly: anyone present -> high motion level (the
 * occupancy sensor reads OCCUPIED), nobody left -> zero motion (EMPTY).
 * A person can only be inside once: entering again without leaving first is
 * rejected, and leaving is rejected for someone who is not inside.
 * Swiping a badge only presents a card at the reader - walking in and
 * tapping in are separate physical acts.
 *
 * The scheduler itself only ever reads through the adapter interfaces, so
 * deleting this class and plugging in real hardware changes nothing else.
 */
public class SensorSimulationController {

    private static final int MOTION_WHEN_OCCUPIED = 85;

    private final LegacyMotionUnit motionUnit;
    private final MagStripeBadgeReader badgeReader;
    private final MotionUnitOccupancyAdapter occupancyAdapter;
    private final MagStripeBadgeAdapter badgeAdapter;

    /** The ID numbers of the people physically inside each room right now. */
    private final Map<String, Set<String>> occupantsByRoom = new HashMap<>();

    public SensorSimulationController(
            LegacyMotionUnit motionUnit,
            MagStripeBadgeReader badgeReader,
            MotionUnitOccupancyAdapter occupancyAdapter,
            MagStripeBadgeAdapter badgeAdapter
    ) {
        this.motionUnit = motionUnit;
        this.badgeReader = badgeReader;
        this.occupancyAdapter = occupancyAdapter;
        this.badgeAdapter = badgeAdapter;
    }

    /**
     * A person walks into the room. Returns false if that person is already
     * inside (you cannot enter twice without leaving first); on success the
     * motion unit reads a high level.
     */
    public boolean personEntersRoom(String roomId, String idNumber) {
        boolean entered = occupantsByRoom
                .computeIfAbsent(roomId, k -> new HashSet<>())
                .add(idNumber);
        if (entered) {
            syncMotion(roomId);
        }
        return entered;
    }

    /**
     * A person walks out of the room. Returns false if that person is not
     * inside (there is no one to leave), true otherwise.
     */
    public boolean personLeavesRoom(String roomId, String idNumber) {
        Set<String> occupants = occupantsByRoom.get(roomId);
        boolean left = occupants != null && occupants.remove(idNumber);
        if (left) {
            syncMotion(roomId);
        }
        return left;
    }

    /** True if that person is currently inside the room. */
    public boolean isPersonInside(String roomId, String idNumber) {
        Set<String> occupants = occupantsByRoom.get(roomId);
        return occupants != null && occupants.contains(idNumber);
    }

    /** The person swipes their ID badge at the room's reader. */
    public void personSwipesBadge(String roomId, String idNumber) {
        badgeReader.insertCard(
                badgeAdapter.channelFor(roomId),
                MagStripeBadgeAdapter.encodeTrack(idNumber));
    }

    /** True if a swiped badge is waiting to be read at this room. */
    public boolean isBadgeWaiting(String roomId) {
        return badgeReader.hasPendingCard(badgeAdapter.channelFor(roomId));
    }

    /** True if nobody is physically inside the room. */
    public boolean isRoomEmpty(String roomId) {
        Set<String> occupants = occupantsByRoom.get(roomId);
        return occupants == null || occupants.isEmpty();
    }

    /** Raw motion level currently reported by the vendor unit (status display). */
    public int currentMotionLevel(String roomId) {
        return motionUnit.pollMotionLevel(occupancyAdapter.zoneCodeFor(roomId));
    }

    /**
     * The occupancy sensor's current reading for display purposes, without
     * going through the adapter (an adapter poll is a real read and gets
     * logged as sensor data - status labels shouldn't spam the feed).
     */
    public boolean sensorReadsOccupied(String roomId) {
        return currentMotionLevel(roomId) >= 40;
    }

    private void syncMotion(String roomId) {
        motionUnit.injectMotion(
                occupancyAdapter.zoneCodeFor(roomId),
                isRoomEmpty(roomId) ? 0 : MOTION_WHEN_OCCUPIED);
    }
}
