package com.politics.malaysia.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "skills_possessions")
public class SkillsPossession {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "person_id")
  private Person person;

  @ManyToOne
  @JoinColumn(name = "skill_id")
  private Skill skill;

  // Getters and setters for id, person, and skill

  public Skill getSkill() {
    return this.skill;
  }

  public Person getPerson() {
    return this.person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }
}
