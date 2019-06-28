package com.Windspinks.Lab_12;

public class ParkingMeter {
    private int minutesPurchased;

    public ParkingMeter() {
    }

    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public ParkingMeter(ParkingMeter meter) {
        minutesPurchased = meter.minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public boolean equals(ParkingMeter o) {
        if (this == o) {
            return true;
        }
        return minutesPurchased == o.minutesPurchased;
    }

    public String toString() {
        //MINUTES minutes paid for
        return String.format("%d minutes paid for", minutesPurchased);
    }
}
