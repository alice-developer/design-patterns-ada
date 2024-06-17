package DesignPatterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

// Evitando Reflection utilizando Enums (forma recomendada pela comunidade para criar singletons)
public enum ScheduleSingletonEnum {
    INSTANCE;
    private Map<String, Boolean> availableDays = new HashMap<>();

    public static ScheduleSingletonEnum getInstance() {
        return INSTANCE;
    }

    private ScheduleSingletonEnum() {
        availableDays.put("Domingo", Boolean.TRUE);
        availableDays.put("Segunda", Boolean.TRUE);
        availableDays.put("Terça", Boolean.TRUE);
        availableDays.put("Quarta", Boolean.TRUE);
        availableDays.put("Quinta", Boolean.TRUE);
        availableDays.put("Sexta", Boolean.TRUE);
        availableDays.put("Sábado", Boolean.TRUE);
    }

    public Map<String, Boolean> getAvailableDays() {
        return availableDays;
    }

    public void occupyDay(String day) {
        availableDays.replace(day, Boolean.FALSE);
    }
}
