package com.example.demo.uce.onetomany.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "edificio")
public class Edificio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "edif_seq")
	@SequenceGenerator(name = "edif_seq", sequenceName = "edif_seq", allocationSize = 1)
	@Column(name = "edif_id")
	private Integer id;
	
	@Column(name = "edif_nombre")
	private String nombre;
	
	@Column(name = "edif_direccion")
	private String direccion;
	
	@Column(name = "edif_fechaInaguracion")
	private LocalDateTime fechaInaguracion;

	
	// OneToMany: 1 Edificio tiene muchos departamentos 
	// Como son muchos departamentos, genero una lista de departamentos.
	@OneToMany(mappedBy = "edificio", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//Lazy = para solo acceder a los edificios
	//eager = para acceder a los departamentos buscando desde la DB de Edificio.
	private List<Departamento> listaDepartamentos;
	
	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", fechaInaguracion="
				+ fechaInaguracion + "]";
	}

	//Get y Set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDateTime getFechaInaguracion() {
		return fechaInaguracion;
	}

	public void setFechaInaguracion(LocalDateTime fechaInaguracion) {
		this.fechaInaguracion = fechaInaguracion;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	
	
	

	
	
}
