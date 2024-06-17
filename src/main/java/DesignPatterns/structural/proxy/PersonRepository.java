package DesignPatterns.structural.proxy;

import DesignPatterns.creational.builder.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {
    private final Map<Long, Person> database = new HashMap<>();
    private static Long countId = 1L;

    public void save(Person person) {
        database.put(++countId, person);
    }

    public Person findById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (Exception err) {
            throw new RuntimeException(err);
        }

        return database.get(countId);
    }
}
