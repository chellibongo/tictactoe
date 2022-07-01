package com.tictactoe;

public class Player {
    private String name;
    private char piece;

    public Player(String name, char piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return this.name;
    }

    public char getChar() {
        return this.piece;
    }
}
