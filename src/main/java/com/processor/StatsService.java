package com.processor;

import java.util.Arrays;
import java.util.List;

public class StatsService {
    public double calculateMean(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        return numbers.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public double calculateMedian(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        double[] sorted = numbers.stream().mapToDouble(Double::doubleValue).sorted().toArray();
        int n = sorted.length;
        if (n % 2 == 0) {
            return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
        }
        return sorted[n / 2];
    }
}
