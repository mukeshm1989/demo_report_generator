package com.oracle.demo.service;
import com.oracle.demo.exception.CustomException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// class to take inputs
public class ReadInputImpl implements ReadInput{

    @Override
    public String readInputFromFile() {
        // readString can throw DirectMemoryBuffer exception
        try {
            return Files.readString(Path.of("src/main/resources/input.txt"));
        } catch (IOException e) {
            throw new CustomException(e.getMessage());
        }
    }
}
