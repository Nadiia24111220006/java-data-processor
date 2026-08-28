package com.processor;

import java.util.List;

public class StatsServiceTest {
    public static void main(String[] args) {
        StatsService stats = new StatsService();
        List<Double> sample = List.of(10.0, 20.0, 30.0, 40.0, 50.0);
        
        assert stats.calculateMean(sample) == 30.0 : "Mean test failed";
        assert stats.calculateMedian(sample) == 30.0 : "Median test failed";
        
        System.out.println("All basic assertions passed successfully.");
    }
}
