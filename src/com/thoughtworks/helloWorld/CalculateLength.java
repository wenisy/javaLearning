package com.thoughtworks.helloWorld;

public class CalculateLength {
    public double convertUnit(String input) {
        double value;
        String metric = input.substring(input.length() - 2, input.length());
        if ("mm".equals(metric)) {
            value = Double.parseDouble(input.split("mm")[0]);
        } else if ("cm".equals(metric)) {
            value = Double.parseDouble(input.split("cm")[0]) * 10;
        } else {
            value = Double.parseDouble(input.split("m")[0]) * 1000;
        }
        return value;
    }
}
