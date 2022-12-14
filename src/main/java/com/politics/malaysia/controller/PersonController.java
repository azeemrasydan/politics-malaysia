package com.politics.malaysia.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.politics.malaysia.entity.Person;

@RestController
public class PersonController {

    private Logger _logger = LogManager.getLogger(PersonController.class);

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Person>> list() {
        _logger.info("Hit persons api");

        Person azira = new Person();
        azira.setFirstName("Azira");
        azira.setFamilyName("Kamaruz");
        azira.setDateOfBirth(new Date(1999));

        Person amir = new Person();
        amir.setFirstName("Amir");
        amir.setFamilyName("Hafiz");

        List<Person> persons = Arrays.asList(azira, amir);
        return new ResponseEntity<Iterable<Person>>(persons, HttpStatus.OK);
    }

}
