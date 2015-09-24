package com.timvisee.hhs;

import java.util.Scanner;

public class Main {

    public static final double BMI_MALE_MIN = 20.0;
    public static final double BMI_MALE_MAX = 25.0;
    public static final double BMI_FEMALE_MIN = 19.0;
    public static final double BMI_FEMALE_MAX = 24.0;

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Get the body mass, and make sure it's valid
        double bodyMass = 0.0f;
        boolean first = true;
        while(first || !isValidBodyMass(bodyMass)) {
            // Make sure the user entered the value correct the first time
            if(!first && !isValidBodyMass(bodyMass))
                System.out.println("The body mass you've entered is invalid!");

            // Get the body mass and show a status message
            System.out.println("Enter your body mass in kilograms:");
            bodyMass = scanner.nextDouble();

            // Set the first flag
            first = false;
        }

        // Get the body mass, and make sure it's valid
        double bodyLength = 0.0f;
        first = true;
        while(first || !isValidBodyLength(bodyLength)) {
            // Make sure the user entered the value correct the first time
            if(!first && !isValidBodyLength(bodyLength))
                System.out.println("The body mass you've entered is invalid!");

            // Get the body length and show a status message
            System.out.println("Enter your body length in meters:");
            bodyLength = scanner.nextDouble();

            // Set the first flag
            first = false;
        }

        boolean genderMale = true;
        first = true;
        boolean correct = false;
        while(first || !correct) {
            if(!first)
                System.out.println("The value you've entered is invalid!");

            // Get the user input and show a status message
            System.out.println("Enter your gender (m/f):");
            String genderStr = scanner.next();

            // Trim the gender string
            genderStr = genderStr.trim();

            // Determine the gender
            if(genderStr.equalsIgnoreCase("m")) {
                genderMale = true;
                correct = true;
            } else if(genderStr.equalsIgnoreCase("f")) {
                genderMale = false;
                correct = true;
            }

            // Update the first flag
            first = false;
        }

        // Calculate the BMI
        double bodyBmi = bodyMass / Math.pow(bodyLength, 2);

        // Print the body mass, length, gender and BMI
        System.out.println("");
        System.out.println("Body mass: " + bodyMass + " KG");
        System.out.println("Body length: " + bodyLength + " M");
        System.out.println("Gender: " + (genderMale ? "Male" : "Female"));
        System.out.println("Body BMI: " + bodyBmi);

        // Print whether the BMI is normal
        if(isNormalBmi(bodyBmi, genderMale))
            System.out.println("Your BMI is normal!");
        else
            System.out.println("Your BMI is NOT normal!");
    }

    /**
     * Check whether a body mass is valid.
     *
     * @param bodyMass The body mass in kilograms.
     *
     * @return True if the weight is valid, false if not.
     */
    public static boolean isValidBodyMass(double bodyMass) {
        return bodyMass > 0.0 && bodyMass < 1000.0;
    }

    /**
     * Check whether a body length is valid.
     *
     * @param bodyLength The body length in meters.
     *
     * @return True if the body length is valid, false if not.
     */
    public static boolean isValidBodyLength(double bodyLength) {
        return bodyLength > 0.0 && bodyLength < 5.0;
    }

    /**
     * Check whether the BMI is normal.
     *
     * @param bmi The BMI.
     * @param genderMale True if the gender is male, false if the gender is female.
     *
     * @return True if the BMI is normal.
     */
    public static boolean isNormalBmi(double bmi, boolean genderMale) {
        // Check whether the BMI is normal, based on the gender
        if(genderMale)
            return bmi >= BMI_MALE_MIN && bmi <= BMI_MALE_MAX;
        else
            return bmi >= BMI_FEMALE_MIN && bmi <= BMI_FEMALE_MAX;
    }
}
