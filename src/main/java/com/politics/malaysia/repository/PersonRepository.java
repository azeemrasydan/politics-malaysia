package com.politics.malaysia.repository;

import org.springframework.data.repository.CrudRepository;

import com.politics.malaysia.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
