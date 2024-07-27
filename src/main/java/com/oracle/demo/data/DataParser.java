package com.oracle.demo.data;

import java.util.ArrayList;
import java.util.List;


// Class to parse data
public class DataParser {
    public static List<ReportData> parse(String data) {
        List<ReportData> reportDataList = new ArrayList<>();
        String[] lines = data.split("\n");
        
        for (String line : lines) {
            String[] columns = line.split(",");
            if (columns.length == 6) {
                reportDataList.add(new ReportData(
                        columns[0], 
                        columns[1], 
                        columns[2],
                        columns[5]
                ));
            }
        }
        return reportDataList;
    }
}
