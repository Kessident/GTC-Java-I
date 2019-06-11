//Charles Dodge
//CIST 2371 CRN 63075
//Midterm Project I
package com.Windspinks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private static Scanner scn = new Scanner (System.in);

    public static void main(String[] args) {
        //account #, service code, # minutes
        System.out.print("Enter account number: ");
        String accountNum = scn.next();

        System.out.print("Enter service code (R/P) ");
        char serviceCode = scn.next().toLowerCase().charAt(0);

        System.out.print("Enter the number of minutes used: ");
        int numMinutes = scn.nextInt();
        while (numMinutes < 0){
            System.out.print("Minutes used cannot be negative: ");
            numMinutes = scn.nextInt();
        }

        double totalDue;
        switch (serviceCode) {
            case 'r':
                totalDue = regularBill(numMinutes);
                break;
            case 'p':
                totalDue = premiumBill(numMinutes);
                break;
            default:
                System.out.println("Improper Service code. R or P Only, please try again");
                return;
        }

        System.out.println("Account number " + accountNum);
        System.out.println("Service Type " + serviceCode);
        System.out.println("Amount due: " + df.format(totalDue));
    }

    private static double regularBill(int minutesUsed){
        //$10 + 0.20 per minute over 50
        return 10 + (minutesUsed - 50) * 0.20;
    }

    private static double premiumBill(int minutesUsed) {
        //Flat rate $25
        int totalDue = 25;

        //Day calls first 75 free, 0.10 after
        System.out.print("How many minutes were used during the day? (6AM-6PM) ");
        int numMinutesDay = scn.nextInt();
        while (numMinutesDay > minutesUsed){
            System.out.print("Number of minutes used during the day cannot exceed total number of minutes: ");
            numMinutesDay = scn.nextInt();
        }
        double amountDueFromDay = (numMinutesDay - 75) * 0.10;

        //Night calls first 100 free, 0.05 after
        int numMinutesNight = minutesUsed - numMinutesDay;
        double amountDueFromNight = (numMinutesNight - 100) * 0.05;

        totalDue += amountDueFromDay + amountDueFromNight;

        return totalDue;
    }
}