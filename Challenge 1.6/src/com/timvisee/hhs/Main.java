/**
 * Developed by Tim Visee, as challenges for De Haagse Hoogeschool.
 * Copyright Tim Visee (c) 2015. All rights reserved.
 *
 * @author Tim Visee
 * @website http://timvisee.com/
 */

package com.timvisee.hhs;

import javax.swing.*;

public class Main {

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Show an input dialog and get the name
        String name = JOptionPane.showInputDialog("Please enter your name:");

        // Make sure a name is entered
        if(name == null) {
            // Show an error message
            System.out.println("You didn't enter a valid name!");
            JOptionPane.showMessageDialog(null, "You didn't enter a valid name!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Show a message dialog with the name and print the name to the console
        System.out.println("Hello " + name + "!");
        JOptionPane.showMessageDialog(null, "Hello " + name, "Hello", JOptionPane.INFORMATION_MESSAGE);
    }
}
