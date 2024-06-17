package Main;

import DesignPatterns.structural.adapter.JarAccountOperations;
import DesignPatterns.structural.adapter.JarAccountOperationsAdapter;
import DesignPatterns.structural.adapter.JarAccountOperationsAdapterClient;

import java.math.BigDecimal;

public class Adapter {
    public static void main(String[] args) {
        JarAccountOperations jao = new JarAccountOperations();
        JarAccountOperationsAdapter jaoa = new JarAccountOperationsAdapter(jao);
        JarAccountOperationsAdapterClient client = new JarAccountOperationsAdapterClient(jaoa);

        BigDecimal valueToWithdraw = new BigDecimal(1000);

        client.withdraw(valueToWithdraw);
        client.deposit(new BigDecimal(500));
    }
}
