package com.example.demo.uce.onetoone.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_seq")
	@SequenceGenerator(name = "matri_seq", sequenceName = "matri_seq", allocationSize = 1)
	@Column(name = "matri_id")
	private Integer id;
	
	@Column(name = "matri_valor")
	private BigDecimal valor;
	
	@Column(name = "matri_fechaMatricula")
	private LocalDateTime fechaMatricula;

	
	
	
	// OneToOne: 1 matricula le pertenece a 1 automovil
	// Toda matricula le pertenece a un automovil. -> matricula = hijo
	// El hijo recibe heredada la columna de id del padre, y en esta tabla se llamará "matri_auto_id".
	
	@OneToOne							// de momento no le coloco Cascada para que solo actualize el padre.
	@JoinColumn(name = "matri_auto_id")
	private Automovil automovilEnMatricula; 	//[variable para la relacion OneToOne]
	
	// Get y Set
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public BigDecimal getValor() {
			return valor;
		}
		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}
		public LocalDateTime getFechaMatricula() {
			return fechaMatricula;
		}
		public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
		public Automovil getAutomovilEnMatricula() {
			return automovilEnMatricula;
		}
		public void setAutomovilEnMatricula(Automovil automovilEnMatricula) {
			this.automovilEnMatricula = automovilEnMatricula;
		}
	
	
}
