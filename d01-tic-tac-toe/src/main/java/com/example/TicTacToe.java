package com.example;

import java.util.Scanner;

public class TicTacToe {
    Player playerX;
    Player playerO;
    Player currentPlayer;
    Board board;
    Scanner sc;

    public TicTacToe(Player playerX, Player playerO, Board board) {
        this.playerO = playerO;
        this.playerX = playerX;
        this.currentPlayer = playerX;
        this.board = board;
        this.sc = new Scanner(System.in);

    }

    public void play() {
        while (!board.isFull() && !board.isWinState()) {
            board.display();
            System.out.println(currentPlayer.getName() + " Enter the coordinates: ");
            int i = sc.nextInt();
            int j = sc.nextInt();
            while (!board.isValidMove(i, j)) {
                i = sc.nextInt();
                j = sc.nextInt();
            }
            currentPlayer.makeMove(i, j, board);
            if (board.isWinState()) {
                board.display();
                System.out.println(currentPlayer.getName() + " is the winner");
                return;
            }
            currentPlayer = (currentPlayer == playerX) ? playerO : playerX;

        }
        // while (!board.isFull() && !board.isWinState()) {
        // board.display();
        // System.out.println("Player X, Enter the coordinates: ");
        // int i = sc.nextInt();
        // int j = sc.nextInt();
        // board.makeMove(i, j, Symbol.X);
        // if (board.isWinState()) {
        // board.display();
        // System.out.println("Player X is the winner");
        // return;
        // }

        // board.display();
        // System.out.println("Player O, Enter the coordinates: ");
        // i = sc.nextInt();
        // j = sc.nextInt();
        // board.makeMove(i, j, Symbol.O);
        // if (board.isWinState()) {
        // board.display();
        // System.out.println("Player O is the winner");
        // return;
        // }

        // }
    }
}
