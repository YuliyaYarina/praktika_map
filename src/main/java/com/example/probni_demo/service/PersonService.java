package com.example.probni_demo.service;

import com.example.probni_demo.domain.Person;

public interface PersonService {
    String getPerson(Integer number);

    void addPerson(Person person);
}
