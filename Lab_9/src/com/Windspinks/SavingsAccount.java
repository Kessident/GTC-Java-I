//Charles Dodge
//CIST 2371 CRN 63075
//Lab 9 SavingsAccount
package com.Windspinks;

public class SavingsAccount {
    private double balance;
    private double annualInterestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void makeWithdrawal(double amount) {
        balance -= amount;
    }

    public void makeDeposit(double amount) {
        balance += amount;
    }

    public double addMonthlyInterest() {
        double interest = balance * getMonthlyInterestRate();
        balance += interest;
        return interest;
    }
}
