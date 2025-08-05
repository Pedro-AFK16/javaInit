package com.pedro.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.demo.entities.Persona;
import com.pedro.demo.repositories.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepo;

    public Persona crearPersona(Persona persona){
        return personaRepo.save(persona);
    }

    public List<Persona> listarPersonas(){
        return personaRepo.findAll();
    }

    public void borrarPersona(Long id){
        personaRepo.deleteById(id);
    }

    public Persona buscarPersona(Long id){
        return personaRepo.findById(id).get();
    }

    public void modificarPersona(Persona persona){
        personaRepo.save(persona);
    }
    
}
