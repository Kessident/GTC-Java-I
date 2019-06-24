//Charles Dodge
//CIST 2371 CRN 63075
//Lab 11 Quarterly Sales
package com.Windspinks;

public class Divisions {
    private final int DIVISIONS = 6;
    private final int QUARTERS = 4;
    private double[][] sales = new double[DIVISIONS][QUARTERS];

    public Divisions() {}

    public int getDIVISIONS(){
        return DIVISIONS;
    }
    public int getQUARTERS(){
        return QUARTERS;
    }

    public void setSales(int div, int qtr, double amount){
        sales[div][qtr] = amount;
    }

    public double getSales(int div, int qtr) {
        return sales[div][qtr];
    }

    public double totalQuarterSales(int qtr){
        double totalSales = 0;
        for (int i = 0; i < DIVISIONS; i++) {
            totalSales += sales[i][qtr];
        }

        return totalSales;
    }

    public double getQuarterlyIncrease(int div, int qtr) {
        double lastQtr = sales[div][qtr - 1];
        double currQtr = sales[div][qtr];
        return currQtr - lastQtr;
    }

    public double averageSalesForQtr(int qtr){
        double totalSales = 0;
        for (int i = 0; i < DIVISIONS; i++) {
            totalSales += sales[i][qtr];
        }
        return totalSales / DIVISIONS;
    }

    public int highestSalesForQtr(int qtr) {
        double highestSales = sales[0][qtr];
        int highestIndex = 0;
        for (int i = 0; i < DIVISIONS; i++) {

            if (sales[i][qtr] > highestSales){
                highestSales = sales[i][qtr];
                highestIndex = i;
            }
        }

        return highestIndex;
    }
}
