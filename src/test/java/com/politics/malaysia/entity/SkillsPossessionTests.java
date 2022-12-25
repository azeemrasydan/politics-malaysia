package com.politics.malaysia.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SkillsPossessionTest {

  @Test
  void testSetPerson() {
    // Create a new SkillsPossession object
    SkillsPossession skillsPossession = new SkillsPossession();

    // Create a new Person object
    Person person = new Person();

    // Set the person for the SkillsPossession object
    skillsPossession.setPerson(person);

    // Get the person from the SkillsPossession object and check that it is the same as the one we set
    assertEquals(person, skillsPossession.getPerson());
  }

  @Test
  public void testSetSkill() {
    // Create a new SkillsPossession object
    SkillsPossession skillsPossession = new SkillsPossession();

    // Create a new Skill object
    Skill skill = new Skill();

    // Set the skill for the SkillsPossession object
    skillsPossession.setSkill(skill);

    // Get the skill from the SkillsPossession object and check that it is the same as the one we set
    assertEquals(skill, skillsPossession.getSkill());
  }
}