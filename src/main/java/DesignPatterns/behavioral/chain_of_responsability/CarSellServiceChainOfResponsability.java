package DesignPatterns.behavioral.chain_of_responsability;

import DesignPatterns.behavioral.chain_of_responsability.discounts.*;

import java.math.BigDecimal;

public class CarSellServiceChainOfResponsability {
    public BigDecimal calculateSellValue(Car car) {
        CarDiscount discount = new FiatCarDiscount(
            new FordCarDiscount(
            new CarAboveHundredThousandDiscount(
            new NoCarDiscount(null)
        )));

        return discount.applyDiscount(car);
    }
}
