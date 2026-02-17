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

    public int getTypeId() {
        return this.typeId;
    }
    public String getTypeName() {
        return this.typeName;
    }
    public int getMaxGuest() {
        return this.maxGuest;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public String getDescription() {
        return this.description;
    }
}
