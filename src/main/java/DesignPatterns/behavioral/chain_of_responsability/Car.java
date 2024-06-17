package DesignPatterns.behavioral.chain_of_responsability;

import java.math.BigDecimal;

public class Car {
    private String model;
    private Brand brand;
    private BigDecimal price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
