package com.ucla.InterfaceService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ucla.model.Acta;

@Repository
public interface ActaDaoApi extends CrudRepository<Acta, Long> {

}
