package model;

import java.util.List;

public class Invoice {
    private int invoiceId;
    private Booking booking;
    private double roomCost;
    private double serviceCost;
    private double totalAmount;

    public Invoice(int invoiceId, Booking booking, List<ServiceUsage> services) {
        this.invoiceId = invoiceId;
        this.booking = booking;
        this.roomCost = booking.calculateRoomCost();
        this.serviceCost = services.stream().mapToDouble(ServiceUsage::getCost).sum();
        this.totalAmount = roomCost + serviceCost;
    }
    public int getInvoiceId() {
        return this.invoiceId;
    }
    public Booking getBooking() {
        return this.booking;
    }
    public double getRoomCost() {
        return this.roomCost;
    }
    public double getServiceCost() {
        return this.serviceCost;
    }
    public double getTotalAmount() {
        return this.totalAmount;
    }
}
