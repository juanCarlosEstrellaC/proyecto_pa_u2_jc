package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;

@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{

//	@Autowired
//	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Subida proyecto
		
		
		
		
		
		
		
		
		
		
		
//	// Ejemplo 1: ingreso unicamente ciudadano, con empleado en cascada:
//		
//		// 1. Creo un ciudadano
//		Ciudadano ciu1 = new Ciudadano();
//		ciu1.setNombre("Julian");
//		ciu1.setApellido("Alvarez");
//			
//			// 1.2. Creo un empleado
//			Empleado empl1 = new Empleado();
//			empl1.setSalario(new BigDecimal(4000));
//			empl1.setFechaIngreso(LocalDateTime.now());
//			empl1.setCiudadano(ciu1);
//			
//		// y seteo el empleado con el creado anteriormente (sigue siendo el paso 1).
//		ciu1.setEmpleado(empl1);		
//		
//		// 2. Inserto en la DB solo el ciudadano, y como está en cascada, se ingresará también el empleado,
//		//    sin necesidad de llamar a un "this.empleadoService.guardar(empl1)".
//		this.ciudadanoService.guardar(ciu1);
		
	// Ejemplo 2: ingreso unicamente empleado, con ciudadano en cascada:
		
		// 1. Creo un Empleado
		Empleado empl2 = new Empleado();
		empl2.setSalario(new BigDecimal(7));
		empl2.setFechaIngreso(LocalDateTime.now());
			
			//1.2. Creo un ciudadano
			Ciudadano ciu2 = new Ciudadano();
			ciu2.setNombre("dfhgjk");
			ciu2.setApellido("abc");
			ciu2.setEmpleado(empl2); 
			
		// y Seteo el ciudadano con el creado anteriormente (sigue siendo el paso 1).
		empl2.setCiudadano(ciu2);
		
		// 2. Inserto en la DB solo el empleado, y como está en cascada, se ingresará también el ciudadano,
		//    sin necesidad de llamar a un "this.ciudadanoService.guardar(ciu1)".
		this.empleadoService.guardar(empl2);
		
	}
	
}