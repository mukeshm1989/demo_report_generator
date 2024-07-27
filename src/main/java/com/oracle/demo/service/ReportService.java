package com.oracle.demo.service;
import java.util.Map;
import java.util.Set;

public interface ReportService {
    Map<String, Integer> getUniqueCustomerCountByContractId();
    Map<String, Integer> getUniqueCustomerCountByGeozone();
    Map<String, Double> getAverageBuildDurationByGeozone();
    Map<String, Set<String>> getUniqueCustomersByGeozone();
}
