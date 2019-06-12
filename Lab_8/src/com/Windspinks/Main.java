//Charles Dodge
//CIST 2371 CRN 63075
//Lab 8 TestScores
package com.Windspinks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TestScores scores = new TestScores();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three test scores");
        System.out.print("1: ");
        scores.setScore1(scn.nextDouble());
        System.out.print("2: ");
        scores.setScore2(scn.nextDouble());
        System.out.print("3: ");
        scores.setScore3(scn.nextDouble());

        System.out.printf("The average of %.2f, %.2f, and %.2f, is %.2f", scores.getScore1(), scores.getScore2(), scores.getScore3(), scores.getAverage());
    }
}
