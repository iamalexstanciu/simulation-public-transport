package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public abstract class Vehicle {
    private UUID id;
    private UUID licensePlateNumber;
    private int maxCapacityPassengers;
    protected Status status;
    private FuelType fuelType;
    private LocalDate serviceDate;
    private VehicleType vehicleType;

    public Vehicle(int maxCapacityPassengers, LocalDate serviceDate) {
        this.id = UUID.randomUUID();
        this.licensePlateNumber = UUID.randomUUID();
        this.maxCapacityPassengers = maxCapacityPassengers;
        this.serviceDate = serviceDate;
        this.vehicleType = null;
        setStatus();

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(UUID licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public int getMaxCapacityPassengers() {
        return maxCapacityPassengers;
    }

    public void setMaxCapacityPassengers(int maxCapacityPassengers) {
        this.maxCapacityPassengers = maxCapacityPassengers;
    }

    public Status getStatus() {
        System.out.println(status );
        return status;
    }

    public void setStatus() {
        LocalDate today = LocalDate.now();
        LocalDate givenDate = getServiceDate();
        Period period = Period.between(today, givenDate);
        long months = period.toTotalMonths();
        if(months <= 6){
            this.status = Status.IN_OPERATION;
        } else if (months > 6 && months <= 36) {
            this.status = Status.NEED_REPAIR;
        } else {
            this.status = Status.FOR_SCRAP;
        }
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
