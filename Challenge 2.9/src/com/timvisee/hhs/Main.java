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

    /** Football base cost. */
    public static final double FOOTBALL_COST = 175.0;
    /** Handball base cost. */
    public static final double HANDBALL_COST = 225.0;
    /** Age threshold for sale. */
    public static final int AGE_SALE_THRESHOLD = 40;
    /** Age threshold sale amount. */
    public static final double AGE_SALE_AMOUNT = 25.0;
    /** Membership time sale threshold. */
    public static final double MEMBER_TIME_SALE_THRESHOLD = 10.0;
    /** Membership time sale amount. */
    public static final double MEMBER_TIME_SALE_AMOUNT = 20.00;

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the sport type
        SportType sport = null;
        while(sport == null) {
            // Show a status message
            System.out.println("What sport do you play, Football or Handball? (F, H)");

            // Get the chosen sport value
            String val = scanner.nextLine().trim();

            // Determine the sport type, show an error message if invalid
            if(val.equalsIgnoreCase("F") || val.equalsIgnoreCase("V"))
                sport = SportType.FOOTBALL;

            else if(val.equalsIgnoreCase("H"))
                sport = SportType.HANDBALL;

            else
                System.out.println("You've entered an invalid sport type!");
        }

        // Get the user's age
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        // Get the user's member time
        System.out.println("How many years have you been a member?");
        double memberTime = scanner.nextDouble();

        // Print the input
        System.out.println("Sport: " + (sport == SportType.FOOTBALL ? "Football" : "Handball"));
        System.out.println("Age: " + age);
        System.out.println("Membership years: " + memberTime);

        // Determine the base cost
        double cost = 0.0f;
        switch(sport) {
        case FOOTBALL:
            cost = FOOTBALL_COST;
            break;
        case HANDBALL:
            cost = HANDBALL_COST;
        }

        // Sale for people over 40
        if(age > AGE_SALE_THRESHOLD)
            cost -= AGE_SALE_AMOUNT;

        // Sale for people that are a member for 10 years or more
        if(memberTime >= MEMBER_TIME_SALE_THRESHOLD)
            cost -= MEMBER_TIME_SALE_AMOUNT;

        // Print the cost
        System.out.println("Cost: " + cost + " EUR");
    }
}
