/**
 * Developed by Tim Visee, as challenges for De Haagse Hoogeschool.
 * Copyright Tim Visee (c) 2015. All rights reserved.
 *
 * @author Tim Visee
 * @website http://timvisee.com/
 */

package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

    /** The number of values. */
    public static final int VALUE_COUNT = 3;

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner to read the values
        Scanner scanner = new Scanner(System.in);

        // Create an array to put the values in
        float[] values = new float[VALUE_COUNT];

        // Read the values and show a status message
        System.out.println("Enter three numeric values:");
        for(int i = 0; i < VALUE_COUNT; i++)
            values[i] = scanner.nextFloat();

        // Calculate the total
        float total = 0;
        for(int i = 0; i < VALUE_COUNT; i++)
            total += values[i];

        // Calculate the average
        float avg = total / VALUE_COUNT;

        // Print the results
        System.out.println("Total: " + total);
        System.out.println("Value count: " + VALUE_COUNT);
        System.out.println("Average: " + avg);
    }
}
