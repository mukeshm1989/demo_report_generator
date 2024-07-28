package com.oracle.demo.data;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportDataParserTest {

     @BeforeEach
    public void setUp() {
     }
     @Test
     public void testParse() {
         String input = "2343225,2345,us_east,RedTeam,ProjectApple,3445s\n" +
                 "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s";
         List<ReportData> expected = List.of(
                 new ReportData("2343225", "2345", "us_east", "RedTeam",
                         "ProjectApple", "3445s"),
                 new ReportData("1223456", "2345", "us_west", "BlueTeam",
                         "ProjectBanana", "2211s")
         );
         List<ReportData> actual = ReportDataParser.parse(input,ReportData::getReportData);
         assertEquals(expected, actual, "The parsed data should match the expected data.");
     }

}