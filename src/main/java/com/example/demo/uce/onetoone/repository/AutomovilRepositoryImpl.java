package com.example.demo.uce.onetoone.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.onetoone.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutomovilRepositoryImpl implements IAutomovilRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Automovil automovil) {
		this.entityManager.persist(automovil);
	}

	@Override
	public void actualizar(Automovil automovil) {
		this.entityManager.merge(automovil);
	}

	@Override
	public Automovil buscar(Integer id) {
		return this.entityManager.find(Automovil.class, id);
	}

	@Override
	public void borrar(Integer id) {
		Automovil a = this.buscar(id);
		this.entityManager.remove(a);
	}

}
