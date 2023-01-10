package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Profesor;

public interface IProfesorService {
	//CRUD con nombres empresariales:
	public void ingresar(Profesor profesor);
	public void actualizar(Profesor profesor);
	public Profesor buscar(Integer id);
	public void borrar(Integer id);
}
