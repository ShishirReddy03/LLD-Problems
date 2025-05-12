package com.example;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int limit;
    private Map<Integer, Integer>snakes;
    private Map<Integer, Integer>ladders;

    public Board() {
        limit = 25;
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        
        ladders.put(2, 10);
        ladders.put(3, 12);
        ladders.put(4, 14);

        snakes.put(20, 5);
        snakes.put(18, 13);
    }

    public boolean makeMove(Player player, int dice) {
        int currPos = player.getPosition();
        int finalPos = currPos + dice;

        finalPos = ladders.getOrDefault(finalPos, finalPos);
        finalPos = snakes.getOrDefault(finalPos, finalPos);
        player.goTo(finalPos);

        System.out.println("Moving " + player.getName() + " from " + currPos + " to " + finalPos);
        if(finalPos == limit)
            return true;
        return false;
    }
}
