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
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner // Gather the metal lathe properties
        Scanner scanner = new Scanner(System.in);

        // Gather the metal lathe properties
        System.out.println("Enter the number of working hours for the metal lathe:");
        double workHours = scanner.nextDouble();
        System.out.println("Enter the age of the metal lathe:");
        double age = scanner.nextDouble();
        System.out.println("Enter defects per year for the metal lathe:");
        double defectsPerYear = scanner.nextDouble();

        // Create the metal lathe object
        MetalLathe metalLathe = new MetalLathe(workHours, age, defectsPerYear);

        // Determine whether the metal lathe should be replaced, return the result
        if(metalLathe.shouldReplace())
            System.out.println("The metal lathe should be replaced!");
        else
            System.out.println("The metal lathe doesn't need to be replaced.");
    }
}
