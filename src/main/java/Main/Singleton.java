package Main;

import DesignPatterns.creational.singleton.ScheduleSingletonEager;
import DesignPatterns.creational.singleton.ScheduleSingletonLazy;

public class Singleton {
    public static void main(String[] args) {
        reserveDayEager("Terça");
        reserveDayEager("Sábado");

        reserveDayLazy("Terça");
        reserveDayLazy("Sábado");
    }

    public static void reserveDayEager(String day) {
        ScheduleSingletonEager schedule = ScheduleSingletonEager.getInstance();
        schedule.occupyDay(day);

        System.out.println(schedule.getAvailableDays());
    }

    public static void reserveDayLazy(String day) {
        ScheduleSingletonLazy schedule = ScheduleSingletonLazy.getInstance();
        schedule.occupyDay(day);

        System.out.println(schedule.getAvailableDays());
    }
}
