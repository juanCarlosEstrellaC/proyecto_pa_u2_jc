package com.example.demo.uce.onetomany.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_seq")
	@SequenceGenerator(name = "dept_seq", sequenceName = "dept_seq", allocationSize = 1)
	@Column(name = "dept_id")
	private Integer id;
	
	@Column(name = "dept_numero")
	private String numero;
	
	@Column(name = "dept_valorComercial")
	private BigDecimal valorComercial;

	
	
	
	
	// ManyToOne: muchos departamentos le pertenecen a un eficio.
	
	@ManyToOne
	@JoinColumn(name = "dept_id_edificio") //nuevo nombre en la Tabla Departamento
	private Edificio edificio;
	
	@Override
	public String toString() {
		return "Departamento [id=" + id + ", numero=" + numero + ", valorComercial=" + valorComercial + "]";
	}

	//Get y set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getValorComercial() {
		return valorComercial;
	}

	public void setValorComercial(BigDecimal valorComercial) {
		this.valorComercial = valorComercial;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	

	
	
}
