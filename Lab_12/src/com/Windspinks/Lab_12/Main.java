package com.Windspinks.Lab_12;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PoliceOfficer parkingAttendant = new PoliceOfficer("John", 111111);

        ParkedCar carOne = new ParkedCar("Toyota", "Camry", "White", "112223", 24);
        ParkingMeter meterOne = new ParkingMeter(180);
        ParkedCar carTwo = new ParkedCar("Ford", "Focus", "Blue", "112223", 190);
        ParkingMeter meterTwo = new ParkingMeter(120);
        ParkedCar carThree = new ParkedCar("Nissan", "Altima", "Black", "112223", 400);
        ParkingMeter meterThree = new ParkingMeter(360);
        ParkedCar carFour = new ParkedCar("Bentley", "Mulsanne", "Yellow", "112223", 525600);
        ParkingMeter meterFour = new ParkingMeter(15);


        ArrayList<ParkingTicket> listOfTickets = new ArrayList<>();
        checkCar(carOne, meterOne, parkingAttendant, listOfTickets);
        checkCar(carTwo, meterTwo, parkingAttendant, listOfTickets);
        checkCar(carThree, meterThree, parkingAttendant, listOfTickets);
        checkCar(carFour, meterFour, parkingAttendant, listOfTickets);

        System.out.printf("\nThere are %d tickets\n", listOfTickets.size());
        for (ParkingTicket ticket : listOfTickets) {
            System.out.println(ticket);
        }

    }

    private static void checkCar(ParkedCar car, ParkingMeter meter, PoliceOfficer officer, ArrayList<ParkingTicket> listOfTickets) {
        System.out.println(officer + " checking a " + car + ".");
        if (officer.hasExpired(car, meter)) {
            System.out.println("Writing ticket");
            ParkingTicket ticketFour = officer.writeTicket(car, meter);
            listOfTickets.add(ticketFour);
        }
    }

}
