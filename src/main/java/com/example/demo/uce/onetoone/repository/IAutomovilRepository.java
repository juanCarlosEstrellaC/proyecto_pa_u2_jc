package com.example.demo.uce.onetoone.repository;

import com.example.demo.uce.onetoone.modelo.Automovil;

public interface IAutomovilRepository {

	public void insertar(Automovil automovil);
	public void actualizar(Automovil automovil);
	public Automovil buscar(Integer id);
	public void borrar(Integer id);
	
}
