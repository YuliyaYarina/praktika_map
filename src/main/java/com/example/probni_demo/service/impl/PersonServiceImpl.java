package com.example.probni_demo.service.impl;

import com.example.probni_demo.domain.Driver;
import com.example.probni_demo.domain.Person;
import com.example.probni_demo.domain.TruskDriver;
import com.example.probni_demo.exceptions.BadPersonNumberException;
import com.example.probni_demo.service.PersonService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
public class PersonServiceImpl implements PersonService {
    Map<String, Person> persons = new HashMap<>(Map.of(
            "12345",
            new Person(
                    "Жан",
                    "Рено",
                    "12345",
                    2),
            "54321",
            new Person(
                    "Люк",
                    "Бессон",
                    "54321",
                    3),
            "41232",
            new Person(
                    "Жерар",
                    "Депардье",
                    "41232",
                    0),
            "928374",
            new Driver(
                    "Джейсон",
                    "Стетхем",
                    "928374",
                    "3491",
                    2),
            "1000",
            new TruskDriver(
            "Жерар",
            "Депардье",
            "1000",
            "2345",
            4)
    ));
    List<String> professions = new ArrayList<>(List.of(
            "безработный",
            "водитель",
            "плотник",
            "столяр"
            ));

    @Override
    public String getPerson(Integer number) {
        final Person person;
        if (number >= persons.size()) {
            throw new BadPersonNumberException("Ошибка в том что номер человека заведомо больше");
        }

        person = persons.get(number);

        final String personDescripition = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + professions.get(person.getProfessionNumber());
        return personDescripition;
    }

    @Override
    public void addPerson(Person person) {
        persons.put(person.getPassport(),person);
    }

    @Override
    public String getPersonByPassport(String passport) {
        for (Person person : persons.values()) {
            if (person.getPassport().equals(passport)) {
                final String personDescripition = ""
                        + person.getName() + " "
                        + person.getSurname() + " "
                        + person.getPassport() + " "
                        + professions.get(person.getProfessionNumber());
                return personDescripition;
            }
        }
        throw new RuntimeException("человек с таким номером паспорта не найден");

    }

}
