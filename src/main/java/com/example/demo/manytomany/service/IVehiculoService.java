package com.example.demo.manytomany.service;

import com.example.demo.manytomany.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void guardar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo encontrar(Integer id);
	public void eliminar(Integer id);

}
