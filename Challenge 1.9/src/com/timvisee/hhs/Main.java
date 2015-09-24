package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

    /** The number of seconds in a minute. */
    public static final int MINUTE_SECONDS = 60;
    /** The number of seconds in a hour. */
    public static final int HOUR_SECONDS = MINUTE_SECONDS * 60;

    /**
     * com.timvisee.hhs.Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner to read the int value
        Scanner scanner = new Scanner(System.in);

        // Show a message to enter the number of seconds
        System.out.println("Please enter the number of seconds you want to calculate the duration for:");

        // Read the number of seconds
        int totalSeconds = scanner.nextInt();

        // Show the total number of seconds
        System.out.println("Seconds total: " + totalSeconds);

        // Calculate the duration in hours, minutes and seconds
        int seconds = totalSeconds;
        int hours = seconds / HOUR_SECONDS;
        seconds -= hours * HOUR_SECONDS;
        int minutes = seconds / MINUTE_SECONDS;
        seconds -= minutes * MINUTE_SECONDS;

        // Print the number of hours, minutes and seconds
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }
}
