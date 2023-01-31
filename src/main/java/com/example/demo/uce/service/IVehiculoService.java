package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void guardar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo encontrar(Integer id);
	public void eliminar(Integer id);

}
