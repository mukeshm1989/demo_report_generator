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
        final String inputData = readInput.readInputFromFile(PATH);

        final List<ReportData> dataList = ReportDataParser.parse(inputData, ReportData::getReportData);
        final ReportService reportService = new ReportServiceImpl(dataList);

        final DisplayReportImpl displayReport = new DisplayReportImpl(reportService);
        displayReport.printReportToConsole();

    }
}
