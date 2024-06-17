package DesignPatterns.creational.prototype;

public class ButtonFactory {
    public static Button getInstance(Button prototype) {
        Button newButton = new Button();
        newButton.setWidth(prototype.width);
        newButton.setHeight(prototype.height);
        newButton.setColor(prototype.color);
        newButton.setBorder(prototype.border);

        return newButton;
    }
}
