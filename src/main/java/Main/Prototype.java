package Main;

import DesignPatterns.creational.prototype.Button;
import DesignPatterns.creational.prototype.ButtonBorder;
import DesignPatterns.creational.prototype.ButtonRegistry;

public class Prototype {
    public static void main(String[] args) {
        Button redBtn = ButtonRegistry.getButton("RED_BUTTON");
        Button blueBtn = ButtonRegistry.getButton("BLUE_BUTTON");
        Button yellowBtn = ButtonRegistry.getButton("YELLOW_BUTTON");
        Button yellowBtn2 = ButtonRegistry.getButton("YELLOW_BUTTON");
        yellowBtn2.setWidth(300);

        System.out.println(redBtn);
        System.out.println(blueBtn);
        System.out.println(yellowBtn);
        System.out.println(yellowBtn2);

        Button blackButton = new Button();
        blackButton.setBorder(ButtonBorder.SOLID);
        blackButton.setColor("Black");
        blackButton.setWidth(200);
        blackButton.setHeight(50);

        ButtonRegistry.addRegistry("BLACK_BUTTON", blackButton);

        Button newBlackButton = ButtonRegistry.getButton("BLACK_BUTTON");
        newBlackButton.setWidth(300);
        newBlackButton.setBorder(ButtonBorder.DASHED);

        System.out.println(blackButton);
        System.out.println(newBlackButton);
    }
}
