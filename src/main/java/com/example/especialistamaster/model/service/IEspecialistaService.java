package com.example.especialistamaster.model.service;



import com.example.especialistamaster.model.entities.Especialista;

import java.util.List;

public interface IEspecialistaService {
    Especialista save (Especialista especialista);
    void delete( Especialista especialista);
    Especialista update( Especialista especialista);
    List< Especialista> findAll();
    Especialista findById(Long id);
}
