package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2JcApplication implements CommandLineRunner{
	
	@Autowired
	private IHotelService iHotelService;
		
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Hotel miHotel = new Hotel();
		miHotel.setNombre("B");
		miHotel.setDireccion("jfk");
		
			List<Habitacion> miListaHabitaciones = new ArrayList<Habitacion>();
			
			Habitacion habitacion1 = new Habitacion();
			habitacion1.setNumero("1");
			habitacion1.setHotel(miHotel);
			miListaHabitaciones.add(habitacion1);

			Habitacion habitacion2 = new Habitacion();
			habitacion2.setNumero("2");
			habitacion2.setHotel(miHotel);
			miListaHabitaciones.add(habitacion2);

			Habitacion habitacion3 = new Habitacion();
			habitacion3.setNumero("3");
			habitacion3.setHotel(miHotel);
			miListaHabitaciones.add(habitacion3);
			
			Habitacion habitacion4 = new Habitacion();
			habitacion4.setNumero("4");
			habitacion4.setHotel(miHotel);
			miListaHabitaciones.add(habitacion4);

			Habitacion habitacion5 = new Habitacion();
			habitacion5.setNumero("5");
			habitacion5.setHotel(miHotel);
			miListaHabitaciones.add(habitacion5);

			Habitacion habitacion6 = new Habitacion();
			habitacion6.setNumero("6");
			habitacion6.setHotel(miHotel);
			miListaHabitaciones.add(habitacion6);
			
		miHotel.setHabitaciones(miListaHabitaciones);
		
		
		// Guardar hotel y habitacion
		this.iHotelService.guardar(miHotel);
		
		// Busqueda
		Hotel hotelbus = this.iHotelService.encontrar(6);
			
		// Actualizo
		hotelbus.setNombre("HotelBus");
		this.iHotelService.actualizar(hotelbus);
		
		// Borrar
		this.iHotelService.eliminar(6);
	
	}
	
}

