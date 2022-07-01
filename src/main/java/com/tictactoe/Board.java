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
        System.out.println();
        System.out.println("*123");
        System.out.println("1" + board[0][0] + board[1][0] + board[2][0]);
        System.out.println("2" + board[0][1] + board[1][1] + board[2][1]);
        System.out.println("3" + board[0][2] + board[1][2] + board[2][2]);
        System.out.println();
    }
    public boolean isPositionFree(int row, int col) {
        if(board[row][col] == '-') {
            return true;
        } else {
            return false;
        }
    }

    public void setPosition(int row, int col, char piece) {
        this.board[row][col] = piece;
    }

    public char getPosition(int row, int col) {
        return board[row][col];
    }

    private Boolean checkColWin(int i, char piece) {
        if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == piece) {
            return true;
        } else {
            return false;
        }

    }

    private Boolean checkRowWin(int i, char piece) {
        if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] == piece) {
            return true;
        } else {
            return false;
        }
    }
    private Boolean checkDiagonals(char piece) {
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == piece) {
            return true;
        }
        else if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[1][1] == piece) {
            return true;
        } else {
            return false;
        }
    }
    public Boolean isWinner(char piece) {
        if(checkDiagonals(piece)) {
            return true;
        }
        for(int i = 0; i < 3; i++) {
            if(checkRowWin(i, piece) || checkColWin(i, piece)) {
                return true;
            }
        }
        return false;
    }

}