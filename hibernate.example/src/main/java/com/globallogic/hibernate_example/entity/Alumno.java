package com.globallogic.hibernate_example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno {
	
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nombre2")
	private String apellido;
	
	public Alumno() {}

	public Alumno(long id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	
	@Override
	public String toString() {
		return super.toString();
	}

}
