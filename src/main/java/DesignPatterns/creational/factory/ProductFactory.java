package DesignPatterns.creational.factory;

public class ProductFactory {
    public static Product getInstance(ProductType type) {
        Product newProduct = new Product();
        newProduct.type = type;

        switch (type) {
            case PHYSICAL:
                newProduct.setHasPhysicalDimensions(true);
                break;
            case DIGITAL:
                newProduct.setHasPhysicalDimensions(false);
                break;
            default:
                throw new IllegalArgumentException("Tipo de produto inexistente.");
        }

        return newProduct;
    }
}
