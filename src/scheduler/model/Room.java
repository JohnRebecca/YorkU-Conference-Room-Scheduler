package scheduler.model;

public class Room {
    private String roomId;
    private int capacity;
    private String building;
    private String location;
    private boolean enabled;
    private boolean closedForMaintenance;

    public Room(String roomId, int capacity, String building, String location) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.building = building;
        this.location = location;
        this.enabled = true;
        this.closedForMaintenance = false;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBuilding() {
        return building;
    }

    public String getLocation() {
        return location;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isClosedForMaintenance() {
        return closedForMaintenance;
    }

    public boolean isAvailableForBooking() {
        return enabled && !closedForMaintenance;
    }

    public void enable() {
        this.enabled = true;
    }

    public void disable() {
        this.enabled = false;
    }

    public void closeForMaintenance() {
        this.closedForMaintenance = true;
    }

    public void reopenFromMaintenance() {
        this.closedForMaintenance = false;
    }

    @Override
    public String toString() {
        return roomId + " - " + building + " - " + location + " - Capacity: " + capacity;
    }
}