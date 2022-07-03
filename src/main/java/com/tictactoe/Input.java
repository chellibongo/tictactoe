package com.tictactoe;

import java.util.Scanner;

public class Input {
    static final Scanner scan = new Scanner(System.in);
    /*
    TODO add exception handling and refactor Game to use these
    */
    public static int getInt() {
        while(!scan.hasNextInt()) {
            System.out.println("Please enter a value of 1, 2, or 3");
            scan.next();
        }
        return scan.nextInt();
    }

    public static String getString() {
        return scan.nextLine();
    }
}
