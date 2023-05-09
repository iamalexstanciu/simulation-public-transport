package org.example;

import java.util.ArrayList;
import java.util.List;

public class PublicTransportManager {
    private List<Vehicle> vehicles;


    private List<Route> routes;

    public PublicTransportManager() {
        this.vehicles = new ArrayList<>();
        this.routes = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesOfSpecificTypeWithSameStatus(Status status, VehicleType vehicleType) {
        List<Vehicle> vehicleWithSameStatus = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getStatus().equals(status) && v.getVehicleType().equals(vehicleType)) {
                vehicleWithSameStatus.add(v);
            }
        }
        return vehicleWithSameStatus;
        // returneaza un int cu numarul de vehicule
    }

    public List<Route> getRoutes() {
        return routes;
    }


}
