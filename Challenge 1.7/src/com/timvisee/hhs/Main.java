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

    /** The convesion rates to convert euro's to US dollars. */
    public static final float CONVERSION_RATES_EUR_USD = 1.11f;

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner object to read the price
        Scanner scanner = new Scanner(System.in);

        // Show a status message and read the value
        System.out.println("Please enter a price: (separated with a comma)");
        float price = scanner.nextFloat();

        // Convert the money
        float priceUsd = price * CONVERSION_RATES_EUR_USD;

        // Print the values
        System.out.println("Price EUR: " + price);
        System.out.println("Conversion rates EUR to USD: " + CONVERSION_RATES_EUR_USD);
        System.out.println("Price USD: " + priceUsd);
    }
}
