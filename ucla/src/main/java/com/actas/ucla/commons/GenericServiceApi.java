package com.actas.ucla.commons;

import com.actas.ucla.model.Acta;
import java.util.List;
import java.util.Optional;

public interface GenericServiceApi {

	public List<Acta>listar();

	public Optional<Acta>listarId(long id);

	public int save(Acta a);

	public void delete(long id);
}
