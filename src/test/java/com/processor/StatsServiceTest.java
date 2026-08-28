package com.processor;

import java.util.List;

public class StatsServiceTest {
    public static void main(String[] args) {
        StatsService stats = new StatsService();
        List<Double> sample = List.of(2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0);
        
        assert stats.calculateMean(sample) == 5.0 : "Mean test failed";
        assert stats.calculateVariance(sample) == 4.0 : "Variance test failed";
        
        System.out.println("All feature assertions passed successfully.");
    }
}
