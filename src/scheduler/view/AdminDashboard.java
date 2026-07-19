package scheduler.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

import scheduler.exception.AuthorizationException;
import scheduler.service.RoomManagementFacade;
import scheduler.model.Room;
import scheduler.model.Administrator;


public class AdminDashboard extends JFrame {


    private RoomManagementFacade facade;
    private JTextField roomIDField;
    private JTextField buildingField;
    private JTextField locationField;
    private JTextField capacityField;
    private JTextField adminIDField;
    private JTextField adminNameField;
    private JTextField adminEmailField;
    private JTextField adminPasswordField;
    private JTable roomTable;
    private DefaultTableModel tableModel;



    public AdminDashboard() {

        facade = new RoomManagementFacade();

        setTitle("Conference Room Scheduler - Admin");
        setSize(700,850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("Conference Room Scheduler - Admin");

        title.setBounds(200,20,300,30);
        add(title);

//room 

        JLabel roomLabel = new JLabel("Room Management");

        roomLabel.setBounds(50,70,200,25);
        add(roomLabel);

        JLabel idLabel = new JLabel("Room ID:");

        idLabel.setBounds(50,110,100,25);
        add(idLabel);


        roomIDField = new JTextField();
        roomIDField.setBounds(150,110,150,25);
        add(roomIDField);


        JLabel buildingLabel = new JLabel("Building:");

        buildingLabel.setBounds(50,150,100,25);
        add(buildingLabel);

        buildingField = new JTextField();
        buildingField.setBounds(150,150,150,25);
        add(buildingField);




        JLabel locationLabel = new JLabel("Location:");

        locationLabel.setBounds(50,190,100,25);

        add(locationLabel);



        locationField = new JTextField();

        locationField.setBounds(150,190,150,25);

        add(locationField);




        JLabel capacityLabel = new JLabel("Capacity:");

        capacityLabel.setBounds(50,230,100,25);

        add(capacityLabel);



        capacityField = new JTextField();

        capacityField.setBounds(150,230,150,25);

        add(capacityField);





        JButton addRoom = new JButton("Add Room");

        addRoom.setBounds(350,150,150,40);

        add(addRoom);




        JButton enableRoom = new JButton("Enable Room");

        enableRoom.setBounds(350,200,150,40);

        add(enableRoom);



        JButton disableRoom = new JButton("Disable Room");

        disableRoom.setBounds(350,250,150,40);

        add(disableRoom);



        JButton closeRoom = new JButton("Close Room");

        closeRoom.setBounds(350,300,150,40);

        add(closeRoom);


//admin

        JLabel adminLabel = new JLabel("Generate Administrator");

        adminLabel.setBounds(50,380,250,25);

        add(adminLabel);




        JLabel adminIDLabel = new JLabel("Admin ID:");

        adminIDLabel.setBounds(50,420,100,25);

        add(adminIDLabel);



        adminIDField = new JTextField();

        adminIDField.setBounds(150,420,150,25);

        add(adminIDField);




        JLabel nameLabel = new JLabel("Name:");

        nameLabel.setBounds(50,460,100,25);

        add(nameLabel);



        adminNameField = new JTextField();

        adminNameField.setBounds(150,460,150,25);

        add(adminNameField);




        JLabel emailLabel = new JLabel("Email:");

        emailLabel.setBounds(50,500,100,25);

        add(emailLabel);



        adminEmailField = new JTextField();

        adminEmailField.setBounds(150,500,150,25);

        add(adminEmailField);




        JLabel passwordLabel = new JLabel("Password:");

        passwordLabel.setBounds(50,540,100,25);

        add(passwordLabel);



        adminPasswordField = new JTextField();

        adminPasswordField.setBounds(150,540,150,25);

        add(adminPasswordField);




        JButton generateAdmin = new JButton("Generate Admin");

        generateAdmin.setBounds(350,480,150,40);

        add(generateAdmin);


//room table

        String[] columns = {

                "Room ID",
                "Building",
                "Location",
                "Capacity",
                "Status"

        };


        tableModel = new DefaultTableModel(columns,0);


        roomTable = new JTable(tableModel);


        JScrollPane scrollPane = new JScrollPane(roomTable);


        scrollPane.setBounds(50,620,550,120);


        add(scrollPane);


//button actions

        addRoom.addActionListener(e -> {

        	Room room = new Room(

        	        roomIDField.getText(),

        	        Integer.parseInt(capacityField.getText()),

        	        buildingField.getText(),

        	        locationField.getText()

        	);


            facade.addRoom(room);


            loadRooms();


            JOptionPane.showMessageDialog(
                    null,
                    "Room Added"
            );


        });





        enableRoom.addActionListener(e -> {


        	facade.enableRoom(
        	        roomIDField.getText()
        	);


            loadRooms();


        });





        disableRoom.addActionListener(e -> {


        	facade.disableRoom(
        	        roomIDField.getText()
        	);


            loadRooms();


        });





        closeRoom.addActionListener(e -> {


        	facade.closeRoom(
        	        roomIDField.getText()
        	);


            loadRooms();


        });






        generateAdmin.addActionListener(e -> {

            try {

                Administrator admin = new Administrator(

                        Integer.parseInt(adminIDField.getText()),

                        adminNameField.getText(),

                        adminEmailField.getText(),

                        adminPasswordField.getText()

                );


                facade.generateAdministrator(admin);


                JOptionPane.showMessageDialog(
                        null,
                        "Administrator Created"
                );

            } catch (AuthorizationException exception) {

                JOptionPane.showMessageDialog(
                        null,
                        exception.getMessage(),
                        "Authorization Error",
                        JOptionPane.ERROR_MESSAGE
                );

            }

        });



        loadRooms();


        setVisible(true);


    }




    private void loadRooms(){

        tableModel.setRowCount(0);

        List<Room> rooms = facade.getAllRooms();

        for(Room room : rooms){

            tableModel.addRow(new Object[]{

                    room.getRoomId(),

                    room.getBuilding(),

                    room.getLocation(),

                    room.getCapacity(),

                    room.isAvailableForBooking()
                            ? "ENABLED"
                            : "DISABLED"

            });

        }

    }





    public static void main(String[] args) {


        new AdminDashboard();


    }


}