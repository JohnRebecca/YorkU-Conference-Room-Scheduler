package scheduler.service;

import scheduler.model.Administrator;
import scheduler.model.Room;
import scheduler.repository.RoomDAO;
import scheduler.repository.AdminDAO;
import scheduler.model.ChiefEventCoordinator;
import scheduler.util.RoomValidator;

import java.util.List;

public class RoomManagementFacade {

    private final RoomDAO roomDAO;
    private final AdminDAO adminDAO;


    public RoomManagementFacade() {

        roomDAO = new RoomDAO();
        adminDAO = new AdminDAO();

    }


    // Req6: Add Room
    public void addRoom(Room room) {

        if (RoomValidator.validate(room)) {

            roomDAO.insertRoom(room);

        } else {

            System.out.println("Invalid room information");

        }
    }


    // Req6: Enable Room
    public void enableRoom(String roomID) {

        roomDAO.updateRoomStatus(roomID, true);

    }


    // Req6: Disable Room
    public void disableRoom(String roomID) {

        roomDAO.updateRoomStatus(roomID, false);

    }


    // Req6: Temporarily Close Room
    public void closeRoom(String roomID) {

        // Closing a room means disabling it temporarily
        roomDAO.updateRoomStatus(roomID, false);

    }


    // Req2: Generate Administrator Account
    public void generateAdministrator(Administrator admin) {

        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        coordinator.generateAdministrator(admin);

    }


    public List<Room> getAllRooms() {

        return roomDAO.getAllRooms();

    }
}