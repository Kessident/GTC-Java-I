//Charles Dodge
//CIST 2371 CRN 63075
//Lab 5 Population

package com.Windspinks;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a starting population: ");
        int population = scn.nextInt();
        while (population < 2){
            System.out.print("Starting population must have at least 2: ");
            population = scn.nextInt();
        }

        System.out.print("Enter the average daily population increase as percentage: ");
        //Convert integer percent to decimal 50% -> 0.50
        double growth = scn.nextDouble() / 100;
        while (growth < 0){
            System.out.print("Growth amount must not be negative: ");
            growth = scn.nextDouble() / 100;
        }


        System.out.print("Enter number of days for population to grow: ");
        int daysToGrow = scn.nextInt();
        while (daysToGrow < 1){
            System.out.print("Must have at least 1 day to grow: ");
            daysToGrow = scn.nextInt();
        }
        for (int i = 0; i < daysToGrow; i++) {
            int popIncrease = (int)(population * growth);
            population += popIncrease;
            System.out.println("After " + (i + 1) + " day population is " + population);
        }
    }
}

/*
//Lab 5 Hotel Occupancy
package com.Windspinks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many floors are in this hotel? ");
        int numFloors = scn.nextInt();
        //Repeat if less than 1 is entered
        while (numFloors < 1){
            System.out.print("Number of floors cannot be less than 1: ");
            numFloors = scn.nextInt();
        }

        int totalRooms = 0;
        int totalOccupied = 0;

        for (int i = 0; i < numFloors; i++){
            System.out.print("Enter total number of rooms in floor " + (i + 1) + ": ");
            int roomsInFloor = scn.nextInt();

            //Minimum 10 rooms per floor
            while (roomsInFloor < 10) {
                System.out.print("Each floor must have at least 10 rooms in it: ");
                roomsInFloor = scn.nextInt();
            }
            totalRooms += roomsInFloor;

            System.out.print("Enter number of occupied rooms in floor " + (i + 1) + ": ");
            int occupied = scn.nextInt();

            //More occupied than total isn't possible
            while (occupied > roomsInFloor){
                System.out.print("You cannot have more occupied rooms than total: ");
                occupied = scn.nextInt();
            }
            totalOccupied += occupied;
        }

        System.out.println("Total number of rooms: " + totalRooms);
        System.out.println("Total rooms occupied: " + totalOccupied);
        System.out.println("Total rooms vacant: " + (totalRooms - totalOccupied));
        System.out.println("Occupancy rate: " + ((double)totalOccupied / (double)totalRooms));
    }
}*/