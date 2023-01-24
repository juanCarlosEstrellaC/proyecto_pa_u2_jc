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
		
		
		
		
		
		
		
		
		
		
		
//	// Ejemplo 1: ingreso un ciudadano, con empleado:
//		
//		// 1ro. Creo un ciudadano
//		Ciudadano ciu1 = new Ciudadano();
//		ciu1.setNombre("AAA");
//		ciu1.setApellido("Roman");
//			
//		// 2do. Creo un empleado
//			Empleado empl1 = new Empleado();
//			empl1.setSalario(new BigDecimal(20));
//			empl1.setFechaIngreso(LocalDateTime.now());
//			empl1.setCiudadano(ciu1);
//			
//		// 3ro. Ingreso el empleado con el creado anteriormente.
//		ciu1.setEmpleado(empl1);		
//		
//		this.ciudadanoService.guardar(ciu1);
		
//	// Ejemplo 2: ingreso un empleado, con ciudadano 2:
//		
//		// 1ro. Creo un Empleado
//		Empleado empl2 = new Empleado();
//		empl2.setSalario(new BigDecimal(7));
//		empl2.setFechaIngreso(LocalDateTime.now());
//			
//		//2do. Creo un ciudadano
//			Ciudadano ciu2 = new Ciudadano();
//			ciu2.setNombre("dfhgjk");
//			ciu2.setApellido("abc");
//			ciu2.setEmpleado(empl2); //**************????????????? va, creo q si
//			
//		// 3ro. Ingreso el ciudadano con el creado anteriormente.
//		empl2.setCiudadano(ciu2);
//		
//		// 4to: Guardo el empleado
//		this.empleadoService.guardar(empl2);
		
	}
	
}