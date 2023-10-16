package com.example.probni_demo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String passport;
    private List<Integer> professionNumbers;

    public Person(String name, String surname, String passport, int professionNumber) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.professionNumbers = new ArrayList<>(List.of(professionNumber));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassport() {
        return passport;
    }

    public List<Integer> getProfessionNumbers() {
        return professionNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return professionNumbers == person.professionNumbers && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(passport, person.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, passport, professionNumbers);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passport='" + passport + '\'' +
                ", professionNumber=" + professionNumbers +
                '}';
    }
}
