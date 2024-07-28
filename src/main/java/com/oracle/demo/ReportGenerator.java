package com.oracle.demo;

import com.oracle.demo.data.ReportDataParser;
import com.oracle.demo.data.ReportData;
import com.oracle.demo.service.*;
import java.util.List;

public class ReportGenerator {

    public static void main(String[] args) {
        // main is used as orchestrator

        ReadReportData readInput = new ReadReportDataImpl();
        final String inputData = readInput.readInputFromFile();

        List<ReportData> dataList = ReportDataParser.parse(inputData);
        ReportService reportService = new ReportServiceImpl(dataList);

        DisplayReportImpl displayReport = new DisplayReportImpl(reportService);
        displayReport.printReportToConsole();

    }
}
