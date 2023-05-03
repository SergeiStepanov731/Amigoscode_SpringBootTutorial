package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jim = new Student("Jim Smith", "jim@gmail.com", LocalDate.of(2000, Month.AUGUST, 7));
            Student michal = new Student("Michal", "scott@gmail.com", LocalDate.of(1976, Month.SEPTEMBER, 13));

            repository.saveAll(
                    List.of(jim, michal)
            );
        };
    }
}
