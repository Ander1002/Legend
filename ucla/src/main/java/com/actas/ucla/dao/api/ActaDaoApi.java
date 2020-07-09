package com.actas.ucla.dao.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.actas.ucla.model.Acta;

@Repository
public interface ActaDaoApi extends CrudRepository<Acta, Long> {

}
