package com.Windspinks.Lab_12;

public class PoliceOfficer {
    private String name;
    private int badgeNumber;

    PoliceOfficer() {
    }

    PoliceOfficer(String name, int badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    PoliceOfficer(PoliceOfficer officer) {
        name = officer.name;
        badgeNumber = officer.badgeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public boolean equals(PoliceOfficer o) {
        if (this == o) return true;
        return badgeNumber == o.badgeNumber &&
            name.equals(o.name);
    }

    public String toString() {
        //Officer NAME, badge number BADGENUMBER
        return String.format("Officer %s, badge number %d", name, badgeNumber);
    }

    public boolean hasExpired(ParkedCar car, ParkingMeter meter) {
        return car.getMinutesParked() > meter.getMinutesPurchased();
    }

    //Returns ParkingTicket if time has expired, else return null
    public ParkingTicket writeTicket(ParkedCar car, ParkingMeter meter) {
        if (hasExpired(car, meter)) {
            return new ParkingTicket(car, this, meter);
        }
        return null;
    }
}
