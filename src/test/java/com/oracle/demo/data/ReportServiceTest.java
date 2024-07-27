package com.oracle.demo.data;
import com.oracle.demo.service.ReportService;
import com.oracle.demo.service.ReportServiceImpl;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportServiceTest {

    @Test
    public void testUniqueCustomerCountByContractId() {
        List<ReportData> data = List.of(
                new ReportData("2343225", "2345", "us_east",
                        "3445s"),
                new ReportData("1223456", "2345", "us_west",
                        "2211s"),
                new ReportData("3244332", "2346", "eu_west",
                        "4322s")
        );

        ReportService service = new ReportServiceImpl(data);
        Map<String, Integer> result = service.getUniqueCustomerCountByContractId();

        assertEquals(2, result.get("2345"));
        assertEquals(1, result.get("2346"));
    }
}
