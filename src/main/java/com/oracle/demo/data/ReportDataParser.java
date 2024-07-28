package com.oracle.demo.data;

import java.util.ArrayList;
import java.util.List;

import static com.oracle.demo.utils.Constants.COMMA_DELIMITER;
import static com.oracle.demo.utils.Constants.NEW_LINE_DELIMITER;
import static com.oracle.demo.utils.Constants.NUMBERS_OF_COLUMN;

// Class to parse data
public class ReportDataParser {
    private ReportDataParser(){}
    public static List<ReportData> parse(String data) {
        List<ReportData> reportDataList = new ArrayList<>();
        String[] lines = data.split(NEW_LINE_DELIMITER);
        for (String line : lines) {
            String[] columns = line.split(COMMA_DELIMITER);
            if (columns.length == NUMBERS_OF_COLUMN) {
                reportDataList.add(new ReportData(
                        columns[0], 
                        columns[1], 
                        columns[2],
                        columns[3],
                        columns[4],
                        columns[5]
                ));
            }
        }
        return reportDataList;
    }
}
