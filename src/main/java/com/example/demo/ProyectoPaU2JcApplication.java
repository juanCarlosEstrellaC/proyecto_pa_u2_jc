package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.onetoone.modelo.Automovil;
import com.example.demo.uce.onetoone.modelo.Matricula;
import com.example.demo.uce.onetoone.service.IAutomovilService;


@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{

		
	@Autowired
	private IAutomovilService iAutomovilService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Creo un automovil con cascade para que guarde la relación de matricula también.
		Automovil miAuto = new Automovil();
		miAuto.setMarca("Chevi");
		miAuto.setModelo("Carvallo");
		miAuto.setModelo("1988");
		miAuto.setPrecio(new BigDecimal(23000));
			Matricula miMatricula= new Matricula();
			miMatricula.setFechaMatricula(LocalDateTime.now());
			miMatricula.setValor(new BigDecimal(255));
			miMatricula.setAutomovilEnMatricula(miAuto);
		miAuto.setMatriculaEnAutomovil(miMatricula);
		
		//this.iAutomovilService.guardar(miAuto);
		
		// buscar:
		//Automovil carrito = this.iAutomovilService.encontrar(2);
		//System.out.println(carrito);
		
		// actualizar:
		//carrito.setMarca("Nissan");
		//this.iAutomovilService.actualizar(carrito);
		
		// borrar:
		this.iAutomovilService.eliminar(2);
	}
}



