package com.ming.hhs;

import java.util.Scanner;

public class Main {

    public static int TestResults(int waarde ) {

        if (waarde < 60) {
            System.out.println("Score: F. U heeft een onvoldoende.");
        } else if (waarde > 60 && waarde < 69) {
            System.out.println(" Score: D. U heeft geen voldoende. ");
        } else if (waarde > 70 && waarde < 79) {
            System.out.println("Score: C. U heeft een voldoende. ");
        } else if (waarde > 80 && waarde < 89) {
            System.out.println("Score: B. U heeft een ruime voldoende. Gefeliciteerd!");
        } else if (waarde >90 && waarde < 100) {
            System.out.println("Score: A!! U heeft het hoogste behaalde cijfer gehaald. Gefeliciteerd, koop een taart en bekroon jezelf als nerd.");
        } else {
            System.out.println(" yeah yeah yeah.. You just became a nerd.");
        }
        return waarde;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter de punten:");
        int waarde = scanner.nextInt();
        TestResults (waarde);
    }
}
