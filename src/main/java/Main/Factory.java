package Main;

import DesignPatterns.creational.factory.Product;
import DesignPatterns.creational.factory.ProductFactory;
import DesignPatterns.creational.factory.ProductType;

public class Factory {
    public static void main(String[] args) {
        Product digital = ProductFactory.getInstance(ProductType.DIGITAL);
        Product fisico = ProductFactory.getInstance(ProductType.PHYSICAL);

        fisico.setName("CD");
        fisico.setDescrition("Um CD com jogos!");

        digital.setName("Código de acesso");
        digital.setDescrition("Um código para acessar uma conta.");

        System.out.println(fisico);
        System.out.println(digital);
    }
}
