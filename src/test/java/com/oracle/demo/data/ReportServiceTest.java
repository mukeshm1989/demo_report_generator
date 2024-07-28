package com.oracle.demo.data;
import com.oracle.demo.service.ReportService;
import com.oracle.demo.service.ReportServiceImpl;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportServiceTest {

    @Test
    void testUniqueCustomerCountByContractId() {
        List<ReportData> data = List.of(
                new ReportData("2343225", "2345", "us_east",
                        "RedTeam","ProjectApple","3445s"),
                new ReportData("1223456", "2345", "us_west",
                        "BlueTeam","ProjectBanana","2211s"),
                new ReportData("3244332", "2346", "eu_west",
                        "YellowTeam3","ProjectCarrot","4322s")
        );

        ReportService service = new ReportServiceImpl(data);
        Map<String, Integer> result = service.getUniqueCustomerCountByContractId();

        assertEquals(2, result.get("2345"));
        assertEquals(1, result.get("2346"));
    }

    @Test
    void testCountUniqueCustomerIdsByGeoZone() {
        List<ReportData> records = List.of(
                new ReportData("2343225", "2345", "us_east", "RedTeam", "ProjectApple", "3445s"),
                new ReportData("1223456", "2345", "us_west", "BlueTeam", "ProjectBanana", "2211s")
        );
        ReportServiceImpl processor = new ReportServiceImpl(records);
        Map<String, Integer> result = processor.getUniqueCustomerCountByGeoZone();
        assertEquals(1, result.get("us_east"));
        assertEquals(1, result.get("us_west"));
    }
    @Test
    void testAverageBuildDurationByGeoZone() {
        List<ReportData> records = List.of(
                new ReportData("2343225", "2345", "us_east", "RedTeam", "ProjectApple", "3445s"),
                new ReportData("1223456", "2345", "us_west", "BlueTeam", "ProjectBanana", "2211s")
        );
        ReportServiceImpl processor = new ReportServiceImpl(records);
        Map<String, Double> result = processor.fetchAverageBuildDurationByGeoZone();
        assertEquals(3445.0, result.get("us_east"));
        assertEquals(2211.0, result.get("us_west"));
    }
    @Test
    void testListUniqueCustomerIdsByGeoZone() {
        List<ReportData> records = List.of(
                new ReportData("2343225", "2345", "us_east", "RedTeam", "ProjectApple", "3445s"),
                new ReportData("1223456", "2345", "us_west", "BlueTeam", "ProjectBanana", "2211s")
        );
        ReportServiceImpl processor = new ReportServiceImpl(records);
        Map<String, Set<String>> result = processor.getUniqueCustomersByGeoZone();
        assertEquals(Set.of("2343225"), result.get("us_east"));
        assertEquals(Set.of("1223456"), result.get("us_west"));
    }
}
