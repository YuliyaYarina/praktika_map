package com.example.probni_demo.service;

import com.example.probni_demo.domain.Person;

import java.util.List;

public abstract interface PersonService {

    void addPerson(Person person);

    String getPersonByPassport(String passport);

    void getPersonsByProfessions(List<Integer> integers);

    String getProfessionNames(List<Integer> professionNumbers);
}
