package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Screen {
    private String screenName;
    private Map<String, Seat> seats;

    public Screen(String screenName, Map<String, Seat> seats) {
        this.seats = seats;
        this.screenName = screenName;
    }

    public String getScreenName() {
        return screenName;
    }

    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats.values()) {
            if (!seat.isOccupied())
                availableSeats.add(seat);
        }
        return availableSeats;
    }

    public boolean bookSeats(List<String> seatsToBeBooked) {
        for (String seatId : seatsToBeBooked) {
            Seat seat = seats.get(seatId);
            if (seat.isOccupied()) {
                System.out.println(seat.getSeatId() + " seat is not Available");
                return false;
            }
        }

        for (String seatId : seatsToBeBooked) {
            Seat seat = seats.get(seatId);
            seat.bookSeat();
        }
        return true;
    }

    public void freeUp() {
        for (Seat seat : seats.values()) {
            seat.freeUp();
        }
    }
}
