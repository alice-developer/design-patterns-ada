package Main;

import DesignPatterns.behavioral.strategy.AnnualSalaryAdjustmentStrategy;
import DesignPatterns.behavioral.strategy.Calculators.AnnualCLTSalaryAdjustmentCalculator;
import DesignPatterns.behavioral.strategy.Calculators.AnnualPJSalaryAdjustmentCalculator;
import DesignPatterns.behavioral.strategy.Calculators.AnnualTraineeSalaryAdjustmentCalculator;
import DesignPatterns.behavioral.strategy.ContractType;
import DesignPatterns.behavioral.strategy.Employee;

import java.math.BigDecimal;

public class Strategy {
    public static void main(String[] args) {
        Employee employeeCLT = new Employee();
        employeeCLT.setName("Leonardo");
        employeeCLT.setContractType(ContractType.CLT);
        employeeCLT.setSalary(new BigDecimal(11000));

        Employee employeePJ = new Employee();
        employeePJ.setName("Helena");
        employeePJ.setContractType(ContractType.PJ);
        employeePJ.setSalary(new BigDecimal(14000));

        Employee employeeTrainee = new Employee();
        employeeTrainee.setName("Vinícius");
        employeeTrainee.setContractType(ContractType.Trainee);
        employeeTrainee.setSalary(new BigDecimal(2000));

        System.out.println(employeeCLT);
        System.out.println(employeePJ);
        System.out.println(employeeTrainee);

        AnnualSalaryAdjustmentStrategy adjustmentClass = new AnnualSalaryAdjustmentStrategy();

        adjustmentClass.calculateAdjustment(employeeCLT, new AnnualCLTSalaryAdjustmentCalculator());
        adjustmentClass.calculateAdjustment(employeePJ, new AnnualPJSalaryAdjustmentCalculator());
        adjustmentClass.calculateAdjustment(employeeTrainee, new AnnualTraineeSalaryAdjustmentCalculator());

        System.out.println(employeeCLT);
        System.out.println(employeePJ);
        System.out.println(employeeTrainee);
    }
}
