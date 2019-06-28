package com.Windspinks.Lab_12;

public class ParkingTicket {
    private ParkedCar ticketedCar;
    private PoliceOfficer issuingOfficer;
    private ParkingMeter meterParkedAt;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, ParkingMeter meter) {
        ticketedCar = new ParkedCar(car);
        issuingOfficer = new PoliceOfficer(officer);
        meterParkedAt = new ParkingMeter(meter);
    }

    public ParkedCar getTicketedCar() {
        return ticketedCar;
    }

    public void setTicketedCar(ParkedCar ticketedCar) {
        this.ticketedCar = new ParkedCar(ticketedCar);
    }

    public PoliceOfficer getIssuingOfficer() {
        return issuingOfficer;
    }

    public void setIssuingOfficer(PoliceOfficer issuingOfficer) {
        this.issuingOfficer = new PoliceOfficer(issuingOfficer);
    }

    public ParkingMeter getMeterParkedAt() {
        return meterParkedAt;
    }

    public void setMeterParkedAt(ParkingMeter meterParkedAt) {
        this.meterParkedAt = new ParkingMeter(meterParkedAt);
    }

    public boolean equals(ParkingTicket obj) {
        if (this == obj)
            return false;
        return ticketedCar.equals(obj.ticketedCar) &&
            issuingOfficer.equals(obj.issuingOfficer) &&
            meterParkedAt.equals(obj.meterParkedAt);
    }

    public String toString() {
        //Ticket issued to a CAR by OFFICER for PRICE
        return String.format("Ticket issued to a %s by %s for $%,d", ticketedCar, issuingOfficer, getFineAmount());
    }

    public int getFineAmount() {
        //minutes parked - minutes paid for
        int minutesOverdue = ticketedCar.getMinutesParked() - meterParkedAt.getMinutesPurchased();

        //Round up integer division
        //(m + n - 1) / n
        //https://www.cs.nott.ac.uk/~psarb2/G51MPC/slides/NumberLogic.pdf
        //1-60 minutes fined one hours, 61+ fined two, 121+ fined three, etc
        int hoursFined = (minutesOverdue + 60 - 1) / 60;

        if (hoursFined > 0) {
            //$25 first hour, $10 every additional
            return 25 + 10 * (hoursFined - 1);
        } else {
            return 0;
        }
    }
}
