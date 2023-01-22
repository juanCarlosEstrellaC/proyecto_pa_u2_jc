package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.EMPLEADO;

public interface IEmpleadoRepo {

	public void insertar(EMPLEADO empleado);
	public void actualizar(EMPLEADO empleado);
	public EMPLEADO buscar(Integer id);
	public void borrar(Integer id);
}
