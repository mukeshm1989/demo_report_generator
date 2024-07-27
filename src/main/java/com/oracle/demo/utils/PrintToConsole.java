package com.oracle.demo.utils;

import java.util.Map;
import java.util.Set;

public class PrintToConsole {

     public static void printUniqueCustomerCountByContractId(Map<String, Integer> result) {
        System.out.println("=== Unique Customer Count by Contract ID ===");
        result.forEach((contractId, count) ->
                System.out.printf("Contract ID: %-10s | Unique Customers: %d%n", contractId, count)
        );
        System.out.println();
    }

     public static void printUniqueCustomerCountByGeozone(Map<String, Integer> result) {
        System.out.println("=== Unique Customer Count by Geozone ===");
        result.forEach((geozone, count) ->
                System.out.printf("Geozone: %-10s | Unique Customers: %d%n", geozone, count)
        );
        System.out.println();
    }

     public static void printAverageBuildDurationByGeozone(Map<String, Double> result) {
        System.out.println("=== Average Build Duration by Geozone ===");
        result.forEach((geozone, avgDuration) ->
                System.out.printf("Geozone: %-10s | Average Duration: %.2fs%n", geozone, avgDuration)
        );
        System.out.println();
    }

    public static void printUniqueCustomersByGeozone(Map<String, Set<String>> result) {
        System.out.println("=== Unique Customers by Geozone ===");
        result.forEach((geozone, customers) -> {
            System.out.printf("Geozone: %-10s | Unique Customers: %s%n", geozone, String.join(", ", customers));
        });
        System.out.println();
    }
}
