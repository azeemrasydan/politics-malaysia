package com.politics.malaysia.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

public class PersonTest {

    @Test
    void testGetFirstName() {
        Person person = new Person();
        person.setFirstName("John");
        assertEquals("John", person.getFirstName());
    }

    @Test
    void testGetFamilyName() {
        Person person = new Person();
        person.setFamilyName("Doe");
        assertEquals("Doe", person.getFamilyName());
    }

    @Test
    void testSetMiddleName() {
        Person person = new Person();
        person.setMiddleName("James");
        assertEquals("James", person.getMiddleName());
    }

    @Test
    void testSetDateOfBirth() {
        Person person = new Person();
        Date dateOfBirth = new Date();
        person.setDateOfBirth(dateOfBirth);
        assertEquals(dateOfBirth, person.getDateOfBirth());
    }

    @Test
    void testSetSkills() {
        Person person = new Person();

        Skill javaSkill = new Skill();
        javaSkill.setKnownAs("Java");
        Skill jUnitSkill = new Skill();
        jUnitSkill.setKnownAs("JUnit");

        Set<Skill> skills = Set.of(javaSkill, jUnitSkill);
        person.setSkills(skills);
        assertEquals(skills, person.getSkills());
    }
}
