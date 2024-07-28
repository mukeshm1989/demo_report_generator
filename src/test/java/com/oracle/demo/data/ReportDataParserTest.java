package com.oracle.demo.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class ReportDataParserTest {

     @BeforeEach
    public void setUp() {
     }

//    @org.junit.jupiter.api.Test
//    void testParseValidData() {
//        String data = "2343225,2345,us_east,RedTeam,ProjectApple,3445s\n" +
//                "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s";
//
//        List<Map<String, String>> parsedData = ReportDataParser.parse(data);
//
//        assertNotNull(parsedData);
//        assertEquals(2, parsedData.size());
//
//        Map<String, String> firstRecord = parsedData.getFirst();
//        assertEquals("2343225", firstRecord.get("Column0"));
//        assertEquals("2345", firstRecord.get("Column1"));
//        assertEquals("us_east", firstRecord.get("Column2"));
//        assertEquals("RedTeam", firstRecord.get("Column3"));
//        assertEquals("ProjectApple", firstRecord.get("Column4"));
//        assertEquals("3445s", firstRecord.get("Column5"));
//
//        Map<String, String> secondRecord = parsedData.get(1);
//        assertEquals("1223456", secondRecord.get("Column0"));
//        assertEquals("2345", secondRecord.get("Column1"));
//        assertEquals("us_west", secondRecord.get("Column2"));
//        assertEquals("BlueTeam", secondRecord.get("Column3"));
//        assertEquals("ProjectBanana", secondRecord.get("Column4"));
//        assertEquals("2211s", secondRecord.get("Column5"));
//    }
//
//    @org.junit.jupiter.api.Test
//    void testParseInvalidData() {
//        String data = "2343225,2345,us_east,RedTeam,ProjectApple\n" +
//                "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s\n" +
//                "3244332,2346,eu_west,YellowTeam3,ProjectCarrot";
//
//        List<Map<String, String>> parsedData = ReportDataParser.parse(data);
//
//        assertNotNull(parsedData);
//        assertEquals(1, parsedData.size()); // Only the second row is valid
//
//        Map<String, String> recordMap = parsedData.getFirst();
//        assertEquals("1223456", recordMap.get("Column0"));
//        assertEquals("2345", recordMap.get("Column1"));
//        assertEquals("us_west", recordMap.get("Column2"));
//        assertEquals("BlueTeam", recordMap.get("Column3"));
//        assertEquals("ProjectBanana", recordMap.get("Column4"));
//        assertEquals("2211s", recordMap.get("Column5"));
//    }
//
//    @Test
//    void testParseEmptyData() {
//        String data = "";
//
//        List<Map<String, String>> parsedData = ReportDataParser.parse(data);
//
//        assertNotNull(parsedData);
//        assertTrue(parsedData.isEmpty());
//    }

//     @Test
//     public void testParse() {
//         String input = "2343225,2345,us_east,RedTeam,ProjectApple,3445s\n" +
//                 "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s";
//         List<ReportData> expected = List.of(
//                 new ReportData("2343225", "2345", "us_east", "RedTeam",
//                         "ProjectApple", "3445s"),
//                 new ReportData("1223456", "2345", "us_west", "BlueTeam",
//                         "ProjectBanana", "2211s")
//         );
//         List<ReportData> actual = ReportDataParser.parse(input);
//         assertEquals(expected, actual, "The parsed data should match the expected data.");
//     }

}