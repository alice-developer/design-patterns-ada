package DesignPatterns.behavioral.strategy.Calculators;

import DesignPatterns.behavioral.strategy.Employee;

import java.math.BigDecimal;

public class AnnualPJSalaryAdjustmentCalculator implements AnnualSalaryAdjustmentCalculator {
    @Override
    public void calcSalaryAdjustment(Employee employee) {
        BigDecimal salary = employee.getSalary();
        employee.setSalary(salary.add(salary.multiply(new BigDecimal(0.05))));
    }
}
