package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.onetomany.modelo.Departamento;
import com.example.demo.uce.onetomany.modelo.Edificio;
import com.example.demo.uce.onetomany.service.IEdificioService;
import com.example.demo.uce.onetoone.modelo.Automovil;
import com.example.demo.uce.onetoone.modelo.Matricula;
import com.example.demo.uce.onetoone.service.IAutomovilService;


@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{
	
	@Autowired
	private IEdificioService iEdificioService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Creo un edificio 
		Edificio miEdificio = new Edificio();
		miEdificio.setNombre("Jipijapa");
		miEdificio.setDireccion("Avenida Ratatuille, OE 123");
		miEdificio.setFechaInaguracion(LocalDateTime.now());
		
			//Creo una lista de departamentos:
			List<Departamento> listaDep = new ArrayList<Departamento>();
			
			//Creo departamentos
			Departamento d1 = new Departamento();
			d1.setNumero("1");
			d1.setValorComercial(new BigDecimal(20000));
			d1.setEdificio(miEdificio);
			listaDep.add(d1);
			
			Departamento d2 = new Departamento();
			d2.setNumero("2");
			d2.setValorComercial(new BigDecimal(100));
			d2.setEdificio(miEdificio);
			listaDep.add(d2);
			
			Departamento d3 = new Departamento();
			d3.setNumero("3");
			d3.setValorComercial(new BigDecimal(4440000));
			d3.setEdificio(miEdificio);
			listaDep.add(d3);
			
		miEdificio.setListaDepartamentos(listaDep);
		
		
		//Crear Edificio:
		//this.iEdificioService.guardar(miEdificio);
		
		//Busco Edificio:
		Edificio edif = this.iEdificioService.encontrar(2);
		
		//Actualizo Edificio:
//		edif.setNombre("SinTarrel");
//		this.iEdificioService.actualizar(edif);
		
		//Borrar
		//this.iEdificioService.eliminar(1);
		
		
		
		for (Departamento departamento : edif.getListaDepartamentos()) {
			System.out.println(departamento);
		}
		
		
	}
}



