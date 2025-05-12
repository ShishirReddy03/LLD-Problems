package com.example;

public class Player {
    private String name;
    private int position;

    public Player(String name) {
        this.name = name;
        position = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return position;
    }

    public void goTo(int p) {
        this.position = p;
    }
}
