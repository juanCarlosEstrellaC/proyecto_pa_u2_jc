package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.entityManager.merge(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void borrar(Integer id) {
		Empleado em = this.buscar(id);
		this.entityManager.remove(em);
	}
	


}
