package org.example;

import java.time.LocalDate;

public class Tram extends Vehicle{
    private int yearsInService;

    public Tram(int maxCapacityPassengers, LocalDate serviceDate, int yearsInService) {
        super(maxCapacityPassengers, serviceDate);
        this.yearsInService = yearsInService;
        this.setVehicleType(VehicleType.TRAM);
        this.setFuelType(FuelType.ELECTRIC);
    }
}
