package com.example.demo.uce.onetoone.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
public class Automovil {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_seq")
	@SequenceGenerator(name = "auto_seq", sequenceName = "auto_seq", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;
	
	@Column(name = "auto_marca")
	private String marca;
	
	@Column(name = "auto_modelo")
	private String modelo;
	
	@Column(name = "auto_precio")
	private BigDecimal precio;

	// OneToOne: 1 automovil tiene 1 matricula.
	// NO todo automovil tienen una matricula -> automovil = padre
	// El padre hereda su columna id
	
	@OneToOne(mappedBy = "automovilEnMatricula", cascade = CascadeType.ALL)
	private Matricula matriculaEnAutomovil;			//[variable para la relacion OneToOne]

	
	// toString
	@Override
	public String toString() {
		return "Automovil [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", matriculaEnAutomovil=" + matriculaEnAutomovil + "]";
	}

	// Get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Matricula getMatriculaEnAutomovil() {
		return matriculaEnAutomovil;
	}

	public void setMatriculaEnAutomovil(Matricula matriculaEnAutomovil) {
		this.matriculaEnAutomovil = matriculaEnAutomovil;
	}



	
}
