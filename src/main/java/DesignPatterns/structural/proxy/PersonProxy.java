package DesignPatterns.structural.proxy;

import DesignPatterns.creational.builder.Person;

public interface PersonProxy {
    void save(Person person);
    Person findById(Long id);
}
