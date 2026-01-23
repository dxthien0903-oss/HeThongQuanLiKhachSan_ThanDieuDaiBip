package model;

public class Service {
    private int serviceId;
    private String serviceName;
    private double price;
    private String description;

    public Service(int serviceId, String serviceName, double price, String description) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
}
