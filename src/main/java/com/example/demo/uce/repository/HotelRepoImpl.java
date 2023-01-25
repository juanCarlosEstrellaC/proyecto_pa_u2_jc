package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel hotel) {
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.entityManager.merge(hotel);
	}

	// reporte de hoteles y habitaciones (se trae cuando yo lo necesito, bajo demanda)
	@Override
	public Hotel buscar(Integer id) {
		Hotel h = entityManager.find(Hotel.class, id);
		h.getHabitaciones().size();
		return this.entityManager.find(Hotel.class, id);
	}

	// reporte solo de hoteles.
	public Hotel buscarligero(Integer id) {
		Hotel h = entityManager.find(Hotel.class, id);
		h.getHabitaciones();
		return this.entityManager.find(Hotel.class, id);
	}
	
	@Override
	public void borrar(Integer id) {
		Hotel hote = this.buscar(id);
		this.entityManager.remove(hote);
	}

}
