package com.practica.dao;

import org.springframework.data.repository.CrudRepository;
import com.practica.entidades.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
}