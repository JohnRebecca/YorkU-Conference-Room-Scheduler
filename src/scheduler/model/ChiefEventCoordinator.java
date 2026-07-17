package scheduler.model;

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



    public void generateAdministrator(Administrator admin) {

        System.out.println("Chief Event Coordinator generating admin...");

        adminDAO.insertAdmin(admin);

    }

}