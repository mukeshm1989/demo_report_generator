package com.oracle.demo.data;


// class to generate Report
public record ReportData(String customerId, String contractId,String geoZone,
                         String teamCode , String projectCode ,String buildDuration) {

    public static ReportData getReportData(final String...columns){
        return new ReportData(columns[0], columns[1], columns[2], columns[3], columns[4], columns[5]);
    }
}

