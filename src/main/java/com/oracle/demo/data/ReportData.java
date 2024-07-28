package com.oracle.demo.data;


// class to generate Report
public record ReportData(String customerId, String contractId,String geoZone,
                         String teamCode , String projectCode ,String buildDuration) {
}
