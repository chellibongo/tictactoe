
package com.tictactoe;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to tictactoe!");
        System.out.println("Please enter name of player 1:");
        String p1Name = scanner.nextLine();
        System.out.println("Please enter name of player 2:");
        String p2Name = scanner.nextLine();

        Board board = new Board();
        board.printBoard();

        
    }
}