package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
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
		
		
		this.estudianteService.agregar(estu);
	
		//this.estudianteService.modificar(estu);  // el objeto estu debe tener seteado de ley el el id, para q funcione el metodo modificar. Porcia.
		
		//this.estudianteService.buscar(2);
	
		//this.estudianteService.borrar(2);
		//this.estudianteService.borrar(3);;

		
	}

}
