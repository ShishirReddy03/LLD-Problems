package com.example;

import java.util.HashMap;
import java.util.Map;

public class Admin {

    public static void setup() {
        BookMyShow bookMyShow = BookMyShow.getInstance();
        Seat seat1 = new Seat("A1", SeatLocation.BALCONY);
        Seat seat2 = new Seat("A2", SeatLocation.BALCONY);
        Seat seat3 = new Seat("A3", SeatLocation.BALCONY);
        Map<String, Seat> seats = new HashMap<>();
        seats.put("A1", seat1);
        seats.put("A2", seat2);
        seats.put("A3", seat3);

        Screen screen1 = new Screen("Screen1", seats);
        Screen screen2 = new Screen("Screen2", seats);
        // Screen screen3 = new Screen("Screen2", seats);

        Show show1 = new Show("Show1", "Movie-1", ShowTiming.MORNING, screen1);
        Show show2 = new Show("Show2", "Movie-1", ShowTiming.MORNING, screen2);
        Show show3 = new Show("Show3", "Movie-2", ShowTiming.MATINEE, screen1);

        bookMyShow.addShow(show1);
        bookMyShow.addShow(show2);
        bookMyShow.addShow(show3);

    }
}
