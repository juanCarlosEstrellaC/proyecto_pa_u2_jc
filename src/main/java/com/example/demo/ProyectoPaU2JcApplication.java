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
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{

//	@Autowired
//	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService iempleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Ingresar y Actualizar ciudadanos y empleados:
		Ciudadano miCiudadano = new Ciudadano();
		miCiudadano.setNombre("Calqui");
		miCiudadano.setApellido("Roa");
		this.ciudadanoService.guardar(miCiudadano); //

		Empleado miEmpleado = new Empleado();
		miEmpleado.setSalario(new BigDecimal(100));
		miEmpleado.setFechaIngreso(LocalDateTime.now());
		miEmpleado.setCiudadano(miCiudadano);
		this.iempleadoService.guardar(miEmpleado);	//

		
		miCiudadano.setEmpleado(miEmpleado);
		this.ciudadanoService.actualizar(miCiudadano);	//
		this.iempleadoService.actualizar(miEmpleado);	//
		
		//Eliminar Empleado:
		//this.iempleadoService.eliminar(6);
		
		//Buscar un ciudadano, e imprimir su apellido:
		Ciudadano c = this.ciudadanoService.encontrar(2);
		System.out.println(c.getApellido());
		
		//Buscar un empleado, e imprimir su salario:
		Empleado e = this.iempleadoService.encontrar(4);
		System.out.println(e.getSalario());
		

	}
	
}








//Ciudadano ciu = new Ciudadano();
//ciu.setNombre("Juan");
//ciu.setApellido("Estrella");
//
//EMPLEADO empl = new EMPLEADO();
//empl.setSalario(new BigDecimal(20));
//empl.setFechaIngreso(LocalDateTime.now());
//empl.setCiudadano(ciu);
//
//this.iempleadoService.guardar(empl);
//
//ciu.setEmpleado(empl);
//
//this.ciudadanoService.guardar(ciu);

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
