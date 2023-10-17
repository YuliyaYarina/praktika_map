package com.example.probni_demo.controller;

import com.example.probni_demo.domain.Person;
import com.example.probni_demo.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/by-passport")
    public String getPersonInfo(@RequestParam String passport){
        return personService.getPersonByPassport(passport);
    }
@GetMapping("/profession/add")
    public String addProfession(@RequestParam String passport,
                              @RequestParam Integer profession){
        personService.addProfession(passport,profession);
        return "профессия успешно добавлена";
    }

//    /person/add?name=pi&surname=li&passport=99999&profession=2
    @GetMapping("/add")
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
//@GetMapping("/get")
//    public void getByProfessions() {
//        personService.getPersonsByProfessions(List.of(1,3));
//    }

}
