package DesignPatterns.structural.proxy;

import DesignPatterns.creational.builder.Person;

import java.util.logging.Logger;

public class NewPersonRepositoryProxy extends PersonRepository implements PersonProxy {
    private static Logger log = Logger.getLogger(NewPersonRepositoryProxy.class.getSimpleName());

    @Override
    public void save(Person person) {
        log.info("Registrando novo usuário...");
        super.save(person);
        log.info("Usuário registrado!");
    }

    @Override
    public Person findById(Long id) {
        log.info("Procurando usuário...");
        Person person = super.findById(id);
        log.info("Usuário encontrado com sucesso!");

        return person;
    }
}
