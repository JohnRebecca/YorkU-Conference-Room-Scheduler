package scheduler.util;

import scheduler.model.Room;

public class RoomValidator {

    public static boolean validate(Room room) {

        if (room == null) {
            return false;
        }

        if (room.getRoomId() == null || room.getRoomId().trim().isEmpty()) {
            return false;
        }

        if (room.getBuilding() == null || room.getBuilding().trim().isEmpty()) {
            return false;
        }

        if (room.getLocation() == null || room.getLocation().trim().isEmpty()) {
            return false;
        }

        if (room.getCapacity() <= 0) {
            return false;
        }

        return true;
    }
}