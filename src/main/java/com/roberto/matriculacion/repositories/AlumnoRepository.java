package com.roberto.matriculacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberto.matriculacion.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
    
}
