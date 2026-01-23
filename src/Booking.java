package model;

import enums.BookingStatus;
import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private Customer customer;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private BookingStatus status;

    public Booking(int bookingId, Customer customer, Room room,
                   LocalDate checkInDate, LocalDate checkOutDate) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = BookingStatus.BOOKED;
        room.setAvailable(false);
    }

    public long getTotalNights() {
        return java.time.temporal.ChronoUnit.DAYS.between(checkInDate, checkOutDate);
    }

    public double calculateRoomCost() {
        return getTotalNights() * room.getPricePerNight();
    }

    public BookingStatus getStatus() {
        return status;
    }
}
