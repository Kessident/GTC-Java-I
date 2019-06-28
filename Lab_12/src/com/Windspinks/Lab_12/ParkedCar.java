package com.Windspinks.Lab_12;

public class ParkedCar {
    private String make;
    private String model;
    private String colour;
    private String plateNumber;
    private int minutesParked;

    public ParkedCar() {
    }

    public ParkedCar(String make, String model, String colour, String plateNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.plateNumber = plateNumber;
        this.minutesParked = minutesParked;
    }

    public ParkedCar(ParkedCar car) {
        make = car.make;
        model = car.model;
        colour = car.colour;
        plateNumber = car.plateNumber;
        minutesParked = car.minutesParked;
    }

    //
    //Getters / Setters
    //
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    public boolean equals(ParkedCar o) {
        if (this == o) return true;
        return minutesParked == o.minutesParked &&
            make.equals(o.make) &&
            model.equals(o.model) &&
            colour.equals(o.colour) &&
            plateNumber.equals(o.plateNumber);
    }

    public String toString() {
        //COLOUR MAKE MODEL, plate number PLATENUM, parked for NUM minutes
        return String.format("%s %s %s, plate number %s, parked for %,d minutes", colour, make, model, plateNumber, minutesParked);
    }
}
