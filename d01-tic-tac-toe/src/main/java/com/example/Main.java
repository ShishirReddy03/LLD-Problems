package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Board board = new Board(3);
        Player playerX = new Player("p1", Symbol.X);
        Player playerO = new Player("p2", Symbol.O);

        TicTacToe game = new TicTacToe(playerX, playerO, board);
        game.play();
    }
}