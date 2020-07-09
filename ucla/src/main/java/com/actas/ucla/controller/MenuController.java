package com.actas.ucla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.actas.ucla.commons.GenericServiceApi;

@Controller
@RequestMapping("/login1")
public class MenuController {
	@GetMapping("/login1")
	public String login1()
	{
		return "login1";
	}
	
	@GetMapping("/menu")
	public String menu()
	{
		return "menu";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "admin";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "user";
	}

	@Autowired
	private GenericServiceApi service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("acta", service.listar());
		return "index";
	}
}
