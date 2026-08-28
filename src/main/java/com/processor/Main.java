package com.processor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> dataset = List.of(4.5, 7.2, 1.8, 9.6, 5.0);
        
        if (DataValidator.isValid(dataset)) {
            StatsService stats = new StatsService();
            System.out.println("Processing dataset: " + dataset);
            System.out.println("Calculated Mean: " + stats.calculateMean(dataset));
            System.out.println("Calculated Median: " + stats.calculateMedian(dataset));
        } else {
            System.out.println("Invalid dataset provided.");
        }
    }
}
