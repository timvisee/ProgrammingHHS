package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner to read integer values
        Scanner scanner = new Scanner(System.in);

        // Read two integer values, and show a status message
        System.out.println("Enter two integer values:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Determine which value is the largest
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // Show a status message
        System.out.println("You've entered the values: " + a + ", " + b);

        // Show the maximum and minimum value
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
