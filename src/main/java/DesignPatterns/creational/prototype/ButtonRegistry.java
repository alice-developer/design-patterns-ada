package DesignPatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ButtonRegistry {
    private static ButtonRegistry buttonRegistry;
    private static final Map<String, Button> REGISTRY = new HashMap<>();

    static {
        Button yellowButton = new Button();
        yellowButton.setColor("Yellow");
        yellowButton.setWidth(100);
        yellowButton.setHeight(30);
        yellowButton.setBorder(ButtonBorder.DASHED);

        Button redButton = new Button();
        redButton.setColor("Red");
        redButton.setWidth(150);
        redButton.setHeight(60);
        redButton.setBorder(ButtonBorder.DOTTED);

        Button blueButton = new Button();
        blueButton.setColor("Blue");
        blueButton.setWidth(200);
        blueButton.setHeight(60);
        blueButton.setBorder(ButtonBorder.SOLID);

        REGISTRY.put("YELLOW_BUTTON", yellowButton);
        REGISTRY.put("RED_BUTTON", redButton);
        REGISTRY.put("BLUE_BUTTON", blueButton);
    }

    public static ButtonRegistry getInstance() {
        if (Objects.isNull(buttonRegistry)) {
            buttonRegistry = new ButtonRegistry();
        }

        return buttonRegistry;
    }

    public static Button getButton(String key) {
        return ButtonFactory.getInstance(REGISTRY.get(key));
    }

    public static void addRegistry(String key, Button btn) {
        REGISTRY.put(key, btn);
    }
}
