package com.ucla.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucla.InterfaceService.ActaDaoApi;
import com.ucla.interfaces.GenericServiceApi;
import com.ucla.model.Acta;

@Service
public class ActaServiceImpl implements GenericServiceApi {
	
	@Autowired
	private ActaDaoApi dao;
	
	@Override
	public List<Acta> listar() {		
		return (List<Acta>)dao.findAll();
	}

	@Override
	public Optional<Acta> listarId(long id) {		
		return dao.findById(id);
	}

	@Override
	public int save(Acta p) {
		int res=0;
		Acta per=dao.save(p);
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
