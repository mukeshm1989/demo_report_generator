package com.oracle.demo;

import com.oracle.demo.data.RecordMapper;
import com.oracle.demo.data.ReportDataParser;
import com.oracle.demo.data.ReportData;
import com.oracle.demo.service.DisplayReportImpl;
import com.oracle.demo.service.ReadReportData;
import com.oracle.demo.service.ReadReportDataImpl;
import com.oracle.demo.service.ReportService;
import com.oracle.demo.service.ReportServiceImpl;

import java.util.List;

public class ReportGenerator {

    public static void main(String[] args) {

        // main is used as orchestrator

        ReadReportData readInput = new ReadReportDataImpl();
        final String inputData = readInput.readInputFromFile();

        RecordMapper<ReportData> recordMapper = column ->
                new ReportData(column[0], column[1], column[2], column[3], column[4], column[5]);

        final List<ReportData> dataList = ReportDataParser.parse(inputData,recordMapper);
        ReportService reportService = new ReportServiceImpl(dataList);

        DisplayReportImpl displayReport = new DisplayReportImpl(reportService);
        displayReport.printReportToConsole();

    }
}
