package com.pedro.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.pedro.demo.entities.Persona;
import com.pedro.demo.services.PersonaService;

import jakarta.annotation.PostConstruct;

@RestController
public class PersonaController {
    
    @Autowired
    PersonaService personaService;

    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersonas(){
        return personaService.listarPersonas();
    }

    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona){
        return personaService.crearPersona(persona);
    }

    @DeleteMapping("/persona/{id}")
    public void eliminarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
    }

    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id){
        return personaService.buscarPersona(id);
    }

    @PutMapping("/persona)")
    public void modificarPersona(@RequestBody Persona persona){
        personaService.modificarPersona(persona);
    }
}
