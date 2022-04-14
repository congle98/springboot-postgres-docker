package com.app.springboot.repository;

import com.app.springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRep extends JpaRepository<Person,Long> {
}
