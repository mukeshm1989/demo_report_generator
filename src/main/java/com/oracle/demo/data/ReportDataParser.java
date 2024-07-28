package com.oracle.demo.data;

import java.util.ArrayList;
import java.util.List;

import static com.oracle.demo.utils.Constants.COMMA_DELIMITER;
import static com.oracle.demo.utils.Constants.NEW_LINE_DELIMITER;

// Class to parse data
public class ReportDataParser {
    //ReportDataParser(){}
    public static <T> List<T> parse(String input, RecordMapper<T> recordMapper) {

        List<T> records = new ArrayList<>();
        String[] lines = input.split(NEW_LINE_DELIMITER);
        for (String line : lines) {
            String[] columns = line.split(COMMA_DELIMITER);
            if (columns.length > 0) {
                records.add(recordMapper.map(columns));
            }
        }
        return records;
    }
}