
package com.tictactoe;

class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to tictactoe!");
        System.out.println("Please enter name of player 1:");
        String p1Name = Input.scan.nextLine();
        System.out.println("Please enter name of player 2:");
        String p2Name = Input.scan.nextLine();

        Game game = new Game(p1Name, p2Name);
        game.run();

        
    }
}