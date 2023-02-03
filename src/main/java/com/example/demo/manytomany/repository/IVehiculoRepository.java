package com.example.demo.manytomany.repository;

import com.example.demo.manytomany.modelo.Vehiculo;

public interface IVehiculoRepository {

	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(Integer id);
	public void borrar(Integer id);
}
