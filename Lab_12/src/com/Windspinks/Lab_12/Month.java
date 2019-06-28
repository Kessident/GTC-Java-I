package com.Windspinks.Lab_12;

import java.util.Objects;

public class Month {
    private int monthNumber;

    public Month() {
        monthNumber = 1;
    }

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
        if (this.monthNumber < 1 || this.monthNumber > 12) {
            this.monthNumber = 1;
        }
    }

    public Month(String monthName) {
        this.monthNumber = getMonthNum(monthName);
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
        if (this.monthNumber < 1 || this.monthNumber > 12) {
            this.monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthNames.values()[monthNumber].toString();
    }

    public String toString() {
        return monthNames.values()[monthNumber].toString();
    }

    public boolean equals(Month m) {
        if (this == m) {
            return true;
        }
        return this.monthNumber == m.monthNumber;
    }

    public boolean greaterThan(Month m) {
        return this.monthNumber > m.monthNumber;
    }

    public boolean lessThan(Month m) {
        return this.monthNumber < m.monthNumber;
    }

    private int getMonthNum(String name) {
        switch (name) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
                return 1;
        }
    }

    private enum monthNames {INVALID_MONTH, January, February, March, April, May, June, July, August, September, October, November, December}
}

