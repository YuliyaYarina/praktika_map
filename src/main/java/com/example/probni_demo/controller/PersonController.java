package com.example.probni_demo.controller;

import com.example.probni_demo.exceptions.BadPersonNumberException;
import com.example.probni_demo.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/person")
    public String detPersonInfo(@RequestParam Integer number){
        final String person;
        try {
            person = personService.getPerson(number);
        } catch (BadPersonNumberException e) {
            throw new RuntimeException(e);
        }
        return person;
    }

}
