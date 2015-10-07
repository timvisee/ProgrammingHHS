/**
 * Developed by Tim Visee, as challenges for De Haagse Hoogeschool.
 * Copyright Tim Visee (c) 2015. All rights reserved.
 *
 * @author Tim Visee
 * @website http://timvisee.com/
 */

package com.timvisee.hhs;

public class MetalLathe {

    /** Work hours threshold. */
    public static final double WORK_HOURS_THRESHOLD = 10000.0;
    /** Age threshold. */
    public static final double AGE_THRESHOLD = 7.0;
    /** Defects per year threshold. */
    public static final double DEFECTS_PER_YEAR_THRESHOLD = 25.0;

    /** Total number of working hours. */
    private double workHours;
    /** Age in years. */
    private double age;
    /** Average defects per year. */
    private double defectsPerYear;

    /**
     * Constructor.
     *
     * @param workHours Total number of working hours.
     * @param age Age in years.
     * @param defectsPerYear Defects per year.
     */
    public MetalLathe(double workHours, double age, double defectsPerYear) {
        this.workHours = workHours;
        this.age = age;
        this.defectsPerYear = defectsPerYear;
    }

    /**
     * Get total number of working hours.
     *
     * @return Number of working hours.
     */
    public double getWorkHours() {
        return workHours;
    }

    /**
     * Set total number of working hours.
     *
     * @param workHours Number of working hours.
     */
    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    /**
     * Get the age in years.
     * @return Age in years.
     */
    public double getAge() {
        return age;
    }

    /**
     * Set the age in years.
     * @param age Age in years.
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * Get the average defects per year.
     *
     * @return Average defects per year.
     */
    public double getDefectsPerYear() {
        return defectsPerYear;
    }

    /**
     * Get the average defects per year.
     *
     * @param defectsPerYear Average defects per year.
     */
    public void setDefectsPerYear(double defectsPerYear) {
        this.defectsPerYear = defectsPerYear;
    }

    /**
     * Check whether this metal lathe should be replaced.
     *
     * @return True if it should be replaced, false if not.
     */
    public boolean shouldReplace() {
        return getWorkHours() >= WORK_HOURS_THRESHOLD ||
                getAge() >= AGE_THRESHOLD ||
                getDefectsPerYear() >= DEFECTS_PER_YEAR_THRESHOLD;
    }
}
