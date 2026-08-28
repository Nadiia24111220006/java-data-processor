package com.processor;

import java.util.List;

public class DataValidator {
    public static boolean isValid(List<Double> data) {
        return data != null && !data.isEmpty() && data.stream().allMatch(x -> x != null && !x.isNaN());
    }
}
