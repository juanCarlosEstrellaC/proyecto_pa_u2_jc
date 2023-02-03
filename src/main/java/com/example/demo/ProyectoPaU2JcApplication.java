package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.manytomany.modelo.Usuario;
import com.example.demo.manytomany.modelo.Vehiculo;
import com.example.demo.manytomany.service.IVehiculoService;


@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	/** N O T A:
	 En este ejercicio, se pidió que solo se haga CRUD de vehículo, de tal manera que solo se podía
	 ingresar un usuario al agregar uno al conjunto de usuarios (set) de cada vehículo. 
	 
	 Cada vehículo y cada usuario debe tener su propio set, pero como en este caso, se reutiliza la 
	 estructura del objeto miVehiculo y miUsuario, habrán solo 2 sets.
	 
	 Entonces:
	 1. Setteo miVehiculo y miUsuario, por primera vez.
	 2. Añado al conjuntoUsuarios de miVehiculo el usuario creado. De esa manera, al guardar el vehículo
	    en el siguiente paso, por cascada se ingresará el usuario a la DB.
	 3. Guardo el vehículo.
	 4. Para hacer una simulación de una renta de carros, debo buscar el vehículo ya almacenado en la DB
	    y guardarlo en una variable, por ejemplo "vehiculoBuscado".
	 5. Re-setteo la variable miUsuario con nuevos datos, y añado al set del vehículo buscado dicho usuario.
	 6. Actualizo vehículoBuscado.
	 7. Realizo procesos similares si deseo agregar más vehículos y usuarios.
	 
	 */
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Vehiculo miVehiculo = new Vehiculo();
		miVehiculo.setMarca("Ford");
		miVehiculo.setColor("Rojo");
		miVehiculo.setPlaca("AAA-123");
		miVehiculo.setPrecio(new BigDecimal(100));
		Set<Usuario> conjuntoUsuarios = new HashSet<Usuario>();
		miVehiculo.setMisClientes(conjuntoUsuarios);
		
		Usuario miUsuario = new Usuario();	
		miUsuario.setNombre("Angela");
		miUsuario.setApellido("Llerena");
		miUsuario.setFechaNacimiento(LocalDateTime.of(1990, 3, 4, 2, 33));
		miUsuario.setCedula("1725352458");
		Set<Vehiculo> conjuntoVehiculos = new HashSet<Vehiculo>();
		miUsuario.setMisVehiculos(conjuntoVehiculos);
		
//		conjuntoUsuarios.add(miUsuario);
		
//		this.iVehiculoService.guardar(miVehiculo);
		
		// Busco al vehiculo:
		Vehiculo vehiculoBuscado = this.iVehiculoService.encontrar(3);
		
		// Hago alguna acción con el vehiculo buscado:
		vehiculoBuscado.getMisClientes().add(miUsuario);
		
		// actualizo:
		this.iVehiculoService.actualizar(vehiculoBuscado);
	
	}
}
