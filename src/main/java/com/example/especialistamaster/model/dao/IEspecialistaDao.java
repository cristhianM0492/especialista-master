package com.example.especialistamaster.model.dao;


import com.example.especialistamaster.model.entities.Especialista;
import org.springframework.data.repository.CrudRepository;

public interface IEspecialistaDao extends CrudRepository<Especialista, Long> {
    Especialista findByEmail(String email); //Se crea este metodo para buscar por email
}
