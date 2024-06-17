package DesignPatterns.structural.proxy;

import DesignPatterns.creational.builder.Person;

public class PersonService {
    private final PersonProxy personRepositoryProxy;

    public PersonService(PersonProxy personRepositoryProxy) {
        this.personRepositoryProxy = personRepositoryProxy;
    }

    public void save(Person person) {
        personRepositoryProxy.save(person);
    }

    public Person findById(Long id) {
        return personRepositoryProxy.findById(id);
    }
}
