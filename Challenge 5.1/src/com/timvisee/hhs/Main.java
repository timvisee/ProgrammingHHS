package com.timvisee.hhs;

import java.util.Random;

public class Main {

    /** Define the length of the array. */
    public static final int ARRAY_LENGTH = 20;
    /** Define the maximum number in the array (excluded). */
    public static final int NUMBER_MAX = 150;

    /** Define the array itself. */
    private static int[] myArray = new int[ARRAY_LENGTH];

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Fill the array with random numbers
        fillRandom();

        // Print the array
        printContents();
        System.out.println("");

        // Get and print the lowest value
        int lowest = getLowest();
        System.out.println("Lowest value: " + lowest);

        // Count the number of occurrences
        int occurrences = getOccurrence(lowest);
        System.out.println("Occurrences of " + lowest + ": " + occurrences);
    }

    /**
     * Fill the array with random numbers.
     */
    public static void fillRandom() {
        // Create a random object to generate random numbers
        Random rand = new Random();

        // Loop through all the items in the array
        for(int i = 0; i < myArray.length; i++)
            myArray[i] = rand.nextInt(NUMBER_MAX);
    }

    /**
     * Print the contents of the array.
     */
    public static void printContents() {
        // Show a result header
        System.out.println("Array contents:");

        // Loop through all the items
        for(int i = 0; i < myArray.length; i++)
            System.out.println("- " + myArray[i]);
    }

    /**
     * Get the lowest value in the array.
     *
     * @return The lowest value in the array.
     */
    public static int getLowest() {
        // Define a variable to store the smallest number in, and put the first number in it at the start
        int lowest = myArray[0];

        // Loop through the array (except the first item) to determine the lowest value
        for(int i = 1; i < myArray.length; i++)
            if(myArray[i] < lowest)
                lowest = myArray[i];

        // Return the lowest value
        return lowest;
    }

    /**
     * Get the occurrence count of a specific value in the array.
     *
     * @param value The value.
     *
     * @return The number of occurrences of this value.
     */
    public static int getOccurrence(int value) {
        // Define an array to count the occurrences
        int occurrences = 0;

        // Loop through the array to count the occurrences of the value
        for(int i = 0; i < myArray.length; i++)
            if(myArray[i] == value)
                occurrences++;

        // Return the occurrences count
        return occurrences;
    }
}
