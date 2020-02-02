package com.company;

public class Main {

    public static void main(String[] args) {
        // Creating new objects
        var calculator = new TaxCalculator2020(100_000);
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2021(101_000));
        report.show();
    }
}
