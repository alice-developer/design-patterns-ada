package DesignPatterns.behavioral.strategy;

import DesignPatterns.behavioral.strategy.Calculators.AnnualSalaryAdjustmentCalculator;

public class AnnualSalaryAdjustmentStrategy {
    public void calculateAdjustment(Employee employee, AnnualSalaryAdjustmentCalculator calculator) {
        calculator.calcSalaryAdjustment(employee);
    }
}
