package com.roberto.matriculacion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roberto.matriculacion.model.Asignatura;
import com.roberto.matriculacion.services.AsignaturaServices;



@RestController
public class AsignaturaController {
    
    @Autowired
    AsignaturaServices asignaturaServices;

    @GetMapping("/asignatura")
    List<Asignatura> all(){
        return asignaturaServices.findAll();
    }

    @GetMapping("/asignatura/{id}")
    Asignatura findAsignatura(@PathVariable String id){
        return asignaturaServices.findById(id);
    }

    @DeleteMapping("/asignatura/{id}")
    void deleteAsignatura(@PathVariable String id){
        asignaturaServices.delete(id);
    }

    @PostMapping("/asignatura")
    Asignatura guardar(@RequestBody Asignatura asignatura){
        asignaturaServices.save(asignatura);

        return asignatura;
    }

    @PutMapping("/asignatura/{id}")
    void actualizar(@PathVariable String id, @RequestBody Asignatura asignatura){
        asignaturaServices.update(id, asignatura);
    }

    
}
