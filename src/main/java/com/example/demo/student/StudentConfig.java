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
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student yash = new Student(
                    "Yash",
                    "pantyash@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student harsh = new Student(
                    "Harsh",
                    "harsh@gmail.com",
                    LocalDate.of(2006, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(yash,harsh)
            );
        };
    }
}
