package com.roberto.matriculacion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.roberto.matriculacion.model.Alumno;
import com.roberto.matriculacion.model.Asignatura;
import com.roberto.matriculacion.repositories.AlumnoRepository;
import com.roberto.matriculacion.repositories.AsignaturaRepository;

import java.util.*;

@SpringBootTest
class AlumnoRepositoryTests {

	@Autowired
	AlumnoRepository repoAlumno; 
	
	@Autowired
	AsignaturaRepository repoAsignatura; 

	@Test
	void crearalumnosTest() {

		Alumno u1 = new Alumno();
		u1.setCodigo(1);
		u1.setNombre("alumno1");
		

        Alumno u2 = new Alumno();
		u2.setCodigo(2);
		u2.setNombre("alumno2");
		

        Alumno u3 = new Alumno();
		u3.setCodigo(3);
		u3.setNombre("alumno3");
		

		Asignatura a1 = new Asignatura();
		a1.setCodigo("MAT");
		a1.setDescripcion("Matemáticas");
		repoAsignatura.save(a1);

		Asignatura a2 = new Asignatura();
		a2.setCodigo("LEN");
		a2.setDescripcion("Lengua");
		repoAsignatura.save(a2);

		Asignatura a3 = new Asignatura();
		a3.setCodigo("ING");
		a3.setDescripcion("Inglés");
		repoAsignatura.save(a3);

		Asignatura a4 = new Asignatura();
		a4.setCodigo("REL");
		a4.setDescripcion("Religión");
		repoAsignatura.save(a4);

		Asignatura a5 = new Asignatura();
		a5.setCodigo("FIS");
		a5.setDescripcion("Física");
		repoAsignatura.save(a5);

		Asignatura a6 = new Asignatura();
		a6.setCodigo("QUI");
		a6.setDescripcion("Química");
		repoAsignatura.save(a6);

		List<Asignatura> asignaturaAlumno1 = new ArrayList<Asignatura>();
		asignaturaAlumno1.add(a1);
		asignaturaAlumno1.add(a2);
		asignaturaAlumno1.add(a3);

		List<Asignatura> asignaturaAlumno2 = new ArrayList<Asignatura>();
		asignaturaAlumno2.add(a3);
		asignaturaAlumno2.add(a4);
		asignaturaAlumno2.add(a1);

		u1.setAsignaturas(asignaturaAlumno1);
		u2.setAsignaturas(asignaturaAlumno2);


		Alumno u1OK = repoAlumno.save(u1);
		Alumno u2OK = repoAlumno.save(u2);
		Alumno u3OK = repoAlumno.save(u3);

		assertTrue(a6.getDescripcion().equalsIgnoreCase("QUI"));
	}

}
