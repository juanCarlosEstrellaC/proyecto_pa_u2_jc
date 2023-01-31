package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
//Vehiculo es la clase Principal para la Tabla de Rompimiento
public class Vehiculo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_seq")
	@SequenceGenerator(name = "vehi_seq", sequenceName = "vehi_seq", allocationSize = 1) 
	@Column(name = "vehi_id")
	private Integer id;
	
	@Column(name = "vehi_placa")
	private String placa;

	@Column(name = "vehi_marca")
	private String marca;
	
	@Column(name = "vehi_color")
	private String color;
	
	@Column(name = "vehi_precio")
	private BigDecimal precio;
	
	// Muchos a muchos: Un vehículo es rentado por muchos clientes y 1 cliente renta muchos vehículos.
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "vehiculo_cliente",
			joinColumns = @JoinColumn(name = "clievehi_id_vehiculo"),
			inverseJoinColumns = @JoinColumn(name = "clievehi_id_cliente")
			)
	private Set<Cliente2> misClientes;
	
	//Get y Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	
	public Set<Cliente2> getMisClientes() {
		return misClientes;
	}

	public void setMisClientes(Set<Cliente2> misClientes) {
		this.misClientes = misClientes;
	}


	
	
}
