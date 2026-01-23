package model;

public class RoomType {
    private int typeId;
    private String typeName;
    private int maxGuest;
    private double basePrice;
    private String description;

    public RoomType(int typeId, String typeName, int maxGuest, double basePrice, String description) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.maxGuest = maxGuest;
        this.basePrice = basePrice;
        this.description = description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getTypeName() {
        return typeName;
    }
}
