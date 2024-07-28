package com.oracle.demo.data;
import com.oracle.demo.exception.CustomException;
import com.oracle.demo.service.ReadReportDataImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static com.oracle.demo.utils.Constants.PATH;
import static org.junit.jupiter.api.Assertions.assertThrows;

    class ReadReportDataTest {

    @Test
    void testReadInputFromFileSuccess() {
        ReadReportDataImpl fileReader = new ReadReportDataImpl();
        String result = fileReader.readInputFromFile(PATH);
        Assertions.assertTrue(StringUtils.isNotBlank(result));
    }

    @Test
    void testReadInputFromFileFailure() {
        String path = "";
        ReadReportDataImpl fileReader = new ReadReportDataImpl();
        CustomException thrown = assertThrows(CustomException.class, () -> {
            fileReader.readInputFromFile(path);
        });
        Assertions.assertEquals("File not found", thrown.getMessage());
    }
}
