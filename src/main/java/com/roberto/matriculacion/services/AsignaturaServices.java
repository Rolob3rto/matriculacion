package com.roberto.matriculacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberto.matriculacion.model.Asignatura;
import com.roberto.matriculacion.repositories.AsignaturaRepository;

@Service
public class AsignaturaServices {
    

    @Autowired
    AsignaturaRepository repository;

    public List<Asignatura> findAll(){
        return repository.findAll();
    }

    public Asignatura findById(String codigo){
        Optional<Asignatura> findById = repository.findById(codigo);
        if(findById != null){
            return findById.get();
        } 
        return null;    
    }

    public void save(Asignatura asignatura){
        repository.save(asignatura);
    }

    public void update(String codigo,Asignatura asignatura){
        this.findById(codigo);
        asignatura.setCodigo(codigo);
        repository.save(asignatura);
    }

    public void delete(String codigo){
        repository.deleteById(codigo);
    }


}
