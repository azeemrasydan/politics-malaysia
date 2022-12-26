package com.politics.malaysia.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "knowledge")
public class Knowledge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "knownAs", nullable = false, unique = false)
    private String knownAs;

    public void setKnownAs(String knownAs){
        this.knownAs = knownAs;
    }

    public String getKnownAs(){
        return this.knownAs;
    }

}
