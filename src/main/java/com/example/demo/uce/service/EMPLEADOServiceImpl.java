package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.EMPLEADO;
import com.example.demo.uce.repository.IEmpleadoRepo;

@Service
public class EMPLEADOServiceImpl implements IEMPLEADOService{

	@Autowired
	private IEmpleadoRepo iEmpleadoRepo;

	@Override
	public void guardar(EMPLEADO empleado) {
		this.iEmpleadoRepo.insertar(empleado);
	}

	@Override
	public void actualizar(EMPLEADO empleado) {
		this.iEmpleadoRepo.actualizar(empleado);
	}

	@Override
	public EMPLEADO encontrar(Integer id) {
		return this.iEmpleadoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iEmpleadoRepo.borrar(id);
	}
	
	
	

}
