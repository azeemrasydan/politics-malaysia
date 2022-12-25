package com.politics.malaysia.entity;

import javax.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Entity;

@Entity
@Table(name = "skills_possessions")
public class SkillsPossession {
  @jakarta.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @jakarta.persistence.ManyToOne
  @JoinColumn(name = "person_id")
  private Person person;

  @jakarta.persistence.ManyToOne
  @JoinColumn(name = "skill_id")
  private Skill skill;

  // Getters and setters for id, person, and skill
  public void setPerson(Person person) {
    this.person = person;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }
}
