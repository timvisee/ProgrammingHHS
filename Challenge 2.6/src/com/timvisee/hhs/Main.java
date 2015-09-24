package com.timvisee.hhs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /** Create a list of results. */
    private static List<Result> results = new ArrayList<>();

    /**
     * The main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) {
        // Initialize
        init();

        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Read the score value and show a status message
        System.out.println("Please enter a score value from 1 to 100:");
        int score = scanner.nextInt();

        // Get the result for this score
        Result result = getResult(score);

        // Print the score and result
        System.out.println("Score: " + score);
        System.out.println("Result: " + result.getLetter());

        // Show whether the person has a good enough score
        if(score >= 60)
            System.out.println("The score is good enough!");
        else
            System.out.println("The score is NOT good enough!");
    }

    /**
     * Initialize.
     */
    public static void init() {
        // Add the values to the results list
        results.add(new Result("A", 90, 100));
        results.add(new Result("B", 80, 89));
        results.add(new Result("C", 70, 79));
        results.add(new Result("D", 60, 69));
        results.add(new Result("F", 0, 59));
    }

    /**
     * Get the proper results based on the score.
     *
     * @param val The score value.
     *
     * @return The correct result for this score value.
     */
    public static Result getResult(int val) {
        // Loop through the results and return the correct one
        for(Result result : results)
            if(result.inRange(val))
                return result;

        // Return the last result
        return results.get(results.size() - 1);
    }
}
