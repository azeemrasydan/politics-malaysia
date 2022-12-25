package com.politics.malaysia.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.StreamSupport;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.politics.malaysia.entity.Person;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class PersonRepositoryTest {

    @Autowired
    private PersonRepository repository;

    @Test
    void testSave() {
        Person person = new Person();
        person.setFirstName("John");
        person.setFamilyName("Doe");
        person.setDateOfBirth(new Date(1999));

        Person savedPerson = repository.save(person);
        assertNotNull(savedPerson.getId());
        assertEquals("John", savedPerson.getFirstName());
        assertEquals("Doe", savedPerson.getFamilyName());
        assertEquals(new Date(1999), savedPerson.getDateOfBirth());
    }

    @Test
    void testFindById() {
        Person person = new Person();
        person.setFirstName("Jane");
        person.setFamilyName("Doe");
        person.setDateOfBirth(new Date(2000));

        Person savedPerson = repository.save(person);
        Long id = savedPerson.getId();

        Person foundPerson = repository.findById(id).orElse(null);
        assertNotNull(foundPerson);
        assertEquals("Jane", foundPerson.getFirstName());
        assertEquals("Doe", foundPerson.getFamilyName());
        assertEquals(new Date(2000), foundPerson.getDateOfBirth());
    }

    @Test
    void testFindAll() {
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setFamilyName("Doe");
        person1.setDateOfBirth(new Date(1999));

        Person person2 = new Person();
        person2.setFirstName("Jane");
        person2.setFamilyName("Doe");
        person2.setDateOfBirth(new Date(2000));

        repository.deleteAll();
        repository.saveAll(Arrays.asList(person1, person2));

        Iterable<Person> persons = repository.findAll();
        assertNotNull(persons);
        assertEquals(2, StreamSupport.stream(persons.spliterator(), false).count());
    }
}