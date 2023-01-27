package com.example.demo.uce.onetomany.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.onetomany.modelo.Edificio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EdificioRepositoryImpl implements IEdificioRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Edificio edificio) {
		this.entityManager.persist(edificio);
	}

	@Override
	public void actualizar(Edificio edificio) {
		this.entityManager.merge(edificio);
	}

	@Override
	public Edificio buscar(Integer id) {
		return this.entityManager.find(Edificio.class, id);
	}

	@Override
	public void borrar(Integer id) {
		Edificio e = this.buscar(id);
		this.entityManager.remove(e);
	}

}
