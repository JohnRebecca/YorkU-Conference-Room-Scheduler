package scheduler.model;

public class Administrator {

    private int adminID;
    private String name;
    private String email;
    private String password;


    public Administrator(int adminID, String name, String email, String password) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public int getAdminID() {
        return adminID;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }
}