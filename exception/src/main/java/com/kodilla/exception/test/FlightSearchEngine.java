package com.kodilla.exception.test;

import java.util.*;

public final class FlightSearchEngine {

    private final Map<String, Boolean> flightMap = new HashMap<>();

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Boolean flightAvailable = flightMap.get(flight.getArrivalAirport());

        if (Objects.nonNull(flightAvailable)){
            return flightAvailable;
        } else {
            throw new RouteNotFoundException("Flight not found!");
        }
    }

    public void addFlight(String airport, Boolean available){
        flightMap.put(airport, available);
    }
}
