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

import com.roberto.matriculacion.model.Alumno;
import com.roberto.matriculacion.services.AlumnoServices;



@RestController
public class AlumnoController {
    
    @Autowired
    AlumnoServices alumnoServices;

    @GetMapping("/alumno")
    List<Alumno> all(){
        return alumnoServices.findAll();
    }

    @GetMapping("/alumno/{id}")
    Alumno findAlumno(@PathVariable int id){
        return alumnoServices.findById(id);
    }

    @DeleteMapping("/alumno/{id}")
    void deleteAlumno(@PathVariable int id){
        alumnoServices.delete(id);
    }

    @PostMapping("/alumno")
    Alumno guardar(@RequestBody Alumno alumno){
        alumnoServices.save(alumno);

        return alumno;
    }

    @PutMapping("/alumno/{id}")
    void actualizar(@PathVariable int id, @RequestBody Alumno alumno){
        alumnoServices.update(id, alumno);
    }

    
}
