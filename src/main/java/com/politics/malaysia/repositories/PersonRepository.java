package com.politics.malaysia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.politics.malaysia.entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
