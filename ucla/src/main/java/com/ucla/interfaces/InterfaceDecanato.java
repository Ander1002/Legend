package com.ucla.interfaces;

import java.util.List;
import java.util.Optional;

import com.ucla.model.Decanato;

public interface InterfaceDecanato {
	
	public List<Decanato>listar();

	public Optional<Decanato>listarId(long id);

	public int save(Decanato a);
	
	public void delete(long id);

}
