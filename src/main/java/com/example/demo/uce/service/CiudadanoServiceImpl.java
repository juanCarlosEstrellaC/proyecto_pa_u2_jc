package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.repository.ICiudadanoRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepo iCiudadanoRepo;
	
	@Override
	public void guardar(Ciudadano ciudadano) {
		this.iCiudadanoRepo.insertar(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.iCiudadanoRepo.actualizar(ciudadano);
	}

	@Override
	public Ciudadano encontrar(Integer id) {
		return this.iCiudadanoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iCiudadanoRepo.borrar(id);
	}
	

}
