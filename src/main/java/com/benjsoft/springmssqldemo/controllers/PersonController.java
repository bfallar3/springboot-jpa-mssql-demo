package com.benjsoft.springmssqldemo.controllers;

import com.benjsoft.springmssqldemo.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.benjsoft.springmssqldemo.repo.PersonRepository;

import java.util.List;

@RestController
public class PersonController {

   @Autowired
   private PersonRepository personRepository;

   @GetMapping("/persons")
   public List<Person> getAllPersons() {
      return personRepository.findAll();
   }
}
