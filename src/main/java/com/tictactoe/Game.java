package com.tictactoe;



public class Game {

    Board board;
    Boolean finished;
    Boolean isPlayerOne;
    Player player1;
    Player player2;
    

    public Game(String p1, String p2) {
        board = new Board();
        player1 = new Player(p1,'X');
        player2 = new Player(p2,'O');
        isPlayerOne = true;
        finished = false;
    }

    private void getNextMove(Player player) {
        System.out.println(player.getName() + " it's your turn:");
        System.out.println("Enter row:");
        //int row = Input.scan.nextInt() - 1;
        int row = Input.getInt() - 1;
        System.out.println("Enter column:");
        //int col = Input.scan.nextInt() - 1;
        int col = Input.getInt() - 1;
        if(board.isPositionFree(row, col)) {
            takeMove(player, row, col);
        } else {
            System.out.println("This position is taken, please try again");
            getNextMove(player);
        }

    }

    private void takeMove(Player player,int row, int col) {
        board.setPosition(row, col, player.getChar());
    }

    private Boolean isWinner(Player player) {
        if(board.isWinner(player.getChar())) {
            return true;
        } else {
            return false;
        }
        
    }

    private void winner(Player player) {
        System.out.println("Congratualtions " + player.getName() + " you have won!");
        board.printBoard();
    }


    public void run() {
        
        while(!finished) {
            board.printBoard();
            if(isPlayerOne) {
                getNextMove(player1);
                if(isWinner(player1)) {
                    finished = true;
                    winner(player1);
                }
            } else {
                getNextMove(player2);
                if(isWinner(player2)) {
                    finished = true;
                    winner(player2);
                }
            }
            isPlayerOne = !isPlayerOne;
        }

        System.out.println("Thank you for playing!");

    }
}
