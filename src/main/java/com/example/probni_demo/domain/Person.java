package com.example.probni_demo.domain;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String passport;
    private int professionNumber;

    public Person(String name, String surname, String passport, int professionNumber) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.professionNumber = professionNumber;
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

    public int getProfessionNumber() {
        return professionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return professionNumber == person.professionNumber && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(passport, person.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, passport, professionNumber);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passport='" + passport + '\'' +
                ", professionNumber=" + professionNumber +
                '}';
    }
}
