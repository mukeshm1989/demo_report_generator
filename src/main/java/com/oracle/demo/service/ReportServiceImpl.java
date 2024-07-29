package com.oracle.demo.service;

import com.oracle.demo.data.ReportData;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ReportServiceImpl implements ReportService {
    private final List<ReportData> data;

    public ReportServiceImpl(List<ReportData> data) {
        this.data = data;
    }

    @Override
    public Map<String, Integer> getUniqueCustomerCountByContractId() {
        return data.stream()
                .collect(Collectors.groupingBy(ReportData::contractId,
                        Collectors.mapping(ReportData::customerId, Collectors.toSet())))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().size()));
    }

    @Override
    public Map<String, Integer> getUniqueCustomerCountByGeoZone() {
        return data.stream().collect(Collectors.groupingBy(ReportData::geoZone, Collectors.mapping(ReportData::
                customerId, Collectors.toSet()))).entrySet().stream().collect(
                        Collectors.toMap(Map.Entry::getKey, e -> e.getValue().size()));
    }

    public Map<String, Double> fetchAverageBuildDurationByGeoZone() {
        return data.stream().collect(Collectors.groupingBy(ReportData::geoZone,
                Collectors.averagingDouble(reportData -> parseBuildDuration(reportData.buildDuration()))));
    }

    private double parseBuildDuration(String buildDuration) {
        return Double.parseDouble(buildDuration.replace("s", ""));
    }

    @Override
    public Map<String, Set<String>> getUniqueCustomersByGeoZone() {
        return data.stream().collect(Collectors.groupingBy(ReportData::geoZone,
                Collectors.mapping(ReportData::customerId, Collectors.toSet())

        ));
    }
}
