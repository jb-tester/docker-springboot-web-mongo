package com.mytests.spring.dockerspringbootwebmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    private Environment environment;

    @GetMapping("/users")
    public List<Person> list() {
        System.out.println(environment.getProperty("local.server.port"));
        System.out.println(environment.getProperty("spring.data.mongodb.uri"));
        return personRepository.findAll();
    }
}