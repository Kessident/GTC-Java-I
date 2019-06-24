//Charles Dodge
//CIST 2371 CRN 63075
//Lab 11 Quarterly Sales
package com.Windspinks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Divisions divisions = new Divisions();
        double tempSales;

        //Get sales Data
        for (int divNum = 0; divNum < divisions.getDIVISIONS(); divNum++) {
            for (int qtrNum = 0; qtrNum < divisions.getQUARTERS(); qtrNum++) {
                System.out.printf("Enter quarter %d sales for division %d: ", (qtrNum + 1), (divNum + 1));
                tempSales = scn.nextDouble();
                while (tempSales < 0) {
                    System.out.print("Quarter sales cannot be negative: ");
                    tempSales = scn.nextDouble();
                }

                divisions.setSales(divNum, qtrNum, tempSales);
            }
        }

        //All Sales Data by division
        for (int div = 0; div < divisions.getDIVISIONS(); div++) {
            System.out.println("Sales for Division " + (div + 1));
            for (int qtr = 0; qtr < divisions.getQUARTERS(); qtr++) {
                System.out.printf("\tQuarter %d: %.2f\n", (qtr + 1), divisions.getSales(div, qtr));
                //Only show increase/decrease after first quarter
                if (qtr > 0) {
                    System.out.printf("\tIncrease from last quarter: %.2f\n", divisions.getQuarterlyIncrease(div, qtr));
                }
            }
        }
        System.out.println();

        double currQtrSales;
        double prevQtrSales = 0;
        //Total Sales per Quarter
        for (int qtr = 0; qtr < divisions.getQUARTERS(); qtr++) {
            currQtrSales = divisions.totalQuarterSales(qtr);
            //Total Sales
            System.out.printf("Total sales for quarter %d: %.2f\n", (qtr + 1), currQtrSales);
            //Average Sales
            System.out.printf("Average Sales for quarter %d: %.2f\n", (qtr + 1), divisions.averageSalesForQtr(qtr));
            //Highest Sales
            System.out.printf("Division with the highest sales for quarter %d is division %d\n", (qtr+1), (divisions.highestSalesForQtr(qtr) + 1));
            //Only show increase/decrease after first quarter
            if (qtr > 0){
                System.out.printf("\tIncrease from last quarter: %.2f\n", (currQtrSales - prevQtrSales));
            }
            prevQtrSales = currQtrSales;
        }
    }
}
