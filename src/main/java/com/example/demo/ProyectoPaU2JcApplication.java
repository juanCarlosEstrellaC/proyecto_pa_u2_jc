package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.EMPLEADO;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEMPLEADOService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{

//	@Autowired
//	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEMPLEADOService iempleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
//		Ciudadano ciu = new Ciudadano();
//		ciu.setNombre("Juan");
//		ciu.setApellido("Estrella");
//		
//		EMPLEADO empl = new EMPLEADO();
//		empl.setSalario(new BigDecimal(20));
//		empl.setFechaIngreso(LocalDateTime.now());
//		empl.setCiudadano(ciu);
//		
//		this.iempleadoService.guardar(empl);
//		
//		ciu.setEmpleado(empl);
//		
//		this.ciudadanoService.guardar(ciu);
		
		Ciudadano ciu = new Ciudadano();
		ciu.setNombre("Juan");
		ciu.setApellido("Estrella");
		this.ciudadanoService.guardar(ciu);

		EMPLEADO empl = new EMPLEADO();
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setCiudadano(ciu);
		this.iempleadoService.guardar(empl);

		
		ciu.setEmpleado(empl);
		this.iempleadoService.actualizar(empl);
		
	}
	
	/*Estudiante estu = new Estudiante();
	//estu.setId(3);
	estu.setNombre("Alberto");
	estu.setApellido("Estrella");
	estu.setCedula("1723522403");
	estu.setCiudad("Quito");
	estu.setGenero("M");
	
	// Agregar:
	//this.estudianteService.agregar(estu);
	
	 */	
}
