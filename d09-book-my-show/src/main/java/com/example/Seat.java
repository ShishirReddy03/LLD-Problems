package com.example;

public class Seat {
    private String seatId;
    private boolean isOccupied;
    private SeatLocation location;

    public Seat(String seatId, SeatLocation location) {
        this.seatId = seatId;
        isOccupied = false;
        this.location = location;
    }

    public String getSeatId() {
        return seatId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public SeatLocation getLocation() {
        return location;
    }

    public void bookSeat() {
        if (isOccupied) {
            System.out.println("Seat already booked");
            return;
        }
        isOccupied =  true;
    }

    public void freeUp() {
        isOccupied = false;
    }
}
