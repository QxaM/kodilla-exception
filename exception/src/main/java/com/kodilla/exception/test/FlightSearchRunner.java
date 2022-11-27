package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main(String[] args){
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        flightSearchEngine.addFlight("Warsaw", true);
        flightSearchEngine.addFlight("Chicago", true);
        flightSearchEngine.addFlight("London", false);

        try {
            if(flightSearchEngine.findFlight(new Flight("Warsaw", "London"))){
                System.out.println("Flight found and available!");
            } else {
                System.out.println("Flight not available!");
            }
        }catch (NullPointerException e) {
            System.out.println("Error! Search engine is empty!");
        }catch (RouteNotFoundException e) {
            System.out.println("Route not found!");
        }finally {
            System.out.println("Exiting search engine");
        }

        try {
            if(flightSearchEngine.findFlight(new Flight("Warsaw", "Chicago"))){
                System.out.println("Flight found and available!");
            } else {
                System.out.println("Flight not available!");
            }
        }catch (NullPointerException e) {
            System.out.println("Error! Search engine is empty!");
        }catch (RouteNotFoundException e) {
            System.out.println("Route not found!");
        }finally {
            System.out.println("Exiting search engine");
        }

        try {
            if(flightSearchEngine.findFlight(null)){
                System.out.println("Flight found and available!");
            } else {
                System.out.println("Flight not available!");
            }
        }catch (NullPointerException e) {
            System.out.println("Error! Flight or search engine empty!");
        }catch (RouteNotFoundException e) {
            System.out.println("Route not found!");
        }finally {
            System.out.println("Exiting search engine");
        }

        try {
            if(flightSearchEngine.findFlight(new Flight("Warsaw", "Tokio"))){
                System.out.println("Flight found and available!");
            } else {
                System.out.println("Flight not available!");
            }
        }catch (NullPointerException e) {
            System.out.println("Error! Search engine is empty!");
        }catch (RouteNotFoundException e) {
            System.out.println("Route not found!");
        }finally {
            System.out.println("Exiting search engine");
        }
    }
}
