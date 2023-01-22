package com.example.demo.uce.service;

import com.example.demo.uce.modelo.EMPLEADO;

public interface IEMPLEADOService {

	public void guardar(EMPLEADO empleado);
	public void actualizar(EMPLEADO empleado);
	public EMPLEADO encontrar(Integer id);
	public void eliminar(Integer id);
	
}
