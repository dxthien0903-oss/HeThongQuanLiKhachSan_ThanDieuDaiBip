package model;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private Customer customer;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String status;

    public Booking(int bookingId, Customer customer, Room room,
                   LocalDate checkInDate, LocalDate checkOutDate) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = "BOOKED";
        room.setAvailable(false);
    }

    public long getTotalNights() {
        return java.time.temporal.ChronoUnit.DAYS.between(checkInDate, checkOutDate);
    }
    public double calculateRoomCost() {
        return getTotalNights() * room.getPricePerNight();
    }
    public String getStatus() {
        return this.status;
    }
    public int getBookingId() {
        return this.bookingId;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    public Room getRoom() {
        return this.room;
    }
    public LocalDate getCheckInDate() {
        return this.checkInDate;
    }
    public LocalDate getCheckOutDate() {
        return this.checkOutDate;
    }
}
