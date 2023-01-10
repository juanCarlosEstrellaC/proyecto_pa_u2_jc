package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IProfesorService profesorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estudiante estu = new Estudiante();
		//estu.setId(3);
		estu.setNombre("Alberto");
		estu.setApellido("Estrella");
		estu.setCedula("1723522403");
		estu.setCiudad("Quito");
		estu.setGenero("M");
		
		// Agregar:
		//this.estudianteService.agregar(estu);
		// Modificar:
		//this.estudianteService.modificar(estu);  // el objeto estu debe tener seteado de ley el el id, para q funcione el metodo modificar. Porcia.
		// Buscar:
		//this.estudianteService.buscar(2);
		// Borrar:
		//this.estudianteService.borrar(2);

		
		Profesor prof = new Profesor();
		prof.setNombre("Edwin");
		prof.setApellido("Cardona");
		prof.setCedula("123549848900");
		prof.setMateria("Medicina");
		//No seteo el id, porque eso lo hace la secuencia
		
		// Agregar:
		//this.profesorService.ingresar(prof);
		// Modificar + buscar:
		//Profesor p = this.profesorService.buscar(1);
		//p.setApellido("Archundia Gil");
		//this.profesorService.actualizar(p);
		// Borrar:
		this.profesorService.borrar(4);
		
	}

}
