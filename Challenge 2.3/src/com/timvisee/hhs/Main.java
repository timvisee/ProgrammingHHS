package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

    /**
     * The main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Define an array to put the values in
        int[] values = new int[3];

        // Read 3 values, show a status message
        System.out.println("Enter three integer values:");
        for(int i = 0; i < 3; i++)
            values[i] = scanner.nextInt();

        // Print the values
        for(int i = 0; i < 3; i++)
            System.out.println("Value " + (i + 1) + ": " + values[i]);

        // Show weather the the 3rd value is the smallest
        if(values[2] < Math.min(values[0], values[1]))
            System.out.println("The third value is the smallest of the three.");
        else
            System.out.println("The third value is NOT the smallest of the three.");
    }
}
