package com.politics.malaysia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.politics.malaysia.entity.Person;
import com.politics.malaysia.repositories.PersonRepository;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Iterable<Person> getAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findOne(Long id){
        return  personRepository.findById(id);
    }

}
