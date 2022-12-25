package com.politics.malaysia.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "known_as", nullable = false, unique = false, columnDefinition = "VARCHAR")
    private String knownAs;

    @ManyToMany(mappedBy = "skills")
    private Set<Person> people;

    public String getKnownAs(){
        return this.knownAs;
    }
    public void setKnownAs(String knownAs){
        this.knownAs = knownAs;
    }
}