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

    /**
     * Main method called on start.
     *
     * @param args The startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Read two values and show a status message
        System.out.println("Enter two integer values:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Print the values
        System.out.println("Value 1: " + a);
        System.out.println("Value 2: " + b);

        // Check weather the value b is a multiple of a
        boolean multiple = b % a == 0;

        // Print the result
        if(multiple)
            System.out.println("The value " + b + " is a multiple of " + a + "!");
        else
            System.out.println("The value " + b + " is NOT a multiple of " + a + "!");
    }
}
