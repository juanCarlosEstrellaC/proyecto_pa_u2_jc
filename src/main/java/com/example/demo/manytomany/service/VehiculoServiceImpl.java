package com.example.demo.manytomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.manytomany.modelo.Vehiculo;
import com.example.demo.manytomany.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void guardar(Vehiculo vehiculo) {
		this.iVehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.iVehiculoRepository.actualizar(vehiculo);
	}

	@Override
	public Vehiculo encontrar(Integer id) {
		return this.iVehiculoRepository.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iVehiculoRepository.borrar(id);
	}

}
