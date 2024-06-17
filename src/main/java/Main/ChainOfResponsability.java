package Main;

import DesignPatterns.behavioral.chain_of_responsability.Brand;
import DesignPatterns.behavioral.chain_of_responsability.Car;
import DesignPatterns.behavioral.chain_of_responsability.CarSellServiceChainOfResponsability;

import java.math.BigDecimal;

public class ChainOfResponsability {
    public static void main(String[] args) {
        CarSellServiceChainOfResponsability carSellService = new CarSellServiceChainOfResponsability();

        Car car1 = new Car();
        car1.setBrand(Brand.FORD);
        car1.setModel("Fusion");
        car1.setPrice(new BigDecimal(90000.00));

        Car car2 = new Car();
        car2.setBrand(Brand.FIAT);
        car2.setModel("Uno");
        car2.setPrice(new BigDecimal(40000.00));

        Car car3 = new Car();
        car3.setBrand(Brand.CHEVROLET);
        car3.setModel("Camaro");
        car3.setPrice(new BigDecimal(200000.00));

        BigDecimal value1 = carSellService.calculateSellValue(car1);
        BigDecimal value2 = carSellService.calculateSellValue(car2);
        BigDecimal value3 = carSellService.calculateSellValue(car3);

        System.out.println("Fusion (antes do desconto): " + car1.getPrice());
        System.out.println("Fusion (após o desconto): " + value1);

        System.out.println("Uno (antes do desconto): " + car2.getPrice());
        System.out.println("Uno (após o desconto): " + value2);

        System.out.println("Camaro (antes do desconto): " + car3.getPrice());
        System.out.println("Camaro (após o desconto): " + value3);
    }
}
