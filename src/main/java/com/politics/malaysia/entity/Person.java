package com.politics.malaysia.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", nullable = false, unique = false)
    private String firstName;

    @Column(name = "family_name", nullable = false, unique = false)
    private String familyName;

    @Column(name = "middle_name", nullable = true, unique = false)
    private String middleName;

    @Column(name = "date_of_birth", nullable = false, unique = false)
    private Date dateOfBirth;

    @ManyToMany
    @JoinTable(name = "skills_possessions", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
    Set<Skill> skills;

    public String getFirstName() {
        return this.firstName;
    }

    public String getFamilyName(){
        return this.familyName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setFamilyName(String name) {
        this.familyName = name;
    }

    public void setMiddleName(String name){
        this.middleName = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
