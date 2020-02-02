package com.company;

public class TaxReport {
    private TaxCalculator calculator;

//    Constructor Injection
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

//    Method show
    public void show() {
        var tax = calculator.calculateTax();
        System.out.printf("Tax is: %.2f\n", tax);
    }

//    Setter Injection
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
