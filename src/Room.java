package model;

public class Room {
    private int roomId;
    private String roomNumber;
    private RoomType roomType;
    private int floor;
    private double pricePerNight;
    private boolean isAvailable;

    public Room(int roomId, String roomNumber, RoomType roomType, int floor, double pricePerNight) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.floor = floor;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }

    public int getRoomId() {
        return this.roomId;
    }
    public String getRoomNumber() {
        return this.roomNumber;
    }
    public int getFloor() {
        return this.floor;
    }
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public double getPricePerNight() {
        return this.pricePerNight;
    }
    public boolean isAvailable() {
        return this.isAvailable;
    }
}
