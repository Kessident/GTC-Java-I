//Charles Dodge
//CIST 2371 CRN 63075
//Lab 2
package com.Windspinks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter five decimal numbers, each separated by a space: ");
        double[] nums = new double[5];
        nums[0] = scn.nextDouble();
        nums[1] = scn.nextDouble();
        nums[2] = scn.nextDouble();
        nums[3] = scn.nextDouble();
        nums[4] = scn.nextDouble();

        double sum = 0;
        for (double d : nums){
            sum += d;
        }

        int sumI = (int) Math.round(sum);
        System.out.println("The sum of those 5 numbers rounded to an int is: " + sumI);
    }
}


//    Scanner scn = new Scanner(System.in);
//    System.out.print("Enter a decimal number: ");
//    double numD = scn.nextDouble();
//    int numI = (int) Math.round(numD);
//    System.out.println(numD + " rounded to the nearest int: " + numI);


//    Scanner scn = new Scanner(System.in);
//        System.out.print("Enter five test scores, each separated by a space: ");
//            double[] scores = new double[5];
//            scores[0] = scn.nextDouble();
//            scores[1] = scn.nextDouble();
//            scores[2] = scn.nextDouble();
//            scores[3] = scn.nextDouble();
//            scores[4] = scn.nextDouble();
//
//            double sum = 0;
//            for (double d : scores){
//            sum += d;
//            }
//
//            double average = sum / scores.length;
//
//            System.out.println("The average score is: " + average);
//