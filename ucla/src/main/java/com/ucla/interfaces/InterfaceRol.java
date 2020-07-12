package com.ucla.interfaces;

import java.util.List;
import java.util.Optional;

import com.ucla.model.Rol;

public interface InterfaceRol {
	
	public List<Rol>listar();

	public Optional<Rol>listarId(long id);

	public int save(Rol a);
	
	public void delete(long id);

}
