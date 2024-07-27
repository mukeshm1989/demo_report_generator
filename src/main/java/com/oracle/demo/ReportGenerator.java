package com.oracle.demo;

import com.oracle.demo.data.DataParser;
import com.oracle.demo.data.ReportData;
import com.oracle.demo.service.*;
import java.util.List;

public class ReportGenerator {

    public static void main(String[] args) {
        // main is used as orchestrator

        ReadInput readInput = new ReadInputImpl();
        final String inputData = readInput.readInputFromFile();

        List<ReportData> dataList = DataParser.parse(inputData);
        ReportService reportService = new ReportServiceImpl(dataList);

        DisplayReportImpl displayReport = new DisplayReportImpl(reportService);
        displayReport.printReportToConsole();

    }
}
