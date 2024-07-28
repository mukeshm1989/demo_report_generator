package com.oracle.demo.service;

import static com.oracle.demo.utils.PrintToConsole.printAverageBuildDurationByGeozone;
import static com.oracle.demo.utils.PrintToConsole.printUniqueCustomerCountByContractId;
import static com.oracle.demo.utils.PrintToConsole.printUniqueCustomerCountByGeozone;
import static com.oracle.demo.utils.PrintToConsole.printUniqueCustomersByGeozone;

public class DisplayReportImpl implements DisplayReport{

    private final ReportService reportService;

    public DisplayReportImpl(final ReportService reportService) {

        this.reportService = reportService;
    }

    public void printReportToConsole() {
        printUniqueCustomerCountByContractId(reportService.getUniqueCustomerCountByContractId());
        printUniqueCustomerCountByGeozone(reportService.getUniqueCustomerCountByGeoZone());
        printAverageBuildDurationByGeozone(reportService.fetchAverageBuildDurationByGeoZone());
        printUniqueCustomersByGeozone(reportService.getUniqueCustomersByGeoZone());
    }

    // public void writeToFile
    // public void sendOverNetwork


}


