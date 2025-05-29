package com.example;

import java.util.List;

public class Show {
    private String showName;
    private String movieName;
    private ShowTiming showTiming;
    private Screen screen;

    public Show(String showName, String movieName, ShowTiming showTiming, Screen screen) {
        this.showName = showName;
        this.movieName = movieName;
        this.showTiming = showTiming;
        this.screen = screen;
        this.screen.freeUp();
    }

    public String getMovieName() {
        return movieName;
    }

    public String getShowName() {
        return showName;
    }
    public ShowTiming getShowTiming() {
        return showTiming;
    }
    public Screen getScreen() {
        return screen;
    }

    public boolean bookSeats(List<String> seatsToBeBooked) {
        return this.screen.bookSeats(seatsToBeBooked);
    }

}
