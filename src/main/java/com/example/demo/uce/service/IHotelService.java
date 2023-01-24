package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelService {

	public void guardar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel encontrar(Integer id);
	public void eliminar(Integer id);
	
}
