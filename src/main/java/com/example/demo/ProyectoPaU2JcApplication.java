package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Cliente2;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.service.IVehiculoService;


@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Set<Cliente2> conjuntoClientes = new HashSet<Cliente2>();
		Set<Vehiculo> conjuntoVehiculos = new HashSet<Vehiculo>();

		
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Ford");
		v1.setColor("Rojo");
		v1.setPlaca("AAA-123");
		v1.setPrecio(new BigDecimal(100));
		v1.setMisClientes(conjuntoClientes);	

		
		Vehiculo v2 = new Vehiculo();
		v2.setMarca("Toyota");
		v2.setColor("Verde");
		v2.setPlaca("JJJ-123");
		v2.setPrecio(new BigDecimal(100));
		v2.setMisClientes(conjuntoClientes);	

		
		Vehiculo v3 = new Vehiculo();
		v3.setMarca("BMW");
		v3.setColor("Amarillo");
		v3.setPlaca("AAA-123");
		v3.setPrecio(new BigDecimal(100));
		v3.setMisClientes(conjuntoClientes);	

		
		Vehiculo v4 = new Vehiculo();
		v4.setMarca("Mercedes");
		v4.setColor("Rosado");
		v4.setPlaca("JJJ-123");
		v4.setPrecio(new BigDecimal(100));
		v4.setMisClientes(conjuntoClientes);	

		
		Vehiculo v5 = new Vehiculo();
		v5.setMarca("Global");
		v5.setColor("Plateado");
		v5.setPlaca("JJJ-123");
		v5.setPrecio(new BigDecimal(100));
		v5.setMisClientes(conjuntoClientes);	

		
		//_____________________________________________________________
		
		Cliente2 cl1 = new Cliente2();	
		cl1.setNombre("Ramiro");
		cl1.setApellido("Carrera");
		cl1.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
		cl1.setCedula("1725352458");
		cl1.setMisVehiculos(conjuntoVehiculos);

		
		Cliente2 cl2 = new Cliente2();	
		cl2.setNombre("Juan");
		cl2.setApellido("Arteaga");
		cl2.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
		cl2.setCedula("0225352458");
		cl2.setMisVehiculos(conjuntoVehiculos);

		Cliente2 cl3 = new Cliente2();	
		cl3.setNombre("Renato");
		cl3.setApellido("Coloma");
		cl3.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
		cl3.setCedula("0225352458");
		cl3.setMisVehiculos(conjuntoVehiculos);


		
		//------------------------------------------------------------
		
		
		conjuntoClientes.add(cl1);
		conjuntoClientes.add(cl3);
		conjuntoClientes.add(cl2);
		
	
		
		//conjuntoVehiculos.add(v1);
		//conjuntoVehiculos.add(v5);
		
		
		//v3.setMisClientes(conjuntoClientes);	

		//cl1.setMisVehiculos(conjuntoVehiculos);

		this.iVehiculoService.guardar(v2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Vehiculo v1 = new Vehiculo();
//		v1.setMarca("Ford");
//		v1.setColor("Rojo");
//		v1.setPlaca("AAA-123");
//		v1.setPrecio(new BigDecimal(100));
//		Set<Cliente2> conjuntoClientesV1 = new HashSet<Cliente2>();
//		v1.setMisClientes(conjuntoClientesV1);
//		
//		Vehiculo v2 = new Vehiculo();
//		v2.setMarca("Toyota");
//		v2.setColor("Rojo");
//		v2.setPlaca("AAA-123");
//		v2.setPrecio(new BigDecimal(100));
//		Set<Cliente2> conjuntoClientesV2 = new HashSet<Cliente2>();
//		v2.setMisClientes(conjuntoClientesV2);
//		
//		
//		
//		Cliente2 cl1 = new Cliente2();	
//		cl1.setNombre("Ramiro");
//		cl1.setApellido("Carrera");
//		cl1.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
//		cl1.setCedula("1725352458");
//		Set<Vehiculo> conjuntoVehiculosCL1 = new HashSet<Vehiculo>();
//		cl1.setMisVehiculos(conjuntoVehiculosCL1);
//		
//		Cliente2 cl2 = new Cliente2();	
//		cl2.setNombre("Juan");
//		cl2.setApellido("Arteaga");
//		cl2.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
//		cl2.setCedula("1725352458");
//		Set<Vehiculo> conjuntoVehiculosCL2 = new HashSet<Vehiculo>();
//		cl2.setMisVehiculos(conjuntoVehiculosCL2);
//		
//		Cliente2 cl3 = new Cliente2();	
//		cl3.setNombre("Maria");
//		cl3.setApellido("Josefa");
//		cl3.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
//		cl3.setCedula("1725352458");
//		Set<Vehiculo> conjuntoVehiculosCL3 = new HashSet<Vehiculo>();
//		cl3.setMisVehiculos(conjuntoVehiculosCL3);
//		
//		Cliente2 cl4 = new Cliente2();	
//		cl4.setNombre("Yovani");
//		cl4.setApellido("Hurttado");
//		cl4.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
//		cl4.setCedula("1725352458");
//		Set<Vehiculo> conjuntoVehiculosCL4 = new HashSet<Vehiculo>();
//		cl4.setMisVehiculos(conjuntoVehiculosCL4);
//
//		Cliente2 cl5 = new Cliente2();	
//		cl5.setNombre("Bernart");
//		cl5.setApellido("Jaer");
//		cl5.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
//		cl5.setCedula("1725352458");
//		Set<Vehiculo> conjuntoVehiculosCL5 = new HashSet<Vehiculo>();
//		cl5.setMisVehiculos(conjuntoVehiculosCL5);
//		
//		
//		conjuntoClientesV1.add(cl1);
//		conjuntoClientesV1.add(cl2);
//		
////		this.iVehiculoService.guardar(v1);
//		
//		conjuntoClientesV2.add(cl5);
//		this.iVehiculoService.actualizar(v2);

		
		
		
//		Set<Cliente2> conjuntoClientes = new HashSet<Cliente2>();
//		Set<Vehiculo> conjuntoVehiculos = new HashSet<Vehiculo>();
//
//		Vehiculo v1 = new Vehiculo();
//		v1.setMarca("Ford");
//		v1.setColor("Rojo");
//		v1.setPlaca("AAA-123");
//		v1.setPrecio(new BigDecimal(100));
//		v1.setMisClientes(conjuntoClientes);
//		
//		
//		Cliente2 cl1 = new Cliente2();	
//		cl1.setNombre("Ramiro");
//		cl1.setApellido("Carrera");
//		cl1.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
//		cl1.setCedula("1725352458");
//		cl1.setMisVehiculos(conjuntoVehiculos);
//		
//		
//		conjuntoVehiculos.add(v1);
//		conjuntoClientes.add(cl1);
//		
//		// Un nuevo vehículo rentado por Cl1
//		Vehiculo v2 = new Vehiculo();
//		//Set<Cliente2> conjuntoClientesV2 = new HashSet<Cliente2>();
//		v2.setMarca("Chevy");
//		v2.setColor("Verde");
//		v2.setPlaca("BBB-123");
//		v2.setPrecio(new BigDecimal(80));
//		v2.setMisClientes(conjuntoClientes);
//		
//		conjuntoVehiculos.add(v2);	
//		//conjuntoClientesV1.add(cl1);
//
//		this.iVehiculoService.guardar(v2);
	}
}


//Set<Libro> conjuntoLibros = new HashSet<Libro>();
//Set<Autor> conjuntoAutores = new HashSet<Autor>();
//
//
//Autor ew = new Autor();
//ew.setNombre("ew");
//
//	Libro pWeb= new Libro();
//	pWeb.setNombre("pWeb");
//	pWeb.setEditorial("Editorial 1");
//	pWeb.setAutores(conjuntoAutores);
//	conjuntoLibros.add(pWeb);
//	
//	Libro redes= new Libro();
//	redes.setNombre("redes");
//	redes.setEditorial("Editorial 1");
//	redes.setAutores(conjuntoAutores);
//	conjuntoLibros.add(redes);
//	
//ew.setLibros(conjuntoLibros);
//conjuntoAutores.add(ew);
//
//
//
//this.iAutorService.guardar(ew);
//// Creo un edificio 
//Edificio miEdificio = new Edificio();
//miEdificio.setNombre("Jipijapa");
//miEdificio.setDireccion("Avenida Ratatuille, OE 123");
//miEdificio.setFechaInaguracion(LocalDateTime.now());
//
//	//Creo una lista de departamentos:
//	List<Departamento> listaDep = new ArrayList<Departamento>();
//	
//	//Creo departamentos
//	Departamento d1 = new Departamento();
//	d1.setNumero("1");
//	d1.setValorComercial(new BigDecimal(20000));
//	d1.setEdificio(miEdificio);
//	listaDep.add(d1);
//	
//	Departamento d2 = new Departamento();
//	d2.setNumero("2");
//	d2.setValorComercial(new BigDecimal(100));
//	d2.setEdificio(miEdificio);
//	listaDep.add(d2);
//	
//	Departamento d3 = new Departamento();
//	d3.setNumero("3");
//	d3.setValorComercial(new BigDecimal(4440000));
//	d3.setEdificio(miEdificio);
//	listaDep.add(d3);
//	
//miEdificio.setListaDepartamentos(listaDep);
//
//
////Crear Edificio:
////this.iEdificioService.guardar(miEdificio);
//
////Busco Edificio:
//Edificio edif = this.iEdificioService.encontrar(2);
//
////Actualizo Edificio:
////edif.setNombre("SinTarrel");
////this.iEdificioService.actualizar(edif);
//
////Borrar
////this.iEdificioService.eliminar(1);
//
//
//
//for (Departamento departamento : edif.getListaDepartamentos()) {
//	System.out.println(departamento);
//}
//
//
