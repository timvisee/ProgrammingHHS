package com.timvisee.hhs;
import java.util.*;

public class Short {

    /** Define the length of the array. */
    public static final int ARRAY_LENGTH = 20;
    /** Define the maximum number in the array (excluded). */
    public static final int NUMBER_MAX = 150;

    /**
     * Main method called on start.
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Define the array and some variables
        int[] a = new int[ARRAY_LENGTH];
        int i, l, o = 0;

        // Fill the array with random numbers
        for(i = 0; i < a.length; i++) a[i] = (new Random()).nextInt(NUMBER_MAX);

        // Print the array contents
        System.out.println("Array contents:");
        for(i = 0; i < a.length; i++) System.out.println("- " + a[i] + (i == a.length - 1 ? "\n" : ""));

        // Get the lowest value, print the result
        Arrays.sort(a);
        System.out.format("Lowest value: %d", (l = a[0]));

        // Get the occurrences of the lowest value, print the result
        for(int e : a) o += (e == l) ? 1 : 0;
        System.out.format("Occurrences of %d: %d", l, o);
    }
}
