package com.oracle.demo;

import com.oracle.demo.data.ReportDataParser;
import com.oracle.demo.data.ReportData;
import com.oracle.demo.service.DisplayReportImpl;
import com.oracle.demo.service.ReadReportData;
import com.oracle.demo.service.ReadReportDataImpl;
import com.oracle.demo.service.ReportService;
import com.oracle.demo.service.ReportServiceImpl;

import java.util.List;

import static com.oracle.demo.utils.Constants.PATH;

public class ReportGenerator {

    public static void main(String[] args) {

        // main is used as orchestrator

        final ReadReportData readInput = new ReadReportDataImpl();
        final String reportData = readInput.readInputFromFile(PATH);

        final List<ReportData> reportDataList = ReportDataParser.parse(reportData, ReportData::getReportData);
        final ReportService reportService = new ReportServiceImpl(reportDataList);

        final DisplayReportImpl displayReport = new DisplayReportImpl(reportService);
        displayReport.printReportToConsole();

    }
}
