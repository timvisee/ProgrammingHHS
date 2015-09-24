package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

    public static final String[] faces = {"Klaveren", "Ruiten", "Harten", "Schoppen"};

    /**
     * Main method called on start.
     *
     *  @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner to read the integer value
        Scanner scanner = new Scanner(System.in);

        // Read an integer value and show a status message
        System.out.println("Enter a value between 1 and 4:");
        boolean first = true;
        int val = 0;
        while(val < 1 || val > (faces.length)) {
            // Show an error message if the value is invalid
            if(!first)
                System.out.println("The value you've entered is invalid!");

            // Read the integer value
            val = scanner.nextInt();

            // Set whether the first loop has finished
            first = false;
        }

        // Show the number
        System.out.println("Value: " + val);

        // Print the side
        System.out.println("Face: " + faces[val - 1]);
    }
}
