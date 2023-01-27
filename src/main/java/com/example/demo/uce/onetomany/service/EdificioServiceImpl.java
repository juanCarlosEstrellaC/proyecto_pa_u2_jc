package com.example.demo.uce.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.onetomany.modelo.Edificio;
import com.example.demo.uce.onetomany.repository.IEdificioRepository;


@Service
public class EdificioServiceImpl implements IEdificioService {

	@Autowired
	private IEdificioRepository iEdificioRepository;
		
	@Override
	public void guardar(Edificio edificio) {
		this.iEdificioRepository.insertar(edificio);
	}

	@Override
	public void actualizar(Edificio edificio) {
		this.iEdificioRepository.actualizar(edificio);
	}

	@Override
	public Edificio encontrar(Integer id) {
		return this.iEdificioRepository.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iEdificioRepository.borrar(id);
	}

}
