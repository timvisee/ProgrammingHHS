/**
 * Developed by Tim Visee, as challenges for De Haagse Hoogeschool.
 * Copyright Tim Visee (c) 2015. All rights reserved.
 *
 * @author Tim Visee
 * @website http://timvisee.com/
 */

package com.timvisee.hhs;

public class Range {

    /** The minimum and maximum value. */
    int min, max;

    /**
     * Constructor.
     *
     * @param a The first value.
     * @param b The second value.
     */
    public Range(int a, int b) {
        // Set the range
        this.setRange(a, b);
    }

    /**
     * Get the maximum value of the range.
     *
     * @return Maximum value.
     */
    public int getMax() {
        return this.max;
    }

    /**
     * Get the minimum value of the range.
     *
     * @return Minimum value.
     */
    public int getMin() {
        return this.min;
    }

    /**
     * Set the range values.
     *
     * @param a The first value.
     * @param b The second value.
     */
    private void setRange(int a, int b) {
        this.min = Math.min(a, b);
        this.max = Math.max(a, b);
    }

    /**
     * Check whether the value is in the range.
     *
     * @param val The value to check for.
     *
     * @return True if the value is in range, false if not.
     */
    public boolean inRange(int val) {
        return (val >= this.min && val <= this.max);
    }
}
