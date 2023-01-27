package com.example.demo.uce.onetomany.repository;

import com.example.demo.uce.onetomany.modelo.Edificio;

public interface IEdificioRepository {

	public void insertar(Edificio edificio);
	public void actualizar(Edificio edificio);
	public Edificio buscar(Integer id);
	public void borrar(Integer id);
	
}
