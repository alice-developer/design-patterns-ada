package DesignPatterns.structural.adapter;

import java.math.BigDecimal;

public class JarAccountOperationsAdapter {
    private JarAccountOperations jao;

    public JarAccountOperationsAdapter(JarAccountOperations jao) {
        this.jao = jao;
    }

    public void withdraw(BigDecimal value) {
        if (jao.validateBalance(value)) {
            jao.withdraw(value);
        } else {
            throw new IllegalArgumentException("Valor para saque não permitido.");
        }
    }

    public void deposit(BigDecimal value) {
        jao.deposit(value);
    }
}
