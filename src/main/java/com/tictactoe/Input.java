package com.tictactoe;

import java.util.Scanner;

public class Input {
    static final Scanner scan = new Scanner(System.in);
    /*
    TODO add exception handling and refactor Game to use theser
    */
    public static int getInt() {
        return scan.nextInt();
    }
    public static String getString() {
        return scan.nextLine();
    }
}
