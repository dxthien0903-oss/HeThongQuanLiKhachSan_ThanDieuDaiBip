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

    public int getServiceId() {
        return this.serviceId;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
}
