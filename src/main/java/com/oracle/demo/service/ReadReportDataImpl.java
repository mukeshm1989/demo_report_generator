package com.oracle.demo.service;
import com.oracle.demo.exception.CustomException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// class to take inputs
public class ReadReportDataImpl implements ReadReportData {

    @Override
    public String readInputFromFile(final String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            // For customized messages, we further generate the message response body and message properties file.
            throw new CustomException("File not found");
        }
    }
}
