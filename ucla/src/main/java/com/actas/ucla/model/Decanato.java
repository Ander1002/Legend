package com.actas.ucla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "decanato")
public class Decanato {
	public Decanato()
	{
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id")
	private String id;
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "ubicacion")
	private String Ubicacion;
	
	@OneToMany
    @JoinColumn(name="idacta", nullable=false)
    private Acta acta;

	public Decanato(String id, String nombre, String ubicacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		Ubicacion = ubicacion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	
}
