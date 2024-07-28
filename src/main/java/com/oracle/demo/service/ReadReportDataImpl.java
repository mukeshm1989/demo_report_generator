package com.oracle.demo.service;
import com.oracle.demo.exception.CustomException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// class to take inputs
public class ReadReportDataImpl implements ReadReportData {

    @Override
    public String readInputFromFile() {
        // readString can throw DirectMemoryBuffer exception
        try {
            return Files.readString(Path.of("src/main/resources/input.txt"));
        } catch (IOException e) {
            // We also create message properties file and message response body for custom message
            throw new CustomException("File not found");
        }
    }
}
