package com.example.probni_demo.service;

import com.example.probni_demo.domain.Driver;
import com.example.probni_demo.domain.Person;
import com.example.probni_demo.domain.TruskDriver;
import com.example.probni_demo.exceptions.BadPersonNumberException;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    Person[] persons = {
            new Person(
                    "Жан",
                    "Рено",
                    "12345",
                    2),
            new Person(
                    "Люк",
                    "Бессон",
                    "54321",
                    3),
            new Person(
                    "Жерар",
                    "Депардье",
                    "41232",
                    0),
            new Driver(
                    "Джейсон",
                    "Стетхем",
                    "928374",
                    "3491",
                    2),
            new TruskDriver(
            "Жерар",
            "Депардье",
            "1000",
            "2345",
            4)
    };
    String[] professions = {
            "безработный",
            "водитель",
            "плотник",
            "столяр",
    };

    @Override
    public String getPerson(Integer number) {
        final Person person;
        if (number >= persons.length) {
            throw new BadPersonNumberException("Ошибка в том что номер человека заведомо больше");
        }

        person = persons[number];

        final String personDescripition = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + professions[person.getProfessionNumber()];
        return personDescripition;
    }

}
