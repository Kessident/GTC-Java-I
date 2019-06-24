//Charles Dodge
//CIST 2371 CRN 63075
//Lab 10 Payroll
package com.Windspinks;

public class Payroll {
    private int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    public Payroll() {
    }

    public int getEmployeeID(int index) {
        return employeeID[index];
    }

    public int getHours(int index) {
        return hours[index];
    }

    public double getPayRate(int index) {
        return payRate[index];
    }

    public double getWages(int index) {
        return wages[index];
    }

    public void setHours(int index, int hours){
        this.hours[index] = hours;
    }
    public void setPayRate(int index, double rate){
        this.payRate[index] = rate;
    }
    public void setWages(int index){
        wages[index] = hours[index] * payRate[index];
    }




    public void printInfo(int index) {
        System.out.println("employeeID: " + employeeID[index]);
        System.out.println("Hours: " + hours[index]);
        System.out.println("Pay Rate: " + payRate[index]);
        System.out.println("Wages: " + wages[index]);
    }
}
