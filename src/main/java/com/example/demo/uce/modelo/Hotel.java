package com.example.demo.uce.modelo;

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
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hote_seq")
	@SequenceGenerator(name = "hote_seq", sequenceName = "hote_seq", allocationSize = 1) 
	@Column(name = "hote_id")
	private Integer id;
	
	@Column(name = "hote_nombre")
	private String nombre;
	
	@Column(name = "hote_direccion")
	private String direccion;
	
	//lista de muchos elementos:								//fetch = traer
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, fetch = FetchType.LAZY) //lazy para acceder bajo demanda.
	private List<Habitacion> habitaciones;
	
	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", habitaciones=" + habitaciones
				+ ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getHabitaciones()=" + getHabitaciones() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
		// Get y Set
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
		public List<Habitacion> getHabitaciones() {
			return habitaciones;
		}
		public void setHabitaciones(List<Habitacion> habitaciones) {
			this.habitaciones = habitaciones;
		}
			
}
