package com.app.springboot.service;

import com.app.springboot.model.Person;
import com.app.springboot.repository.PersonRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRep rep;

    public Person savePerson(Person person){
        return rep.save(person);
    }

    public List<Person> listPerson(){
        return rep.findAll();
    }

}
