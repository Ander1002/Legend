package com.ucla.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
@Table (name = "decanato")
public class Decanato {
	public Decanato()
	{
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id", unique = true, nullable = false)
	private Long id;
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "ubicacion")
	private String ubicacion;

	public List<Acta> getActa() {
		return acta;
	}

	public void setActa(List<Acta> acta) {
		this.acta = acta;
	}
	@JsonIgnore
	@OneToMany(mappedBy="decanato", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Acta> acta = new ArrayList<Acta>();
	
	@JsonManagedReference(value = "decanato-usuario")
	@OneToMany(mappedBy="decanato", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Usuario> usuarios = new ArrayList<Usuario>();

	public Decanato(Long id, String nombre, String ubicacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
