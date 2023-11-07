package com.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.models.Clientes;
import com.proyecto.repositories.IClientes;

@Service
public class ClientesServiceImpl implements ClientesService{

	@Autowired
	private IClientes clienteRepo;
	
	@Override
	public List<Clientes> getAllClientes(){
		return this.clienteRepo.findAll();
	}
	
	
}
