package com.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Ticket>tickets;
    private BookMyShow bookMyShow;
    public User(String name) {
        this.name = name;
        bookMyShow = BookMyShow.getInstance();
        tickets = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List<String> getMoviesinScreen(String screenName) {
        return bookMyShow.getMoviesinScreen(screenName);
    }

    public List<Screen> getScreensForMovie(String movieName) {
        return bookMyShow.getScreensForMovie(movieName);
    }

    public Ticket bookTickets(String showName, List<String> seatIds) {
        Ticket ticket = bookMyShow.bookTickets(showName, seatIds);
        if(ticket!=null)
            tickets.add(ticket);
        return ticket;
    }
}
