package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.repository.IAutorRepository;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IAutorRepository iAutorRepository;
	
	@Override
	public void guardar(Autor autor) {
		this.iAutorRepository.insertar(autor);
	}

}
