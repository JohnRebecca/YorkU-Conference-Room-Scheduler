package aiassistant.sensor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scheduler.sensor.hardware.MagStripeBadgeReader;

class AIMagStripeBadgeReaderBehaviorTest {

    @Test
    void insertedCardIsReportedAsPending() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        reader.insertCard("CH-R1", "track");

        assertTrue(reader.hasPendingCard("CH-R1"));
    }

    @Test
    void readingTrackConsumesPendingCard() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        reader.insertCard("CH-R1", "track");

        assertEquals("track", reader.readTrack("CH-R1"));
        assertFalse(reader.hasPendingCard("CH-R1"));
        assertNull(reader.readTrack("CH-R1"));
    }

    @Test
    void channelsAreIndependent() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        reader.insertCard("CH-A", "A");
        reader.insertCard("CH-B", "B");

        assertEquals("A", reader.readTrack("CH-A"));
        assertEquals("B", reader.readTrack("CH-B"));
    }

    @Test
    void laterSwipeReplacesEarlierUnreadSwipeOnSameChannel() {
        MagStripeBadgeReader reader = new MagStripeBadgeReader();
        reader.insertCard("CH-A", "old");
        reader.insertCard("CH-A", "new");

        assertEquals("new", reader.readTrack("CH-A"));
    }

    @Test
    void firmwareBannerIdentifiesReaderModel() {
        assertTrue(new MagStripeBadgeReader().getFirmwareBanner().contains("MSR-210"));
    }
}
