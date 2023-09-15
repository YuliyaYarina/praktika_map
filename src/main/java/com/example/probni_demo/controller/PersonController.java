package com.example.probni_demo.controller;

import com.example.probni_demo.domain.Person;
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
            person = personService.getPerson(number);
        return person;
    }

//    /person/add?name=pi&surname=li&passport=99999&profession=2
    @GetMapping("/person/add")
    public String addPerson(@RequestParam String name,
                            @RequestParam String surname,
                            @RequestParam String passport,
                            @RequestParam Integer profession
                            ){
        Person person = new Person(
                name,
                surname,
                passport,
                profession
        );
        personService.addPerson(person);
        return "Person added";
    }

}
