package com.ucla.interfaces;

import java.util.List;
import java.util.Optional;

import com.ucla.model.Acta;

public interface GenericServiceApi {

	public List<Acta>listar();

	public Optional<Acta>listarId(long id);

	public int save(Acta a);

	public void delete(long id);
}
