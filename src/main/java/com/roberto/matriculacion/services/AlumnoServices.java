package com.roberto.matriculacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberto.matriculacion.model.Alumno;
import com.roberto.matriculacion.repositories.AlumnoRepository;

@Service
public class AlumnoServices {
    

    @Autowired
    AlumnoRepository repository;

    public List<Alumno> findAll(){
        return repository.findAll();
    }

    public Alumno findById(int codigo){
        Optional<Alumno> findById = repository.findById(codigo);
        if(findById != null){
            return findById.get();
        } 
        return null;    
    }

    public void save(Alumno alumno){
        repository.save(alumno);
    }

    public void update(int codigo,Alumno alumno){
        this.findById(codigo);
        alumno.setCodigo(codigo);
        repository.save(alumno);
    }

    public void delete(int codigo){
        repository.deleteById(codigo);
    }


}
