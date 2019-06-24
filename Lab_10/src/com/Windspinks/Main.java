//Charles Dodge
//CIST 2371 CRN 63075
//Lab 10 Payroll
package com.Windspinks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Payroll payroll = new Payroll();

        int tempHours;
        double tempRate;
        //Get Employee Info
        for (int i = 0; i < 7; i++) {
            System.out.printf("Enter hours for employee %d: ", payroll.getEmployeeID(i));
            tempHours = scn.nextInt();
            while (tempHours < 0) {
                System.out.print("Hours must not be negative: ");
                tempHours = scn.nextInt();
            }
            payroll.setHours(i, tempHours);

            System.out.printf("Enter pay rate for employee %d: ", payroll.getEmployeeID(i));
            tempRate = scn.nextDouble();
            while (tempRate < 6){
                System.out.print("Pay rate must be at least 6: ");
                tempRate = scn.nextDouble();
            }
            payroll.setPayRate(i, tempRate);

            payroll.setWages(i);
        }

        //Display Employee Info
        for (int i = 0; i < 7; i++) {
            System.out.printf("Employee %d gross pay $%.2f\n", payroll.getEmployeeID(i), payroll.getWages(i));
        }
    }
}
