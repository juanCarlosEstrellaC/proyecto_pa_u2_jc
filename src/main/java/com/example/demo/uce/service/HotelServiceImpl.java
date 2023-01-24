package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.ICiudadanoRepo;
import com.example.demo.uce.repository.IHotelRepo;

@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepo iHotelRepo;
	
	@Override
	public void guardar(Hotel hotel) {
		this.iHotelRepo.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.iHotelRepo.actualizar(hotel);
	}

	@Override
	public Hotel encontrar(Integer id) {
		return this.iHotelRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iHotelRepo.borrar(id);
	}
	

}
