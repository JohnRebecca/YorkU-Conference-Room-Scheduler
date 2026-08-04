package scheduler.util;

import static org.junit.Assert.*;

import org.junit.Test;

import scheduler.model.Room;

public class RoomValidatorAITest {

    @Test
    public void validRoomIsAccepted() {
        Room room = new Room(
                "LAS-1001",
                30,
                "Lassonde Building",
                "First Floor"
        );

        assertTrue(RoomValidator.validate(room));
    }

    @Test
    public void nullRoomIsRejected() {
        assertFalse(RoomValidator.validate(null));
    }

    @Test
    public void nullRoomIdIsRejected() {
        Room room = new Room(
                null,
                30,
                "Lassonde Building",
                "First Floor"
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void emptyRoomIdIsRejected() {
        Room room = new Room(
                "",
                30,
                "Lassonde Building",
                "First Floor"
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void whitespaceOnlyRoomIdIsRejected() {
        Room room = new Room(
                "   ",
                30,
                "Lassonde Building",
                "First Floor"
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void nullBuildingIsRejected() {
        Room room = new Room(
                "LAS-1002",
                30,
                null,
                "First Floor"
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void emptyBuildingIsRejected() {
        Room room = new Room(
                "LAS-1003",
                30,
                "",
                "First Floor"
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void whitespaceOnlyBuildingIsRejected() {
        Room room = new Room(
                "LAS-1004",
                30,
                "   ",
                "First Floor"
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void nullLocationIsRejected() {
        Room room = new Room(
                "LAS-1005",
                30,
                "Lassonde Building",
                null
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void emptyLocationIsRejected() {
        Room room = new Room(
                "LAS-1006",
                30,
                "Lassonde Building",
                ""
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void whitespaceOnlyLocationIsRejected() {
        Room room = new Room(
                "LAS-1007",
                30,
                "Lassonde Building",
                "   "
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void zeroCapacityIsRejected() {
        Room room = new Room(
                "LAS-1008",
                0,
                "Lassonde Building",
                "First Floor"
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void negativeCapacityIsRejected() {
        Room room = new Room(
                "LAS-1009",
                -10,
                "Lassonde Building",
                "First Floor"
        );

        assertFalse(RoomValidator.validate(room));
    }

    @Test
    public void minimumPositiveCapacityIsAccepted() {
        Room room = new Room(
                "LAS-1010",
                1,
                "Lassonde Building",
                "First Floor"
        );

        assertTrue(RoomValidator.validate(room));
    }

    @Test
    public void surroundingWhitespaceDoesNotMakeNonEmptyValuesInvalid() {
        Room room = new Room(
                " LAS-1011 ",
                25,
                " Lassonde Building ",
                " First Floor "
        );

        assertTrue(RoomValidator.validate(room));
    }
}