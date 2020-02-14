package com.prueba.valid.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.valid.model.Person;
import com.prueba.valid.service.IPersonService;

@Controller
public class PersonController {
	
	@Autowired
	private IPersonService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("persons", service.list());
		return "persons";
	}
	
	@GetMapping("/add")
	public String newPerson() {
		return "index";
	}
	
	@PostMapping("/new")
	public String addPerson(@Valid Person p) {
		service.createPerson(p);
		return "redirect:/list";
	}
	
	@GetMapping("/process")
	public String processPerson(@RequestParam(value="processPerson", required = false) List<String> persons, Model model) {
		if(persons != null) {			
			for (String id : persons) {
				model.addAttribute("person", service.updatePerson(Integer.parseInt(id)));							
			}
		}
		return "redirect:/list";
	}

}
