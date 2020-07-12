package com.ucla.InterfaceService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ucla.model.Decanato;

@Repository
public interface DecanatoDaoApi extends CrudRepository<Decanato, Long> {

}
