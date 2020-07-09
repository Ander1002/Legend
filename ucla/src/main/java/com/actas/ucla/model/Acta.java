package com.actas.ucla.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table (name = "acta")
public class Acta {
	
	public Acta() {
		
	}

	public Acta(Long id, String tipoSesion, String descripcion, String fecha, Decanato decanato) {
		super();
		this.id = id;
		this.tipoSesion = tipoSesion;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.decanato = decanato;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id")
	private Long id;
	
	@Column (name = "tipoSesion")
	private String tipoSesion;
	
	@Column (name = "descripcion")
	private String descripcion;
	
	@Column (name = "fecha")
	private String fecha;
	
	@ManyToOne
    @JoinColumn(name="iddecanato", nullable=false)
    private Decanato decanato;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoSesion() {
		return tipoSesion;
	}
	public void setTipoSesion(String tipoSesion) {
		this.tipoSesion = tipoSesion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Decanato getDecanato() {
		return decanato;
	}

	public void setDecanato(Decanato decanato) {
		this.decanato = decanato;
	}
	
}