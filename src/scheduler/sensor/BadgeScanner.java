package scheduler.sensor;

/**
 * Adapter Pattern - Target interface.
 *
 * Badge-scanning interface that the scheduler system expects (Req5: rooms
 * "scan ID badges for verification"). A scan returns the organization ID or
 * student number encoded on the badge, or null when no badge has been
 * presented at that room's reader.
 *
 * The concrete implementation is {@link MagStripeBadgeAdapter}, which adapts a
 * simulated magnetic-stripe reader with a raw, vendor-specific API.
 */
public interface BadgeScanner {

    /**
     * Reads the most recently presented badge at the given room's reader.
     *
     * @return the ID number encoded on the badge, or null if no badge present.
     */
    String scanBadge(String roomId);

    /** @return a human-readable identifier for the underlying reader device. */
    String getScannerDescription();
}
