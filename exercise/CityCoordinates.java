package com.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityCoordinates {
    public static void main(String[] args) {
        Map<String, String[]> cityCoordinates = new HashMap<>();
        cityCoordinates.put("hyderabad", new String[]{"17.3850° N", "78.4867° E"});
        cityCoordinates.put("mumbai", new String[]{"19.0760° N", "72.8777° E"});
        cityCoordinates.put("chennai", new String[]{"13.0827° N", "80.2707° E"});
        cityCoordinates.put("calcutta", new String[]{"22.5726° N", "88.3639° E"});
        cityCoordinates.put("patna", new String[]{"25.5941° N", "85.1376° E"});

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city name: ");
        String cityName = scanner.nextLine().toLowerCase();

        if (cityCoordinates.containsKey(cityName)) {
            String[] coordinates = cityCoordinates.get(cityName);
            System.out.println("Coordinates for " + cityName + ":");
            System.out.println("Latitude: " + coordinates[0]);
            System.out.println("Longitude: " + coordinates[1]);
        } else {
            System.out.println("Coordinates not found for " + cityName);
        }

        scanner.close();
    }
}

