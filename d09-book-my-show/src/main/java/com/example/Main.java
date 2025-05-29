package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Admin.setup();

        User user1 = new User("User1");
        System.out.println(user1.getMoviesinScreen("Screen1"));
        Ticket ticket1 = user1.bookTickets("Show2", Arrays.asList("A1", "A2"));
        System.out.println(ticket1);

        user1.bookTickets("Show2", Arrays.asList("A2"));
    }
    /*
     * Book My Show
     * Seat - seatId, isOccupied.
     * Screen - List<Seat>seats;
     * Show - movieName, Screen, TimeSlot(MATINEE, FIRST SHOW, etc)
     * Ticket - Show, ticketID, Seat.
     * 
     * BookMyShow - Filter By movies, Filter By timings, getVailableSeats(). etc
     * User - above functionalities.
     * Admin - AddMovie, RemoveMovie, etc.
     * 
     */
}