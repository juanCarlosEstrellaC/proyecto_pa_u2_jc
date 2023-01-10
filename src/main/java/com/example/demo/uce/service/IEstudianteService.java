package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {

	public void agregar(Estudiante estudiante);
	public void modificar(Estudiante estudiante);
	// busco y elimino por pK
	public Estudiante buscar(Integer id);
	public void borrar(Integer id);
	
}
