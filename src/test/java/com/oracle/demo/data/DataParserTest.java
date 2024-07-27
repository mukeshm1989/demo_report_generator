package com.oracle.demo.data;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DataParserTest {

    @Test
    public void testParse() {
        String data = "2343225,2345,us_east,RedTeam,ProjectApple,3445s\n" +
                "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s";
        List<ReportData> result = DataParser.parse(data);

        assertEquals(2, result.size());
        assertEquals("2343225", result.get(0).customerId());
    }

}