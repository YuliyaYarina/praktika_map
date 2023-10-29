package com.example.probni_demo.service.impl;

import com.example.probni_demo.domain.Driver;
import com.example.probni_demo.domain.Person;
import com.example.probni_demo.domain.TruskDriver;
import com.example.probni_demo.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
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

    Map<String,Integer> professionCodes = new  HashMap(Map.of(
            "безработный", 0,
            "водитель",1,
            "плотник",2,
            "столяр",3,
            "актер",4
    ));

    public List<Person> getPersonsByProfession(Integer professionNumber){
        List<Person> result = new ArrayList<>();
        for (Person person : persons.values()) {
            if (person.getProfessionNumbers().contains(professionNumber)) {
                result.add(person);
            }
        }
        return result;
    }
    @Override
    public List<Person> getPersonsByProfessions(List<Integer> professionNumbers){
        List<Person> result = new ArrayList<>();
        for (Person person: persons.values()) {
            if (person.getProfessionNumbers().containsAll(professionNumbers)) {
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public void addPerson(Person person) {
        persons.put(person.getPassport(), person);
    }
    @Override
    public void addProfession(String passport, Integer profession){
        Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("человек с таким номером паспорта не найден");
        }
        person.getProfessionNumbers().add(profession);
    }
    @Override
    public String getPersonByPassport(String passport) {
        final Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("человек с таким номером паспорта не найден");
        }
        final String personDescripition = " "
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + getProfessionNames(person.getProfessionNumbers());
        return personDescripition;
    }

    @Override
    public String getProfessionNames(Set<Integer> professionNumbers) {
        String result = "";
        for (Integer professionNumber : professionNumbers) {
            result = result + " " + professionCodes.get(professionNumber);
        }
        return result;
    }
}
