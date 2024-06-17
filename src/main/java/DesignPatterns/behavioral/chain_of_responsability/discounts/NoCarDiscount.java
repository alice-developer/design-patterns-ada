package DesignPatterns.behavioral.chain_of_responsability.discounts;

import DesignPatterns.behavioral.chain_of_responsability.Car;

import java.math.BigDecimal;

public class NoCarDiscount extends  CarDiscount {
    public NoCarDiscount(CarDiscount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        return BigDecimal.ZERO;
    }
}
