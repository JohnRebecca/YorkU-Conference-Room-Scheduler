package scheduler.view;

import scheduler.model.Room;
import scheduler.service.RoomManagementFacade;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.List;

public class RoomManagementPanel extends JPanel {
    private final RoomManagementFacade facade;
    private final DefaultTableModel tableModel;
    private final JTable roomTable;
    private final InlineMessagePanel messagePanel;

    private final JTextField roomIDField;
    private final JTextField buildingField;
    private final JTextField locationField;
    private final JTextField capacityField;

    private final Runnable onGenerateAdminRequested;

    public RoomManagementPanel() {
        this(null);
    }

    /** onGenerateAdminRequested may be null (e.g. no navigation available) - the link is simply omitted. */
    public RoomManagementPanel(Runnable onGenerateAdminRequested) {
        this.onGenerateAdminRequested = onGenerateAdminRequested;
        facade = new RoomManagementFacade();

        setLayout(new BorderLayout(20, 20));
        setBackground(Theme.BG);
        setBorder(BorderFactory.createEmptyBorder(28, 30, 28, 30));

        roomIDField = new JTextField();
        buildingField = new JTextField();
        locationField = new JTextField();
        capacityField = new JTextField();

        messagePanel = new InlineMessagePanel();

        tableModel = new DefaultTableModel(
                new String[] {"Room ID", "Building", "Location", "Capacity", "Status"},
                0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        roomTable = new JTable(tableModel);
        roomTable.setRowHeight(26);
        roomTable.setFillsViewportHeight(true);
        roomTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        roomTable.setBackground(Theme.WHITE);
        roomTable.setGridColor(Theme.GRAY_BORDER);

        // Clicking a row fills in the Room ID field so Enable/Disable/Close act on
        // the selected room - previously nothing connected the table to that field,
        // so those buttons had no way to know which room to update.
        roomTable.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = roomTable.getSelectedRow();
                if (selectedRow >= 0) {
                    roomIDField.setText(tableModel.getValueAt(selectedRow, 0).toString());
                }
            }
        });

        add(createHeader(), BorderLayout.NORTH);
        add(createBody(), BorderLayout.CENTER);

        refreshRooms();
    }

    private JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.setOpaque(false);

        JLabel title = new JLabel("Room Management");
        title.setFont(Theme.titleFont(32));
        title.setForeground(Theme.TEXT_DARK);

        JLabel subtitle = new JLabel("(Admin) Add, edit, enable/disable rooms.");
        subtitle.setFont(Theme.bodyFont(15));
        subtitle.setForeground(Theme.TEXT_BODY);

        header.add(title);
        header.add(Box.createVerticalStrut(4));
        header.add(subtitle);

        if (onGenerateAdminRequested != null) {
            header.add(Box.createVerticalStrut(10));

            RoundedButton generateAdminLink = new RoundedButton("Generate New Admin \u2192", RoundedButton.Style.SECONDARY);
            generateAdminLink.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            generateAdminLink.addActionListener(event -> onGenerateAdminRequested.run());

            JPanel linkWrap = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
            linkWrap.setOpaque(false);
            linkWrap.add(generateAdminLink);
            header.add(linkWrap);
        }

        header.add(Box.createVerticalStrut(10));
        header.add(messagePanel);

        return header;
    }

    private JComponent createBody() {
        JPanel content = new JPanel(new GridBagLayout());
        content.setOpaque(false);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(8, 0, 8, 0);

        constraints.gridy = 0;
        content.add(createRoomCard(), constraints);

        constraints.gridy = 1;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        content.add(createTableCard(), constraints);

        JScrollPane scrollPane = new JScrollPane(content);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getViewport().setBackground(Theme.BG);
        return scrollPane;
    }

    private JComponent createRoomCard() {
        CardPanel card = new CardPanel(new BorderLayout(16, 16));
        card.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));

        JLabel title = sectionTitle("Room Actions");
        card.add(title, BorderLayout.NORTH);
        card.add(createRoomForm(), BorderLayout.CENTER);
        return card;
    }

    private JComponent createTableCard() {
        CardPanel card = new CardPanel(new BorderLayout(16, 16));
        card.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));

        JLabel title = sectionTitle("Current Rooms");
        card.add(title, BorderLayout.NORTH);
        card.add(new JScrollPane(roomTable), BorderLayout.CENTER);
        return card;
    }

    private JPanel createRoomForm() {
        JPanel form = new JPanel(new GridBagLayout());
        form.setOpaque(false);

        GridBagConstraints constraints = baseFormConstraints();
        int row = 0;

        addFieldRow(form, constraints, row++, "Room ID", roomIDField);
        addFieldRow(form, constraints, row++, "Building", buildingField);
        addFieldRow(form, constraints, row++, "Location", locationField);
        addFieldRow(form, constraints, row++, "Capacity", capacityField);

        JPanel buttons = new JPanel(new GridLayout(1, 4, 10, 0));
        buttons.setOpaque(false);

        RoundedButton addButton = new RoundedButton("Add Room", RoundedButton.Style.PRIMARY);
        RoundedButton enableButton = new RoundedButton("Enable", RoundedButton.Style.SECONDARY);
        RoundedButton disableButton = new RoundedButton("Disable", RoundedButton.Style.SECONDARY);
        RoundedButton closeButton = new RoundedButton("Close", RoundedButton.Style.SECONDARY);

        addButton.addActionListener(event -> addRoom());
        enableButton.addActionListener(event -> changeRoomStatus(true));
        disableButton.addActionListener(event -> changeRoomStatus(false));
        closeButton.addActionListener(event -> closeRoom());

        buttons.add(addButton);
        buttons.add(enableButton);
        buttons.add(disableButton);
        buttons.add(closeButton);

        constraints.gridx = 0;
        constraints.gridy = row;
        constraints.gridwidth = 2;
        form.add(buttons, constraints);

        return form;
    }

    private GridBagConstraints baseFormConstraints() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(6, 0, 6, 12);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        return constraints;
    }

    private void addFieldRow(JPanel form, GridBagConstraints constraints, int row, String labelText, JTextField field) {
        JLabel label = new JLabel(labelText);
        label.setFont(Theme.boldFont(13));
        label.setForeground(Theme.TEXT_DARK);

        field.setFont(Theme.bodyFont(13));
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.GRAY_BORDER),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));

        constraints.gridwidth = 1;
        constraints.gridy = row;
        constraints.gridx = 0;
        constraints.weightx = 0.25;
        form.add(label, constraints);

        constraints.gridx = 1;
        constraints.weightx = 0.75;
        form.add(field, constraints);
    }

    private JLabel sectionTitle(String text) {
        JLabel title = new JLabel(text);
        title.setFont(Theme.boldFont(18));
        title.setForeground(Theme.TEXT_DARK);
        return title;
    }

    private void addRoom() {
        try {
            Room room = new Room(
                    roomIDField.getText().trim(),
                    Integer.parseInt(capacityField.getText().trim()),
                    buildingField.getText().trim(),
                    locationField.getText().trim()
            );

            facade.addRoom(room);
            refreshRooms();
            messagePanel.showSuccess("Room added successfully.");
        } catch (NumberFormatException exception) {
            messagePanel.showError("Capacity must be a valid number.");
        } catch (RuntimeException exception) {
            messagePanel.showError("Unable to add room: " + exception.getMessage());
        }
    }

    private void changeRoomStatus(boolean enabled) {
        String roomId = roomIDField.getText().trim();
        if (roomId.isEmpty()) {
            messagePanel.showError("Room ID is required.");
            return;
        }

        try {
            if (enabled) {
                facade.enableRoom(roomId);
                messagePanel.showSuccess("Room enabled.");
            } else {
                facade.disableRoom(roomId);
                messagePanel.showSuccess("Room disabled.");
            }
            refreshRooms();
        } catch (RuntimeException exception) {
            messagePanel.showError("Unable to update room: " + exception.getMessage());
        }
    }

    private void closeRoom() {
        String roomId = roomIDField.getText().trim();
        if (roomId.isEmpty()) {
            messagePanel.showError("Room ID is required.");
            return;
        }

        try {
            facade.closeRoom(roomId);
            refreshRooms();
            messagePanel.showSuccess("Room closed for maintenance.");
        } catch (RuntimeException exception) {
            messagePanel.showError("Unable to close room: " + exception.getMessage());
        }
    }

    public void refreshRooms() {
        tableModel.setRowCount(0);

        List<Room> rooms = facade.getAllRooms();
        for (Room room : rooms) {
            tableModel.addRow(new Object[] {
                    room.getRoomId(),
                    room.getBuilding(),
                    room.getLocation(),
                    room.getCapacity(),
                    room.isAvailableForBooking() ? "ENABLED" : "DISABLED"
            });
        }
    }
}