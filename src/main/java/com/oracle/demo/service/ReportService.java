package com.oracle.demo.service;
import java.util.Map;
import java.util.Set;

public interface ReportService {
    Map<String, Integer> getUniqueCustomerCountByContractId();
    Map<String, Integer> getUniqueCustomerCountByGeoZone();
    Map<String, Double> fetchAverageBuildDurationByGeoZone();
    Map<String, Set<String>> getUniqueCustomersByGeoZone();
}
