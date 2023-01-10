package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Profesor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProfesorRepoImpl implements IProfesorRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Profesor profesor) {
		this.entityManager.persist(profesor);
	}

	@Override
	public void actualizar(Profesor profesor) {
		this.entityManager.merge(profesor);
	}

	@Override
	public Profesor buscar(Integer id) {
		return this.entityManager.find(Profesor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Profesor profe = this.buscar(id); //poner el this.
		this.entityManager.remove(profe);
	}

}
