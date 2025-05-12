package com.example.usssa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PhoneRepository phoneRepository;

    @GetMapping("/save")
    public Person save(@RequestParam String name, @RequestParam int age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return (Person) personRepository.save(person);
    }

    @GetMapping("/by-name")
    public List<Person> findByName(@RequestParam String name) {
        return personRepository.findByName(name);
    }

    @GetMapping("/by-age")
    public List<Person> findByAge(@RequestParam int age) {
        return personRepository.findByAge(age);
    }

    @GetMapping("/by-name-and-age")
    public List<Person> findByNameAndAge(@RequestParam String name, @RequestParam int age) {
        return personRepository.findByNameAndAge(name, age);

    }
}
