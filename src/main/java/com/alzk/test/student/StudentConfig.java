package com.alzk.test.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yo_bro = new Student(
                    "Yo Bro",
                    LocalDate.of(1937, DECEMBER, 22),
                    "yomanhaha@outlook.com");
            Student yo_man = new Student(
                    "Yo Man",
                    LocalDate.of(1937, NOVEMBER, 22),
                    "yomanhaha@outlook.com");
            repository.saveAll(
                    List.of(yo_man, yo_bro)
            );
//            repository.deleteAll();
        };
    }
}
