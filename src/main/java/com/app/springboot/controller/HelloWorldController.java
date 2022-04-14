package com.app.springboot.controller;

import com.app.springboot.model.Person;
import com.app.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Công đẹp trai hihu";
    }

    @Autowired
    private PersonService service;

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getData(){
        return new ResponseEntity<>(service.listPerson(),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Person> add(@RequestBody Person person){
        return new ResponseEntity<>(service.savePerson(person),HttpStatus.OK);
    }
}
