package scheduler.model;

import scheduler.exception.AuthorizationException;
import scheduler.repository.AdminDAO;


public class ChiefEventCoordinator {

    private static ChiefEventCoordinator instance;

    private AdminDAO adminDAO;


    private ChiefEventCoordinator() {

        adminDAO = new AdminDAO();

    }


    public static ChiefEventCoordinator getInstance() {

        if(instance == null) {

            instance = new ChiefEventCoordinator();

        }

        return instance;

    }



    public void generateAdministrator(Administrator admin, RegisteredUser currentUser) throws AuthorizationException {

        if (!isChiefEventCoordinator(currentUser)) {
            throw new AuthorizationException(
                    "Only the Chief Event Coordinator can generate administrator accounts."
            );
        }

        System.out.println("Chief Event Coordinator generating admin...");

        adminDAO.insertAdmin(admin);

    }


    private boolean isChiefEventCoordinator(RegisteredUser currentUser) {
        if (currentUser == null) {
            return false;
        }

        String email = currentUser.getEmail();
        String fullName = currentUser.getFullName();

        return (email != null && email.equalsIgnoreCase("chief.event.coordinator@yorku.ca"))
                || (fullName != null && fullName.equalsIgnoreCase("Chief Event Coordinator"));
    }

}