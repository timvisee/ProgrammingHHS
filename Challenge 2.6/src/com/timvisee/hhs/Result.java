/**
 * Developed by Tim Visee, as challenges for De Haagse Hoogeschool.
 * Copyright Tim Visee (c) 2015. All rights reserved.
 *
 * @author Tim Visee
 * @website http://timvisee.com/
 */

package com.timvisee.hhs;

public class Result {

    /** The letter of this result. */
    private String letter;
    /** The range of this result. */
    private Range range;

    /**
     * Constructor.
     *
     * @param letter The letter of the result.
     * @param rangeA The first value of the range.
     * @param rangeB The second value of the range.
     */
    public Result(String letter, int rangeA, int rangeB) {
        // Set the letter and range
        this.letter = letter;
        this.range = new Range(rangeA, rangeB);
    }

    /**
     * Get the letter of the result.
     *
     * @return Result letter.
     */
    public String getLetter() {
        return this.letter;
    }

    /**
     * Get the range.
     *
     * @return The range.
     */
    public Range getRange() {
        return this.range;
    }

    /**
     * Check whether a score is in range of this result.
     *
     * @param val The score value.
     *
     * @return True if the score value is in range, false if not.
     */
    public boolean inRange(int val) {
        return this.range.inRange(val);
    }
}
