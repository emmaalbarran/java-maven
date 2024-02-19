package com.practica.dao;

import org.springframework.data.repository.CrudRepository;
import com.practica.entidades.Telefono;

public interface TelefonoRepository extends CrudRepository<Telefono, Long> {
}