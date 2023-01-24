package com.example.demo.uce.modelo;

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
@Table(name = "ciudadano")
public class Ciudadano {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_seq")
	@SequenceGenerator(name = "ciud_seq", sequenceName = "ciud_seq", allocationSize = 1) 
	@Column(name = "ciud_id")
	private Integer id;
	
	@Column(name = "ciud_nombre")
	private String nombre;
	
	@Column(name = "ciud_apellido")
	private String apellido;

	// La clase se llama "principal" o "padre [c]" respecto a la relación de 1 a 1, ya que esta tendrá la columna que "heredará" 
	// a la otra tabla de la relación.
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)  // MISMO nombre de la variable tipo Ciudadano en la clase Empleado, ie, "ciudadano".
	private Empleado empleado;
		
	
	// toString
	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", empleado=" + empleado + "]";
	}
	
		//GET Y SET
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
		public Empleado getEmpleado() {
			return empleado;
		}
		public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
}
