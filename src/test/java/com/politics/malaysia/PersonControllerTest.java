package com.politics.malaysia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.politics.malaysia.controller.PersonController;
import com.politics.malaysia.entity.Person;
import com.politics.malaysia.services.PersonService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PersonControllerTest {

    @Mock
    private PersonService personService;

    @InjectMocks
    private PersonController personController;

    @BeforeEach
    public void setUp(){
        // Set up mock data
        Person person1 = new Person();
        person1.setFirstName("John");

        Person person2 = new Person();
        person2.setFirstName("Jane");

        List<Person> persons = Arrays.asList(person1, person2);

        // Set up mock behavior
        when(personService.getAll()).thenReturn(persons);
    }

    @Test
    public void testGetPersons(){
        // Invoke the method under test
        ResponseEntity<Iterable<Person>> response = personController.getPersons();

        // Verify the results
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2, ((List<Person>)response.getBody()).size());
    }
}
