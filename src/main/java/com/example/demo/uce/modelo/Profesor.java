package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profe_seq")
	@SequenceGenerator(name = "profe_seq", sequenceName = "profe_seq", allocationSize = 1) //allocation = asignación
	@Column(name = "prof_id")
	private Integer id;
	
	@Column(name = "prof_nombre")
	private String nombre;
	
	@Column(name = "prof_apellido")
	private String apellido;
	
	@Column(name = "prof_cedula")
	private String cedula;
	
	@Column(name = "prof_materia")
	private String materia;

	
	
	//Getters y Setters
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
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
		public String getMateria() {
			return materia;
		}
		public void setMateria(String materia) {
		this.materia = materia;
	}
}
