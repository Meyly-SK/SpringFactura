package com.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.models.Clientes;
import com.proyecto.services.ClientesServiceImpl;

@Controller
@RequestMapping("/home")
public class ClientesController {
	
	@Autowired
	private ClientesServiceImpl clienteService;
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		return "index";
	}
	
	@ModelAttribute("clientes")
	public List<Clientes> obtenerClientes(){
		List<Clientes> clientes = clienteService.getAllClientes();
		return clientes;
	}
}



























