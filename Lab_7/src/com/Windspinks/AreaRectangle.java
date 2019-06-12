//Charles Dodge
//CIST 2371 CRN 63075
//Lab 7 AreaRectangle
package com.Windspinks;

import java.util.Scanner;

/**
 * You must complete this program so it calculates
 * and displays the area of a rectangle.
 */

// Insert any necessary import statements here.


public class AreaRectangle {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        double length,    // The rectangle's length
            width,     // The rectangle's width
            area;      // The rectangle's area

        // Get the rectangle's length from the user.
        length = getLength();

        // Get the rectangle's width from the user.
        width = getWidth();

        // Get the rectangle's area.
        area = getArea(length, width);

        // Display the rectangle data.
        displayData(length, width, area);
    }

    private static double getLength() {
        System.out.print("Enter the length of a rectangle: ");
        return scn.nextDouble();
    }

    private static double getWidth() {
        System.out.print("Enter the width of a rectangle: ");
        return scn.nextDouble();
    }

    private static double getArea(double length, double width) {
        return length * width;
    }

    private static void displayData(double l, double w, double a) {
        System.out.printf("A rectangle with length %f, width %f, has an area of %f", l, w, a);
    }
}

