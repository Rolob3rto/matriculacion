package com.roberto.matriculacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberto.matriculacion.model.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, String>{
    
}
