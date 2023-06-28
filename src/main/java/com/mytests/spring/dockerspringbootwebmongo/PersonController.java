package com.mytests.spring.dockerspringbootwebmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @GetMapping("/users")
    public List<Person> list() {
        return personRepository.findAll();
    }
}