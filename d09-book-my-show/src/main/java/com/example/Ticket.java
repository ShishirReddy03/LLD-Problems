package com.example;

import java.util.List;

public class Ticket {
    private Show show;
    private List<String>seatIds;

    public Ticket(Show show, List<String>seatIds) {
        this.show = show;
        this.seatIds = seatIds;
    }

    public Show getShow() {
        return show;
    }

    public List<String> getSeats() {
        return seatIds;
    }

    @Override
    public String toString() {
        String result = "";
        result += show.getMovieName();
        result += " - ";
        result += show.getScreen().getScreenName();
        result += " : ";
        
        for(String seatId: seatIds)
            result += seatId + " ";

        return result;
    }
}
