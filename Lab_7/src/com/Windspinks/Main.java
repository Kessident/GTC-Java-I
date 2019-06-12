//Charles Dodge
//CIST 2371 CRN 63075
//Lab 7 Test average and grade
package com.Windspinks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter five test scores");
        System.out.print("1: ");
        double score1 = scn.nextDouble();
        System.out.printf("The letter grade for this test is: %s\n", determineGrade(score1));

        System.out.print("2: ");
        double score2 = scn.nextDouble();
        System.out.printf("The letter grade for this test is: %s\n", determineGrade(score2));

        System.out.print("3: ");
        double score3 = scn.nextDouble();
        System.out.printf("The letter grade for this test is: %s\n", determineGrade(score3));

        System.out.print("4: ");
        double score4 = scn.nextDouble();
        System.out.printf("The letter grade for this test is: %s\n", determineGrade(score4));

        System.out.print("5: ");
        double score5 = scn.nextDouble();
        System.out.printf("The letter grade for this test is: %s\n", determineGrade(score5));

        double average = calcAverage(score1, score2, score3, score4, score5);
        System.out.printf("The average score is %f", average);
    }

    private static double calcAverage(double one, double two, double three, double four, double five) {
        return (one + two + three + four + five) / 5;
    }

    private static char determineGrade(double score) {
        if (score < 60) {
            return 'F';
        } else if (score < 70) {
            return 'D';
        } else if (score < 80) {
            return 'C';
        } else if (score < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
