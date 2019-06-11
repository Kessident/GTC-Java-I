package com.Windspinks;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name;
        double hours;
        double payRate;
        double grossPay;
        System.out.print("Enter your name: ");
        name = scn.nextLine();

        System.out.print("How many hours did you work? ");
        hours = scn.nextDouble();

        System.out.print("What is your hourly pay rate? ");
        payRate = scn.nextDouble();

        grossPay = hours * payRate;
        System.out.println("Hello, " + name);
        System.out.println("Your gross pay after working " + hours + " hours at $" + payRate + " per hour is $" + grossPay);
    }
}