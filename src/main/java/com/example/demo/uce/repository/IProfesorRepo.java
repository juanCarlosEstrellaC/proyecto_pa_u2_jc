package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Profesor;

public interface IProfesorRepo {

	public void insertar(Profesor profesor);
	public void actualizar(Profesor profesor);
	public Profesor buscar(Integer id);
	public void eliminar(Integer id);
	
}
