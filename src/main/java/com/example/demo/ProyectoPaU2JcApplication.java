package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
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
		this.estudianteService.agregar(estu);

		
		Ciudadano ciu = new Ciudadano();
		ciu.setNombre("Juan");
		ciu.setApellido("Estrella");
		
		Empleado empl = new Empleado();
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setCiudadano(ciu);
		
		ciu.setEmpleado(empl);
		
		this.ciudadanoService.guardar(ciu);
	}

}
