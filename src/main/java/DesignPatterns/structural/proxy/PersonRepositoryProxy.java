package DesignPatterns.structural.proxy;

import DesignPatterns.creational.builder.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PersonRepositoryProxy extends PersonRepository implements PersonProxy {
    private static Logger log = Logger.getLogger(PersonRepositoryProxy.class.getSimpleName());
    private static Map<Long, Person> cache = new HashMap<>();

    @Override
    public void save(Person person) {
        log.info("Salvando usuário ao banco de dados...");
        super.save(person);
        log.info("Usuário salvo com sucesso!");

    }

    @Override
    public Person findById(Long id) {
        log.info("Procurando usuário...");

        if(Objects.nonNull(cache.get(id))) {
            log.info("Retornado dados do cache.");
            return cache.get(id);
        }

        log.info("Busca realizada com sucesso.");
        Person person = super.findById(id);

        if (Objects.nonNull(person)) {
            cache.put(id, person);
        }

        return person;
    }
}
