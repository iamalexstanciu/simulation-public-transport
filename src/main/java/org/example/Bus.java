package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Bus extends Vehicle{
    private int pollutionIndicator;

    public Bus(int maxCapacityPassengers, LocalDate serviceDate, int pollutionIndicator) {
        super(maxCapacityPassengers, serviceDate);
        this.pollutionIndicator = pollutionIndicator;
        this.setVehicleType(VehicleType.BUS);
        this.setFuelType(FuelType.GAS);

        setStatus();

    }
    @Override
    public void setStatus() {
        LocalDate today = LocalDate.now();
        LocalDate givenDate = getServiceDate();
        Period period = Period.between(today, givenDate);
        long months = period.toTotalMonths();
        if(months <= 6 && pollutionIndicator > 5){
            this.status = Status.IN_OPERATION;
        } else if (months > 0 && months <= 12 && pollutionIndicator >= 3 && pollutionIndicator <= 5) {
            this.status = Status.NEED_REPAIR;
        } else {
            this.status = Status.FOR_SCRAP;
        }
    }
}

