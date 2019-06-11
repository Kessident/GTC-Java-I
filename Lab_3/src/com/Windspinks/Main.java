//Charles Dodge
//CIST 2371 CRN 63075
//Lab 3 Word Game
package com.Windspinks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //name, age, city, college, profession, type of animal, pet's name
        System.out.println("Let's play a word game");
        System.out.print("Enter your name: ");
        String name = scn.nextLine();
        System.out.print("Enter your age: ");
        String age = scn.nextLine();
        System.out.print("Enter the name of a city: ");
        String city = scn.nextLine();
        System.out.print("Enter the name of a college: ");
        String college = scn.nextLine();
        System.out.print("Enter a profession: ");
        String profession = scn.nextLine();
        System.out.print("Enter an animal: ");
        String animal = scn.nextLine();
        System.out.print("Enter a pet's name: ");
        String petName = scn.nextLine();

        System.out.println();
        System.out.println("There once was a person named " + name + " who lived in " + city + ".\n" +
            "At the age of " + age + ", "+ name+ " went to college at " +college + ".\n" +
            name + " graduated and went to work as a " + profession + ".\n" +
            "Then, " + name + " adopted a(n) " + animal + " named " + petName + ".\n" +
            "They both lived happily ever after!");
    }
}


/*
//Lab 3 Restaurant Bill
package com.Windspinks;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the charge for your meal.");
        double mealCharge = Double.parseDouble(input);

        double taxRate = 0.0675;
        double taxAmount = mealCharge * taxRate;

        double finalCost = mealCharge + taxAmount;

        double tipAmount = finalCost * 0.20;

        double plusTip = finalCost + tipAmount;

        JOptionPane.showMessageDialog(null, "Meal charge: " + mealCharge
                                    + "\nTax amount: " + String.format("%.2f", taxAmount)
                                    + "\nTip amount: " + String.format("%.2f", tipAmount)
                                    + "\nFinal cost after tax and tip is " + String.format("%.2f", plusTip));
        System.exit(0);
    }
}*/