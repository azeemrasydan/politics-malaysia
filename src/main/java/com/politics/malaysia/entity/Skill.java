package com.politics.malaysia.entity;

import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.*;

@Entity
@Table(name = "skills")
public class Skill {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "known_as", nullable = false, unique = false, columnDefinition = "VARCHAR")
    private String knownAs;

    @ManyToMany(mappedBy = "skills")
    private Set<Person> people;

    public void setKnownAs(String knownAs){
        this.knownAs = knownAs;
    }
}