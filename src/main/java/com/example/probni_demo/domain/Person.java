package com.example.probni_demo.domain;

import java.util.*;

public class Person {
    private String name;
    private String surname;
    private String passport;
    private Set<Integer> professionNumbers;

    public Person(String name, String surname, String passport, int professionNumber) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.professionNumbers = new HashSet<>(List.of(professionNumber));
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

    public Set<Integer> getProfessionNumbers() {
        return professionNumbers;
    }

    public Person(String name, String surname, String passport, Set<Integer> professionNumbers) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.professionNumbers = professionNumbers;
    }

}
