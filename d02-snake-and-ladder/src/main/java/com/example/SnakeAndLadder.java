package com.example;

import java.util.List;
import java.util.Scanner;

public class SnakeAndLadder {
    private Board board;
    private List<Player> players;
    Scanner scanner;
    private boolean isGameOver;
    private Player winner;

    public SnakeAndLadder(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
        scanner = new Scanner(System.in);
        isGameOver = false;
    }

    public void play() {
        while (!isGameOver) {
            for (Player player : players) {
                System.out.println(player.getName() + " Enter your dice value: ");
                int dice = scanner.nextInt();
                if (board.makeMove(player, dice)) {
                    isGameOver = true;
                    winner = player;
                    break;
                }
            }
            if(isGameOver) {
                System.out.println(winner.getName() + " is the winner");
            }
        }

    }
}
