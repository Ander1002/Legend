package com.ucla.model;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table (name = "acta")
public class Acta {
	
	public Acta() {
		
	}

	public Acta(Long id, String tipoServicio, String descripcion, Date fecha, Decanato decanato) {
		super();
		this.id = id;
		this.tipoServicio = tipoServicio;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.decanato = decanato;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id", unique = true, nullable = false)
	private Long id;

	@Column (name = "tipoServicio")
	private String tipoServicio;
	
	@Column (name = "descripcion")
	private String descripcion;
	
	 @CreationTimestamp
	 @Column(updatable = false)
	 private Date fecha;
	
	 @ManyToOne
    @JoinColumn(name="iddecanato", nullable=false)
    private Decanato decanato;
	
	public Long getId() {
		return id;
	}
	public Decanato getDecanato() {
		return decanato;
	}

	public void setDecanato(Decanato decanato) {
		this.decanato = decanato;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	
}