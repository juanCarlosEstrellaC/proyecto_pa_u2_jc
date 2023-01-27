package com.example.demo.uce.onetomany.service;

import com.example.demo.uce.onetomany.modelo.Edificio;

public interface IEdificioService {

	public void guardar(Edificio edificio);
	public void actualizar(Edificio edificio);
	public Edificio encontrar(Integer id);
	public void eliminar(Integer id);
	
}
