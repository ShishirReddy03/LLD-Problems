package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    private static BookMyShow bookMyShow = null;
    Map<String, Show>shows;

    private BookMyShow() {
        shows = new HashMap<>();
    }

    public static synchronized BookMyShow getInstance() {
        if (bookMyShow == null)
            bookMyShow = new BookMyShow();
        return bookMyShow;
    }

    public List<String> getMoviesinScreen(String screenName) {
        List<String> movies = new ArrayList<>();
        for (Show show : shows.values()) {
            if (show.getScreen().getScreenName().equals(screenName) ) {
                movies.add(show.getMovieName() + " - " + show.getShowTiming());
            }
        }
        return movies;
    }

    public List<Screen> getScreensForMovie(String movieName) {
        List<Screen> screens = new ArrayList<>();
        for (Show show : shows.values()) {
            if (show.getMovieName().equals(movieName))
                screens.add(show.getScreen());
        }
        return screens;
    }

    public List<Seat> getAvailableSeats(Show show) {
        return show.getScreen().getAvailableSeats();
    }
    public void addShow(Show show) {
        shows.put(show.getShowName(), show);
    }

    public void removeShow(Show show) {
        shows.remove(show.getShowName());
    }

    public Ticket bookTickets(String showName, List<String> seatIds) {
        Show show = shows.get(showName);
        if (show.getScreen().bookSeats(seatIds))
            return new Ticket(show, seatIds);
        return null;
    }
}