package DesignPatterns.behavioral.chain_of_responsability.discounts;

import DesignPatterns.behavioral.chain_of_responsability.Brand;
import DesignPatterns.behavioral.chain_of_responsability.Car;

import java.math.BigDecimal;

public class FordCarDiscount extends CarDiscount {
    public FordCarDiscount(CarDiscount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        BigDecimal sellValue = car.getPrice();

        if (Brand.FORD.equals(car.getBrand()))
        {
            return sellValue.subtract(new BigDecimal(2000));
        }

        return nextDiscount.applyDiscount(car);
    }
}
