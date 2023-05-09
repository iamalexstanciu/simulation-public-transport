package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PublicTransportManager publicTransportManager = new PublicTransportManager();
        Vehicle bus = new Bus(100, LocalDate.of(2023,01, 31), 6);
//        Vehicle bus2 = new Bus(150, LocalDate.of(2023,05, 01), 4);
        Route route1 = new Route("Piata");
        Station station1 = new Station("Unu");
        Station station2 = new Station("Doi");
        publicTransportManager.getRoutes().add(route1);
        route1.addStation(station1);
        route1.addStation(station2);
        route1.addVehicle(bus);
        System.out.println(publicTransportManager.getRoutes().toString());


    }
}