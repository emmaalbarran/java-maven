package com.practica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.practica.dao.PersonaRepository;
import com.practica.dao.TelefonoRepository;
import com.practica.entidades.Persona;
import com.practica.entidades.Telefono;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private PersonaRepository personaRepository;
    
    @Autowired
    private TelefonoRepository telefonoRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Persona persona = new Persona();
        persona.setNombre("Emma");
        persona.setEdad(30);
        // Guardar la persona
        persona = personaRepository.save(persona);
        
        Telefono telefono = new Telefono();
        telefono.setNumero("949095546");
        telefono.setPersona(persona);
        telefonoRepository.save(telefono);
        
        System.out.println("Entidades creadas y guardadas.");
    }
}
