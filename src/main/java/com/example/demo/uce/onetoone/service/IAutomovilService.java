package com.example.demo.uce.onetoone.service;

import com.example.demo.uce.onetoone.modelo.Automovil;

public interface IAutomovilService {

	public void guardar(Automovil automovil);
	public void actualizar(Automovil automovil);
	public Automovil encontrar(Integer id);
	public void eliminar(Integer id);
	
}
