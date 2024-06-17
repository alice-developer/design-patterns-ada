package DesignPatterns.structural.adapter;

import java.math.BigDecimal;

public class JarAccountOperations {
    public boolean validateBalance(BigDecimal value) {
        System.out.println("Validando saldo...");
        return true;
    }

    public void withdraw(BigDecimal value) {
        System.out.println("Sacando valor...");
    }

    public void deposit(BigDecimal value) {
        System.out.println("Depositando valor...");
    }
}
