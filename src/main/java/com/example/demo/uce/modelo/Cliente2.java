package com.example.demo.uce.modelo;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente2")
public class Cliente2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clie_seq")
	@SequenceGenerator(name = "clie_seq", sequenceName = "clie_seq", allocationSize = 1) 
	@Column(name = "clie_id")
	private Integer id;
	
	@Column(name = "clie_cedula")
	private String cedula;
	
	@Column(name = "clie_nombre")
	private String nombre;
	
	@Column(name = "clie_apellido")
	private String apellido;
	
	@Column(name = "clie_fechaNacimiento")
	private LocalDateTime fechaNacimiento;
	
	
	@ManyToMany(mappedBy = "misClientes")
	private Set<Vehiculo> misVehiculos;

	//Get y Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Set<Vehiculo> getMisVehiculos() {
		return misVehiculos;
	}

	public void setMisVehiculos(Set<Vehiculo> misVehiculos) {
		this.misVehiculos = misVehiculos;
	}
	

}
