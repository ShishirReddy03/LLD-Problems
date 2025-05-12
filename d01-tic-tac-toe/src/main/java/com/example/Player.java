package com.example;

public class Player {
    private String name;
    private Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }
    public Symbol getSymbol() {
        return symbol;
    }

    public void makeMove(int i, int j, Board board) {
        board.makeMove(i, j, symbol);
    }
}
