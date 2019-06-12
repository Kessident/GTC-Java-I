//Charles Dodge
//CIST 2371 CRN 63075
//Lab 9 SavingsAccount
package com.Windspinks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double startingBalance;
        double annualInterestRate;
        System.out.print("Enter the account's starting balance: ");
        startingBalance = scn.nextDouble();
        System.out.print("Enter the account's annual interest rate as a decimal: ");
        annualInterestRate = scn.nextDouble();

        SavingsAccount account = new SavingsAccount(startingBalance, annualInterestRate);

        System.out.print("How many months have passed since the account was opened? ");
        int monthsPassed = scn.nextInt();

        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double totalInterest = 0;
        double monthlyDeposit;
        double monthlyWithdrawal;
        for (int i = 1; i <= monthsPassed; i++) {
            System.out.printf("Enter the total amount of deposits during month %d: ", i);
            monthlyDeposit = scn.nextDouble();
            totalDeposits += monthlyDeposit;
            System.out.printf("Enter the total amount of withdrawals during month %d: ", i);
            monthlyWithdrawal = scn.nextDouble();
            totalWithdrawals += monthlyWithdrawal;

            account.makeDeposit(monthlyDeposit);
            account.makeWithdrawal(monthlyWithdrawal);
            totalInterest += account.addMonthlyInterest();
        }

        System.out.printf("In %d months, there were $%.2f in deposits, and $%.2f in withdrawals\n", monthsPassed, totalDeposits, totalWithdrawals);
        System.out.printf("Your ending balance is $%.2f\n", account.getBalance());
        System.out.printf("You earned $%.2f interest\n", totalInterest);
    }
}
