package com.veterinaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String tipo;
	@Column
	private String nombre_animal;
	@Column
	private Integer edad;
	@Column 
	private String nombre_dueno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre_animal() {
		return nombre_animal;
	}
	public void setNombre_animal(String nombre_animal) {
		this.nombre_animal = nombre_animal;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre_dueno() {
		return nombre_dueno;
	}
	public void setNombre_dueno(String nombre_dueño) {
		this.nombre_dueno = nombre_dueño;
	}
	
}
