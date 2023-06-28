package com.mytests.spring.dockerspringbootwebmongo;

import org.springframework.data.mongodb.repository.*;
public interface PersonRepository extends MongoRepository<Person, Integer> {
}