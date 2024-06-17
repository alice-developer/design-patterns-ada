package DesignPatterns.creational.builder;

import java.time.LocalDate;

public class Person {
    private String name;
    private String lastname;
    private String nickname;
    private String email;
    private String cpf;
    private LocalDate birthdate;

    private Person(String name, String lastname, String nickname, String email, String cpf, LocalDate birthdate) {
        this.name = name;
        this.lastname = lastname;
        this.nickname = nickname;
        this.email = email;
        this.cpf = cpf;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return String.format(
            "Pessoa={%s, %s, %s, %s, %s, %s}",
            name, lastname, nickname, email, cpf, birthdate.toString()
        );
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public static class PersonBuilder {
        private String name;
        private String lastname;
        private String nickname;
        private String email;
        private String cpf;
        private LocalDate birthdate;

        public Person build() {
            return new Person(name, lastname, nickname, email, cpf, birthdate);
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder birthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public PersonBuilder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public PersonBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
    }
}
