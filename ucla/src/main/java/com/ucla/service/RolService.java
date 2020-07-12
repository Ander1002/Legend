package com.ucla.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucla.InterfaceService.RolDaoApi;
import com.ucla.interfaces.InterfaceRol;
import com.ucla.model.Rol;

@Service
public class RolService implements InterfaceRol{
	
	@Autowired
	private RolDaoApi dao;
	
	@Override
	public List<Rol> listar() {		
		return (List<Rol>)dao.findAll();
	}

	@Override
	public Optional<Rol> listarId(long id) {		
		return dao.findById(id);
	}

	@Override
	public int save(Rol p) {
		int res=0;
		Rol per=dao.save(p);
		if(!per.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(long id) {
		dao.deleteById(id);
		
	}

}
