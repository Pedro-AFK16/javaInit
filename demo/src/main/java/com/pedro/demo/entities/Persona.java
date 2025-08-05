package com.pedro.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String ubication;
    String position;
    String fullName;
    String image;

    public Persona(Long id, String ubication, String position, String fullName, String image) {
        this.id = id;
        this.ubication = ubication;
        this.position = position;
        this.fullName = fullName;
        this.image = image;
    }

    public Persona(){
    }
    

    
}
