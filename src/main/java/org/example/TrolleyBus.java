package org.example;

import java.time.LocalDate;

public class TrolleyBus extends Vehicle{

    public TrolleyBus(int maxCapacityPassengers, LocalDate serviceDate) {
        super(maxCapacityPassengers, serviceDate);
        this.setVehicleType(VehicleType.TROLLEYBUS);
        this.setFuelType(FuelType.HYBRID);
    }
}
