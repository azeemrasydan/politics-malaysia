package com.politics.malaysia.seeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.politics.malaysia.entity.Person;
import com.politics.malaysia.entity.Skill;
import com.politics.malaysia.entity.SkillsPossession;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class DataSeeder {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void seedData() {
        // Seed data for the Person table
        Person person1 = new Person();
        person1.setFirstName("John");
        entityManager.persist(person1);

        Person person2 = new Person();
        person2.setFirstName("Jane");
        entityManager.persist(person2);

        Person person3 = new Person();
        person3.setFirstName("Bob");
        entityManager.persist(person3);

        Person person4 = new Person();
        person4.setFirstName("Alice");
        entityManager.persist(person4);

        Person person5 = new Person();
        person5.setFirstName("Tom");
        entityManager.persist(person5);

        // Seed data for the Skill table
        Skill skill1 = new Skill();
        skill1.setKnownAs("Java");
        entityManager.persist(skill1);

        Skill skill2 = new Skill();
        skill2.setKnownAs("Python");
        entityManager.persist(skill2);

        Skill skill3 = new Skill();
        skill3.setKnownAs("C++");
        entityManager.persist(skill3);

        Skill skill4 = new Skill();
        skill4.setKnownAs("Ruby");
        entityManager.persist(skill4);

        Skill skill5 = new Skill();
        skill5.setKnownAs("JavaScript");
        entityManager.persist(skill5);

        // Seed data for the SkillsPossession table
        SkillsPossession sp1 = new SkillsPossession();
        sp1.setPerson(person1);
        sp1.setSkill(skill1);
        entityManager.persist(sp1);

        SkillsPossession sp2 = new SkillsPossession();
        sp2.setPerson(person1);
        sp2.setSkill(skill2);
        entityManager.persist(sp2);

        SkillsPossession sp3 = new SkillsPossession();
        sp3.setPerson(person2);
        sp3.setSkill(skill2);
        entityManager.persist(sp3);

        SkillsPossession sp4 = new SkillsPossession();
        sp4.setPerson(person2);
        sp4.setSkill(skill4);
        entityManager.persist(sp4);

        SkillsPossession sp5 = new SkillsPossession();
        sp5.setPerson(person3);
        sp5.setSkill(skill3);
        entityManager.persist(sp5);

        SkillsPossession sp6 = new SkillsPossession();
        sp6.setPerson(person3);
        sp6.setSkill(skill5);
        entityManager.persist(sp6);

        SkillsPossession sp7 = new SkillsPossession();
        sp7.setPerson(person4);
        sp7.setSkill(skill1);
        entityManager.persist(sp7);

    }
}