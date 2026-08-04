package scheduler.util;

import static org.junit.Assert.*;

import org.junit.Test;

import scheduler.model.Room;

public class RoomValidatorTest {

    @Test
    public void validRoomReturnsTrue() {
        Room room = new Room("DB-1001", 40, "DB Building", "First Floor");

        assertTrue(RoomValidator.validate(room));
    }

    @Test
    public void nullRoomReturnsFalse() {
        assertFalse(RoomValidator.validate(null));
    }

    @Test
    public void nullRoomIdReturnsFalse() {
        Room room = new Room(null, 40, "DB Building", "First Floor");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void emptyRoomIdReturnsFalse() {
        Room room = new Room("", 40, "DB Building", "First Floor");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void whitespaceRoomIdReturnsFalse() {
        Room room = new Room("   ", 40, "DB Building", "First Floor");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void nullBuildingReturnsFalse() {
        Room room = new Room("DB-1001", 40, null, "First Floor");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void emptyBuildingReturnsFalse() {
        Room room = new Room("DB-1001", 40, "", "First Floor");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void whitespaceBuildingReturnsFalse() {
        Room room = new Room("DB-1001", 40, "   ", "First Floor");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void nullLocationReturnsFalse() {
        Room room = new Room("DB-1001", 40, "DB Building", null);

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void emptyLocationReturnsFalse() {
        Room room = new Room("DB-1001", 40, "DB Building", "");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void whitespaceLocationReturnsFalse() {
        Room room = new Room("DB-1001", 40, "DB Building", "   ");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void zeroCapacityReturnsFalse() {
        Room room = new Room("DB-1001", 0, "DB Building", "First Floor");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void negativeCapacityReturnsFalse() {
        Room room = new Room("DB-1001", -1, "DB Building", "First Floor");

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void capacityOfOneReturnsTrue() {
        Room room = new Room("DB-1001", 1, "DB Building", "First Floor");

        assertTrue(RoomValidator.validate(room));
    }

    @Test
    public void validRoomWithSurroundingWhitespaceReturnsTrue() {
        Room room = new Room(" DB-1001 ", 40, " DB Building ", " First Floor ");

        assertTrue(RoomValidator.validate(room));
    }
}