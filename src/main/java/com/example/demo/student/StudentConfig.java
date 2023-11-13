package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig  {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mary = new Student(
                    "Mary",
                    "mary@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 22)
            );

            Student cristina = new Student(
                    "Cristina",
                    "cristina@gmail.com",
                    LocalDate.of(1955, Month.DECEMBER, 11)
            );
            repository.saveAll(
                    List.of(mary, cristina)
            );
        };
    }
}
