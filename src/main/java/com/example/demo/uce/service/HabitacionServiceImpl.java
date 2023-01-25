package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.repository.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService{

	@Autowired
	private IHabitacionRepo iHabitacionRepo;
	
	@Override
	public void guardar(Habitacion habitacion) {
		this.iHabitacionRepo.insertar(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.iHabitacionRepo.actualizar(habitacion);
	}

	@Override
	public Habitacion encontrar(Integer id) {
		return this.iHabitacionRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iHabitacionRepo.borrar(id);
	}
	

}
