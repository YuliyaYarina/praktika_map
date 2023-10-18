package com.example.probni_demo.controller;

import com.example.probni_demo.domain.Person;
import com.example.probni_demo.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
@GetMapping("/by-profession")
    public String getByProfessions(@RequestParam int profession) {
        final List<Person> personsByProfession = personService.getPersonsByProfession(profession);
//        String forPassport = null;
//
//    for (final Person person : personByProfession) {
//        final String passport = person.getPassport();
//        if (passport.startsWith("4")) {
//            forPassport = "<" + person.getPassport() + ">";
//        }
//    }
//    if (forPassport == null) {
//        throw new RuntimeException("Person not found");
//    }

    final Optional<String> passport = personsByProfession.stream()
            .map(e -> e.getPassport())
            .filter(p-> p.startsWith("4"))
            .map(p -> "<" + p + ">")
//            .collect(Collectors.toList());
            .findAny()
            ;


    return passport.orElseThrow(() -> new RuntimeException("Person not found"));
    }

}
