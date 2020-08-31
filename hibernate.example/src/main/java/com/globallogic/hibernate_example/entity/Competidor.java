package com.globallogic.hibernate_example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="competidor")
public class Competidor {
	
	@Id
	@Column(name="COMPETIDOR_NUMERO")
	private long numero;
	
	@Column(name="COMPETIDOR_NOMBRE")
	private String nombre;
	
	public Competidor() {}

	public Competidor(long numero, String nombre) {
		super();
		this.numero = numero;
		this.nombre = nombre;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
