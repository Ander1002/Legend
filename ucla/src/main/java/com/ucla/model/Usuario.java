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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table (name = "usuario")
public class Usuario {
	
	@JsonProperty
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "usuario_id")
	private Long id;
	
	@JsonProperty
	@Column (name = "cedula")
	private String cedula;
	
	@JsonProperty
	@Column (name = "contrasenna")
	private String contrasenna;
	
	@JsonProperty
	@Column (name = "nombres")
	private String nombres;

	@JsonProperty
	@Column (name = "apellidos")
	private String apellidos;
	
	@JsonProperty
	@Column(name = "estado")
	private boolean estado;
	
	@JsonBackReference(value = "decanato_usuario")
	@ManyToOne
    @JoinColumn(name="iddecanato", nullable=false)
    private Decanato decanato;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="roles_usuarios",
	joinColumns=@JoinColumn(name="usuario_id"),
	inverseJoinColumns=@JoinColumn(name="rol_id"))
    private List<Rol> roles = new ArrayList<>();
	
	public void agregarRol(Rol rol) {
		this.roles.add(rol);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Decanato getDecanato() {
		return decanato;
	}

	public void setDecanato(Decanato decanato) {
		this.decanato = decanato;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	
}
