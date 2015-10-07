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

    /** The lowest percentage to get a 1. */
    public static final float SCORE_LOWEST_PERCENTAGE = 0.25f;

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner object to read the price
        Scanner scanner = new Scanner(System.in);

        // Show a status message and read the value
        System.out.println("Please enter the score as percentage: (separated with a comma)");
        float score = scanner.nextFloat() / 100;

        // Remap the score
        float scoreMapped = map(score, SCORE_LOWEST_PERCENTAGE, 1.0f, 0.1f, 1.0f);

        // Calculate the score in Dutch format
        float scoreTen = scoreMapped * 10.0f;

        // Make sure the score is in-bound
        scoreTen = Math.min(Math.max(scoreTen, 1), 10);

        // Print the results
        System.out.println("Percentage: " + (score * 100) + "%");
        System.out.println("Score: " + scoreTen);
    }

    /**
     * Remap a value with a different scale.
     *
     * @param value The value
     * @param fromLow Source lowest.
     * @param fromHigh Source highest.
     * @param toLow Destination lowest.
     * @param toHigh Destination highest.
     *
     * @return The remapped value.
     */
    public static float map(float value, float fromLow, float fromHigh, float toLow, float toHigh) {
        // Calculate the ranges and scale factor
        float fromRange = fromHigh - fromLow;
        float toRange = toHigh - toLow;
        float scaleFactor = toRange / fromRange;

        // Re-zero the value within the from range
        float result = value - fromLow;

        // Rescale the value to the to range
        result *= scaleFactor;

        // Re-zero back to the to range
        return result + toLow;
    }
}
