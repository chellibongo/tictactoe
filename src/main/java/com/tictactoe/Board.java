package com.tictactoe;

public class Board 
{

    char[][] board;

    //initialise board and set each value to '-'
    Board() {
        board = new char[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    //method to print current state of game board
    public void printBoard() {
        System.out.println("*123");
        System.out.println("1" + board[0][0] + board[0][1] + board[0][2]);
        System.out.println("2" + board[1][0] + board[1][1] + board[1][2]);
        System.out.println("3" + board[2][0] + board[2][1] + board[2][2]);
    }

    public static void main( String[] args )
    {
        
    }
}
