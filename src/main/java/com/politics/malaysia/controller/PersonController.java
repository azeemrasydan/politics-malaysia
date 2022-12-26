package com.politics.malaysia.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.politics.malaysia.entity.Person;
import com.politics.malaysia.services.PersonService;

@RestController
public class PersonController {

    private Logger _logger = LogManager.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Person>> getPersons() {
        _logger.info("/persons");
        Iterable<Person> persons = personService.getAll();
        return new ResponseEntity<Iterable<Person>>(persons, HttpStatus.OK);
    }


}
