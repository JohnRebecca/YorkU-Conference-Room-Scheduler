package scheduler.util;

import scheduler.model.Room;


public class RoomValidator {


    public static boolean validate(Room room) {

        if (room == null) {
            return false;
        }

        if (room.getRoomID() <= 0) {
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

        if (room.getStatus() == null) {
            return false;
        }

        String status = room.getStatus().toUpperCase();


        if (!(status.equals("ENABLED") ||
              status.equals("DISABLED") ||
              status.equals("CLOSED"))) {

            return false;
        }


        return true;

    }

}