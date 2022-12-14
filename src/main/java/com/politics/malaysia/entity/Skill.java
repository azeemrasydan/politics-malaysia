package com.politics.malaysia.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "known_as", nullable = false, unique = false)
    private String knownAs;

    @ManyToMany(mappedBy = "possessSkills")
    Set<Person> possessedBy;
}