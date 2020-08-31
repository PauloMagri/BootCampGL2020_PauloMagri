package com.globallogic.hibernate_example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="carrera")
public class Carrera {
	
	@Id
	@Column(name="CARRERA_ID")
	private long id;
	
	@Column(name="CARRERA_FECHA")
	private Date fecha;
	
	@Column(name="CARRERA_NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="COMPETIDOR_NUMERO")
	private List<Competidor> competidores;
	
	public Carrera() {}

	public Carrera(long id, Date fecha, String nombre, List<Competidor> competidores) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.nombre = nombre;
		this.competidores = competidores;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Competidor> getCompetidores() {
		return competidores;
	}

	public void setCompetidores(List<Competidor> competidores) {
		this.competidores = competidores;
	}
	
	

}
