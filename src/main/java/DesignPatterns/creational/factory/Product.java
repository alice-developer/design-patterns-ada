package DesignPatterns.creational.factory;

public class Product {
    String name;
    String descrition;
    ProductType type;
    boolean hasPhysicalDimensions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public boolean hasPhysicalDimensions() {
        return hasPhysicalDimensions;
    }

    public void setHasPhysicalDimensions(boolean hasPhysicalDimensions) {
        this.hasPhysicalDimensions = hasPhysicalDimensions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", descrition='" + descrition + '\'' +
                ", type=" + type +
                ", hasPhysicalDimensions=" + hasPhysicalDimensions +
                '}';
    }
}
