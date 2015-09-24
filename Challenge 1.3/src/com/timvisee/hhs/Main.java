package com.timvisee.hhs;

public class Main {

    /** The maximum value of the sum. */
    public static final int MAX = 10;

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Calculate the sum, and print the result
        System.out.println("Sum of 1 to " + MAX + ": " + (MAX * (MAX + 1) / 2));
    }
}
