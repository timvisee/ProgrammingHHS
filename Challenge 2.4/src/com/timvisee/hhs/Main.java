package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

    /**
     * The main method called on start.
     *
     * @param args The startup arguments.
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

        // Calculate the values
        int sum = values[0] + values[1] + values[2];
        float avg = sum / 3.0f;
        int product = values[0] * values[1] * values[2];
        int max = Math.max(values[0], Math.max(values[1], values[2]));
        int min = Math.min(values[0], Math.min(values[1], values[2]));

        // Print the values
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Product: " + product);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
