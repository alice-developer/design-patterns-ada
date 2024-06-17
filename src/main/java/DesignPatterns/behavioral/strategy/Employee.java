package DesignPatterns.behavioral.strategy;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Employee {
    private String name;
    private BigDecimal salary;
    private ContractType contractType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + NumberFormat.getCurrencyInstance().format(salary) +
                ", contractType=" + contractType +
                '}';
    }
}
