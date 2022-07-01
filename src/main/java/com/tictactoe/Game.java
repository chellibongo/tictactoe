package com.tictactoe;

public class Game {
    Board board;
    String player1;
    String player2;

    public Game(String p1, String p2) {
        board = new Board();
        player1 = p1;
        player2 = p2;

    }
}
