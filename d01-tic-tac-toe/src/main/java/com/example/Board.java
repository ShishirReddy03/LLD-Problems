package com.example;

public class Board {
    private Symbol grid[][];
    private int size;

    public Board(int size) {
        this.size = size;
        grid = new Symbol[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void makeMove(int i, int j, Symbol s) {
        grid[i][j] = s;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == Symbol.EMPTY)
                    return false;
            }
        }
        return true;
    }

    public boolean isValidMove(int i, int j) {
        if(grid[i][j]!=Symbol.EMPTY)
            return false;
        if(i<0 || i>=size || j<0 || j>=size)
            return false;
        
        return true;
    }
    public boolean isWinState() {
        return isWinStateRow();
    }

    public boolean isWinStateRow() {
        for (int i = 0; i < size; i++) {
            Symbol s = grid[i][0];
            if (s == Symbol.EMPTY)
                continue;
            boolean flag = true;
            for (int j = 0; j < size; j++) {
                if (grid[i][j] != s) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");

            }
            System.out.println("");
        }
    }

}
