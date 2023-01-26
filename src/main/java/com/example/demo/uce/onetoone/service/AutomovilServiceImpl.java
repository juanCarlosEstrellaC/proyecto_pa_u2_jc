package com.example.demo.uce.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.onetoone.modelo.Automovil;
import com.example.demo.uce.onetoone.repository.IAutomovilRepository;

@Service
public class AutomovilServiceImpl implements IAutomovilService {

	@Autowired
	private IAutomovilRepository iAutomovilRepository;
	
	@Override
	public void guardar(Automovil automovil) {
		this.iAutomovilRepository.insertar(automovil);
	}

	@Override
	public void actualizar(Automovil automovil) {
		this.iAutomovilRepository.actualizar(automovil);
	}

	@Override
	public Automovil encontrar(Integer id) {
		return this.iAutomovilRepository.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iAutomovilRepository.borrar(id);
	}

}
