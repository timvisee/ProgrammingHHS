package com.timvisee.hhs;

public class Main {

    /** Variable count. */
    public static final int VAR_COUNT = 3;

    /**
     * Main method called on start.
     *
     * @param args Startup arguments.
     */
    public static void main(String[] args) throws Exception {
        // Define an array to put the variables in
        String[] vars = new String[VAR_COUNT];

        // Make sure enough startup arguments are given
        if(args.length < VAR_COUNT)
            throw new Exception("Not enough startup arguments given, " + VAR_COUNT + " arguments are required.");

        // Copy the arguments
        System.arraycopy(args, 0, vars, 0, VAR_COUNT);

        // Print each variable on a separate line
        for(String var : vars)
            System.out.println(var);

        // Print each variable on a single line
        for(int i = 0; i < vars.length; i++)
            System.out.print(vars[i] + ((i == vars.length - 1) ? "" : ", "));
    }
}
