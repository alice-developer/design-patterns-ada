package Main;

import DesignPatterns.creational.builder.Person;
import DesignPatterns.structural.proxy.NewPersonRepositoryProxy;
import DesignPatterns.structural.proxy.PersonRepositoryProxy;
import DesignPatterns.structural.proxy.PersonService;

import java.time.LocalDate;

public class Proxy {
    public static void main(String[] args) throws InterruptedException {
        PersonRepositoryProxy repository = new PersonRepositoryProxy();
        NewPersonRepositoryProxy newRepository = new NewPersonRepositoryProxy();

        PersonService service = new PersonService(repository);
        PersonService newService = new PersonService(newRepository);

        Person alice = new Person.PersonBuilder()
                .name("Alice")
                .lastname("Dev")
                .nickname("Alice Melody")
                .email("imalicedev@gmail.com")
                .cpf("12345678901")
                .birthdate(LocalDate.of(2005, 11, 4))
                .build();

        service.save(alice);
        System.out.println(service.findById(1L));

        Thread.sleep(1000);

        newService.save(alice);
        System.out.println(newService.findById(1L));
    }
}
