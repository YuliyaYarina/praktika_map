package com.example.probni_demo.service;

import com.example.probni_demo.domain.Person;

import java.util.List;
import java.util.Set;

public interface PersonService {

    List<Person> getPersonsByProfession(Integer professionNumber);

    List<Person> getPersonsByProfessions(List<Integer> professionNumbers);

    void addPerson(Person person);

    void addProfession(String passport, Integer profession);

    String getPersonByPassport(String passport);

    String getProfessionNames(Set<Integer> professionNumbers);
}
