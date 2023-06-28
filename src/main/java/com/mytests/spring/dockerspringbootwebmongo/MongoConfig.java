package com.mytests.spring.dockerspringbootwebmongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = PersonRepository.class)
@Configuration
public class MongoConfig {
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository userRepository) {
        return strings -> {
            userRepository.save(new Person(1, "Ivan", "Ivanov", 18));
            userRepository.save(new Person(2, "Petr", "Petrov", 15));
            userRepository.save(new Person(3, "Andrey", "Andreev", 25));
            userRepository.save(new Person(4, "Semen", "Semenov", 30));
            userRepository.save(new Person(5, "Pavel", "Pavlov", 60));
        };
    }
}