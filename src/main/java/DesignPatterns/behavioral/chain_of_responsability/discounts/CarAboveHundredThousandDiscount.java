package DesignPatterns.behavioral.chain_of_responsability.discounts;

import DesignPatterns.behavioral.chain_of_responsability.Brand;
import DesignPatterns.behavioral.chain_of_responsability.Car;

import java.math.BigDecimal;

public class CarAboveHundredThousandDiscount extends CarDiscount{
    public CarAboveHundredThousandDiscount(CarDiscount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        BigDecimal sellValue = car.getPrice();

        if (car.getPrice().compareTo(new BigDecimal(100000)) > 0)
        {
            return sellValue.subtract(new BigDecimal(10000));
        }

        return nextDiscount.applyDiscount(car);
    }
}
