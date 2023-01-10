package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.repository.IProfesorRepo;

@Service
public class ProfesorServiceImpl implements IProfesorService{

	@Autowired
	private IProfesorRepo profesorRepo;
	
	@Override
	public void ingresar(Profesor profesor) {
		this.profesorRepo.insertar(profesor);
	}

	@Override
	public void actualizar(Profesor profesor) {
		this.profesorRepo.actualizar(profesor);
	}

	@Override
	public Profesor buscar(Integer id) {
		return this.profesorRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.profesorRepo.eliminar(id);
	}

}
