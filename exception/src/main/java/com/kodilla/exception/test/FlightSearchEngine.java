package com.kodilla.exception.test;

import java.util.*;

public final class FlightSearchEngine {

    private final Map<String, Boolean> flightMap = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {
        List<String> canFlightTo = flightMap.entrySet().stream()
                .filter(f -> f.getKey().equals(flight.getArrivalAirport()))
                .filter(f -> f.getValue().equals(Boolean.TRUE))
                .map(Map.Entry::getKey).toList();

        if (canFlightTo.isEmpty()) {
            throw new RouteNotFoundException("Flight not found!");
        }
    }

    public void addFlight(String airport, Boolean available){
        flightMap.put(airport, available);
    }
}
