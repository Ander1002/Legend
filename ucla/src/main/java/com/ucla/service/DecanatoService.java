package com.ucla.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucla.InterfaceService.DecanatoDaoApi;
import com.ucla.interfaces.InterfaceDecanato;
import com.ucla.model.Decanato;

@Service
public class DecanatoService implements InterfaceDecanato {

	@Autowired
	private DecanatoDaoApi dao;
	
	@Override
	public List<Decanato> listar() {		
		return (List<Decanato>)dao.findAll();
	}

	@Override
	public Optional<Decanato> listarId(long id) {		
		return dao.findById(id);
	}

	@Override
	public int save(Decanato p) {
		int res=0;
		Decanato per=dao.save(p);
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
