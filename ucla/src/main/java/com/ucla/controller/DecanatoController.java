package com.ucla.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
import com.ucla.interfaces.InterfaceDecanato;
import com.ucla.model.Decanato;

@RestController
@RequestMapping("/api2")
@CrossOrigin("*")
public class DecanatoController {
	@Autowired
	private InterfaceDecanato service;
	
	@GetMapping("listar/decanato")
	public String listar(Model model) {
		List<Decanato>decanato=service.listar();
		model.addAttribute("decanato", decanato);
		return "index";
	}
	
	 @PostMapping("save/dec")
	    public ResponseEntity create(@Valid @RequestBody Decanato dec) {
	      return ResponseEntity.ok(service.save(dec));
	    }
	
	@GetMapping("/listar/decanato/{id}")
	public String listarId(@PathVariable long id,Model model) {
		model.addAttribute("decanato", service.listarId(id));
		return "formulario";
	}
	
	@GetMapping("/new/decanato")
	public String nuevo(Model model) {
		model.addAttribute("decanato", new Decanato());
		return "formulario";
	}
	
	@PostMapping("/save/decanato")
	public String save(@Valid Decanato a,Model model) {
		long id=service.save(a);
		if(id==0) {
			return "formulario";
		}
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/decanato/{id}")
    public String editar (@PathVariable long id, Model model) {
		Optional<Decanato>decanato=service.listarId(id);
		model.addAttribute("decanato",decanato);
		return "redirect:/listar";
			
		}
	
	@GetMapping("/delete/decanato/{id}")
	public String eliminar(@PathVariable long id,Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}