package com.ucla.InterfaceService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ucla.model.Rol;

@Repository
public interface RolDaoApi extends CrudRepository<Rol, Long>  {

}
