package com.politics.malaysia.services;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.politics.malaysia.entity.Person;
import com.politics.malaysia.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    public void testGetAll() {
        // Set up mock data
        Person person1 = new Person();
        person1.setFirstName("John");

        Person person2 = new Person();
        person2.setFirstName("Jane");

        List<Person> expected = Arrays.asList(person1, person2);

        // Set up mock behavior
        when(personRepository.findAll()).thenReturn(expected);

        // Invoke the method under test
        Iterable<Person> actual = personService.getAll();

        // Verify the results
        assertEquals(expected, actual);
    }

    @Test
    public void testFindOne(){
        // Set up mock data
        Person person = new Person();
        person.setFirstName("Marie");
        Long personId = person.getId();

        Optional<Person> expected = Optional.of(person);

        // Set up mock behavior
        when(personRepository.findById(personId)).thenReturn(expected);

        // Invoke the method under test
        Optional<Person> actual = personService.findOne(personId);

        // Verify the results
        assertEquals(expected, actual);
    }
}