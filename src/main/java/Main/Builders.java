package Main;

import DesignPatterns.creational.builder.Person;

import java.time.LocalDate;

public class Builders {
    public static void main(String[] args) {
        Person alice = new Person.PersonBuilder()
                .name("Alice")
                .lastname("Dev")
                .nickname("Lili")
                .cpf("12345678901")
                .email("imalicedev@gmail.com")
                .birthdate(LocalDate.of(2005, 11, 4))
                .build();

        System.out.println(alice.toString());
        System.out.println(alice.getName());
    }
}