package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Empleado;

public interface IEmpleadoService {

	public void guardar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado encontrar(Integer id);
	public void eliminar(Integer id);
	
}
