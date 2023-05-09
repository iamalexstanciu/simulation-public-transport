package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.ErrorManager;

public class Route {

    private String routeName;
    private List<Vehicle> vehicleInOperation;
    private List<Station> stations;

    public Route(String routeName) {
        this.routeName = routeName;
        this.vehicleInOperation = new ArrayList<>();
        this.stations = new ArrayList<>();
    }
    public void addStation(Station station){
        stations.add(station);
    }
    public void addVehicle(Vehicle vehicle){
        if(vehicle.getStatus().equals(Status.IN_OPERATION)) {
            vehicleInOperation.add(vehicle);
        } else {
            System.out.println("No in operation vehicles!");
        }
        }

    public List<Vehicle> getVehicleInOperation() {
        return vehicleInOperation;
    }

    public List<Station> getStations() {
        return stations;
    }
    public String getRouteName() {
        return routeName;
    }
}
