package com.app.springboot.controller;

import com.app.springboot.model.Person;
import com.app.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "22";
    }

    @Autowired
    private PersonService service;

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getData(){
        return new ResponseEntity<>(service.listPerson(),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Person> add(){
        Person person = new Person();
        person.setAge(10);
        person.setName("Cong");
        List<String> list = new ArrayList<>();
        list.add("bo");
        list.add("me");
        list.add("chi");
        list.add("anh");
        person.setContactIds(list);
        return new ResponseEntity<>(service.savePerson(person),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<List<Person>> create(){
        Person person = new Person();
        person.setName("oke");
        person.setAge(10);
        service.savePerson(person);
        return new ResponseEntity<>(service.listPerson(),HttpStatus.OK);
    }

}
