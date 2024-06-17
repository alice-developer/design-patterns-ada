package DesignPatterns.structural.adapter;

import java.math.BigDecimal;

public class JarAccountOperationsAdapterClient {
    private JarAccountOperationsAdapter jaoa;

    public JarAccountOperationsAdapterClient(JarAccountOperationsAdapter jaoa) {
        this.jaoa = jaoa;
    }

    public void withdraw(BigDecimal value) {
        jaoa.withdraw(value);
    }

    public void deposit(BigDecimal value) {
        jaoa.deposit(value);
    }
}
