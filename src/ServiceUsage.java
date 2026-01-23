package model;

import java.time.LocalDate;

public class ServiceUsage {
    private Booking booking;
    private Service service;
    private int quantity;
    private LocalDate usedDate;

    public ServiceUsage(Booking booking, Service service, int quantity, LocalDate usedDate) {
        this.booking = booking;
        this.service = service;
        this.quantity = quantity;
        this.usedDate = usedDate;
    }

    public double getCost() {
        return service.getPrice() * quantity;
    }
}
