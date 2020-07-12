package com.ucla.controller;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucla.interfaces.GenericServiceApi;
import com.ucla.model.Acta;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ActaController {
	@Autowired
	private GenericServiceApi service;
	
	@GetMapping({"/listar", "/"})
	public List<Acta> listar(Model model) {
		List<Acta>acta=service.listar();
		model.addAttribute("acta", acta);
		return acta;
	}
	
	@GetMapping("/listar/{id}")
	public String listarId(@PathVariable long id,Model model) {
		model.addAttribute("acta", service.listarId(id));
		return "formulario";
	}
	
	@GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("acta", new Acta());
		return "formulario";
	}
	
	@PostMapping("/save")
	public String save(@Valid Acta a,Model model) {
		long id=service.save(a);
		if(id==0) {
			return "formulario";
		}
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
    public String editar (@PathVariable long id, Model model) {
		Optional<Acta>acta=service.listarId(id);
		model.addAttribute("acta",acta);
		return "redirect:/listar";
			
		}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable long id,Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}