package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @GetMapping("/greet")
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse(
                "Hello",
                List.of("Java", "GoLang", "JavaScript"),
                new Person("Saleh", 23, 70_000)
        );
        return response;
    }

    record Person(String name, int age, double netWorth ){

    }

     record GreetResponse(
             String greet,
             List<String> favProgrammingLanguages,
             Person person
     ){
        }
    }






