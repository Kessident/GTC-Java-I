//Charles Dodge
//CIST 2371 CRN 63075
/*
//Lab 4 Fat Gram Calculator
package com.Windspinks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of calories: ");
        int calories = scn.nextInt();
        System.out.print("Enter the number of fat grams: ");
        int fatGrams = scn.nextInt();

        int fatCalories = fatGrams * 9;
        double fatCaloriePercent =  fatCalories * 100 / calories;
        boolean isLowFat = fatCaloriePercent < 30;

        System.out.println("Out of " + calories + " calories, " + fatCalories + " of them came from fat.");
        System.out.print("That's " + fatCaloriePercent + " percent. ");

        if (isLowFat){
            System.out.println("This food is considered low fat.");
        }
    }
}*/



//Lab 4 Software Sales
package com.Windspinks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    final static int PACKAGE_PRICE = 99;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("How many packages purchased? ");
        int numPurchased = scn.nextInt();

        double noDiscount = PACKAGE_PRICE * numPurchased;
        double discountAmount = 0;
        if (numPurchased >= 100) {
            discountAmount = noDiscount * 0.50;
        } else if (numPurchased >= 50) {
            discountAmount = noDiscount * 0.40;
        } else if (numPurchased >= 20) {
            discountAmount = noDiscount * 0.30;
        } else if (numPurchased >= 10) {
            discountAmount = noDiscount * 0.20;
        }

        double finalPrice = noDiscount - discountAmount;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("By purchasing " + df.format(numPurchased) + " packages at $" + df.format(PACKAGE_PRICE)+ " each, you have secured a total discount of $" + df.format(discountAmount)+
            ", for a final price of $" + df.format(finalPrice));
    }
}
