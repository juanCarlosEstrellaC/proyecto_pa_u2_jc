package com.example.demo.uce.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor_seq")
	@SequenceGenerator(name = "autor_seq", sequenceName = "autor_seq", allocationSize = 1) 
	@Column(name = "autor_id")
	private Integer id;
	
	@Column(name = "autor_nombre")
	private String nombre;

	@ManyToMany(mappedBy = "autores", cascade = CascadeType.ALL) //nombre del set de la otra tabla
	private Set<Libro> libros;
	
	//Set y Get
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

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}	

	
	
}
