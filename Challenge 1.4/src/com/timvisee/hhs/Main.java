package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner to read the value
        Scanner scanner = new Scanner(System.in);

        // Read an integer value and print a status message
        System.out.println("Please enter a price: (separated with a comma)");
        float price = scanner.nextFloat();

        // Calculate the VAT and the total price
        float vat = price * 0.19f;
        float total = price + vat;

        // Print the price, VAT and total
        System.out.println("Price: " + price);
        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
    }
}
